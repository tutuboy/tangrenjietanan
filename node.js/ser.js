/**
 * Created by Administrator on 2018/6/2 0002.
 */
var soap = require('soap');
var url = 'http://ws.webxml.com.cn/WebServices/WeatherWS.asmx?wsdl';
    var args ={ theRegionCode:'陕西'};//不传参数是可以进入服务端的函数，
var arg= {theCityCode:'西安'};
soap.createClient(url, function(err, client) {
    client.getSupportCityString (args, function(err, result) {
      console.log(result);
    });
    client.getWeather(arg,function(err,result){
        console.log(result);
    })
});