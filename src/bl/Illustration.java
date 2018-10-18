package bl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Illustration {
    private final int id;
    private final String title;
    private final LocalDate addingDate;

    public static final DateTimeFormatter DATEFORMATTER = 
            DateTimeFormatter.ofPattern("dd.MM.yyyy");
    
    public Illustration(int id, String title, LocalDate addingDate) {
        this.id = id;
        this.title = title;
        this.addingDate = addingDate;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAddingDate() {
        return addingDate.format(DATEFORMATTER);
    }
    
    
}
