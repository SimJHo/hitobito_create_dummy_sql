package com.example.demo.dummy;

import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

@Service
public class DummyService {
	
	public void createDummy(DummyDto dummyDto) {
		
		// コードリスト
		String[] businessTypeList = new String[] {
				"56000", "56111", "56112", "56113", "56114", "56115", "56121", "56122", "56123", "56131", "56132",
				"56141", "56142", "56143", "56151", "56152", "56161", "56162"
				};
		
		String[] seniorBusinessTypeList = new String[] {
				"56111", "56112", "56113", "56114", "56115", "56121", "56122", "56123", "56131", "56132", "56141",
				"56142", "56143", "56151", "56152", "56161", "56162"
				};
		
		String[] jobTypeList = new String[] {
				"57011", "57012", "57013", "57021", "57022", "57023", "57031", "57032", "57033", "57041", "57042",
				"57051", "57052", "57053", "57054", "57055", "57056", "57057", "57058", "57059", "57061", "57062",
				"57063", "57064", "57065", "57066", "57081", "57082", "57083"
				};
		
		String[] hopeCareerList = new String[] {
				"60011", "60012", "60013", "60022", "60023", "60024", "60031", "60032", "60033", "60034", "60035",
				"60036", "60037", "60038"
				};
		
		String[] tempSkillCodeList = new String[] {
				"10101001", "10101002", "10101003", "10101004", "10101005", "10101006", "10101007", "10101008", "10101009", "10101010",
				"10101011", "10101012", "10101013", "10101014", "10101015", "10101016", "10101017", "10101018", "10101019", "10101020",
				"10101021", "10101022", "10101023", "10101024", "10101025", "10101026", "10101027", "10101028", "10101029", "10101030",
				"10101031", "10101032", "10101033", "10101034", "10101035", "10101036", "10101037", "10101038", "10101039", "10101040",
				"10101041", "10101042", "10101044", "10101044", "10101045", "10101046", "10101047", "10101048", "10101049", "10101050",
				"10101051", 
				"10102001", "10102002", "10102003", "10102004", "10102005", "10102006", "10102007", "10102008", "10102009", "10102010",
				"10102011", "10102012", "10102013", "10102014", "10102015", "10102016", "10102017", "10102018", "10102019", "10102020",
				"10102021", "10102022", "10102023", "10102024", "10102025", "10102026", "10102027", "10102201", "10102202", "10102203",
				"10103001", "10103002", "10103003", "10103004", "10103005", "10103006", "10103007", "10103008", "10103009", "10103010", 
				"10103011", "10103012", "10103013", "10103014", "10103015", "10103016", "10103017", "10103018", "10103019", "10103020", 
				"10103021", "10103022", "10103023", "10103024", "10103025", "10103026",
				"10104001", "10104002", "10104003", "10104004",
				"10105001", "10105002", "10105003", "10105004", "10105005", "10105006", "10105007", "10105008", "10105009", "10105010",
				"10105011", "10105012", "10105013", "10105014", "10105015", "10105016", "10105017", "10105018", "10105019", "10105020"
				};
		
		String skillCode1 = dummyDto.getSkillCode1();
		String skillCode2 = dummyDto.getSkillCode2();
		String skillCode3 = dummyDto.getSkillCode3();
		String skillCode4 = dummyDto.getSkillCode4();
		String skillCode5 = dummyDto.getSkillCode5();
		String skillCode6 = dummyDto.getSkillCode6();
		String skillCode7 = dummyDto.getSkillCode7();
		String skillCode8 = dummyDto.getSkillCode8();
		int skillPercent1 = dummyDto.getSkillPercent1();
		int skillPercent2 = dummyDto.getSkillPercent2();
		int skillPercent3 = dummyDto.getSkillPercent3();
		int skillPercent4 = dummyDto.getSkillPercent4();
		int skillPercent5 = dummyDto.getSkillPercent5();
		int skillPercent6 = dummyDto.getSkillPercent6();
		int skillPercent7 = dummyDto.getSkillPercent7();
		int skillPercent8 = dummyDto.getSkillPercent8();
		int code62001 = dummyDto.getCode62001();
		int code62002 = dummyDto.getCode62002();
		int code62003 = dummyDto.getCode62003();
		int code62004 = dummyDto.getCode62004();
		int code62005 = dummyDto.getCode62005();
		int code62006 = dummyDto.getCode62006();
		int code62007 = dummyDto.getCode62007();
		int code62008 = dummyDto.getCode62008();
		int gen20 = dummyDto.getGen20();
		int gen30 = dummyDto.getGen30();
		int gen40 = dummyDto.getGen40();
		int gen50 = dummyDto.getGen50();
		int gen60 = dummyDto.getGen60();
		int countryPercentage = dummyDto.getCountry();
		
		List<String> projectRoleList = new ArrayList<String>();
    	if (code62001 != 0) {
    		for (int r = 0; r < code62001; r++) {
        		projectRoleList.add("62001");
        	}
    	}
    	if (code62002 != 0) {
    		for (int r = 0; r < code62002; r++) {
        		projectRoleList.add("62002");
        	}
    	}
    	if (code62003 != 0) {
    		for (int r = 0; r < code62003; r++) {
        		projectRoleList.add("62003");
        	}
    	}
    	if (code62004 != 0) {
    		for (int r = 0; r < code62004; r++) {
        		projectRoleList.add("62004");
        	}
    	}
    	if (code62005 != 0) {
    		for (int r = 0; r < code62005; r++) {
        		projectRoleList.add("62005");
        	}
    	}
    	if (code62006 != 0) {
    		for (int r = 0; r < code62006; r++) {
        		projectRoleList.add("62006");
        	}
    	}
    	if (code62007 != 0) {
    		for (int r = 0; r < code62007; r++) {
        		projectRoleList.add("62007");
        	}
    	}
    	if (code62008 != 0) {
    		for (int r = 0; r < code62008; r++) {
        		projectRoleList.add("62008");
        	}
    	}
    	if (code62001 == 0 && code62002 == 0 && code62003 == 0 
    			&& code62004 == 0 && code62005 == 0 && code62006 == 0 
    			&& code62007 == 0 && code62008 == 0 ) {
    		projectRoleList.add("62001");
    		projectRoleList.add("62002");
    		projectRoleList.add("62003");
    		projectRoleList.add("62004");
    		projectRoleList.add("62005");
    		projectRoleList.add("62006");
    		projectRoleList.add("62007");
    		projectRoleList.add("62008");
    	}

    	// 国籍比率設定
    	List<Integer> countryPercentageList = new ArrayList<>();
    	
	    if(countryPercentage != 0 && countryPercentage != 100) {
	    	for (int c = 0; c < countryPercentage; c++) {
		    	countryPercentageList.add(1);
		    }
		    for (int c = 0; c < (100 - countryPercentage); c++) {
		    	countryPercentageList.add(0);
		    }
	    } else if (countryPercentage == 0) {
	    	for (int c = 0; c < 100; c++) {
		    	countryPercentageList.add(0);
		    }
	    } else {
	    	for (int c = 0; c < 100; c++) {
		    	countryPercentageList.add(1);
		    }
	    }
		
		// csvファイルパス設定
		List<List<String>> nameList = new ArrayList<List<String>>();
		ClassPathResource nameResource = new ClassPathResource("list/name_etc_list.csv");
		
		List<List<String>> highschoolList = new ArrayList<List<String>>();
		ClassPathResource highschoolResource = new ClassPathResource("list/highschool_list.csv");
		
		List<List<String>> highschoolMajorList = new ArrayList<List<String>>();
		ClassPathResource highschoolMajorResource = new ClassPathResource("list/highschool_major_list.csv");
		
		List<List<String>> universityList = new ArrayList<List<String>>();
		ClassPathResource universityResource = new ClassPathResource("list/university_list.csv");
		
		List<List<String>> universityMajorList1 = new ArrayList<List<String>>();
		ClassPathResource universityMajorResource1 = new ClassPathResource("list/university_major_1.csv");
		
		List<List<String>> universityMajorList2 = new ArrayList<List<String>>();
		ClassPathResource universityMajorResource2 = new ClassPathResource("list/university_major_2.csv");
		
		List<List<String>> projectList = new ArrayList<List<String>>();
		ClassPathResource projectResource = new ClassPathResource("list/project_list.csv");
		
		List<List<String>> koreanNameList = new ArrayList<List<String>>();
		ClassPathResource koreanNameResource = new ClassPathResource("list/korean_name_etc_list.csv");
		
		List<List<String>> chineseNameList = new ArrayList<List<String>>();
		ClassPathResource chineseNameResource = new ClassPathResource("list/chinese_name_etc_list.csv");
		
		List<List<String>> vietnamNameList = new ArrayList<List<String>>();
		ClassPathResource vietnamNameResource = new ClassPathResource("list/vietnam_name_etc_list.csv");
		
		List<List<String>> koreanUniversityList = new ArrayList<List<String>>();
		ClassPathResource koreanUniversityResource = new ClassPathResource("list/korean_university_list.csv");
		
		List<List<String>> chineseUniversityList = new ArrayList<List<String>>();
		ClassPathResource chineseUniversityResource = new ClassPathResource("list/chinese_university_list.csv");
		
		List<List<String>> vietnamUniversityList = new ArrayList<List<String>>();
		ClassPathResource vietnamUniversityResource = new ClassPathResource("list/vietnam_university_list.csv");
		
		List<List<String>> englishMajorList = new ArrayList<List<String>>();
		ClassPathResource englishMajorResource = new ClassPathResource("list/english_major_list.csv");
		
		try {
			// csvファイルリード
			Path namePath = Paths.get(nameResource.getURI());
		    List<String> nameLine = Files.readAllLines(namePath);
		    
		    Path highschoolPath = Paths.get(highschoolResource.getURI());
		    List<String> highschoolLine = Files.readAllLines(highschoolPath);
		    
		    Path highschoolMajorPath = Paths.get(highschoolMajorResource.getURI());
		    List<String> highschoolMajorLine = Files.readAllLines(highschoolMajorPath);
		    
		    Path universityPath = Paths.get(universityResource.getURI());
		    List<String> universityLine = Files.readAllLines(universityPath);
		    
		    Path universityMajorPath1 = Paths.get(universityMajorResource1.getURI());
		    List<String> universityMajorLine1 = Files.readAllLines(universityMajorPath1);
		    
		    Path universityMajorPath2 = Paths.get(universityMajorResource2.getURI());
		    List<String> universityMajorLine2 = Files.readAllLines(universityMajorPath2);
		    
		    Path projectPath = Paths.get(projectResource.getURI());
		    List<String> projectLine = Files.readAllLines(projectPath);
		    
		    Path koreanNamePath = Paths.get(koreanNameResource.getURI());
		    List<String> koreanNameLine = Files.readAllLines(koreanNamePath);
		    
		    Path chineseNamePath = Paths.get(chineseNameResource.getURI());
		    List<String> chineseNameLine = Files.readAllLines(chineseNamePath);
		    
		    Path vietnamNamePath = Paths.get(vietnamNameResource.getURI());
		    List<String> vietnamNameLine = Files.readAllLines(vietnamNamePath);
		    
		    Path koreanUniversityPath = Paths.get(koreanUniversityResource.getURI());
		    List<String> koreanUniversityLine = Files.readAllLines(koreanUniversityPath);
		    
		    Path chineseUniversityPath = Paths.get(chineseUniversityResource.getURI());
		    List<String> chineseUniversityLine = Files.readAllLines(chineseUniversityPath);
		    
		    Path vietnamUniversityPath = Paths.get(vietnamUniversityResource.getURI());
		    List<String> vietnamUniversityLine = Files.readAllLines(vietnamUniversityPath);
		    
		    Path englishMajorPath = Paths.get(englishMajorResource.getURI());
		    List<String> englishMajorLine = Files.readAllLines(englishMajorPath);
		    
		    // リストに保存
		    for (String line : nameLine) {
		    	List<String> aLine = new ArrayList<String>();
		    	String[] lineArr = line.split(",");
		    	aLine = Arrays.asList(lineArr);
		    	nameList.add(aLine);
		    }
		    
		    for (String line : highschoolLine) {
		    	List<String> aLine = new ArrayList<String>();
		    	String[] lineArr = line.split(",");
		    	aLine = Arrays.asList(lineArr);
		    	highschoolList.add(aLine);
		    }
		    
		    for (String line : highschoolMajorLine) {
		    	List<String> aLine = new ArrayList<String>();
		    	String[] lineArr = line.split(",");
		    	aLine = Arrays.asList(lineArr);
		    	highschoolMajorList.add(aLine);
		    }
		    
		    for (String line : universityLine) {
		    	List<String> aLine = new ArrayList<String>();
		    	String[] lineArr = line.split(",");
		    	aLine = Arrays.asList(lineArr);
		    	universityList.add(aLine);
		    }
		    
		    for (String line : universityMajorLine1) {
		    	List<String> aLine = new ArrayList<String>();
		    	String[] lineArr = line.split(",");
		    	aLine = Arrays.asList(lineArr);
		    	universityMajorList1.add(aLine);
		    }
		    
		    for (String line : universityMajorLine2) {
		    	List<String> aLine = new ArrayList<String>();
		    	String[] lineArr = line.split(",");
		    	aLine = Arrays.asList(lineArr);
		    	universityMajorList2.add(aLine);
		    }
		    
		    for (String line : projectLine) {
		    	List<String> aLine = new ArrayList<String>();
		    	String[] lineArr = line.split(",");
		    	aLine = Arrays.asList(lineArr);
		    	projectList.add(aLine);
		    }
		    
		    for (String line : koreanNameLine) {
		    	List<String> aLine = new ArrayList<String>();
		    	String[] lineArr = line.split(",");
		    	aLine = Arrays.asList(lineArr);
		    	koreanNameList.add(aLine);
		    }
		    
		    for (String line : chineseNameLine) {
		    	List<String> aLine = new ArrayList<String>();
		    	String[] lineArr = line.split(",");
		    	aLine = Arrays.asList(lineArr);
		    	chineseNameList.add(aLine);
		    }
		    
		    for (String line : vietnamNameLine) {
		    	List<String> aLine = new ArrayList<String>();
		    	String[] lineArr = line.split(",");
		    	aLine = Arrays.asList(lineArr);
		    	vietnamNameList.add(aLine);
		    }
		    
		    for (String line : koreanUniversityLine) {
		    	List<String> aLine = new ArrayList<String>();
		    	String[] lineArr = line.split(",");
		    	aLine = Arrays.asList(lineArr);
		    	koreanUniversityList.add(aLine);
		    }
		    
		    for (String line : chineseUniversityLine) {
		    	List<String> aLine = new ArrayList<String>();
		    	String[] lineArr = line.split(",");
		    	aLine = Arrays.asList(lineArr);
		    	chineseUniversityList.add(aLine);
		    }
		    
		    for (String line : vietnamUniversityLine) {
		    	List<String> aLine = new ArrayList<String>();
		    	String[] lineArr = line.split(",");
		    	aLine = Arrays.asList(lineArr);
		    	vietnamUniversityList.add(aLine);
		    }
		    
		    for (String line : englishMajorLine) {
		    	List<String> aLine = new ArrayList<String>();
		    	String[] lineArr = line.split(",");
		    	aLine = Arrays.asList(lineArr);
		    	englishMajorList.add(aLine);
		    }
		    
		    Random rand = new Random();
		    LocalDate nowDate = LocalDate.now();
		    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		    String now = nowDate.format(formatter);
		    String sql = "";
		    
		    // メインページで入力した数分繰り返す
		    for (int i = 0; i < dummyDto.getCount(); i++) {
		    	System.out.println(i);
		    	// 国籍設定
		    	int userCountry = countryPercentageList.get(rand.nextInt(100));
		    	
		    	int nameIndex = 0;
		    	int highschoolIndex = 0;
		    	int highschoolMajorIndex = 0;
		    	int universityIndex = 0;
		    	int universityMajorIndex1 = 0;
		    	int universityMajorIndex2 = 0;
		    	List<String> userInfo = new ArrayList<String>();
		    	List<String> highschoolName = new ArrayList<String>();
		    	List<String> highschoolMajor = new ArrayList<String>();
		    	List<String> universityName = new ArrayList<String>();
		    	List<String> universityMajor = new ArrayList<String>();
		    	String nickname = "";
		    	String userGender = "";
		    	String country = "";
		    	String phoneNumber = "";
		    	String email = "";
		    	
		    	// 年齢比率設定
		    	List<Integer> ageList = new ArrayList<Integer>();
		    	
		    	if (gen20!= 0) {
		    		if (userCountry == 1) {
			    		for (int a = 0; a < gen20; a++) {
				    		ageList.add(rand.nextInt(8) + 23);
				    	}
			    	} else {
			    		for (int a = 0; a < gen20; a++) {
				    		ageList.add(rand.nextInt(13) + 18);
				    	}
					}
		    	}
		    	if (gen30 != 0) {
		    		for (int a = 0; a < gen30; a++) {
			    		ageList.add(rand.nextInt(10) + 31);
			    	}
		    	}
		    	if (gen40 != 0) {
		    		for (int a = 0; a < gen40; a++) {
			    		ageList.add(rand.nextInt(10) + 41);
			    	}
		    	}
		    	if (gen50 != 0) {
		    		for (int a = 0; a < gen50; a++) {
			    		ageList.add(rand.nextInt(10) + 51);
			    	}
		    	}
		    	if (gen60 != 0) {
		    		for (int a = 0; a < gen60; a++) {
			    		ageList.add(rand.nextInt(10) + 61);
			    	}
		    	}

		    	int userAge = ageList.get(rand.nextInt((int) (ageList.size())));
		    	
		    	if (userCountry == 1) {
		    		int randomCountry = rand.nextInt(3);
		    		
		    		if (randomCountry == 0) {
		    			// 読み込むデータのインデックスをランダムで設定
		    			nameIndex = rand.nextInt(1000);
		    			universityIndex = rand.nextInt(189);
		    			universityMajorIndex1 = rand.nextInt(500);
		    			
		    			// 読み込んで保存
		    			userInfo = koreanNameList.get(nameIndex);
		    			universityName = koreanUniversityList.get(universityIndex);
		    			universityMajor = englishMajorList.get(universityMajorIndex1);
		    			nickname = userInfo.get(0) + " " + userInfo.get(1);
					    userGender = userInfo.get(2);
					    country = "54410";
					    phoneNumber = "0"+(rand.nextInt(3)+7)+"0-"+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)
					    				+"-"+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10);
					    email = userInfo.get(3);
		    		} else if (randomCountry == 1) {
		    			// 読み込むデータのインデックスをランダムで設定
		    			nameIndex = rand.nextInt(1000);
		    			universityIndex = rand.nextInt(147);
		    			universityMajorIndex1 = rand.nextInt(500);
		    			
		    			// 読み込んで保存
		    			userInfo = chineseNameList.get(nameIndex);
		    			universityName = chineseUniversityList.get(universityIndex);
		    			universityMajor = englishMajorList.get(universityMajorIndex1);
		    			nickname = userInfo.get(0) + userInfo.get(1) + "_" + i;
					    userGender = userInfo.get(2);
					    country = "54156";
					    phoneNumber = "0"+(rand.nextInt(3)+7)+"0-"+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)
					    				+"-"+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10);
					    email = userInfo.get(3);
		    		} else {
		    			// 読み込むデータのインデックスをランダムで設定
		    			nameIndex = rand.nextInt(1000);
		    			universityIndex = rand.nextInt(111);
		    			universityMajorIndex1 = rand.nextInt(500);
		    			
		    			// 読み込んで保存
		    			userInfo = vietnamNameList.get(nameIndex);
		    			universityName = vietnamUniversityList.get(universityIndex);
		    			universityMajor = englishMajorList.get(universityMajorIndex1);
		    			nickname = userInfo.get(0) + " " + userInfo.get(1) + "_" + i;
					    userGender = userInfo.get(2);
					    country = "54704";
					    phoneNumber = "0"+(rand.nextInt(3)+7)+"0-"+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)
					    				+"-"+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10)+rand.nextInt(10);
					    email = userInfo.get(3);
		    		}
		    	} else {
		    		// 読み込むデータのインデックスをランダムで設定
			    	nameIndex = rand.nextInt(20000);
				    highschoolIndex = rand.nextInt(5109);
				    highschoolMajorIndex = rand.nextInt(98);
				    universityIndex = rand.nextInt(1121);
				    universityMajorIndex1 = rand.nextInt(5000);
				    universityMajorIndex2 = rand.nextInt(5000);
				    
				    // 読み込んで保存
				    userInfo = nameList.get(nameIndex);
				    highschoolName = highschoolList.get(highschoolIndex);
				    highschoolMajor = highschoolMajorList.get(highschoolMajorIndex);
				    universityName = universityList.get(universityIndex);
				    nickname = userInfo.get(0) + "_" + i;
				    userGender = userInfo.get(4);
				    country = "54392";
				    phoneNumber = userInfo.get(6);
				    email = userInfo.get(5);
				    
				    // 年齢が50歳以上の場合university_major_1.csvを使用
				    if (userAge >= 50) {
				    	universityMajor = universityMajorList1.get(universityMajorIndex1);
				    } else {
				    	universityMajor = universityMajorList2.get(universityMajorIndex2);
				    }
		    	}
		    	
			    String genderCode = "";
				    
			    // 性別設定
			    if (userGender.equals("Male")) {
			    	genderCode = "53001";
			    } else if(userGender.equals("Female")) {
			    	genderCode = "53002";
			    } else {
			    	genderCode = "53004";
			    }
			    
			    // 学歴設定
			    int education = 0;
			    
			    if (userCountry == 1) {
			    	int[] educationList = new int[] {3, 4, 5, 6, 7};
			    	int educationListIndex = (int) (educationList.length * Math.random());
			    	education = educationList[educationListIndex];
			    } else if (userAge >= 18 && userAge < 23) {
			    	int[] educationList = new int[] {1, 2};
			    	int educationListIndex = (int) (educationList.length * Math.random());
			    	education = educationList[educationListIndex];
			    } else {
			    	int[] educationList = new int[] {1, 2, 3, 4, 5, 6, 7};
			    	int educationListIndex = (int) (educationList.length * Math.random());
			    	education = educationList[educationListIndex];
			    }
			    
			    // 学校、専攻設定
			    String schoolName = "";
			    String majorName = "";
			    
			    if (education == 1 || education == 2) {
			    	schoolName = highschoolName.get(0);
			    	majorName = highschoolMajor.get(0);
			    } else {
			    	schoolName = universityName.get(0);
			    	majorName = universityMajor.get(0);
			    }
			    
			    // 業種設定
			    String businessType = "";
			    int businessTypeIndex = (int) (businessTypeList.length * Math.random());
			    int careerBusinessTypeIndex = (int) (seniorBusinessTypeList.length * Math.random());
			    
			    if (userAge == 18 && (education == 1 || education == 2)) {
			    	businessType = "56000";
			    } else if (userAge >= 18 && userAge < 23 && (education != 1 && education != 2)) {
			    	businessType = "56000";
			    } else if (userAge >= 18 && userAge < 34) {
			    	businessType = businessTypeList[businessTypeIndex];
			    } else {
			    	businessType = seniorBusinessTypeList[careerBusinessTypeIndex];
			    }
			    
			    // 経歴設定
			    String career = "";
			    
			    if (businessType.equals("56000")) {
			    	career = "55000";
			    } else if (education == 1 || education == 2) {
			    	if (userAge == 18) {
			    		career = "55000";
			    	} else if (userAge >= 19 && userAge < 21) {
			    		String[] careerList = new String[] {"55000", "55001", "55002"};
				    	int careerListIndex = (int) (careerList.length * Math.random());
				    	career = careerList[careerListIndex];
			    	} else if (userAge >= 20 && userAge < 23) {
			    		String[] careerList = new String[] {"55000", "55001", "55002", "55003"};
				    	int careerListIndex = (int) (careerList.length * Math.random());
				    	career = careerList[careerListIndex];
			    	} else if (userAge >= 22 && userAge < 25) {
			    		String[] careerList = new String[] {"55000", "55001", "55002", "55003", "55004"};
				    	int careerListIndex = (int) (careerList.length * Math.random());
				    	career = careerList[careerListIndex];
			    	} else if (userAge >= 25 && userAge < 28) {
			    		String[] careerList = new String[] {"55000", "55001", "55002", "55003", "55004", "55005"};
				    	int careerListIndex = (int) (careerList.length * Math.random());
				    	career = careerList[careerListIndex];
			    	} else if (userAge >= 28 && userAge < 30) {
			    		String[] careerList = new String[] {"55001", "55002", "55003", "55004", "55005", "55006"};
				    	int careerListIndex = (int) (careerList.length * Math.random());
				    	career = careerList[careerListIndex];
			    	} else if (userAge >= 30 && userAge < 35) {
			    		String[] careerList = new String[] {"55002", "55003", "55004", "55005", "55006", "55007"};
				    	int careerListIndex = (int) (careerList.length * Math.random());
				    	career = careerList[careerListIndex];
			    	} else if (userAge >= 35 && userAge < 40) {
			    		String[] careerList = new String[] {"55003", "55004", "55005", "55006", "55007", "55008"};
				    	int careerListIndex = (int) (careerList.length * Math.random());
				    	career = careerList[careerListIndex];
			    	} else if (userAge >= 40 && userAge < 45) {
			    		String[] careerList = new String[] {"55004", "55005", "55006", "55007", "55008", "55009"};
				    	int careerListIndex = (int) (careerList.length * Math.random());
				    	career = careerList[careerListIndex];
			    	} else if (userAge >= 45) {
			    		String[] careerList = new String[] {"55005", "55006", "55007", "55008", "55009", "55010"};
				    	int careerListIndex = (int) (careerList.length * Math.random());
				    	career = careerList[careerListIndex];
			    	} 
			    } else {
			    	if (userAge == 22) {
			    		career = "55000";
			    	} else if (userAge >= 23 && userAge < 25) {
			    		String[] careerList = new String[] {"55000", "55001", "55002"};
				    	int careerListIndex = (int) (careerList.length * Math.random());
				    	career = careerList[careerListIndex];
			    	} else if (userAge >= 25 && userAge < 27) {
			    		String[] careerList = new String[] {"55000", "55001", "55002", "55003"};
				    	int careerListIndex = (int) (careerList.length * Math.random());
				    	career = careerList[careerListIndex];
			    	} else if (userAge >= 27 && userAge < 30) {
			    		String[] careerList = new String[] {"55000", "55001", "55002", "55003", "55004"};
				    	int careerListIndex = (int) (careerList.length * Math.random());
				    	career = careerList[careerListIndex];
			    	} else if (userAge >= 30 && userAge < 33) {
			    		String[] careerList = new String[] {"55000", "55001", "55002", "55003", "55004", "55005"};
				    	int careerListIndex = (int) (careerList.length * Math.random());
				    	career = careerList[careerListIndex];
			    	} else if (userAge >= 33 && userAge < 35) {
			    		String[] careerList = new String[] {"55001", "55002", "55003", "55004", "55005", "55006"};
				    	int careerListIndex = (int) (careerList.length * Math.random());
				    	career = careerList[careerListIndex];
			    	} else if (userAge >= 35 && userAge < 40) {
			    		String[] careerList = new String[] {"55002", "55003", "55004", "55005", "55006", "55007"};
				    	int careerListIndex = (int) (careerList.length * Math.random());
				    	career = careerList[careerListIndex];
			    	} else if (userAge >= 40 && userAge < 45) {
			    		String[] careerList = new String[] {"55003", "55004", "55005", "55006", "55007", "55008"};
				    	int careerListIndex = (int) (careerList.length * Math.random());
				    	career = careerList[careerListIndex];
			    	} else if (userAge >= 45 && userAge < 50) {
			    		String[] careerList = new String[] {"55004", "55005", "55006", "55007", "55008", "55009"};
				    	int careerListIndex = (int) (careerList.length * Math.random());
				    	career = careerList[careerListIndex];
			    	} else if (userAge >= 50) {
			    		String[] careerList = new String[] {"55005", "55006", "55007", "55008", "55009", "55010"};
				    	int careerListIndex = (int) (careerList.length * Math.random());
				    	career = careerList[careerListIndex];
			    	} 
			    }
			    
			    // 職種設定
			    String jobType = "";
			    
			    if (career.equals("55000")) {
			    	jobType = "57000";
			    } else {
			    	int jobTypeListIndex = (int) (jobTypeList.length * Math.random());
			    	jobType = jobTypeList[jobTypeListIndex];
			    }
			    
			    // 居住地設定
			    int residentialArea = rand.nextInt(47) + 58001;
			    
			    // 将来の目標設定
			    String hopeCareer = "";
			    
			    int hopeCareerListIndex = (int) (hopeCareerList.length * Math.random());
			    hopeCareer = hopeCareerList[hopeCareerListIndex];
			    
			    // 希望年給、重要経歴の数、スキルの数設定
			    String hopeIncome = "";
			    int careerSqlIndex = 1;
			    int skillSqlIndex = 1;
			    
			    if(career.equals("55000")) {
			    	hopeIncome = "61001";
			    } else if (career.equals("55001") ) {
			    	String[] hopeIncomeList = new String[] {"61001", "61002"};
			    	int hopeIncomeListIndex = (int) (hopeIncomeList.length * Math.random());
			    	hopeIncome = hopeIncomeList[hopeIncomeListIndex];
			    	skillSqlIndex = rand.nextInt(3) + 4;
			    } else if (career.equals("55002") ) {
			    	String[] hopeIncomeList = new String[] {"61001", "61002", "61003"};
			    	int hopeIncomeListIndex = (int) (hopeIncomeList.length * Math.random());
			    	hopeIncome = hopeIncomeList[hopeIncomeListIndex];
			    	skillSqlIndex = rand.nextInt(4) + 5;
			    } else if (career.equals("55003") ) {
			    	String[] hopeIncomeList = new String[] {"61002", "61003", "61004"};
			    	int hopeIncomeListIndex = (int) (hopeIncomeList.length * Math.random());
			    	hopeIncome = hopeIncomeList[hopeIncomeListIndex];
			    	careerSqlIndex = rand.nextInt(2) + 1;
			    	skillSqlIndex = rand.nextInt(5) + 6;
			    } else if (career.equals("55004") ) {
			    	String[] hopeIncomeList = new String[] {"61003", "61004", "61005"};
			    	int hopeIncomeListIndex = (int) (hopeIncomeList.length * Math.random());
			    	hopeIncome = hopeIncomeList[hopeIncomeListIndex];
			    	careerSqlIndex = rand.nextInt(2) + 2;
			    	skillSqlIndex = rand.nextInt(6) + 7;
			    } else if (career.equals("55005") ) {
			    	String[] hopeIncomeList = new String[] {"61004", "61005", "61006"};
			    	int hopeIncomeListIndex = (int) (hopeIncomeList.length * Math.random());
			    	hopeIncome = hopeIncomeList[hopeIncomeListIndex];
			    	careerSqlIndex = rand.nextInt(3) + 2;
			    	skillSqlIndex = rand.nextInt(7) + 8;
			    } else if (career.equals("55006") ) {
			    	String[] hopeIncomeList = new String[] {"61005", "61006", "61007"};
			    	int hopeIncomeListIndex = (int) (hopeIncomeList.length * Math.random());
			    	hopeIncome = hopeIncomeList[hopeIncomeListIndex];
			    	careerSqlIndex = rand.nextInt(3) + 3;
			    	skillSqlIndex = rand.nextInt(8) + 8;
			    } else if (career.equals("55007") ) {
			    	String[] hopeIncomeList = new String[] {"61006", "61007", "61008"};
			    	int hopeIncomeListIndex = (int) (hopeIncomeList.length * Math.random());
			    	hopeIncome = hopeIncomeList[hopeIncomeListIndex];
			    	careerSqlIndex = rand.nextInt(4) + 4;
			    	skillSqlIndex = rand.nextInt(9) + 8;
			    } else if (career.equals("55008") ) {
			    	String[] hopeIncomeList = new String[] {"61007", "61008", "61009"};
			    	int hopeIncomeListIndex = (int) (hopeIncomeList.length * Math.random());
			    	hopeIncome = hopeIncomeList[hopeIncomeListIndex];
			    	careerSqlIndex = rand.nextInt(5) + 5;
			    	skillSqlIndex = rand.nextInt(10) + 8;
			    } else if (career.equals("55009") ) {
			    	String[] hopeIncomeList = new String[] {"61008", "61009", "610010", "61011"};
			    	int hopeIncomeListIndex = (int) (hopeIncomeList.length * Math.random());
			    	hopeIncome = hopeIncomeList[hopeIncomeListIndex];
			    	careerSqlIndex = rand.nextInt(6) + 6;
			    	skillSqlIndex = rand.nextInt(11) + 9;
			    } else {
			    	String[] hopeIncomeList = new String[] {"61009", "61010", "610011", "61012", "61013", "61014"};
			    	int hopeIncomeListIndex = (int) (hopeIncomeList.length * Math.random());
			    	hopeIncome = hopeIncomeList[hopeIncomeListIndex];
			    	careerSqlIndex = rand.nextInt(7) + 7;
			    	skillSqlIndex = rand.nextInt(12) + 10;
			    }
			    
			    String joinSql = "";
			    String resumeSql = "";
			    String careerSql = "";
			    String skillSql = "";
			    
			    // 会員登録SQL
			    joinSql = "INSERT INTO hitobito.job_seeker_user_mgt(" + "\n" +
					    		"js_user_id" + "\n" +
					    		",auth_code" + "\n" +
					    		",social_login_id" + "\n" +
					    		",social_login_type" + "\n" +
					    		",token" + "\n" +
					    		",nickname" + "\n" +
					    		",join_date" + "\n" +
					    		",last_login_datetime" + "\n" +
					    		",logout_status_flag" + "\n" +
					    		",rec_create_id" + "\n" +
					    		",rec_create_datetime" + "\n" +
					    		",rec_update_id" + "\n" +
					    		",rec_update_datetime)" + "\n" +
				    		"VALUES(" + "\n" +
					    		"'U" + (9000000 + i) + "'\n" +
					    		",'03'" + "\n" +
					    		",'testuser_" + (9000000 + i) + "'\n" +
					    		",'20502'" + "\n" +
					    		",null" + "\n" +
					    		",'" + nickname + "'\n" +
					    		",'" + now + "'\n" +
					    		",'0001-01-01 00:00:00'" + "\n" +
					    		",'C0000001'" + "\n" +
					    		",now()" + "\n" +
					    		",'C0000001'" + "\n" +
					    		",now());" + "\n";
			    
			    // 履歴書登録SQL
			    resumeSql = "INSERT INTO hitobito.resume_mgt(" + "\n" +
			    				"resume_id" + "\n" +
			    				",user_id" + "\n" +
			    				",business_category" + "\n" +
			    				",user_age" + "\n" +
			    				",user_gender" + "\n" +
			    				",education" + "\n" +
			    				",school_name" + "\n" +
			    				",major_name" + "\n" +
			    				",business_type" + "\n" +
			    				",career" + "\n" +
			    				",job_type" + "\n" +
			    				",country" + "\n" +
			    				",residential_area" + "\n" +
			    				",hope_career" + "\n" +
			    				",hope_income" + "\n" +
			    				",phone_number" + "\n" +
			    				",user_email" + "\n" +
			    				",additional_comment" + "\n" +
			    				",phone_number_flag" + "\n" +
			    				",user_email_flag" + "\n" +
			    				",resume_create_datetime" + "\n" +
			    				",resume_update_datetime" + "\n" +
			    				",rec_create_id" + "\n" +
			    				",rec_create_datetime" + "\n" +
			    				",rec_update_id" + "\n" +
			    				",rec_update_datetime" + "\n" +
			    				",logical_del_flag)" + "\n" +
		    				"VALUES(" + "\n" +
			    				"'R" + (9000000 + i) + "'\n" +
			    				",'U" + (9000000 + i) + "'\n" +
			    				",'101'" + "\n" +
			    				",'510" + userAge + "'\n" +
			    				",'" + genderCode + "'\n" +
			    				",'5200" + education + "'\n" +
			    				",'" + schoolName + "'\n" +
			    				",'" + majorName + "'\n" +
			    				",'" + businessType + "'\n" +
			    				",'" + career + "'\n" +
			    				",'" + jobType + "'\n" +
			    				",'" + country + "'\n" +
			    				",'" + residentialArea + "'\n" +
			    				",'" + hopeCareer + "'\n" +
			    				",'" + hopeIncome + "'\n" +
			    				",'" + phoneNumber + "'\n" +
			    				",'" + email + "'\n" +
			    				",'" + "'\n" +
			    				",'1'" + "\n" +
			    				",'1'" + "\n" +
			    				",now()" + "\n" +
			    				",now()" + "\n" +
			    				",'U" + (9000000 + i) + "'\n" +
			    				",now()" + "\n" +
			    				",'U" + (9000000 + i) + "'\n" +
			    				",now()" + "\n" +
			    				",'0');" + "\n";
			    
			    String careerSqlList = "";
			    List<String> savedProjectList = new ArrayList<String>();
			    
			    // 重要経歴の数分繰り返す
			    for (int j = 0; j < careerSqlIndex; j++) {
			    	// プロジェクト名設定
			    	int projectIndex = rand.nextInt(20000);
			    	List<String> projectNameList = projectList.get(projectIndex);
			    	String projectName = projectNameList.get(0);
			    	
			    	// プロジェクト名重複チェック
				    boolean projectCheck = true;
				    
				    for (String savedProject : savedProjectList) {
				    	if (projectName.equals(savedProject)) {
				    		projectCheck = false;
				    		break;
					    }
				    }
				    
				    if (projectCheck == false) {
				    	j--;
				    } else {
				    	savedProjectList.add(projectName);
				    	
				    	// 役割設定
				    	String projectRole = "";
				    	
				    	
				    	int projectRoleListIndex = (int) (projectRoleList.size() * Math.random());
				    	projectRole = projectRoleList.get(projectRoleListIndex);
				    	
				    	// 期間設定
				    	int projectPeriod = 1;
				    	
				    	if (projectRole.equals("62001")) {
				    		projectPeriod = rand.nextInt(3) + 2;
				    	} else if (projectRole.equals("62002")) {
				    		projectPeriod = rand.nextInt(12) + 12;
				    	} else if (projectRole.equals("62003")) {
				    		projectPeriod = rand.nextInt(12) + 6;
				    	} else if (projectRole.equals("62004")) {
				    		projectPeriod = rand.nextInt(3) + 3;
				    	} else if (projectRole.equals("62005")) {
				    		projectPeriod = rand.nextInt(6) + 6;
				    	} else if (projectRole.equals("62006")) {
				    		projectPeriod = rand.nextInt(18) + 6;
				    	} else if (projectRole.equals("62007")) {
				    		projectPeriod = rand.nextInt(18) + 6;
				    	} else {
				    		projectPeriod = rand.nextInt(18) + 6;
				    	} 
				    	
				    	// 担当工程設定
				    	String projectProcess = "";
				    	
				    	if (projectRole.equals("62001")) {
				    		String basicProcess = "63001,63002,63003";
				    		String[] projectProcessList = new String[] {"63004", "63005"};
					    	int projectProcessListIndex = (int) (projectProcessList.length * Math.random());
					    	int random = rand.nextInt(3);
					    	
					    	if (random == 0) {
					    		projectProcess = basicProcess;
					    	} else if (random == 1) {
					    		projectProcess = basicProcess + "," + projectProcessList[projectProcessListIndex];
					    	} else {
					    		projectProcess = basicProcess + "," + projectProcessList[0] + "," + projectProcessList[1];
					    	}
				    	} else if (projectRole.equals("62002")) {
				    		String basicProcess = "63004,63007,63011,63012,63013,63014,63015,63016";
				    		String[] projectProcessList = new String[] {"63006", "63030"};
					    	int projectProcessListIndex = (int) (projectProcessList.length * Math.random());
					    	int random = rand.nextInt(3);
					    	
					    	if (random == 0) {
					    		projectProcess = basicProcess;
					    	} else if (random == 1) {
					    		projectProcess = basicProcess + "," + projectProcessList[projectProcessListIndex];
					    	} else {
					    		projectProcess = basicProcess + "," + projectProcessList[0] + "," + projectProcessList[1];
					    	}
				    	} else if (projectRole.equals("62003")) {
				    		String basicProcess = "63011,63012,63015,63016";
				    		String[] projectProcessList = new String[] {"63007", "63030"};
					    	int projectProcessListIndex = (int) (projectProcessList.length * Math.random());
					    	int random = rand.nextInt(3);
					    	
					    	if (random == 0) {
					    		projectProcess = basicProcess;
					    	} else if (random == 1) {
					    		projectProcess = basicProcess + "," + projectProcessList[projectProcessListIndex];
					    	} else {
					    		projectProcess = basicProcess + "," + projectProcessList[0] + "," + projectProcessList[1];
					    	}
				    	} else if (projectRole.equals("62004")) {
				    		String basicProcess = "63013,63014";
				    		String[] projectProcessList = new String[] {"63012", "63015"};
					    	int projectProcessListIndex = (int) (projectProcessList.length * Math.random());
					    	int random = rand.nextInt(3);
					    	
					    	if (random == 0) {
					    		projectProcess = basicProcess;
					    	} else if (random == 1) {
					    		projectProcess = basicProcess + "," + projectProcessList[projectProcessListIndex];
					    	} else {
					    		projectProcess = basicProcess + "," + projectProcessList[0] + "," + projectProcessList[1];
					    	}
				    	} else if (projectRole.equals("62005")) {
				    		String basicProcess = "63014,63015,63016";
				    		String[] projectProcessList = new String[] {"63030", "63090"};
					    	int projectProcessListIndex = (int) (projectProcessList.length * Math.random());
					    	int random = rand.nextInt(3);
					    	
					    	if (random == 0) {
					    		projectProcess = basicProcess;
					    	} else if (random == 1) {
					    		projectProcess = basicProcess + "," + projectProcessList[projectProcessListIndex];
					    	} else {
					    		projectProcess = basicProcess + "," + projectProcessList[0] + "," + projectProcessList[1];
					    	}
				    	} else if (projectRole.equals("62006") || projectRole.equals("62007")) {
				    		String basicProcess = "63011,63012,63013,63014,63015,63016";
				    		String[] projectProcessList = new String[] {"63030", "63090"};
					    	int projectProcessListIndex = (int) (projectProcessList.length * Math.random());
					    	int random = rand.nextInt(3);
					    	
					    	if (random == 0) {
					    		projectProcess = basicProcess;
					    	} else if (random == 1) {
					    		projectProcess = basicProcess + "," + projectProcessList[projectProcessListIndex];
					    	} else {
					    		projectProcess = basicProcess + "," + projectProcessList[0] + "," + projectProcessList[1];
					    	}
				    	} else {
				    		String basicProcess = "63030,63050";
					    	int random = rand.nextInt(2);
					    	
					    	if (random == 0) {
					    		projectProcess = basicProcess;
					    	} else {
					    		projectProcess = basicProcess + ",63090";
					    	}
				    	} 
				    	
				    	// 重要経歴登録SQL
				    	careerSql = "INSERT INTO hitobito.resume_major_career_mgt(" + "\n" +
				    					"rs_mj_career_index" + "\n" +
				    					",resume_id" + "\n" +
				    					",project_name" + "\n" +
				    					",project_role" + "\n" +
				    					",project_period" + "\n" +
				    					",project_process" + "\n" +
				    					",rec_create_id" + "\n" +
				    					",rec_create_datetime" + "\n" +
				    					",rec_update_id" + "\n" +
				    					",rec_update_datetime" + "\n" +
				    					",logical_del_flag)" + "\n" +
			    					"VALUES(" + "\n" +
			    						"nextval('hitobito.resume_major_career_mgt_rs_mj_career_index_seq')" + "\n" +
			    						",'R" + (9000000 + i) + "'\n" +
			    						",'" + projectName + "'\n" +
			    						",'" + projectRole + "'\n" +
			    						",'" + projectPeriod + "'\n" +
			    						",'" + projectProcess + "'\n" +
			    						",'U" + (9000000 + i) + "'\n" +
			    						",now()" + "\n" +
			    						",'U" + (9000000 + i) + "'\n" +
			    						",now()" + "\n" +
			    						",'0');" + "\n"
				    					;
				    	
				    	careerSqlList = careerSqlList + "\n" + careerSql;
				    }
			    }
			    
			    String skillSqlList = "";
			    List<String> savedSkillList = new ArrayList<String>();
			    
			    // スキルテーブル設定
			    List<String> skillCodeList = new ArrayList<String>();
			    
			    if (skillPercent1 != 0) {
			    	for (int s = 0; s < skillPercent1 * 131; s++) {
			    		skillCodeList.add(skillCode1);
			    	}
			    }
			    if (skillPercent2 != 0) {
			    	for (int s = 0; s < skillPercent2 * 131; s++) {
			    		skillCodeList.add(skillCode2);
			    	}
			    }
			    if (skillPercent3 != 0) {
			    	for (int s = 0; s < skillPercent3 * 131; s++) {
			    		skillCodeList.add(skillCode3);
			    	}
			    }
			    if (skillPercent4 != 0) {
			    	for (int s = 0; s < skillPercent4 * 131; s++) {
			    		skillCodeList.add(skillCode4);
			    	}
			    }
			    if (skillPercent5 != 0) {
			    	for (int s = 0; s < skillPercent5 * 131; s++) {
			    		skillCodeList.add(skillCode5);
			    	}
			    }
			    if (skillPercent6 != 0) {
			    	for (int s = 0; s < skillPercent6 * 131; s++) {
			    		skillCodeList.add(skillCode6);
			    	}
			    }
			    if (skillPercent7 != 0) {
			    	for (int s = 0; s < skillPercent7 * 131; s++) {
			    		skillCodeList.add(skillCode7);
			    	}
			    }
			    if (skillPercent8 != 0) {
			    	for (int s = 0; s < skillPercent8 * 131; s++) {
			    		skillCodeList.add(skillCode8);
			    	}
			    }
			    
			    int sumSkillPercent = skillPercent1 + skillPercent2 + skillPercent3 + skillPercent4 +
			    					skillPercent5 + skillPercent6 + skillPercent7 + skillPercent8;
			    
			    if (sumSkillPercent < 100) {
			    	for (int s = 0; s < (100 - sumSkillPercent) * 131; s++) {
			    		for (int t = 0; t < 131; t++) {
			    			skillCodeList.add(tempSkillCodeList[t]);
			    		}
			    	}
			    }
			    
			    // スキルの数分繰り返す
			    for (int k = 0; k < skillSqlIndex; k++) {
			    	
			    	// スキル設定
			    	String skillCode = "";
			    	
			    	int skillCodeListIndex = (int) (skillCodeList.size() * Math.random());
			    	skillCode = skillCodeList.get(skillCodeListIndex);
			    	
			    	// スキル重複チェック
				    boolean skillCheck = true;

			    	for (String savedSkill : savedSkillList) {
				    	if (skillCode.equals(savedSkill)) {
				    		skillCheck = false;
				    		break;
					    }
				    }
				    
				    if (skillCheck == false) {
				    	k--;
				    } else {
				    	savedSkillList.add(skillCode);
					    
				    	// スキル経歴設定
				    	String skillCareer = "";
				    	
				    	if (career.equals("55000") || career.equals("55001")) {
				    		skillCareer = "65001";
					    } else if (career.equals("55002") ) {
					    	String[] skillCareerList = new String[] {"65001", "65002"};
					    	int skillCareerListIndex = (int) (skillCareerList.length * Math.random());
					    	skillCareer = skillCareerList[skillCareerListIndex];
					    } else if (career.equals("55003") ) {
					    	String[] skillCareerList = new String[] {"65001", "65002", "65003"};
					    	int skillCareerListIndex = (int) (skillCareerList.length * Math.random());
					    	skillCareer = skillCareerList[skillCareerListIndex];
					    } else if (career.equals("55004") || career.equals("55005")) {
					    	String[] skillCareerList = new String[] {"65001", "65002", "65003", "65004"};
					    	int skillCareerListIndex = (int) (skillCareerList.length * Math.random());
					    	skillCareer = skillCareerList[skillCareerListIndex];
					    } else {
					    	String[] skillCareerList = new String[] {"65001", "65002", "65003", "65004", "65005"};
					    	int skillCareerListIndex = (int) (skillCareerList.length * Math.random());
					    	skillCareer = skillCareerList[skillCareerListIndex];
					    }
				    	
				    	// スキル登録SQL
				    	skillSql = "INSERT INTO hitobito.resume_skill_mgt(" + "\n" +
				    			 		"rs_skill_idx" + "\n" +
				    			 		",resume_id" + "\n" +
				    			 		",skill_code" + "\n" +
				    			 		",career_code" + "\n" +
				    			 		",ref_code" + "\n" +
				    			 		",invalid_flag" + "\n" +
				    			 		",rec_create_id" + "\n" +
				    			 		",rec_create_datetime" + "\n" +
				    			 		",rec_update_id" + "\n" +
				    			 		",rec_update_datetime" + "\n" +
				    			 		",logical_del_flag)" + "\n" +
				    			 	"VALUES(" + "\n" +
					    			 	"nextval('hitobito.resume_skill_mgt_rs_skill_idx_seq')" + "\n" +
					    			 	",'R" + (9000000 + i) + "'\n" +
					    			 	",'" + skillCode + "'\n" +
				    			 		",'" + skillCareer + "'\n" +
				    			 		",CONCAT('" + skillCode + "', '" + skillCareer + "')" + "\n" +
				    			 		",'0'" + "\n" +
				    			 		",'U" + (9000000 + i) + "'\n" +
				    			 		",now()" + "\n" +
				    			 		",'U" + (9000000 + i) + "'\n" +
				    			 		",now()" + "\n" +
				    			 		",'0');" + "\n"
					    				;
				    	
				    	skillSqlList = skillSqlList + "\n" + skillSql;
					}
			    }
			    sql = sql + "\n" + joinSql + "\n" + resumeSql + "\n" + careerSqlList + "\n" + skillSqlList;
		    }
		    // SQLを書き込む
		    FileOutputStream outputStream = new FileOutputStream("C:\\pleiades\\2022-06\\workspace\\create_dummy_data\\created_sql\\created_sql_"+ now +".sql");
		    outputStream.write(sql.toString().getBytes());
		    outputStream.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
