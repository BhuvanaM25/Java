class BinarySearch
{
public static void main(String[] args)
{
  int a[]={10,20,30,40,50,60,70,80,90,100};
  int key=30;
  int l=0;
  int h=a.length-1;
  boolean flag=true;
  while(l<=h)
  {
   int m=(l+h)/2;
   if(a[m]==key)
   {
       System.out.println("element is found");
       flag=true;
       break;
   }

   if(a[m]<key)
   {
        l=m+1;
   }

 

   if(a[m]>key)
   {
        h=m-1;
   }

   if(flag==false)
   {
        System.out.println("element is not found");
   }

  }
}
}