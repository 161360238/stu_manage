<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <meta name="viewport" content="width=device-width, initial-scale=1,maximum-scale=1, user-scalable=no">
   <title>贫困认定</title>
    <link href="${baseurl}common/fonts/iconfont.css" rel="stylesheet"/>
    <link href="${baseurl}common/css/bass.css" rel="stylesheet"/>
    <link href="${baseurl}common/css/index.css" rel="stylesheet"/>
</head>
<body>
	<header>
		<div class="header" style="position:relative;">
			<h1>贫困认定</h1>
			<a href="#" class="return" onclick="javascript:history.back(-1);"><i class="icon-16" style="position:absolute;top:14px;left:18px;"></i></a>
		</div>
		</header>	
		<div style="height: 2.5rem;"></div>			
			&ensp;有以下行为之一者不能认定为家庭经济困难学生。
			<p>（1) 抽烟、酗酒经教育不改。<p>	
			<p>（2）在校外租房或经常出入经营性网吧、通宵上网。<p>
			<p>（3) 有与其家庭经济困难状况不相符的其他高消费行为或不当消费行为。<p>
			<p>（4）在校受到严重处分，并屡教不改者。<p>
			<p>家访过程中，发现家庭情况实属困难的学生，可认定为贫困生，具体等级根据参访老师给出的评议。<p>
			<p>备注：<p>
				<p>&ensp;&ensp;&ensp;所有勾选请务必按照实际情况勾选，每个项最多只能勾选一项，后期提供所有证明材料必须真实有效，不可提供虚假  证明材料，一经发现虚假信息，取消其评选资格。<p><br>
			<form class="input-group register-group">
				&ensp;1.学生家庭经济类型。<br>
				<div class="input-row">
					<div class="group-T">
						<input type="radio" class="radio-la" name="radio_0" value="第一项  A-10" id="check-1" hidden><label for="check-1" class="group-T-l icon-uniE940">A、父母双亡、烈士子女，无经济来源，仅靠政府救济</label>
						<input type="radio" class="radio-la" name="radio_0" value="第一项  B-10" id="check-2" hidden><label for="check-2" class="group-T-l icon-uniE940">B、孤残学生无经济来源，仅靠政府救济（有证明材料）</label>
						<input type="radio" class="radio-la" name="radio_0" value="第一项  C-8" id="check-3" hidden><label for="check-3" class="group-T-l icon-uniE940">C、优抚家庭子女无经济来源，仅靠政府教济（有证明材料）</label>
						<input type="radio" class="radio-la" name="radio_0" value="第一项  D-6" id="check-4" hidden><label for="check-4" class="group-T-l icon-uniE940">D、父母双方下岗或父母一方因病丧失劳动能力（有证明材料）</label>
						<input type="radio" class="radio-la" name="radio_0" value="第一项  E-6" id="check-5" hidden><label for="check-5" class="group-T-l icon-uniE940">E、农村家庭父母一方为下岗职工或无固定工作，缺少经济来源</label>
						<input type="radio" class="radio-la" name="radio_0" value="第一项  F-5" id="check-6" hidden><label for="check-6" class="group-T-l icon-uniE940">F、来自农村，父母双方皆务农，没有其他经济来源</label>
						<input type="radio" class="radio-la" name="radio_0" value="第一项  G-4" id="check-7" hidden><label for="check-7" class="group-T-l icon-uniE940">G、城镇家庭父母一方为下岗职工或无固定工作，缺少经济来源</label>
					</div>
				</div>									
				&ensp;2.学生家庭成员健康情况。<br>
				<div class="input-row">
					<div class="group-T">
						<input type="radio" class="radio-la" name="radio_1" value="第二项 A-8" id="check-8" hidden><label for="check-8" class="group-T-l icon-uniE940">A、家庭主要成员丧失劳动能力，没有经济来源，无依无靠</label>
						<input type="radio" class="radio-la" name="radio_1" value="第二项 B-8" id="check-9" hidden><label for="check-9" class="group-T-l icon-uniE940">B、家中有卧病在床，生活不能自理，需要照顾的成员</label>
						<input type="radio" class="radio-la" name="radio_1" value="第二项 C-5" id="check-10" hidden><label for="check-10" class="group-T-l icon-uniE940">C、家庭成员患病，常年需要治疗</label>
						<input type="radio" class="radio-la" name="radio_1" value="第二项 D-4" id="check-11" hidden><label for="check-11" class="group-T-l icon-uniE940">D、家庭成员因年老体弱等原因导致经济负担过重</label>
					</div>
				</div>					
				&ensp;3.学生家庭监护人情况。<br>
				<div class="input-row">
					<div class="group-T">
						<input type="radio" class="radio-la" name="radio_2" value="第三项 A-8" id="check-12" hidden><label for="check-12" class="group-T-l icon-uniE940">A、监护人为祖父祖母或外祖父外祖母</label>
						<input type="radio" class="radio-la" name="radio_2" value="第三项 B-7" id="check-13" hidden><label for="check-13" class="group-T-l icon-uniE940">B、单亲家庭（父亲或母亲亡故）</label>
						<input type="radio" class="radio-la" name="radio_2" value="第三项 C-7" id="check-14" hidden><label for="check-14" class="group-T-l icon-uniE940">C、单亲家庭（离异家庭，监护人为母亲，母亲身体不健康）</label>
						<input type="radio" class="radio-la" name="radio_2" value="第三项 D-7" id="check-15" hidden><label for="check-15" class="group-T-l icon-uniE940">D、单亲家庭（离异家庭，监护人为父亲，父亲身体不健康）</label>
						<input type="radio" class="radio-la" name="radio_2" value="第三项 E-5" id="check-16" hidden><label for="check-16" class="group-T-l icon-uniE940">E、单亲家庭（离异家庭，监护人为母亲，母亲身体健康）</label>
						<input type="radio" class="radio-la" name="radio_2" value="第三项 F-3" id="check-17" hidden><label for="check-17" class="group-T-l icon-uniE940">F、单亲家庭（离异家庭，监护人为父亲，父亲身体健康）</label>
					</div>
				</div>									
				&ensp;4.学生家庭老人赡养情况。<br>
				<div class="input-row">
					<div class="group-T">
						<input type="radio" class="radio-la" name="radio_3" value="第四项 A-8" id="check-18" hidden><label for="check-18" class="group-T-l icon-uniE940">A、需赡养3-4位老人或老人常年卧病在床，生活不能自理， 造成经济难以负担</label>
						<input type="radio" class="radio-la" name="radio_3" value="第四项 B-7" id="check-19" hidden><label for="check-19" class="group-T-l icon-uniE940">B、需赡养2-3位老人或老人常年卧病在床，生活不能自理，造成经济难以负担</label>
						<input type="radio" class="radio-la" name="radio_3" value="第四项 C-5" id="check-20" hidden><label for="check-20" class="group-T-l icon-uniE940">C、需赡养1-2位老人,且老人常年卧病在床，生活不能自理，  造成经济困难,难以负担</label>
						<input type="radio" class="radio-la" name="radio_3" value="第四项 D-4" id="check-21" hidden><label for="check-21" class="group-T-l icon-uniE940">D、需要赡养老人，老人身体不好，但无重大疾病</label>
						<input type="radio" class="radio-la" name="radio_3" value="第四项 E-2" id="check-22" hidden><label for="check-22" class="group-T-l icon-uniE940">E、需赡养老人，但老人身体健康</label>
					</div>
				</div>	
				&ensp;5.学生家庭子女供养情况。<br>
				<div class="input-row">
					<div class="group-T">
						<input type="radio" class="radio-la" name="radio_4" value="第五项 A-10" id="check-33" hidden><label for="check-33" class="group-T-l icon-uniE940">A、养育2名以上的子女且子女仍在上学阶段且子女患有疾病</label>
						<input type="radio" class="radio-la" name="radio_4" value="第五项 B-7" id="check-34" hidden><label for="check-34" class="group-T-l icon-uniE940">B、养育1-2名子女且子女仍在上学阶段且子女患有疾病</label>
						<input type="radio" class="radio-la" name="radio_4" value="第五项 C-6" id="check-35" hidden><label for="check-35" class="group-T-l icon-uniE940">C、养育两名子女，子女均未就业或子女患有残疾</label>
						<input type="radio" class="radio-la" name="radio_4" value="第五项 D-3" id="check-36" hidden><label for="check-36" class="group-T-l icon-uniE940">D、养育两名子女，其中一名尚未就业</label>
					</div>
				</div>	
				&ensp;6.认定情况。<br>
				<div class="input-row">
					<div class="group-T">
						<input type="radio" class="radio-la" name="radio_5" value="第六项 A-10" id="check-37" hidden><label for="check-37" class="group-T-l icon-uniE940">A、家庭被当地政府列为建档立卡贫困户（有证明材料）</label>
						<input type="radio" class="radio-la" name="radio_5" value="第六项 C-8" id="check-38" hidden><label for="check-38" class="group-T-l icon-uniE940">B、享受农村、城镇居民最低生活保障的家庭（有证明材料）</label>
						<input type="radio" class="radio-la" name="radio_5" value="第六项 D-3" id="check-39" hidden><label for="check-39" class="group-T-l icon-uniE940">C、家庭人均收入处于平顶山市居民最低生活标准以上</label>
					</div>
				</div>					
				&ensp;7.学生生源地情况。<br>
				<div class="input-row">
					<div class="group-T">
						<input type="radio" class="radio-la" name="radio_6" value="第七项 A-8" id="check-25" hidden><label for="check-25" class="group-T-l icon-uniE940">A、地处国家级贫困县</label>
						<input type="radio" class="radio-la" name="radio_6" value="第七项 B-6" id="check-26" hidden><label for="check-26" class="group-T-l icon-uniE940">B、艰苦边远地区且家庭经济困难的少数民族学生</label>
						<input type="radio" class="radio-la" name="radio_6" value="第七项 C-5" id="check-27" hidden><label for="check-27" class="group-T-l icon-uniE940">C、偏远农村地区，除务农外无其他经济来源</label>
						<input type="radio" class="radio-la" name="radio_6" value="第七项 D-4" id="check-28" hidden><label for="check-28" class="group-T-l icon-uniE940">D、属于国家重点扶贫单位</label>
					</div>
				</div>					
				&ensp;8.突发事件。<br>
				<div class="input-row">
					<div class="group-T">
						<input type="radio" class="radio-la" name="radio_7" value="第八项 A-10" id="check-29" hidden><label for="check-29" class="group-T-l icon-uniE940">A、农村乡镇家庭因遭遇自然灾害或突发事件造成家庭经济特别困难者</label>
						<input type="radio" class="radio-la" name="radio_7" value="第八项 B-6" id="check-30" hidden><label for="check-30" class="group-T-l icon-uniE940">B、家庭在老少边穷地区以务农为主，且由于当年自然灾害而引起收入大幅度减少的</label>
						<input type="radio" class="radio-la" name="radio_7" value="第八项 C-5" id="check-31" hidden><label for="check-31" class="group-T-l icon-uniE940">C、家庭由于突发事件或非个人原因造成暂时经济困难的</label>					
					</div>
				</div>					
				&ensp;9.学生家庭遭受特大自然灾害的。<br>
				<div class="input-row">
					<div class="group-T">
						<input type="radio" class="radio-la" name="radio_8" value="第九项 A-8" id="check-32" hidden><label for="check-32" class="group-T-l icon-uniE940">A、遭到地震、洪涝，旱灾等自然灾害，家庭受到重大损失</label>				
					</div>
				</div>																		
					<input type="reset" class="btn btn-green" value="重置" style="position:absolute;bottom:-2%;right:10%">
				</form>	
			<button onclick="getArr()" class="btn btn-red" style=" position:absolute;right:40%;margin-top:15px;">提交</button>	
			<div class="toolTip-box" style="display:none;">
                <div class="toolTip-flop">
                    <i class="icon-uniE931 hint"></i>
                    <b>提示信息</b>
                    <p id="errorInfo">提交成功</p>
                    <div class="btnbox">
                        <a href="#" class="btn btn-b hidePopup">确定</a>
                    </div>
               </div>
             </div>			
		<script type="text/javascript" src="${baseurl}js/jquery-1.12.4.min.js"></script>
		<script type="text/javascript">		
		 function getArr() {
	            var radio = new Array();
	            for (var i = 0; i < 9; i++) {//获取radio的值
	                var radio_name = new String("radio_" + i);
	                radio[i] = $('input:radio[name=' + radio_name + ']:checked').val()
	                if(radio[i] == undefined) radio[i] = "第"+ (i+1) +"项0-0";	                
	            }
	            $.ajax({
	                type:"post",
	                url:"${baseurl}getStu2Num.do",
	                data:{povNum:radio},
	                traditional: true,//必须指定为true
	                success:function(data){	
	                	if(data.status == 200){
	                		$("#errorInfo").html(data.msg);
							$(".toolTip-box").show();
	                	}else{
	                		$("#errorInfo").html(data.msg);
							$(".toolTip-box").show();
	                	}
	                }
	            });
		 }
		$(document).ready(function(){
		    $(".hidePopup").click(function(){
		        $(".toolTip-box").hide();
		    });	        
		});		
	</script>												
</body>
</html>