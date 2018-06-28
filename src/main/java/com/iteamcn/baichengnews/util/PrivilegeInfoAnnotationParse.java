package com.iteamcn.baichengnews.util;

import java.lang.reflect.Method;

public class PrivilegeInfoAnnotationParse {
	public static String parse(Class<?> targetClass,String methodName,Class<?>[] args) throws NoSuchMethodException, SecurityException{
		String privilegeName = "";
		Method method = targetClass.getMethod(methodName,args);
		if(method.isAnnotationPresent(Privilege.class)){
			Privilege privilegeInfo = method.getAnnotation(Privilege.class);
			privilegeName = privilegeInfo.value();
		}
		return privilegeName;
	}
}