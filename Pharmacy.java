package javafxmltestapp;

public class Pharmacy {

	private String pharmacyID;
	private String pharmacyName, pharmacyAddress, pharmPhoneNum;
	private String pharmAddressLine, pharmFaxNo, pharmNotes, headPharmacist;
	
	public Pharmacy() {}
	
	public String getPharmacyID() {
        return pharmacyID;
    }

    public void setpharmacyID(String pharmacyID) {
        this.pharmacyID = pharmacyID;
    }

    public String getPharmacyName() {
        return pharmacyName;
    }

    public void setPharmacyName(String pharmacyName) {
        this.pharmacyName = pharmacyName;
    }

    public String getPharmPhoneNum() {
        return pharmPhoneNum;
    }

    public void setPharmPhoneNum(String phone) {
        this.pharmPhoneNum = phone;
    }

    public String getPharmacyAddress() {
        return pharmacyAddress;
    }

    public void setPharmacyAddress(String address) {
        this.pharmacyAddress = address;
    }

    public String getPharmAddressLine() {
        return pharmAddressLine;
    }

    public void setPharmAddressLine(String addressLine) {
        this.pharmAddressLine = addressLine;
    }
    
    public String getHeadPharmacist() {
    	return headPharmacist;
    }
    
    public void setHeadPharmacist(String headPharm) {
    	this.headPharmacist = headPharm;
    }
    
    public String getPharmFaxNo() {
        return pharmFaxNo;
    }

    public void setPharmFaxNo(String faxNo) {
        this.pharmFaxNo = faxNo;
    }

    public String getPharmNotes() {
        return pharmNotes;
    }

    public void setPharmNotes(String notes) {
        this.pharmNotes = notes;
    }

	@Override
	public String toString() {
		return "Pharmacy [pharmacyID=" + pharmacyID + ", name=" + pharmacyName + ", address=" + pharmacyAddress + ", addressLine=" + pharmAddressLine + ", phone="
				+ pharmPhoneNum +  ", headPharmacist=" + headPharmacist  + ", faxNo=" + pharmFaxNo  + ", notes=" + pharmNotes + "]";
	}
}
