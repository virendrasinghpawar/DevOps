package bean;

public class Records {
	private int recordId;
	private String uniqueId;
	private String name;
	private String contactNumber;
	private Address address;
	private RecordDetails details;
	public Records() {
		super();
	}
	public Records(String uniqueId, String name, String contactNumber,
			Address address) {
		super();
		this.uniqueId = uniqueId;
		this.name = name;
		this.contactNumber = contactNumber;
		this.address = address;
	}
	public Records(String uniqueId, String name, String contactNumber,
			Address address, RecordDetails details) {
		super();
		this.uniqueId = uniqueId;
		this.name = name;
		this.contactNumber = contactNumber;
		this.address = address;
		this.details = details;
	}
	public int getRecordId() {
		return recordId;
	}
	public void setRecordId(int recordId) {
		this.recordId = recordId;
	}
	public String getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public RecordDetails getDetails() {
		return details;
	}
	public void setDetails(RecordDetails details) {
		this.details = details;
	}
	
	
	
}
