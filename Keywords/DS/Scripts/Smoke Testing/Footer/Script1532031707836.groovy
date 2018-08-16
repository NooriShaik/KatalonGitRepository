import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.internal.WebUIKeywordMain as WebUIKeywordMain
import footer.footerKeyword as footerKeyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.jobcentraldirect.com/home')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Smoke Testing/Footer/input_email'), 'qacenterrep1@example.com')

WebUI.setEncryptedText(findTestObject('Smoke Testing/Footer/input_password'), 'NXs/Syf14JU=')

WebUI.click(findTestObject('Smoke Testing/Footer/button_Sign me in'))

CustomKeywords.'footer.footerKeyword.clickUsingJS'(findTestObject('Smoke Testing/Footer/a_Today'), 10)

CustomKeywords.'footer.footerKeyword.clickUsingJS'(findTestObject('Smoke Testing/Footer/a_Jobs'), 10)

WebUI.waitForAngularLoad(10)

CustomKeywords.'footer.footerKeyword.clickUsingJS'(findTestObject('Smoke Testing/Footer/a_Job Seekers'), 10)

WebUI.waitForAngularLoad(10)

CustomKeywords.'footer.footerKeyword.clickUsingJS'(findTestObject('Smoke Testing/Footer/a_Referrals'), 10)

CustomKeywords.'footer.footerKeyword.clickUsingJS'(findTestObject('Smoke Testing/Footer/a_Employers'), 10)

CustomKeywords.'footer.footerKeyword.clickUsingJS'(findTestObject('Smoke Testing/Footer/a_Resources'), 10)

CustomKeywords.'footer.footerKeyword.clickUsingJS'(findTestObject('Smoke Testing/Footer/a_Messages'), 10)

WebUI.waitForAngularLoad(10)

CustomKeywords.'footer.footerKeyword.clickUsingJS'(findTestObject('Smoke Testing/Footer/a_Center Profile'), 10)

WebUI.waitForAngularLoad(10)

CustomKeywords.'footer.footerKeyword.clickUsingJS'(findTestObject('Smoke Testing/Footer/a_Account'), 10)

WebUI.waitForAngularLoad(10)

CustomKeywords.'footer.footerKeyword.clickUsingJS'(findTestObject('Smoke Testing/Footer/a_FAQs'), 10)

CustomKeywords.'footer.footerKeyword.clickUsingJS'(findTestObject('Smoke Testing/Footer/a_Customer Care'), 30)

WebUI.waitForAngularLoad(10)

CustomKeywords.'footer.footerKeyword.clickUsingJS'(findTestObject('Smoke Testing/Footer/a_About'), 10)

CustomKeywords.'footer.footerKeyword.clickUsingJS'(findTestObject('Smoke Testing/Footer/a_Contact Us'), 10)

CustomKeywords.'footer.footerKeyword.clickUsingJS'(findTestObject('Smoke Testing/Footer/a_Policies'), 10)

CustomKeywords.'footer.footerKeyword.clickUsingJS'(findTestObject('Smoke Testing/Footer/a_Sign Out'), 10)

