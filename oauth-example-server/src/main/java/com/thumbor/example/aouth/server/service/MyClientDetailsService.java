package com.thumbor.example.aouth.server.service;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.thumbor.example.aouth.server.db.dao.*;
import com.thumbor.example.aouth.server.db.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.NoSuchClientException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * Created by xushubing on 2018/9/5.
 */
@Service("myClientDetailsService")
public class MyClientDetailsService implements ClientDetailsService {

    @Autowired
    private ClientMapper clientMapper;

    @Autowired
    private ClientAuthorityMapper clientAuthorityMapper;

    @Autowired
    private ClientScopeMapper clientScopeMapper;

    @Autowired
    private ClientResourceMapper clientResourceMapper;

    @Autowired
    private ClientRedirectMapper clientRedirectMapper;

    @Autowired
    private ClientGrantTypeMapper clientGrantTypeMapper;

    /**
     * Load a client by the client id. This method must not return null.
     *
     * @param clientId The client id.
     * @return The client details (never null).
     * @throws ClientRegistrationException If the client account is locked, expired, disabled, or invalid for any other reason.
     */
    @Override
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
        Client client = clientMapper.selectByClient(clientId);
        if (client == null) {
            throw new NoSuchClientException(clientId + "不存在");
        }
        BaseClientDetails baseClientDetails = new BaseClientDetails();
        baseClientDetails.setClientId(client.getClient_id());
        baseClientDetails.setClientSecret(client.getClient_secret());

        //authority
        List<ClientAuthority> clientAuthorities = clientAuthorityMapper.selectByClientId(clientId);
        if (clientAuthorities.isEmpty()) {
            throw new ClientRegistrationException(clientId + "不存在");
        }

        List<GrantedAuthority> grantedAuthorities = Lists.newArrayList();
        for (ClientAuthority clientAuthority : clientAuthorities) {
            SimpleGrantedAuthority grantedAuthority = new SimpleGrantedAuthority(clientAuthority.getAuthority());
            grantedAuthorities.add(grantedAuthority);
        }
        baseClientDetails.setAuthorities(grantedAuthorities);

        //scope

        List<ClientScope> clientScopes = clientScopeMapper.selectByClientId(clientId);
        if (clientScopes.isEmpty()) {
            throw new ClientRegistrationException(clientId + "不存在");
        }

        List<String> scopes = Lists.newArrayList();
        for (ClientScope clientScope : clientScopes) {
            scopes.add(clientScope.getScope());
        }

        baseClientDetails.setScope(scopes);
        //resource
        List<ClientResource> clientResources = clientResourceMapper.selectByClientId(clientId);
        if (clientScopes.isEmpty()) {
            throw new ClientRegistrationException(clientId + "不存在");
        }
        List<String> resources = Lists.newArrayList();
        for (ClientResource clientResource : clientResources) {
            resources.add(clientResource.getResource_id());
        }
        baseClientDetails.setResourceIds(resources);
        //redirect
        List<ClientRedirect> redirects = clientRedirectMapper.selectByClientId(clientId);
        if (redirects != null) {
            Set<String> redirectUris = Sets.newHashSet();
            for (ClientRedirect redirect : redirects) {
                redirectUris.add(redirect.getRedirect_uri());
            }
            baseClientDetails.setRegisteredRedirectUri(redirectUris);
        }
        //grant type
        List<ClientGrantType> grantTypes = clientGrantTypeMapper.selectByClientId(clientId);
        if (grantTypes.isEmpty()) {
            throw new ClientRegistrationException(clientId + "不存在");
        }
        List<String> types = Lists.newArrayList();
        for (ClientGrantType grantType : grantTypes) {
            types.add(grantType.getGrant_type());
        }
        baseClientDetails.setAuthorizedGrantTypes(types);

        baseClientDetails.setAutoApproveScopes(Sets.newHashSet("true"));


        return baseClientDetails;
    }
}
