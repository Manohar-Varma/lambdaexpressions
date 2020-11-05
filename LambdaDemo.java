package lambdaexpressions;

@FunctionalInterface
interface Converter
{
    double convert(double input);
}

public class LambdaDemo
{

    static double convert(Converter converter, double input)
    {
        return converter.convert(input);
    }


    public static void main(String[] args)
    {
        // Convert Fahrenheit to Celsius
        System.out.println(convert(input -> (input-32)*5.0/9.0, 98.6));

        // Convert Kilometers to Miles
        System.out.println(convert(input -> input/1.609344, 9));

    }


}