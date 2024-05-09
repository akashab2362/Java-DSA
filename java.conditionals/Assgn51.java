public class Assgn51 {
    public static void main(String[] args) {
        int month = 8; // August
        int year = 2024; // Year for which we're checking

        int daysInMonth = getDaysInMonth(month, year);
        int count = countEvenDays(daysInMonth);

        System.out.println("Number of days Kunal can go out in August " + year + ": " + count);
    }

    // Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        if (month == 2) {
            // Checking for February
            if (isLeapYear(year)) {
                return 29; // February in a leap year
            } else {
                return 28; // February in a non-leap year
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30; // April, June, September, November
        } else {
            return 31; // January, March, May, July, August, October, December
        }
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }

    // Method to count the number of even days in a month
    public static int countEvenDays(int daysInMonth) {
        int count = 0;
        for (int i = 1; i <= daysInMonth; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
