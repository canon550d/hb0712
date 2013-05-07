package org.hb0712.tools.path.impl;

public enum EkeyCheckResult {
	Success, Fail;

	private String getMessage (int i){
		String message = null;
		switch(i){
			case 200:
				message = "验证成功";
			case 400:
				message = "此帐号没有绑定将军令";
			case 401:
				message = "无效的用户组或系统代号";
			case 402:
				message = "用户名无效,目前验证规则2-26位的数字/字母或者.-_组成的字符串";
			case 403:
				message = "动态密码无效,动态密码为六位数字";
			case 404:
				message = "用户信息不存在";
			case 405:
				message = "需要电话认证";
			case 413:
				message = "将军令已经停用";
			case 421:
				message = "认证失败";
			case 431:
				message = "静态密码错误";
			case 500:
				message = "将军令服务器错误";
			case 501:
				message = "认证服务器错误";
			case 505:
				message = "Unknow code return,将军令服务器返回错误代码";
		}
		return message;
	}
	
	public String toString(){  //覆盖了父类Enum的toString()  
		return super.toString();
	}
	
	
}
