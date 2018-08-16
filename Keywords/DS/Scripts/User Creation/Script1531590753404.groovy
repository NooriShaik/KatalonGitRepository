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

WebUI.navigateToUrl('http://ds-ugly-www-qa.hvcp.local/home')

WebUI.setText(findTestObject('User Creation/input_email'), 'customercare@vetjobcentral.com')

WebUI.setEncryptedText(findTestObject('User Creation/input_password'), 'sn30ZYOOq2cRLzAE8eLaQg==')

WebUI.click(findTestObject('User Creation/button_Sign me in'))

WebUI.click(findTestObject('User Creation/a_Users'))

WebUI.click(findTestObject('User Creation/a_Add New Center User'))

WebUI.setText(findTestObject('User Creation/input_firstname'), 'Alex')

WebUI.setText(findTestObject('User Creation/input_lastname'), 'rep')

WebUI.setText(findTestObject('User Creation/input_email_1'), 'alexrep@example.com')

WebUI.setText(findTestObject('User Creation/input_institution_1'), 'alexandria')

WebUI.click(findTestObject('User Creation/a_VOC 1230 - DRS - Alexandria'))

WebUI.click(findTestObject('User Creation/button_Save'))

WebUI. waitForElementNotVisible(findTestObject('User Creation/div_New User Account created s'), 10)

WebUI.click(findTestObject('User Creation/input_institution (1)'))

WebUI.setText(findTestObject('User Creation/input_institution (1)'), 'alexandria')

WebUI.click(findTestObject('User Creation/a_VOC 1230 - DRS - Alexandria'))

//WebUI.click(findTestObject('User Creation/div_alexrepexample.com'))

//WebUI.click(findTestObject('User Creation/div_AlexRepalexrep2example.com'))

WebUI.click(findTestObject('User Creation/a_Edit'))

WebUI. mouseOver(findTestObject('User Creation/button_Cancel'))

WebUI.click(findTestObject('User Creation/button_Cancel'))

WebUI. mouseOver(findTestObject('User Creation/a_Sign Out_1'))

WebUI.click(findTestObject('User Creation/a_Sign Out_1'))

//WebUI.closeBrowser()

