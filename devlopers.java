package sai;

public class devlopers extends vsoftdigital {
    public devlopers(String president, String Managers , String deprt) {
        super(president);
    }
    int ServicenowDevelopers=23;
    int JavaDevelopers=45;
    int AwsDevelopers=57;
    int Azuredevelopers=15;
    int Mulesoft=49;

    void f1(){
        System.out.println("service now department has" + " " + ServicenowDevelopers + "  " + "developers");
        System.out.println("Java department has" + " "  + JavaDevelopers + " " + "developers");
        System.out.println("Aws department has" + " " + AwsDevelopers + " " +  "developers");
        System.out.println("Mulesoft department has" + " " + Mulesoft + " " + "developers");
        System.out.println("Azure department has" + " "+ Azuredevelopers + " "+ "developers");
        System.out.println("Total Number of Developers in each department under manager : " + (ServicenowDevelopers+JavaDevelopers+Azuredevelopers+AwsDevelopers+Mulesoft));
    }


}
