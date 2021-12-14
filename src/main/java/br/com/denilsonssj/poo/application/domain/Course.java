package br.com.denilsonssj.poo.application.domain;

public class Course extends Content {

    private int workload;

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public double calculateXp() {
        return this.XP_DEFAULT * this.workload;
    }

    @Override
    public String toString() {
        return String.format("Course {id='%s', title=%s,workload='%s'}",
            this.getId(), this.getId(), this.workload);
    }

}
