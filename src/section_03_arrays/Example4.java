package section_03_arrays;
// Pairs in array -
public class Example4 {
    public static void printPairs(int [] numbers){
        int totalPairs = 0; // calculate pairs

        for (int i =0; i < numbers.length; i++){
            int curr_index = numbers[i]; // 2,4,6,8...
            for (int j=i+1; j<numbers.length; j++){
                System.out.print("(" + curr_index + ","+ numbers[j] + ")");
                totalPairs ++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs is : "+ totalPairs);
    }
    public static void main(String[] args) {
        int [] numbers = {2,4,6,8,10};
        printPairs(numbers);
    }
}
