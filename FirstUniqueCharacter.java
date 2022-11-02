public static int getUniqueCharacter(String s) {
    // Write your code here
//int ascii=97;

int arr[]=new int [26];
Arrays.fill(arr,0);

for(int i=0;i<s.length();i++)
{
    int value=(int)s.charAt(i)-97;
    arr[value]++;
}
int min_index=s.length();
int temp=0;
for(int i=0;i<26;i++)
{
    if(arr[i]==1)
    {
        temp=s.indexOf((char)i+97);
        if(temp<min_index)
        {
            min_index=temp;
        }
    }
    
    
    
}
if(min_index==s.length())
{
    return -1;
} 
else{
    return min_index+1;
}
    }

}