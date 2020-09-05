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

WebUI.callTestCase(findTestCase('06 CART/CART00'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('06 CART/03 Button PlaceOrder'))

WebUI.waitForPageLoad(0)

boolean verif1 = WebUI.verifyElementVisible(findTestObject('06 CART/04 Label Form PlaceOrder'))

if (verif1 == true) {
    KeywordUtil.markPassed('Success open PlaceOrder form')
} else {
    KeywordUtil.markFailed('Failed open PlaceOrder form')
}

WebUI.setText(findTestObject('06 CART/05 Input Name'), 'Akbar Kurnia W')

WebUI.setText(findTestObject('06 CART/06 Input Country'), 'Indonesia')

WebUI.setText(findTestObject('06 CART/07 Input City'), 'Bogor')

WebUI.setText(findTestObject('06 CART/08 Input CreditCard'), 'XXXX-XXXX-XXXX-XXXX')

WebUI.setText(findTestObject('06 CART/09 Input Month'), '07')

WebUI.setText(findTestObject('06 CART/10 Input Year'), '20')

WebUI.click(findTestObject('06 CART/12 Button Purchase'))

WebUI.delay(1)

boolean verif2 = WebUI.verifyTextPresent('Akbar Kurnia W', false)

boolean verif3 = WebUI.verifyTextPresent('XXXX-XXXX-XXXX-XXXX', false)

if (verif2 && (verif3 == true)) {
    KeywordUtil.markPassed('Alert and Text OK')
} else {
    KeywordUtil.markFailed('Alert not OK')
}

WebUI.click(findTestObject('06 CART/17 Button OK'))

