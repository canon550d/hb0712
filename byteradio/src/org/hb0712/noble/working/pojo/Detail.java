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
		
		public String[] nameArr = { "住宅", "手机", "单位", "单位传真", "住宅传真", "寻呼机", "其他", "自定义"};
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
