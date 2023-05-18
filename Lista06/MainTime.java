package Lista06;

public class MainTime {
    
    public static void main(String[] args){

        Time time = new Time();
        time.prnTime();

        Time time1 = new Time(5);
        time1.prnTime();

        Time time2 = new Time(5,-6);
        time2.prnTime();

        Time time3 = new Time(2,59,5);
        time3.prnTime();

    }
}
