package other;

/**
 * @author Wangmingcan
 * @date 2021/5/10 11:29
 * @description
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.List;




/*
 * @(#)BoyerMooreAlgorithm.java       2016年9月28日
 *
 * 友阿集团拥有完全的版权
 * 使用者必须经过许可
 */
/**
 * Boyer-Moore算法 从匹配字符的末尾匹配。
 * 首先，"字符串"与"搜索词"头部对齐，从尾部开始比较。
 * 这是一个很聪明的想法，因为如果尾部字符不匹配，那么只要一次比较，就可以知道（整体上）肯定不是要找的结果。
 * http://www.ruanyifeng.com/blog/2013/05/boyer-moore_string_search_algorithm.html
 *
 * @author xiahu
 * @since JDK 1.8
 */
public class BoyerMooreAlgorithm {
    public static void main(String[] args) {

        System.out.println(new Date().toLocaleString());
        for (int i = 0; i < 1000000; i++) {
        //System.out.println("计算次数:" + i);
            match("世界屋脊上中华中华人民共和国人民共和国慢慢下中华降什么中华人民共和国世界希望就是中华人民共和国世界", "中华人民共和国");
        }
        System.out.println(new Date().toLocaleString());
    }

    public static void match(String originalStr, String searchStr) {


        int originalLen = originalStr.length();
        int searchLen = searchStr.length();
        int matchCount = 0; //匹配了几个字符


        for (int i = 0; i < originalLen;) {
            int countI = i;
            if (originalLen - i < searchLen) {
                break;
            }
            for (int j = searchLen; j > 0; j--) {
//从字符的尾部开始匹配
                String originalChar = originalStr.substring(countI + searchLen - 1, countI + searchLen);
                String searchChar = searchStr.substring(j - 1, j);
                if (searchChar.equals(originalChar)) {
                    matchCount++;
                    if (matchCount == searchLen) {
//System.out.println("匹配到位置:" + (i));
                        i = i + searchLen - 1;
                        matchCount = 0;
                        break;
                    }
                    countI--;
                }
                else {
//分别计算位移数
                    int shift = 0;
                    if (matchCount != 0) {
                        String goodStr = searchStr.substring(searchLen - matchCount, searchLen);
                        int goodIndex = getGoodIndex(goodStr, searchStr); //计算匹配的好后缀的位置
                        int badIndex = searchStr.indexOf(originalChar); //计算坏字符的位置
                        int maxInt = getMaxInt(goodIndex, badIndex);
//后移位数 = 好后缀的位置 - 搜索词中的上一次出现位置
                        shift = searchStr.length() - 1 - maxInt;
                    }
                    else {
//坏匹配字符
                        int index = searchStr.indexOf(originalChar);
                        shift = searchLen - 1 - index;
                    }
                    i = i + shift;
                    matchCount = 0;
                    break;
                }
            }
        }
    }


    /**
     * 计算好后缀的位置
     *
     * @author xiahu
     * @param goodStr
     * @param searchStr
     * @return
     * @since JDK 1.8
     */
    private static int getGoodIndex(String goodStr, String searchStr) {
        final List<String> list = new ArrayList<String>();
        int minIndex = 0;
        for (int i = 0; i < goodStr.length(); i++) {
            list.add(goodStr.substring(i, goodStr.length()));
        }
        for (String str : list) {
            int index = searchStr.indexOf(str);
            if (str.length() > 1) {
                index = index + str.length() - 1;
            }
            if (index < minIndex) {
                minIndex = index;
            }
        }
        return minIndex;
    }


    private static int getMaxInt(int a, int b) {
        return a > b ? a : b;
    }
}