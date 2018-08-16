import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.util.concurrent.FutureTask as FutureTask
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
import com.sun.jna.platform.mac.Carbon.EventHotKeyID.ByValue as ByValue
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.By as By
import org.openqa.selenium.By.ByClassName as ByClassName
import org.openqa.selenium.By.ByCssSelector as ByCssSelector
import org.openqa.selenium.By.ByName as ByName
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.jobcentraldirect.com/home')

WebUI.setText(findTestObject('Smoke Testing/Header/input_email'), 'qacenterrep1@example.com')

WebUI.setEncryptedText(findTestObject('Smoke Testing/Header/input_password'), 'NXs/Syf14JU=')

WebUI.click(findTestObject('Smoke Testing/Header/button_Sign me in'))

WebUI.click(findTestObject('Smoke Testing/Header/a_Messages'))

WebUI.click(findTestObject('Smoke Testing/Header/span_Messages'))

WebUI.click(findTestObject('Smoke Testing/Header/button_Favorite'))

WebUI.setText(findTestObject('Smoke Testing/Header/input_searchMessages'), 'test')

WebUI.click(findTestObject('Smoke Testing/Header/i_fa fa-search'))

WebUI.click(findTestObject('Smoke Testing/Header/button_Clear All Filters'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Smoke Testing/Header/a_Center Profile'))

WebUI.waitForElementVisible(findTestObject('Smoke Testing/Header/button_Edit Snapshot'), 10)

WebUI.click(findTestObject('Smoke Testing/Header/button_Edit Snapshot'))

WebUI.setText(findTestObject('Smoke Testing/Header/textarea_snapshotDesc'), 'Prod Testing')

WebUI.click(findTestObject('Smoke Testing/Header/button_Save'))

WebUI.waitForElementNotVisible(findTestObject('Object Repository/Smoke Testing/Header/div_Snapshot has been saved.'), 10)

WebUI.click(findTestObject('Smoke Testing/Header/button_Add Event'))

WebUI.setText(findTestObject('Smoke Testing/Header/input_eventTitle'), 'Prod Event')

WebUI.setText(findTestObject('Smoke Testing/Header/input_eventUrl'), 'https://www.google.com')

WebUI.setText(findTestObject('Smoke Testing/Header/textarea_eventDesc'), 'Prod Testing')

WebUI.click(findTestObject('Smoke Testing/Header/i_glyphicon glyphicon-calendar'))

WebUI.click(findTestObject('Smoke Testing/Header/button_18'))

WebUI.click(findTestObject('Smoke Testing/Header/i_glyphicon glyphicon-calendar_1'))

TestObject newTO = findTestObject('Smoke Testing/Header/ul_previous      July 2018')

WebDriver driver = DriverFactory.getWebDriver()

calender=driver.findElement(By.className(newTO.findPropertyValue('class')))

table = calender.findElements(By.tagName('td'))

disabled_table=calender.findElements(By.tagName('span'))

current_date=calender.findElement(By.className('text-info'))

index=disabled_table.indexOf(current_date)

println(index)

count=index+5

table.get(count).click()

WebUI.click(findTestObject('Smoke Testing/Header/button_Save_1'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Smoke Testing/Header/button_Add House Rule'))

WebUI.setText(findTestObject('Smoke Testing/Header/input_houseRule'), 'Prod Rule')

WebUI.setText(findTestObject('Smoke Testing/Header/textarea_houseRuleDesc'), 'Prod Testing rules')

WebUI.click(findTestObject('Smoke Testing/Header/button_Save_rule'))

WebUI.waitForAlert(5)

WebUI.click(findTestObject('Smoke Testing/Header/a_User Account'))

WebUI.click(findTestObject('Smoke Testing/Header/a_Email  Password'))

WebUI.click(findTestObject('Smoke Testing/Header/a_Notifications'))

WebUI.waitForElementPresent(findTestObject('Smoke Testing/Header/a_Social Login'), 0)

WebUI.click(findTestObject('Smoke Testing/Header/a_Social Login'))

WebUI.click(findTestObject('Smoke Testing/Header/a_FAQs'))

WebUI.click(findTestObject('Smoke Testing/Header/a_Sign Out'))

