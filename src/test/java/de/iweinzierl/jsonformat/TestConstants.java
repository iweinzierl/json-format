package de.iweinzierl.jsonformat;

public class TestConstants {

    public static final String ARRAY_SIMPLE = "[<br>" +
            "&nbsp;&nbsp;\"value1\",<br>" +
            "&nbsp;&nbsp;\"value2\",<br>" +
            "&nbsp;&nbsp;\"value3\"<br>" +
            "]";

    public static final String ARRAY_WITH_OBJECTS = "[<br>" +
            "&nbsp;&nbsp;{<br>" +
            "&nbsp;&nbsp;&nbsp;&nbsp;prop11: \"value11\",<br>" +
            "&nbsp;&nbsp;&nbsp;&nbsp;prop12: 12<br>" +
            "&nbsp;&nbsp;},<br>" +
            "&nbsp;&nbsp;{<br>" +
            "&nbsp;&nbsp;&nbsp;&nbsp;prop21: \"value21\",<br>" +
            "&nbsp;&nbsp;&nbsp;&nbsp;prop22: 22<br>" +
            "&nbsp;&nbsp;}<br>" +
            "]";

    public static final String OBJECT_SIMPLE = "{<br>" +
            "&nbsp;&nbsp;prop1: \"value1\",<br>" +
            "&nbsp;&nbsp;prop2: 2,<br>" +
            "&nbsp;&nbsp;prop3: true<br>" +
            "}";

    public static final String OBJECT_WITH_OBJECT = "{<br>" +
            "&nbsp;&nbsp;prop1: \"value1\",<br>" +
            "&nbsp;&nbsp;prop2: {<br>" +
            "&nbsp;&nbsp;&nbsp;&nbsp;prop21: \"value21\",<br>" +
            "&nbsp;&nbsp;&nbsp;&nbsp;prop22: 22<br>" +
            "&nbsp;&nbsp;}<br>" +
            "}";

    public static final String OBJECT_WITH_OBJECT_ARRAY = "{<br>" +
            "&nbsp;&nbsp;prop1: \"value1\",<br>" +
            "&nbsp;&nbsp;prop2: [<br>" +
            "&nbsp;&nbsp;&nbsp;&nbsp;{<br>" +
            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;prop21: \"value21\",<br>" +
            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;prop22: 22<br>" +
            "&nbsp;&nbsp;&nbsp;&nbsp;},<br>" +
            "&nbsp;&nbsp;&nbsp;&nbsp;{<br>" +
            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;prop31: \"value31\",<br>" +
            "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;prop32: 32<br>" +
            "&nbsp;&nbsp;&nbsp;&nbsp;}<br>" +
            "&nbsp;&nbsp;]<br>" +
            "}";
}
