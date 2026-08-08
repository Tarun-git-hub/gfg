class Solution {
	// find pivot index
	static int findPivotIndex(int[] arr) {
		int n = arr.length;
		int s = 0;
		int e = n - 1;
		int ans = -1;
		if (arr[s]<arr[e]) {
			return - 1;
		}
		while (s <= e) {
			int mid = s + (e - s)/2;
			if (arr[mid] <= arr[n - 1]) {
				e = mid - 1;
			}
			else {
				ans = mid;
				s = mid + 1;
			}
		}
		return ans;
	}
	
	// binary search
	static int binarySearch(int[] arr, int s, int e, int target) {
		int n = arr.length;
		while (s <= e) {
			int mid = s + (e - s)/2;
			if (arr[mid] == target) {
				return mid;
			}
			else if (arr[mid]<target) {
				s = mid + 1;
			}
			else {
				e = mid - 1;
			}
		}
		return - 1;
	}
	
	int search(int[] arr, int key) {
		// code here
		int pivotIndex = findPivotIndex(arr);
		int n = arr.length;
		
		// for edge case
		if (pivotIndex == -1) {
			int ans = binarySearch(arr, 0, n-1, key);
			return ans;
		}
		
		else {
			// for searching in l1
			int startArray1 = 0;
			int endArray1 = pivotIndex;
			if (key >= arr[startArray1] && key <= arr[endArray1]) {
				int ans = binarySearch(arr, startArray1, endArray1, key);
				return ans;
			}
				
				// for searching in l2
				int startArray2 = pivotIndex + 1;
				int endArray2 = n - 1;
				if (key >= arr[startArray2] && key <= arr[endArray2]) {
					int ans = binarySearch(arr, startArray2, endArray2, key);
					return ans;
					
				}
				
			}
			return - 1;
		}
	}

