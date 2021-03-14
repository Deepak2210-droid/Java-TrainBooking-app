import java.util.*;
public class Customer {

    Scanner s=new Scanner(System.in);
    String name,password,age,phonenum;
    Customer(String name,String pass,String age,String ph)
    {
        this.name=name;
        password=pass;
        this.age=age;
        phonenum=ph;
    }
    Customer(){}
    void  createUser()
    {
        System.out.println("Enter your Details");
        name=s.next();
        password=s.next();
        age=s.next();
        phonenum=s.next();

    }

}
