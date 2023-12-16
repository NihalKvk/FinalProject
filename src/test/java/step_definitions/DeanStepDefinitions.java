package step_definitions;

import Utilities.ConfigurationReader;
import Utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import locators.DeanLocators;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DeanStepDefinitions {
    public static final DeanLocators deanLocotar = new DeanLocators();
    Faker faker = new Faker();

    @Given("the user goes to managementonschools page")
    public void theUserGoesToManagementonschoolsPage() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @And("the user click on login")
    public void theUserClickOnLogin() {
        deanLocotar.mainLogin.click();
    }

    @And("the user enter user name and password")
    public void theUserEnterUserNameAndPassword() {

        deanLocotar.mainLoginUsername.sendKeys(ConfigurationReader.get("admin_username"));
        deanLocotar.mainLoginPassword.sendKeys(ConfigurationReader.get("admin_password"));
        deanLocotar.userLogin.click();
    }

    @Given("the admin user goes to menu")
    public void theAdminUserGoesToMenu() {
        deanLocotar.mainMenu.click();
        
    }

    @And("the admin user clicks to {string}")
    public void theAdminUserClicksTo(String arg0) {
        deanLocotar.mainMenuDeanManagement.click();
        
    }

    @When("the admin user enters new dean credentials")
    public void theAdminUserEntersNewDeanCredentials() {
        deanLocotar.deanManagementAddName.sendKeys(faker.name().firstName());
        deanLocotar.deanManagementAddSurname.sendKeys(faker.name().lastName());
        deanLocotar.deanManagementAddBirthPlace.sendKeys(faker.address().city());
        deanLocotar.deanManagementAddPhone.sendKeys(faker.number().numberBetween(100,999) +
                "-" + faker.number().numberBetween(100,999) + "-" + faker.number().numberBetween(1000,9999));
        deanLocotar.deanManagementAddSsn.sendKeys(faker.number().numberBetween(100,999) +
                "-" + faker.number().numberBetween(10,99) + "-" + faker.number().numberBetween(1000,9999));
        Date birthday = faker.date().birthday();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String formattedBirthday = dateFormat.format(birthday);
        deanLocotar.deanManagementAddBirthDay.sendKeys(formattedBirthday);
        deanLocotar.genderFemale.click();
        deanLocotar.deanManagementAddUsername.sendKeys(faker.name().username());
        deanLocotar.deanManagementAddPassword.sendKeys( (faker.name().firstName()).toLowerCase(Locale.ROOT).concat(faker.number().digit()).concat(faker.name().lastName().toUpperCase(Locale.ROOT)));
    }

    @And("the admin user clicks submit button")
    public void theAdminUserClicksSubmitButton() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        deanLocotar.addDeanSubmitButton.click();
        
    }

    @Then("the new dean created successfully")
    public void theNewDeanCreatedSuccessfully() {
    }
}
