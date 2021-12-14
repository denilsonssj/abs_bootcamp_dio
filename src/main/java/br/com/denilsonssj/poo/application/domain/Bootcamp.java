package br.com.denilsonssj.poo.application.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

public class Bootcamp {
    
    private UUID id;

    private String name;

    private String description;

    private Set<Content> contents;

    private Set<Developer> subscribedDevelopers;

    private final LocalDate startDate;

    private final LocalDate endDate;

    public Bootcamp() {
        super();
        final int TOTAL_DAYS_PERIOD = 45;
        this.id = UUID.randomUUID();
        this.contents = new HashSet<>();
        this.subscribedDevelopers = new HashSet<>();
        this.startDate = LocalDate.now();
        this.endDate = this.startDate.plusDays(TOTAL_DAYS_PERIOD);
    }

    public UUID getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Content> getContents() {
        return this.contents;
    }

    public void setContents(Set<Content> contents) {
        this.contents = contents;
    }

    public LocalDate getStartDate() {
        return this.startDate;
    }

    private LocalDate getEndDate() {
        return this.endDate;
    }

    public void setSubscribedDevelopers(Set<Developer> subscribedDevelopers) {
        this.subscribedDevelopers = subscribedDevelopers;
    }

    public Set<Developer> getSubscribedDevelopers() {
        return this.subscribedDevelopers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(this.name, bootcamp.getName())
            && Objects.equals(this.description, bootcamp.description)
            && Objects.equals(this.startDate, bootcamp.startDate)
            && Objects.equals(this.endDate, bootcamp.endDate)
            && Objects.equals(this.contents, bootcamp.contents)
            && Objects.equals(this.subscribedDevelopers, bootcamp.subscribedDevelopers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            this.name,
            this.description,
            this.startDate,
            this.endDate,
            this.subscribedDevelopers,
            this.contents
        );
    }

}
