<<<<<<< HEAD
# Registration-Test
Simple user registration automation test using Selenium, TestNG, and POM design pattern.
=======
# Final Selenium Task: Automated Registration Test

## Project Description
This project is part of the final assignment in the **Selenium module** of the **QA Complete course** offered by **Pragmatic Academy**. It demonstrates the implementation of an automated positive test scenario using **Selenium WebDriver**, **TestNG**, and the **Page Object Model (POM)** design pattern.

## Test Scenario
The goal of this project is to automate the following positive test scenario:

1. Navigate to [Pragmatic Shop](https://auto.pragmatic.bg/).
2. Click on the “My Account” link located at the top of the page.
3. Select the “Register” option.
4. Register a new user by:
    - Filling in all mandatory fields.
    - Selecting the required checkboxes.
    - Clicking the “Continue” button.
5. Confirm the successful registration of the new user.

## Tools and Frameworks Used
- **Programming Language**: Java
- **Build Tool**: Maven
- **Testing Framework**: TestNG
- **Browser Automation**: Selenium WebDriver

## Project Structure
- **BasePage**: Contains reusable methods for common WebDriver actions, such as waiting for elements, clicking, and typing text.
- **MainPage**: Represents the main page of the application and includes methods for navigating to the registration page.
- **RegistrationPage**: Handles the registration process, including filling in the form, selecting checkboxes, and submitting the form.
- **AccountConfirmationPage**: Validates the visibility of the confirmation message after a successful registration.
- **BaseTest**: Initializes the WebDriver and manages browser settings.
- **RegistrationAsUserTest**: Contains the automated test scenario described above.

## Key Features
- **Modular Code**: The project uses the POM design pattern to separate test logic from page-specific functionality.
- **Dynamic Waits**: Incorporates explicit waits to handle dynamic web elements efficiently.
- **JavaScript Executor**: Utilizes JavaScript to handle specific actions, such as clicking elements.
- **TestNG Assertions**: Verifies the test outcome with assertions to ensure reliability.

## How to Run the Project
1. Clone this repository.
2. Ensure you have **Java** and **Maven** installed.
3. Update the Maven dependencies using:
   ```
   mvn clean install
   ```
4. Execute the test using the following command:
   ```
   mvn test
   ```

## Additional Notes
This project highlights the skills acquired during the **QA Complete course** and serves as a practical demonstration of automated testing techniques. It combines best practices in test automation, ensuring maintainable and reliable test scripts.

## Acknowledgments
Special thanks to **Pragmatic Academy** for providing a comprehensive and practical curriculum that helped in developing this project.

