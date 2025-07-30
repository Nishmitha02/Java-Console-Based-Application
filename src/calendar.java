class calendar {


    /*  Main function is only for ease of use

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month:");
        int month = scanner.nextInt();
        printCalendar(2024, month);
        scanner.close();
    }
    **/
    
    protected void printCalendar(int year, int month) {
        int[][] calendar = new int[6][7]; 
        int startDay = getStartDay(2024, month);
        int day = 1;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if ((i == 0 && j < startDay) || day > getDaysInMonth(2024, month)) {
                    calendar[i][j] = -1; 
                } else {
                    calendar[i][j] = day++;
                }
            }
        }
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < 6; i++) 
        {
            for (int j = 0; j < 7; j++) 
            {
                if (calendar[i][j] == -1)
                {
                    System.out.print("    "); 
                } 
                else 
                {
                    System.out.printf("%4d", calendar[i][j]);
                }
            }
            System.out.println();

           
        }
        if(month == 4 || month == 5 || month == 10){
            System.out.println("* Prices may be higher than usual due to holiday demands.");
        }
    }


    public static int getStartDay(int year, int month) {
        int m = (1 + getMonthAdjusted(month)) + (26 * getYearAdjusted(year) / 10) + getYearAdjusted(year) % 100 +
                (getYearAdjusted(year) % 100) / 4 + (getYearAdjusted(year) / 400) - 2 * (getYearAdjusted(year) / 100);
        return (m% 7 + 7) % 7;
    }

    public static int getYearAdjusted(int year)
    {
        if (year < 100) {
            return year + 2000;
        } else {
            return year;
        }
    }

    public static int getMonthAdjusted(int month) {
        int[] adjustment = {11, 12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        return adjustment[month - 1];
    }

    public static int getDaysInMonth(int year, int month)
    {
        int[] daysInMonth = {31, 28 + (isLeapYear(year) ? 1 : 0), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return daysInMonth[month - 1];
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}