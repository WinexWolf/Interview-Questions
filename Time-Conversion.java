//Hackerrank Time Conversion

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    int len=s.length();
    char ap=s.charAt(len-2);
    String hrs=s.substring(0,2);
    
if(ap=='A')
{
    if(hrs.equals("12"))
    {
        s=s.replace(s.substring(0,2),"00");
     
    
    }
  
    return (s.substring(0,len-2));
    
    
}
else{
    int hr=Integer.parseInt(hrs);
 if(!hrs.equals("12"))
 {
     s=s.replace(hrs,String.valueOf(hr+12));
 }
    return (s.substring(0,len-2));
}
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
