package characters;
public interface HearFromDownstair {
    default void IHear(Carloson c, Malich m, Man M,Policeman policeman) {
        System.out.println("я " + c.getName() + " and " + m.getName() + " слышим, что "+M.getName()+" зовёт "+policeman.getName());
        M.SetMyMood(Human.aMood.HAPPY);
    }
}
