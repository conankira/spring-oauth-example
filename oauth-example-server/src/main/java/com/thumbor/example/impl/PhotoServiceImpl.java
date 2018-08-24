package com.thumbor.example.impl;

import com.google.common.collect.Lists;
import com.thumbor.example.PhotoInfo;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Basic implementation for the photo service.
 *
 * @author Ryan Heaton
 */
@Service
public class PhotoServiceImpl implements PhotoService {

    private static List<PhotoInfo> photos = Lists.newArrayList(
            createPhoto("1", "marissa"),
            createPhoto("2", "paul"),
            createPhoto("3", "marissa"),
            (createPhoto("4", "paul")),
            (createPhoto("5", "marissa")),
            (createPhoto("6", "paul"))
    );


    private static PhotoInfo createPhoto(String id, String userId) {
        PhotoInfo photo = new PhotoInfo();
        photo.setId(id);
        photo.setName("photo" + id + ".jpg");
        photo.setUserId(userId);
        photo.setResourceURL("/org/springframework/security/oauth/examples/sparklr/impl/resources/" + photo.getName());
        return photo;
    }

    public Collection<PhotoInfo> getPhotosForCurrentUser(String username) {

        ArrayList<PhotoInfo> infos = new ArrayList<PhotoInfo>();
        for (PhotoInfo info : getPhotos()) {
            if (username.equals(info.getUserId())) {
                infos.add(info);
            }
        }
        return infos;

    }

    public InputStream loadPhoto(String id) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication.getPrincipal() instanceof UserDetails) {
            UserDetails details = (UserDetails) authentication.getPrincipal();
            String username = details.getUsername();
            for (PhotoInfo photoInfo : getPhotos()) {
                if (id.equals(photoInfo.getId()) && username.equals(photoInfo.getUserId())) {
                    URL resourceURL = getClass().getResource(photoInfo.getResourceURL());
                    if (resourceURL != null) {
                        try {
                            return resourceURL.openStream();
                        } catch (IOException e) {
                            // fall through...
                        }
                    }
                }
            }
        }
        return null;
    }

    public List<PhotoInfo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<PhotoInfo> photos) {
        this.photos = photos;
    }
}
