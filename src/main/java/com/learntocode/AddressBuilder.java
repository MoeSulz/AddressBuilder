package com.learntocode;

import java.util.Scanner;

public class AddressBuilder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide the following information");
        System.out.print("Full Name: ");
        String fullName = input.nextLine();
        System.out.print("Billing Street: ");
        String address = input.nextLine();
        System.out.print("Billing City: ");
        String city = input.nextLine();
        System.out.print("Billing State: ");
        String state = input.nextLine();
        System.out.print("Billing Zip: ");
        String zip = input.nextLine();
        System.out.print("Shipping Street: ");
        String street = input.nextLine();
        System.out.print("Shipping City: ");
        String newCity = input.nextLine();
        System.out.print("Shipping State: ");
        String newState = input.nextLine();
        System.out.print("Shipping zip: ");
        String newZip = input.nextLine();

        StringBuilder shipping = new StringBuilder();
            shipping.append(fullName + "\n\n");
            shipping.append("Billing address: \n");
            shipping.append(address + "\n");
            shipping.append(city + ", ");
            shipping.append(state + " ");
            shipping.append(zip + "\n\n");
            shipping.append("Shipping Address: \n");
            shipping.append(street + "\n");
            shipping.append(newCity + ", ");
            shipping.append(newState + " ");
            shipping.append(newZip);

        System.out.println(shipping);
    }

}
