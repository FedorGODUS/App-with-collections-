package characters;
public abstract class Human {
    public enum aMood {HAPPY, NORMAL, UNHAPPY}

    private  aMood MyMood;

    public enum Gender {MALE, FEMALE}

    private String Name;

    public Human(String aName, Gender gender,aMood Mymood) {
        Name = aName;

    }

    public String getName() {
        return Name;
    }


    public  void SetMyMood(aMood myMood) {
        MyMood = myMood;
    }

    public aMood getMyMood() {
        return MyMood;
    }

    public void Zdorovat(Human human) {
        System.out.println("Hello, I am " + getName() + " nice to meet u " + human.getName());
    }

    @Override
    public String toString() {
        return " настроение " + getMyMood() + " имя " + getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human character = (Human) o;
        return this.getMyMood() == character.getMyMood() &&
                this.getName().equals(character.getName());
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = result + MyMood.hashCode();
        result = result + Name.hashCode();
        return result;
    }
}

