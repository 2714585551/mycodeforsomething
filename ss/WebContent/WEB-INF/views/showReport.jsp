<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
    <title></title>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8" />
     <script src="../js/boot.js" type="text/javascript"></script> 
   
      <link href="../css/demo.css" rel="stylesheet" type="text/css" />
      <script src="../js/YUI2/yahoo-dom-event.js" type="text/javascript"></script>
      <script src="../js/YUI2/element-min.js" type="text/javascript"></script>
      <script src="../js/YUI2/charts-min.js" type="text/javascript"></script>
      <script src="../js/YUI2/datasource-min.js" type="text/javascript"></script>
      <script src="../js/YUI2/json.js" type="text/javascript"></script>
      <script src="../js/YUI2/swf/swf-min.js" type="text/javascript"></script>
    <style type="text/css">
       
     html, body
    {
        font-size:18px;
        background: url(../img/bg40.jpg)no-repeat 0px 0px;
         background-size: cover;
	     background-position:center;
	    background-attachment:fixed;
        padding:0;
        margin:0;
        border:0;
        height:100%;
        overflow:hidden;
    }
    
    </style>
</head>
<body>    
     <div>
    <h3>查看部门人员分配情况</h3>
    <input type="button" value="确定" onclick="showChartWindow();"/>
    <div id="win1" class="mini-window" title="PieChart" style="width:480px;height:450px;" 
        showModal="true" allowResize="true" 
        >
        <div id="chartContainer" style="width:100%;height:100%;"></div>
    </div>
  </div>
  <div>
    <h3>查看考勤机使用情况</h3>
    <input type="button" value="确定" onclick="showdeviceWindow()"/>
      <div id="win1" class="mini-window" title="ColumnChart" style="width:480px;height:350px;" 
        showModal="true" allowResize="true" 
        >
        <div id="chartContainer2" style="width:100%;height:100%;"></div>
    </div>
  
  
  </div>
</body>
</html>
<script type="text/javascript">
    mini.parse();
    debugger;
    var chartContainerId = "chartContainer";
 function showChartWindow() {
        var win = mini.get("win1");
        win.show();
        buildChart1();
    }
 showChartWindow();
function buildChart1(){
    YAHOO.widget.Chart.SWFURL = "../js/YUI2/swf/charts.swf";
    var rsnumber = ${rsnumber};
    var cwnumber = ${cwnumber};
    var scnumber = ${scnumber};
    var jsnumber = ${jsnumber};
    var hqnumber = ${hqnumber};
    var kfnumber = ${kfnumber};
    
    YAHOO.namespace("demo");
    YAHOO.demo.data = [
		{ response: "人事部", count:rsnumber},
		{ response: "财务部", count: cwnumber },
		{ response: "市场销售部", count: scnumber },
		{ response: "技术部", count: jsnumber },
		{ response: "后勤部", count: hqnumber },
		{ response: "客服部", count: kfnumber },
	];
	var DataSource = new YAHOO.util.DataSource( YAHOO.demo.data );
	DataSource.responseType = YAHOO.util.DataSource.TYPE_JSARRAY;	
	var mychart = new YAHOO.widget.PieChart( chartContainerId, DataSource,
	{
		dataField: "count",
		categoryField: "response",
		style:
		{
			padding: 20,
			legend:
			{
				display: "right",
				padding: 10,
				spacing: 5,
				font:
				{
					family: "Arial",
					size: 13
				}
			}
		}
	});
}

var chartContainerId = "chartContainer2";
function showdeviceWindow() {
    var win = mini.get("win1");
    win.show();
    buildChart2();
}
showdeviceWindow();
function buildChart2() {
    YAHOO.widget.Chart.SWFURL = "../js/YUI2/swf/charts.swf";
    YAHOO.namespace("demo");
    var device1=${device1};
    var device2=${device2};
    var device3=${device3};
    var device4=${device4};
    var device5=${device5};
    var device6=${device6};
    YAHOO.demo.data = [
	    { month: "一号考勤机", rent: device1},
	    { month: "二号考勤机", rent: device2 },
	    { month: "三号考勤机", rent: device3},
	    { month: "四号考勤机", rent: device4 },
	    { month: "五号考勤机", rent: device5 },
	    { month: "六号考勤机", rent: device6}
    ];
    var DataSource = new YAHOO.util.DataSource(YAHOO.demo.data);
    DataSource.responseType = YAHOO.util.DataSource.TYPE_JSARRAY;
    DataSource.responseSchema = {
        fields: ["month", "rent"]
    };

    var seriesDef = [
        {
            displayName: "Rent",
            yField: "rent",
            style: { size: 20 }
        }
    ];

    var currencyAxis = new YAHOO.widget.NumericAxis();
    var categoryAxis = new YAHOO.widget.CategoryAxis();
    var mychart = new YAHOO.widget.ColumnChart(chartContainerId, DataSource,
    {
        series: seriesDef,
        xField: "month",
        yAxis: currencyAxis,
        xAxis: categoryAxis
    });
}

</script>
