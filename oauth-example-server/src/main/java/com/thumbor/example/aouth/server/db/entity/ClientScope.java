package com.thumbor.example.aouth.server.db.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class ClientScope implements Serializable {
    /**
     *
     *
     * @mbg.generated Thu Sep 06 11:44:21 CST 2018
     */
    private Integer id;

    /**
     *
     *
     * @mbg.generated Thu Sep 06 11:44:21 CST 2018
     */
    private String client_id;

    /**
     *
     *
     * @mbg.generated Thu Sep 06 11:44:21 CST 2018
     */
    private String scope;

    /**
     *
     * @mbg.generated Thu Sep 06 11:44:21 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tbl_client_scope.id
     *
     * @return the value of tbl_client_scope.id
     *
     * @mbg.generated Thu Sep 06 11:44:21 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:44:21 CST 2018
     */
    public ClientScope withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column tbl_client_scope.id
     *
     * @param id the value for tbl_client_scope.id
     *
     * @mbg.generated Thu Sep 06 11:44:21 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column tbl_client_scope.client_id
     *
     * @return the value of tbl_client_scope.client_id
     *
     * @mbg.generated Thu Sep 06 11:44:21 CST 2018
     */
    public String getClient_id() {
        return client_id;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:44:21 CST 2018
     */
    public ClientScope withClient_id(String client_id) {
        this.setClient_id(client_id);
        return this;
    }

    /**
     * This method sets the value of the database column tbl_client_scope.client_id
     *
     * @param client_id the value for tbl_client_scope.client_id
     *
     * @mbg.generated Thu Sep 06 11:44:21 CST 2018
     */
    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    /**
     * This method returns the value of the database column tbl_client_scope.scope
     *
     * @return the value of tbl_client_scope.scope
     *
     * @mbg.generated Thu Sep 06 11:44:21 CST 2018
     */
    public String getScope() {
        return scope;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:44:21 CST 2018
     */
    public ClientScope withScope(String scope) {
        this.setScope(scope);
        return this;
    }

    /**
     * This method sets the value of the database column tbl_client_scope.scope
     *
     * @param scope the value for tbl_client_scope.scope
     *
     * @mbg.generated Thu Sep 06 11:44:21 CST 2018
     */
    public void setScope(String scope) {
        this.scope = scope;
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:44:21 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", client_id=").append(client_id);
        sb.append(", scope=").append(scope);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:44:21 CST 2018
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
        ClientScope other = (ClientScope) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getClient_id() == null ? other.getClient_id() == null : this.getClient_id().equals(other.getClient_id()))
            && (this.getScope() == null ? other.getScope() == null : this.getScope().equals(other.getScope()));
    }

    /**
     *
     * @mbg.generated Thu Sep 06 11:44:21 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getClient_id() == null) ? 0 : getClient_id().hashCode());
        result = prime * result + ((getScope() == null) ? 0 : getScope().hashCode());
        return result;
    }
}