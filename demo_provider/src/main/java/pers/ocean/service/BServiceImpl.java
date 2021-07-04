package pers.ocean.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.dromara.hmily.annotation.HmilyTCC;

/**
 * DB-B 操作实现类
 *
 * @author : ocean_wll
 * @since 2021/7/4
 */
@DubboService(version = "1.0.0", weight = 100)
public class BServiceImpl implements BService {

    @Override
    @HmilyTCC(confirmMethod = "confirm", cancelMethod = "cancel")
    public void deal() {
        System.out.println("BServiceImpl begin work");
    }

    public void confirm() {
        System.out.println("BServiceImpl confirm");
    }

    public void cancel() {
        System.out.println("BServiceImpl cancel");
    }
}
