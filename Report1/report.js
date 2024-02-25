$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/SauceDemo_AllItems.feature");
formatter.feature({
  "name": "Testing All Items Page Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Positive Testing of adding all items",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Tag1"
    }
  ]
});
formatter.step({
  "name": "Login to Sauce Demo page using \u0027\u003cusername\u003e\u0027 and \u0027\u003cpassword\u003e\u0027",
  "keyword": "Given "
});
formatter.step({
  "name": "Add all items to cart",
  "keyword": "When "
});
formatter.step({
  "name": "Provide all details and Checkout i.e. \u0027\u003cFirstname\u003e\u0027, \u0027\u003cLastname\u003e\u0027 and \u0027\u003cPostalCode\u003e\u0027",
  "keyword": "And "
});
formatter.step({
  "name": "Take the order details",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "Firstname",
        "Lastname",
        "PostalCode"
      ]
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce",
        "Subhasish",
        "Pattanayak",
        "560075"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Positive Testing of adding all items",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Login to Sauce Demo page using \u0027standard_user\u0027 and \u0027secret_sauce\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.SauceDemo_AllItems.login_to_Sauce_Demo_page(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Add all items to cart",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.SauceDemo_AllItems.add_all_items_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Provide all details and Checkout i.e. \u0027Subhasish\u0027, \u0027Pattanayak\u0027 and \u0027560075\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.SauceDemo_AllItems.provide_all_details_and_Checkout(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Take the order details",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.SauceDemo_AllItems.take_the_order_details()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing each item functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Tag2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Login to Sauce Demo page using username and password",
  "rows": [
    {}
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.SauceDemo_IndividualItems.login_to_Sauce_Demo_page(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Visit to each item page and check the functionality",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Steps.SauceDemo_IndividualItems.visit_to_each_item_page(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Log Out from the page",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.SauceDemo_IndividualItems.Log_Out_from_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});