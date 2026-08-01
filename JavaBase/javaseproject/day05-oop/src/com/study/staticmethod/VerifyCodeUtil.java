package com.study.staticmethod;

public class VerifyCodeUtil {
    // 工具类无需创建对象，建议私有化构造器
    private VerifyCodeUtil() {}

    // 静态方法的应用，做工具类
    public static String getCode(int length) {
        String code = "";
        for (int i = 0; i < length; i++) {
            int number = (int)(Math.random() * 3);
            switch (number) {
                case 0:
                    int now0 = (int)(Math.random() * 10);
                    code += now0;
                    break;
                case 1:
                    int now1 = (int)(Math.random() * 26);
                    code += (char)(now1 + 'a');
                    break;
                case 2:
                    int now2 = (int)(Math.random() * 26);
                    code += (char)(now2 + 'A');
                    break;
             }
        }
        return code;
    }
}
