package Staff;

public class Propeller {
    private  int Blades;
    private  String NameOfPropeller;
    private  int Lenght;

    public Propeller(String aName,int aBlades, int aLenght){
        NameOfPropeller = aName;
        Blades = aBlades;
        Lenght = aLenght;
    }
    public  int getLenght(){
        return Lenght;
    }
    public  int getBlades(){
        return Blades;
    }
    public  String getNameOfPropeller(){
        return NameOfPropeller;
    }



}
