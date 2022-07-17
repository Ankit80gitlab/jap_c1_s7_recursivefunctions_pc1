package com.jap.doubledigits;

public class ReplaceDigitsOfNumber {
    public static void main(String[] args) {

        ReplaceDigitsOfNumber replaceDigitsOfNumber = new ReplaceDigitsOfNumber();

        
		
		// Make calls to the function to test both positive and negative integers
        System.out.println(replaceDigitsOfNumber.doubleDigits(-290));
        System.out.println(replaceDigitsOfNumber.doubleDigits(348));
    }

    // Function accepts a number and returns integer by replacing every digit of number with two of that digit.
    public long doubleDigits(long number) 
	{

        long swap=0;
        long place=1;
        long place2=1;


		if (number==0)
        {
            return 0;
        }
        else if (number>0 && number<=999) {
            swap += place * 10 * (number % 10) + (number % 10) * place2;
            number /= 10;
            place *= 100;
            place2 *= 100;
            swap += place * 10 * (number % 10) + (number % 10) * place2;
            number /= 10;
            place *= 100;
            place2 *= 100;
            swap += place * 10 * (number % 10) + (number % 10) * place2;

            return swap;
        }
        else if (number<0 && number>=-999)
        {
            number=number*-1; //
            swap += place * 10 * (number % 10) + (number % 10) * place2;
            number /= 10;
            place *= 100;
            place2 *= 100;
            swap += place * 10 * (number % 10) + (number % 10) * place2;
            number /= 10;
            place *= 100;
            place2 *= 100; 
            swap += place * 10 * (number % 10) + (number % 10) * place2; 
            number /= 10;

            return(swap*-1);
        }
		else if (number>0 && number>100000)
		{
            swap += place * 10 * (number % 10) + (number % 10) * place2;
            number /= 10;
            place *= 100;
            place2 *= 100;
            swap += place * 10 * (number % 10) + (number % 10) * place2;
            number /= 10;
            place *= 100;
            place2 *= 100;
            swap += place * 10 * (number % 10) + (number % 10) * place2; 
            number /= 10;
			place *= 100;
            place2 *= 100;
			swap += place * 10 * (number % 10) + (number % 10) * place2; 
            number /= 10;
			place *= 100;
            place2 *= 100;
			swap += place * 10 * (number % 10) + (number % 10) * place2; 
            number /= 10;
			place *= 100;
            place2 *= 100;
			swap += place * 10 * (number % 10) + (number % 10) * place2;

			return swap; 
		}
		else if (number<0 && number<-100000)
		{
            number=number*-1;
			swap += place * 10 * (number % 10) + (number % 10) * place2;
            number /= 10;
            place *= 100;
            place2 *= 100;
            swap += place * 10 * (number % 10) + (number % 10) * place2;
            number /= 10;
            place *= 100;
            place2 *= 100;
            swap += place * 10 * (number % 10) + (number % 10) * place2; 
            number /= 10;
			place *= 100;
            place2 *= 100;
			swap += place * 10 * (number % 10) + (number % 10) * place2; 
            number /= 10;
			place *= 100;
            place2 *= 100;
			swap += place * 10 * (number % 10) + (number % 10) * place2; 
            number /= 10;
			place *= 100;
            place2 *= 100;
			swap += place * 10 * (number % 10) + (number % 10) * place2;

			return swap*-1;
		}
        else
        {
            return 0; 
        }
    }
}

