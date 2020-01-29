package javafxmltestapp;

public class Patient {

    private String patientID, doctorID, pharmacyID, phoneNumber, dateOfBirth;
    private String firstName, lastName, addressLine1, addressLine2, city, state;
    private String country, insuranceProvider, policyNumber, notes;
    
    public Patient(){}

    /*
    public Patient(String id, String fname, String lname,
            String dob, String ad1, String ad2, String city, String state,
            String country, String poNum, String inProv, String policyNum,
            String docId, String pharmId, String notes) {
        this.patientID = id;
        this.firstName = fname;
        this.lastName = lname;
        this.dateOfBirth = dob;
        this.addressLine1 = ad1;
        this.addressLine2 = ad2;
        this.city = city;
        this.state = state;
        this.country = country;
        this.phoneNumber = poNum;
        this.insuranceProvider = inProv;
        this.policyNumber = policyNum;
        this.doctorID = docId;
        this.pharmacyID = pharmId;
        this.notes = notes;
    }
*/

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public void setDoctorID(String doctorID) {
        this.doctorID = doctorID;
    }

    public String getPharmacyID() {
        return pharmacyID;
    }

    public void setPharmacyID(String pharmacyID) {
        this.pharmacyID = pharmacyID;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getInsuranceProvider() {
        return insuranceProvider;
    }

    public void setInsuranceProvider(String insuranceProvider) {
        this.insuranceProvider = insuranceProvider;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    

}
