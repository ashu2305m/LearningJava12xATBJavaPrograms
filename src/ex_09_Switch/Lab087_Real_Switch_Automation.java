package ex_09_Switch;

import java.util.Scanner;

public class Lab087_Real_Switch_Automation {

    // Web Automation
    // I will ask the user to give me the input from browser which he wants to
    // use to I will start the automation in that browser.

    public static void main(String[] args) {
        // String browser  = args[0];   when taking input using CLI

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();
        browser = browser.toLowerCase(); // lower(Chrome, CHROME, CHrome) == chrome
        // converting browser to lower case to make sure even if we enter in capitals, our code runs

        switch (browser) {
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                // Further code to start the Firefox
                // Webdriver driver = new Firfox(); // Selenium Code
                break;
            case "edge":
                System.out.println("Execute the Edge Code");
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;


        }



    }
}
