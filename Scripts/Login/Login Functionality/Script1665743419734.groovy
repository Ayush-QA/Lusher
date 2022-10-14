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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://t3.ui-uatserver.com/')

WebUI.click(findTestObject('Object Repository/Page_Lusher Signin/div_Enter Email'))

WebUI.setText(findTestObject('Object Repository/Page_Lusher Signin/input_Lusher_email'), 'aayush.qa.test+lusherapi@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Lusher Signin/input_Enter Email_password'), 'ZhqyURWHfo/1XqNB8dAphA==')

WebUI.click(findTestObject('Object Repository/Page_Lusher Signin/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Lusher Dashboard/h2_Welcome to Lusher'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Lusher Dashboard/h2_Welcome to Lusher'), 'Welcome to Lusher!')

WebUI.click(findTestObject('Object Repository/Page_Lusher Dashboard/span_person'))

WebUI.click(findTestObject('Object Repository/Page_Lusher Dashboard/button_Logout'))

WebUI.closeBrowser()

