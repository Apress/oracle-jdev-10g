package pack1;

public class AdditionClass
{
    private int iValue1;
    private int iValue2;

    public AdditionClass()
    {
    }

    public static void main(String[] args)
    {
       AdditionClass additionClass = new AdditionClass();

       if (args.length != 2 )
       {
           System.out.println("Usage: AdditionClass <argument 1> <argument 2>");
           return;
       }
       else
       {
           System.out.println(args[0] + " " +args[1]);
           int iResult = additionClass.doAddition(Integer.parseInt(args[0])
             , Integer.parseInt(args[1]));
           System.out.println("Result of addition = "+ iResult);
       }
    }

    int doAddition(int val1, int val2)
    {
        return val1 + val2;
    }
}