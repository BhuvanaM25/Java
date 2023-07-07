import java.util.Scanner;
class Main
{
public static void main(String[] args) 
{
Date date = new Date(2002,6,32);
date.printDate();
}
}
class Date 
{
private int year;
private int month;
private int date;
public Date (int year,int month,int date) 
{
this.year = year;
this.month = month;
this.date = date;
validateDate();
 }
}
private boolean isLeapYear () {

if (year%4 == 0)

return true;

else

return false;

}

private void validateDate () {

if (date>31) {

while (date>31) {

this.date = date - 31;

incrementMonth();

}

}

if (month>12) {

while (month>12) {

this.month = month-12;

incrementYear();

}

}

}

private void incrementYear () {

this.year = year+1;

}

private void incrementMonth () {

this.month = month+1;

}

public void printDate () 
{

System.out.println(date+" / "+month+" / "+year);

 }

}