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

WebUI.click(findTestObject('05 CONTACT/01 Menu Contact'))

WebUI.delay(1)

boolean verif = WebUI.verifyElementText(findTestObject('05 CONTACT/02 Label Pop Up'), 'New message')

if (verif == true) {
    KeywordUtil.markPassed('Success show pop up Contact')
} else {
    KeywordUtil.markFailed('Failed show pop up Contact')
}

WebUI.setText(findTestObject('05 CONTACT/03 Input Email'), 'akbarkurn@gmail.com')

WebUI.setText(findTestObject('05 CONTACT/04 Input Name'), 'Akbar Kurnia W')

WebUI.setText(findTestObject('05 CONTACT/05 Input Message'), 'Please help me to buy this item')

WebUI.click(findTestObject('05 CONTACT/07 Button CancelMessage'), FailureHandling.STOP_ON_FAILURE)

boolean verif2 = WebUI.verifyElementNotVisibleInViewport(findTestObject('05 CONTACT/02 Label Pop Up'), 0)

if (verif2 == true) {
    KeywordUtil.markPassed('Success cancel contact')
} else {
    KeywordUtil.markFailed('Failed cancel Contact')
}