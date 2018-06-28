package com.iteamcn.baichengnews.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class User implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private Integer u_id;

    /**
     *
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private String u_name;

    /**
     *
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private String u_nick;

    /**
     *
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private String u_group;
    private Group u_groupObject;
    /**
     *
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private String u_password;

    /**
     *
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private Date u_reg_date;

    /**
     *
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private Boolean u_banned;

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column user.u_id
     *
     * @return the value of user.u_id
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public Integer getU_id() {
        return u_id;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public User withU_id(Integer u_id) {
        this.setU_id(u_id);
        return this;
    }

    /**
     * This method sets the value of the database column user.u_id
     *
     * @param u_id the value for user.u_id
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public void setU_id(Integer u_id) {
        this.u_id = u_id;
    }

    /**
     * This method returns the value of the database column user.u_name
     *
     * @return the value of user.u_name
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public String getU_name() {
        return u_name;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public User withU_name(String u_name) {
        this.setU_name(u_name);
        return this;
    }

    /**
     * This method sets the value of the database column user.u_name
     *
     * @param u_name the value for user.u_name
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    /**
     * This method returns the value of the database column user.u_nick
     *
     * @return the value of user.u_nick
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public String getU_nick() {
        return u_nick;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public User withU_nick(String u_nick) {
        this.setU_nick(u_nick);
        return this;
    }

    /**
     * This method sets the value of the database column user.u_nick
     *
     * @param u_nick the value for user.u_nick
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public void setU_nick(String u_nick) {
        this.u_nick = u_nick;
    }

    /**
     * This method returns the value of the database column user.u_group
     *
     * @return the value of user.u_group
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public String getU_group() {
        return u_group;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public User withU_group(String u_group) {
        this.setU_group(u_group);
        return this;
    }

    /**
     * This method sets the value of the database column user.u_group
     *
     * @param u_group the value for user.u_group
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public void setU_group(String u_group) {
        this.u_group = u_group;
    }

    /**
     * This method returns the value of the database column user.u_password
     *
     * @return the value of user.u_password
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public String getU_password() {
        return u_password;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public User withU_password(String u_password) {
        this.setU_password(u_password);
        return this;
    }

    /**
     * This method sets the value of the database column user.u_password
     *
     * @param u_password the value for user.u_password
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public void setU_password(String u_password) {
        this.u_password = u_password;
    }

    /**
     * This method returns the value of the database column user.u_reg_date
     *
     * @return the value of user.u_reg_date
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public Date getU_reg_date() {
        return u_reg_date;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public User withU_reg_date(Date u_reg_date) {
        this.setU_reg_date(u_reg_date);
        return this;
    }

    /**
     * This method sets the value of the database column user.u_reg_date
     *
     * @param u_reg_date the value for user.u_reg_date
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public void setU_reg_date(Date u_reg_date) {
        this.u_reg_date = u_reg_date;
    }

    /**
     * This method returns the value of the database column user.u_banned
     *
     * @return the value of user.u_banned
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public Boolean getU_banned() {
        return u_banned;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public User withU_banned(Boolean u_banned) {
        this.setU_banned(u_banned);
        return this;
    }

    /**
     * This method sets the value of the database column user.u_banned
     *
     * @param u_banned the value for user.u_banned
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public void setU_banned(Boolean u_banned) {
        this.u_banned = u_banned;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", u_id=").append(u_id);
        sb.append(", u_name=").append(u_name);
        sb.append(", u_nick=").append(u_nick);
        sb.append(", u_group=").append(u_group);
        sb.append(", u_password=").append(u_password);
        sb.append(", u_reg_date=").append(u_reg_date);
        sb.append(", u_banned=").append(u_banned);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
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
        return (this.getU_id() == null ? other.getU_id() == null : this.getU_id().equals(other.getU_id()))
            && (this.getU_name() == null ? other.getU_name() == null : this.getU_name().equals(other.getU_name()))
            && (this.getU_nick() == null ? other.getU_nick() == null : this.getU_nick().equals(other.getU_nick()))
            && (this.getU_group() == null ? other.getU_group() == null : this.getU_group().equals(other.getU_group()))
            && (this.getU_password() == null ? other.getU_password() == null : this.getU_password().equals(other.getU_password()))
            && (this.getU_reg_date() == null ? other.getU_reg_date() == null : this.getU_reg_date().equals(other.getU_reg_date()))
            && (this.getU_banned() == null ? other.getU_banned() == null : this.getU_banned().equals(other.getU_banned()));
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getU_id() == null) ? 0 : getU_id().hashCode());
        result = prime * result + ((getU_name() == null) ? 0 : getU_name().hashCode());
        result = prime * result + ((getU_nick() == null) ? 0 : getU_nick().hashCode());
        result = prime * result + ((getU_group() == null) ? 0 : getU_group().hashCode());
        result = prime * result + ((getU_password() == null) ? 0 : getU_password().hashCode());
        result = prime * result + ((getU_reg_date() == null) ? 0 : getU_reg_date().hashCode());
        result = prime * result + ((getU_banned() == null) ? 0 : getU_banned().hashCode());
        return result;
    }

	public Group getU_groupObject() {
		return u_groupObject;
	}

	public void setU_groupObject(Group u_groupObject) {
		this.u_groupObject = u_groupObject;
	}
}