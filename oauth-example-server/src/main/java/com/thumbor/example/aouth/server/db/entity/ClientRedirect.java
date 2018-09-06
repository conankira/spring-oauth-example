package com.thumbor.example.aouth.server.db.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class ClientRedirect implements Serializable {
    /**
     *
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    private Integer id;

    /**
     *
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    private String client_id;

    /**
     *
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    private String redirect_uri;

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tbl_client_redirect.id
     *
     * @return the value of tbl_client_redirect.id
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    public ClientRedirect withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column tbl_client_redirect.id
     *
     * @param id the value for tbl_client_redirect.id
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column tbl_client_redirect.client_id
     *
     * @return the value of tbl_client_redirect.client_id
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    public String getClient_id() {
        return client_id;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    public ClientRedirect withClient_id(String client_id) {
        this.setClient_id(client_id);
        return this;
    }

    /**
     * This method sets the value of the database column tbl_client_redirect.client_id
     *
     * @param client_id the value for tbl_client_redirect.client_id
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    /**
     * This method returns the value of the database column tbl_client_redirect.redirect_uri
     *
     * @return the value of tbl_client_redirect.redirect_uri
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    public String getRedirect_uri() {
        return redirect_uri;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    public ClientRedirect withRedirect_uri(String redirect_uri) {
        this.setRedirect_uri(redirect_uri);
        return this;
    }

    /**
     * This method sets the value of the database column tbl_client_redirect.redirect_uri
     *
     * @param redirect_uri the value for tbl_client_redirect.redirect_uri
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    public void setRedirect_uri(String redirect_uri) {
        this.redirect_uri = redirect_uri;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", client_id=").append(client_id);
        sb.append(", redirect_uri=").append(redirect_uri);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ClientRedirect other = (ClientRedirect) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getClient_id() == null ? other.getClient_id() == null : this.getClient_id().equals(other.getClient_id()))
            && (this.getRedirect_uri() == null ? other.getRedirect_uri() == null : this.getRedirect_uri().equals(other.getRedirect_uri()));
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:53 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getClient_id() == null) ? 0 : getClient_id().hashCode());
        result = prime * result + ((getRedirect_uri() == null) ? 0 : getRedirect_uri().hashCode());
        return result;
    }
}