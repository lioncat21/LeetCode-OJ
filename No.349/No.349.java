public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<Integer>();
		for(int i = 0;i < nums1.length;i++){
			for(int j = 0;j < nums2.length;j++){
				if(nums1[i] == nums2[j]){
					s.add(nums1[i]);
				}
			}
		} 
		int[] a = new int[s.size()];
		int b = 0;
		for(Integer i : s){
			a[b] = i;
			b++;
		}
		return a;
    }
}