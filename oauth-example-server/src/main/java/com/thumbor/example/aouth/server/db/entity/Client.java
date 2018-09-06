package com.thumbor.example.aouth.server.db.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class Client implements Serializable {
    /**
     *
     *
     * @mbg.generated Thu Sep 06 11:43:18 CST 2018
     */
    private Integer id;

    /**
     *
     *
     * @mbg.generated Thu Sep 06 11:43:18 CST 2018
     */
    private String client_id;

    /**
     *
     *
     * @mbg.generated Thu Sep 06 11:43:18 CST 2018
     */
    private String client_secret;

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:18 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tbl_client.id
     *
     * @return the value of tbl_client.id
     *
     * @mbg.generated Thu Sep 06 11:43:18 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:18 CST 2018
     */
    public Client withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column tbl_client.id
     *
     * @param id the value for tbl_client.id
     *
     * @mbg.generated Thu Sep 06 11:43:18 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column tbl_client.client_id
     *
     * @return the value of tbl_client.client_id
     *
     * @mbg.generated Thu Sep 06 11:43:18 CST 2018
     */
    public String getClient_id() {
        return client_id;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:18 CST 2018
     */
    public Client withClient_id(String client_id) {
        this.setClient_id(client_id);
        return this;
    }

    /**
     * This method sets the value of the database column tbl_client.client_id
     *
     * @param client_id the value for tbl_client.client_id
     *
     * @mbg.generated Thu Sep 06 11:43:18 CST 2018
     */
    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    /**
     * This method returns the value of the database column tbl_client.client_secret
     *
     * @return the value of tbl_client.client_secret
     *
     * @mbg.generated Thu Sep 06 11:43:18 CST 2018
     */
    public String getClient_secret() {
        return client_secret;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:18 CST 2018
     */
    public Client withClient_secret(String client_secret) {
        this.setClient_secret(client_secret);
        return this;
    }

    /**
     * This method sets the value of the database column tbl_client.client_secret
     *
     * @param client_secret the value for tbl_client.client_secret
     *
     * @mbg.generated Thu Sep 06 11:43:18 CST 2018
     */
    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:18 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", client_id=").append(client_id);
        sb.append(", client_secret=").append(client_secret);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:18 CST 2018
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
        Client other = (Client) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getClient_id() == null ? other.getClient_id() == null : this.getClient_id().equals(other.getClient_id()))
            && (this.getClient_secret() == null ? other.getClient_secret() == null : this.getClient_secret().equals(other.getClient_secret()));
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:43:18 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getClient_id() == null) ? 0 : getClient_id().hashCode());
        result = prime * result + ((getClient_secret() == null) ? 0 : getClient_secret().hashCode());
        return result;
    }
}