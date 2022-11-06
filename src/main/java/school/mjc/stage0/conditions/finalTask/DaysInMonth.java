package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        boolean leap = false;
        if(year>0){
                if (year%4==0){
                    if (year==2004){
                        leap = true;
                    }else if (year%100==0){
                        if (year%400==0){
                            leap = true;
                        }

                    }
                }

            if(month>12||month<1)
                System.out.println("invalid date");
            else if(month==2&&leap==false)
                System.out.println("28");
            else if(month==2&&leap)
                    System.out.println("29");

            else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
                System.out.println("31");

            else
                System.out.println("30");


        } else
                    System.out.println("invalid date");
                }



}
