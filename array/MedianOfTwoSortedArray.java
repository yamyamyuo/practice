/**
*计算有限个数的数据的中位数的方法是：把所有的同类数据按照大小的顺序排列。如果数据的个数是奇数，则中间那个数据就是这群数据的中位数；如果数据的个数是偶数，则中间那2个数据的算术平均值就是这群数据的中位数。
*/ 
// simple solution
public static int findKthSmallest(int[] a, int m, int begin1, int[] b, int n, int begin2, int k) {

	if (m > n)
		return findKthSmallest(b, n, begin2, a, m, begin1, k);
	if (m == 0)
		return b[begin2 + k - 1];
	if (k == 1)
		return Integer.min(a[begin1], b[begin2]);
	//解决此题的方法可以依照：寻找一个unioned sorted array中的第k大（从1开始数）的数。因而等价于寻找并判断两个sorted array中第k/2（从1开始数）大的数。
	// 如果以上的条件都不符合，则继续进行二分查找, k/2, 因为m 肯定小于n，所以 min(k/2, m)
	// 为什么partB不会让b[]越界, 因为k本来输入就是m+n, partB = k - min(k/2, m); 不管怎样都不会越界
	int partA = Integer.min(k / 2, m), partB = k - partA;
	if (a[begin1 + partA - 1] == b[begin2 + partB - 1])
		return a[begin1 + partA - 1];
	else if (a[begin1 + partA - 1] > b[begin2 + partB - 1])
		return findKthSmallest(a, m, begin1, b, n - partB, begin2 + partB, k - partB);
	else
		return findKthSmallest(a, m - partA, begin1 + partA, b, n, begin2, k - partA);

}

public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	int len1 = nums1.length, len2 = nums2.length, sumLen = len1 + len2;
	if (sumLen % 2 != 0) {

		return findKthSmallest(nums1, len1, 0, nums2, len2, 0, sumLen / 2 + 1);
	} else {
		return (findKthSmallest(nums1, len1, 0, nums2, len2, 0, sumLen / 2)
				+ findKthSmallest(nums1, len1, 0, nums2, len2, 0, sumLen / 2 + 1)) / 2.0;
	}

}

