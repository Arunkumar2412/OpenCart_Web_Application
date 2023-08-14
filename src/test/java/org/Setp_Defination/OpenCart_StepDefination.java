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
	public static OpenCart_PomClass q = new OpenCart_PomClass(driver);

	@Given("To enter the URL")
	public void to_enter_the_url() {
		url(driver, "https://www.opencart.com/");
	}

	@Given("maximize the window")
	public void maximize_the_window() {
		maxi(driver);
	}

	@When("user click an Features")
	public void user_click_an_features() throws InterruptedException {
		q.getFeatures().click();
		scrolldown(driver, q.getScrollDownAffiliates1());
		Thread.sleep(1000);

	}

	@When("user click an unlimited everything link")
	public void user_click_an_unlimited_everything_link() throws IOException, InterruptedException {
		q.getUnlimitedEverything().click();
		scrollup(driver, q.getScrollUpFree1());
		snapshot(driver, "Pic1");
		Thread.sleep(1000);
		scrolldown(driver, q.getScrollDownDownloadable2());

	}

	@When("user click an customer link")
	public void user_click_an_customer_link() throws IOException, InterruptedException {
		q.getCustomer().click();
		scrollup(driver, q.getScrollUpFilters2());
		snapshot(driver, "Pic2");
		//Thread.sleep(1000);
		scrolldown(driver, q.getScrollDownTurn3());
	}

	@When("user click an Shipping,Payments and Reports link")
	public void user_click_an_shipping_payments_and_reports_link() throws IOException, InterruptedException {
		q.getShippingPaymentsAndReports().click();
		scrollup(driver, q.getScrollUpComprehensive3());
		snapshot(driver, "Pic3");
		//Thread.sleep(1000);
		scrolldown(driver, q.getScrollDownSales4());
	}

	@When("user click an Extensions link")
	public void user_click_an_extensions_link() throws IOException, InterruptedException {
		q.getExtensions().click();
		scrollup(driver, q.getScrollUpOpenCart4());
		snapshot(driver, "Pic4");
		//Thread.sleep(1000);
		scrolldown(driver, q.getScrollDownPartners5());
	}

	@When("user click an Mobile & SEO link")
	public void user_click_an_mobile_seo_link() throws IOException, InterruptedException {
		q.getMobileAndSEO().click();
		scrollup(driver, q.getScrollUpMobile5());
		snapshot(driver, "Pic5");
		//Thread.sleep(1000);
		scrolldown(driver, q.getScrollDownGuest6());
	}

	@When("user click an Developer link")
	public void user_click_an_developer_link() throws IOException, InterruptedException {
		q.getDeveloper().click();
		scrollup(driver, q.getScrollUpSell6());
		snapshot(driver, "Pic6");
		//Thread.sleep(1000);
		scrolldown(driver, q.getScrollDownOpen7());
	}

	@When("user click an Admin link")
	public void user_click_an_admin_link() throws IOException, InterruptedException {
		q.getAdmin().click();
		scrollup(driver, q.getScrollUpAdministrator7());
		snapshot(driver, "Pic7");
		//Thread.sleep(1000);
		q.getHome().click();
	}

//Demo Module

	@When("user click an Demo")
	public void user_click_an_demo() throws IOException {
		q.getDemo().click();
		snapshot(driver, "Pic8");
	}

	@When("user click an Store Front")
	public void user_click_an_store_front() throws IOException {
		q.getOpencart().click();
		snapshot(driver, "pic9");
	}

	@When("user click an Desktop")
	public void user_click_an_desktop() throws InterruptedException, IOException {
		Set<String> wi = driver.getWindowHandles();
		Iterator<String> ite = wi.iterator();
		String Parent = ite.next();
		String Child = ite.next();
		driver.switchTo().window(Child);
		q.getDesktop().click();
		snapshot(driver, "pic10");
		//Thread.sleep(1000);
		q.getMac1().click();
		snapshot(driver, "pic11");
		//Thread.sleep(1000);
		q.getiMac().click();
		snapshot(driver, "pic12");
		//Thread.sleep(1000);
		q.getFahome().click();
		snapshot(driver, "pic13");

	}

	@When("user click an laptops and notebooks")
	public void user_click_an_laptops_and_notebooks() throws InterruptedException, IOException {
		q.getLaptopsNotebooks().click();
		q.getShowAllLaptopsNotebooks().click();
		snapshot(driver, "pic14");
		//Thread.sleep(1000);
		q.getHPLP3065().click();
		snapshot(driver, "pic15");
		q.getFahome().click();

	}

	@When("user click an Components")
	public void user_click_an_components() throws InterruptedException, IOException {
		q.getComponents().click();
		q.getMonitors2().click();
		snapshot(driver, "pic16");
		q.getAppleCinema30().click();
		//Thread.sleep(1000);
		scrolldown(driver, q.getScrolldownText());
		snapshot(driver, "pic17");
		//Thread.sleep(1000);
		q.getRadioclick().click();
		//Thread.sleep(1000);
		q.getCheckbox1().click();
		//Thread.sleep(1000);
		q.getCheckbox2().click();
		Thread.sleep(1000);
		q.getText().clear();
		q.getText().sendKeys("Rajavel");
		// movetoele(q.getScrollupopen(), driver);
		DropDown_visibletext(q.getDropdown(), "Green (+$3.20)");
		snapshot(driver, "pic18");
		Thread.sleep(3000);

		scrollup(driver, q.getScrollupopen());
		Thread.sleep(1000);
		click(q.getFahome());

	}

	@When("user click an Tables")
	public void user_click_an_tables() throws InterruptedException, IOException {
		q.getTablets().click();
		snapshot(driver, "pic19");
		q.getSamsungGalaxyTab().click();
		snapshot(driver, "pic20");
		q.getFahome().click();
	}

	@When("user click an Software")
	public void user_click_an_software() throws IOException {
		q.getSoftware().click();
		snapshot(driver, "pic21");
		q.getFahome().click();
	}

	@When("user click an Phones and PDA")
	public void user_click_an_phones_and_pda() throws InterruptedException, IOException {
		q.getPhonesPDAs().click();
		//Thread.sleep(1000);
		q.getHTTouchHD().click();
		snapshot(driver, "pic22");
		driver.navigate().back();
		//Thread.sleep(1000);
		q.getiPhone().click();
		snapshot(driver, "pic23");
		driver.navigate().back();
		//Thread.sleep(1000);
		q.getPalmTreoPro().click();
		snapshot(driver, "pic24");
		q.getFahome().click();

	}

	@When("user click an Cameras")
	public void user_click_an_cameras() throws InterruptedException, IOException {
		q.getCameras().click();
		snapshot(driver, "pic25");
		q.getCanonEOS5D().click();
		snapshot(driver, "pic26");
		//Thread.sleep(1000);
		driver.navigate().back();
		//Thread.sleep(1000);
		q.getNikonD300().click();
		snapshot(driver, "pic27");
		q.getFahome().click();

	}

	@When("user click an MP3 Players")
	public void user_click_an_mp3_players() throws IOException {
		q.getMP3().click();
		snapshot(driver, "pic28");
		q.getTest12().click();
		snapshot(driver, "pic29");
		q.getFahome().click();
		Set<String> wi = driver.getWindowHandles();
		Iterator<String> ite = wi.iterator();
		String Parent = ite.next();
		String Child = ite.next();
		driver.switchTo().window(Parent);
		q.getHome1().click();
	}

//MarketPlace Module

	@When("user click an MarketPlace")
	public void user_click_an_market_place() throws InterruptedException, IOException {
		q.getMarkatplace().click();
		snapshot(driver, "pic30");
		//Thread.sleep(1000);
	}

	@When("user click an commercial")
	public void user_click_an_commercial() throws InterruptedException, IOException {
		q.getCommercial().click();
		snapshot(driver, "pic31");
		//Thread.sleep(1000);

	}

	@When("user click an free")
	public void user_click_an_free() throws InterruptedException, IOException {
		q.getFree().click();
		snapshot(driver, "pic32");
		scrolldown(driver, q.getSDMK1opencart());
		snapshot(driver, "pic33");
		//Thread.sleep(1000);
		scrollup(driver, q.getSUMK1Search());
		snapshot(driver, "pic34");
		//Thread.sleep(1000);
	}

	@When("user click an search")
	public void user_click_an_search() throws InterruptedException {
		q.getSearch().sendKeys("Mobile");
		q.getSearchButton().click();
		scrolldown(driver, q.getSDMK1opencart());
		//Thread.sleep(1000);
		scrollup(driver, q.getSUMK1Search());
		// q.getSearchButton().clear();
	}

	@When("user click an DropDownSortBy")
	public void user_click_an_drop_down_sort_by() throws InterruptedException, IOException {
		DropDown_visibletext(q.getDDMKSortBy(), "Rating");
		snapshot(driver, "pic35");
		scrolldown(driver, q.getSDMK1opencart());
		snapshot(driver, "pic36");
		//Thread.sleep(1000);
		scrollup(driver, q.getSUMK1Search());
		snapshot(driver, "pic37");
	}

	@When("user click the Categorys one by one")
	public void user_click_the_categorys_one_by_one() throws InterruptedException {
		q.getMarketplaces1().click();
		//Thread.sleep(1000);
		q.getThemes().click();
		//Thread.sleep(1000);
		q.getLanguages().click();
		//Thread.sleep(1000);
		q.getPaymentGateways().click();
		scrolldown(driver, q.getMarketplaces1());
		//Thread.sleep(1000);
		scrollup(driver, q.getSUMK1Search());
		scrolldown(driver, q.getMarketplaces1());
		//Thread.sleep(1000);
		q.getShippingMethods().click();
		scrolldown(driver, q.getMarketplaces1());
		//Thread.sleep(1000);
		q.getModules().click();
		scrolldown(driver, q.getMarketplaces1());
		//Thread.sleep(1000);
		q.getOrderTotals().click();
		scrolldown(driver, q.getMarketplaces1());
		//Thread.sleep(1000);
		q.getProductFeeds().click();
		scrolldown(driver, q.getMarketplaces1());
		//Thread.sleep(1000);
		q.getReports().click();
		scrolldown(driver, q.getMarketplaces1());
		//Thread.sleep(1000);
		q.getReports().click();
		scrolldown(driver, q.getMarketplaces1());
		//Thread.sleep(1000);
		q.getOther().click();
		scrolldown(driver, q.getMarketplaces1());
		//Thread.sleep(1000);
		q.getVQMod().click();

	}

	@When("user click an OpenCart_version_DropDown")
	public void user_click_an_open_cart_version_drop_down() throws InterruptedException, IOException {
		scrolldown(driver, q.getReports());
		DropDown_index(q.getDDOpenCartversion(), 10);
		snapshot(driver, "pic38");
		//Thread.sleep(2000);

	}

	@When("user click an AllOpenCartDeveloper")
	public void user_click_an_all_open_cart_developer() throws InterruptedException, IOException {
		scrolldown(driver, q.getReports());
		q.getDevelopedBYOpenCartPartners().click();
		snapshot(driver, "pic39");
		//Thread.sleep(3000);
		scrolldown(driver, q.getReports());
		q.getDevelopedByDevelopers().click();
		snapshot(driver, "pic40");
		//Thread.sleep(3000);
		scrolldown(driver, q.getReports());
		snapshot(driver, "pic41");
		q.getDevelopedByAll().click();

	}
	
	
//Resources Module
	@When("user click an resources")
	public void user_click_an_resources() {
		q.getResources().click();
	}
	@When("user click an Contact us and enters the user deatiles")
	public void user_click_an_contact_us_and_enters_the_user_deatiles() throws InterruptedException {
		q.getContactUS().click();
		DropDown_visibletext(q.getInputHelpYou(), "I would like to report an account issue");
		Thread.sleep(5000);
//		q.getInputName().sendKeys("Vickey");
//		q.getInputEmail().sendKeys("vickey143@gmail.com");
//		scrolldown(driver, q.getInputName());
//		q.getInputOrderID().sendKeys("12345");
//		q.getInputWebSite().sendKeys("https://www.opencart.com/");
//		DropDown_index(q.getInputVersion(), 10);
//		q.getInputEnqiry().sendKeys("facing the issue will installing the intellij");
	}




}
