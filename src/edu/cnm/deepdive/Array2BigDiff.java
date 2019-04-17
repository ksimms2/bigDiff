package edu.cnm.deepdive;

public class Array2BigDiff {

  public int bigDiff(int[] nums){

    //find the difference between to ints in an array
    //return count between the largest & smallest values
    // for loop to find the ints in their indexes
    // Math.max to find the largest
    //Math.min to find the smallest

    int max = nums[0];
    int min = nums[0];
    int count;

    for(int i = 0; i < nums.length; i++){
      if( nums[i] > max){
        max = nums[i];
      }else if(nums[i] < min){
        min = nums[i];
      }
    }
      // count ints between max and min
     count = max - min;
    return count;
  }


}
