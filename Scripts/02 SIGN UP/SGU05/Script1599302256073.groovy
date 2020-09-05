import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.callTestCase(findTestCase('Faker'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('02 SIGN UP/01 Menu Sign Up'))

WebUI.waitForPageLoad(2)

WebUI.setText(findTestObject('02 SIGN UP/03 Input Username'), GlobalVariable.random)

WebUI.setText(findTestObject('02 SIGN UP/04 Input Password'), 'password')

WebUI.click(findTestObject('02 SIGN UP/05 Button SignUp'))

WebUI.delay(1)

WebUI.acceptAlert()

WebUI.delay(1)

WebUI.click(findTestObject('02 SIGN UP/01 Menu Sign Up'))

WebUI.waitForPageLoad(2)

WebUI.setText(findTestObject('02 SIGN UP/03 Input Username'), GlobalVariable.random)

WebUI.setText(findTestObject('02 SIGN UP/04 Input Password'), 'password')

WebUI.click(findTestObject('02 SIGN UP/05 Button SignUp'))

WebUI.delay(1)

String alertText2 = WebUI.getAlertText()

def check2 = ['user', 'already']

boolean verif2 = check2.findAll({ 
        alertText2.contains(it)
    })

if (verif2 == true) {
    KeywordUtil.markPassed('Alert match')

    WebUI.acceptAlert()
} else {
    KeywordUtil.markFailed('Alert does not match')
}

WebUI.closeBrowser()

