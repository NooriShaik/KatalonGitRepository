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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.jobcentraldirect.com/home')

WebUI.setText(findTestObject('Smoke Testing/Main Tabs/input_email'), 'qacenterrep1@example.com')

WebUI.setEncryptedText(findTestObject('Smoke Testing/Main Tabs/input_password'), 
    'NXs/Syf14JU=')

WebUI.click(findTestObject('Smoke Testing/Main Tabs/button_Sign me in'))

WebUI.click(findTestObject('Smoke Testing/Main Tabs/a_Profile'))

WebUI.click(findTestObject('Smoke Testing/Main Tabs/a_Messages'))

WebUI.click(findTestObject('Smoke Testing/Main Tabs/a_Top Jobs'))

WebUI.click(findTestObject('Smoke Testing/Main Tabs/a_QuickStart'))

WebUI.click(findTestObject('Smoke Testing/Main Tabs/a_Discovery'))

WebUI.click(findTestObject('Smoke Testing/Main Tabs/a_Resume'))

WebUI.click(findTestObject('Smoke Testing/Main Tabs/strong_Back to Job Seekers Lis'))

WebUI.click(findTestObject('Smoke Testing/Main Tabs/a_Today'))

WebUI.click(findTestObject('Smoke Testing/Main Tabs/a_Jobs'))

WebUI.click(findTestObject('Smoke Testing/Main Tabs/a_Job Seekers'))

WebUI.click(findTestObject('Smoke Testing/Main Tabs/a_Referrals'))

WebUI.click(findTestObject('Smoke Testing/Main Tabs/a_Employers'))

WebUI.click(findTestObject('Smoke Testing/Main Tabs/a_Resources'))

WebUI.mouseOver(findTestObject('Smoke Testing/Main Tabs/a_Sign Out'))

WebUI.click(findTestObject('Smoke Testing/Main Tabs/a_Sign Out'))





