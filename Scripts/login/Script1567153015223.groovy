import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('/Users/macbookair/git/qa_kitabisa/APK/base.apk', false)

WebUI.delay(10)

Mobile.tap(findTestObject('ObjectHome/android.widget.Button0 - MASUK'), 10, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('ObjectHome/android.widget.EditText0 - Nomor WhatsApp atau Email'), 'badedull12@gmail.com', 
    0)

Mobile.setText(findTestObject('ObjectHome/android.widget.EditText1 - Password'), '12345678', 0)

Mobile.tap(findTestObject('ObjectHome/android.widget.Button3 - MASUK-FORM-LOGIN'), 0)

