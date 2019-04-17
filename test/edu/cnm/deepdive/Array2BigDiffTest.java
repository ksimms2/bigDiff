package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Array2BigDiffTest {


  int[] array1 = {10, 3, 5, 6};
  int[] array2 = {7, 2, 10, 9};
  int[] array3 = {2, 10, 7, 2};
  Array2BigDiff bigAl = new Array2BigDiff();

  @Test
  void arrayWillRt7(){
    int temp = bigAl.bigDiff(array1);
    assertEquals(7,temp);
  }

  @Test
  void arrayWillReturn8(){
    int temp2 = bigAl.bigDiff(array2);
    assertEquals(8, temp2);
  }

  @Test
  void arrayWillReturn8X(){
    int temp3 = bigAl.bigDiff(array3);
    assertEquals(8, temp3);
  }

}