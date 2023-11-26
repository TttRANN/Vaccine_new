import java.time.LocalDate;
import java.util.ArrayList;

public class Pfizer extends Vaccine {

    public Pfizer() {
        super();

    }

    @Override
    public void getInfo() {
        location=" Epping";
        vaccine="Pfizer ";
        arrayListdose.add("first dose ");
        arrayListdose.add("second dose ");
        arrayListtime.add(currentDate.plusDays(5));
        arrayListtime.add(currentDate.plusDays(11));
        arrayList.add(" doctor");
        arrayList.add(" nurse");
        for (int i = 0; i < arrayListtime.size(); i++) {
            System.out.println(vaccine+arrayListdose.get(i) + arrayListtime.get(i).toString() + arrayList.get(i) + location);


        }


    }


}
