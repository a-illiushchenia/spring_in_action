package Illiushchenia.component.binding;

public class Magician implements Performer {
    private MagicBox magicBox;
    private String magicWords;

    public Magician(){}


    @Override
    public void perform() throws PerformanceException {
        System.out.println(magicWords);
        System.out.println("The magic box contains...");
        System.out.println(magicBox.getContents()); // Исследует содержимое
    }

    public void setMagicBox(MagicBox magicBox) {
        this.magicBox = magicBox;
    }

    public void setMagicWords(String magicWords) {
        this.magicWords = magicWords;
    }
}
