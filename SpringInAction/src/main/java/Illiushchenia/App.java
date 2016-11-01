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

        context.getBean("auditorium");
        Performer performer = (Performer) context.getBean("poeticDuke");
        performer.perform();

        performer = (Performer) context.getBean("kenny");
        performer.perform();

        performer = (Performer) context.getBean("hank");
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
