package AllQuestionArray;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

public class DuplicateValueInArray {
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,6,7,1};
       // Duplicate(arr);
        duplicate(arr);

    }
//    static  void Duplicate(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i]==arr[j]){
//                    System.out.println("duplicate Value is = " + arr[j]);
//                }
//            }
//        }
//    }

    static void duplicate(int[] arr){
//        int start=arr[0];
//        int end= arr.length-1;
//        while (arr[start]<arr[end]){
//            if (arr[start]==arr[end]){
//                System.out.println(arr[start]);
//
//            }
//            start++;
//
//        }

        Set<Integer> unique= new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(unique.contains(arr[i])){
                System.out.println("duplicate value =" + arr[i]);
            }
            else {
                unique.add(arr[i]);
            }
        }
    }
}
