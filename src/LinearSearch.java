import java.util.Scanner;
// linear search executes/run one by one
// start from 0 position and execute 0 to 1,2,3,4,5 - index position
public class LinearSearch {
    public static void main(String[] args) {
        System.out.println("Enter Size Of An Array");
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        System.out.println("Enter Array Elements");
        int numsArr[] = new int[arrSize];
        //array elements to insert
        for(int i=0;i<arrSize;i++){
            numsArr[i]=sc.nextInt();
        }
        // to view inserted array elements
        for(int j=0; j< numsArr.length;j++){
            System.out.print(numsArr[j] + " ");
        }
        System.out.println("Enter The Value to find Index Position: ");
        int userInput = sc.nextInt();
        // object creation
        LinearSearch obj = new LinearSearch();
        int result = obj.linearSearch(userInput,numsArr);
        if(result != -1){
            System.out.println("User Input located in "+result + " index");
        }
        else{
            System.out.println("User Input Not In Array List");
        }
    }
    public int linearSearch(int userInput, int numsArr[]){
        for(int r=0; r<numsArr.length;r++){
            if(numsArr[r]==userInput){
                return r;
            }
        }
        return -1;
    }
}
