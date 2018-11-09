package question8;

public class NumberManupulation {
	
	public NumberManupulation() {}
	
	public Integer builder(Integer a, Integer b) {
		
		if((a == null) || (b == null)) {
			return null;
		}
		
		char arrayA[] = String.valueOf(a).toCharArray();
		char arrayB[] = String.valueOf(b).toCharArray();
		
		StringBuilder arrayC = new StringBuilder();		

		int maxLength = Math.max(a, b);

		for (int i = 0; i < maxLength; i++) {

			if (arrayA.length > i) {
				arrayC.append(arrayA[i]);
			}

			if (arrayB.length > i) {
				arrayC.append(arrayB[i]);
			}
		}

		Integer result = Integer.valueOf(arrayC.toString());

		return (result > 1000000) ? -1 : result;
	}


}
