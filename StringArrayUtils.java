 

/**
 * Created by Yang on 1/23/20.
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
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
      return array[array.length - 2];
      
}
    
    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String i : array){
            if (value.equals(i)){
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
            for(int i=0; i<array.length/2; i++){ 
                String temp = array[i]; 
                array[i] = array[array.length -i -1]; 
                array[array.length -i -1] = temp; }
                return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        for(int i = 0; i < array.length; i++){
            if (!array[i].equals(array[array.length - i - 1]))
            return false;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        StringBuilder str = new StringBuilder();
    	for (int i=0; i<array.length; i++) {
    		str.append(array[i]);
    	}
    	String arr = str.toString();
        int index = 0;
        boolean[] visited = new boolean[26];
        for (int id = 0; id < arr.length(); id++) {
            if ('a' <= arr.charAt(id) && arr.charAt(id) <= 'z') {
                index = arr.charAt(id) - 'a';
            } else if ('A' <= arr.charAt(id) && arr.charAt(id) <= 'Z') {
                index = arr.charAt(id) - 'A';
            }
            visited[index] = true;
        }
 
        for (int id = 0; id < 26; id++) {
            if (!visited[id]) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
      int res = 0;
      for (int i = 0; i < array.length; i ++)
      if (value == array[i])
      res++;
      return res;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int leng = 0;
        for(int i = 0; i < array.length; i++) {
            if(!array[i].equals(valueToRemove)) {
                leng++;
            }
        }
        String[] result = new String[leng];
        int pos = 0;
        for(int i = 0; i < array.length; i++) {
             if(!array[i].equals(valueToRemove)) {
                 result[pos] = array[i];
                 pos++;
             }
        }
        return result;

    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int num= 0;
        String temp = "";
        for (int i = 0; i < array.length; i++){
            if(array[i].equals(temp)){
                array[i] = null;
                num++;
        }
        else temp = array[i];
    }
    String [] result = new String[array.length - num];
    int j = 0;
    for (int i = 0; i < array.length; i++){
        if (array[i] == null)
        continue;
        result[j] = array[i];
        j++;
    }
    return result;           
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int len = 1;
        for(int i = 0; i < array.length - 1; i++){
            if (array[i] != array[i+1]){
                len += 1;
            }
        }
        
        String[] res = new String[len];
        int count = 1;
        int k = 0;
        for(int i = 0; i < array.length; i++){
            if ( i+1 < array.length && array[i] == array[i+1]){
                count += 1;
            }
            else{
                StringBuilder str = new StringBuilder();
                for (int j = 0; j < count; j++){
                    str.append(array[i]);
                }
                res[k++] = str.toString();
                count = 1;
            }
        }
        return res;
    }


}
