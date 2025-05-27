# Algorithm to remove the even elements of the array

Use the next algorithm:

Java ->
`````
public int[] removeEven(int[] array) {
    int countEven = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 != 0) {
        countEven++;
      }

    }
    int[] result = new int[countEven];
    int index = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] % 2 != 0) {
        result[index] = array[i];
        index++;
      }
    }
    return result;

  }
`````
