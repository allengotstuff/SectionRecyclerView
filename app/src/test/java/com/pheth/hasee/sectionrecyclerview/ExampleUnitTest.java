package com.pheth.hasee.sectionrecyclerview;

import org.junit.Test;

import java.util.ArrayList;

import Data.ItemObject;
import Data.SectionObject;
import Data.TestDataGeneration;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
//        assertEquals(4, 2 + 2);

        ArrayList<SectionObject> testData = TestDataGeneration.getTestData();
        assertEquals(testData.size(), 3);

        ItemObject itemObject = ((SectionObject)testData.get(2)).listOfObject.get(1);
        assertEquals(itemObject.imageSource, 10);
    }
}