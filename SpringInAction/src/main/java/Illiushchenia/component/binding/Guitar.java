package Illiushchenia.component.binding;

//@Component
@StringedInstrument
@Strummed
public class Guitar implements Instrument {
    public Guitar(){};

    @Override
    public void play() {
        System.out.println("BRIAM BRIAM BRIAM");
    }
}
