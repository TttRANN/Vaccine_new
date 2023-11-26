import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Vaccine {
    protected String location;
    protected String vaccine;
    protected ArrayList arrayList;
    protected LocalDate currentDate;
    protected ArrayList arrayListtime;
    protected ArrayList arrayListdose;

    public Vaccine() {
        location = location;
        vaccine = vaccine;
        this.arrayList = new ArrayList<String>();
        this.currentDate = LocalDate.now();
        this.arrayListtime = new ArrayList<LocalDate>();
        this.arrayListdose = new ArrayList<String>();
    }

    public abstract void getInfo();
}
