package de.iweinzierl.jsonformat.html;

import com.google.gson.JsonObject;
import de.iweinzierl.jsonformat.JsonFactory;
import de.iweinzierl.jsonformat.TestConstants;
import org.junit.Assert;
import org.junit.Test;

public class ObjectFormatterTest {

    @Test
    public void testObjectSimple() {
        JsonObject obj = JsonFactory.createObjectSimple();

        String formattedObj = new ObjectFormatter(0).format(obj);
        System.out.println("Simple Object: " + formattedObj);

        Assert.assertNotNull(formattedObj);
        Assert.assertEquals(TestConstants.OBJECT_SIMPLE, formattedObj);
    }

    @Test
    public void testObjectWithObject() {
        JsonObject obj = JsonFactory.createObjectWithObject();

        String formattedObj = new ObjectFormatter(0).format(obj);
        System.out.println("Object with Object: " + formattedObj);

        Assert.assertNotNull(formattedObj);
        Assert.assertEquals(TestConstants.OBJECT_WITH_OBJECT, formattedObj);
    }

    @Test
    public void testObjectWithObjectArray() {
        JsonObject obj = JsonFactory.createObjectWithObjectArray();

        String formattedObj = new ObjectFormatter(0).format(obj);
        System.out.println("Object with Object Array: " + formattedObj);

        Assert.assertNotNull(formattedObj);
        Assert.assertEquals(TestConstants.OBJECT_WITH_OBJECT_ARRAY, formattedObj);
    }
}
