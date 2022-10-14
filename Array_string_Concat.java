long solution(int[] a) {
long sum=0;

for(int i =0; i<a.length;i++)
{
   
for(int j =0; j<a.length;j++)
{
   String s1 = Long.toString(a[i]);
        String s2 = Long.toString(a[j]);
 
        // Concatenate both strings
        String s = s1 + s2;
 
        // Convert the concatenated string
        // to integer
        long c = Long.parseLong(s);
        sum=sum+c;
} 
}


 return sum;
 

}