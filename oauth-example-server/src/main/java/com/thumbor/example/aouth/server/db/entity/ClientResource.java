package com.thumbor.example.aouth.server.db.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class ClientResource implements Serializable {
    /**
     *
     *
     * @mbg.generated Thu Sep 06 14:24:41 CST 2018
     */
    private Integer id;

    /**
     *
     *
     * @mbg.generated Thu Sep 06 14:24:41 CST 2018
     */
    private String client_id;

    /**
     *
     *
     * @mbg.generated Thu Sep 06 14:24:41 CST 2018
     */
    private String resource_id;

    /**
     *
     * @mbg.generated Thu Sep 06 14:24:41 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tbl_client_resource.id
     *
     * @return the value of tbl_client_resource.id
     *
     * @mbg.generated Thu Sep 06 14:24:41 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 14:24:41 CST 2018
     */
    public ClientResource withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column tbl_client_resource.id
     *
     * @param id the value for tbl_client_resource.id
     *
     * @mbg.generated Thu Sep 06 14:24:41 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column tbl_client_resource.client_id
     *
     * @return the value of tbl_client_resource.client_id
     *
     * @mbg.generated Thu Sep 06 14:24:41 CST 2018
     */
    public String getClient_id() {
        return client_id;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 14:24:41 CST 2018
     */
    public ClientResource withClient_id(String client_id) {
        this.setClient_id(client_id);
        return this;
    }

    /**
     * This method sets the value of the database column tbl_client_resource.client_id
     *
     * @param client_id the value for tbl_client_resource.client_id
     *
     * @mbg.generated Thu Sep 06 14:24:41 CST 2018
     */
    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    /**
     * This method returns the value of the database column tbl_client_resource.resource_id
     *
     * @return the value of tbl_client_resource.resource_id
     *
     * @mbg.generated Thu Sep 06 14:24:41 CST 2018
     */
    public String getResource_id() {
        return resource_id;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 14:24:41 CST 2018
     */
    public ClientResource withResource_id(String resource_id) {
        this.setResource_id(resource_id);
        return this;
    }

    /**
     * This method sets the value of the database column tbl_client_resource.resource_id
     *
     * @param resource_id the value for tbl_client_resource.resource_id
     *
     * @mbg.generated Thu Sep 06 14:24:41 CST 2018
     */
    public void setResource_id(String resource_id) {
        this.resource_id = resource_id;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 14:24:41 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", client_id=").append(client_id);
        sb.append(", resource_id=").append(resource_id);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Thu Sep 06 14:24:41 CST 2018
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
        ClientResource other = (ClientResource) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getClient_id() == null ? other.getClient_id() == null : this.getClient_id().equals(other.getClient_id()))
            && (this.getResource_id() == null ? other.getResource_id() == null : this.getResource_id().equals(other.getResource_id()));
    }

    /**
     *
     * @mbg.generated Thu Sep 06 14:24:41 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getClient_id() == null) ? 0 : getClient_id().hashCode());
        result = prime * result + ((getResource_id() == null) ? 0 : getResource_id().hashCode());
        return result;
    }
}