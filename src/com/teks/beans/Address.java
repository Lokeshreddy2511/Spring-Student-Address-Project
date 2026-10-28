
package com.teks.beans;


import org.springframework.stereotype.Component;


//Tells Spring that this class can be managed and create as a Bean
@Component
public class Address {

   
    private String houseno;

    
    private String city;

    
    private int pincode;

    
    public String getHousno() {
        return houseno;
    }

   
    public void setHousno(String houseno) {
        this.houseno = houseno;
    }

    
    public String getCity() {
        return city;
    }

    
    public void setCity(String city) {
        this.city = city;
    }

    
    public int getPincode() {
        return pincode;
    }

    
    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    // Return the address details in readable text
    @Override
    public String toString() {
        return "House No: " + houseno
                + ", City: " + city
                + ", PIN Code: " + pincode;
    }
}
