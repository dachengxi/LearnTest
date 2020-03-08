package me.cxis.algorithms.dynamic_programming.stock3;

/**
 * 给定一只股票n天价格，可以进行最多两次买和两次卖，每次买卖都是一股，不能再卖光手中股票前买入，
 * 但可以同一天卖完后买入，问最大收益
 *
 * 输入：{4,4,6,1,1,4,2,5}
 * 输出：6（4买入6卖出 1买入5卖出）
 *
 * 只能买卖最多两次，需要记录下已经买卖了多少次
 *
 * 确定状态：
 * 最后一步：在最后策略中，最后一次卖发生在第j天
 *
 * 需要枚举最后一次买发生在第几天
 */
public class Stock {
    // TODO
}
