CREATE DATABASE seckill;
use seckill;

CREATE TABLE seckill(
`seckill_id` bigint NOT NULL AUTO_INCREMENT COMMENT '商品库存id',
`name` varchar(120) NOT NULL COMMENT '商品名称',
`number` int NOT NULL COMMENT '库存数量',
`start_time` timestamp NOT NULL COMMENT '秒杀开启时间',
`end_time` timestamp NOT NULL COMMENT '秒杀结束时间',
`create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
PRIMARY KEY(seckill_id),
key idx_start_time(start_time),
key idx_end_time(end_time),
key idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='秒杀库存表';

insert into
    seckill(name,number,start_time,end_time)
values
    ('1000元秒杀iPad',100,'2020-05-20 00:00:00','2020-05-21 00:00:00'),
     ('600元秒杀最新款手办',200,'2020-05-20 00:00:00','2020-05-21 00:00:00'),
      ('400元秒杀最新滑板',300,'2020-05-20 00:00:00','2020-05-21 00:00:00'),
       ('200元秒杀国内机票',400,'2020-05-20 00:00:00','2020-05-21 00:00:00');

CREATE TABLE success_killed(
`seckill_id`  bigint NOT NULL COMMENT '秒杀商品id',
`user_phone` bigint NOT NULL COMMENT '用户手机号',
`state` tinyint NOT NULL DEFAULT -1 COMMENT '状态标识:-1:无效 0:成功 1:已付款 2:已发货',
`create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
PRIMARY KEY(seckill_id,user_phone),
key idx_create_time(create_time)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='秒杀成功明细表';

--上线V1.1
ALTER TABLE seckill
DROP INDEX idx_create_time
ADD index idx_c_s(start_time,create_time);

mysql -u root -p lzh666666!
