package br.com.denilsonssj.poo.application.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Developer {

    private String name;

    private Set<Content> subscriptionsContent;

    private Set<Content> completedSubscriptions;

    public Developer() {
        this.subscriptionsContent = new LinkedHashSet<>();
        this.completedSubscriptions = new LinkedHashSet<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void subscribeBootcamp(Bootcamp bootcamp) {
        this.subscriptionsContent.addAll(bootcamp.getContents());
        bootcamp.getSubscribedDevelopers().add(this);
    }

    public void levelUp() {
        Optional<Content> content = this.subscriptionsContent.stream().findFirst();
        if (content.isPresent()) {
            this.completedSubscriptions.add(content.get());
            this.subscriptionsContent.remove(content.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }

    public double calculateTotalXp() {
        return this.completedSubscriptions.stream()
            .mapToDouble(Content::calculateXp)
            .sum();
    }

    public Set<Content> getSubscriptions() {
        return this.subscriptionsContent;
    }

    public void setSubscriptions(Set<Content> subscriptions) {
        this.subscriptionsContent = subscriptions;
    }

    public Set<Content> getCompletedSubscriptions() {
        return completedSubscriptions;
    }

    public void setCompletedSubscriptions(Set<Content> completedSubscriptions) {
        this.completedSubscriptions = completedSubscriptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Developer developer = (Developer) o;
        return Objects.equals(this.name, developer.getName())
            && Objects.equals(this.subscriptionsContent, developer.getSubscriptions())
            && Objects.equals(
                this.completedSubscriptions, developer.getCompletedSubscriptions());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.completedSubscriptions, this.completedSubscriptions);
    }

}
