package com.iteamcn.baichengnews.component;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.iteamcn.baichengnews.entity.Privilege;
import com.iteamcn.baichengnews.util.NoPrivilegeException;
import com.iteamcn.baichengnews.util.PrivilegeInfoAnnotationParse;

@Component(value="aspect")
public class Aspect {

	public Object aroundMethod(ProceedingJoinPoint joinPoint) throws Throwable{
		ServletRequestAttributes attr = (ServletRequestAttributes) 
				RequestContextHolder.currentRequestAttributes(); 
		HttpServletRequest request = attr.getRequest();
		@SuppressWarnings("unchecked")
		Set<com.iteamcn.baichengnews.entity.Privilege> privileges=(Set<Privilege>) request.getSession().getAttribute("privilege");;
		Class<? extends Object> actionClass =  joinPoint.getTarget().getClass();
		String methodName = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		Class<?>[] argClass=new Class<?>[args.length];
		for(int i=0;i<args.length;i++) {
			argClass[i]=args[i].getClass();
		}
		String privilegeName  = PrivilegeInfoAnnotationParse.parse(actionClass, methodName,argClass);
		if(privilegeName==null||privilegeName.equals("")){
			return joinPoint.proceed();
		}
		if(privileges!=null){

			boolean flag = false;
			if(privilegeName==null||privilegeName.equals("")){
				flag=true;
			}else {
				for(com.iteamcn.baichengnews.entity.Privilege p : privileges){
					if(p.getP_code().equals(privilegeName)){
						flag = true;
						break;
					}
				}
			}
			if(flag){
				return joinPoint.proceed();
			}else{
				throw new NoPrivilegeException();
			}
		}
		else{
			throw new NoPrivilegeException();
		}
	}
}