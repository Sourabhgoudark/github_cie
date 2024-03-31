import java.time.LocalDate;
import java.time.Period;

class DateOfBirth {
    private String birthDate;

    public DateOfBirth(String birthDate) {
        this.birthDate = birthDate;
    }

    public int calculateAge(String currentDate) {
        LocalDate birthDate = LocalDate.parse(this.birthDate);
        LocalDate currentDateParsed = LocalDate.parse(currentDate);
        return Period.between(birthDate, currentDateParsed).getYears();
    }
}