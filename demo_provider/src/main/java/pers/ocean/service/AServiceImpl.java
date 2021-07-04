package pers.ocean.service;

import org.apache.dubbo.config.annotation.DubboService;
import org.dromara.hmily.annotation.HmilyTCC;

/**
 * DB-A 操作实现类
 *
 * @author : ocean_wll
 * @since 2021/7/4
 */
@DubboService(version = "1.0.0")
public class AServiceImpl implements AService {

    @Override
    @HmilyTCC(confirmMethod = "confirm", cancelMethod = "cancel")
    public void deal() {
        System.out.println("AServiceImpl begin work");
    }

    public void confirm() {
        System.out.println("AServiceImpl confirm");
    }

    public void cancel() {
        System.out.println("AServiceImpl cancel");
    }
}
