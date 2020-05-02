package com.lpp.mq.core.utils;

import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.JSON;

/**
  * @ClassName: JsonUtils
  * @FullClassPath: com.lpp.mq.core.utils.JsonUtils
  * @Description: json转换工具
  * @author: Arno
  * @date: 2017年3月16日 下午5:39:09
  * @version: 1.0
  */

public class JsonUtils {

	/**
	 * @Title: jsonToPojo
	 * @Description: json转对象
	 * @createDate: 2017年2月28日 下午5:24:27
	 * @param json
	 * @param pojoClass
	 * @return T
	 */
	public static <T> T jsonToObject(String json, Class<T> pojoClass) {
		if (StringUtils.isBlank(json)) {
			return null;
		}
		return JSON.parseObject(json, pojoClass);
	}

	/** 
	* @Title: jsonToList 
	* @Description: json转对象集合 
	* @createDate: 2017年2月28日 下午5:32:25
	* @param json
	* @param pojoClass
	* @return 
	* List<T> 
	*/ 
	public static <T> List<T> jsonToList(String json, Class<T> pojoClass) {
		if (StringUtils.isBlank(json)) {
			return null;
		}
		return JSON.parseArray(json, pojoClass);
	}

	/** 
	* @Title: objectToJson 
	* @Description: 对象转json 
	* @createDate: 2017年2月28日 下午5:32:42
	* @param pojoClass
	* @return 
	* String 
	*/ 
	public static String objectToJson(Object pojoClass) {
		return JSON.toJSONString(pojoClass);
	}
	
}
