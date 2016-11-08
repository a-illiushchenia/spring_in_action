package Illiushchenia.component.binding;

public class Telepat  implements MindReader{
    private String thoughts;

    public Telepat(){}

    @Override
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer’s thoughts");
        this.thoughts = thoughts;
    }

    @Override
    public String getThoughts() {
        return thoughts;
    }
}
