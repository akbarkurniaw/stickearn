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

WebUI.click(findTestObject('01 HOME/04 Button Next Banner'))

boolean verify = WebUI.verifyElementPresent(findTestObject('01 HOME/02 2nd Banner'), 0)

if (verify == true) {
    KeywordUtil.markPassed('Success sliding first image')
} else {
    KeywordUtil.markFailed('Failed sliding first image')
}

WebUI.delay(1)

WebUI.click(findTestObject('01 HOME/04 Button Next Banner'))

boolean verify2 = WebUI.verifyElementPresent(findTestObject('01 HOME/03 3rd Banner'), 0)

if (verify2 == true) {
    KeywordUtil.markPassed('Success sliding second image')
} else {
    KeywordUtil.markFailed('Failed sliding second image')
}