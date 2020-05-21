package org.seckill.exception;

/**
 * @ClassName RepeatKillException
 * @Description 重复秒杀异常(运行期异常)
 * @Author Administrator
 * @Date 2020/5/20 14:49
 * @Version 1.0
 **/
public class RepeatKillException extends SeckillException {
    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
