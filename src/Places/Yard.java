package Places;


import characters.*;


import java.util.ArrayList;

public class Yard implements Isee {

    private ArrayList<Human> YardVisitors = new ArrayList<>();

    public void AddYardVisitor(Human visitor) {
        System.out.println("vo dvore " + visitor.getName());
        YardVisitors.add(visitor);
    }

    public ArrayList<Human> getYardVisitors() {
        return YardVisitors;
    }


}




