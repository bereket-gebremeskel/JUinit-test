package edu.miu.cs.cs425.arrayFlatten;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FlattenArray {
	
	public int[] flattenArray(int[][] arr) {
		if(arr == null)
			return null;
		int[] farray = Arrays.stream(arr).flatMapToInt(r -> IntStream.of(r)).toArray();
		return farray;
	}
}
