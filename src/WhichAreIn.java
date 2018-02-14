import java.util.*;

public class WhichAreIn 
{ 	
    public static void main(String args[])
    {
        String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        System.out.println("Input array1: " + Arrays.toString(a));
        System.out.println("Input array2: " + Arrays.toString(b));
        System.out.println("Output: " + Arrays.toString(inArray(a, b)));
    }
    
    /**
     * Constructs a list of all elements in array1 that are substrings within
     * the strings of array2. Returns them in lexicographic order.
     * @param array1 List of substrings we're trying to find.
     * @param array2 List of strings we're trying to find the substrings within
     * @return Alphabetically sorted list of found substrings. Unique.
     */
    public static String[] inArray(String[] array1, String[] array2) 
    {
        ArrayList<String> inBoth = new ArrayList<>();
        if (array1.length == 0 || array2.length == 0)
        {
            return new String[]{};
        } 

        for (String a1 : array1)
        {
            for (String a2 : array2)
            {
                if (a2.contains(a1) && !inBoth.contains(a1))
                {
                    inBoth.add(a1);
                }
            }
        }
    
        String[] arr = new String[inBoth.size()];
        arr = inBoth.toArray(arr);
        Arrays.sort(arr);
        return arr;
    }
}
