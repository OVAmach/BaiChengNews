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
public class News implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private Integer n_id;

    /**
     *
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private Integer n_channel;
    private Channel n_channelObject;
    /**
     *
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private String n_title;

    /**
     *
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private String n_pic;

    /**
     *
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private Date n_date;

    /**
     *
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private Integer n_priority;

    /**
     *
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private Integer n_author;
    private User n_authorObject;
    /**
     *
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private Boolean n_can_comment;

    /**
     *
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private String n_content;

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column news.n_id
     *
     * @return the value of news.n_id
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public Integer getN_id() {
        return n_id;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public News withN_id(Integer n_id) {
        this.setN_id(n_id);
        return this;
    }

    /**
     * This method sets the value of the database column news.n_id
     *
     * @param n_id the value for news.n_id
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public void setN_id(Integer n_id) {
        this.n_id = n_id;
    }

    /**
     * This method returns the value of the database column news.n_channel
     *
     * @return the value of news.n_channel
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public Integer getN_channel() {
        return n_channel;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public News withN_channel(Integer n_channel) {
        this.setN_channel(n_channel);
        return this;
    }

    /**
     * This method sets the value of the database column news.n_channel
     *
     * @param n_channel the value for news.n_channel
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public void setN_channel(Integer n_channel) {
        this.n_channel = n_channel;
    }

    /**
     * This method returns the value of the database column news.n_title
     *
     * @return the value of news.n_title
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public String getN_title() {
        return n_title;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public News withN_title(String n_title) {
        this.setN_title(n_title);
        return this;
    }

    /**
     * This method sets the value of the database column news.n_title
     *
     * @param n_title the value for news.n_title
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public void setN_title(String n_title) {
        this.n_title = n_title;
    }

    /**
     * This method returns the value of the database column news.n_pic
     *
     * @return the value of news.n_pic
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public String getN_pic() {
        return n_pic;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public News withN_pic(String n_pic) {
        this.setN_pic(n_pic);
        return this;
    }

    /**
     * This method sets the value of the database column news.n_pic
     *
     * @param n_pic the value for news.n_pic
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public void setN_pic(String n_pic) {
        this.n_pic = n_pic;
    }

    /**
     * This method returns the value of the database column news.n_date
     *
     * @return the value of news.n_date
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public Date getN_date() {
        return n_date;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public News withN_date(Date n_date) {
        this.setN_date(n_date);
        return this;
    }

    /**
     * This method sets the value of the database column news.n_date
     *
     * @param n_date the value for news.n_date
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public void setN_date(Date n_date) {
        this.n_date = n_date;
    }

    /**
     * This method returns the value of the database column news.n_priority
     *
     * @return the value of news.n_priority
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public Integer getN_priority() {
        return n_priority;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public News withN_priority(Integer n_priority) {
        this.setN_priority(n_priority);
        return this;
    }

    /**
     * This method sets the value of the database column news.n_priority
     *
     * @param n_priority the value for news.n_priority
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public void setN_priority(Integer n_priority) {
        this.n_priority = n_priority;
    }

    /**
     * This method returns the value of the database column news.n_author
     *
     * @return the value of news.n_author
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public Integer getN_author() {
        return n_author;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public News withN_author(Integer n_author) {
        this.setN_author(n_author);
        return this;
    }

    /**
     * This method sets the value of the database column news.n_author
     *
     * @param n_author the value for news.n_author
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public void setN_author(Integer n_author) {
        this.n_author = n_author;
    }

    /**
     * This method returns the value of the database column news.n_can_comment
     *
     * @return the value of news.n_can_comment
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public Boolean getN_can_comment() {
        return n_can_comment;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public News withN_can_comment(Boolean n_can_comment) {
        this.setN_can_comment(n_can_comment);
        return this;
    }

    /**
     * This method sets the value of the database column news.n_can_comment
     *
     * @param n_can_comment the value for news.n_can_comment
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public void setN_can_comment(Boolean n_can_comment) {
        this.n_can_comment = n_can_comment;
    }

    /**
     * This method returns the value of the database column news.n_content
     *
     * @return the value of news.n_content
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public String getN_content() {
        return n_content;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public News withN_content(String n_content) {
        this.setN_content(n_content);
        return this;
    }

    /**
     * This method sets the value of the database column news.n_content
     *
     * @param n_content the value for news.n_content
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public void setN_content(String n_content) {
        this.n_content = n_content;
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
        sb.append(", n_id=").append(n_id);
        sb.append(", n_channel=").append(n_channel);
        sb.append(", n_title=").append(n_title);
        sb.append(", n_pic=").append(n_pic);
        sb.append(", n_date=").append(n_date);
        sb.append(", n_priority=").append(n_priority);
        sb.append(", n_author=").append(n_author);
        sb.append(", n_can_comment=").append(n_can_comment);
        sb.append(", n_content=").append(n_content);
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
        News other = (News) that;
        return (this.getN_id() == null ? other.getN_id() == null : this.getN_id().equals(other.getN_id()))
            && (this.getN_channel() == null ? other.getN_channel() == null : this.getN_channel().equals(other.getN_channel()))
            && (this.getN_title() == null ? other.getN_title() == null : this.getN_title().equals(other.getN_title()))
            && (this.getN_pic() == null ? other.getN_pic() == null : this.getN_pic().equals(other.getN_pic()))
            && (this.getN_date() == null ? other.getN_date() == null : this.getN_date().equals(other.getN_date()))
            && (this.getN_priority() == null ? other.getN_priority() == null : this.getN_priority().equals(other.getN_priority()))
            && (this.getN_author() == null ? other.getN_author() == null : this.getN_author().equals(other.getN_author()))
            && (this.getN_can_comment() == null ? other.getN_can_comment() == null : this.getN_can_comment().equals(other.getN_can_comment()))
            && (this.getN_content() == null ? other.getN_content() == null : this.getN_content().equals(other.getN_content()));
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getN_id() == null) ? 0 : getN_id().hashCode());
        result = prime * result + ((getN_channel() == null) ? 0 : getN_channel().hashCode());
        result = prime * result + ((getN_title() == null) ? 0 : getN_title().hashCode());
        result = prime * result + ((getN_pic() == null) ? 0 : getN_pic().hashCode());
        result = prime * result + ((getN_date() == null) ? 0 : getN_date().hashCode());
        result = prime * result + ((getN_priority() == null) ? 0 : getN_priority().hashCode());
        result = prime * result + ((getN_author() == null) ? 0 : getN_author().hashCode());
        result = prime * result + ((getN_can_comment() == null) ? 0 : getN_can_comment().hashCode());
        result = prime * result + ((getN_content() == null) ? 0 : getN_content().hashCode());
        return result;
    }

	public User getN_authorObject() {
		return n_authorObject;
	}

	public void setN_authorObject(User n_authorObject) {
		this.n_authorObject = n_authorObject;
	}

	public Channel getN_channelObject() {
		return n_channelObject;
	}

	public void setN_channelObject(Channel n_channelObject) {
		this.n_channelObject = n_channelObject;
	}
}