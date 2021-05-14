package com.example.testjacoco;

public class Testjacoco {

    private final long id;
    private final String content;

    public Testjacoco(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
