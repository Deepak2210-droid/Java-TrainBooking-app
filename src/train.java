import java.util.*;

interface createTrain {

    boolean check_Avail();
    int book();
    int check_Wait();
    void view_booked();
    String getName();
    
}
class Train1 implements createTrain{
    ArrayList<Booking> b=new ArrayList<>();
    String name,number;
    int seats;
    int wait;
    int booked;
    Train1(String name,String num,int s,int w,int b)
    {
        this.name=name;
        seats=s;
        wait=w;
        booked=b;
    }
    public boolean check_Avail()
    {
        if(booked==seats)
        return false;
        else
        return true;
    }
    public int book()
    {
        booked++;
        seats--;
        return booked;
    }
    public int check_Wait()
    {
        return wait;
    }
    public  void view_booked()
    {
        for(int i=0;i<b.size();i++)
        {
            System.out.println(i);
        }
    }
    public String getName()
    {
        return name;
    }
}

public class train
{
    details det=null;
    train(details det)
    {
        this.det=det;
        
        det.trains.add(new Train1("Express1","1010",100,0,0));
           det.trains.add(new Train1("Express1","1012",100,0,0));
    }
    createTrain viewTrains(Scanner s)
    {
        
        for(int i=0;i<det.trains.size();i++)
        {
            System.out.println(det.trains.get(i).getName());
        }
        System.out.println("Select your Train");
        int opt=s.nextInt();
        System.out.println(opt);
        createTrain train= det.trains.get(opt-1);
        view_details(train);
        return det.trains.get(opt-1);
    }
    void view_details(createTrain train)
    {
        System.out.println(train.getName());
        System.out.println("Seats Availablity status");
     //   System.out.printl n(train.check_Avail());
        System.out.println(train.check_Wait());
        System.out.println("Booked seats are");
        train.view_booked();
    }
}
