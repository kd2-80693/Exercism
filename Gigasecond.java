import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    LocalDateTime date ;
    public Gigasecond(LocalDate moment) {
        this.date = moment.atStartOfDay();
    }

    public Gigasecond(LocalDateTime moment) {
        this.date = moment ;
    }

    public LocalDateTime getDateTime() {
        return this.date.plusSeconds(1000000000L);
    }
}

