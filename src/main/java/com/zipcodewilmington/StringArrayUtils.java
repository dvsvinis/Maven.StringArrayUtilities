package com.zipcodewilmington;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return (array[array.length - 1]);
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return (array[array.length - 2]);
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean result = false;

        for (String element : array) {
            if (element == value) {
                return true;
            }
        }
        return result;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        List<String> list = Arrays.asList(array);
        System.out.println("Before Reversing : " + list);
        Collections.reverse(list);
        System.out.println("After Reversing : " + list);

        Object[] objectList = list.toArray();
        String[] stringArray =  Arrays.copyOf(objectList,objectList.length,String[].class);

        return stringArray;
    }


    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int end = array.length - 1;
        boolean result = true;

        for (int index = 0; index < array.length; index++) {
            if ( array[index] !=  array[end]) {
                result = false;
            }
          end--;
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean isThere = true;
        String str = Arrays.toString(array);
        str = str.toLowerCase();

        for(char ch = 'a';ch <= 'z'; ++ch) {
            if(!str.contains(String.valueOf(ch))) {
                isThere = false;
                break;
            }
        }
        return isThere;
    }


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;

        for (int i = 0; i < array.length; i++) {

            if (value.equals(array[i])) {
                counter++;
            }
        }
        return counter;
    }


    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] output = new String[array.length - 1];
        int count = 0;

        for (String i : array) {
            if (!i.equals(valueToRemove)) {
                output[count++] = i;
            }
        }
        return output;
    }


    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList output = new ArrayList();
        output.add(array[0]); //move the first value

        // Iterate the remaining values checking for duplicates
        for(int i = 1; i < array.length; i++) {
            if (!array[i].equals(array[i - 1])) {
                output.add(array[i]);
            }
        }
        Object[] objArray = output.toArray();  //change ArrayList back to object array
        String[] str = Arrays.copyOf(objArray, objArray.length, String[].class);  //change objArray to String array

        return str;
    }


    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> newList = new ArrayList<String>();
        newList.add(array[0]);

            for(int j = 1; j < array.length; j++) {
                System.out.println(j);
                if (array[j].equals(array[j - 1])){
                    newList.set(newList.size() - 1, (newList.get(newList.size() - 1) + array[j]) );
                    System.out.println(newList.toString());
                }
                else {
                    newList.add(array[j]);
                    System.out.println(newList.toString());
                }

        }
        Object[] objArray = newList.toArray();  //change ArrayList back to object array
        String[] newArray = Arrays.copyOf(objArray, objArray.length, String[].class);  //change objArray to String array

        return newArray;
    }


}
