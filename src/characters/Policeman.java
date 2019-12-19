package characters;

public class Policeman extends Human {
    private String Position;

    public Policeman(String aName, Gender gender, String Position, aMood Mymood) {
        super(aName, gender,Mymood);
        this.Position = Position;

    }


    @Override
    public String toString() {
        return " настроение "+getMyMood() +" имя " +getName()+" должность "+getPosition();
    }

    private String getPosition() {
        return Position;
    }



}
