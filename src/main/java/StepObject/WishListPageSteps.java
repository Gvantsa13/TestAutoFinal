package StepObject;

import PageObject.WishListPage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selenide.$;

public class WishListPageSteps extends WishListPage {
    @Step("ჩამონათვალის ღილაკზე დაჭერა")
    public WishListPageSteps clickOnDropdownButton() {
        dropDownButton.click();
        return this;
    }

    @Step("ტექნიკის არჩევა")
    public WishListPageSteps chooseTechnics(){
        technicButton.click();
        return this;
    }

    @Step("კომპიუტერული ტექნიკის არჩევა")
    public WishListPageSteps chooseComputerTechnics(){
        computerTechnics.click();
        return this;
    }
    @Step("პროდუქტის არჩევა")
    public WishListPageSteps clickOnLaptopsBags(){
        laptopBags.click();
        return this;
    }

    @Step("პროდუქტის გვერდზე გადასვლა")
    public WishListPageSteps goToProductDetails(){
        wishedLaptopBag.click();
        return this;
    }
    @Step("პროდუქტის სასურველ სიაში დამატება")
    public WishListPageSteps addToWishList(){
        addInWishListButton.click();
        return this;
    }

    @Step("სასურველი პროდუქტების სიის ნახვა")
    public WishListPageSteps checkWishListProducts(){
        selectedProductsInWishList.click();
        return this;
    }

    @Step("სასურველი სიის გასუფთავება")
    public WishListPageSteps deleteProductFromList(){
        deleteButton.click();
        return this;
    }
    @Step("პოპაპ მესიჯის გათიშვა")
    public WishListPageSteps closePopupWindow(){
        closePopup.click();
        return this;
    }

}
