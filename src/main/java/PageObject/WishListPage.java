package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class WishListPage {
    public SelenideElement
    dropDownButton = $("#sw_dropdown_98"),
    technicButton = $(byText("ტექნიკა")),
    computerTechnics = $(".cat-title",2),
    laptopBags = $(byTitle("ნოუთბუქის ჩანთები")),
    wishedLaptopBag = $(byTitle("ნოუთბუქის ჩანთა-2E Backpack, TeensPack Camo, Multicolor(2E)")),
    addInWishListButton = $(byText("სასურველ სიაში დამატება")),
    selectedProductsInWishList = $("#abt__ut2_wishlist_count"),
    deleteButton = $(".ty-btn__tertiary"),
    closePopup = $(".cm-notification-close");

}
