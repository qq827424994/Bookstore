package interceptor;


import java.util.*;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

import entity.User;

@SuppressWarnings("serial")
public class UserLoginCheck extends AbstractInterceptor {
	public String intercept(ActionInvocation ai) throws Exception {
		@SuppressWarnings("rawtypes")
		Map session = ai.getInvocationContext().getSession();
		User user = (User) session.get("loginUser");
		if (user != null) {
			return ai.invoke();
		} else {
			return "login";
		}
	}
}
