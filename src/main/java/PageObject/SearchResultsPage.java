package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SearchResultsPage {
    public SelenideElement
    productsSearchButton = $("#search_input"),
    searchButton = $(".ty-search-magnifier"),
    sortButton = $("#sw_elm_sort_fields"),
    sortPriceDesc = $(".sort-by-price-desc"),
    noItems = $(".ty-no-items");
    public ElementsCollection productsPrice = $$("#sec_discounted_price");



}
