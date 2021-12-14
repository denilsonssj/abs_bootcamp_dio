package br.com.denilsonssj.poo.application.domain;

import java.time.LocalDate;

public class Mentoring extends Content {

    private LocalDate date;

    public Mentoring() {
        super();
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public double calculateXp() {
        return this.XP_DEFAULT + 20d;
    }

    @Override
    public String toString() {
        return String.format("Mentoring {date=%s, description=%s, id=%s, title=%s}",
            this.getDate(), this.getDescription(), this.getId(), this.getTitle());
    }

}
