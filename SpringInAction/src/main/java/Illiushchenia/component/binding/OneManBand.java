package Illiushchenia.component.binding;

import java.util.Map;

public class OneManBand implements Performer {
    private Map<String, Instrument> instruments;
    public OneManBand(){};

    @Override
    public void perform() throws PerformanceException {
        for (String key : instruments.keySet()){
            System.out.println(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }

    public void setInstruments(Map<String, Instrument> instruments){
        this.instruments = instruments;
    }
}
