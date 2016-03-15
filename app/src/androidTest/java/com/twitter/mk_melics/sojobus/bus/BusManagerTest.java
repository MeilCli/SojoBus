package com.twitter.mk_melics.sojobus.bus;

import com.twitter.info_melics.skinfo.bus.BusManager;

import junit.framework.TestCase;

import java.util.Calendar;
import java.util.GregorianCalendar;

//Kotlinだとなぜか例外たたくのでめんどくさいのでJava
public class BusManagerTest extends TestCase{

    private void setTime(Calendar c,int y,int mo,int d,int h,int m){
        c.set(y, mo - 1, d, h, m);
    }

    private void sundayAndHoliday(int y,int m,int d) throws Exception{
        sunday(y, m, d, true);
        holiday(y, m, d, true);
    }

    private void holiday(int y,int m,int d,boolean condition) throws Exception{
        Calendar c = new GregorianCalendar();
        BusManager manager = new BusManager();
        setTime(c, y, m, d, 12, 0);
        assertEquals(manager.isHoliday(c), condition);
    }

    private void sunday(int y,int m,int d,boolean condition) throws Exception{
        Calendar c = new GregorianCalendar();
        BusManager manager = new BusManager();
        setTime(c, y, m, d, 12, 0);
        assertEquals(manager.isSunday(c), condition);
    }

    //------2015年------

    //元旦
    public void test1_1() throws Exception{
        sundayAndHoliday(2015, 1, 1);
    }

    //成人の日
    public void test1_12() throws Exception{
        sundayAndHoliday(2015,1,12);
    }

    //平日
    public void test1_15() throws Exception{
        sunday(2015,1,15,false);
        holiday(2015,1,15,false);
    }

    //日曜
    public void test1_18() throws Exception{
        sunday(2015, 1, 18, true);
    }

    //日曜であるが祝日ではない
    public void test2_1() throws Exception{
        sunday(2015,2,1,true);
        holiday(2015, 2, 1, false);
    }

    //建国記念の日
    public void test2_11() throws Exception{
        sundayAndHoliday(2015, 2, 11);
    }

    //春分の日
    public void test3_21() throws Exception{
        sundayAndHoliday(2015, 3, 21);
    }

    //昭和の日
    public void test4_29() throws Exception{
        sundayAndHoliday(2015, 4, 29);
    }

    //憲法記念日
    public void test5_3() throws Exception{
        sundayAndHoliday(2015, 5, 3);
    }

    //みどりの日
    public void test5_4() throws Exception{
        sundayAndHoliday(2015, 5, 4);
    }

    //こどもの日
    public void test5_5() throws Exception{
        sundayAndHoliday(2015, 5, 5);
    }

    //振替休日
    public void test5_6() throws Exception{
        sunday(2015, 5, 6,true);
        holiday(2015, 5, 6, false);
    }

    //海の日
    public void test7_20() throws Exception{
        sundayAndHoliday(2015, 7, 20);
    }

    //敬老の日
    public void test9_21() throws Exception{
        sundayAndHoliday(2015, 9, 21);
    }

    //国民の休日
    public void test9_22() throws Exception{
        sunday(2015, 9, 22,true);
        holiday(2015, 9, 22, false);
    }

    //秋分の日
    public void test9_23() throws Exception{
        sundayAndHoliday(2015, 9, 23);
    }

    //体育の日
    public void test10_12() throws Exception{
        sundayAndHoliday(2015, 10, 12);
    }

    //文化の日
    public void test11_3() throws Exception{
        sundayAndHoliday(2015, 11, 3);
    }

    //勤労感謝の日
    public void test11_23() throws Exception{
        sundayAndHoliday(2015, 11, 23);
    }

    //天皇誕生日
    public void test12_23() throws Exception{
        sundayAndHoliday(2015, 12, 23);
    }
}
