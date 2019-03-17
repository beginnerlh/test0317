/*
 * 集合 S 包含从1到 n 的整数。不幸的是，因为数据错误，导致集合里面某一个元素复制了成了集合里面的另外一个元素的值，导致集合丢失了一个整数并且有一个元素重复。
给定一个数组 nums 代表了集合 S 发生错误后的结果。你的任务是首先寻找到重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。

示例 1:
输入: nums = [1,2,2,4]
输出: [2,3]
*/
package lianxi0317;
import java.util.*;
public class test0317 {
	public static void main(String[] args) {
		Solution S = new Solution();
		int[] nums = new int[] { 1, 2, 2, 4};
		int[] a = S.findErrorNums(nums);
		for(int i : a) {
			System.out.print(i + " ");
		}
	}
}


class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);//先将数组从小到大排序
        int[] a = new int[2];
        int count = 0;
        for( int i = 0; i < nums.length - 1; i++){
            if(nums[i] - nums[i + 1] ==0){//找到相同的数字
                a[0] = nums[i];
            }
            if( nums[i] - nums[i+1] == -2){
            	//如果相差为2，说明缺的是nums[i]与nums[i+1]之间的数
               a[1] = nums[i] +1;
                count ++;
            }
        }
        if(count == 0 ){
        	//说明没出现相差为2的情况，那么只能是在前两个或者后两个。
            if( nums[0] == 1){
                a[1] = nums.length;
            }else{
                a[1] = 1;
            }
        }
        return a;
          
    }
}