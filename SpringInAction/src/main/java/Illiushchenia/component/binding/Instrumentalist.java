package Illiushchenia.component.binding;

//import org.springframework.beans.factory.annotation.Configurable;
//
//@Configurable("pianist")
public class Instrumentalist implements Performer {
    private String song;
    private Instrument instrument;

    public Instrumentalist(){

    }
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

    public String screamSong(){
        return song;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
}
