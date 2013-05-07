package org.hb0712.tools.path.impl;

public enum EkeyCheckResult {
	R200,
	R400;

	private String showname (int i){
		switch(i){
			case 200:
				return "��֤�ɹ�";
			case 400:
				return "���ʺ�û�а󶨽�����";
			case 401:
				return "��Ч���û����ϵͳ����";
			case 402:
				return "�û�����Ч,Ŀǰ��֤����2-26λ������/��ĸ����.-_��ɵ��ַ���";
			case 403:
				return "��̬������Ч,��̬����Ϊ��λ����";
			case 404:
				return "�û���Ϣ������";
			case 405:
				return "��Ҫ�绰��֤";
			case 413:
				return "�������Ѿ�ͣ��";
			case 421:
				return "��֤ʧ��";
			case 431:
				return "��̬�������";
			case 500:
				return "���������������";
			case 501:
				return "��֤����������";
			case 505:
				return "Unknow code return,��������������ش������";
		}
		return null;
	}
	
	public String toString(){  //�����˸���Enum��toString()  
		
		return showname(200);
	}  
}
