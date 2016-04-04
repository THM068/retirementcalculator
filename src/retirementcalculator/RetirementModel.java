/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retirementcalculator;

import java.time.LocalDate;

/**
 *
 * @author tm1c14
 */
public class RetirementModel {
    private long userAge;
    private long retirementAge;

    /**
     * @return the currentYear
     */
    public long getCurrentYear() {
        LocalDate localDate = LocalDate.now();
        return localDate.getYear();
    }

    /**
     * @return the userAge
     */
    public long getUserAge() {
        return userAge;
    }

    /**
     * @param userAge the userAge to set
     */
    public void setUserAge(long userAge) {
        this.userAge = userAge;
    }

    /**
     * @return the retirementAge
     */
    public long getRetirementAge() {
        return retirementAge;
    }

    /**
     * @param retirementAge the retirementAge to set
     */
    public void setRetirementAge(long retirementAge) {
        this.retirementAge = retirementAge;
    }
    
    public long getStringValueAsLong(String v) {
        long result = -1;
        try {
            result = Long.parseLong(v);
        }
        catch(NumberFormatException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    public long getYearsBeforeRetirement() {
        return (this.retirementAge - this.userAge);
    }
    
    public long getRetirementYear() {
        return getCurrentYear() + getYearsBeforeRetirement();
    }

   
    
    
}
