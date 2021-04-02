public class MaxSumSubArray {
	
	//Dynamic Programming
	public int maxSumSubArray(int[] array) {
		int maxSum = array[0];
		int currentSum = array[0];
		for (int i = 0; i < array.length; i++) {
			currentSum = Math.max(currentSum, currentSum + array[i]);
			maxSum = Math.max(maxSum, currentSum);
		}
		return maxSum;
	}
}
