package de.iweinzierl.jsonformat;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import de.iweinzierl.jsonformat.html.AbstractFormatter;
import de.iweinzierl.jsonformat.html.ArrayFormatter;
import de.iweinzierl.jsonformat.html.ObjectFormatter;

public class HtmlFormatter extends AbstractFormatter {

    private int indent;
    private StringBuilder builder;

    public HtmlFormatter() {
        this.indent = 0;
        this.builder = new StringBuilder();
    }

    public String format(JsonElement json) {
        if (json.isJsonPrimitive()) {
            // TODO makes sense??
            builder.append(createIndent(indent));
            builder.append(json.getAsString());
        } else if (json.isJsonObject()) {
            JsonObject obj = json.getAsJsonObject();
            builder.append(new ObjectFormatter(this.indent).format(obj));
        } else if (json.isJsonArray()) {
            JsonArray arr = json.getAsJsonArray();
            builder.append(new ArrayFormatter(this.indent).format(arr));
        }

        return builder.toString();
    }
}
