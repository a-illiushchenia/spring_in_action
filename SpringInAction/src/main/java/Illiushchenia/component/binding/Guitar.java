package Illiushchenia.component.binding;

public class Guitar implements Instrument {
    public Guitar(){};

    @Override
    public void play() {
        System.out.println("BRIAM BRIAM BRIAM");
    }
}
