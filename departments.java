package sai;

public class departments extends vsoftdigital {
    int servicenow = 4;
    int azure = 5;
    int java = 6;
    int aws = 7;
    int mulesoft = 8;

    public departments(String presedent , String Managers , String deprt){
        super(presedent);
    }

    void D1(){
        System.out.println("Service now department has " + " " + servicenow + " " + "manager");
        System.out.println("Java department has" + " " + java + " " + "manager");
        System.out.println("Aws department has " + " " + aws + " " + "manager");
        System.out.println("Azure department has" + " " + azure + " " + "manager");
        System.out.println("Mulesoft department has" + " " + mulesoft + " " + "manager");
        System.out.println("Total no of managers in every department under president : " + (servicenow + java + aws + azure + mulesoft));

    }
}
