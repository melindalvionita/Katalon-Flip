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

WebUI.click(findTestObject('Object Repository/Home Page/Ubah_Email/div_STATUS EMAIL Belum terverifikasi'))

WebUI.click(findTestObject('Object Repository/Home Page/Ubah_Email/input_Email berhasil dikirim ulang_email'))

WebUI.click(findTestObject('Object Repository/Home Page/Ubah_Email/span_Ubah'))

WebUI.setText(findTestObject('Object Repository/Home Page/Ubah_Email/input_Email berhasil dikirim ulang_email'), 'melindalvionita16@gmail.com')

WebUI.click(findTestObject('Object Repository/Home Page/Ubah_Email/span_Kirim Ulang'))

WebUI.verifyElementText(findTestObject('Object Repository/Home Page/Ubah_Email/div_Email berhasil diubah silahkan masuk ke_c19202'))

WebUI.closeBrowser()

