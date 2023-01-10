$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/manual_project.feature");
formatter.feature({
  "name": "As a User, I want to Order the Oil",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "The user downloads the Brochure",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To lanch the URL of the application",
  "keyword": "When "
});
formatter.match({
  "location": "part_1.to_lanch_the_URL_of_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the “About Us” button",
  "keyword": "And "
});
formatter.match({
  "location": "part_1.click_the_About_Us_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "scroll down and see the Download Brochure (English)",
  "keyword": "And "
});
formatter.match({
  "location": "part_1.scroll_down_and_see_the_Download_Brochure_English()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check the Brochure is downloaded",
  "keyword": "Then "
});
formatter.match({
  "location": "part_1.check_the_Brochure_is_downloaded()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The user purchases the “Harmony”",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "click the “Products” button",
  "keyword": "When "
});
formatter.match({
  "location": "part_2.click_the_Products_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "mouse hover the “Products” button again hovers the “Aroma Oil”",
  "keyword": "And "
});
formatter.match({
  "location": "part_2.mouse_hover_the_Products_button_again_hovers_the_Aroma_Oil()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select the “Sweet”",
  "keyword": "And "
});
formatter.match({
  "location": "part_2.select_the_Sweet()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Users can see the “Harmony” and choose the oil",
  "keyword": "And "
});
formatter.match({
  "location": "part_2.users_can_see_the_Harmony_and_choose_the_oil()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select the volume ml and add quality",
  "keyword": "And "
});
formatter.match({
  "location": "part_2.select_the_volume_ml_and_add_quality()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Then click “Add To Cart”",
  "keyword": "And "
});
formatter.match({
  "location": "part_2.then_click_Add_To_Cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the “Process To Checkout”",
  "keyword": "Then "
});
formatter.match({
  "location": "part_2.click_the_Process_To_Checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The user checks the missing product",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "click the “Products” button.",
  "keyword": "When "
});
formatter.match({
  "location": "part_3.click_the_Products_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "mouse hover the “Products” button and clicks the Car Diffusers",
  "keyword": "Then "
});
formatter.match({
  "location": "part_3.mouse_hover_the_Products_button_and_clicks_the_Car_Diffusers()"
});
formatter.result({
  "status": "passed"
});
});