package org.pom;

import javax.management.loading.PrivateClassLoader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenCart_PomClass {

	public static WebDriver driver;

	@FindBy(xpath = "//ul[@class='nav navbar-nav']//a[normalize-space()='Features']")
	private WebElement Features;

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Unlimited everything']")
	private WebElement UnlimitedEverything;

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Customer']")
	private WebElement Customer;

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Shipping, Payments and Reports']")
	private WebElement ShippingPaymentsAndReports;

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Extensions']")
	private WebElement Extensions;

	@FindBy(xpath = "//a[normalize-space()='Mobile and SEO']")
	private WebElement MobileAndSEO;

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Developer']")
	private WebElement Developer;

	@FindBy(xpath = "//a[@class='btn btn-lg'][normalize-space()='Admin']")
	private WebElement Admin;

	@FindBy(xpath = "//h3[normalize-space()='Affiliates']")
	private WebElement ScrollDownAffiliates1;

	@FindBy(xpath = "//h2[normalize-space()='Free to download and use']")
	private WebElement ScrollUpFree1;

	@FindBy(xpath = "//h3[normalize-space()='Downloadable Products Ready']")
	private WebElement ScrollDownDownloadable2;

	@FindBy(xpath = "//h2[normalize-space()='Filters']")
	private WebElement ScrollUpFilters2;

	@FindBy(xpath = "//h2[normalize-space()='Turn mail to your advantage']")
	private WebElement ScrollDownTurn3;

	@FindBy(xpath = "//h1[normalize-space()='Comprehensive payment gateways']")
	private WebElement ScrollUpComprehensive3;

	@FindBy(xpath = "//h2[normalize-space()='Sales reports']")
	private WebElement ScrollDownSales4;

	@FindBy(xpath = "//h2[normalize-space()='OpenCart Extensions']")
	private WebElement ScrollUpOpenCart4;

	@FindBy(xpath = "//h2[normalize-space()='Partners around the world']")
	private WebElement ScrollDownPartners5;

	@FindBy(xpath = "//h2[normalize-space()='Mobile/Tablet']")
	private WebElement ScrollUpMobile5;

	@FindBy(xpath = "//h2[normalize-space()='Guest and Registered user Checkout']")
	private WebElement ScrollDownGuest6;

	@FindBy(xpath = "//h1[contains(text(),'Sell your modules and themes on the OpenCart marke')]")
	private WebElement ScrollUpSell6;

	@FindBy(xpath = "//h2[normalize-space()='Open-Source']")
	private WebElement ScrollDownOpen7;

	@FindBy(xpath = "//h2[normalize-space()='Administrator Dashboard']")
	private WebElement ScrollUpAdministrator7;

	@FindBy(xpath = "(//a[text()='Demo'])[1]")
	private WebElement Demo;

	@FindBy(xpath = "//span[text()='View Store Front']")
	private WebElement Opencart;

	@FindBy(xpath = "//img[@title='OpenCart - Features']")
	private WebElement Home;

	@FindBy(xpath = "//a[@class='navbar-brand']")
	private WebElement Home1;

	@FindBy(xpath = "//a[normalize-space()='Desktops']")
	private WebElement Desktop;

	@FindBy(xpath = "//a[normalize-space()='Mac (1)']")
	private WebElement Mac1;

	@FindBy(xpath = "//img[@title='iMac']")
	private WebElement iMac;

	@FindBy(xpath = "//i[@class='fa fa-home']")
	private WebElement Fahome;

	@FindBy(xpath = "//a[normalize-space()='Laptops & Notebooks']")
	private WebElement LaptopsNotebooks;

	@FindBy(xpath = "//a[normalize-space()='Show All Laptops & Notebooks']")
	private WebElement ShowAllLaptopsNotebooks;

	@FindBy(xpath = "//img[@title='HP LP3065']")
	private WebElement HPLP3065;

	@FindBy(xpath = "//a[normalize-space()='Components']")
	private WebElement Components;

	@FindBy(xpath = "//a[normalize-space()='Monitors (2)']")
	private WebElement Monitors2;

	@FindBy(xpath = "//img[@title='Apple Cinema 30\"']")
	private WebElement AppleCinema30;

	@FindBy(xpath = "//a[normalize-space()='Tablets']")
	private WebElement Tablets;

	@FindBy(xpath = "//img[@title='Samsung Galaxy Tab 10.1']")
	private WebElement SamsungGalaxyTab;

	@FindBy(xpath = "//a[normalize-space()='Software']")
	private WebElement Software;

	@FindBy(xpath = "//a[normalize-space()='Phones & PDAs']")
	private WebElement PhonesPDAs;

	@FindBy(xpath = "//*[@id=\"product-list\"]/div[1]/form/div/div[1]/a/img")
	private WebElement HTTouchHD;

	@FindBy(xpath = "//*[@id=\"product-list\"]/div[2]/form/div/div[1]/a/img")
	private WebElement iPhone;

	@FindBy(xpath = "(//img[@class='img-fluid'])[5]")
	private WebElement PalmTreoPro;

	@FindBy(xpath = "(//a[text()='Cameras'])[1]")
	private WebElement Cameras;

	@FindBy(xpath = "//img[@title='Canon EOS 5D']")
	private WebElement CanonEOS5D;

	@FindBy(xpath = "//img[@title='Nikon D300']")
	private WebElement NikonD300;

	@FindBy(xpath = "//*[@id=\"narbar-menu\"]/ul/li[8]/a")
	private WebElement MP3;

	@FindBy(xpath = "//a[normalize-space()='test 12 (0)']")
	private WebElement test12;

	@FindBy(xpath = "//*[@id=\"form-product\"]/h3")
	private WebElement ScrolldownText;

	@FindBy(xpath = "//*[@id=\"input-option-218\"]/div[1]/label")
	private WebElement Radioclick;

	@FindBy(xpath = "//input[@id='input-option-value-9']")
	private WebElement Checkbox1;

	@FindBy(xpath = "//input[@id='input-option-value-10']")
	private WebElement Checkbox2;

	@FindBy(xpath = "//input[@id='input-option-208']")
	private WebElement Text;

	@FindBy(xpath = "//label[normalize-space()='File']")
	private WebElement ScrolldownFile;

	@FindBy(xpath = "//*[@id=\"top\"]")
	private WebElement Scrollupopen;

	@FindBy(xpath = "//select[@id='input-option-217']")
	private WebElement Dropdown;

	@FindBy(xpath = "//a[@href='https://demo.opencart.com/index.php?route=common/home&language=en-gb']//i")
	private WebElement home1;

	@FindBy(xpath = "//div[@id='navbar-collapse-header']//a[normalize-space()='Marketplace']")
	private WebElement Markatplace;

	@FindBy(xpath = "(//a[@class='btn btn-default btn-lg'])[1]")
	private WebElement Commercial;

	@FindBy(xpath = "(//a[@class='btn btn-default btn-lg'])[2]")
	private WebElement Free;

	@FindBy(xpath = "//select[@id='input-sort']")
	private WebElement DDMKSortBy;

	@FindBy(xpath = "//img[@title='OpenCart']")
	private WebElement SDMK1opencart;

	@FindBy(xpath = "//h4[normalize-space()='Search extensions and themes']")
	private WebElement SUMK1Search;

	@FindBy(xpath = "//section[@id='extension-search']//input[@type='text']")
	private WebElement Search;

	@FindBy(xpath = "//button[@id='button-search']")
	private WebElement SearchButton;

	@FindBy(xpath = "//a[normalize-space()='Marketplaces']")
	private WebElement Marketplaces1;

	@FindBy(xpath = "//a[normalize-space()='Themes']")
	private WebElement Themes;

	@FindBy(xpath = "//a[normalize-space()='Languages']")
	private WebElement Languages;

	@FindBy(xpath = "//a[normalize-space()='Payment Gateways']")
	private WebElement PaymentGateways;

	@FindBy(xpath = "//a[normalize-space()='Shipping Methods']")
	private WebElement ShippingMethods;

	@FindBy(xpath = "//a[normalize-space()='Modules']")
	private WebElement Modules;

	@FindBy(xpath = "//a[normalize-space()='Order Totals']")
	private WebElement OrderTotals;

	@FindBy(xpath = "//a[normalize-space()='Product Feeds']")
	private WebElement ProductFeeds;

	@FindBy(xpath = "//a[normalize-space()='Reports']")
	private WebElement Reports;

	@FindBy(xpath = "//a[normalize-space()='Other']")
	private WebElement Other;

	@FindBy(xpath = "//a[normalize-space()='VQMod']")
	private WebElement VQMod;

	@FindBy(xpath = "//h4[normalize-space()='OpenCart version']")
	private WebElement SDMK2;

	@FindBy(xpath = "//label[normalize-space()='OpenCart Partners']")
	private WebElement DevelopedBYOpenCartPartners;

	@FindBy(xpath = "//label[normalize-space()='Developers']")
	private WebElement DevelopedByDevelopers;

	@FindBy(xpath = "//label[normalize-space()='All']")
	private WebElement DevelopedByAll;

	@FindBy(xpath = "(//select[@class='form-control'])[1]")
	private WebElement DDOpenCartversion;

	@FindBy(xpath = "//a[normalize-space()='Resources']")
	private WebElement Resources;

	@FindBy(xpath = "//div[@id='navbar-collapse-header']//a[normalize-space()='Contact Us']")
	private WebElement ContactUS;

	@FindBy(xpath = "//select[@id='input-reason']")
	private WebElement OrderIssue;

	@FindBy(xpath = "//input[@id='input-name']")
	private WebElement InputName;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement InputEmail;

	@FindBy(xpath = "//input[@id='input-order-id']")
	private WebElement InputOrderID;

	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement InputWebSite;

	@FindBy(xpath = "//select[@id='input-version']")
	private WebElement InputVersion;

	@FindBy(xpath = "//textarea[@id='input-enquiry']")
	private WebElement InputEnqiry;
	
	@FindBy(xpath = "//select[@id='input-reason']")
	private WebElement InputHelpYou;
	

	public OpenCart_PomClass(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFeatures() {
		return Features;
	}

	public WebElement getUnlimitedEverything() {
		return UnlimitedEverything;
	}

	public WebElement getCustomer() {
		return Customer;
	}

	public WebElement getShippingPaymentsAndReports() {
		return ShippingPaymentsAndReports;
	}

	public WebElement getExtensions() {
		return Extensions;
	}

	public WebElement getMobileAndSEO() {
		return MobileAndSEO;
	}

	public WebElement getDeveloper() {
		return Developer;
	}

	public WebElement getAdmin() {
		return Admin;
	}

	public WebElement getScrollDownAffiliates1() {
		return ScrollDownAffiliates1;
	}

	public WebElement getScrollUpFree1() {
		return ScrollUpFree1;
	}

	public WebElement getScrollDownDownloadable2() {
		return ScrollDownDownloadable2;
	}

	public WebElement getScrollUpFilters2() {
		return ScrollUpFilters2;
	}

	public WebElement getScrollDownTurn3() {
		return ScrollDownTurn3;
	}

	public WebElement getScrollUpComprehensive3() {
		return ScrollUpComprehensive3;
	}

	public WebElement getScrollDownSales4() {
		return ScrollDownSales4;
	}

	public WebElement getScrollUpOpenCart4() {
		return ScrollUpOpenCart4;
	}

	public WebElement getScrollDownPartners5() {
		return ScrollDownPartners5;
	}

	public WebElement getScrollUpMobile5() {
		return ScrollUpMobile5;
	}

	public WebElement getScrollDownGuest6() {
		return ScrollDownGuest6;
	}

	public WebElement getScrollUpSell6() {
		return ScrollUpSell6;
	}

	public WebElement getScrollDownOpen7() {
		return ScrollDownOpen7;
	}

	public WebElement getScrollUpAdministrator7() {
		return ScrollUpAdministrator7;
	}

	public WebElement getDemo() {
		return Demo;
	}

	public WebElement getOpencart() {
		return Opencart;
	}

	public WebElement getHome() {
		return Home;
	}

	public WebElement getHome1() {
		return Home1;
	}

	public WebElement getDesktop() {
		return Desktop;
	}

	public WebElement getMac1() {
		return Mac1;
	}

	public WebElement getFahome() {
		return Fahome;
	}

	public WebElement getLaptopsNotebooks() {
		return LaptopsNotebooks;
	}

	public WebElement getShowAllLaptopsNotebooks() {
		return ShowAllLaptopsNotebooks;
	}

	public WebElement getHPLP3065() {
		return HPLP3065;
	}

	public WebElement getComponents() {
		return Components;
	}

	public WebElement getMonitors2() {
		return Monitors2;
	}

	public WebElement getAppleCinema30() {
		return AppleCinema30;
	}

	public WebElement getTablets() {
		return Tablets;
	}

	public WebElement getSamsungGalaxyTab() {
		return SamsungGalaxyTab;
	}

	public WebElement getSoftware() {
		return Software;
	}

	public WebElement getPhonesPDAs() {
		return PhonesPDAs;
	}

	public WebElement getHTTouchHD() {
		return HTTouchHD;
	}

	public WebElement getiPhone() {
		return iPhone;
	}

	public WebElement getPalmTreoPro() {
		return PalmTreoPro;
	}

	public WebElement getCanonEOS5D() {
		return CanonEOS5D;
	}

	public WebElement getNikonD300() {
		return NikonD300;
	}

	public WebElement getMP3() {
		return MP3;
	}

	public WebElement getTest12() {
		return test12;
	}

	public WebElement getiMac() {
		return iMac;
	}

	public WebElement getCameras() {
		return Cameras;
	}

	public WebElement getScrolldownText() {
		return ScrolldownText;
	}

	public WebElement getRadioclick() {
		return Radioclick;
	}

	public WebElement getCheckbox1() {
		return Checkbox1;
	}

	public WebElement getCheckbox2() {
		return Checkbox2;
	}

	public WebElement getText() {
		return Text;
	}

	public WebElement getScrolldownFile() {
		return ScrolldownFile;
	}

	public WebElement getScrollupopen() {
		return Scrollupopen;
	}

	public WebElement getDropdown() {
		return Dropdown;
	}

	public WebElement getMarkatplace() {
		return Markatplace;
	}

	public WebElement getCommercial() {
		return Commercial;
	}

	public WebElement getFree() {
		return Free;
	}

	public WebElement getDDMKSortBy() {
		return DDMKSortBy;
	}

	public WebElement getSDMK1opencart() {
		return SDMK1opencart;
	}

	public WebElement getSUMK1Search() {
		return SUMK1Search;
	}

	public WebElement getSearch() {
		return Search;
	}

	public WebElement getSearchButton() {
		return SearchButton;
	}

	public WebElement getMarketplaces1() {
		return Marketplaces1;
	}

	public WebElement getThemes() {
		return Themes;
	}

	public WebElement getLanguages() {
		return Languages;
	}

	public WebElement getPaymentGateways() {
		return PaymentGateways;
	}

	public WebElement getShippingMethods() {
		return ShippingMethods;
	}

	public WebElement getModules() {
		return Modules;
	}

	public WebElement getOrderTotals() {
		return OrderTotals;
	}

	public WebElement getProductFeeds() {
		return ProductFeeds;
	}

	public WebElement getReports() {
		return Reports;
	}

	public WebElement getOther() {
		return Other;
	}

	public WebElement getVQMod() {
		return VQMod;
	}

	public WebElement getSDMK2() {
		return SDMK2;
	}

	public WebElement getDevelopedBYOpenCartPartners() {
		return DevelopedBYOpenCartPartners;
	}

	public WebElement getDevelopedByDevelopers() {
		return DevelopedByDevelopers;
	}

	public WebElement getDevelopedByAll() {
		return DevelopedByAll;
	}

	public WebElement getDDOpenCartversion() {
		return DDOpenCartversion;
	}

	public WebElement getResources() {
		return Resources;
	}

	public WebElement getContactUS() {
		return ContactUS;
	}

	public WebElement getOrderIssue() {
		return OrderIssue;
	}

	public WebElement getInputName() {
		return InputName;
	}

	public WebElement getInputEmail() {
		return InputEmail;
	}

	public WebElement getInputOrderID() {
		return InputOrderID;
	}

	public WebElement getInputWebSite() {
		return InputWebSite;
	}

	public WebElement getInputVersion() {
		return InputVersion;
	}

	public WebElement getInputEnqiry() {
		return InputEnqiry;
	}
	public WebElement getInputHelpYou() {
		return InputHelpYou;
	}


}
