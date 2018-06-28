package com.iteamcn.baichengnews.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class Channel implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private Integer ch_id;

    /**
     *
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private String ch_code;

    /**
     *
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private String ch_name;

    /**
     *
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private Integer ch_priority;

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column channel.ch_id
     *
     * @return the value of channel.ch_id
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public Integer getCh_id() {
        return ch_id;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public Channel withCh_id(Integer ch_id) {
        this.setCh_id(ch_id);
        return this;
    }

    /**
     * This method sets the value of the database column channel.ch_id
     *
     * @param ch_id the value for channel.ch_id
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public void setCh_id(Integer ch_id) {
        this.ch_id = ch_id;
    }

    /**
     * This method returns the value of the database column channel.ch_code
     *
     * @return the value of channel.ch_code
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public String getCh_code() {
        return ch_code;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public Channel withCh_code(String ch_code) {
        this.setCh_code(ch_code);
        return this;
    }

    /**
     * This method sets the value of the database column channel.ch_code
     *
     * @param ch_code the value for channel.ch_code
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public void setCh_code(String ch_code) {
        this.ch_code = ch_code;
    }

    /**
     * This method returns the value of the database column channel.ch_name
     *
     * @return the value of channel.ch_name
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public String getCh_name() {
        return ch_name;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public Channel withCh_name(String ch_name) {
        this.setCh_name(ch_name);
        return this;
    }

    /**
     * This method sets the value of the database column channel.ch_name
     *
     * @param ch_name the value for channel.ch_name
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public void setCh_name(String ch_name) {
        this.ch_name = ch_name;
    }

    /**
     * This method returns the value of the database column channel.ch_priority
     *
     * @return the value of channel.ch_priority
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public Integer getCh_priority() {
        return ch_priority;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public Channel withCh_priority(Integer ch_priority) {
        this.setCh_priority(ch_priority);
        return this;
    }

    /**
     * This method sets the value of the database column channel.ch_priority
     *
     * @param ch_priority the value for channel.ch_priority
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public void setCh_priority(Integer ch_priority) {
        this.ch_priority = ch_priority;
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
        sb.append(", ch_id=").append(ch_id);
        sb.append(", ch_code=").append(ch_code);
        sb.append(", ch_name=").append(ch_name);
        sb.append(", ch_priority=").append(ch_priority);
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
        Channel other = (Channel) that;
        return (this.getCh_id() == null ? other.getCh_id() == null : this.getCh_id().equals(other.getCh_id()))
            && (this.getCh_code() == null ? other.getCh_code() == null : this.getCh_code().equals(other.getCh_code()))
            && (this.getCh_name() == null ? other.getCh_name() == null : this.getCh_name().equals(other.getCh_name()))
            && (this.getCh_priority() == null ? other.getCh_priority() == null : this.getCh_priority().equals(other.getCh_priority()));
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCh_id() == null) ? 0 : getCh_id().hashCode());
        result = prime * result + ((getCh_code() == null) ? 0 : getCh_code().hashCode());
        result = prime * result + ((getCh_name() == null) ? 0 : getCh_name().hashCode());
        result = prime * result + ((getCh_priority() == null) ? 0 : getCh_priority().hashCode());
        return result;
    }
}