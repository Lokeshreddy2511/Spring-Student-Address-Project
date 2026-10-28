
package com.teks.beans;


import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Component;

// Tells Spring that this class can be managed and create as a Bean
@Component
public class Student {

    
    private int id;

   
    private String name;

    
    private String email;

    
    private Address address;

   
    public Student() {
        super();
        this.id = id;
		this.name = name;
		this.email = email;
    }

    
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

   
    public String getEmail() {
        return email;
    }

    // Set the student's email
    public void setEmail(String email) {
        this.email = email;
    }

    
    public Address getAddress() {
        return address;
    }
    
    public void display() {
		
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("email: "+email);
	}

    // Spring inject the Address object through this setter
    @Autowired
    public void setAddress(Address address) {
		System.out.println("address: "+address);
		
	}	
    
}
