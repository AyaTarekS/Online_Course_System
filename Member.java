package OnlineCourse;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 7ekmaz
 */
import java.util.*;
//for scanner class and exception class 

abstract public class Member {

    private String name;
    private String email;
    private int id;

    public Member() {
    } //defult constructor with no arg

    Member(String name, String email, int id) {
        this.name = name; //exc handling for no numbers and symbols
        this.email = email;
        this.id = id;  //Exception handling for any thing except the numbers

    }

    public String GetName() {
        return this.name;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public String GetEmail() {
        return this.email;
    }

    public void SetEmail(String email) {
        this.email = email;
    }

    public int GetID() {
        return this.id;
    }

    public void SetID(int id) {
        this.id = id;
    }

    Scanner input = new Scanner(System.in);

    //method for signing 
    public void signing() {
        System.out.println("Please enter your name to sign in :");
        boolean continueSigning = true;
        do {
            String name = input.next(); //the input of the name
            int nameLength = name.length(); //for the loop

            for (int i = 0; i < nameLength; i++) {
                int asciiName = (int) name.charAt(i);
                if ((asciiName >= 60 && asciiName <= 90) || (asciiName >= 97 && asciiName <= 122)) {
                    if (i == (nameLength - 1)) {
                        SetName(name);
                        continueSigning = false;
                    }
                } else {
                    System.out.println("Incorrect input : the name must be Charcters ");
                    System.out.println("Please enter the name again :");
                    input.nextLine();
                    break;
                }

            }

        } while (continueSigning);
        //for email
        System.out.println("Please enter your email:");
        String email = input.next();
        SetEmail(email);

//for the data  explicit exception handling for ID
        boolean continueInput = true;
        System.out.println("Please enter your ID :");
        do {
            try {

                int id = input.nextInt();
                SetID(id);
                continueInput = false;
            } catch (InputMismatchException ex) {
                System.out.println("Incorrect input : the code must be numbers ");
                System.out.println("Please enter the code again:");
                input.nextLine(); //to clear the buffer / the input object 
            }

        } while (continueInput);
    }

}
