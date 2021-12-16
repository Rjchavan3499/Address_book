package com.addressbook;

public class AddressBook {
   
	String first_name;
	String last_name;
	String address;
	String city,state;
	int zip;
	String phone_number;
	String email;
	
	public String toString()
	{
		return "Address_Book{" +
                "first_name='" + first_name + '\n' +
                ", last_name='" + last_name + '\n' +
                ", address='" + address + '\n' +
                ", city='" + city + '\n' +
                ", zip=" + zip + '\n' +
                 ", email=" + email + '\n' +
                ", phone_number=" + phone_number + '\n' +
                '}';
    }
}
