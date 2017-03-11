package example;

public class Sortor {
  public int[] sortValue(int[] values) {
	  //Bubble Sort
	  for(int i = 0; i < values.length; i++) {
		  for(int j = i; j < values.length; j++) {
			  if(values[i] > values[j]) {
				  int tmp = values[i];
				  values[i] = values[j];
				  values[j] = tmp;
			  }
		  }
	  }
	  
	  return values;
  }
}
