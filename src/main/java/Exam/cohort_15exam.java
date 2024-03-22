package Exam;

public class cohort_15exam {

    //1
    public static void oddNumbers(){
       int num=10;

        for (int i =1;i<=10;i+=2) {
                System.out.println(i);

        }

    }
        //2
//array of integers,returns the sum
    public static int arrayOf (int [] returnSum) {
int sum =0;
for (int nums:returnSum) {
    sum +=nums;
}
        return sum;
    }

    public static void main(String[] args) {
        //1
oddNumbers();
//2
        int [] numbers = {5,6,7,8};
        int sums= arrayOf(numbers);
        System.out.println(sums);
//3

        //4
getRandom();
//5

        //6
        volume(5,4.3,6);

        //7

        //8

        //9


        //10

    }
    //3 (calculate the average of arrays )


    //4
    public static void getRandom(){
        double random= Math.random();
        int randomNumber=(int) (random*6)+1;
        System.out.println(randomNumber);
    }
    //5

    //6
public static void volume (int a,double b,double c){
    System.out.println(a*b*c);
}

    //7
    public static String numOfChar (int numOf){

    }

    //8

    //9

   // 10
    public static void userTic (){
        
    }

}
