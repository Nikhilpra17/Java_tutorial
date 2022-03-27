package com.company;
//ferhrenheit to celcius function

public class returnValue {
        public static void main(String[] args) {
            double noon = 77;          //temperature at noon in fahrenheit.
            double evening = 61;       //temperature during the evening in fahrenheit
            double midnight = 55;      //temperature at midnight in fahrenheit

            //Task 3 - Call the printTemperatures function.
            double celnoon = farhrenheitToCelsius(noon);
            double celeve = farhrenheitToCelsius(evening);
            double celmid = farhrenheitToCelsius(midnight);

            printtemp(noon, celnoon);
            printtemp(evening, celeve);
            printtemp(midnight, celmid);

        }


        //Task 1: Make a function here. See the doc comments below.
        public static double farhrenheitToCelsius (double farhrenheit) {
            double celsius = (farhrenheit - 32) * 5 / 9d;
            return celsius;
        }

    /**
     *
     * @param farhrenheit
     * @param celsius
     */
        public static void printtemp(double farhrenheit, double celsius) {
            System.out.println(farhrenheit + " degree temp in Farhrenheit is equals to " + celsius + " degree in celsius");
        }


}
