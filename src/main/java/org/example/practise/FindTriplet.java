package org.example.practise;

import static java.lang.StringTemplate.STR;

public class FindTriplet {
    // Driver program to test above functions
    public static void main(String[] args) {
        FindTriplet triplet = new FindTriplet();
        int[] A = {1, 4, 45, 6, 10, 8};
        int sum = 22;
        int arrSize = A.length;

        triplet.find3Numbers(A, arrSize, sum);
    }

    private void find3Numbers(int[] a, int arrSize, int sum) {
        boolean isTripletFound = false;
        for (int i = 0; i < arrSize; i++) {
            for (int j = i + 1; j < arrSize; j++) {
                for (int k = j + 1; k < arrSize; k++) {
                        if (a[i]+a[j]+a[k] == sum){
                            isTripletFound = true;
                            System.out.println(STR."Triplets are \{a[i]}, \{a[j]}, \{a[k]}");
                        }
                }
            }
        }
        if (isTripletFound) {
            System.out.print("No Triplets found");
        } else {
            System.out.print("");
        }
    }
}
