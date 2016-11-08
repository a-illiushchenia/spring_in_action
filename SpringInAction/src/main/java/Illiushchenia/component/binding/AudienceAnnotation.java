package Illiushchenia.component.binding;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AudienceAnnotation {
    @Pointcut("execution(* Illiushchenia.component.binding.Performer.perform(..))")
    public void performance(){}

    @Before("performance()")
    public void takeSeats(){
        System.out.println("AudienceAnnotation :: The audience is taking their seats.");
    }

    @Before("performance()")
    public void turnOffCellPhones() {
        System.out.println("AudienceAnnotation :: The audience is turning off their cellphones");
    }

    @AfterReturning("performance()")
    public void applaud() {
        System.out.println("AudienceAnnotation :: CLAP CLAP CLAP CLAP CLAP");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("AudienceAnnotation :: Boo! We want our money back!");
    }

    @Around("performance()")
    public void watchPerformance(ProceedingJoinPoint joinpoint) {
        try {
            System.out.println("1AudienceAnnotation :: The audience is taking their seats.");
            System.out.println("1AudienceAnnotation :: The audience is turning off their cellphones");

            long start = System.currentTimeMillis();
            joinpoint.proceed();
            long end = System.currentTimeMillis();

            System.out.println("1AudienceAnnotation :: CLAP CLAP CLAP CLAP CLAP");
            System.out.println("1AudienceAnnotation :: The performance took " + (end - start)
                    + " milliseconds.");
        } catch (Throwable t) {
            System.out.println("1AudienceAnnotation :: Boo! We want our money back!");
        }
    }
}
