class ArmstrongNumber {
    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = countDigits(number);
        while (number != 0) {
            int digit = number % 10; 
            sum += Math.pow(digit, digits); 
            number /= 10; 
        }
        return sum == originalNumber;
    }
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
    public static void main(String[] args){
        int number = 153;
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
    
    
}
