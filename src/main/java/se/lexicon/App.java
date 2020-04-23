package se.lexicon;

import se.lexicon.utility.StringArrayUtil;

import java.util.Arrays;

/**
 * @author Erik Svensson
 * 1. Create exapanding array
 * 2. Sort array
 * 3. toString representation
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String[] names = new String[0];
        names = StringArrayUtil.add(names, "Mattias Andersson");
        names = StringArrayUtil.add(names, "Michelle Johansson");
        names = StringArrayUtil.addAndSort(names, "Ameer Rasheed");

        System.out.println(Arrays.toString(names));

        int[] numbers = new int[0];
        numbers = StringArrayUtil.add(numbers, 2342);

    }
}
