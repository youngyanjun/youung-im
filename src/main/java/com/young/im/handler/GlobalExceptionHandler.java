package com.young.im.handler;


import com.young.im.commons.CommonEnumExperience;


import com.young.im.exception.BizException;
import com.young.im.po.ResultBody;
import org.mybatis.spring.MyBatisSystemException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.net.SocketException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.stream.Collectors;

/**
 * @author youngyanjun
 * @date 2020-03-23 19:19
 */

@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 处理自定义的业务异常
     *
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = BizException.class)
    @ResponseBody
    public ResultBody bizExceptionHandler(HttpServletRequest req, BizException e) {
        logger.error("发生业务异常！原因是：{}", e.getErrorMsg());
        return ResultBody.error(e.getErrorCode(), e.getErrorMsg());
    }

    /**
     * 处理空指针的异常
     *
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = NullPointerException.class)
    @ResponseBody
    public ResultBody exceptionHandler(HttpServletRequest req, NullPointerException e) {
        logger.error("发生空指针异常！原因是:", e);
        return ResultBody.error(CommonEnumExperience.BODY_NOT_MATCH);

    }
    /**
     * 处理参数校验异常
     *
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    @ResponseBody
    public ResultBody exceptionHandler(HttpServletRequest req, MethodArgumentNotValidException  e) {

        logger.error("参数校验异常:", e);
        String message = e.getBindingResult().getAllErrors().stream().map(DefaultMessageSourceResolvable::getDefaultMessage).collect(Collectors.joining());
        return ResultBody.error("000",message);
    }

    /**
     * 处理参数校验异常 --Json 转换异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = HttpMessageNotReadableException.class)
    @ResponseBody
    public ResultBody exceptionHandler(HttpServletRequest req, HttpMessageNotReadableException e) {
        logger.error("参数校验异常-json转换异常:", e);
        return ResultBody.error(CommonEnumExperience.JSON_PARSE_ERROR);
    }






    /**
     * 处理sql异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = SQLIntegrityConstraintViolationException.class)
    @ResponseBody
    public ResultBody exceptionHandler(HttpServletRequest req, SQLIntegrityConstraintViolationException e) {
        logger.error("sql异常:", e);
        return ResultBody.error(CommonEnumExperience.DATE_ERROR);
    }

    /**
     * mybatis异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = MyBatisSystemException.class)
    @ResponseBody
    public ResultBody exceptionHandler(HttpServletRequest req, MyBatisSystemException e) {
        logger.error("mybatis异常:", e);
        return ResultBody.error(CommonEnumExperience.DATE_ERROR);
    }

    /**
     * Socket异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = SocketException.class)
    @ResponseBody
    public ResultBody exceptionHandler(HttpServletRequest req, SocketException e) {
        logger.error("Socket异常:", e);
        return ResultBody.error(CommonEnumExperience.SOCKET_ERROR);
    }

    /**
     * 处理其他异常
     *
     * @param req UncategorizedSQLException
     * @param e
     * @return
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultBody exceptionHandler(HttpServletRequest req, Exception e) {
        logger.error("未知异常！原因是:", e);
        return ResultBody.error(CommonEnumExperience.INTERNAL_SERVER_ERROR);
    }
}
