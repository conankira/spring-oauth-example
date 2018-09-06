package com.thumbor.example.aouth.server.db.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class ClientGrantType implements Serializable {
    /**
     *
     *
     * @mbg.generated Thu Sep 06 15:04:36 CST 2018
     */
    private Integer id;

    /**
     *
     *
     * @mbg.generated Thu Sep 06 15:04:36 CST 2018
     */
    private String client_id;

    /**
     *
     *
     * @mbg.generated Thu Sep 06 15:04:36 CST 2018
     */
    private String grant_type;

    /**
     *
     * @mbg.generated Thu Sep 06 15:04:36 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tbl_client_grant_type.id
     *
     * @return the value of tbl_client_grant_type.id
     *
     * @mbg.generated Thu Sep 06 15:04:36 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 15:04:36 CST 2018
     */
    public ClientGrantType withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column tbl_client_grant_type.id
     *
     * @param id the value for tbl_client_grant_type.id
     *
     * @mbg.generated Thu Sep 06 15:04:36 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column tbl_client_grant_type.client_id
     *
     * @return the value of tbl_client_grant_type.client_id
     *
     * @mbg.generated Thu Sep 06 15:04:36 CST 2018
     */
    public String getClient_id() {
        return client_id;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 15:04:36 CST 2018
     */
    public ClientGrantType withClient_id(String client_id) {
        this.setClient_id(client_id);
        return this;
    }

    /**
     * This method sets the value of the database column tbl_client_grant_type.client_id
     *
     * @param client_id the value for tbl_client_grant_type.client_id
     *
     * @mbg.generated Thu Sep 06 15:04:36 CST 2018
     */
    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    /**
     * This method returns the value of the database column tbl_client_grant_type.grant_type
     *
     * @return the value of tbl_client_grant_type.grant_type
     *
     * @mbg.generated Thu Sep 06 15:04:36 CST 2018
     */
    public String getGrant_type() {
        return grant_type;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 15:04:36 CST 2018
     */
    public ClientGrantType withGrant_type(String grant_type) {
        this.setGrant_type(grant_type);
        return this;
    }

    /**
     * This method sets the value of the database column tbl_client_grant_type.grant_type
     *
     * @param grant_type the value for tbl_client_grant_type.grant_type
     *
     * @mbg.generated Thu Sep 06 15:04:36 CST 2018
     */
    public void setGrant_type(String grant_type) {
        this.grant_type = grant_type;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 15:04:36 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", client_id=").append(client_id);
        sb.append(", grant_type=").append(grant_type);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Thu Sep 06 15:04:36 CST 2018
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
        ClientGrantType other = (ClientGrantType) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getClient_id() == null ? other.getClient_id() == null : this.getClient_id().equals(other.getClient_id()))
            && (this.getGrant_type() == null ? other.getGrant_type() == null : this.getGrant_type().equals(other.getGrant_type()));
    }

    /**
     *
     * @mbg.generated Thu Sep 06 15:04:36 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getClient_id() == null) ? 0 : getClient_id().hashCode());
        result = prime * result + ((getGrant_type() == null) ? 0 : getGrant_type().hashCode());
        return result;
    }
}