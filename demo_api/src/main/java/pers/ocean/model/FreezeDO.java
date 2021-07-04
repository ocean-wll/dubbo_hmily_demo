package pers.ocean.model;

import lombok.Data;

/**
 * 冻结表数据对象
 *
 * @author : ocean_wll
 * @since 2021/7/4
 */
@Data
public class FreezeDO {

    /**
     * 人民币账号冻结金额
     */
    private Double rmbFreezeAmount;

    /**
     * 美元账号冻结金额
     */
    private Double dollarFreezeAmount;

    /**
     * 用户主键
     */
    private Long userId;
}
