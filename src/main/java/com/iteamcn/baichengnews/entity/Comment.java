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
public class Comment implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    private Integer c_id;

    /**
     *
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    private Integer c_user;
    private User c_userObject;
    /**
     *
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    private Integer c_news;
    private News c_newsObject;
    /**
     *
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    private Boolean c_check;

    /**
     *
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    private Date c_date;

    /**
     *
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    private Boolean c_enable;

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column comment.c_id
     *
     * @return the value of comment.c_id
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    public Integer getC_id() {
        return c_id;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    public Comment withC_id(Integer c_id) {
        this.setC_id(c_id);
        return this;
    }

    /**
     * This method sets the value of the database column comment.c_id
     *
     * @param c_id the value for comment.c_id
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    public void setC_id(Integer c_id) {
        this.c_id = c_id;
    }

    /**
     * This method returns the value of the database column comment.c_user
     *
     * @return the value of comment.c_user
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    public Integer getC_user() {
        return c_user;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    public Comment withC_user(Integer c_user) {
        this.setC_user(c_user);
        return this;
    }

    /**
     * This method sets the value of the database column comment.c_user
     *
     * @param c_user the value for comment.c_user
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    public void setC_user(Integer c_user) {
        this.c_user = c_user;
    }

    /**
     * This method returns the value of the database column comment.c_news
     *
     * @return the value of comment.c_news
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    public Integer getC_news() {
        return c_news;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    public Comment withC_news(Integer c_news) {
        this.setC_news(c_news);
        return this;
    }

    /**
     * This method sets the value of the database column comment.c_news
     *
     * @param c_news the value for comment.c_news
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    public void setC_news(Integer c_news) {
        this.c_news = c_news;
    }

    /**
     * This method returns the value of the database column comment.c_check
     *
     * @return the value of comment.c_check
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    public Boolean getC_check() {
        return c_check;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    public Comment withC_check(Boolean c_check) {
        this.setC_check(c_check);
        return this;
    }

    /**
     * This method sets the value of the database column comment.c_check
     *
     * @param c_check the value for comment.c_check
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    public void setC_check(Boolean c_check) {
        this.c_check = c_check;
    }

    /**
     * This method returns the value of the database column comment.c_date
     *
     * @return the value of comment.c_date
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    public Date getC_date() {
        return c_date;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    public Comment withC_date(Date c_date) {
        this.setC_date(c_date);
        return this;
    }

    /**
     * This method sets the value of the database column comment.c_date
     *
     * @param c_date the value for comment.c_date
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    public void setC_date(Date c_date) {
        this.c_date = c_date;
    }

    /**
     * This method returns the value of the database column comment.c_enable
     *
     * @return the value of comment.c_enable
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    public Boolean getC_enable() {
        return c_enable;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    public Comment withC_enable(Boolean c_enable) {
        this.setC_enable(c_enable);
        return this;
    }

    /**
     * This method sets the value of the database column comment.c_enable
     *
     * @param c_enable the value for comment.c_enable
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    public void setC_enable(Boolean c_enable) {
        this.c_enable = c_enable;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", c_id=").append(c_id);
        sb.append(", c_user=").append(c_user);
        sb.append(", c_news=").append(c_news);
        sb.append(", c_check=").append(c_check);
        sb.append(", c_date=").append(c_date);
        sb.append(", c_enable=").append(c_enable);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
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
        Comment other = (Comment) that;
        return (this.getC_id() == null ? other.getC_id() == null : this.getC_id().equals(other.getC_id()))
            && (this.getC_user() == null ? other.getC_user() == null : this.getC_user().equals(other.getC_user()))
            && (this.getC_news() == null ? other.getC_news() == null : this.getC_news().equals(other.getC_news()))
            && (this.getC_check() == null ? other.getC_check() == null : this.getC_check().equals(other.getC_check()))
            && (this.getC_date() == null ? other.getC_date() == null : this.getC_date().equals(other.getC_date()))
            && (this.getC_enable() == null ? other.getC_enable() == null : this.getC_enable().equals(other.getC_enable()));
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:31:51 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getC_id() == null) ? 0 : getC_id().hashCode());
        result = prime * result + ((getC_user() == null) ? 0 : getC_user().hashCode());
        result = prime * result + ((getC_news() == null) ? 0 : getC_news().hashCode());
        result = prime * result + ((getC_check() == null) ? 0 : getC_check().hashCode());
        result = prime * result + ((getC_date() == null) ? 0 : getC_date().hashCode());
        result = prime * result + ((getC_enable() == null) ? 0 : getC_enable().hashCode());
        return result;
    }

	public User getC_userObject() {
		return c_userObject;
	}

	public void setC_userObject(User c_userObject) {
		this.c_userObject = c_userObject;
	}

	public News getC_newsObject() {
		return c_newsObject;
	}

	public void setC_newsObject(News c_newsObject) {
		this.c_newsObject = c_newsObject;
	}
}