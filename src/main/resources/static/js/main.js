$(document).ready(function(){
	$("#skillCode1").change(function(){
		if($("#skillCode1").val()){
			$("#skillCode2").attr("disabled", false);
			$("#skillPercent2").attr("disabled", false);
		} else {
			$("#skillCode2").val("");
			$("#skillCode3").val("");
			$("#skillCode4").val("");
			$("#skillCode5").val("");
			$("#skillCode6").val("");
			$("#skillCode7").val("");
			$("#skillCode8").val("");
			$("#skillCode2").attr("disabled", true);
			$("#skillCode3").attr("disabled", true);
			$("#skillCode4").attr("disabled", true);
			$("#skillCode5").attr("disabled", true);
			$("#skillCode6").attr("disabled", true);
			$("#skillCode7").attr("disabled", true);
			$("#skillCode8").attr("disabled", true);
			$("#skillPercent2").val(0);
			$("#skillPercent3").val(0);
			$("#skillPercent4").val(0);
			$("#skillPercent5").val(0);
			$("#skillPercent6").val(0);
			$("#skillPercent7").val(0);
			$("#skillPercent8").val(0);
			$("#skillPercent2").attr("disabled", true);
			$("#skillPercent3").attr("disabled", true);
			$("#skillPercent4").attr("disabled", true);
			$("#skillPercent5").attr("disabled", true);
			$("#skillPercent6").attr("disabled", true);
			$("#skillPercent7").attr("disabled", true);
			$("#skillPercent8").attr("disabled", true);
		}
	});
	$("#skillCode2").change(function(){
		if($("#skillCode2").val()){
			$("#skillCode3").attr("disabled", false);
			$("#skillPercent3").attr("disabled", false);
		} else {
			$("#skillCode3").val("");
			$("#skillCode4").val("");
			$("#skillCode5").val("");
			$("#skillCode6").val("");
			$("#skillCode7").val("");
			$("#skillCode8").val("");
			$("#skillCode3").attr("disabled", true);
			$("#skillCode4").attr("disabled", true);
			$("#skillCode5").attr("disabled", true);
			$("#skillCode6").attr("disabled", true);
			$("#skillCode7").attr("disabled", true);
			$("#skillCode8").attr("disabled", true);
			$("#skillPercent3").val(0);
			$("#skillPercent4").val(0);
			$("#skillPercent5").val(0);
			$("#skillPercent6").val(0);
			$("#skillPercent7").val(0);
			$("#skillPercent8").val(0);
			$("#skillPercent3").attr("disabled", true);
			$("#skillPercent4").attr("disabled", true);
			$("#skillPercent5").attr("disabled", true);
			$("#skillPercent6").attr("disabled", true);
			$("#skillPercent7").attr("disabled", true);
			$("#skillPercent8").attr("disabled", true);
		}
	});
	$("#skillCode3").change(function(){
		if($("#skillCode3").val()){
			$("#skillCode4").attr("disabled", false);
			$("#skillPercent4").attr("disabled", false);
		} else {
			$("#skillCode4").val("");
			$("#skillCode5").val("");
			$("#skillCode6").val("");
			$("#skillCode7").val("");
			$("#skillCode8").val("");
			$("#skillCode4").attr("disabled", true);
			$("#skillCode5").attr("disabled", true);
			$("#skillCode6").attr("disabled", true);
			$("#skillCode7").attr("disabled", true);
			$("#skillCode8").attr("disabled", true);
			$("#skillPercent4").val(0);
			$("#skillPercent5").val(0);
			$("#skillPercent6").val(0);
			$("#skillPercent7").val(0);
			$("#skillPercent8").val(0);
			$("#skillPercent4").attr("disabled", true);
			$("#skillPercent5").attr("disabled", true);
			$("#skillPercent6").attr("disabled", true);
			$("#skillPercent7").attr("disabled", true);
			$("#skillPercent8").attr("disabled", true);
		}
	});
	$("#skillCode4").change(function(){
		if($("#skillCode4").val()){
			$("#skillCode5").attr("disabled", false);
			$("#skillPercent5").attr("disabled", false);
		} else {
			$("#skillCode5").val("");
			$("#skillCode6").val("");
			$("#skillCode7").val("");
			$("#skillCode8").val("");
			$("#skillCode5").attr("disabled", true);
			$("#skillCode6").attr("disabled", true);
			$("#skillCode7").attr("disabled", true);
			$("#skillCode8").attr("disabled", true);
			$("#skillPercent5").val(0);
			$("#skillPercent6").val(0);
			$("#skillPercent7").val(0);
			$("#skillPercent8").val(0);
			$("#skillPercent5").attr("disabled", true);
			$("#skillPercent6").attr("disabled", true);
			$("#skillPercent7").attr("disabled", true);
			$("#skillPercent8").attr("disabled", true);
		}
	});
	$("#skillCode5").change(function(){
		if($("#skillCode5").val()){
			$("#skillCode6").attr("disabled", false);
			$("#skillPercent6").attr("disabled", false);
		} else {
			$("#skillCode6").val("");
			$("#skillCode7").val("");
			$("#skillCode8").val("");
			$("#skillCode6").attr("disabled", true);
			$("#skillCode7").attr("disabled", true);
			$("#skillCode8").attr("disabled", true);
			$("#skillPercent6").val(0);
			$("#skillPercent7").val(0);
			$("#skillPercent8").val(0);
			$("#skillPercent6").attr("disabled", true);
			$("#skillPercent7").attr("disabled", true);
			$("#skillPercent8").attr("disabled", true);
		}
	});
	$("#skillCode6").change(function(){
		if($("#skillCode6").val()){
			$("#skillCode7").attr("disabled", false);
			$("#skillPercent7").attr("disabled", false);
		} else {
			$("#skillCode7").val("");
			$("#skillCode8").val("");
			$("#skillCode7").attr("disabled", true);
			$("#skillCode8").attr("disabled", true);
			$("#skillPercent7").val(0);
			$("#skillPercent8").val(0);
			$("#skillPercent7").attr("disabled", true);
			$("#skillPercent8").attr("disabled", true);
		}
	});
	$("#skillCode7").change(function(){
		if($("#skillCode7").val()){
			$("#skillCode8").attr("disabled", false);
			$("#skillPercent8").attr("disabled", false);
		} else {
			$("#skillCode8").val("");
			$("#skillCode8").attr("disabled", true);
			$("#skillPercent8").val(0);
			$("#skillPercent8").attr("disabled", true);
		}
	});
	
	$("#list1,#list2,#list3,#list4,#list5,#list6,#list7,#list8").append(`
		<option value="10101001">ABAP</option>
		<option value="10101002">Ada</option>
		<option value="10101003">Apex</option>
		<option value="10101004">Assembly</option>
		<option value="10101005">Bash</option>
		<option value="10101006">C</option>
		<option value="10101007">C#</option>
		<option value="10101008">C++</option>
		<option value="10101009">Classic</option>
		<option value="10101010">COBOL</option>
		<option value="10101011">D</option>
		<option value="10101012">Dart</option>
		<option value="10101013">Delphi/Object Pascal</option>
		<option value="10101014">Elixir</option>
		<option value="10101015">Fortran</option>
		<option value="10101016">Go</option>
		<option value="10101017">Groovy</option>
		<option value="10101018">Haskell</option>
		<option value="10101019">Java</option>
		<option value="10101020">JavaScript</option>
		<option value="10101021">Julia</option>
		<option value="10101022">Kotlin</option>
		<option value="10101023">LabVIEW</option>
		<option value="10101024">Ladder Logic</option>
		<option value="10101025">LISP</option>
		<option value="10101026">Logo</option>
		<option value="10101027">Lua</option>
		<option value="10101028">MATLAB</option>
		<option value="10101029">Objective-C</option>
		<option value="10101030">Perl</option>
		<option value="10101031">PHP</option>
		<option value="10101032">PL/I</option>
		<option value="10101033">PL/SQL</option>
		<option value="10101034">PostScript</option>
		<option value="10101035">Prolog</option>
		<option value="10101036">Python</option>
		<option value="10101037">R</option>
		<option value="10101038">Ruby</option>
		<option value="10101039">Rust</option>
		<option value="10101040">SAS</option>
		<option value="10101041">Scala</option>
		<option value="10101042">Scheme</option>
		<option value="10101043">Scratch</option>
		<option value="10101044">SQL</option>
		<option value="10101045">Swift</option>
		<option value="10101046">Transact-SQL</option>
		<option value="10101047">TypeScript</option>
		<option value="10101048">VBScript</option>
		<option value="10101049">Visual Basic</option>
		<option value="10101050">Visual Basic .NET</option>
		<option value="10101051">Visual FoxPro</option>
		<option value="10102001">Angular JS</option>
		<option value="10102002">React.js</option>
		<option value="10102003">jQuery</option>
		<option value="10102004">Vue.js</option>
		<option value="10102005">Spring</option>
		<option value="10102006">CakePHP</option>
		<option value="10102007">Node.js</option>
		<option value="10102008">Laravel</option>
		<option value="10102009">ExpressJS</option>
		<option value="10102010">Ruby on Rails</option>
		<option value="10102011">Django</option>
		<option value="10102012">.NET Core</option>
		<option value="10102013">Flask</option>
		<option value="10102014">Meteor</option>
		<option value="10102015">Koa</option>
		<option value="10102016">Struts</option>
		<option value="10102017">NestJs</option>
		<option value="10102018">Bootstrap</option>
		<option value="10102019">Sementic UI</option>
		<option value="10102020">Flutter</option>
		<option value="10102021">Next.js</option>
		<option value="10102022">Nuxt.js</option>
		<option value="10102023">Sails</option>
		<option value="10102024">FuelPHP</option>
		<option value="10102025">Play Framework</option>
		<option value="10102026">JSF（JavaServer Faces）</option>
		<option value="10102027">Foundation</option>
		<option value="10102201">Firebase</option>
		<option value="10102202">AppsFlyer</option>
		<option value="10102203">Adjust</option>
		<option value="10103001">Oracle</option>
		<option value="10103002">MySQL</option>
		<option value="10103003">Microsoft SQL Server</option>
		<option value="10103004">PostgreSQL</option>
		<option value="10103005">MongoDB</option>
		<option value="10103006">Redis</option>
		<option value="10103007">DB2</option>
		<option value="10103008">Elasticsearch</option>
		<option value="10103009">Microsoft Access</option>
		<option value="10103010">SQLite</option>
		<option value="10103011">Cassandra</option>
		<option value="10103012">MariaDB</option>
		<option value="10103013">Splunk</option>
		<option value="10103014">Microsoft Azure SQL Database</option>
		<option value="10103015">Hive</option>
		<option value="10103016">Amazon DynamoDB</option>
		<option value="10103017">Snowflake</option>
		<option value="10103018">Teradata</option>
		<option value="10103019">Solr</option>
		<option value="10103020">Neo4j</option>
		<option value="10103021">SAP HANA</option>
		<option value="10103022">FileMaker</option>
		<option value="10103023">SAP Adaptive Server</option>
		<option value="10103024">Google BigQuery</option>
		<option value="10103025">HBase</option>
		<option value="10103026">Microsoft Azure Cosmos DB</option>
		<option value="10104001">VBA</option>
		<option value="10104002">Microsoft Excel</option>
		<option value="10104003">Microsoft Word</option>
		<option value="10104004">Microsoft AccessVBA</option>
		<option value="10105001">Photoshop</option>
		<option value="10105002">Illustrator</option>
		<option value="10105003">Adobe Creative Cloud Express</option>
		<option value="10105004">Bing Image Creator</option>
		<option value="10105005">XD</option>
		<option value="10105006">Leonardo.Ai</option>
		<option value="10105007">Novel AI</option>
		<option value="10105008">POINT</option>
		<option value="10105009">phonto</option>
		<option value="10105010">Inkscape</option>
		<option value="10105011">GIMP</option>
		<option value="10105012">Sketch</option>
		<option value="10105013">Figma</option>
		<option value="10105014">Drama</option>
		<option value="10105015">InVision Studio</option>
		<option value="10105016">Canva</option>
		<option value="10105017">Midjourney</option>
		<option value="10105018">nijijourney</option>
		<option value="10105019">StableDiffusion</option>
		<option value="10105020">Adobe Firefly</option>
	`)
	
	$("#request_form").submit(function() {
		let skillPercent1 = Number($("#skillPercent1").val());
		let skillPercent2 = Number($("#skillPercent2").val());
		let skillPercent3 = Number($("#skillPercent3").val());
		let skillPercent4 = Number($("#skillPercent4").val());
		let skillPercent5 = Number($("#skillPercent5").val());
		let skillPercent6 = Number($("#skillPercent6").val());
		let skillPercent7 = Number($("#skillPercent7").val());
		let skillPercent8 = Number($("#skillPercent8").val());
		let sumSkillPercent = skillPercent1 + skillPercent2 + skillPercent3 +skillPercent4 +
								skillPercent5 + skillPercent6 + skillPercent7 + skillPercent8;
		
		if(sumSkillPercent > 99){
			alert("スキル比率の合計は99％を越えられません。")
			
			return false;
		}
		
		let gen20 = Number($("#gen20").val());
		let gen30 = Number($("#gen30").val());
		let gen40 = Number($("#gen40").val());
		let gen50 = Number($("#gen50").val());
		let gen60 = Number($("#gen60").val());
		let sumGen = gen20+ gen30+ gen40+ gen50 + gen60;
		
		if(sumGen == 0){
			alert("年齢比率設定は合計０以上にしてください。")
			
			return false;
		}
	});
	
});