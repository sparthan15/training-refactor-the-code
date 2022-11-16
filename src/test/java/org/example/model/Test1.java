package org.example.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

    @Test
    void multiplyByTwoEveryElementInTheList(){
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        List<Integer> multipliedElements =new ArrayList<>();
        Assertions.assertEquals(multipliedElements.get(0), 2);
        Assertions.assertEquals(multipliedElements.get(1), 4);
        Assertions.assertEquals(multipliedElements.get(2), 6);
        Assertions.assertEquals(multipliedElements.get(3), 8);
    }

    @Test
    void iterateTheListAndFindTheEvenNumbers(){
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        List<Integer> multipliedElements = new ArrayList<>();
        Assertions.assertEquals(multipliedElements.get(0), 2);
        Assertions.assertEquals(multipliedElements.get(1), 4);
    }

}
