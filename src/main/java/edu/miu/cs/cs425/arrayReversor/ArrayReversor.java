package edu.miu.cs.cs425.arrayReversor;


public class ArrayReversor {
	
	
	ArrayFlattenerService arrayFlattenerService;
	public ArrayReversor(ArrayFlattenerService arrayFlattenerService) {
		this.arrayFlattenerService = arrayFlattenerService;
	}
	
	
	public  int[] reverseArray(int[][] a) {
		if(a == null) {
			return null;
		}
		int[] flattend = arrayFlattenerService.flattenArray(a);
		
		int[] reversed = new int[flattend.length];
		int j=0;
		for(int i = flattend.length-1;i!=-1;i--) {
		
			reversed[j]= flattend[i];
			j++;
		}
		return reversed;
	}

}
