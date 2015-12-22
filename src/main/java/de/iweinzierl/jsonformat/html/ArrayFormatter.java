package de.iweinzierl.jsonformat.html;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

public class ArrayFormatter extends AbstractFormatter {

    private final StringBuilder builder;

    private int indent;

    public ArrayFormatter(int indent) {
        this.builder = new StringBuilder();
        this.indent = indent;
    }

    public String format(JsonArray arr) {
        builder.append("[");
        builder.append("<br>");

        boolean isFirst = true;

        for (JsonElement json : arr) {
            if (!isFirst) {
                builder.append(",");
                builder.append("<br>");
            }

            builder.append(createIndent(indent + 1));

            if (json.isJsonPrimitive()) {
                builder.append(json);
            } else if (json.isJsonNull()) {
                builder.append("null");
            } else if (json.isJsonObject()) {
                builder.append(new ObjectFormatter(this.indent + 1).format(json.getAsJsonObject()));
            } else if (json.isJsonArray()) {
                builder.append(new ArrayFormatter(this.indent + 1).format(json.getAsJsonArray()));
            }

            isFirst = false;
        }

        builder.append("<br>");
        builder.append(createIndent(this.indent));
        builder.append("]");

        return builder.toString();
    }
}
