package org.example.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class Test1 {

    @Test
    void multiplyByTwoEveryElementInTheList() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        List<Integer> multipliedElements = new ArrayList<>();
        Assertions.assertEquals(2, multipliedElements.get(0));
        Assertions.assertEquals(4, multipliedElements.get(1));
        Assertions.assertEquals(6, multipliedElements.get(2));
        Assertions.assertEquals(8, multipliedElements.get(3));
    }

    @Test
    void iterateTheListAndFindTheEvenNumbers() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        List<Integer> multipliedElements = new ArrayList<>();
        Assertions.assertEquals(2, multipliedElements.get(0));
        Assertions.assertEquals(4, multipliedElements.get(1));
    }

    @Test
    void sumAllElementsInTheList() {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        Integer total = 0;
        Assertions.assertEquals(10, total);
    }
}
