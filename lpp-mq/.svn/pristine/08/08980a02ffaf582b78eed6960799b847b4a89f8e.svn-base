/**
 * 
 */
package com.lpp.mq.core.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lpp.mq.core.exception.BusinessException;
import com.lpp.mq.core.vo.ResponseMessage;


/**
 * @ClassName: GlobalExceptionHandler
 * @FullClassPath: com.lpp.mq.controller.GlobalExceptionHandler
 * @Description: 捕获异常统一处理
 * @author: Arno
 * @date: 2017年3月9日 下午5:51:41
 * @version: 1.0
 */

@ControllerAdvice
public class GlobalExceptionHandler {

	private final static Logger LOG = Logger.getLogger(GlobalExceptionHandler.class);

	
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public ResponseEntity<?> handRuntimeException(HttpServletRequest request, Exception ex) {
		LOG.info("RuntimeException " + ex.getMessage());
		ResponseMessage message = new ResponseMessage(false, ex.getMessage());
		return new ResponseEntity<>(message, HttpStatus.EXPECTATION_FAILED);
	}
	
	@ExceptionHandler(BusinessException.class)
	@ResponseBody
	public ResponseEntity<?> handleBizExp(HttpServletRequest request, Exception ex) {
		LOG.info("Business exception handler  " + ex.getMessage());
		ResponseMessage message = new ResponseMessage(false, ex.getMessage());
		return new ResponseEntity<>(message, HttpStatus.OK);
	}

	@ExceptionHandler(SQLException.class)
	public ModelAndView handSql(Exception ex) {
		LOG.info("SQL Exception " + ex.getMessage());
		ModelAndView mv = new ModelAndView();
		mv.addObject("message", ex.getMessage());
		mv.setViewName("sql_error");
		return mv;
	}

}
