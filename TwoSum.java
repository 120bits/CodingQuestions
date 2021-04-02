public class TwoSum {
		public static int[] twoSum(int array[], int target) {
			HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
			for (int i = 0; i < array.length; i++) {
				int value = target - array[i];
				if (map.containsKey(value)) {
					return new int[]{map.get(value), i};
				}
				map.put(array[i], i);
			}
			return null;
		}	
}
