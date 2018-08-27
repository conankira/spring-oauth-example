package com.thumbor.example.aouth.server.db.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class UserRole implements Serializable {
    /**
     *
     *
     * @mbg.generated Mon Aug 27 18:32:26 CST 2018
     */
    private Integer id;

    /**
     *
     *
     * @mbg.generated Mon Aug 27 18:32:26 CST 2018
     */
    private Integer user_id;

    /**
     *
     *
     * @mbg.generated Mon Aug 27 18:32:26 CST 2018
     */
    private Integer role_id;

    private Role role;



    /**
     *
     * @mbg.generated Mon Aug 27 18:32:26 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tbl_user_role.id
     *
     * @return the value of tbl_user_role.id
     *
     * @mbg.generated Mon Aug 27 18:32:26 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Mon Aug 27 18:32:26 CST 2018
     */
    public UserRole withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column tbl_user_role.id
     *
     * @param id the value for tbl_user_role.id
     *
     * @mbg.generated Mon Aug 27 18:32:26 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column tbl_user_role.user_id
     *
     * @return the value of tbl_user_role.user_id
     *
     * @mbg.generated Mon Aug 27 18:32:26 CST 2018
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     *
     * @mbg.generated Mon Aug 27 18:32:26 CST 2018
     */
    public UserRole withUser_id(Integer user_id) {
        this.setUser_id(user_id);
        return this;
    }

    /**
     * This method sets the value of the database column tbl_user_role.user_id
     *
     * @param user_id the value for tbl_user_role.user_id
     *
     * @mbg.generated Mon Aug 27 18:32:26 CST 2018
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     * This method returns the value of the database column tbl_user_role.role_id
     *
     * @return the value of tbl_user_role.role_id
     *
     * @mbg.generated Mon Aug 27 18:32:26 CST 2018
     */
    public Integer getRole_id() {
        return role_id;
    }

    /**
     *
     * @mbg.generated Mon Aug 27 18:32:26 CST 2018
     */
    public UserRole withRole_id(Integer role_id) {
        this.setRole_id(role_id);
        return this;
    }

    /**
     * This method sets the value of the database column tbl_user_role.role_id
     *
     * @param role_id the value for tbl_user_role.role_id
     *
     * @mbg.generated Mon Aug 27 18:32:26 CST 2018
     */
    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    /**
     *
     * @mbg.generated Mon Aug 27 18:32:26 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", user_id=").append(user_id);
        sb.append(", role_id=").append(role_id);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Mon Aug 27 18:32:26 CST 2018
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
        UserRole other = (UserRole) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUser_id() == null ? other.getUser_id() == null : this.getUser_id().equals(other.getUser_id()))
            && (this.getRole_id() == null ? other.getRole_id() == null : this.getRole_id().equals(other.getRole_id()));
    }

    /**
     *
     * @mbg.generated Mon Aug 27 18:32:26 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUser_id() == null) ? 0 : getUser_id().hashCode());
        result = prime * result + ((getRole_id() == null) ? 0 : getRole_id().hashCode());
        return result;
    }

    public Role getRole() {
        return role;
    }

    public UserRole setRole(Role role) {
        this.role = role;
        return this;
    }
}