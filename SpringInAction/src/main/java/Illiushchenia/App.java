package Illiushchenia;

import Illiushchenia.component.binding.Contestant;
import Illiushchenia.component.binding.MindReader;
import Illiushchenia.component.binding.Performer;
import Illiushchenia.component.binding.Thinker;
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

//        context.getBean("auditorium");
//        Performer performer = (Performer) context.getBean("poeticDuke");
//        performer.perform();
//
//        performer = (Performer) context.getBean("kenny");
//        performer.perform();
//
//        performer = (Performer) context.getBean("hank");
//        performer.perform();
//
//        Performer magician = (Performer) context.getBean("harry");
//        magician.perform();

        Performer performer = (Performer) context.getBean("instrumentalist1");
        performer.perform();
        Contestant contestant = (Contestant) performer;
        contestant.receiveAward();

        Thinker thinker = (Thinker)context.getBean("volunteer");
        thinker.thinkOfSomething("Yue ho ho!");
        MindReader mindReader = (MindReader) context.getBean("telepat");
        System.out.println(mindReader.getThoughts());

//        Instrumentalist instrumentalist = new Instrumentalist();
//        instrumentalist.perform();
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
