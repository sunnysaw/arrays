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
in this section we are using binary search for solving this question by dividing the whole element into two part and
then check whether the element found in upward or downward , if the element found in the list then we have to return it
otherwise return false.
 */
import java.util.Arrays;
public class array3 {
    public static void check(int arr[] , int checkarr){
        Arrays.sort(arr);
        int res = Arrays.binarySearch(arr , checkarr);
        boolean test = res > 0 ? true : false ;
        System.out.println("if " + checkarr + " is present in array then return : " + test);
    }
    public static void main(String[] args) {
        int arr[] ={5, 1, 1, 9, 7, 2, 6, 10 };
        int checkarr = 7;
        System.out.println(Arrays.toString(arr));
        check(arr, checkarr);
    }
}
