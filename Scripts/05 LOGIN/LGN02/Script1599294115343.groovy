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

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('05 LOGIN/01 Menu Login'))

WebUI.delay(1)

WebUI.setText(findTestObject('05 LOGIN/03 Input Username'), 'ikhszy')

WebUI.setText(findTestObject('05 LOGIN/04 Input Password'), 'password')

WebUI.click(findTestObject('05 LOGIN/05 Button Login'))

WebUI.delay(2)

//def verif = WebUI.verifyElementPresent(findTestObject('05 LOGIN/07 User loggedIn'))
//
//if (verif == true) {
//    KeywordUtil.markPassed('Berhasil login')
//
//    WebUI.closeBrowser()
//} else {
//    KeywordUtil.markFailed('Gagal login')
//
//    WebUI.closeBrowser()
//}

