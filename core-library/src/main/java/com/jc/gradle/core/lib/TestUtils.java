package com.jc.gradle.core.lib;

/***
 * <p>TestUtils 测试工具类 </p>
 * @author son
 * @version v1.0
 */
public class TestUtils {

    /**
     * 接口释义：测试打印 printTest
     *
     * @author 江俊超
     * @version 0.0.1
     */
    public static void printTest() {
        System.out.print("printTest");
    }





    /**
     * 接口释义：招商人员添加订单<p>
     * 请求方式：POST<p>
     * 请求url:http:// 用户IP:端口/admin/order/cooperate_business/add<p>
     * 接口说明：<p>
     * 校验：<p>
     * 1. 验证客户是否为该项目的
     * <ul>
     * <li>满足新增订单条件</li>
     * <li>不是：提示为【客户不属于当前项目，无法添加订单】；</li>
     * </ul>
     * 2. 单元是否是该项目下的单元
     * <ul>
     * <li>是：满足新增订单条件</li>
     * <li>不是：提示为【合同签约单元与项目不匹配】</li>
     * </ul>
     * 3. 验证单元是否有订单存在
     * <ul>
     * <li>没有：满足新增订单条件</li>
     * <li>有：提示为【有单元已有订单存在，无法保存订单】</li>
     * </ul>
     * <p>
     * 4. 逻辑：
     * <ul>
     * <li>订单状态为【新增】，试算数据保存到CooperateBusinessOrderCost对象表中</li>
     * <li>订单新增完成后，改变单元状态为【订单期】，客户进行进阶【意向客户】</li>
     * </ul>
     * <p>
     * 本接口关联相关：{@link #printTest()}
     */
    public static void login() {

    }

    /**
     * 私有，不让直接构建
     */
    private TestUtils() {
    }
}
