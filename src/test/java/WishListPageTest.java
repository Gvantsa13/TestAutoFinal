import StepObject.WishListPageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

import static DataObject.WishListData.emptyData;
import static com.codeborne.selenide.Selenide.$;


public class WishListPageTest extends ChromeRunner {
    WishListPageSteps wishListPageSteps = new WishListPageSteps();
    @Test
    @Description("პროდუქტის სასურველ სიაში ჩაგდების შემოწმება")
    @Severity(SeverityLevel.CRITICAL)
    public void AddProductsInWishListSuccessfully() {
        wishListPageSteps.clickOnDropdownButton()
                .chooseTechnics()
                .chooseComputerTechnics()
                .clickOnLaptopsBags()
                .goToProductDetails()
                .addToWishList()
                .closePopupWindow()
                .checkWishListProducts();
        SelenideElement wishList = $(".ty-grid-list");
        Assert.assertFalse(wishList.is(Condition.empty));
    }

    @Test
    @Description("პროდუქტის წაშლა სასურველი სიიდან")
    @Severity(SeverityLevel.NORMAL)
    public void deleteProductFromWishList(){
        wishListPageSteps.clickOnDropdownButton()
                .chooseTechnics()
                .chooseComputerTechnics()
                .clickOnLaptopsBags()
                .goToProductDetails()
                .addToWishList()
                .closePopupWindow()
                .checkWishListProducts()
                .deleteProductFromList()
                .checkWishListProducts();
        SelenideElement emptyList = $(".ty-product-empty__text");
        Assert.assertEquals(emptyData,emptyList.getText());
    }
}
