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

WebUI.openBrowser('https://flip.id/Home')

WebUI.click(findTestObject('Object Repository/Home Page/Kirim Uang/div_Kirim Uang'))

WebUI.click(findTestObject('Object Repository/Home Page/Kirim Uang/div_Kirim UangTanpa verifikasiSisa limit Rp500000'))

WebUI.click(findTestObject('Object Repository/Home Page/Kirim Uang/button_YAKIN'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Home Page/Kirim Uang/select_-- Pilih Bank --MandiriBRIBNI  BNI S_783f60'),
	'mandiri', true)

WebUI.click(findTestObject('Object Repository/Home Page/Kirim Uang/a_DAFTAR REKENING'))

WebUI.click(findTestObject('Object Repository/Home Page/Kirim Uang/input_CEK NAMA_transaction-input--pointer b_b6cc89'))

WebUI.click(findTestObject('Object Repository/Home Page/Kirim Uang/button_TUTUP'))

WebUI.setText(findTestObject('Object Repository/Home Page/Kirim Uang/input_Rp_amount'), '5.000')

WebUI.setText(findTestObject('Object Repository/Home Page/Kirim Uang/input_BERITA_remark'), 'Transfer')

WebUI.click(findTestObject('Object Repository/Home Page/Kirim Uang/button_OK DATA SUDAH BENAR'))

WebUI.closeBrowser()