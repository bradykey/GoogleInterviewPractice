public float calcAvgOfLastKTerms(int k, float[] terms){
	float sum = 0.0;
	
	// sum up the last k terms
	for (int i = terms.length - k; i < terms.length; i++)
		sum += terms[i];

	// calc average
	return sum/k;
}

public static void main(String[] args) {
	AvgKTerms prog = new AvgKTerms();
	float avg = prog.calcAvgOfLastKTerms(8, new float[]{1,1,3,23,34,5,2,1,23,4,6,6});
	
	System.out.println(String.valueOf(avg));
}