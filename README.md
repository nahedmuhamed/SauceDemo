# SauceDemo Login Validation Tests

## Overview
This project contains a suite of automated tests for validating the login functionality of the SauceDemo website using Selenium WebDriver and TestNG. The objective is to ensure that the login form behaves correctly under various scenarios.

## Test Requirements
The tests cover the following requirements:

### 1. Field Presence Verification:

- Ensure that the username input field is present with the ID user-name.
- Ensure that the password input field is present with the ID password.
- Ensure that the login button is present with the ID login-button.

### 2. Valid Credentials Check:
- Use the following valid credentials:
    - Username: standard_user
    - Password: secret_sauce
- After a successful login attempt, verify that a div containing the text "Swag Labs" is visible.

### 3. Invalid Credentials Check:
- Use invalid credentials to attempt a login.
- After an unsuccessful login attempt, verify that a div with the class error-message-container error containing the message "Epic sadface: Username and password do not match any user in this service" is visible.

### 4. Empty Credentials Check:
- Attempt to login with empty credentials.
- After the attempt, verify the following:
     - A div with the class error-message-container error containing the message "Epic sadface: Username is required" is visible.
     - A div with the class error-message-container error containing the message "Epic sadface: Password is required" is visible.

## Setup Instructions

### 1. Prerequisites
- Java JDK (version 11 or higher)
- Maven
- IntelliJ IDEA or another Java IDE
- ChromeDriver or another WebDriver compatible with your browser

### 2. Installation
1- Clone the repository:
     - git clone https://github.com/your-username/SauceDemo.git
     - cd SauceDemo

2- Open the project in your preferred IDE.

3- Make sure the required dependencies are included in your pom.xml (for Maven):

    <dependencies>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.25.0</version>
        </dependency>
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.10.2</version>
            <scope>test</scope>
        </dependency>
    </dependencies>

4- Ensure that the WebDriver is set up correctly in your environment.

## Acknowledgments
- Selenium WebDriver
- TestNG
