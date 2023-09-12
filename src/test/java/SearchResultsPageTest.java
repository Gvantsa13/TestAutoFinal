import StepObject.SearchResultsPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;
import static DataObject.SearchResultsPageData.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;


public class SearchResultsPageTest extends ChromeRunner {
    SearchResultsPageSteps searchResultsPageSteps = new SearchResultsPageSteps();

    @Test
    @Description("პროდუქტის ძებნის შემოწმება - უარყოფითი შემთხვევა")
    @Severity(SeverityLevel.CRITICAL)
    public void searchOfProduct() {
        searchResultsPageSteps.goToSearchProducts()
                    .inputInvalidProductInSearch(invalidProduct)
                    .clickOnSearchButton();
        SelenideElement noItems = $(".ty-no-items");
            Assert.assertTrue(noItems.isDisplayed());

    }

    @Test
    @Description("პროდუქტის ფასის კლების მიხედვით დალაგება")
    @Severity(SeverityLevel.BLOCKER)
    public void checkSortFromHighToLow(){
        searchResultsPageSteps.goToSearchProducts()
                .inputProductInSearch(product)
                .clickOnSearchButton()
                .clickOnSortButton()
                .sortPriceDesc()
                .checkSort();
        sleep(5000);
    }

}
