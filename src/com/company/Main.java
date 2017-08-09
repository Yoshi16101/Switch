package com.company;

public class Main {
// if statement
    public static void main(String[] args) {
	    int value = 3;
	    if (value == 1){
        System.out.println("Value was 1");
        }else if(value == 2){
        System.out.println("Value was 2");
        }else {
        System.out.println("Value was not one or two");
        }

//switch
        int switchValue = 1;
        switch (switchValue){
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 5: case 3: case 4:
                System.out.println("was a 3 4 or 5");
                System.out.println("actually it was a " + switchValue);
                break;
            default:
                System.out.println("was not one or 2");
                break;
        }

// char switch
        char charValue = 'F';
        switch (charValue) {
            case 'A':
                System.out.println("This is an A");
                break;
            case 'B':
                System.out.println("This is a B");
                break;
            case 'C':
                System.out.println("This is a C");
                break;
            case 'D':
                System.out.println("This is a D");
                break;
            case 'E':
                System.out.println("This is a E");
                break;
            default:
                System.out.println("Not Found");
                break;


        }
// to.LowerCase switch
        String month = "January";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not Found");
                break;

        }
    }






}
