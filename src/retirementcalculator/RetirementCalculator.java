/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retirementcalculator;
import static java.lang.System.out;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
/**
 *
 * @author tm1c14
 */
public class RetirementCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        out.println(LocalDate.of(2016, Month.APRIL, 23));
        out.println(LocalTime.now());
        out.println("From midnight " + ld.atStartOfDay());
        out.println("At current time " + ld.atTime(LocalTime.now()));
        out.println("Custom date " + LocalDate.of(2016, Month.MARCH, 8));
        out.println("Custom time " + LocalTime.of(13, 12,9));
        
        out.println(LocalDateTime.now());
        out.println(ZonedDateTime.now());
        
        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime zdt = ZonedDateTime.of(LocalDateTime.now(), zone);
        out.println("US Zoned time is " + zdt);
        
        out.println("My Zone Id is " + ZoneId.systemDefault());
        
        ZoneId.getAvailableZoneIds().stream()
                .filter( z-> z.contains("Asia"))
                .forEach(out::println);
        
        LocalDate localDate = LocalDate.of(2014, Month.JANUARY, 8);
        out.println(localDate);
        localDate = localDate.plusDays(10);
        out.println(localDate);
        localDate = localDate.plusWeeks(2);
        out.println(localDate);
        out.println(localDate.lengthOfMonth());
        
        out.println(LocalDate.parse("2007-11-23"));
        out.println(LocalDate.parse("2007-11-23").getMonth());
        
        assert(true);
    }
    
}

