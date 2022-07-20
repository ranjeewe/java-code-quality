package solid.singleresponsibilty.complex.correct.util;

import org.junit.Test;
import solid.singleresponsibilty.complex.correct.bean.BookingCriteria;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class CriteriaValidatorTest {
    @Test
    public void testDisplayStudentName() {
        LocalDate fromDate = LocalDate.of(2022, 12, 12);
        LocalDate toDate = LocalDate.of(2022, 12, 14);
        BookingCriteria criteria = new BookingCriteria(fromDate, toDate, 1, 0, 0);
        boolean validationResult = CriteriaValidator.validateCriteria(criteria);
        assertEquals(validationResult, true);
    }

    @Test
    public void testDisplayStudentName1() {
        LocalDate fromDate = LocalDate.of(2022, 12, 12);
        LocalDate toDate = LocalDate.of(2022, 12, 14);
        BookingCriteria criteria = new BookingCriteria(fromDate, toDate, 1, 0, 0);
        boolean validationResult = CriteriaValidator.validateCriteria(criteria);
        assertEquals(validationResult, true);
    }

    @Test
    public void testDisplayStudentName2() {
        LocalDate fromDate = LocalDate.of(2022, 12, 12);
        LocalDate toDate = LocalDate.of(2022, 12, 14);
        BookingCriteria criteria = new BookingCriteria(fromDate, toDate, 1, 0, 0);
        boolean validationResult = CriteriaValidator.validateCriteria(criteria);
        assertEquals(validationResult, true);
    }
}