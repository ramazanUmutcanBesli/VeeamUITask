package com.veeam.utilities;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {
    public static void sleep(int value){
        try{
            Thread.sleep(value);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    /**
     *This method will verify if the current URL contains expected Value.
     * @param expectedInURL
     *
     */
    public static void verifyURLContains(String expectedInURL){
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedInURL));
    }
    public static void verifyTitleContains(String expectedTitle){
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedTitle));
    }
    public static void listOfProducts(List<WebElement> products,Integer numberOfIntendedProducts){
        for (int i = 0; i < numberOfIntendedProducts; i++) {
            products.get(i).click();
        }
    }
//    public static void deleteCheaperProducts(List<WebElement> cheaperProducts){
//
//        for (int i = 0; i < cheaperProducts.size(); i++) {
//            if
//        }
//    }

    public static List<WebElement> cheaperProductList(List<WebElement> productList){
        WebElement expProduct=productList.get(0);
        List<WebElement> cheaperProducts=new ArrayList<>();
        try {
            for (int i =1;i<productList.size();i++){
                if (Integer.parseInt(expProduct.getText())>=Integer.parseInt(productList.get(i).getText())){
                    cheaperProducts.add(productList.get(i));
                }
                else{
                    expProduct=productList.get(i);
                }
            }
        }
        catch (NumberFormatException exception){
            exception.printStackTrace();
        }
        return cheaperProducts;
    }
}
