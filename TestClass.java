/**
 * Write a description of class TestClass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestClass
{
    public static void main(String[] args)
    {
        BankAccount a1 = new BankAccount(500, "gesell", 123, "pass");
        System.out.println(a1);
        a1.logIn("gesell", "pass");
        a1.withdraw(100);
        System.out.println(a1);
    }
}
