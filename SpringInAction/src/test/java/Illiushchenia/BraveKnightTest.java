package Illiushchenia;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest(){
        Quest mockQuest = mock(Quest.class);

        BraveKnight braveKnight = new BraveKnight(mockQuest);
        braveKnight.embarkInQuest();

        verify(mockQuest, times(1)).embark();
    }
}
