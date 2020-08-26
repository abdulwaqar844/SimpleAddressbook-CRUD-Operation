package vu;

import java.io.Serializable;

/**
 *
 * @author ABDUL WAQAR
 */
public class PersonInfo implements Serializable{
    private String name;
    private String address;
    private String phoneNum;

    public PersonInfo() {
        name="";
        address="";
        phoneNum="";
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String add) {
        address = add;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String pNum) {
        phoneNum = pNum;
    }
    
    
    
    
}
