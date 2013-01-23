package org.hb0712.noble.working.pojo;


//@DiscriminatorColumn(name = "detailType", discriminatorType = DiscriminatorType.INTEGER)
public class Detail {
	private int id;
	private String label;
	private String detailType;
	private String value;

	public enum detailType{
		Home,
		Mobile,
		Work,
		WorkFax,
		HomeFax,
		Pager,
		Other,
		Customem;
		
		public String[] nameArr = { "סլ", "�ֻ�", "��λ", "��λ����", "סլ����", "Ѱ����", "����", "�Զ���"};
		public String getName() {
			return nameArr[this.ordinal()];
		}
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}


}
