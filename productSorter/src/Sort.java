
public class Sort {

	public static void selectionSort(String[] pName, double[] pPrice) {
		// TODO Auto-generated method stub
		for (int i = 0; i < pPrice.length - 1; i++) {
		      // Find the minimum in the list[i..list.length-1]
		      double currentMin = pPrice[i];
		      String currentMinInfo = pName[i];
		      int currentMinIndex = i;

		      for (int j = i + 1; j < pPrice.length; j++) 
		      {
		        if (currentMin > pPrice[j]) {
		        currentMin = pPrice[j];
		        currentMinInfo = pName[j];
		        currentMinIndex = j;
		        }
		      }

		      // Swap list[i] with list[currentMinIndex] if necessary;
		      if (currentMinIndex != i) 
		      {
		    	  pPrice[currentMinIndex] = pPrice[i];
		    	  pPrice[i] = currentMin;
		    	  
		    	  pName[currentMinIndex] = pName[i];
		    	  pName[i] = currentMinInfo;
		      }
		    }

	}

}
