public class euler_033 {
    public int createPerms() {
        float lcd = 1;

        //generate 123 - 999
        //start at 123 to remove a couple iterations
        for (int i = 1; i <= 9; i++){
            for(int j = 2; j <= 9; j++) {
                for(int k = 3; k <= 9; k++){

                    //make sure i, j, and k are unique
                    //make sure fractions is < 1
                    if (i != j && j!=k && i != k && (i*10 + j) < (j*10 +k)) {
                        int numerator = i*10 + j;
                        int denominator = j*10 + k;
                        double bigNum = 1.0*numerator / denominator;
                        double smallNum = 1.0*i/k;

                        //check if the inexperienced mathematician got lucky
                        if (bigNum == smallNum) {
                            System.out.println(numerator + "/" + denominator); //output for readability
                            lcd *= smallNum; //get the product of curious fractions
                        }
                    }
                }
            }
        }
        lcd = 1/lcd; //divide 1 by the curious fractions to get an approximation of the lowest common term
        return Math.round(lcd); //the answer wants an int, so we are rounding correctly
    }

    public static void main(String[] args){
        euler_033 e33 = new euler_033();
        int productDenom = e33.createPerms();
        System.out.println("Denominator = " + productDenom); //string + final answer for readability
    }

}
