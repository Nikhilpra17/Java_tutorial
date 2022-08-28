- Scanner usage in java:
    - Assign it differently for the different data type otherwise it would not capture the data after space.
  
 String Format
 
 Linked List
 
 Constructor
 
 - If you want to hover over the values of string, use  = string.charAt(index);
 
 parse
 typecasting
  
- Asymptotic analysis = observing performance of very very large Inputs 

inheritance
bit manipulation
bit opeartors
recurrsive and iterative 
ArrayList 2D Matrix
- int i=Integer.parseInt("200");   convert String to Integer

Rain water trapping

 - If N is a perfect square, then it has an odd number of factors. 
 
 Subarray question
 Hashing
* >> right shift by one is same as divided by 2.

* << left shift by one is same as multiply by 2.


* Masking is done to check the number is even or odd. If the last bit is 1 = odd and if last bit is 0 = even.
    * to do this -   (A & 1 == 0) //Even

#### If need to swap two number-
    * use XOR (^) operator.
    * int A = A ^ B;
    * int B = A ^ B;
    * int A = A ^ B;
    
##### To find set bit in an number - n & (n-1)
    
#### To find the only non repeating element in an array we can use XOR.

- ***Convert String to char Array = str.toCharArray();

### >- Operator 
* separates the parameters (left-side) from the implementation (right side).
* (Parameters) -> { Body } where the -> separates parameters and lambda expression body.
* This one is useful as well when you want to implement a functional interface
  * Runnable r = ()-> System.out.print("Run method");
* is equivalent to
     * - Runnable r = new Runnable() {
         - @Override
       - public void run() {
       -    System.out.print("Run method");
       - }
       - }; 


***Whenever wanted to convert the integer to String, use the function as  = Integer.toString


printf("%d", ij);

switch (input){
case 2 : -------
break;
}

for (int i : cases){
}


- ***When Class Are decleared FINAL , you Can't extends it to subclasses. Eg - String Class, Intger, Double***<br>
- - ***SUPER KEYWORD - When the object is made of subclass, its superclass constructer is also called, but when Super class construct have some input in default class then it error to removed in the sub child using the SUPER keyword***<br>
- ***When Final keyword is used .....it always have to written with Capital Letter as convention ***<br>
