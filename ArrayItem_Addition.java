int solution(int[] a) {
int [] b=new int [a.length];

for(int i=0; i<a.length;i++)
{
  if(i+1<a.length && i-1>=0)
{
b[i]=a[i]+a[i-1]+a[i+1];
} 
if(i+1>=a.length)
{
b[i]=a[i]+a[i-1]+0;
}
if(i-1<0)
{
b[i]=a[i]+0+a[i+1];
}

return b[];
}
