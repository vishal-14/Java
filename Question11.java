//Q11.Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called
// getDetails which provide
// there specific details like rateofinterest etc,print details of every banks

interface Bank{
    void getBankDetails();
}
class SBI implements Bank{
    private String bankName = "SBI";
    private String branch = "Greater Noida";
    private float rateOfInterest = 4.0f;
    @Override
    public void getBankDetails() {
        System.out.println("Bank name : "+bankName+" Branch Name : "+branch+" Rate Of Interest : "+rateOfInterest);

    }
}
class BOI implements Bank {
    private String bankName = "BOI";
    private String branch = "Greater Noida";
    private float rateOfInterest = 4.2f;
    @Override
    public void getBankDetails() {
        System.out.println("Bank name : "+bankName+" Branch Name : "+branch+" Rate Of Interest : "+rateOfInterest);
    }
}
class ICICI implements Bank {
    private String bankName = "ICICI";
    private String branch = "Noida";
    private float rateOfInterest = 4.9f;
    @Override
    public void getBankDetails() {
        System.out.println("Bank name : "+bankName+" Branch Name : "+branch+" Rate Of Interest : "+rateOfInterest);
    }
}
public class Question11 {

    public static void main(String[] args) {

        SBI sbi = new SBI();
        BOI boi = new BOI();
        ICICI icici = new ICICI();

        sbi.getBankDetails();
        boi.getBankDetails();
        icici.getBankDetails();

    }

}