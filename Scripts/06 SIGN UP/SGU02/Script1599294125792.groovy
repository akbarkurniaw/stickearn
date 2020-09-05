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

WebUI.callTestCase(findTestCase('Faker'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('06 SIGN UP/01 Menu Sign Up'))

WebUI.waitForPageLoad(2)

WebUI.setText(findTestObject('06 SIGN UP/03 Input Username'), GlobalVariable.randomUsername)

WebUI.setText(findTestObject('06 SIGN UP/04 Input Password'), 'password')

String alertText = WebUI.getAlertText()

def check = ['Sign', 'up', 'success', 'successful', 'successfuly']

verif = check.findAll({ 
        alertText.contains(it)
    })

if (verif == true) {
    KeywordUtil.markPassed('Berhasil melakukan Sign Up')

    WebUI.acceptAlert()

    WebUI.closeBrowser()
} else {
    KeywordUtil.markFailed('Gagal melakukan Sign Up')

    WebUI.closeBrowser()
}
