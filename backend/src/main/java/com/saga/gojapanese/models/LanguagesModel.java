package com.saga.gojapanese.models;

public class LanguagesModel {
    private final long id;
    private final String jp;

    public LanguagesModel(long id, String jp) {
        this.id = id;
        this.jp = jp;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return jp;
    }
}
