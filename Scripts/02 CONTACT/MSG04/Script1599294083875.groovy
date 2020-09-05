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

WebUI.callTestCase(findTestCase('001 HOME/001 HOME/HOM01'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('02 CONTACT/01 Menu Contact'))

WebUI.delay(0.5)

verif = WebUI.verifyElementText(findTestObject('02 CONTACT/02 Label Pop Up'), 'New message')

if (verif == true) {
    KeywordUtil.markPassed('Berhasil akses pop up Contact')
} else {
    KeywordUtil.markFailed('Gagal akses pop up Contact')
}

WebUI.setText(findTestObject('02 CONTACT/03 Input Email'), 'ikhszy@gmail.com')

WebUI.setText(findTestObject('02 CONTACT/04 Input Name'), 'Muhammad Ikhsan')

WebUI.setText(findTestObject('02 CONTACT/05 Input Message'), 'Need help with my recent purchase')

WebUI.click(findTestObject('02 CONTACT/08 Button CancelXMessage'), FailureHandling.STOP_ON_FAILURE)

verif2 = WebUI.verifyElementNotVisibleInViewport(findTestObject('02 CONTACT/02 Label Pop Up'), 0)

if (verif2 == true) {
    KeywordUtil.markPassed('Berhasil membatalkan contact')

    WebUI.closeBrowser()
} else {
    KeywordUtil.markFailed('Gagal membatalkan Contact')

    WebUI.closeBrowser()
}

