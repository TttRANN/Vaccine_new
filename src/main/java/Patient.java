public class Patient {

    private String name;
    private boolean pfizer;
    private boolean moderna;
    private  String vacc;
    public Patient(String name, boolean pfizer, boolean moderna){
        this.name=name;
        this.pfizer=pfizer;
        this.moderna=moderna;

    }

    public String getName() {
        return name;
    }

    public boolean isModerna() {
        return moderna;
    }

    public boolean isPfizer() {
        return pfizer;
    }


    public void getInfo(){
        System.out.println(getName());

        if (isModerna()==true){


            Pfizer pfizer1 = new Pfizer();
            pfizer1.getInfo();



        }
        if(isPfizer()==true){

            Moderna moderna1 = new Moderna();


            moderna1.getInfo();



        }





    }
}
