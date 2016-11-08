package Illiushchenia.component.binding;

public class GraciousContestant implements Contestant {
    public GraciousContestant(){}

    @Override
    public void receiveAward() {
        System.out.println("GraciousContestant :: receiveAward()");
    }
}
