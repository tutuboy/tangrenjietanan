/**
 * Created by Administrator on 2018/6/3 0003.
 */
var soap = require('soap');
var url = 'http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl';
var args = { mobileCode: "15829295119"};
var arg={getDatabaseInfoResult:"658"};
var soaptest = function(){
    soap.createClient(url, function(err, client) {
        client.getMobileCodeInfo(args, function(err, result) {
            console.log(result);
        });
        client.getDatabaseInfo(arg,function(err,result){
            console.log(result);
        });
    });
}
soaptest();
