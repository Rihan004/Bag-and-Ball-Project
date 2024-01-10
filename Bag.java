public class Bag {
   
   private  String colour; float weight ;
   private static int total_objects ;
   private static float total_weight;

   
    public Bag()
    {
        colour = "White";
        weight = 10;
        total_weight = total_weight + weight;
        total_objects = total_objects + 1;

    }

    public Bag(String clr)
    {   

        colour = clr;
         weight = 10;
         total_weight = total_weight + weight;
         total_objects = total_objects + 1;
    }
   
    public Bag(float wt)
    { 
        colour = "White";
        weight = wt;
        total_weight = total_weight + weight;
        total_objects = total_objects + 1;
    }

    public Bag(String clr, float wt)
    {
        colour = clr;
        weight = wt;
        total_weight = total_weight + weight;
        total_objects = total_objects + 1;
    }


    public static int return_totobj()
    {
        int n = total_objects;

        return n;
    } 

    public static void diplay(Bag obj[],int n)
    {   int j =0;
        for(j=0; j<n; j++)
        {
            System.out.println(j+" "+obj[j].colour+" "+obj[j].weight);
        }
    }

    public static void output()
    {
       
        System.out.println("Total Weight"+ total_weight);
        System.out.println("Total objects are: "+total_objects);
    }

    public static void removeobj(Bag obj[],int record,int n)
    {
        total_weight = total_weight - obj[record].weight;
        int i=record;
        for(i=record; i<n-1; i++)
        {
            obj[i] = obj[i+1];
        }
        n = n-1;

        total_objects = total_objects -1;
    }
}
