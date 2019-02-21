//5. WAP to show object cloning in java using cloneable.
public class Question5 implements Cloneable{
    int no;

    Question5(int no){
        this.no = no;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {

        try{

            Question5 qus = new Question5(10);
            Question5 qus1 = (Question5)qus.clone();
            System.out.println(qus.no);
            System.out.println(qus1.no);
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}