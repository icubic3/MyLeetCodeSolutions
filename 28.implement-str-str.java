/*
 * @Author: your name
 * @Date: 2021-04-20 11:58:21
 * @LastEditTime: 2021-04-20 12:05:50
 * @LastEditors: Please set LastEditors
 * @Description: In User Settings Edit
 * @FilePath: /.leetcode/28.implement-str-str.java
 */
/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Implement strStr()
 */

// @lc code=start
class Solution {
    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) { return 0; }
        char[] haystackArr = haystack.toCharArray();
        char[] needleArr = needle.toCharArray();
        int index = -1;
        for (int i = 0;i < haystackArr.length;i++) {
            for (int j = 0;j < needleArr.length;j++) {
                if (i+j < haystackArr.length) {
                    if (haystackArr[i+j] == needleArr[j]) {
                        if (j == needleArr.length - 1){
                            index = i;
                            return index;
                        }
                    }else {
                        index = -1;
                        break;
                    }
                }
            }
        }
        return index;
    }
}
// @lc code=end

