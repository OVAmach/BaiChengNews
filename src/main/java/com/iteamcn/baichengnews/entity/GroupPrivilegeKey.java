package com.iteamcn.baichengnews.entity;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
public class GroupPrivilegeKey implements Serializable {
    /**
     *
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private String gp_group;
    private Group gp_groupObject;
    /**
     *
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private String gp_privilege;
    private Privilege gp_privilegeObject;
    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column group_privilege.gp_group
     *
     * @return the value of group_privilege.gp_group
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public String getGp_group() {
        return gp_group;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public GroupPrivilegeKey withGp_group(String gp_group) {
        this.setGp_group(gp_group);
        return this;
    }

    /**
     * This method sets the value of the database column group_privilege.gp_group
     *
     * @param gp_group the value for group_privilege.gp_group
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public void setGp_group(String gp_group) {
        this.gp_group = gp_group;
    }

    /**
     * This method returns the value of the database column group_privilege.gp_privilege
     *
     * @return the value of group_privilege.gp_privilege
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public String getGp_privilege() {
        return gp_privilege;
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public GroupPrivilegeKey withGp_privilege(String gp_privilege) {
        this.setGp_privilege(gp_privilege);
        return this;
    }

    /**
     * This method sets the value of the database column group_privilege.gp_privilege
     *
     * @param gp_privilege the value for group_privilege.gp_privilege
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    public void setGp_privilege(String gp_privilege) {
        this.gp_privilege = gp_privilege;
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
        sb.append(", gp_group=").append(gp_group);
        sb.append(", gp_privilege=").append(gp_privilege);
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
        GroupPrivilegeKey other = (GroupPrivilegeKey) that;
        return (this.getGp_group() == null ? other.getGp_group() == null : this.getGp_group().equals(other.getGp_group()))
            && (this.getGp_privilege() == null ? other.getGp_privilege() == null : this.getGp_privilege().equals(other.getGp_privilege()));
    }

    /**
     *
     * @mbg.generated Wed Jun 13 09:45:52 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGp_group() == null) ? 0 : getGp_group().hashCode());
        result = prime * result + ((getGp_privilege() == null) ? 0 : getGp_privilege().hashCode());
        return result;
    }

	public Group getGp_groupObject() {
		return gp_groupObject;
	}

	public void setGp_groupObject(Group gp_groupObject) {
		this.gp_groupObject = gp_groupObject;
	}

	public Privilege getGp_privilegeObject() {
		return gp_privilegeObject;
	}

	public void setGp_privilegeObject(Privilege gp_privilegeObject) {
		this.gp_privilegeObject = gp_privilegeObject;
	}
}