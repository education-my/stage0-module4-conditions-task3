package school.mjc.stage0.conditions.task3;

import java.time.LocalDate;
import java.time.YearMonth;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (month <= 12 && month >= 1) {
            YearMonth yearMonth = YearMonth.of(LocalDate.now().getYear(), month);
            System.out.println(yearMonth.lengthOfMonth());
        } else {
            System.out.println("wrong number!");
        }
    }
}
