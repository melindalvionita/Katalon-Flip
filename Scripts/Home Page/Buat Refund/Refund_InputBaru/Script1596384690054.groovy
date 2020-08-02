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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://flip.id/home')

WebUI.click(findTestObject('Object Repository/Home Page/Refund/a_Buat Refund'))

WebUI.click(findTestObject('Object Repository/Home Page/Refund/b_BUKTI TRANSFER'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Home Page/Refund/select_-- Pilih Alasan Refund --Transfer ku_c33942'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/Home Page/Refund/input_Rp_right-curve  form-control is-valid'), '10.000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Home Page/Refund/select_-- Pilih Bank --MandiriBRIBNI  BNI S_783f60'), 
    'bca', true)

WebUI.setText(findTestObject('Object Repository/Home Page/Refund/input_Pilih rekening tujuan_account-number-_1b9dc9'), '123456788889')

WebUI.click(findTestObject('Object Repository/Home Page/Refund/button_BUAT REFUND'))

WebUI.closeBrowser()