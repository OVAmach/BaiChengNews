package com.iteamcn.baichengnews.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.iteamcn.baichengnews.dao.UserMapper;
import com.iteamcn.baichengnews.entity.User;
import com.iteamcn.baichengnews.entity.local.LoginMessage;
import com.iteamcn.baichengnews.entity.local.Message;
import com.iteamcn.baichengnews.util.NoPrivilegeException;
import com.iteamcn.baichengnews.util.PageInfo;
import com.iteamcn.baichengnews.util.PasswordEncrypter;
import com.iteamcn.baichengnews.util.Privilege;
@Service("userService")
public class UserService {
	@Resource
	private UserMapper dao;
	@Privilege("user_list_all")
	public List<User> listUser(PageInfo page) throws NoPrivilegeException{
		return listUserWithPrivilege(page);
	}
	public List<User> listUserWithPrivilege(PageInfo page){
		return dao.selectUserListPage(page);
	}
	@Deprecated
	@Privilege("user_view_other")
	public User userDetailByName(String user)  throws NoPrivilegeException{
		return userAdvDetailByNameWithPrivilege(user);
	}
	/**
	 * @param user
	 * @return 有密码 有关联对象的User
	 */
	public User userAdvDetailByNameWithPrivilege(String user) {
		return dao.selectAdvByName(user);
	}
	/**
	 * @param user
	 * @return 有密码 无关联对象的User
	 */
	public User userBaseDetailByNameWithPrivilege(String user) {
		return dao.selectBaseByName(user);
	}
	/**
	 * @param id
	 * {@link #userAdvDetailByIDWithPrivilege(Integer)}
	 * @return 有权限检查
	 * @throws NoPrivilegeException
	 */
	@Privilege("user_view_other")
	public User userAdvDetailByID(Integer id)  throws NoPrivilegeException{
		return userAdvDetailByIDWithPrivilege(id);
	}
	/**
	 * @param id
	 * @return 没密码且有关联信息对象的User
	 */
	public User userAdvDetailByIDWithPrivilege(Integer id){
		return dao.selectAdvByIdWithOutPass(id);
	}
	public Message userLoginCheck(User dUser,User user) {
		Message msg=new Message();
		String pass=PasswordEncrypter.userPasswordEncrypt(user.getU_name(), user.getU_password());
		if(dUser!=null) {
			if(dUser.getU_password().equals(pass)) {
				msg.setCode(LoginMessage.SUCCESS);
				msg.setObject(dUser);
			}else {
				msg.setCode(LoginMessage.USER_PASS_ERR);
				msg.setInfo(LoginMessage.USER_PASS_ERR_INFO);
			}
		}else {
			msg.setCode(LoginMessage.USER_NOT_EXIST); 
			msg.setInfo(LoginMessage.USER_NOT_EXIST_INFO); 
		}
		return msg;
	}
	public boolean userRegister(User user) {
		user.setU_password(PasswordEncrypter.userPasswordEncrypt(user.getU_name(), user.getU_password()));
		if(dao.insertSelective(user)>0) {
			return true;
		}
		return false;
	}
}
