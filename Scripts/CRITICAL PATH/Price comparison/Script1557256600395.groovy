import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.sakara.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('SAKARA/Page_100 plant-based organic ready-/div_Create an account_privy-di'))

WebUI.click(findTestObject('SAKARA/Page_100 plant-based organic ready-/a_Next Weeks Menu'))

WebUI.click(findTestObject('SAKARA/Page_Next weeks menu  Sakara Life/a_Order Now'))

WebUI.setText(findTestObject('SAKARA/Page_OMD Order  Sakara Life/input'), '07057')

WebUI.click(findTestObject('SAKARA/Page_OMD Order  Sakara Life/span_Program Length_o-radio__c'))

WebUI.click(findTestObject('SAKARA/Page_OMD Order  Sakara Life/span_Weekly Subscription_o-rad'))

WebUI.selectOptionByValue(findTestObject('SAKARA/Page_OMD Order  Sakara Life/select_Monday May 13thMonday M'), 'Mon May 20 2019 00:00:00 GMT-0400', 
    true)

WebUI.click(findTestObject('SAKARA/Page_OMD Order  Sakara Life/button_Add to cart'))

WebUI.click(findTestObject('SAKARA/Page_OMD Order  Sakara Life/span_Daily Probiotics_o-radio_'))

WebUI.click(findTestObject('SAKARA/Page_OMD Order  Sakara Life/span_Beauty Chocolates_o-radio'))

WebUI.click(findTestObject('SAKARA/Page_OMD Order  Sakara Life/span_Program Supplement_o-radi'))

WebUI.click(findTestObject('Object Repository/SAKARA/Page_OMD Order  Sakara Life/span_Terms  Conditions_o-icon'))

WebUI.click(findTestObject('Object Repository/SAKARA/Page_OMD Order  Sakara Life/a_Shop Clean Boutique'))

WebUI.click(findTestObject('Object Repository/SAKARA/Page_Clean Boutique  Sakara Life/span_Snacks'))

WebUI.click(findTestObject('SAKARA/Page_Clean Boutique  Sakara Life/img_Add to cart_c-product-tile'))

WebUI.click(findTestObject('Object Repository/SAKARA/Page_The Sakara Granola Collection/button_48  Add to cart'))

String a = WebUI.getText(findTestObject('Object Repository/SAKARA/Page_The Sakara Granola Collection/div_48'))

WebUI.comment('a=' + a)

b = WebUI.getText(findTestObject('Object Repository/SAKARA/Page_The Sakara Granola Collection/div_239'))

WebUI.comment('b=' + b)

not_run: WebUI.click(findTestObject('Object Repository/SAKARA/Page_The Sakara Granola Collection/div_3-Day Organic Meal Deliver'))

not_run: WebUI.click(findTestObject('SAKARA/Page_The Sakara Granola Collection/div_The Granola Collection 48'))

String total = WebUI.getText(findTestObject('Object Repository/SAKARA/Page_The Sakara Granola Collection/span_287'))

WebUI.comment('total=' + total)

//  remove the dollar sign
String p1 = a.substring(1)

WebUI.comment('p1=' + p1)

String p2 = b.substring(1)

WebUI.comment('p2=' + p2)

String total1 = total.substring(1)

WebUI.comment('total1=' + total1)

// code to change from string to int 
double prod1

double prod2

double finalamount

try {
    String p11 = p1

    WebUI.comment('p11=' + p11)

    prod1 = Double.valueOf(p11)

    WebUI.comment('prod1=' + prod1)
}
catch (NumberFormatException ex) {
} 

try {
    String p22 = p2

    WebUI.comment('p22=' + p22)

    prod2 = Double.valueOf(p22)

    WebUI.comment('prod2=' + prod2)
}
catch (NumberFormatException ex) {
} 

try {
    String p23 = total1

    WebUI.comment('p23=' + p23)

    finalamount = Double.valueOf(p23)

    WebUI.comment('finalamount=' + finalamount)
}
catch (NumberFormatException ex) {
} 

int sum = prod1 + prod2

WebUI.comment('sum=' + sum)

boolean flag = WebUI.verifyEqual(sum, finalamount)

WebUI.comment('flag=' + flag)

if (flag == true) {
    WebUI.comment('sum of th e products equal to the cart')
} else {
    WebUI.comment('sum of th e products is not equal to the cart')
}

WebUI.click(findTestObject('SAKARA/Page_OMD Order  Sakara Life/a_checkout 255'))

WebUI.setText(findTestObject('SAKARA/Page_OMD Order  Sakara Life/input_Sign in to continue_cust'), 'suman.kompelly@diffagency.com')

WebUI.setEncryptedText(findTestObject('SAKARA/Page_OMD Order  Sakara Life/input_Sign in to continue_cust_1'), 'ku0iAkODgX0=')

WebUI.setEncryptedText(findTestObject('SAKARA/Page_OMD Order  Sakara Life/input_Sign in to continue_cust_2'), '+YAmoKIyHZA=')

WebUI.setEncryptedText(findTestObject('SAKARA/Page_OMD Order  Sakara Life/input_Sign in to continue_cust_3'), 'Y4IGv/qOF9E=')

WebUI.setEncryptedText(findTestObject('SAKARA/Page_OMD Order  Sakara Life/input_Sign in to continue_cust_4'), 'Z+t+WaCK0tE=')

WebUI.setEncryptedText(findTestObject('SAKARA/Page_OMD Order  Sakara Life/input_Sign in to continue_cust_5'), 'VHIhYbO/Pz0=')

WebUI.setEncryptedText(findTestObject('SAKARA/Page_OMD Order  Sakara Life/input_Sign in to continue_cust_6'), 'Owe2tHMEmLw=')

WebUI.setEncryptedText(findTestObject('SAKARA/Page_OMD Order  Sakara Life/input_Sign in to continue_cust_7'), 'CzGugaxDM48=')

WebUI.setEncryptedText(findTestObject('SAKARA/Page_OMD Order  Sakara Life/input_Sign in to continue_cust_8'), 'YVtWHtdGuqHezI4GDEXwSQ==')

WebUI.setEncryptedText(findTestObject('SAKARA/Page_OMD Order  Sakara Life/input_Sign in to continue_cust_9'), 'YVtWHtdGuqG0avsQGIiYAQ==')

WebUI.setEncryptedText(findTestObject('SAKARA/Page_OMD Order  Sakara Life/input_Sign in to continue_cust_10'), 'YVtWHtdGuqHfOZKsa+65Fg==')

WebUI.setEncryptedText(findTestObject('SAKARA/Page_OMD Order  Sakara Life/input_Sign in to continue_cust_11'), 'YVtWHtdGuqHfOZKsa+65Fg==')

WebUI.click(findTestObject('SAKARA/Page_OMD Order  Sakara Life/button_Continue Checkout'))

WebUI.setText(findTestObject('SAKARA/Page_Sakara Life - Information - Sa/input_First name_checkoutshipp'), 'suman')

WebUI.setText(findTestObject('SAKARA/Page_Sakara Life - Information - Sa/input_Last name_checkoutshippi'), 'kompelly')

WebUI.setText(findTestObject('SAKARA/Page_Sakara Life - Information - Sa/input_Company (optional)_check'), 'diff')

WebUI.setText(findTestObject('SAKARA/Page_Sakara Life - Information - Sa/input_Address_checkoutshipping'), '399 saint alxendre')

WebUI.setText(findTestObject('SAKARA/Page_Sakara Life - Information - Sa/input_Apartment suite etc. (op'), '199')

WebUI.setText(findTestObject('SAKARA/Page_Sakara Life - Information - Sa/input_City_checkoutshipping_ad'), 'montreal')

WebUI.selectOptionByValue(findTestObject('SAKARA/Page_Sakara Life - Information - Sa/select_StateAlabamaAlaskaAmeri'), 'NJ', 
    true)

WebUI.setText(findTestObject('SAKARA/Page_Sakara Life - Information - Sa/input_ZIP code_checkoutshippin'), '07057')

WebUI.setText(findTestObject('SAKARA/Page_Sakara Life - Information - Sa/input_Phone_checkoutshipping_a'), '(514) 449-3882')

WebUI.click(findTestObject('SAKARA/Page_Sakara Life - Information - Sa/button_Continue to shipping me'))

WebUI.setText(findTestObject('SAKARA/Page_Sakara Life - Shipping - Sakar/input_Gift card or discount co'), 'difftest3')

WebUI.click(findTestObject('SAKARA/Page_Sakara Life - Shipping - Sakar/button_Apply'))

WebUI.click(findTestObject('SAKARA/Page_Sakara Life - Shipping - Sakar/input_Choose a shipping method'))

WebUI.delay(2)

WebUI.click(findTestObject('SAKARA/Page_Sakara Life - Shipping - Sakar/button_Continue to payment met'))

not_run: WebUI.click(findTestObject('Page_Sakara Life - Payment - Sakara/button_Complete order'))

WebUI.comment(' Test case passed ')

