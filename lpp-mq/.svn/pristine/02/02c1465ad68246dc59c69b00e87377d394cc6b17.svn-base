/**
 * 翻页查询page
 * @param page         当前页
 * @param pageSize     每页大小
 * @param orderByField 排序字段
 * @param oderbyType   排序类型
 * @returns {QueryPage}
 */
function QueryPage(page, pageSize, orderByField, oderbyType) {
	var queryPage = new Object;
	queryPage.page = page;
	queryPage.pageSize = pageSize;
	queryPage.orderByField = orderByField;
	queryPage.oderbyType = oderbyType;
	queryPage.params = [];
	queryPage.addParam = function(param) {
		queryPage.params.push(param);
	}
	return queryPage;
}


/**
 * 翻页查询条件
 * @param field  查询参数
 * @param value  参数值
 * @param logic  参数操作符  ('=' '>' '<' '!=' 'in' 'like' )
 * @param type   参数类型
 * @returns {QueryParam}
 */
function QueryParam(field, value, logic, type) {
	var queryParam = new Object;
	queryParam.field = field;
	queryParam.value = value;
	queryParam.logic = logic;
	queryParam.type = type;
	return queryParam;
}



/**
 */
function QueryParamVo (){
	var paramVo = new Object;
	paramVo.params = [];
	paramVo.addParam = function(param) {
		paramVo.params.push(param);
	}
	return paramVo;
}

