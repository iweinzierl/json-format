package de.iweinzierl.jsonformat.html;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import de.iweinzierl.jsonformat.HtmlFormatter;
import de.iweinzierl.jsonformat.JsonFactory;
import de.iweinzierl.jsonformat.TestConstants;
import org.junit.Assert;
import org.junit.Test;

public class HtmlFormatterTest {

    @Test
    public void testArraySimple() {
        JsonArray arr = JsonFactory.createArraySimple();

        String formattedArr = new HtmlFormatter().format(arr);
        System.out.println("Array Simple: " + formattedArr);

        Assert.assertNotNull(formattedArr);
        Assert.assertEquals(TestConstants.ARRAY_SIMPLE, formattedArr);
    }

    @Test
    public void testArrayWithObjects() {
        JsonArray arr = JsonFactory.createArrayWithObjects();

        String formattedArr = new HtmlFormatter().format(arr);
        System.out.println("Array with Objects:" + formattedArr);

        Assert.assertNotNull(formattedArr);
        Assert.assertEquals(TestConstants.ARRAY_WITH_OBJECTS, formattedArr);
    }

    @Test
    public void testObjectSimple() {
        JsonObject obj = JsonFactory.createObjectSimple();

        String formattedObj = new HtmlFormatter().format(obj);
        System.out.println("Simple Object: " + formattedObj);

        Assert.assertNotNull(formattedObj);
        Assert.assertEquals(TestConstants.OBJECT_SIMPLE, formattedObj);
    }

    @Test
    public void testObjectWithObject() {
        JsonObject obj = JsonFactory.createObjectWithObject();

        String formattedObj = new HtmlFormatter().format(obj);
        System.out.println("Object with Object: " + formattedObj);

        Assert.assertNotNull(formattedObj);
        Assert.assertEquals(TestConstants.OBJECT_WITH_OBJECT, formattedObj);
    }
}
