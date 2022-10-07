import java.util.HashSet;

public class P3_String {

    public static void main(String[] args) {

        String s = "abccba";

        //最长字串长度
        int maxLength = 0;
        //缓存长度
        int temp = 0;
        //记录出现过的字符
        HashSet<String> context = new HashSet<>();

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            //当前位置向后遍历，获得最大长度
            for (int j = i; j < chars.length; j++) {
                if (!context.contains(chars[j]+"")){
                    //长度+1
                    temp++;
                    //将当前字符记录进字典
                    context.add(chars[j]+"");
                }else {
                    break;
                }
            }
            //结束内循环的终止判断
            if (temp > maxLength){
                maxLength = temp;
            }
            //重置计数
            temp = 0;
            //清空字典
            context.clear();
        }

        if (temp > maxLength){
            maxLength = temp;
        }

        System.out.println(maxLength);

    }

}
