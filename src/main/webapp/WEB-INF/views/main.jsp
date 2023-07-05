<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.6.3.js" integrity="sha256-nQLuAZGRRcILA+6dMBOvcRh5Pe310sBpanc6+QBmyVM=" crossorigin="anonymous"></script>
<meta charset="UTF-8">
<script type="text/javascript" src="/js/main.js"></script>
<title>create hitobito dummy data</title>
</head>
<style>
	input {
		min-width: 120px;
	}
</style>
<body>
	<div class="mb-3 text-center">
		<h1>HITOBITOダミーユーザー入力SQL生成</h1>	
	</div>
	<div>
		<form id="request_form" action="/create" method="post" enctype="multipart/form-data">
			<table>
				<tr>
					<td class="fw-bolder fs-3 pt-3" colspan="8">
						生成するユーザー数
					</td>
				</tr>
				<tr>
					<td>
						<input class="form-control form-control-lg" type="number" name="count" min="1" value="1" placeholder="生成するユーザー数">
					</td>
				</tr>
				<tr>
					<td class="fw-bolder fs-3 pt-3" colspan="8">
						年齢比率
					</td>
				</tr>
				<tr>
					<td>
						20代(18~30)
						<input class="form-control form-control-lg" id="gen20" type="number" name="gen20" min="0" max="100" value="40" placeholder="18~30">
					</td>
					<td>
						30代(31~40)
						<input class="form-control form-control-lg" id="gen30" type="number" name="gen30" min="0" max="100" value="25" placeholder="31~40">
					</td>
					<td>
						40代(41~50)
						<input class="form-control form-control-lg" id="gen40" type="number" name="gen40" min="0" max="100" value="15" placeholder="41~50">
					</td>
					<td>
						50代(51~60)
						<input class="form-control form-control-lg" id="gen50" type="number" name="gen50" min="0" max="100" value="10" placeholder="51~60">
					</td>
					<td>
						60代(61~70)
						<input class="form-control form-control-lg" id="gen60" type="number" name="gen60" min="0" max="100" value="10" placeholder="61~70">
					</td>
				</tr>
				<tr>
					<td class="fw-bolder fs-3 pt-3" colspan="8">
						役割比率
					</td>
				</tr>
				<tr>
					<td>
						ユーザ支援
						<input class="form-control form-control-lg" type="number" name="code62001" max="100" min="0" value="15">
					</td>
					<td>
						マネージャー
						<input class="form-control form-control-lg" type="number" name="code62002" max="100" min="0" value="10">
					</td>
					<td>
						開発担当SE
						<input class="form-control form-control-lg" type="number" name="code62003" max="100" min="0" value="15">
					</td>
					<td>
						開発担当PG
						<input class="form-control form-control-lg" type="number" name="code62004" max="100" min="0" value="15">
					</td>
					<td>
						テスト検証
						<input class="form-control form-control-lg" type="number" name="code62005" max="100" min="0" value="15">
					</td>
					<td>
						PMO
						<input class="form-control form-control-lg" type="number" name="code62006" max="100" min="0" value="10">
					</td>
					<td>
						品質管理
						<input class="form-control form-control-lg" type="number" name="code62007" max="100" min="0" value="10">
					</td>
					<td>
						オペレーション
						<input class="form-control form-control-lg" type="number" name="code62008" max="100" min="0" value="10">
					</td>
				</tr>
				<tr>
					<td class="fw-bolder fs-3 pt-3" colspan="8">
						スキル比率<span class="fw-light fs-4">(最大99％)</span>
					</td>
				</tr>
				<tr>
					<td>
						<label for="skillCode1">スキル1</label>
						<input type="text" list="list1" id="skillCode1" name="skillCode1" class="form-control form-control-lg mb-2 skillCode1">
						<datalist id ="list1">
							
						</datalist>
						スキル1の比率
						<input class="form-control form-control-lg" type="number" id="skillPercent1" name="skillPercent1" min="0" max="99" value="0">
					</td>
					<td>
						<label for="skillCode2">スキル2</label>
						<input type="text" list="list2" id="skillCode2" name="skillCode2" class="form-control form-control-lg mb-2 skillCode2" disabled="disabled">
						<datalist id ="list2">
							
						</datalist>
						スキル2の比率
						<input class="form-control form-control-lg" type="number" id="skillPercent2" name="skillPercent2" min="0" max="99" value="0" disabled="disabled">
					</td>
					<td>
						<label for="skillCode3">スキル3</label>
						<input type="text" list="list3" id="skillCode3" name="skillCode3" class="form-control form-control-lg mb-2 skillCode3" disabled="disabled">
						<datalist id ="list3">
							
						</datalist>
						スキル3の比率
						<input class="form-control form-control-lg" type="number" id="skillPercent3" name="skillPercent3" min="0" max="99" value="0" disabled="disabled">
					</td>
					<td>
						<label for="skillCode4">スキル4</label>
						<input type="text" list="list4" id="skillCode4" name="skillCode4" class="form-control form-control-lg mb-2 skillCode4" disabled="disabled">
						<datalist id ="list4">
							
						</datalist>
						スキル4の比率
						<input class="form-control form-control-lg" type="number" id="skillPercent4" name="skillPercent4" min="0" max="99" value="0" disabled="disabled">
					</td>
					<td>
						<label for="skillCode5">スキル5</label>
						<input type="text" list="list5" id="skillCode5" name="skillCode5" class="form-control form-control-lg mb-2 skillCode5" disabled="disabled">
						<datalist id ="list5">
							
						</datalist>
						スキル5の比率
						<input class="form-control form-control-lg" type="number" id="skillPercent5" name="skillPercent5" min="0" max="99" value="0" disabled="disabled">
					</td>
					<td>
						<label for="skillCode6">スキル6</label>
						<input type="text" list="list6" id="skillCode6" name="skillCode6" class="form-control form-control-lg mb-2 skillCode6" disabled="disabled">
						<datalist id ="list6">
							
						</datalist>
						スキル6の比率
						<input class="form-control form-control-lg" type="number" id="skillPercent6" name="skillPercent6" min="0" max="99" value="0" disabled="disabled">
					</td>
					<td>
						<label for="skillCode7">スキル7</label>
						<input type="text" list="list7" id="skillCode7" name="skillCode7" class="form-control form-control-lg mb-2 skillCode7" disabled="disabled">
						<datalist id ="list7">
							
						</datalist>
						スキル7の比率
						<input class="form-control form-control-lg" type="number" id="skillPercent7" name="skillPercent7" min="0" max="99" value="0" disabled="disabled">
					</td>
					<td>
						<label for="skillCode8">スキル8</label>
						<input type="text" list="list8" id="skillCode8" name="skillCode8" class="form-control form-control-lg mb-2 skillCode8" disabled="disabled">
						<datalist id ="list8">
							
						</datalist>
						スキル8の比率
						<input class="form-control form-control-lg" type="number" id="skillPercent8" name="skillPercent8" min="0" max="99" value="0" disabled="disabled">
					</td>
				</tr>
				<tr>
					<td class="fw-bolder fs-3 pt-3" colspan="8">
						日本以外の国籍比率
					</td>
				</tr>
				<tr>
					<td>
						<input class="form-control form-control-lg" type="number" name="country" min="0" max="100" value="0">
					</td>
				</tr>
				<tr>
					<td colspan="8">
						<input class="btn btn-lg btn-primary w-100 mt-5 mb-5 fw-bolder" type="submit" value="生成">
					</td>
				</tr>
			</table>		
		</form>
	</div>
</body>
</html>