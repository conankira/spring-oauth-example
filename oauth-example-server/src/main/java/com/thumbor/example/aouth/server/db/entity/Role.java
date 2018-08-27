package com.thumbor.example.aouth.server.db.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class Role implements Serializable {
    /**
     *
     *
     * @mbg.generated Mon Aug 27 18:31:08 CST 2018
     */
    private Integer id;

    /**
     *
     *
     * @mbg.generated Mon Aug 27 18:31:08 CST 2018
     */
    private String name;

    /**
     *
     * @mbg.generated Mon Aug 27 18:31:08 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tbl_role.id
     *
     * @return the value of tbl_role.id
     *
     * @mbg.generated Mon Aug 27 18:31:08 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Mon Aug 27 18:31:08 CST 2018
     */
    public Role withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column tbl_role.id
     *
     * @param id the value for tbl_role.id
     *
     * @mbg.generated Mon Aug 27 18:31:08 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column tbl_role.name
     *
     * @return the value of tbl_role.name
     *
     * @mbg.generated Mon Aug 27 18:31:08 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @mbg.generated Mon Aug 27 18:31:08 CST 2018
     */
    public Role withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method sets the value of the database column tbl_role.name
     *
     * @param name the value for tbl_role.name
     *
     * @mbg.generated Mon Aug 27 18:31:08 CST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @mbg.generated Mon Aug 27 18:31:08 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Mon Aug 27 18:31:08 CST 2018
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
        Role other = (Role) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()));
    }

    /**
     *
     * @mbg.generated Mon Aug 27 18:31:08 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        return result;
    }
}