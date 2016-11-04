package Illiushchenia.component.binding;

@StringedInstrument
public class Cymbal implements Instrument {
    public Cymbal(){};

    @Override
    public void play() {
        System.out.println("CYMB CYMB CYMB");
    }

}
