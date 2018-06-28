package com.iteamcn.baichengnews.entity;

import java.io.Serializable;
import java.util.Set;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class Group implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private String g_code;

    /**
     *
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private String g_name;
    private Set<Privilege> g_privilege;
    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column group.g_code
     *
     * @return the value of group.g_code
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public String getG_code() {
        return g_code;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public Group withG_code(String g_code) {
        this.setG_code(g_code);
        return this;
    }

    /**
     * This method sets the value of the database column group.g_code
     *
     * @param g_code the value for group.g_code
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public void setG_code(String g_code) {
        this.g_code = g_code;
    }

    /**
     * This method returns the value of the database column group.g_name
     *
     * @return the value of group.g_name
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public String getG_name() {
        return g_name;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public Group withG_name(String g_name) {
        this.setG_name(g_name);
        return this;
    }

    /**
     * This method sets the value of the database column group.g_name
     *
     * @param g_name the value for group.g_name
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public void setG_name(String g_name) {
        this.g_name = g_name;
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
        sb.append(", g_code=").append(g_code);
        sb.append(", g_name=").append(g_name);
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
        Group other = (Group) that;
        return (this.getG_code() == null ? other.getG_code() == null : this.getG_code().equals(other.getG_code()))
            && (this.getG_name() == null ? other.getG_name() == null : this.getG_name().equals(other.getG_name()));
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getG_code() == null) ? 0 : getG_code().hashCode());
        result = prime * result + ((getG_name() == null) ? 0 : getG_name().hashCode());
        return result;
    }

	public Set<Privilege> getG_privilege() {
		return g_privilege;
	}

	public void setG_privilege(Set<Privilege> g_privilege) {
		
		this.g_privilege = g_privilege;
	}
}