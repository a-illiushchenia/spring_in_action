package Illiushchenia;

public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest){
        this.quest = quest;
    }

    public void embarkInQuest() {
        quest.embark();
    }
}
