package com.company;
import org.junit.Test;
import static org.junit.Assert.*;
public class CodeingBatJavaQuestions {



    public static void main(String[] args) {
        System.out.println("We have begun");
        Q1IsWeekDay Q1IsWeekDay = new Q1IsWeekDay();
        assertEquals (true, Q1IsWeekDay.sleepIn(false,false));
        assertEquals (false, Q1IsWeekDay.sleepIn(true,false));
        assertEquals (true, Q1IsWeekDay.sleepIn(false,true));

        ContainsFristXThenNextIsX testQ2 = new ContainsFristXThenNextIsX();
        assertEquals (true, testQ2.doubleX("axxbb"));
        assertEquals (false, testQ2.doubleX("axaxax"));
        assertEquals (true, testQ2.doubleX("xxxxx"));
    }


}
