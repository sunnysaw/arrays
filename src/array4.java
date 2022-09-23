/*
in this program we will sse about difference function of arrays.
 */
/*
Question section: we have given a number we have to find where the number present in array or not?
int arr[] = { 5, 1, 1, 9, 7, 2, 6, 10 };
int toCheckValue = 7;
 */
/*
Approach how to solve this type of coding question in java language are given below:
in this section we are using linear search for solving this question by travers the whole elements and checked if element
found in array then we simply return it otherwise we have to return false.
 */
import java.util.Arrays;
public class array4 {
    public static void check(int arr[] , int checckarr){
        boolean test = false;
        for (int element:arr) {
            if (element == checckarr){
                test = true;
                break;
            }
        }
        System.out.println("if " + checckarr + " is present in array then return : " + test);
    }
    public static void main(String[] args) {
        int arr[] = {5, 1, 1, 9, 7, 2, 6, 10 };
        int checkarr = 7;
        check(arr , checkarr);
        System.out.println(Arrays.toString(arr));
    }
}
