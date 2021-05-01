package main.day2;

import java.util.Date;

public class MyCourses extends Course{

    private Date startDate;
    private Date endDate;
    private int progress;

    public MyCourses() {
    }

    public MyCourses(Date startDate, Date endDate, int progress) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.progress = progress;
    }

    public MyCourses(int id, String name, Double price, Date startDate, Date endDate, int progress) {
        super(id, name, price);
        this.startDate = startDate;
        this.endDate = endDate;
        this.progress = progress;
    }

    public Date getStartDate() {
        return startDate;
    }

    public MyCourses setStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    public Date getEndDate() {
        return endDate;
    }

    public MyCourses setEndDate(Date endDate) {
        this.endDate = endDate;
        return this;
    }

    public int getProgress() {
        return progress;
    }

    public MyCourses setProgress(int progress) {
        this.progress = progress;
        return this;
    }
}
