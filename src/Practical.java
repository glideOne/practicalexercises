import java.util.Date;

/**
 * Created by ozakarias on 1/3/2018.
 */
public class Practical {

    public static void main(String[] args) {

        //1. What is the result of the following operation: n%2, where n=7?
//        int n = 7;
//        System.out.println(n%2);

        //2. What is the result of : “a string” + n, where n=1?
//        int n = 1;
//        System.out.println("a string" + n);

        //3. int n = 1; n += 5; What is the value of n?
//        n+=5;
//        System.out.println(n);

        //4. What does n++ do? And n--?
//        System.out.println(++n);
//        System.out.println(n);
//        n = 1;
//        System.out.println(--n);
//        System.out.println(n);

        //5. You have the following code snippet: int n = 1; sout(n++);. What will it print?
//        See above

        //6. Write code that prints true if 2 Strings are equal or start with “a”, and prints false otherwise.
//        System.out.println(stringComparer("asd", "asdf"));
//        System.out.println(stringComparer("asd", "asd"));
//        System.out.println(stringComparer("yui", "yui"));
//        System.out.println(stringComparer("dsfkjh", "adk"));

        //7. Given three ints, a b c, return true if b is greater than a, and c is greater than b.
//        System.out.println(threeIntsComparer(1, 2, 3));
//        System.out.println(threeIntsComparer(12, 1, 3));

        //8. Consider the following code snippet. int i = 10; int n = i++%5; What are the values of i and n after
        // the code is executed? What are the final values of i and n if instead of using the postfix increment operator (i++), you use the prefix version (++i)?
//        int i = 10;
//        int n = ++i%5;
//        System.out.println("i= " + i);
//        System.out.println("n= " + n);

        //9. Create a loop that prints something for 10 times using while. Do the same using do-while.
//        int i = 0;
//        while (i < 10) {
//            System.out.println("something " + i);
//            i++;
//        }

//        int i = 0;
//        do {
//            System.out.println("something " + i);
//            i++;
//        } while (i < 10);

        //10. Create a two dimensional array (int[5][5]). Print it using for.
//        int[][] multiDimArray = new int[5][5];
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print(multiDimArray[i][j] + " ");
//            }
//            System.out.println();
//        }

        //11. Create an array of Strings. Use for each and if to go through the array and print “big” if the item's length is bigger than 5, or “small” otherwise.
//        String[] arrayOfStrings = new String[5];
//        arrayOfStrings[0] = "asd";
//        arrayOfStrings[1] = "qwe";
//        arrayOfStrings[2] = "zxcasd";
//        arrayOfStrings[3] = "rty";
//        arrayOfStrings[4] = "fgh";
//        for (String x : arrayOfStrings) {
//            if (x.length() > 5) System.out.println("big");
//            else System.out.println("small");
//        }

        //12. Write a program using switch which prints “ONE” , “TWO” (…), “TEN” when the variable 'number' is 1,2,3(...),10 or print 'OTHER' when it is another number.
        // Do the same using nested-if.
//        int number = 3;
//        String numberString;
//        switch (number) {
//            case 1: numberString = "ONE";
//                    break;
//            case 2: numberString = "TWO";
//                    break;
//            case 3: numberString = "THREE";
//                    break;
//            default: numberString = "OTHER";
//                    break;
//        }
//        System.out.println(numberString);

//        if (number == 1) { numberString = "ONE"; }
//        else if (number == 2) { numberString = "TWO"; }
//        else if (number == 3) { numberString = "THREE"; }
//        else numberString = "OTHER";
//        System.out.println(numberString);

        //13. Use continue keyword to write a method that prints all numbers from 1 to 10, except 4.
//        for (int i = 1; i <= 10; i++) {
//            if (i == 4) continue;
//            System.out.println(i);
//        }

        //14. Write a program using for which calculates the sum of all the numbers from a lower bound to a higher bound (for example from 1 to 100).
        // Also calculate the average of the lower bound and the higher bound. At the end print the sum and the average.
        // Ex: 1+2+3+4+...+100 = sum ; average = (100 + 1)/2
//        int lower = 1;
//        int upper = 100;
//        System.out.println(calculateAverageAndSum(lower, upper).status);
//        System.out.println(calculateAverageAndSum(lower, upper).average);
//        System.out.println(calculateAverageAndSum(lower, upper).sum);

        //15. You have an array of the following music instruments:
        // cello, piano, clapsticks, steelpan, triangle, xylophone.
        // Loop through the array and remove the vowels from all the instruments.
        // At the end print an array of Strings with the new instruments after vowels have been removed.
//        String[] instruments = new String[6];
//        String[] procsdInstruments = new String[6];
//        instruments[0] = "cello";
//        instruments[1] = "piano";
//        instruments[2] = "clapsticks";
//        instruments[3] = "steelpan";
//        instruments[4] = "triangle";
//        instruments[5] = "xylophone";
//
//        for (int i = 0; i < 6; i++) {
//            procsdInstruments[i] = "";
//        }
//
//        for (int i = 0; i < 6; i++) {
//            for (int j = 0; j < instruments[i].length(); j++) {
//             char c = instruments[i].charAt(j);
//             if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) continue;
//             procsdInstruments[i] = procsdInstruments[i] + c;
//            }
//        }
//
//        for (String x : procsdInstruments) {
//            System.out.println(x);
//        }

        /**
         STRINGS exercises
         */
        //1. You have a string of even length, return the first half. So the string "WooHoo" yields "Woo".
//        String input = "WooHoo";
//        String output = "";
//        if ((input.length() % 2) != 0)  output = "Input string does not have even length.";
//        else {
//            output = input.substring(0, (input.length())/2);
//        }
//        System.out.println(output);

        //2. Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
//        String stringOne = "abc";
//        String stringTwo = "def";
//        System.out.println(stringOne.substring(1) + stringTwo.substring(1));

        //3. Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Pi" and "Tech" returns "PiTechTechPi".
//        String a = "Pi";
//        String b = "Tech";
//        System.out.println(a + b + b + a);

        //4. Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.
//        String input = "Vineri";
//        String output = input.substring((input.length() - (input.length() - 2)), input.length());
//        output = output + input.substring(0, 2);
//        System.out.println(output);

        //5. Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".
//        String a = "edited";
//        if ((a.substring(0, 2)).equals(a.substring(a.length()-2, a.length()))) System.out.println("true");
//        else System.out.println("false");

        //6. The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
        // In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
        // Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
//        String tag = "i";
//        String word = "Yay";
//        String htmlString = "<" + tag + ">" + word + "</" + tag + ">";
//        System.out.println(htmlString);

        //7. Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".
//        String a = "coding";
//        char x = a.charAt(a.length() - 2);
//        char y = a.charAt(a.length() - 1);
//        System.out.println(a.substring(0, a.length() - 2) + y + x);

        //8. Given a string, return a string where for every char in the original, there are two chars.
//        String a = "original";
//        String b = "";
//        for (char c : a.toCharArray()) {
//            b = b + c + c;
//        }
//        System.out.println(b);

        //9. Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on.
        // Any leftover chars go at the end of the result.
//        String a = "abcd";
//        String b = "efghxyz";
//        String r = "";
//        int min;
//        if (a.length() < b.length()) min = a.length();
//        else min = b.length();
//        for (int i = 0; i < min; i++) {
//            r = r + a.charAt(i) + b.charAt(i);
//        }
//        if (a.length() < b.length()) r = r + b.substring(b.length()-min+1, b.length());
//        System.out.println(r);

        //10. Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.
//        String a = "asdfggghjjkl";
//        System.out.println(maxBlockLength(a));

        /**
         * ARRAYS exercises
         */
        //1. You have an array of ints, return true if 6 appears as either the first or last element in the array, false otherwise.
        // The array will be length 1 or more.
//        int[] arrayOfInts = new int[5];
//        if ((arrayOfInts[0] == 6) || (arrayOfInts[4] == 6)) System.out.println("true");
//        else System.out.println("false");

        //2. Given an int array length 2, return true if it does not contain a 2 or 3.
//        int[] intArray = new int[2];
//        intArray[0] = 6;
//        intArray[1] = 1;
//        System.out.println(arrayContains(intArray));

        //3. For an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
//        int[] intArray = new int[5];
//        intArray[0] = 1;
//        intArray[1] = 2;
//        intArray[2] = 3;
//        intArray[3] = 4;
//        intArray[4] = 1;
//        System.out.println(arrayExerciseThree(intArray));

        //4. Write a method that takes a word (String) as a parameter and returns true if the word is a palindrome or false if not.
//        String word = "caiac";
//        System.out.println(isPaldindrome(word));

        //5. Given an array of ints, return true if the number of 1's is greater than the number of 4's
//        int[] onesAndFours = new int[5];
//        onesAndFours[0] = 0;
//        onesAndFours[1] = 1;
//        onesAndFours[2] = 2;
//        onesAndFours[3] = 3;
//        onesAndFours[4] = 4;
//        int nrOfOnes = 0;
//        int nrOfFours = 0;
//        for (int i = 0; i < onesAndFours.length; i++) {
//            if (onesAndFours[i] == 1) nrOfOnes++;
//            if (onesAndFours[i] == 4) nrOfFours++;
//        }
//
//        if (nrOfOnes > nrOfFours) System.out.println("true");
//        else System.out.println("false");

        //6. Create an array String[] names that contains multiple names. Go through it and return only the first name that starts with “A”.
//        String[] names = new String[5];
//        names[0] = "Mircea";
//        names[1] = "Ana";
//        names[2] = "Adam";
//        names[3] = "Maria";
//        names[4] = "Aniela";
//        System.out.println(firstWordThatStartsWithA(names));

        //7. Given n>=0, create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1, 0, 2, 1, 3, 2, 1} (spaces added to show the 3 groups).
//        i              0, 0, 0, 1, 1, 1, 2, 2, 2
//        j              0, 1, 2, 0, 1, 2, 0, 1, 2

//        squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]

        //i              0  0  1  1
        //j              0  1  0  1


//        squareUp(2) → [0, 1, 2, 1]
//        squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]

        /*
        int n = 2;

        int[] squareUp = new int[n * n];

        for (int i = n-1; i < squareUp.length; i += n) {
            for (int j = i; j >= i - i/n; j--)
                squareUp[j] = i - j + 1;
        }

        for (int i = 0; i < n * n; i++) {
            System.out.print(squareUp[i] + " ");
        }
        */

        /**
         * LOGIC exercises
         */
        //1. You are a speeding maniac and are driving a little too fast.
        // A police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket.
        // If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1.
        // If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
        // Method declaration: public int caughtSpeeding(int speed, boolean isBirthday) {}

//        int speed = 61;
//        boolean isBirthday = false;
//        System.out.println(speedingTicketCalculator(speed, isBirthday));

        //2. Your phone rings. Return true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling.
        // In all cases, if you are asleep, you do not answer.
        //Method: public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep){}

//        boolean isMorning = true;
//        boolean isMom = false;
//        boolean isAsleep = false;
//        System.out.println(answerCell(isMorning, isMom, isAsleep));

        //3. Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.
//        int a = 2;
//        int b = 2;
//        int c = 3;
//        System.out.println(returnUniqueNrSum(a, b, c));

        //4. Given three ints, a b c, one of them is small, one is medium and one is large.
        // Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.
//        int a = 2;
//        int b = 2;
//        int c = 2;
//        System.out.println(evenlySpaced(a, b, c));

        //5. You have an array of strings, return the count of the number of strings with the given length.
        // Method: public int wordsCount(String[] words, int length) {}

//        String[] words = new String[3];
//        words[0] = "trei";
//        words[1] = "patru";
//        words[2] = "cinci";
//        System.out.println(wordsLengthCount(words, 5));

        //6. Write a method that checks if a number is prime.
        int n = 21;
        System.out.println(isPrime(n));
    }

    /**
     * **************************************************************************************************
     */

    //6. Write code that prints true if 2 Strings are equal or start with “a”, and prints false otherwise.
    public static boolean stringComparer(String a, String b) {
        if (a.equals(b)) return true;
        if (a.startsWith("a") && b.startsWith("a")) return true;
        return false;
    }

    //7. Given three ints, a b c, return true if b is greater than a, and c is greater than b.
    public static boolean threeIntsComparer(int a, int b, int c) {
        if ((b > a) && (c > b)) return true;
        return false;
    }

    //14. Write a program using for which calculates the sum of all the numbers from a lower bound to a higher bound (for example from 1 to 100).
    // Also calculate the average of the lower bound and the higher bound. At the end print the sum and the average.
    // Ex: 1+2+3+4+...+100 = sum ; average = (100 + 1)/2
    public static AverageAndSum calculateAverageAndSum(int a, int b) {
        AverageAndSum obj = new AverageAndSum("Average and Sum not calculated yet.");

        if (a > b) {
            obj.status = "Error. a < b.";
            return obj;
        }

        if (a == b) {
            obj.status = "The average of a number is that number.";
            obj.average = a;
            obj.sum = a + b;
            return obj;
        }

        if ((a < 0) || (b < 0)) {
            obj.status = "A and/or B are negative numbers. Invalid input.";
            return obj;
        }

        if (a < b) {
            int dif = b - a;
            double sum = 0;
            for (int i = a; i <= b; i++) {
                sum+=i;
            }
            obj.sum = sum;

            float average = (float)(a + b)/2;
            obj.average = average;
            obj.status = "Average and sum calculated.";
            return obj;
        }
        return obj;
    }

    //STRINGS 10. Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.
    public static int maxBlockLength(String a) {
        int tempCount = 1;
        int count = 0;

        if (a.length() == 0) return 0;

        for (int i = 0; i < a.length() - 1; i++) {
            if (a.charAt(i) == a.charAt(i+1)) tempCount++;
            else tempCount = 1;

            if (tempCount > count) count = tempCount;
        }

        return count;
    }

    //ARRAYS: 2. Given an int array length 2, return true if it does not contain a 2 or 3.
    public static boolean arrayContains(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            if ((intArray[i] == 2) || (intArray[i] == 3)) return false;
        }
        return true;
    }

    //3. For an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
    public static boolean arrayExerciseThree(int[] a) {
        if ((a.length >= 1) && (a[0] == a[a.length-1])) return true;
        return false;
    }

    //4. Write a method that takes a word (String) as a parameter and returns true if the word is a palindrome or false if not.
    public static boolean isPaldindrome(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) return false;
        }
        return true;
    }

    //6. Create an array String[] names that contains multiple names. Go through it and return only the first name that starts with “A”.
    public static String firstWordThatStartsWithA(String[] names) {
        for (String name : names) {
            if (name.startsWith("A")) return name;
        }
        return null;
    }

    /**
     * LOGIC exercises
     */
    //1. You are a speeding maniac and are driving a little too fast.
    // A police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket.
    // If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1.
    // If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
    // Method declaration: public int caughtSpeeding(int speed, boolean isBirthday) {}
    public static int speedingTicketCalculator(int speed, boolean isBirthday) {
        int adaptedSpeed = speed;
        if (isBirthday) adaptedSpeed = speed - 5;
        if (adaptedSpeed <= 60) return 0;
        if ((adaptedSpeed > 60) && (adaptedSpeed <= 80)) return 1;
        if (adaptedSpeed > 80) return 2;
        return 0;
    }

    //2. Your phone rings. Return true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling.
    // In all cases, if you are asleep, you do not answer.
    //Method: public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep){}
    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) return false;
        if (isMorning && !isMom) return false;
        return true;
    }

    //3. Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.
    public static int returnUniqueNrSum(int a, int b, int c) {
        if ((a==b) && (b==c)) return 0;
        if (a==b) return c;
        if (b==c) return a;
        if (a==c) return b;
        return (a+b+c);
    }

    //4. Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are evenly spaced,
    // so the difference between small and medium is the same as the difference between medium and large.
    public static boolean evenlySpaced(int a, int b, int c) {
        if (c-b == b-a) return true;
        return false;
    }

    //5. You have an array of strings, return the count of the number of strings with the given length.
    // Method: public int wordsCount(String[] words, int length) {}
    public static int wordsLengthCount(String[] words, int length) {
        int count = 0;
        for (String word : words) {
            if (word.length() == length) count++;
        }
        return count;
    }

    //6. Write a method that checks if a number is prime.
    public static boolean isPrime(int n) {

        if (n%2 == 0) return false;

        for (int i = 3; i <= n/2; i+=2) {
            if (n%i == 0) return false;
        }

        return true;
    }

}
