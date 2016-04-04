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
        out.println(LocalDate.now());
        out.println(LocalTime.now());
        out.println("From midnight " + ld.atStartOfDay());
        out.println("At current time " + ld.atTime(LocalTime.now()));
        out.println("Custom date " + LocalDate.of(2016, Month.MARCH, 8));
        out.println(LocalDateTime.now());
        out.println(ZonedDateTime.now());
    }
    
}

