import java.util.ArrayList;
import java.util.Comparator;

public class rabbitprint {
    public static void main(String[] args) {
        rabbit1 rabbit1 = new rabbit1("Buger", 3 );
        rabbit1 rabbit2 = new rabbit1("Thumper", 2);
        raceRabbit fasty = new raceRabbit("fasty", 23, "fast", 8);
        meatRabbit fatty = new meatRabbit("fatty", 4, "seed", 3);
        // Print the first Rabbit object
        System.out.println("First Rabbit Object:");
        System.out.println(rabbit1);

        // Print the second Rabbit object
        System.out.println("Second Rabbit Object:");
        System.out.println(rabbit2);
        
    
    
        System.out.println(fasty);
        System.out.println(fatty);
        ArrayList rabbitlist=new ArrayList ();
        rabbitlist.add(rabbit1);
        rabbitlist.add(rabbit2);
        rabbitlist.add(fasty);
        rabbitlist.add(fatty);
        //the printer for our array list.
        for(int i=0;i<rabbitlist.size() ;i++) { 
            rabbit1=(rabbit1) rabbitlist.get(i);
            System.out.println(rabbit1);
    }
    rabbitlist.sort();
}
}