package com.iteamcn.baichengnews.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class LikeKey implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    private Integer l_user;
    private User l_userObject;
    /**
     *
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    private Integer l_comment;
    private Comment l_commentObject;
    /**
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column like.l_user
     *
     * @return the value of like.l_user
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    public Integer getL_user() {
        return l_user;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    public LikeKey withL_user(Integer l_user) {
        this.setL_user(l_user);
        return this;
    }

    /**
     * This method sets the value of the database column like.l_user
     *
     * @param l_user the value for like.l_user
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    public void setL_user(Integer l_user) {
        this.l_user = l_user;
    }

    /**
     * This method returns the value of the database column like.l_comment
     *
     * @return the value of like.l_comment
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    public Integer getL_comment() {
        return l_comment;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    public LikeKey withL_comment(Integer l_comment) {
        this.setL_comment(l_comment);
        return this;
    }

    /**
     * This method sets the value of the database column like.l_comment
     *
     * @param l_comment the value for like.l_comment
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    public void setL_comment(Integer l_comment) {
        this.l_comment = l_comment;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", l_user=").append(l_user);
        sb.append(", l_comment=").append(l_comment);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
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
        LikeKey other = (LikeKey) that;
        return (this.getL_user() == null ? other.getL_user() == null : this.getL_user().equals(other.getL_user()))
            && (this.getL_comment() == null ? other.getL_comment() == null : this.getL_comment().equals(other.getL_comment()));
    }

    /**
     *
     * @mbg.generated Wed Jun 13 10:28:03 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getL_user() == null) ? 0 : getL_user().hashCode());
        result = prime * result + ((getL_comment() == null) ? 0 : getL_comment().hashCode());
        return result;
    }

	public Comment getL_commentObject() {
		return l_commentObject;
	}

	public void setL_commentObject(Comment l_commentObject) {
		this.l_commentObject = l_commentObject;
	}

	public User getL_userObject() {
		return l_userObject;
	}

	public void setL_userObject(User l_userObject) {
		this.l_userObject = l_userObject;
	}
}