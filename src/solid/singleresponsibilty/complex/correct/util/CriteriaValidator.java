package solid.singleresponsibilty.complex.correct.util;

import solid.singleresponsibilty.complex.correct.bean.BookingCriteria;

public class CriteriaValidator {

    public static boolean validateCriteria(BookingCriteria criteria) {
        if (criteria.getFromDate().isAfter(criteria.getToDate())) {
            System.out.println("Incorrect date range");
            return false;
        }
        if (criteria.getAdult() <= 0) {
            System.out.println("At least one adult should be included");
            return false;
        }
        return true;
    }
}