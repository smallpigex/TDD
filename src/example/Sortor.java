package example;

public class Sortor {
  public int[] sortValue(int[] values) {
	  
	  if(values.length > 1 && values[0] > values[1]) {
		  int tmp = values[0];
		  values[0] = values[1];
		  values[1] = tmp;
	  }
	  return values;
  }
}
