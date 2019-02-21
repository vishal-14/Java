//3. WAP to produce NoClassDefFoundError and ClassNotFoundException exception.
class A
{
    // some code
}
public class Question3 {

    public void ClassnotFoundFun()
    {
        try
        {
            Class.forName("test");
        }catch (ClassNotFoundException e)
        {

            e.printStackTrace();
        }finally {
            //Delete A.class file and Question3.class file to get NoClassDefError
            A a = new A();
        }
    }

    public static void main(String[] args) {
        Question3 sc=new Question3();
        sc.ClassnotFoundFun();
    }
}
