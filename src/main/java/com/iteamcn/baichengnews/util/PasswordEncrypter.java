package com.iteamcn.baichengnews.util;

public class PasswordEncrypter {
	public static String userPasswordEncrypt(String userName,String password) {
		return Hash.MD5(password+userName+"BCNEWS");
	}
}
