package characters;

import Places.Yard;

public interface Isee {
    default void Isee(Carloson carloson, Malich malich, Yard yard){
        System.out.print("We "+carloson.getName()+malich.getName()+" can see ");
        System.out.println(yard.getYardVisitors());


        }

    }

