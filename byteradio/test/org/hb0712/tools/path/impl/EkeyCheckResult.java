package org.hb0712.tools.path.impl;

public enum EkeyCheckResult {
	R200,
	R400;

	private String showname (int i){
		switch(i){
			case 200:
				return "验证成功";
			case 400:
				return "此帐号没有绑定将军令";
			case 401:
				return "无效的用户组或系统代号";
			case 402:
				return "用户名无效,目前验证规则2-26位的数字/字母或者.-_组成的字符串";
			case 403:
				return "动态密码无效,动态密码为六位数字";
			case 404:
				return "用户信息不存在";
			case 405:
				return "需要电话认证";
			case 413:
				return "将军令已经停用";
			case 421:
				return "认证失败";
			case 431:
				return "静态密码错误";
			case 500:
				return "将军令服务器错误";
			case 501:
				return "认证服务器错误";
			case 505:
				return "Unknow code return,将军令服务器返回错误代码";
		}
		return null;
	}
	
	public String toString(){  //覆盖了父类Enum的toString()  
		
		return showname(200);
	}  
}
