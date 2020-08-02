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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://flip.id/login')

WebUI.click(findTestObject('Page_Login/a_Daftar'))

WebUI.setText(findTestObject('Page_Signup/input_Lengkapi data berikut dan akun flipmu_7b2c77'), 'Melinda')

WebUI.setText(findTestObject('Page_Signup/input_Lengkapi data berikut dan akun flipmu_8735ea'), 'test123@mailinator.com')

WebUI.setEncryptedText(findTestObject('Page_Signup/input_Lengkapi data berikut dan akun flipmu_c85257'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.setText(findTestObject('Page_Signup/input_NOMOR HANDPHONE_no_hp'), '080909080706')

WebUI.click(findTestObject('Page_Signup/button_DAFTAR'))

WebUI.verifyElementText(findTestObject('Page_Signup/li_Email yang dimasukkan sudah terdaftar Mo_8a266e'))

WebUI.closeBrowser()