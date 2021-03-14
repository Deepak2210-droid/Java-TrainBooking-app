import java.util.*;
public class Main {

details d=null;
Customer user=null;
    Customer login()
   {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the user name and password");
       String name=s.next(),pass=s.next();
      
       if(d.cus!=null)
       {
        for(int i=0;i<d.cus.size();i++)
        {
            if(d.cus.get(i).name.equals(name) && d.cus.get(i).password.equals(pass))
            {  System.out.println(d.cus.get(i).name);
                return d.cus.get(i);
              
            }
            System.out.println("vvv");
        }
       }
       
       return null;
   } 
    void signUp()
   {
       Customer obj=new Customer();
            obj.createUser();
            d.cus.add(obj);
            user=login();
   }
   void func1(details det)
   {
    d=det;
   }
   void run()
   {
        System.out.println("1.Login/2.Logout");
        Scanner s=new Scanner(System.in);
        
        int opt=s.nextInt();
        if(opt==1)
        {
            while(user==null)
            {
                user=login();
                if(user==null)
                signUp();
            }
          
        }
        else
        {
            signUp();
        }
        if(user!=null)
            {
               if(d.hmb.containsKey(user))
                {
                    Booking b=d.hmb.get(user);
                    
            System.out.println("contains");
                    b.options(user, b,d);
                } 
                else{
                    
            System.out.println("new");
               Booking b=new Booking();
                d.hmb.put(user,b);
               b.options(user,b,d);
              
           }
           }
        s.close();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to our application");
       details det=new details();
       det.cus.add(new Customer("deepak","1","1","1"));
       Main main=new Main();
       main.func1(det);
      main.run();
    
}
}
