package StepObject;

import DataObject.SearchResultsPageData;
import PageObject.SearchResultsPage;
import io.qameta.allure.Step;
import org.testng.Assert;

import java.sql.SQLOutput;

import static com.codeborne.selenide.Selectors.byTagName;
import static com.codeborne.selenide.Selenide.$;


public class SearchResultsPageSteps extends SearchResultsPage {
    @Step("ძებნის ველის შევსება")
    public SearchResultsPageSteps goToSearchProducts() {
        productsSearchButton.click();
        return this;
    }

    @Step("პროდუქტის დასახელების მითითება - {product}")
    public SearchResultsPageSteps inputProductInSearch(String product) {
        productsSearchButton.setValue(SearchResultsPageData.product);
        return this;
    }

    @Step("არავალიდური პროდუქტის მითითება - {invalidProduct}")
    public SearchResultsPageSteps inputInvalidProductInSearch(String invalidProduct) {
        productsSearchButton.setValue(SearchResultsPageData.invalidProduct);
        return this;
    }

    @Step("ძებნა ღილაკზე დაჭერა")
    public SearchResultsPageSteps clickOnSearchButton() {
        searchButton.click();
        return this;
    }

    @Step("სორტირების ღილაკზე დაჭერა")
    public SearchResultsPageSteps clickOnSortButton(){
        sortButton.click();
        return this;
    }

    @Step("ფასის მაღლიდან დაბლისკენ დალაგება")
    public SearchResultsPageSteps sortPriceDesc() {
        sortPriceDesc.click();
        return this;
    }



    @Step("პროდუქციის ფასის კლების მიხედვით დალაგების შემოწმება")
    public SearchResultsPageSteps checkSort() {

        for (int i = 0; i < productsPrice.size() - 1; i++) {

            String firstProduct = $(".ty-price-num", i).$(byTagName("span"), 0).getValue();
            String secondProduct = $(".ty-price-num", i + 1).$(byTagName("span"), 0).getValue();

            float first_product = Float.parseFloat(firstProduct);
            float second_product = Float.parseFloat(secondProduct);

            Assert.assertTrue(first_product >= second_product,
                    "პროდუქციის ფასის კლების მიხედვით დალაგება");
        }
        return this;
    }

}
