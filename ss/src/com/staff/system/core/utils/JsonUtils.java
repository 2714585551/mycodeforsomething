package com.staff.system.core.utils;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.staff.system.core.exception.ExceptionUtil;



/** 
* @author 作者 : wangf 
* @version 创建时间：2017年3月30日 下午6:55:14 
* 类说明 
*/
public class JsonUtils {
	
	private static final Logger log = Logger.getLogger(JsonUtils.class);
	private static ObjectMapper objectMapper = new ObjectMapper();
	
	private final static String DATE_FORMAT_STR = "yyyy-MM-dd HH:mm";
	/*
	//空值转换-异常情况解决方法，在ObjectMapper配置中增加
	objectMapper.configure.configure(DeserializationConfig.Feature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true) ;
	//配置为true表示mapper接受只有一个元素的数组的反序列化 
	objectMapper.configure(Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY,true);
	//配置为false表示mapper在遇到mapper对象中存在json对象中没有的数据变量时不报错，可以进行反序列化
	objectMapper.configure(Feature.FAIL_ON_UNKNOWN_PROPERTIES,false); 
	//新版的jackson设置mapper的方法，功能同上
	objectMapper.getDeserializationConfig().without(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES); 
	//定义针对日期类型的反序列化时的数据格式
	objectMapper.getDeserializationConfig().setDateFormat(newSimpleDateFormat("yyyy-MM-dd HH:mm:ss")); 
	
	*/
	/**
	 * javaBean,list,array convert to json string
	 */
	public static <T> T jsonToObject(String json, Class<T> pojoClass) {
		if (StringUtils.isBlank(json)) {
			return null;
		}
		return JSON.parseObject(json, pojoClass);
	}
	
	public static String toJson(Object obj){
		return toJson(obj,DATE_FORMAT_STR);
	}
	
	/**
	 * javaBean,list,array convert to json string
	 */
	public static String toJson(Object obj,String dateformat){
		if(null != dateformat){
			 SimpleDateFormat formatter = new SimpleDateFormat(dateformat);
			 objectMapper.setDateFormat(formatter);
		}
		String jstr = null;
		try {
			jstr = objectMapper.writeValueAsString(obj);
		} catch (JsonGenerationException e) {
			log.error(ExceptionUtil.getTrace(e));
		} catch (JsonMappingException e) {
			log.error(ExceptionUtil.getTrace(e));
		} catch (IOException e) {
			log.error(ExceptionUtil.getTrace(e));
		}
		
		
		return jstr;
	}
	
	/**
	 * json string convert to javaBean
	 */
	public static <T> T toPojo(String jsonStr,Class<T> clazz) throws Exception{
		if(jsonStr =="" || jsonStr == null ) return null;
		return objectMapper.readValue(jsonStr, clazz);
	}
	
	/**
	 * json string convert to map
	 */
	@SuppressWarnings("unchecked")
	public static <T> Map<String,Object> toMap(String jsonStr)throws Exception{
		if(jsonStr =="" || jsonStr == null) return null;
		//objectMapper.configure(Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true) ;  
		return objectMapper.readValue(jsonStr, Map.class);
	}
	
	@SuppressWarnings("unchecked")
	public static <T> Map<String,Object> toMapForUnderLine(String jsonStr)throws Exception{
		if(jsonStr =="" || jsonStr == null) return null;
		objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES);
		return (Map<String, Object>) objectMapper.readValue(jsonStr, Map.class);
	}
	
	
	/**
	 * json string convert to map with javaBean
	 */
	public static <T> Map<String,T> toMap(String jsonStr,Class<T> clazz)throws Exception{
		if(jsonStr =="" || jsonStr == null) return null;
		Map<String,Map<String,Object>> map =  objectMapper.readValue(jsonStr, new TypeReference<Map<String,T>>() {
		});
		Map<String,T> result = new HashMap<String, T>();
		for (Entry<String, Map<String,Object>> entry : map.entrySet()) {
			result.put(entry.getKey(), toPojo(entry.getValue(), clazz));
		}
		return result;
	}
	
	/**
	 * json array string convert to list with javaBean
	 */
	public static <T> List<T> toList(String jsonArrayStr,Class<T> clazz)throws Exception{
		if(jsonArrayStr =="" || jsonArrayStr == null) return null;
		List<Map<String,Object>> list = objectMapper.readValue(jsonArrayStr, new TypeReference<List<T>>() {
		});
		List<T> result = new ArrayList<T>();
		for (Map<String, Object> map : list) {
			result.add(toPojo(map, clazz));
		}
		return result;
	}
	
	/**
	 * map convert to javaBean
	 */
	@SuppressWarnings("rawtypes")
	public static <T> T toPojo(Map map,Class<T> clazz){
		return objectMapper.convertValue(map, clazz);
	}
	
	
	/**
	 * map convert to json
	 * 支持嵌套
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonGenerationException 
	 */
	@SuppressWarnings("rawtypes")
	public static String toJson(Map map) throws JsonGenerationException, JsonMappingException, IOException{
		return objectMapper.writeValueAsString(map);
	}
	
	/**
	 * list convert to json
	 * 支持嵌套
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonGenerationException 
	 */
	@SuppressWarnings("rawtypes")
	public static String toJson(List list) throws JsonGenerationException, JsonMappingException, IOException{
		return objectMapper.writeValueAsString(list);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static List toListFast(String jsonString, Class pojoClass) {
		return JSON.parseArray(jsonString, pojoClass);
	}


}
 