package org.Setp_Defination;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.Runner.OpenCart_RunnerClass;
import org.base.OpenCart_BaseClass;
import org.openqa.selenium.WebDriver;
import org.pom.OpenCart_PomClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class OpenCart_StepDefination extends OpenCart_BaseClass {

	public static WebDriver driver = OpenCart_RunnerClass.driver;
	public static OpenCart_PomClass opencartapp = new OpenCart_PomClass(driver);

	@Given("To enter the URL")
	public void to_enter_the_url() {
		url(driver, "https://www.opencart.com/");
	}

	@When("maximize the window")
	public void maximize_the_window() {
		maxi(driver);
	}

	@When("user click an Features")
	public void user_click_an_features() throws InterruptedException {
		opencartapp.getFeatures().click();
		scrolldown(driver, opencartapp.getScrollDownAffiliates1());
		Thread.sleep(1000);

	}

	@When("user click an unlimited everything link")
	public void user_click_an_unlimited_everything_link() throws IOException, InterruptedException {
		opencartapp.getUnlimitedEverything().click();
		scrollup(driver, opencartapp.getScrollUpFree1());
		snapshot(driver, "UnlimitedEverything");
		Thread.sleep(1000);
		scrolldown(driver, opencartapp.getScrollDownDownloadable2());

	}

	@When("user click an customer link")
	public void user_click_an_customer_link() throws IOException, InterruptedException {
		opencartapp.getCustomer().click();
		scrollup(driver, opencartapp.getScrollUpFilters2());
		snapshot(driver, "Customer");
		//Thread.sleep(1000);
		scrolldown(driver, opencartapp.getScrollDownTurn3());
	}

	@When("user click an Shipping,Payments and Reports link")
	public void user_click_an_shipping_payments_and_reports_link() throws IOException, InterruptedException {
		opencartapp.getShippingPaymentsAndReports().click();
		scrollup(driver, opencartapp.getScrollUpComprehensive3());
		snapshot(driver, "ShippingPayments");
		//Thread.sleep(1000);
		scrolldown(driver, opencartapp.getScrollDownSales4());
	}

	@When("user click an Extensions link")
	public void user_click_an_extensions_link() throws IOException, InterruptedException {
		opencartapp.getExtensions().click();
		scrollup(driver, opencartapp.getScrollUpOpenCart4());
		snapshot(driver, "Extensions");
		//Thread.sleep(1000);
		scrolldown(driver, opencartapp.getScrollDownPartners5());
	}

	@When("user click an Mobile & SEO link")
	public void user_click_an_mobile_seo_link() throws IOException, InterruptedException {
		opencartapp.getMobileAndSEO().click();
		scrollup(driver, opencartapp.getScrollUpMobile5());
		snapshot(driver, "MobileAndSEO");
		//Thread.sleep(1000);
		scrolldown(driver, opencartapp.getScrollDownGuest6());
	}

	@When("user click an Developer link")
	public void user_click_an_developer_link() throws IOException, InterruptedException {
		opencartapp.getDeveloper().click();
		scrollup(driver, opencartapp.getScrollUpSell6());
		snapshot(driver, "Developer");
		//Thread.sleep(1000);
		scrolldown(driver, opencartapp.getScrollDownOpen7());
	}

	@When("user click an Admin link")
	public void user_click_an_admin_link() throws IOException, InterruptedException {
		opencartapp.getAdmin().click();
		scrollup(driver, opencartapp.getScrollUpAdministrator7());
		snapshot(driver, "Admin");
		//Thread.sleep(1000);
		opencartapp.getHome().click();
	}

//Demo Module

	@When("user click an Demo")
	public void user_click_an_demo() throws IOException {
		opencartapp.getDemo().click();
		snapshot(driver, "Demo");
	}

	@When("user click an Store Front")
	public void user_click_an_store_front() throws IOException {
		opencartapp.getOpencart().click();
		snapshot(driver, "Opencart");
	}

	@When("user click an Desktop")
	public void user_click_an_desktop() throws InterruptedException, IOException {
		Set<String> wi = driver.getWindowHandles();
		Iterator<String> ite = wi.iterator();
		String Parent = ite.next();
		String Child = ite.next();
		driver.switchTo().window(Child);
		opencartapp.getDesktop().click();
		snapshot(driver, "Desktop");
		//Thread.sleep(1000);
		opencartapp.getMac1().click();
		snapshot(driver, "Mac1");
		//Thread.sleep(1000);
		opencartapp.getiMac().click();
		snapshot(driver, "iMac");
		//Thread.sleep(1000);
		opencartapp.getFahome().click();
		snapshot(driver, "Fahome");

	}

	@When("user click an laptops and notebooks")
	public void user_click_an_laptops_and_notebooks() throws InterruptedException, IOException {
		opencartapp.getLaptopsNotebooks().click();
		opencartapp.getShowAllLaptopsNotebooks().click();
		snapshot(driver, "LaptopsNotebooks");
		//Thread.sleep(1000);
		opencartapp.getHPLP3065().click();
		snapshot(driver, "HPLP3065");
		opencartapp.getFahome().click();

	}

	@When("user click an Components")
	public void user_click_an_components() throws InterruptedException, IOException {
		opencartapp.getComponents().click();
		opencartapp.getMonitors2().click();
		snapshot(driver, "Monitors2");
		opencartapp.getAppleCinema30().click();
		//Thread.sleep(1000);
		scrolldown(driver, opencartapp.getScrolldownText());
		snapshot(driver, "AppleCinema30");
		//Thread.sleep(1000);
		opencartapp.getRadioclick().click();
		//Thread.sleep(1000);
		opencartapp.getCheckbox1().click();
		//Thread.sleep(1000);
		opencartapp.getCheckbox2().click();
		Thread.sleep(1000);
		opencartapp.getText().clear();
		opencartapp.getText().sendKeys("Rajavel");
		// movetoele(opencartapp.getScrollupopen(), driver);
		DropDown_visibletext(opencartapp.getDropdown(), "Green (+$3.20)");
		Thread.sleep(2000);

		scrollup(driver, opencartapp.getScrollupopen());
		Thread.sleep(1000);
		click(opencartapp.getFahome());

	}

	@When("user click an Tables")
	public void user_click_an_tables() throws InterruptedException, IOException {
		opencartapp.getTablets().click();
		snapshot(driver, "Tablets");
		opencartapp.getSamsungGalaxyTab().click();
		snapshot(driver, "SamsungGalaxyTab");
		opencartapp.getFahome().click();
	}

	@When("user click an Software")
	public void user_click_an_software() throws IOException {
		opencartapp.getSoftware().click();
		snapshot(driver, "Software");
		opencartapp.getFahome().click();
	}

	@When("user click an Phones and PDA")
	public void user_click_an_phones_and_pda() throws InterruptedException, IOException {
		opencartapp.getPhonesPDAs().click();
		//Thread.sleep(1000);
		opencartapp.getHTTouchHD().click();
		snapshot(driver, "HTTouchHD");
		driver.navigate().back();
		//Thread.sleep(1000);
		opencartapp.getiPhone().click();
		snapshot(driver, "iPhone");
		driver.navigate().back();
		//Thread.sleep(1000);
		opencartapp.getPalmTreoPro().click();
		snapshot(driver, "PalmTreoPro");
		opencartapp.getFahome().click();

	}

	@When("user click an Cameras")
	public void user_click_an_cameras() throws InterruptedException, IOException {
		opencartapp.getCameras().click();
		snapshot(driver, "Cameras");
		opencartapp.getCanonEOS5D().click();
		snapshot(driver, "CanonEOS5D");
		//Thread.sleep(1000);
		driver.navigate().back();
		//Thread.sleep(1000);
		opencartapp.getNikonD300().click();
		snapshot(driver, "NikonD300");
		opencartapp.getFahome().click();

	}

	@When("user click an MP3 Players")
	public void user_click_an_mp3_players() throws IOException {
		opencartapp.getMP3().click();
		snapshot(driver, "MP3");
		opencartapp.getTest12().click();
		snapshot(driver, "Test12");
		opencartapp.getFahome().click();
		Set<String> wi = driver.getWindowHandles();
		Iterator<String> ite = wi.iterator();
		String Parent = ite.next();
		String Child = ite.next();
		driver.switchTo().window(Parent);
		opencartapp.getHome1().click();
	}

//MarketPlace Module

	@When("user click an MarketPlace")
	public void user_click_an_market_place() throws InterruptedException, IOException {
		opencartapp.getMarkatplace().click();
		snapshot(driver, "Markatplace");
		//Thread.sleep(1000);
	}

	@When("user click an commercial")
	public void user_click_an_commercial() throws InterruptedException, IOException {
		opencartapp.getCommercial().click();
		snapshot(driver, "Commercial");
		//Thread.sleep(1000);

	}

	@When("user click an free")
	public void user_click_an_free() throws InterruptedException, IOException {
		opencartapp.getFree().click();
		snapshot(driver, "Free");
		scrolldown(driver, opencartapp.getSDMK1opencart());
		snapshot(driver, "SDMK1opencart");
		//Thread.sleep(1000);
		scrollup(driver, opencartapp.getSUMK1Search());
		snapshot(driver, "SUMK1Search");
		//Thread.sleep(1000);
	}

	@When("user click an search")
	public void user_click_an_search() throws InterruptedException {
		opencartapp.getSearch().sendKeys("Mobile");
		opencartapp.getSearchButton().click();
		scrolldown(driver, opencartapp.getSDMK1opencart());
		//Thread.sleep(1000);
		scrollup(driver, opencartapp.getSUMK1Search());
		// opencartapp.getSearchButton().clear();
	}

	@When("user click an DropDownSortBy")
	public void user_click_an_drop_down_sort_by() throws InterruptedException, IOException {
		DropDown_visibletext(opencartapp.getDDMKSortBy(), "Rating");
		snapshot(driver, "DDMKSortBy");
		scrolldown(driver, opencartapp.getSDMK1opencart());
		snapshot(driver, "SDMK1opencart");
		//Thread.sleep(1000);
		scrollup(driver, opencartapp.getSUMK1Search());
		snapshot(driver, "SUMK1Search");
	}

	@When("user click the Categorys one by one")
	public void user_click_the_categorys_one_by_one() throws InterruptedException {
		opencartapp.getMarketplaces1().click();
		//Thread.sleep(1000);
		opencartapp.getThemes().click();
		//Thread.sleep(1000);
		opencartapp.getLanguages().click();
		//Thread.sleep(1000);
		opencartapp.getPaymentGateways().click();
		scrolldown(driver, opencartapp.getMarketplaces1());
		//Thread.sleep(1000);
		scrollup(driver, opencartapp.getSUMK1Search());
		scrolldown(driver, opencartapp.getMarketplaces1());
		//Thread.sleep(1000);
		opencartapp.getShippingMethods().click();
		scrolldown(driver, opencartapp.getMarketplaces1());
		//Thread.sleep(1000);
		opencartapp.getModules().click();
		scrolldown(driver, opencartapp.getMarketplaces1());
		//Thread.sleep(1000);
		opencartapp.getOrderTotals().click();
		scrolldown(driver, opencartapp.getMarketplaces1());
		//Thread.sleep(1000);
		opencartapp.getProductFeeds().click();
		scrolldown(driver, opencartapp.getMarketplaces1());
		//Thread.sleep(1000);
		opencartapp.getReports().click();
		scrolldown(driver, opencartapp.getMarketplaces1());
		//Thread.sleep(1000);
		opencartapp.getReports().click();
		scrolldown(driver, opencartapp.getMarketplaces1());
		//Thread.sleep(1000);
		opencartapp.getOther().click();
		scrolldown(driver, opencartapp.getMarketplaces1());
		//Thread.sleep(1000);
		opencartapp.getVQMod().click();

	}

	@When("user click an OpenCart_version_DropDown")
	public void user_click_an_open_cart_version_drop_down() throws InterruptedException, IOException {
		scrolldown(driver, opencartapp.getReports());
		DropDown_index(opencartapp.getDDOpenCartversion(), 10);
		snapshot(driver, "DDOpen");
		//Thread.sleep(2000);

	}

	@When("user click an AllOpenCartDeveloper")
	public void user_click_an_all_open_cart_developer() throws InterruptedException, IOException {
		scrolldown(driver, opencartapp.getReports());
		opencartapp.getDevelopedBYOpenCartPartners().click();
		snapshot(driver, "DevelopedBYOpenCart");
		//Thread.sleep(3000);
		scrolldown(driver, opencartapp.getReports());
		opencartapp.getDevelopedByDevelopers().click();
		snapshot(driver, "DevelopedByDevelopers");
		//Thread.sleep(3000);
		scrolldown(driver, opencartapp.getReports());
		snapshot(driver, "Reports");
		opencartapp.getDevelopedByAll().click();

	}
	
	
//Resources Module
	@When("user click an resources")
	public void user_click_an_resources() {
		opencartapp.getResources().click();
	}
	@When("user click an Contact us and enters the user deatiles")
	public void user_click_an_contact_us_and_enters_the_user_deatiles() throws InterruptedException {
		opencartapp.getContactUS().click();
		DropDown_visibletext(opencartapp.getInputHelpYou(), "I would like to report an order issue");
		Thread.sleep(5000);
//		opencartapp.getInputName().sendKeys("Vickey");
//		opencartapp.getInputEmail().sendKeys("vickey143@gmail.com");
//		scrolldown(driver, opencartapp.getInputName());
//		opencartapp.getInputOrderID().sendKeys("12345");
//		opencartapp.getInputWebSite().sendKeys("https://www.opencart.com/");
//		DropDown_index(opencartapp.getInputVersion(), 10);
//		opencartapp.getInputEnopencartappiry().sendKeys("facing the issue will installing the intellij");
	}




}
