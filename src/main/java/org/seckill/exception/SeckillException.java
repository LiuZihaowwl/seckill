package org.seckill.exception;

/**
 * @ClassName SeckillException
 * @Description 秒杀相关业务异常
 * @Author Administrator
 * @Date 2020/5/20 14:53
 * @Version 1.0
 **/
public class SeckillException extends RuntimeException {

    public SeckillException(String message) {

    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
