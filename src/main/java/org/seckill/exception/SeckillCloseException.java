package org.seckill.exception;

/**
 * @ClassName SeckillCloseException
 * @Description 秒杀关闭异常
 * @Author Administrator
 * @Date 2020/5/20 14:52
 * @Version 1.0
 **/
public class SeckillCloseException extends SeckillException {
    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
