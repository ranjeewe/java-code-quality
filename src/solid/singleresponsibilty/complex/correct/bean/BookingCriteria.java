package solid.singleresponsibilty.complex.correct.bean;

import java.time.LocalDate;

public class BookingCriteria {
    private LocalDate fromDate;
    private LocalDate toDate;
    private int adult;
    private int child;
    private int infant;

    public BookingCriteria(LocalDate fromDate,
                           LocalDate toDate,
                           int adult,
                           int child,
                           int infant) {
        this.fromDate = fromDate;
        this.toDate = toDate;
        this.adult = adult;
        this.child = child;
        this.infant = infant;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public int getAdult() {
        return adult;
    }

    public void setAdult(int adult) {
        this.adult = adult;
    }

    public int getChild() {
        return child;
    }

    public void setChild(int child) {
        this.child = child;
    }

    public int getInfant() {
        return infant;
    }

    public void setInfant(int infant) {
        this.infant = infant;
    }

    @Override
    public String toString() {
        return "BookingCriteria{" +
                "fromDate=" + fromDate +
                ", toDate=" + toDate +
                ", adult=" + adult +
                ", child=" + child +
                ", infant=" + infant +
                '}';
    }
}