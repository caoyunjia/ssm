/**
 *
 * Created by weibo on 2017/3/30.
 */
$(document).ready(function () {
    var t ='<div class="photo">'
        +'			<img src="images/com-photo.jpg" alt="">'
        +'		</div>'
        +'		<ul>'
        +'			<li>'
        +'				<a id="blan-jyi">'
        +'					<div class="pt5">'
        +'						<span class="rmgyl rmgyl-thqren"></span>'
        +'					</div>'
        +'					<div>'
        +'						<span class="text" title="交易提醒">交易</span>'
        +'					</div>'
        +'				</a>'
        +'			</li>'
        +'			<li>'
        +'				<a id="blan-yjing">'
        +'					<div class="pt5">'
        +'						<span class="rmgyl rmgyl-yjing"></span>'
        +'					</div>'
        +'					<div>'
        +'						<span class="text" title="业务预警">预警</span>'
        +'					</div>'
        +'				</a>'
        +'			</li>'
        +'			<li>'
        +'				<a id="blan-xdao">'
        +'					<div class="pt5">'
        +'						<span class="rmgyl rmgyl-xdao"></span>'
        +'					</div>'
        +'					<div>'
        +'						<span class="text" title="平台导航">导航</span>'
        +'					</div>'
        +'				</a>'
        +'			</li>'
        +'			<li>'
        +'				<a id="blan-jyi">'
        +'					<div class="pt5">'
        +'						<span class="rmgyl rmgyl-jyi"></span>'
        +'					</div>'
        +'					<div>'
        +'						<span class="text" title="意见反馈">反馈</span>'
        +'					</div>'
        +'				</a>'
        +'			</li>'
        +'		</ul>'
        +'		<div class="close-top">'
        +'			<a href="#top">'
        +'				<div>'
        +'					<span class="rmgyl rmgyl-backtop"></span>'
        +'				</div>'
        +'			</a>'
        +'			<a>'
        +'				<div>'
        +'					<span class="rmgyl rmgyl-del" id="clcblan"></span>'
        +'				</div>'
        +'			</a>'
        +'</div>';
    $(".aside-menu").append(t);



    // 侧边栏效果
    $("#clcblan").click(function(e){
        if(e.stopPropagation){
            e.stopPropagation();
        }else{
            e.cancelBubble=true;
        }
        $(".cblan").fadeOut(500);
        $(".zkcblan").fadeIn(500);
        $(".cblan-detail").fadeOut(500);
        $(".cblan ul li a").removeClass("blan-current");
    });
    $("#clzkcblan").click(function(e){
        if(e.stopPropagation){
            e.stopPropagation();
        }else{
            e.cancelBubble=true;
        }
        $(".cblan").fadeIn(500);
        $(".zkcblan").fadeOut(500);
    })
    // 0731 add
    $("#blan-jyi").click(function(e){
        if(e.stopPropagation){
            e.stopPropagation();
        }else{
            e.cancelBubble=true;
        }
        $("#detail-yjing").fadeOut(1000);
        $("#detail-xdao").fadeOut(1000);
        $(".cblan ul li a").removeClass("blan-current");
        $("#detail-jyi").fadeToggle(1000);
        if($("#detail-jyi").css("display")=="none"){
            $(this).removeClass("blan-current");
        }else{
            $(this).addClass("blan-current");
        }
    })
    $("#blan-yjing").click(function(e){
        if(e.stopPropagation){
            e.stopPropagation();
        }else{
            e.cancelBubble=true;
        }
        $("#detail-jyi").fadeOut(1000);
        $("#detail-xdao").fadeOut(1000);
        $(".cblan ul li a").removeClass("blan-current");
        $("#detail-yjing").fadeToggle();
        if($("#detail-yjing").css("display")=="none"){
            $(this).removeClass("blan-current");
        }else{
            $(this).addClass("blan-current");
        }
    })
    $("#blan-xdao").click(function(e){
        if(e.stopPropagation){
            e.stopPropagation();
        }else{
            e.cancelBubble=true;
        }
        $("#detail-yjing").fadeOut(1000);
        $("#detail-yyi").fadeOut(1000);
        $(".cblan ul li a").removeClass("blan-current");
        $("#detail-xdao").fadeToggle(1000);
        if($("#detail-xdao").css("display")=="none"){
            $(this).removeClass("blan-current");
        }else{
            $(this).addClass("blan-current");
        }
    })
    $("#detail-jyi .rmgyl-del").click(function(e){
        if(e.stopPropagation){
            e.stopPropagation();
        }else{
            e.cancelBubble=true;
        }
        $("#detail-jyi").fadeOut(1000);
        $("#blan-jyi").removeClass("blan-current");
    })
    $("#detail-xdao .rmgyl-del").click(function(e){
        if(e.stopPropagation){
            e.stopPropagation();
        }else{
            e.cancelBubble=true;
        }
        $("#detail-xdao").fadeOut(1000);
        $("#blan-xdao").removeClass("blan-current");
    })
    $(".cblan-detail").click(function(e){
        if(e.stopPropagation){
            e.stopPropagation();
        }else{
            e.cancelBubble=true;
        }
    })
    $(document).click(function(e){
        $("#detail-xdao").fadeOut(1000);
        $("#blan-xdao").removeClass("blan-current");
        $("#detail-jyi").fadeOut(1000);
        $("#blan-jyi").removeClass("blan-current");
        $("#detail-yjing").fadeOut(1000);
        $("#blan-yjing").removeClass("blan-current");
    })
    // 侧边栏效果end





    //交易信息begin
    var jiaoyidetail='<dl class="m0">'
        +'		<dt>'
        +'			<div class="row">'
        +'				<div class="col-xs-10">'
        +'					<h4>交易提醒</h4>'
        +'				</div>'
        +'				<div class="col-xs-2 p0 text-center">'
        +'					<span class="rmgyl rmgyl-del"></span>'
        +'				</div>'
        +'			</div>'
        +'		</dt>'
        +'		<dd>'
        +'			<div class="row text-center">'
        +'				<span class="circle">采购</span>'
        +'			</div>'
        +'			<div class="row mt5">'
        +'				<table width="92%">'
        +'					<tbody>'
        +'						<tr>'
        +'							<td width="24%" class="text-center">贸<br>易</td>'
        +'							<td width="14%" class="line-yuan">'
        +'								<span class="yuan"></span>'
        +'							</td>'
        +'							<td class="yjing-list">'
        +'								<a href="#" class="rwlist dbi hasmes">'
        +'									<span class="rmgyl rmgyl-qren"></span>'
        +'									<span class="rw-name">采购单确认</span>'
        +'									<span class="rm-num">(1)</span>'
        +'								</a>'
        +'								<a href="#" class="rwlist dbi">'
        +'									<span class="rmgyl rmgyl-yfkqren"></span>'
        +'									<span class="rw-name">应付款确认</span>'
        +'									<span class="rm-num">(0)</span>'
        +'								</a>'
        +'								<a href="#" class="rwlist dbi">'
        +'									<span class="rmgyl rmgyl-shuo"></span>'
        +'									<span class="rw-name">收货</span>'
        +'									<span class="rm-num">(0)</span>'
        +'								</a>'
        +'							</td>'
        +'						</tr>'
        +'					</tbody>'
        +'				</table>'
        +'				<table width="92%">'
        +'					<tbody>'
        +'						<tr>'
        +'							<td width="24%" class="text-center">融<br>资</td>'
        +'							<td width="14%" class="line-yuan">'
        +'								<span class="yuan"></span>'
        +'							</td>'
        +'							<td class="yjing-list ba0">'
        +'								<a href="#" class="rwlist dbi hasmes">'
        +'									<span class="rmgyl rmgyl-cgdfkuan"></span>'
        +'									<span class="rw-name">采购单付款</span>'
        +'									<span class="rm-num">(0)</span>'
        +'								</a>'
        +'								<a href="#" class="rwlist dbi">'
        +'									<span class="rmgyl rmgyl-czsqing"></span>'
        +'									<span class="rw-name">出质申请</span>'
        +'									<span class="rm-num">(0)</span>'
        +'								</a>'
        +'								<a href="#" class="rwlist dbi">'
        +'									<span class="rmgyl rmgyl-thsqing"></span>'
        +'									<span class="rw-name">提货申请</span>'
        +'									<span class="rm-num">(0)</span>'
        +'								</a>'
        +'							</td>'
        +'						</tr>'
        +'					</tbody>'
        +'				</table>'
        +'			</div>'
        +'		</dd>'
        +'		<dd>'
        +'			<div class="row text-center">'
        +'				<span class="circle">销售</span>'
        +'			</div>'
        +'			<div class="row mt5">'
        +'				<table width="92%">'
        +'					<tbody>'
        +'						<tr>'
        +'							<td width="24%" class="text-center">贸<br>易</td>'
        +'							<td width="14%" class="line-yuan">'
        +'								<span class="yuan"></span>'
        +'							</td>'
        +'							<td class="yjing-list">'
        +'								<a href="#" class="rwlist dbi hasmes">'
        +'									<span class="rmgyl rmgyl-doc"></span>'
        +'									<span class="rw-name">销售单确认</span>'
        +'									<span class="rm-num">(1)</span>'
        +'								</a>'
        +'								<a href="#" class="rwlist dbi">'
        +'									<span class="rmgyl rmgyl-yskqren"></span>'
        +'									<span class="rw-name">应收款确认</span>'
        +'									<span class="rm-num">(0)</span>'
        +'								</a>'
        +'								<a href="#" class="rwlist dbi">'
        +'									<span class="rmgyl rmgyl-fhuo"></span>'
        +'									<span class="rw-name">发货</span>'
        +'									<span class="rm-num">(0)</span>'
        +'								</a>'
        +'							</td>'
        +'						</tr>'
        +'					</tbody>'
        +'				</table>'
        +'				<table width="92%">'
        +'					<tbody>'
        +'						<tr>'
        +'							<td width="24%" class="text-center">融<br>资</td>'
        +'							<td width="14%" class="line-yuan">'
        +'								<span class="yuan"></span>'
        +'							</td>'
        +'							<td class="yjing-list ba0">'
        +'								<a href="#" class="rwlist dbi hasmes">'
        +'									<span class="rmgyl rmgyl-skpiao"></span>'
        +'									<span class="rw-name">收款/票确认</span>'
        +'									<span class="rm-num">(1)</span>'
        +'								</a>'
        +'								<a href="#" class="rwlist dbi">'
        +'									<span class="rmgyl rmgyl-thqren"></span>'
        +'									<span class="rw-name">提货确认</span>'
        +'									<span class="rm-num">(0)</span>'
        +'								</a>'
        +'								<a href="#" class="rwlist dbi">'
        +'									<span class="rmgyl rmgyl-cetkqren"></span>'
        +'									<span class="rw-name">差额退款确认</span>'
        +'									<span class="rm-num">(0)</span>'
        +'								</a>'
        +'							</td>'
        +'						</tr>'
        +'					</tbody>'
        +'				</table>'
        +'			</div>'
        +'		</dd>'
        +'</dl>';
    $("#detail-jyi").html(jiaoyidetail);
    //交易信息end
    //反馈建议
    var fkjianyi='<p>当前累计预警<span class="text-danger pl5 pr5">10</span>条</p>';
    $("#detail-yjing").html(fkjianyi);
    //平台向导
    var detailxdao='<dl class="m0">'
        +'		<dt>'
        +'			<div class="row">'
        +'				<div class="col-xs-10">'
        +'					<h4>平台向导</h4>'
        +'				</div>'
        +'				<div class="col-xs-2 p0 text-center">'
        +'					<span class="rmgyl rmgyl-del"></span>'
        +'				</div>'
        +'			</div>'
        +'		</dt>'
        +'		<dd>'
        +'			<div>'
        +'				<h4><span class="rmgyl rmgyl-gztai"></span> 工作台</h4>'
        +'				<a href="">我的采购单</a>'
        +'				<a href="">待审核任务</a>'
        +'				<a href="">我的销售单</a>'
        +'				<a href="">待处理任务</a>'
        +'			</div>'
        +'			<div>'
        +'				<h4><span class="rmgyl rmgyl-crxtong"></span> 产融协同</h4>'
        +'				<h5>二级菜单</h5>'
        +'				<a href="">我的采购单</a>'
        +'				<a href="">待审核任务</a>'
        +'				<a href="">我的销售单</a>'
        +'				<a href="">待处理任务</a>'
        +'				<h5>二级菜单2</h5>'
        +'				<a href="">我的采购单</a>'
        +'				<a href="">待审核任务</a>'
        +'				<a href="">我的销售单</a>'
        +'				<a href="">待处理任务</a>'
        +'				<a href="">我的采购单</a>'
        +'				<a href="">待审核任务</a>'
        +'				<a href="">我的销售单</a>'
        +'				<a href="">待处理任务</a>'
        +'			</div>'
        +'			<div>'
        +'				<h4><span class="rmgyl rmgyl-sji"></span> 商机</h4>'
        +'				<a href="">我的采购单</a>'
        +'				<a href="">待审核任务</a>'
        +'				<a href="">我的销售单</a>'
        +'				<a href="">待处理任务</a>'
        +'				<a href="">我的采购单</a>'
        +'				<a href="">待审核任务</a>'
        +'				<a href="">我的销售单</a>'
        +'				<a href="">待处理任务</a>'
        +'			</div>'
        +'			<div>'
        +'				<h4><span class="rmgyl rmgyl-gduo"></span> 更多</h4>'
        +'				<a href="">企业云</a>'
        +'				<a href="">企业记账</a>'
        +'				<a href="">云办公平台</a>'
        +'				<a href="">待处理任务</a>'
        +'			</div>'
        +'		</dd>'
        +'</dl>';
    $("#detail-xdao").html(detailxdao);
});