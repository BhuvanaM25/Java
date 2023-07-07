class LinearSearch
{
public static void main(String[] args)
{
  int a[]={1,2,3,4,5};
  int key=5;
  boolean flag=false;
  for(int i=0;i<a.length;i++)
  {
    if(key==a[i])
    {
      System.out.println("Element is found at:"+" "+a[i]);
      flag=true;
      break;
    }
  }
  if(flag==false)
  {
    System.out.println("Element is not found");
  }
}
}