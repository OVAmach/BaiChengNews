const frontSideURL="http://localhost/";
const backSideURL="http://localhost:8080/BaiChengNews/";
var channelList=-1;
var channelListCallBack=new Array();
var user=-1;
var userCallBack=new Array();

$(function () {
    $('ul.navbar-nav li:first-child').addClass("active");
    $('ul.navbar-nav li').click(function (e){
        $('ul.navbar-nav li').removeClass("active");
        $(this).addClass("active");
    });
    loadChannelList();
    checkLogin();
});
//加载频道列表
function loadChannelList() {
    $.ajax({
        url:backSideURL+"api/channel/list",
        method:"POST",
        dataType:"json",
        xhrFields:{
            withCredentials:true
        },
        success:successLoadChannelList
    });
}
//添加频道列表监听
function addChannelListListener(callback){
    if(channelList!=-1){
        callback(channelList);
    }else{
        channelListCallBack.push(callback);
    }
}
//成功加载频道列表
function successLoadChannelList(data) {
    var json=eval(data);
    if(json.code===100) {
        channelList = json.object;
    }
    for(x in channelListCallBack){
        channelListCallBack[x](channelList);
    }
}
function checkLogin(){
    $.ajax({
        url:backSideURL+"api/loginCheck",
        method:"POST",
        dataType:"json",
        xhrFields:{
            withCredentials:true
        },
        success:successCheckLogin
    });
}
function addUserListener(callback) {
    if(user!=-1){
        callback(user);
    }else{
        userCallBack.push(callback);
    }
}
function successCheckLogin(data) {
    var json=eval(data);
    if(json.code===100) {
        updateUser(json.object);
    }
}
function updateUser(data) {
    user=data;
    for(x in userCallBack){
        userCallBack[x](user);
    }
}
function loadPage(dest,url, data){
    //alert($(url).attr("href"));
    $.ajaxSetup({cache: false });
    $(dest).load(url, data, function(result){
        //alert(result);
        //将被加载页的JavaScript加载到本页执行
        $result = $(result);
        $result.find("script").appendTo(dest);
    });
}