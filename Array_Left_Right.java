boolean[] solution(int[] numbers, int left, int right) {
boolean [] result=new boolean[numbers.length];
A:for(int j=0;j<numbers.length;j++)
{
for(int i=left;i<=right;i++)
{
    if(numbers[j]==(j+1)*i)
    {
  result[j]=true;
    continue A;
    }
    else{
        result[j]=false;
    }
    
}
}

return result;


}
