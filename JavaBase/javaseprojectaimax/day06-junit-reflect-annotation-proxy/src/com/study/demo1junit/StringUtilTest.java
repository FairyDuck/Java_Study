package com.study.demo1junit;


import org.junit.Assert;
import org.junit.Test;

// 测试类: 使用Junit单元测试框架，对业务类方法进行正确性测试
public class StringUtilTest {
    // 测试方法: 必须是public，无参，无返回值
    // 测试方法必须加上@Test注解
    @Test
    public void testPrintNumber() {
        // 测试步骤
        StringUtil.printNumber("张三abc");
        // 测试用例
        StringUtil.printNumber("");
        StringUtil.printNumber(null);
    }

    @Test
    public void testGetMaxIndex() {
        // 测试步骤
        int maxIndex = StringUtil.getMaxIndex("张三abc");
        // 测试用例
        int maxIndex1 = StringUtil.getMaxIndex("");
        int maxIndex2 = StringUtil.getMaxIndex(null);

        // 做断言: 断言结果是否与预期结果一致
        Assert.assertEquals("测试失败",4, maxIndex);
    }
}
