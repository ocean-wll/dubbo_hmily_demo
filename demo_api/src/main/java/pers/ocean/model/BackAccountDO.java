package pers.ocean.model;

import lombok.Data;

/**
 * 银行账号表数据对象
 *
 * @author : ocean_wll
 * @since 2021/7/4
 */
@Data
public class BackAccountDO {

    /**
     * 人民币账号金额
     */
    private Double rmbAmount;

    /**
     * 美元账号金额
     */
    private Double dollarAmount;

    /**
     * 用户主键
     */
    private Long userId;
}
