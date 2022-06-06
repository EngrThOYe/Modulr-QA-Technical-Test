package com.secure_sandbox.modulrfinance.step_definitions;

import com.secure_sandbox.modulrfinance.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definitions extends BasePage {
    BeneficiariesPage beneficiariesPage = new BeneficiariesPage(driver);
    LogInPage logInPage = new LogInPage(driver);
    ModulrAccountPage modulrAccountPage = new ModulrAccountPage(driver);
    MoveMoneyPage moveMoneyPage = new MoveMoneyPage(driver);
    NotificationsPage notificationsPage = new NotificationsPage(driver);
    PendingPaymentsPage pendingPaymentsPage = new PendingPaymentsPage(driver);
    ReportsPage reportsPage = new ReportsPage(driver);
    ResetaccessPage resetaccessPage = new ResetaccessPage(driver);
    UsersPage usersPage =new UsersPage(driver);

    @Given("I navigate to modulrfinance log in page")
    public void i_navigate_to_modulrfinance_log_in_page() {
        NavigateToLogInPage();

    }

    @When("I click username textbox")
    public void i_click_username_textbox() {
        logInPage.clickUsername();

    }

    @When("I enter username as {string}")
    public void i_enter_username_as(String Username) {
        logInPage.enterUsername(Username);

    }

    @When("I click password textbox")
    public void i_click_password_textbox() {
        logInPage.clickPassword();

    }

    @When("I enter password as {string}")
    public void i_enter_password_as(String Password) {
        logInPage.enterPassword(Password);

    }

    @When("I click on Sign in button")
    public void i_click_on_sign_in_button() {
        modulrAccountPage = logInPage.clickSignIn();

    }


    @Then("I am logged into my account details page")
    public void i_am_logged_into_my_account_details_page() {
        modulrAccountPage.assertModulrAccountPage();

    }
    
    @Then("A pop up error and warning message {string} is displayed")
    public void aPopUpErrorAndWarningMessageIsDisplayed(String arg0) {
        logInPage.assertErrorWarningMessage();
    }

    @Then("A pop up error message {string} is displayed")
    public void aPopUpErrorMessageIsDisplayed(String arg0) {
        logInPage.assertFieldRequiredMessage();
    }

    @When("I click Forgotten Password button")
    public void iClickForgottenPasswordButton() {
        resetaccessPage = logInPage.clickForgottenPassword();
    }

    @And("Resetaccess page is displayed")
    public void resetaccessPageIsDisplayed() {
        resetaccessPage.assertResetaccessPage();

    }

    @And("I click username \\(recovery) textbox")
    public void iClickUsernameRecoveryTextbox() {
        resetaccessPage.clickUsername();

    }

    @And("I enter valid username \\(recovery) as {string}")
    public void iEnterValidUsernameRecoveryAs(String Username) {
        resetaccessPage.enterUsername(Username);

    }

    @And("I click on Request a reset button")
    public void iClickOnRequestAResetButton() {
        resetaccessPage.clickRequestAReset();

    }

    @Then("A pop up message {string} is displayed")
    public void aPopUpMessageIsDisplayed(String arg0) {
        resetaccessPage.assertEmailSent();
    }

    @Given("I am logged into Modulr accounts with username as {string} and password as {string}")
    public void iAmLoggedIntoModulrAccountsWithUsernameAsAndPasswordAs(String Username, String Password) {
        NavigateToLogInPage();
        logInPage.clickUsername();
        logInPage.enterUsername(Username);
        logInPage.clickPassword();
        logInPage.enterPassword(Password);
        logInPage.clickSignIn();
    }

    @When("Accounts page is displayed")
    public void accounts_page_is_displayed() {
        modulrAccountPage.assertModulrAccountPage();

    }

    @When("I click on Move Money tab")
    public void i_click_on_move_money_tab() {
        moveMoneyPage = modulrAccountPage.clickOnMoveMoney();

    }

    @When("Move Money page is displayed")
    public void move_money_page_is_displayed() {
        moveMoneyPage.assertMoveMoneyPage();

    }

    @When("I click on Pending payments tab")
    public void i_click_on_pending_payments_tab() {
        pendingPaymentsPage = moveMoneyPage.clickOnPendingPayments();

    }

    @When("Pending payments page is displayed")
    public void pending_payments_page_is_displayed() {
        pendingPaymentsPage.assertPendingPaymentsPage();

    }

    @When("I click on Beneficiaries tab")
    public void i_click_on_beneficiaries_tab() {
        beneficiariesPage = pendingPaymentsPage.clickOnBeneficiaries();

    }

    @When("Beneficiaries page is displayed")
    public void beneficiaries_page_is_displayed() {
        beneficiariesPage.assertBeneficiariesPage();

    }

    @When("I click on Reports tab")
    public void i_click_on_reports_tab() {
        reportsPage = beneficiariesPage.clickOnReport();

    }

    @When("Reports page is displayed")
    public void reports_page_is_displayed() {
        reportsPage.assertReportPage();

    }

    @When("I click on Users tab")
    public void i_click_on_users_tab() {
        usersPage = reportsPage.clickOnUsers();

    }

    @When("Users page is displayed")
    public void users_page_is_displayed() {
        usersPage.assertUsersPage();
        

    }

    @When("I click on Notifications tab")
    public void i_click_on_notifications_tab() {
        notificationsPage = usersPage.clickOnNotifications();

    }

    @Then("Notifications page is displayed")
    public void notifications_page_is_displayed() {
        notificationsPage.assertNotificationsPage();

    }


}
