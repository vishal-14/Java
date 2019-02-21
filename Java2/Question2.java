//2. WAP to sorting string without using string Methods?.
import java.util.Scanner;
public class Question2{
    public void getString()
    {
        char temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String");
        String str= sc.nextLine();
        this.sorted(str);
    }

    public void sorted(String str)
    {
        char temp;
        char[] chArry=str.toCharArray();
        for(int i=0;i<chArry.length;i++){
            for(int j=0;j<chArry.length-i-1;j++){
                if(chArry[j]>chArry[j+1])
                {
                    temp=chArry[j];
                    chArry[j]=chArry[j+1];
                    chArry[j+1]=temp;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char ch: chArry) {
            sb.append(ch);
        }

        String sortedstring = sb.toString();
        System.out.println("Sorted String: "+sortedstring);
    }



    public static void main(String[] args) {
        Question2 f1=new Question2();
        f1.getString();

    }
}
