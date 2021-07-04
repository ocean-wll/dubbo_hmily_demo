CREATE TABLE `back_account`
(
    `id`            bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
    `gmt_create`    datetime       NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `gmt_modified`  datetime       NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    `rmb_amount`    decimal(10, 2) NOT NULL DEFAULT '0' COMMENT '人民币账号金额',
    `dollar_amount` decimal(10, 2) NOT NULL DEFAULT '0' COMMENT '美元金额',
    `user_id`       bigint unsigned NOT NULL COMMENT '用户id',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='账号表';
CREATE TABLE `freeze`
(
    `id`                   bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
    `gmt_create`           datetime       NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `gmt_modified`         datetime       NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    `rmb_freeze_amount`    decimal(10, 2) NOT NULL DEFAULT '0' COMMENT '人民币冻结金额',
    `dollar_freeze_amount` decimal(10, 2) NOT NULL DEFAULT '0' COMMENT '美元冻结金额',
    `user_id`              bigint unsigned NOT NULL COMMENT '用户id',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='资金冻结表';

insert into back_account(rmb_amount,dollar_amount,user_id) values (700,100,1);
insert into back_account(rmb_amount,dollar_amount,user_id) values (700,100,2);