package StepDefinitions;

import Pages.DialogContent;
import Pages.Discounts_Content;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Us_04_Discounts_StepDefinitions {

    Discounts_Content discountsContent=new Discounts_Content();




    @When("^Discount Login click on button with button name$")
    public void discountLoginClickOnButtonWithButtonName() {
        discountsContent.findAndClickElement("setupOne");
        discountsContent.findAndClickElement("parameters");
        discountsContent.findAndClickElement("Discount");
    }

    @When("^When User Create a Discount name as \"([^\"]*)\"  name as \"([^\"]*)\" name as \"([^\"]*)\"$")
    public void whenUserCreateADiscountNameAsNameAsNameAs(String arg0, String arg1, String arg2) {
        discountsContent.findAndClickElement("addButton");

        discountsContent.findElementAndSendKeys("description", arg0);
        discountsContent.findElementAndSendKeys("integrationCode", arg1);
        discountsContent.findElementAndSendKeys("priority", arg2);
        discountsContent.findAndClickElement("saveButton");

    }

    @And("^Succes message should be displayed$")
    public void succesMessageShouldBeDisplayed() {
        discountsContent.findElementAndVerifyContainsText("message", "successfully");


    }


    @Then("^User delet the \"([^\"]*)\"$")
    public void userDeletThe(String DescriptionNameDelete) {

       discountsContent.findElementAndSendKeys("searchDiscount",DescriptionNameDelete);
        discountsContent.findAndClickElement("searchButton");

        discountsContent.editAndDeleteFunction(DescriptionNameDelete,"Delete");
        discountsContent.findAndClickElement("yesButton");

    }

    @Then("^User edit the \"([^\"]*)\" to \"([^\"]*)\"$")
    public void userEditTheTo(String searchDiscountName, String newName) {

        discountsContent.findElementAndSendKeys("searchDiscount",searchDiscountName);
        discountsContent.findAndClickElement("searchButton");

        discountsContent.editAndDeleteFunction(searchDiscountName, "edit");


        discountsContent.findElementAndSendKeys("description", newName);
        discountsContent.findAndClickElement("saveButton");

    }





    }





