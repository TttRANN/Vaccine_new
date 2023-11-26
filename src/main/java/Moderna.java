import java.time.LocalDate;
import java.util.ArrayList;

public class Moderna extends Vaccine{
    public Moderna(){
        super();
    }
    @Override

        public void getInfo() {
            location=" Southall";
            vaccine="Moderna ";
            arrayListdose.add("first dose ");
            arrayListdose.add("second dose ");
            arrayListdose.add("third dose ");
            arrayListtime.add(currentDate.plusDays(5));
            arrayListtime.add(currentDate.plusDays(9));
            arrayListtime.add(currentDate.plusDays(13));
            arrayList.add(" nurse");
            arrayList.add(" doctor");
            arrayList.add(" doctor");

            for (int i = 0; i < arrayListtime.size(); i++) {
                System.out.println(vaccine + arrayListdose.get(i) + arrayListtime.get(i).toString() + arrayList.get(i) + location);


            }

        }}
