import java.util.Scanner;

public class Bag_op {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        int op,ch,n=0;
        Scanner sc = new Scanner(System.in);
        Bag obj[] = new Bag[10];
    do
    {  
        System.out.println("Enter 1 to add a ball to bag  ");
        System.out.println("Enter 2 to display all balls form the bag and total weight of bag  ");
        System.out.println("Enter 3 to remove a ball form bag ");
        System.out.println("Enter 4 to exit");
        op = sc.nextInt();
        
        switch(op)
        {

            case 1:

                do
              {
                System.out.println("Enter 1 to add ball to the bag : ");
                System.out.println("Enter 2 to add ball to the bag with colour and weight of your Choice : ");
                System.out.println("Enter 3 to add ball to the bag with colour of your choice : ");
                System.out.println("Enter 4 to add ball to the bag with weight of your choice : ");
                System.out.println("Enter 5 to Exit ");
                ch = sc.nextInt();
                
                switch(ch)
                {
                 case 1:
                        n = Bag.return_totobj();
                        obj[n] = new Bag();
                        break;
                 case 2:
                        n = Bag.return_totobj();
                        System.out.println("Enter colour of ball : ");
                        String col;
                        col = sc.next();
                         System.out.println("Enter Weight of the ball : ");
                        float wt;
                        wt = sc.nextFloat();
                        obj[n] = new Bag(col, wt);
                        break;
                case 3:
                        n = Bag.return_totobj();
                        System.out.println("Enter colour of ball : ");
                        col = sc.next();
                        obj[n] = new Bag(col);
                        break;
                case 4:
                        n = Bag.return_totobj();
                        System.out.println("Enter Weight of the ball : ");
                        wt = sc.nextFloat();
                        obj[n] = new Bag(wt);
                        break;
                }

               }while(ch != 5);
               break;
            
            
            case 2:
                int p;
                p = Bag.return_totobj();
                Bag.diplay(obj,p);
                break;
            case 3:
                int record;
                p = Bag.return_totobj();
                Bag.diplay(obj,p);
                System.out.println("Please Enter th index of the ball you want to remove from bag ");
                record = sc.nextInt();
                Bag.removeobj(obj ,record,p);
                break;
                





        
        }
    
    }while(op != 4);
    
    }
}