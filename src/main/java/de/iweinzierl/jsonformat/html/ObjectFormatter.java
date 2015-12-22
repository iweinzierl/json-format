package de.iweinzierl.jsonformat.html;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.Map;

public class ObjectFormatter extends AbstractFormatter {

    private final StringBuilder builder;

    private int indent;

    public ObjectFormatter(int indent) {
        this.builder = new StringBuilder();
        this.indent = indent;
    }

    public String format(JsonObject obj) {
        builder.append("{<br>");

        boolean isFirst = true;

        for (Map.Entry<String, JsonElement> entry : obj.entrySet()) {
            if (!isFirst) {
                builder.append(",");
                builder.append("<br>");
            }

            builder.append(createIndent(indent + 1));
            builder.append(entry.getKey());
            builder.append(": ");

            if (entry.getValue().isJsonPrimitive()) {
                builder.append(entry.getValue());
            } else if (entry.getValue().isJsonNull()) {
                builder.append("null");
            } else if (entry.getValue().isJsonObject()) {
                builder.append(new ObjectFormatter(this.indent + 1).format(entry.getValue().getAsJsonObject()));
            } else if (entry.getValue().isJsonArray()) {
                builder.append(new ArrayFormatter(this.indent + 1).format(entry.getValue().getAsJsonArray()));
            }

            isFirst = false;
        }

        builder.append("<br>");
        builder.append(createIndent(indent));
        builder.append("}");

        return builder.toString();
    }
}
