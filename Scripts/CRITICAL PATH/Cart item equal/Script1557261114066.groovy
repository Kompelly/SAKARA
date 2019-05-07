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

WebUI.click(findTestObject('SAKARA/Page_OMD Order  Sakara Life/a_Shop Clean Boutique'))

WebUI.click(findTestObject('SAKARA/Page_Clean Boutique  Sakara Life/span_Snacks'))

WebUI.click(findTestObject('SAKARA/Page_Clean Boutique  Sakara Life/img_Add to cart_c-product-tile (1)'))

WebUI.click(findTestObject('SAKARA/Page_The Sakara Granola Collection/button_48  Add to cart'))

WebUI.click(findTestObject('SAKARA/Page_OMD Order  Sakara Life/span_Terms  Conditions_o-icon'))

WebUI.delay(1)

WebUI.click(findTestObject('SAKARA/Page_OMD Order  Sakara Life/a_Shop Clean Boutique'))

WebUI.click(findTestObject('SAKARA/Page_Clean Boutique  Sakara Life/span_Supplements'))

WebUI.click(findTestObject('Object Repository/SAKARA/Page_Clean Boutique  Sakara Life/img_Add to cart_c-product-tile_1'))

WebUI.click(findTestObject('Object Repository/SAKARA/Page_Sakara Energy Bars  Sakara Lif/button_29  Add to cart'))

String a = WebUI.getText(findTestObject('Object Repository/SAKARA/Page_Sakara Energy Bars  Sakara Lif/div_45_o-quantity'))

WebUI.comment("a=" +a)

WebUI.click(findTestObject('Object Repository/SAKARA/Page_The Sakara Granola Collection/div_48_o-quantity'))

not_run: WebUI.click(findTestObject('SAKARA/Page_The Sakara Granola Collection/div_The Granola Collection 48'))

not_run: WebUI.click(findTestObject('SAKARA/Page_The Sakara Granola Collection/div_Sign in_c-menu__cart js-ca'))

not_run: WebUI.click(findTestObject('Page_The Sakara Granola Collection /div_See next weeks menu and or'))

WebUI.click(findTestObject('SAKARA/Page_The Sakara Granola Collection/a_checkout 397'))

not_run: WebUI.click(findTestObject('Page_The Sakara Granola Collection /a'))

not_run: WebUI.click(findTestObject('Object Repository/SAKARA/Page_Clean Boutique  Sakara Life/h2_Energy Bars'))

not_run: WebUI.click(findTestObject('Object Repository/SAKARA/Page_Sakara Energy Bars  Sakara Lif/form_1 6-pack3 6-packsEnergy B'))

not_run: WebUI.click(findTestObject('Object Repository/SAKARA/Page_Sakara Energy Bars  Sakara Lif/div_Remove'))

not_run: WebUI.click(findTestObject('Object Repository/SAKARA/Page_Sakara Energy Bars  Sakara Lif/button_29_o-quantity__dec'))

not_run: WebUI.click(findTestObject('Object Repository/SAKARA/Page_Sakara Energy Bars  Sakara Lif/button_45_o-quantity__inc'))

not_run: WebUI.click(findTestObject('Object Repository/SAKARA/Page_Sakara Energy Bars  Sakara Lif/div_See next weeks menu and or'))

not_run: WebUI.click(findTestObject('Object Repository/SAKARA/Page_Sakara Energy Bars  Sakara Lif/button_45_o-quantity__inc'))

not_run: WebUI.click(findTestObject('Object Repository/SAKARA/Page_Sakara Energy Bars  Sakara Lif/div_Life Source Super Powder 4'))

