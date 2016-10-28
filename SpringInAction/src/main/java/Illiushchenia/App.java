package Illiushchenia;

import Illiushchenia.component.binding.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applicationContextConfig.xml");

        Performer performer = (Performer) context.getBean("duke");
        performer.perform();
    }

//    public static void main( String[] args )
//    {
//
//        BraveKnight braveKnight = new BraveKnight(new QuestKillDragon());
//        braveKnight.embarkInQuest();
//
//
//    }
}
