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
//        }else {
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
//}


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


    //Number Palindrome
    //checks if the number can equal itself if it was reversed
//    public static void main(String[] args) {
//        isPalindrome(11);
//    }
//
//    public static boolean isPalindrome(int number) {
//    //stores the reverse number
//        int reverse = 0;
//    //so that we have a variable to control that loops
//        int constant = number;
//    //if the number is negative
//        if (number < 0) {
//    //if it is negative it will make it positive
//            number = number * -1;
//            constant = number;
//    //will get the last number and save it in the reverse variable
//    //will then get rid of that number and get the next
//    //it will save the next variable by multiplying the existing one by 10 and adding it
//    //this reconstructs the number in reverse
//            while (reverse < constant) {
//                reverse = reverse + (number % 10);
//                number = number / 10;
//                System.out.println(reverse);
//                reverse = reverse * 10;
//            }
//    //when it is done it gets rid of a 0 and makes it negative again
//            reverse = reverse / 10;
//            reverse = reverse * -1;
//            constant = constant * -1;
//            System.out.println(reverse);
//        }else {
//    //does the same as the other just it is a positive from the start
//            while (reverse < constant) {
//                reverse = reverse + (number % 10);
//                number = number / 10;
//                System.out.println(reverse);
//                reverse = reverse * 10;
//            }
//            reverse = reverse / 10;
//        }
//        return reverse == constant;
//    }



    //First And Last Digit Sum
//    public static void main(String[] args) {
//        sumFirstAndLastDigit(22365235);
//    }
//
//    public static int sumFirstAndLastDigit(int number) {
//        if (number < 0) {
//            return -1;
//        }
//    //gets and saves the last digit
//        int lastDigit = number % 10;
//        int firstDigit = 0;
//    //loops and keep getting rid of the last number till there is only one
//    //saves it then as the first number
//        while (number > 0) {
//            firstDigit = number % 10;
//            number = number / 10;
//        }
//        return firstDigit + lastDigit;
//    }



    //EvenDigitSum
//    public static void main(String[] args) {
//        System.out.println(getEvenDigitSum(1235236));
//    }
//
//    public static int getEvenDigitSum(int number) {
//        if (number < 0) {
//            return -1;
//        }
//        int sumEvenDigits = 0;
//        int isEven = 0;
//    //gets the last digit
//    //test if it is even using modules
//    //then adds it
//        while (number > 0)  {
//            isEven = number % 10;
//            if (isEven % 2 == 0) {
//                sumEvenDigits = sumEvenDigits + isEven;
//            }
//            number = number / 10;
//        }
//        return sumEvenDigits;
//    }



    //Shared Digit
//    public static void main(String[] args) {
//        System.out.println(hasSharedDigit(12,13));
//    }
//
//    public static boolean hasSharedDigit(int firstNum,int secondNum) {
//        if (firstNum < 10 || firstNum > 99 || secondNum < 10 || secondNum > 99){
//            return false;
//        }
//        if (firstNum == secondNum) {
//            return true;
//        }
//        //the constant is to keep the second value
//        //it takes the last digit from the first number and loops through the second number to compare it
//        //if it is false the next number of the first number is retrieved and the loop goes again
//        //if it never matches it will return false;
//        while (firstNum > 0) {
//            int secondNumConstant = secondNum;
//            int tempFirstNum = firstNum % 10;
//            while (secondNumConstant > 0) {
//                int tempSecondNum = secondNumConstant % 10;
//                if (tempFirstNum == tempSecondNum) {
//                    return true;
//                }
//                secondNumConstant = secondNumConstant / 10;
//            }
//            firstNum = firstNum / 10;
//        }
//        return false;
//    }



    //Last Digit Checker
//    public static void main(String[] args) {
//        System.out.println(hasSameLastDigit(15,17,17));
//        System.out.println(isValid(5));
//    }
//
//    public static boolean hasSameLastDigit(int firstNum, int secondNum, int thirdNum) {
//        //gets the last digit of all the numbers and compares them
//        if (firstNum < 10 || firstNum > 1000 || secondNum < 10 || secondNum > 1000 || thirdNum < 10 || thirdNum > 1000) {
//            return false;
//        }
//        return firstNum % 10 == secondNum % 10 || secondNum % 10 == thirdNum % 10 || firstNum % 10 == thirdNum % 10;
//    }
//
//    public static boolean isValid(int number) {
//        //random error checking
//        return number > 9 && number < 1001;
//    }



    //All Factors
//    public static void main(String[] args) {
//        printFactors(6);
//    }
//
//    public static void printFactors(int number) {
//        if (number < 1) {
//            System.out.println("Invalid Value");
//        }
//        int isFactor;
//        for (int i = 1; i <= number; i++) {
//            //if the remainder of the modules is 0 then it is a factor
//            isFactor = number % i;
//            if (isFactor == 0) {
//                System.out.println(i);
//            }
//        }
//    }



    //Greatest Common Divisor
//    public static void main(String[] args) {
//        System.out.println(getGreatestCommonDivisor(25,15));
//    }
//    public static int getGreatestCommonDivisor(int first, int second) {
//        if (first < 10 || second < 10) {
//            return -1;
//        }
//        int greatestCommonDivisor = 0;
//        //keeps looping till either numbers are reached, where at that point the greatest common divisor can not be bigger than one of the numbers
//        for (int i = 1; i <= first || i <= second; i++) {
//            //uses modulus to check for remainders
//            int firstNumTemp = first % i;
//            int secondNumTemp = second % i;
//            //if no remainders new greatest common divisor is found and stored
//            if (firstNumTemp == 0 && secondNumTemp == 0) {
//                greatestCommonDivisor = i;
//            }
//        }
//        return greatestCommonDivisor;
//    }



    //Perfect Number
//    public static void main(String[] args) {
//        System.out.println(isPerfectNumber(12346));
//    }
//    public static boolean isPerfectNumber(int number) {
//        if (number < 1) {
//            return false;
//        }
//        int sumNumbers = 0;
//        //loops, if no remainder add to integer "sumNumbers"
//        for (int i = 1; i < number; i++) {
//            int isPerfectNum = number % i;
//            if (isPerfectNum == 0) {
//                sumNumbers = sumNumbers + i;
//            }
//        }
//        return sumNumbers == number;
//    }



    //Number To Words
//    public static void main(String[] args) {
//        numberToWords(125);
//    }
//    public static void numberToWords(int number) {
//        if (number < 0) {
//            System.out.println("Invalid Value");
//        }
//
//    }
//
//    public static void reverse() {
//
//    }



    //Number To Words
//    public static void main(String[] args) {
//        numberToWords(900);
//    }
//
//    public static void numberToWords(int number) {
//        int reversedNumber = reverse(number);
//        int digitCount = getDigitCount(number);
//        int displayCounter = 0;
//        if (reversedNumber < 0) {
//            System.out.println("Invalid Value");
//        }
//        for (int i = 0; i <= reversedNumber; i++) {
//            int lastDigit = reversedNumber % 10;
//            String[] numberToWordsArr = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
//            String numberInWords = numberToWordsArr[lastDigit];
//            reversedNumber = reversedNumber / 10;
//            i = 0;
//            System.out.println(numberInWords);
//            displayCounter = displayCounter + 1;
//        }
//        while (displayCounter < digitCount) {
//            System.out.println("Zero");
//            displayCounter = displayCounter + 1;
//        }
//
//    }
//
//    public static int reverse(int number) {
//        int reversedNumber = 0;
//        int i = 0;
//        if (number < 0) {
//            number = number * -1;
//            while (i < number) {
//                reversedNumber = reversedNumber * 10;
//                int lastDigit = number % 10;
//                number = number / 10;
//                reversedNumber = reversedNumber + lastDigit;
//            }
//            reversedNumber = reversedNumber * -1;
//        }
//        while (i < number) {
//            reversedNumber = reversedNumber * 10;
//            int lastDigit = number % 10;
//            number = number / 10;
//            reversedNumber = reversedNumber + lastDigit;
//        }
//        return reversedNumber;
//    }
//
//    public static int getDigitCount(int number) {
//        if (number < 0) {
//            return -1;
//        }
//        int digitCount = 0;
//        int i = 0;
//        while (i != number) {
//            digitCount = digitCount + 1;
//            number = number / 10;
//        }
//        if (digitCount == 0) {
//            digitCount = 1;
//        }
//        return digitCount;
//    }



    //Flour Pack Problem
//    public static void main(String[] args) {
//        canPack(5,3,24);
//    }

//    public static boolean canPack(int bigCount, int smallCount, int goal) {
//        if (bigCount < 0 || smallCount < 0 || goal < 0) {
//            return false;
//        }
//        //bigCount is 5 kg
//        //smallCount is 1 kg
//        //goal == bigCount + smallCount
//        int totalBigCount = bigCount * 5;
//        while (totalBigCount > goal) {
//            totalBigCount = totalBigCount - 5;
//        }
//        goal = goal - totalBigCount;
//        while (goal != 0 && smallCount > 0) {
//            goal = goal - 1;
//            smallCount--;
//        }
//        return goal == 0;
//    }



    //Largest Prime
//    public static void main(String[] args) {
//        System.out.println(getLargestPrime(45));
//    }
//
//    public static int getLargestPrime(int number) {
//        if (number < 2) {
//            return -1;
//        }
//        int largestPrime = 1;
//        int primeNumberTotal = 1;
//        while (number % 2 == 0) {
//            number = number / 2;
//            largestPrime = 2;
//            primeNumberTotal = primeNumberTotal * largestPrime;
//        }
//        for (int i = 2; i <= number; i++) {
//            if (number % i == 0) {
//                largestPrime = i;
//                number = number / i;
//                i = 1;
//                primeNumberTotal = primeNumberTotal * largestPrime;
//                if (primeNumberTotal == number) {
//                    largestPrime = i;
//                    break;
//                }
//            }
//        }
//        return largestPrime;
//    }



    //Diagonal Star
    public static void main(String[] args) {
        printSquareStar(2);
    }
    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            int columCount = 1;
            int rowCount = 1;
            for (rowCount = 1; rowCount <= number; rowCount++) {
                for (int b = 1; b <= number; b++) {
                    if (rowCount == 1 || rowCount == number) {
                        //top and bottom *
                        System.out.print("*");
                    }
                    if (rowCount > 1 && rowCount < number) {
                        for (int c = 1; c <= number; c++) {
                            if (c == 1 || c == number) {
                                //border *
                                System.out.print("*");
                                columCount++;
                            } else if (columCount == rowCount) {//inner   (number - 2) / 2 + 1
                                System.out.print("*");
                                columCount++;
                            } else if (columCount == number - rowCount + 1) {
                                System.out.print("*");
                                columCount++;
                            } else {
                                System.out.print(" ");
                                columCount++;
                            }
                        }
                        columCount = 1;
                        break;
                    }
                }
                System.out.print("\n");
            }

        }
    }
}

