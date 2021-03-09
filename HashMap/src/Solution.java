public class Solution {

    /*
    #Leetcode Problem387
    * index = ch - 'a' 转换成哈希函数 f(ch) = ch - 'a'
    * 哈希冲突： 很难保证每一个键，通过哈希函数的转换，对应不同的“索引”
        哈希函数设计： 整型，mod 一个素数； 字符串：转成整型处理
    * */
    public static int firstUniqChar(String s) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
           // System.out.println(s.charAt(i) - 'a');
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int i = firstUniqChar("leetcode");
        System.out.println(i);
    }
}
