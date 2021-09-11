public class Main {
    public static void main(String[] args){
        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        System.out.println("minValue that int can store is "+minValue);
        System.out.println("maximum value that int can store is "+maxValue);
//        int is a primitive type Integer is wrapper class
        System.out.println("Busted max value is"+ (maxValue+1));
//        it causes overflow and gives minimum value as output
        System.out.println("Busted ,in value is "+ (minValue - 1));
        //   it causes overflow and gives minimum value as output

        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte max value is "+ minByteValue);
        System.out.println("Byte min value is " + maxByteValue);

        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        System.out.println("short min value is "+ minShortValue);
        System.out.println("short max value is " + maxShortValue);

        long longValue = 100L;
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        System.out.println("Long min value is "+ minLongValue);
        System.out.println("Long max value is "+ maxLongValue);
    }
}
