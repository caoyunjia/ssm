//左右式tab切换js--zhangjl

$(function() {
	var tabs = $(".middle-left .ml-btn");
	tabs.eq(0).addClass("mlbtn-bg");
	tabs.click(function() {
		tabs.removeClass("mlbtn-bg");
		$(this).addClass("mlbtn-bg");
		$(".middle-right .biaodan").hide().eq(tabs.index(this)).show();
	});

})