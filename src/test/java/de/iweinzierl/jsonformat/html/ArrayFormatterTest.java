package de.iweinzierl.jsonformat.html;

import com.google.gson.JsonArray;
import de.iweinzierl.jsonformat.JsonFactory;
import de.iweinzierl.jsonformat.TestConstants;
import org.junit.Assert;
import org.junit.Test;

public class ArrayFormatterTest {

    @Test
    public void testArraySimple() {
        JsonArray arr = JsonFactory.createArraySimple();

        String formattedArr = new ArrayFormatter(0).format(arr);
        System.out.println("Array Simple: " + formattedArr);

        Assert.assertNotNull(formattedArr);
        Assert.assertEquals(TestConstants.ARRAY_SIMPLE, formattedArr);
    }

    @Test
    public void testArrayWithObjects() {
        JsonArray arr = JsonFactory.createArrayWithObjects();

        String formattedArr = new ArrayFormatter(0).format(arr);
        System.out.println("Array with Objects:" + formattedArr);

        Assert.assertNotNull(formattedArr);
        Assert.assertEquals(TestConstants.ARRAY_WITH_OBJECTS, formattedArr);
    }
}
