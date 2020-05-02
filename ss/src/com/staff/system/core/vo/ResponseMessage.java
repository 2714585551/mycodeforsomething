/**
 * 
 */
package com.staff.system.core.vo;

/**
  * @ClassName: ResponseMessage
  * @FullClassPath: com.lpp.mq.core.vo.ResponseMessage
  * @Description: 客户端返回消息
  * @author: Arno
  * @date: 2017年3月15日 下午6:45:30
  * @version: 1.0
  */

public class ResponseMessage {


    /** @Fields success : 返回状态 true:成功  false:失败*/ 
    private Boolean success;
    
    /** @Fields msg : 返回消息*/ 
    private String msg;

    /** @Fields data : 返回数据*/ 
    private Object data ;

    
	public ResponseMessage() {
	}
	
	
	public ResponseMessage(Boolean success, String msg) {
		this(success, msg, null);
	}

	
	public ResponseMessage(Boolean success, String msg, Object data) {
		this.success = success;
		this.msg = msg;
		this.data = data;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
