package com.thumbor.example.aouth.server.db.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 *
 * @author
 */
public class User implements Serializable {

    public static final String STATE_ACCOUNTEXPIRED = "STATE_ACCOUNTEXPIRED";
    public static final String STATE_LOCK = "STATE_LOCK";
    public static final String STATE_TOKENEXPIRED = "STATE_TOKENEXPIRED";
    public static final String STATE_NORMAL = "STATE_NORMAL";
    /**
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
     */
    private Integer id;

    /**
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
     */
    private String username;

    /**
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
     */
    private String password;

    /**
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
     */
    private String state;

    /**
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
     */
    private String name;

    /**
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
     */
    private String gender;

    /**
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
     */
    private String birth;

    /**
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column tbl_user.id
     *
     * @return the value of tbl_user.id
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
     */
    public User withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column tbl_user.id
     *
     * @param id the value for tbl_user.id
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column tbl_user.username
     *
     * @return the value of tbl_user.username
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
     */
    public String getUsername() {
        return username;
    }

    /**
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
     */
    public User withUsername(String username) {
        this.setUsername(username);
        return this;
    }

    /**
     * This method sets the value of the database column tbl_user.username
     *
     * @param username the value for tbl_user.username
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * This method returns the value of the database column tbl_user.password
     *
     * @return the value of tbl_user.password
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
     */
    public User withPassword(String password) {
        this.setPassword(password);
        return this;
    }

    /**
     * This method sets the value of the database column tbl_user.password
     *
     * @param password the value for tbl_user.password
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * This method returns the value of the database column tbl_user.state
     *
     * @return the value of tbl_user.state
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
     */
    public String getState() {
        return state;
    }

    /**
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
     */
    public User withState(String state) {
        this.setState(state);
        return this;
    }

    /**
     * This method sets the value of the database column tbl_user.state
     *
     * @param state the value for tbl_user.state
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * This method returns the value of the database column tbl_user.name
     *
     * @return the value of tbl_user.name
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
     */
    public User withName(String name) {
        this.setName(name);
        return this;
    }

    /**
     * This method sets the value of the database column tbl_user.name
     *
     * @param name the value for tbl_user.name
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the value of the database column tbl_user.gender
     *
     * @return the value of tbl_user.gender
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
     */
    public String getGender() {
        return gender;
    }

    /**
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
     */
    public User withGender(String gender) {
        this.setGender(gender);
        return this;
    }

    /**
     * This method sets the value of the database column tbl_user.gender
     *
     * @param gender the value for tbl_user.gender
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * This method returns the value of the database column tbl_user.birth
     *
     * @return the value of tbl_user.birth
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
     */
    public String getBirth() {
        return birth;
    }

    /**
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
     */
    public User withBirth(String birth) {
        this.setBirth(birth);
        return this;
    }

    /**
     * This method sets the value of the database column tbl_user.birth
     *
     * @param birth the value for tbl_user.birth
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
     */
    public void setBirth(String birth) {
        this.birth = birth;
    }

    /**
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", state=").append(state);
        sb.append(", name=").append(name);
        sb.append(", gender=").append(gender);
        sb.append(", birth=").append(birth);
        sb.append("]");
        return sb.toString();
    }

    /**
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
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
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
                && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
                && (this.getState() == null ? other.getState() == null : this.getState().equals(other.getState()))
                && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
                && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
                && (this.getBirth() == null ? other.getBirth() == null : this.getBirth().equals(other.getBirth()));
    }

    /**
     * @mbg.generated Mon Aug 27 18:32:01 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getState() == null) ? 0 : getState().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getBirth() == null) ? 0 : getBirth().hashCode());
        return result;
    }
}