import java.util.*;

public class Booking {
    details det=null;
    Booking book=null;
    Customer cus=null;
    createTrain train=null;
    int seatNum=-1;
    void options(Customer user,Booking b,details d)
    {
        cus=user;
        book=b;
        det=d;
        while(true)
        {
            System.out.println("1.Book Tickets");
            System.out.println("2.Cancel Tickets");
            System.out.println("3.View status");
            System.out.println("4.Quit");
            Scanner s=new Scanner(System.in);
            int opt=s.nextInt();
            if(opt==1)
            {
                book(s);
            }
            if(opt==2)
            {
                cancel(s);
            }
            if(opt==3)
            {
                view_status(s);
            }
            if(opt==4)
            {
                return;
            }
        }
    }
    void book(Scanner s)
    {
        System.out.println("Available Trains");
        train tt=new train(det);
        train= tt.viewTrains(s);
        System.out.println(train.getName());
        det.hmb.put(cus,book);
         System.out.println("Click any number to go to main page");
        String str=s.next();
        if(str.length()>0)
        return;
    }
    void cancel(Scanner s)
    {
        if(det.hmb.containsKey(cus))
        {
            System.out.println(cus.name+" "+cus.password);
            det.hmb.remove(cus);
            System.out.println("your Ticket has been canceled successfully");
        }
        else
        {
            System.out.println("You haven't booked any tickets!!!");
        }
        System.out.println("Click any number to go to main page");
        String str=s.next();
        if(str.length()>0)
        return;
    }
    void view_status(Scanner s)
    {
        if(det.hmb.containsKey(cus))
        {
            System.out.println(cus.name+" "+cus.password);
        }
        else
        {
            System.out.println("You haven't booked any tickets!!!");
        }
        System.out.println("Click any number to go to main page");
        String str=s.next();
        if(str.length()>0)
        return;

    }
}
