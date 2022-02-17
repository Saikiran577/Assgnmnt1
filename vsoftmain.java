package sai;

public class vsoftmain extends departments {
    public vsoftmain(String presedent, String Managers, String deprt) {
        super(presedent, Managers, deprt);
    }


    public static void main(String[] args) {
         vsoftdigital v1 = new vsoftdigital("Poornaveer");
        System.out.println("Ceo of Vsoft is "+v1.President);

        System.out.println("");

        departments d2 = new departments("Poorna veer" , "Managers", "Departments");
        System.out.println("   ");
        d2.D1();

        System.out.println("");

        devlopers dd3 = new devlopers("Poorna veer ", "managers","Department");
        dd3.f1();
    }
}
