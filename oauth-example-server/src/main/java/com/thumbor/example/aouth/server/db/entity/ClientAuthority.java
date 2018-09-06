package com.thumbor.example.aouth.server.db.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class ClientAuthority implements Serializable {
    /**
     *
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    private Integer id;

    /**
     *
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    private String client_id;

    /**
     *
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    private String authority;

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tbl_client_authority.id
     *
     * @return the value of tbl_client_authority.id
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    public ClientAuthority withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column tbl_client_authority.id
     *
     * @param id the value for tbl_client_authority.id
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column tbl_client_authority.client_id
     *
     * @return the value of tbl_client_authority.client_id
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    public String getClient_id() {
        return client_id;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    public ClientAuthority withClient_id(String client_id) {
        this.setClient_id(client_id);
        return this;
    }

    /**
     * This method sets the value of the database column tbl_client_authority.client_id
     *
     * @param client_id the value for tbl_client_authority.client_id
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    /**
     * This method returns the value of the database column tbl_client_authority.authority
     *
     * @return the value of tbl_client_authority.authority
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    public String getAuthority() {
        return authority;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    public ClientAuthority withAuthority(String authority) {
        this.setAuthority(authority);
        return this;
    }

    /**
     * This method sets the value of the database column tbl_client_authority.authority
     *
     * @param authority the value for tbl_client_authority.authority
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    public void setAuthority(String authority) {
        this.authority = authority;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", client_id=").append(client_id);
        sb.append(", authority=").append(authority);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
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
        ClientAuthority other = (ClientAuthority) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getClient_id() == null ? other.getClient_id() == null : this.getClient_id().equals(other.getClient_id()))
            && (this.getAuthority() == null ? other.getAuthority() == null : this.getAuthority().equals(other.getAuthority()));
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:37 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getClient_id() == null) ? 0 : getClient_id().hashCode());
        result = prime * result + ((getAuthority() == null) ? 0 : getAuthority().hashCode());
        return result;
    }
}