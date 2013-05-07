package org.hb0712.tools.path.impl;

public enum EkeyCheckResult {
	Success, Fail;

	private String getMessage (int i){
		String message = null;
		switch(i){
			case 200:
				message = "��֤�ɹ�";
			case 400:
				message = "���ʺ�û�а󶨽�����";
			case 401:
				message = "��Ч���û����ϵͳ����";
			case 402:
				message = "�û�����Ч,Ŀǰ��֤����2-26λ������/��ĸ����.-_��ɵ��ַ���";
			case 403:
				message = "��̬������Ч,��̬����Ϊ��λ����";
			case 404:
				message = "�û���Ϣ������";
			case 405:
				message = "��Ҫ�绰��֤";
			case 413:
				message = "�������Ѿ�ͣ��";
			case 421:
				message = "��֤ʧ��";
			case 431:
				message = "��̬�������";
			case 500:
				message = "���������������";
			case 501:
				message = "��֤����������";
			case 505:
				message = "Unknow code return,��������������ش������";
		}
		return message;
	}
	
	public String toString(){  //�����˸���Enum��toString()  
		return super.toString();
	}
	
	
}
