package com.iteamcn.baichengnews.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class Privilege implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private String p_code;

    /**
     *
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private String p_name;

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column privilege.p_code
     *
     * @return the value of privilege.p_code
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public String getP_code() {
        return p_code;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public Privilege withP_code(String p_code) {
        this.setP_code(p_code);
        return this;
    }

    /**
     * This method sets the value of the database column privilege.p_code
     *
     * @param p_code the value for privilege.p_code
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public void setP_code(String p_code) {
        this.p_code = p_code;
    }

    /**
     * This method returns the value of the database column privilege.p_name
     *
     * @return the value of privilege.p_name
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public String getP_name() {
        return p_name;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public Privilege withP_name(String p_name) {
        this.setP_name(p_name);
        return this;
    }

    /**
     * This method sets the value of the database column privilege.p_name
     *
     * @param p_name the value for privilege.p_name
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public void setP_name(String p_name) {
        this.p_name = p_name;
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
        sb.append(", p_code=").append(p_code);
        sb.append(", p_name=").append(p_name);
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
        Privilege other = (Privilege) that;
        return (this.getP_code() == null ? other.getP_code() == null : this.getP_code().equals(other.getP_code()))
            && (this.getP_name() == null ? other.getP_name() == null : this.getP_name().equals(other.getP_name()));
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getP_code() == null) ? 0 : getP_code().hashCode());
        result = prime * result + ((getP_name() == null) ? 0 : getP_name().hashCode());
        return result;
    }
}