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

Mobile.tap(findTestObject('Donasi/android.widget.ImageView9'), 10)

Mobile.tap(findTestObject('Donasi/android.widget.Button0 - DONASI SEKARANG'), 0)

Mobile.setText(findTestObject('Donasi/android.widget.EditText0 - Nominal'), '5000', 10)

Mobile.tap(findTestObject('Donasi/android.widget.TextView3 - PILIH'), 10)

Mobile.tap(findTestObject('Donasi/android.view.Gopay'), 10)

Mobile.setText(findTestObject('Donasi/android.widget.EditText1 - Tulis dukungan atau doa untuk penggalangan ini (opsional)'), 
    'Semoga akan menjadi lebih baik kedepannya', 0)

Mobile.tap(findTestObject('Donasi/android.widget.Button0 - LANJUT PEMBAYARAN'), 10)

Mobile.tap(findTestObject('Donasi/android.view.ViewGroup5 Pay Now'), 10)

Mobile.verifyElementText(findTestObject('Donasi/android.widget.TextView2 - Rp5.000'), '5000')

