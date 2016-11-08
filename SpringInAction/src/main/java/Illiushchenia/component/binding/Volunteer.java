package Illiushchenia.component.binding;

public class Volunteer implements Thinker {
    private String thoughts;

    public Volunteer(){}

    @Override
    public void thinkOfSomething(String thoughts) {
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}
