import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.delay(1)

WebUI.click(findTestObject('01 HOME/11 Category Phones'))

WebUI.delay(2)

WebUI.click(findTestObject('01 HOME/15 1st Category Item'))

WebUI.delay(1)

WebUI.click(findTestObject('01 HOME/19 Button AddToCart'))

boolean verif1 = WebUI.verifyAlertPresent(0)

if (verif1 == true) {
    KeywordUtil.markPassed('Success add Item to Cart')
} else {
    KeywordUtil.markFailed('Failed add Item')
}

WebUI.click(findTestObject('06 CART/01 Menu Cart'))

WebUI.delay(3)

boolean verif2 = WebUI.verifyTextPresent('Samsung galaxy s6', false)

if (verif2 == true) {
    KeywordUtil.markPassed('Item appear on cart')
} else {
    KeywordUtil.markFailed('Item does not appear on cart')
}