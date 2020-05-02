/**
 * 
 */
package com.lpp.mq.core.dynamic;

/**
 * @ClassName: DynamicDataSourceHolder
 * @FullClassPath: com.lpp.mq.core.dynamic.DynamicDataSourceHolder
 * @Description: 读写分离
 * @author: Arno
 * @date: 2017年3月17日 下午2:25:08
 * @version: 1.0
 */

public class DynamicDataSourceHolder {

	/** @Fields MASTER : 写库对应的数据源key */
	public static final String MASTER = "master";

	/** @Fields MASTER : 读库对应的数据源key */
	public static final String SLAVE = "slave";

	/** @Fields holder : 使用ThreadLocal记录当前线程的数据源key */
	private static final ThreadLocal<String> holder = new ThreadLocal<>();

	/**
	 * @Title: putDataSourceKey
	 * @Description: 设置数据源key
	 * @createDate: 2017年3月17日 下午2:30:14
	 * @param key
	 */
	public static void putDataSourceKey(String key) {
		holder.set(key);
	}

	/**
	 * @Title: getDataSourceKey
	 * @Description: 获取数据源key
	 * @createDate: 2017年3月17日 下午2:30:54
	 * @return
	 */
	public static String getDataSourceKey() {
		return holder.get();
	}

	/** 
	* @Title: markMaster 
	* @Description: 标记写库 
	* @createDate: 2017年3月17日 下午2:31:30 
	*/ 
	public static void markMaster() {
		putDataSourceKey(MASTER);
	}

	/** 
	* @Title: markSlave 
	* @Description: 标记读库 
	* @createDate: 2017年3月17日 下午2:31:36 
	*/ 
	public static void markSlave() {
		putDataSourceKey(SLAVE);
	}

	/** 
	* @Title: isMaster 
	* @Description: TODO 
	* @createDate: 2017年3月17日 下午2:31:43
	* @return 
	*/ 
	public static boolean isMaster() {
		return MASTER.equals(getDataSourceKey());
	}

}
