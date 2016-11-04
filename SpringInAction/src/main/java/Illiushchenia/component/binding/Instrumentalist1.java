package Illiushchenia.component.binding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Instrumentalist1 implements Performer{
    @Value("Little appleTree")
    private String song;
    @Autowired
    @StringedInstrument
    @Strummed
    private Instrument instrument;

    public Instrumentalist1() {};

    @Override
    public void perform() throws PerformanceException {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }
}
