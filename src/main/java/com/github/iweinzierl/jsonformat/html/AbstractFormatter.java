package com.github.iweinzierl.jsonformat.html;

public abstract class AbstractFormatter {

    private static final String INDENT = "&nbsp;&nbsp;";

    public String createIndent(int indent) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < indent; i++) {
            builder.append(INDENT);
        }
        return builder.toString();
    }
}
