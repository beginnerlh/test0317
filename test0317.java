/*
 * ���� S ������1�� n �����������ҵ��ǣ���Ϊ���ݴ��󣬵��¼�������ĳһ��Ԫ�ظ����˳��˼������������һ��Ԫ�ص�ֵ�����¼��϶�ʧ��һ������������һ��Ԫ���ظ���
����һ������ nums �����˼��� S ���������Ľ�����������������Ѱ�ҵ��ظ����ֵ����������ҵ���ʧ�����������������������ʽ���ء�

ʾ�� 1:
����: nums = [1,2,2,4]
���: [2,3]
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
        Arrays.sort(nums);//�Ƚ������С��������
        int[] a = new int[2];
        int count = 0;
        for( int i = 0; i < nums.length - 1; i++){
            if(nums[i] - nums[i + 1] ==0){//�ҵ���ͬ������
                a[0] = nums[i];
            }
            if( nums[i] - nums[i+1] == -2){
            	//������Ϊ2��˵��ȱ����nums[i]��nums[i+1]֮�����
               a[1] = nums[i] +1;
                count ++;
            }
        }
        if(count == 0 ){
        	//˵��û�������Ϊ2���������ôֻ������ǰ�������ߺ�������
            if( nums[0] == 1){
                a[1] = nums.length;
            }else{
                a[1] = 1;
            }
        }
        return a;
          
    }
}