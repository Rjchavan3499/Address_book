package com.addressbook;

import java.util.List;
import java.util.Scanner;

public class Interface {
	

    public int ShowMainMenu() {
        System.out.println("Welcome to Address Book ");
        System.out.println("1.Add number \n2.Update number \n3.Delete number" +
                "");


        Scanner scanner = new Scanner(System.in);

        System.out.println("Select Your Option :");
        int option = scanner.nextInt();

        return option;
    }

    public void printAllAddressr(List AddressList) {
        for (int i = 0; i < AddressList.size(); i++) {
            System.out.println(AddressList.get(i));
        }
    }

}
