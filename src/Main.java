public class Main {
    //Positive, Negative or Zero
//    public static void main(String[] args) {
//        checkNumber(6);//calls the method with parameter
//    }
//
//    public static void checkNumber(int number) {
//        //checks whether the parameter number is positive, negative or zero
//        if (number > 0) {
//            System.out.println("positive");
//        } else if (number < 0) {
//            System.out.println("negative");
//        } else {
//            System.out.println("zero");
//        }
//    }



    //Speed Converter
//    public static void main(String[] args) {
//        //calls the toMilesPerHour method and uses it as the parameter for printConversion
//        toMilesPerHour(25.42);
//        printConversion(25.42);
//
//    }
//
//    public static long toMilesPerHour(double kilometersPerHour){
//        //if the parameter is less than 0 return -1 to show invalid number
//        if (kilometersPerHour < 0){
//            return -1;
//        }
//        //returns the rounded down number of the calculation which is kilometers to miles
//        return Math.round(kilometersPerHour / 1.609);
//
//    }
//
//    public static void printConversion(double kilometersPerHour){
//        //if -1 was returned in toMilesPerHour it will print this message to say invalid input
//        if (kilometersPerHour < 0){
//            System.out.println("Invalid Value");
//        }
//        //if it is a valid input it will neatly display the entered kilometersPerHour and the conversion to milesPerHour
//        else if (kilometersPerHour > 0){
//            long milesPerHour = toMilesPerHour(kilometersPerHour);
//            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
//        }
//    }


    //MegaBytes Converter
//    public static void main(String[] args) {
//        //calls the method with parameter
//        printMegaBytesAndKiloBytes(0);
//    }
//
//    public static void printMegaBytesAndKiloBytes (int kiloBytes) {
//        //check if the parameter contains a valid value
//        if (kiloBytes < 0){
//            System.out.println("Invalid Value");
//        } else if (kiloBytes >= 0) {
//            //conversion
//            int megaBytes = kiloBytes / 1024;
//            int remainingKiloBytes = kiloBytes -(megaBytes * 1024);
//            //neatly prints to console
//            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
//        }
//    }


    //Barking Dog
//    public static void main(String[] args) {
//        //calls method with parameters
//        shouldWakeUp(true, 1);
//    }
//
//    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
//        //returns true or false depending on the parameters
//        return barking && hourOfDay > -1 && hourOfDay < 8 || barking && hourOfDay == 23;
//    }


    //Leap Year Calculator
//    public static void main(String[] args) {
//        isLeapYear(400);
//    }
//
//    public static boolean isLeapYear(int year){
//        //uses the year parameter to see whether it is a leap year or not
//        if (year > 1 && year < 9999) {
//            if (year % 4 == 0) {
//                if (year % 100 == 0) {
//                    if (year % 400 == 0) {
//                        return true;
//                    }
//                    return false;
//                }
//                return true;
//            }
//            return false;
//        }
//        return false;
//    }


    //Decimal Comparator
//    public static void main(String[] args) {
//        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
//    }
//
//    public static boolean areEqualByThreeDecimalPlaces (double value1, double value2){
//        //multiplies the values to move the decimal spot and then compares it
//        //returning true or false
//        value1 = value1 * 1000;
//        value2 = value2 * 1000;
//        int intValue1 = (int)value1;
//        int intValue2 = (int)value2;
//        if (intValue1 == intValue2){
//            return true;
//        }
//        return false;
//    }


    //Equal Sum Checker
//    public static void main(String[] args) {
//        hasEqualSum(5,8,3);
//    }
//
//    public static boolean hasEqualSum(int value1,int value2,int value3){
//        //adds the first 2 parameters and compares if it is equal to the 3de parameter or not
//        int value4 = value1 + value2;
//        return value4 == value3;
//    }


    //Teen Number Checker
//    public static void main(String[] args) {
//        //calls the methods
//        hasTeen(9, 99, 19);
//        isTeen(13);
//    }
//
//    public static boolean hasTeen (int range1,int range2,int range3){
//        //if any of the 3 parameters fall between or equal to 13 and 19 return true
//        return range1 > 12 && range1 < 20 || range2 > 12 && range2 < 20 || range3 > 12 && range3 < 20;
//    }
//
//    public static boolean isTeen (int range1){
//        //returns true if the parameters fall between or equal to 13 and 19 return true
//        return range1 > 12 && range1 < 20;
//    }


    //Area Calculator
//    public static void main(String[] args) {
//        //calls the methods
//        area(5.0);
//        area(5.0, 4.0);
//    }
//
//    public static final double PI = Math.PI;
//    public static double area (double radius){
//        //check for values that are wanted
//        if (radius < 0){
//            return -1;
//        }
//        //calculates the area
//        double circleArea = PI * (radius) * (radius);
//        return circleArea;
//    }
//    public static double area (double x, double y){
//        //check for values that are wanted
//        if (x < 0 || y < 0){
//            return -1;
//        }
//        //calculates the area
//        double triangleArea = x * y;
//        return triangleArea;
//    }


    //Minutes To Years and Days Calculator
//    public static void main(String[] args) {
//        //calls method
//        printYearsAndDays(20202);
//    }
//
//    public static void printYearsAndDays (long minutes) {
//        //makes sure values is received that is wanted
//        if (minutes > -1) {
//            long hours = minutes / 60;
//            long days = hours / 24;
//            long years = days / 365;
//            days = days - (years * 365);
//            System.out.println(minutes + " min = " + years + " y and " + days + " d");
//        } else if (minutes < 0) {
//            System.out.println("Invalid Value");
//        }
//    }


    //Equality Printer
//    public static void main(String[] args) {
//        //calls the method
//        printEqual(1, 1, 1);
//    }
//
//    public static void printEqual (int v1,int v2,int v3){
//        //compares the number to check if they are all equal
//        if (v1 < 0 || v2 < 0 || v3 < 0) {
//            System.out.println("Invalid Value");
//        } else if (v1 == v2 && v1 == v3){
//            System.out.println("All numbers are equal");
//        } else if (v1 != v2 && v1 != v3 && v2 != v3){
//            System.out.println("All numbers are different");
//        }else {
//            System.out.println("Neither all are equal or different");
//        }
//    }



    //Playing Cat
//    public static void main(String[] args) {
//        //calls the method
//        isCatPlaying(false, 36);
//    }
//
//    public static boolean isCatPlaying (boolean summer, int temperature){
//        //check if it meets the temperature requirements
//        if (summer &&  temperature < 46 && temperature > 24) {
//            return true;
//        }
//        return !summer && temperature < 36 && temperature > 24;
//    }



    //Number In Words
//    public static void main(String[] args) {
//        //calls the method
//        printNumberInWord(5);
//    }
//
//    public static void printNumberInWord (int wholeNum) {
//        //takes the entered parameter and looks for the appropriate case
//        switch (wholeNum) {
//            case 0 -> System.out.println("ZERO");
//            case 1 -> System.out.println("ONE");
//            case 2 -> System.out.println("TWO");
//            case 3 -> System.out.println("THREE");
//            case 4 -> System.out.println("FOUR");
//            case 5 -> System.out.println("FIVE");
//            case 6 -> System.out.println("SIX");
//            case 7 -> System.out.println("SEVEN");
//            case 8 -> System.out.println("EIGHT");
//            case 9 -> System.out.println("NINE");
//            default -> System.out.println("other");
//        }
//        switch (wholeNum) {
//            case 0: {
//                System.out.println("ZERO");
//                break;
//            }
//            case 1: {
//                System.out.println("ONE");
//                break;
//            }
//            case 2: {
//                System.out.println("TWO");
//                break;
//            }
//            case 3: {
//                System.out.println("THREE");
//                break;
//            }
//            case 4: {
//                System.out.println("FOUR");
//                break;
//            }
//            case 5: {
//                System.out.println("FIVE");
//                break;
//            }
//            case 6: {
//                System.out.println("SIX");
//                break;
//            }
//            case 7: {
//                System.out.println("SEVEN");
//                break;
//            }
//            case 8: {
//                System.out.println("EIGHT");
//                break;
//            }
//            case 9: {
//                System.out.println("NINE");
//                break;
//            }
//            default: {
//                System.out.println("other");
//            }
//        }
//    }



    //Number Of Days In Month
//    public static void main(String[] args) {
//        System.out.println(isLeapYear(520));
//        System.out.println(getDaysInMonth(4,2000));
//    }
//
//    public static boolean isLeapYear (int year) {
//        if (year < 1 || year > 9999){
//            return false;
//        }
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                return year % 400 == 0;
//            }
//            return true;
//        }
//        return false;
//    }
//    public static int getDaysInMonth (int month, int year) {
//        if (month < 1 || month > 12) {
//            return -1;
//        } else if (year < 1 || year > 9999) {
//            return -1;
//        }
//        if (isLeapYear(year)) {
//            switch (month) {
//                case 1: case 3: case 5: case 7: case 8: case 10: case 12:{
//                    return 31;
//                }
//                case 2:{
//                    return 29;
//                }
//                case 4: case 6: case 9: case 11: {
//                    return 30;
//                }
//            }
//        } else if (!isLeapYear(year)) {
//            switch (month) {
//                case 1: case 3: case 5: case 7: case 8: case 10: case 12:{
//                    return 31;
//                }
//                case 2:{
//                    return 28;
//                }
//                case 4: case 6: case 9: case 11: {
//                    return 30;
//                }
//            }
//        }
//        return -1;
//    }



    //Sum Odd
//    public static void main(String[] args) {
//        //calls the method
//        System.out.println(sumOdd(1,11));
//    }
//
//    public static boolean isOdd(int number) {
//        //check if the value is greater than 0
//        if (number <= 0) {
//            return false;
//        }
//        //if the value is divided by 2 and the remainder is not equal to 0 then it is an odd number
//        return number % 2 != 0;
//    }
//
//    public static int sumOdd(int start, int end) {
//        int sumOfOddNumbers = 0;
//        //makes sure that the start number is not smaller than the end number
//        //makes sure that the end number is bigger than 0
//        if (start <= end && start > 0){
//            //the loop continues till the start value reach the end value
//            for (start = start; start <= end; start++) {
//                if (isOdd(start)) {
//                    sumOfOddNumbers = sumOfOddNumbers + start;
//                }
//            }
//        }else {//if any of the conditions are not met return -1 to indicate there is an error
//            return -1;
//        }
//        //returns the value to the main method
//        return sumOfOddNumbers;
//    }
}