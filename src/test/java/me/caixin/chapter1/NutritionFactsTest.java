package me.caixin.chapter1;

import org.testng.annotations.Test;


/**
 * Project Name: effective-java
 * Package Name: me.caixin.chapter1
 * Function:
 * User: roy
 * Date: 2017-03-05
 */
public class NutritionFactsTest  {


    @Test
    public void testBuilder(){
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(1,2).build();
        System.out.println(nutritionFacts.toString());
    }
}