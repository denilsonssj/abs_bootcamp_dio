package br.com.denilsonssj.poo.application.domain;

import java.util.UUID;

public abstract class Content {

    protected final double XP_DEFAULT = 10d;

    private UUID id;

    private String title;

    private String description;

    public Content() {
        super();
        this.id = UUID.randomUUID();
    }

    public abstract double calculateXp();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
