/**
    * Copyright
    * All right reserved.
    * @author: Xuhui Jiang
    * date: 2017-3-8
    */

package automation;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.filechooser.FileSystemView;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Region;
import automation.Click_POS;
import automation.Util;

public class Main { 
	
	static String American_Cheese = "6063";
	static String Grilled_Onion = "913";
	static String Tomato = "3908";
	static String receiptEatInLineText = "Eat-In Total";
	static String receiptTakeOutLineText = "Take-Out Total";
	static String resultString = "";
	
	static FileSystemView fsv = FileSystemView.getFileSystemView(); 
	static String desktopPath = fsv.getHomeDirectory().toString();
	
	//KVS images should be verified
	String myKVS01 = desktopPath + "\\Automation\\KVS_fastfail\\KVS31_01.png";
	String myKVS02 = desktopPath + "\\Automation\\KVS_fastfail\\KVS31_02.png";
	String myKVS03 = desktopPath + "\\Automation\\KVS_fastfail\\KVS31_03.png";
	String myKVS04 = desktopPath + "\\Automation\\KVS_fastfail\\KVS31_04.png";
	String myKVS05 = desktopPath + "\\Automation\\KVS_fastfail\\KVS31_05.png";
	String myKVS06 = desktopPath + "\\Automation\\KVS_fastfail\\KVS31_06.png";
	String myKVS07 = desktopPath + "\\Automation\\KVS_fastfail\\KVS31_07.png";
	String myKVS08 = desktopPath + "\\Automation\\KVS_fastfail\\KVS31_08.png";
	String myKVS09 = desktopPath + "\\Automation\\KVS_fastfail\\KVS31_09.png";
	String myKVS10 = desktopPath + "\\Automation\\KVS_fastfail\\KVS31_10.png";
	String myKVS11 = desktopPath + "\\Automation\\KVS_fastfail\\KVS31_11.png";
	String myKVS12 = desktopPath + "\\Automation\\KVS_fastfail\\KVS31_12.png";
	String myKVS13 = desktopPath + "\\Automation\\KVS_fastfail\\KVS31_13.png";
	String myKVS14 = desktopPath + "\\Automation\\KVS_fastfail\\KVS31_14.png";
	String myKVS15 = desktopPath + "\\Automation\\KVS_fastfail\\KVS31_15.png";
	String myKVS16 = desktopPath + "\\Automation\\KVS_fastfail\\KVS31_16.png";
	String myKVS17 = desktopPath + "\\Automation\\KVS_fastfail\\KVS31_17.png";
	
	//FC images should be verified
	String myFC01 = desktopPath + "\\Automation\\KVS_fastfail\\FC_01.png";
	String myFC02 = desktopPath + "\\Automation\\KVS_fastfail\\FC_02.png";
	String myFC03 = desktopPath + "\\Automation\\KVS_fastfail\\FC_03.png";
	String myFC04 = desktopPath + "\\Automation\\KVS_fastfail\\FC_04.png";
	String myFC05 = desktopPath + "\\Automation\\KVS_fastfail\\FC_05.png";
	String myFC06 = desktopPath + "\\Automation\\KVS_fastfail\\FC_06.png";
	String myFC07 = desktopPath + "\\Automation\\KVS_fastfail\\FC_07.png";
	String myFC08 = desktopPath + "\\Automation\\KVS_fastfail\\FC_08.png";
	String myFC09 = desktopPath + "\\Automation\\KVS_fastfail\\FC_09.png";
	String myFC10 = desktopPath + "\\Automation\\KVS_fastfail\\FC_10.png";
	String myFC11 = desktopPath + "\\Automation\\KVS_fastfail\\FC_11.png";
	String myFC12 = desktopPath + "\\Automation\\KVS_fastfail\\FC_12.png";
	String myFC13 = desktopPath + "\\Automation\\KVS_fastfail\\FC_13.png";
	String myFC14 = desktopPath + "\\Automation\\KVS_fastfail\\FC_14.png";
	String myFC15 = desktopPath + "\\Automation\\KVS_fastfail\\FC_15.png";
	String myFC16 = desktopPath + "\\Automation\\KVS_fastfail\\FC_16.png";
	String myFC17 = desktopPath + "\\Automation\\KVS_fastfail\\FC_17.png";
	int observeTime = 2;
	static int timePause = 3000;
	
	public static void main(String[] agrs){
		
		new Util().ReadXml();
		new Logging().clearLog();
		
		LogInManager();
		LogInRegister();
		
		/**
		 * Making Orders one by one.
		 * Each Order is dependent, any oder can be comment
		 * without affecting other orders.
		 */
	    FrontCounter01();
	    FrontCounter02();
		FrontCounter03();
		FrontCounter04();
		FrontCounter05();
		FrontCounter06();
		FrontCounter07();
		FrontCounter08();
		FrontCounter09();
		FrontCounter10();
		FrontCounter11();
		FrontCounter12();
		FrontCounter13();
		FrontCounter14();
		FrontCounter15();
		FrontCounter16();
		FrontCounter17();
		logOut();
		if(!resultString.equals("")){
			JFrame jFrame = new JFrame("Waring!");
			jFrame.setSize(300, 300);
			jFrame.setVisible(true);
			jFrame.setContentPane(new JLabel(resultString + "is wrong, please check Log!"));
		}
	}
	
public static void LogInManager(){
		
		Click_POS figure = new Click_POS();
		Logging lg = new Logging();
		lg.createFolder("Log");
		lg.createFile("Log.txt");
		lg.writeLog("Log.txt", "********************"+"Logging in as Manager"+"********************");
		figure.manager_option();
		figure.function_3();
		figure.function_enter();
		figure.function_3();
		figure.function_enter();
		lg.writeLog("Log.txt", "********************"+"Logging in as Manager End"+"********************");
        lg.writeLog("Log.txt", "\n");
}

public static void LogInRegister(){
	    
	    Click_POS figure = new Click_POS();
	    Logging lg = new Logging();
	    lg.createFolder("Log");
	    lg.createFile("Log.txt");
	    lg.writeLog("Log.txt", "********************"+"Logging in as Manager"+"********************");
	    figure.logInCashierFC();
	    figure.function_3();
	    figure.function_enter();
	    figure.logInEnter();
	    figure.logInYes();
	    lg.writeLog("Log.txt", "********************"+"Logging in as Manager"+"********************");
	    lg.writeLog("Log.txt", "\n");
}

public static void FrontCounter01(){
	  
	Click_POS figure = new Click_POS();
    Logging lg = new Logging();
    lg.createFolder("Log");
    lg.createFile("Log.txt");
    lg.createFile("Result.txt");
    lg.writeLog("Result.txt", getTimeStamp() + "********************" + "Front Counter #01" + "********************");
    Click_POS.productcodes = "";
    lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part01"+"********************");
    figure.HotCakes_Sauage();
    figure.small_Button();
    figure.orange_Hic();
    figure.condiment_Gifts();
    figure.condiment_Gifts_Selected();
    waitOneSecond();
    figure.Usa_Today();
    figure.take_Out_Total();
    waitOneSecond(); 
    figure.extract_Cash();
    figure.extract_Cash();
    lg.writeLog("Log.txt", "******************"+"FC Normal Order Taking Operations Part01 End"+"******************");
    lg.writeLog("Log.txt", "\n");
    System.out.println("This is what I want : " + Click_POS.productcodes);

/*//Validate KVS
    new SwitchWindow().switchWindow();
    boolean flagKVS = valiadte(myKVS01, observeTime, "01", timePause);
//Validate FC
    new SwitchWindow().switchWindow();
    boolean flagFC = valiadteFC(myFC01, observeTime, "01", timePause);
    new SwitchWindow().switchWindow();
    Util util = new Util();
    //figure.Sever_KVS31_FC();
    String order1_Id = util.getOrderId();
    util.calculatePrice(Click_POS.productcodes, "TO");
    String[] order1_strArr = util.calculateSalesTax().split(";");
    boolean flag = util.validateAmountTax(order1_Id, order1_strArr[0], order1_strArr[1]);
      if(flag && flagKVS && flagFC){
    }else{
    	resultString += "Oder01, ";
    	resultString += "\n";
    }
    lg.writeLog("Result.txt", getTimeStamp() + "********************" + "Front Counter #01 End" + "********************");
    lg.writeLog("Result.txt", "\n");
    String receipt = util.copyReceipt(order1_Id);
    System.out.println(receipt);*/
}

public static void FrontCounter02(){
	
	Click_POS figure = new Click_POS();
	Logging lg = new Logging();
	lg.createFolder("Log");
	lg.createFile("Log.txt");
	lg.createFile("Result.txt");
    lg.writeLog("Result.txt", "********************" + "Front Counter #02" + "********************");
	Click_POS.productcodes = "";
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part02"+"********************");
	figure.bigMac_Meal();
    waitOneSecond();
	figure.grill_Button();
	Region r = new Region(560,500,70,70);
	try{
	    r.click();
	    lg.writeLog("Log.txt", "[Log]American Cheese is selected ");
	    Click_POS.productcodes = Click_POS.productcodes + American_Cheese +";";
	}catch (Exception e) {
		// TODO: handle exception
		lg.writeLog("Log.txt", "[Error]" + "American Cheese not found");
		e.printStackTrace();
		//System.exit(0);
	}
	figure.grill_Done();
	waitOneSecond();
	figure.take_Out_Total();
	waitOneSecond();
	figure.extract_Cash();
	figure.extract_Cash();
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part02 End"+"********************");	
	lg.writeLog("Log.txt", "\n");
	System.out.println("This is what I want : " + Click_POS.productcodes);

/*//Validate	KVS
	new SwitchWindow().switchWindow();
	boolean flagKVS = valiadte(myKVS02, observeTime, "02", timePause);
//Validate FC
    new SwitchWindow().switchWindow();
    boolean flagFC = valiadteFC(myFC02, observeTime, "02", timePause);
    new SwitchWindow().switchWindow();
	Util util = new Util();
    //figure.Sever_KVS31_FC();
    String order2_Id = util.getOrderId();
    util.calculatePrice(Click_POS.productcodes, "TO");
    String[] order2_strArr = util.calculateSalesTax().split(";");
    boolean flag = util.validateAmountTax(order2_Id, order2_strArr[0], order2_strArr[1]);
 
    lg.writeLog("Result.txt", "********************" + "Front Counter #02 End" + "********************");
    lg.writeLog("Result.txt", "\n");
    String receipt = util.copyReceipt(order2_Id);
    System.out.println(receipt);*/
}

public static void FrontCounter03(){
	Click_POS figure = new Click_POS();
	Logging lg = new Logging();
	lg.createFolder("Log");
	lg.createFile("Log.txt");
	lg.createFile("Result.txt");
    lg.writeLog("Result.txt", "********************" + "Front Counter #03" + "********************");
	Click_POS.productcodes = "";
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part03"+"********************");
	figure.Hamburger_HappyMeal();
	waitOneSecond();
	figure.grill_Button();
	waitOneSecond();
	figure.grill_PageDown();
	waitOneSecond();
	Region r1 = new Region(560,360,70,70);
	try{
	    r1.click();
	    lg.writeLog("Log.txt", "[Log]American Cheese is selected ");
	    Click_POS.productcodes = Click_POS.productcodes + American_Cheese +";";
	}catch (Exception e) {
		// TODO: handle exception
		lg.writeLog("Log.txt", "[Error]" + "American Cheese not found");
		e.printStackTrace();
		//System.exit(0);
	}
	figure.grill_PageDown();
	 waitOneSecond();
	figure.grill_PageDown();
	waitOneSecond();
	Region r2 = new Region(560,290,70,70);
	try{
	    r2.click();
	    lg.writeLog("Log.txt", "[Log]Tomato is selected ");
	    Click_POS.productcodes = Click_POS.productcodes + Tomato +";";
	}catch (Exception e) {
		// TODO: handle exception
		lg.writeLog("Log.txt", "[Error]" + "Tomato not found");
		e.printStackTrace();
		//System.exit(0);
	}
	figure.grill_Done();
	waitOneSecond();
	figure.take_Out_Total();
	waitOneSecond();
	figure.extract_Cash();
	figure.extract_Cash();
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part03 End"+"********************");
	lg.writeLog("Log.txt", "\n");
	System.out.println("This is what I want : " + Click_POS.productcodes);
    
/*//Validate KVS
	new SwitchWindow().switchWindow();
	boolean flagKVS = valiadte(myKVS03, observeTime, "03", timePause);
//Validate FC
    new SwitchWindow().switchWindow();
    boolean flagFC = valiadteFC(myFC03, observeTime, "03", timePause);
    new SwitchWindow().switchWindow();
	Util util = new Util();
	//figure.Sever_KVS31_FC();
	String order3_Id = util.getOrderId();
    util.calculatePrice(Click_POS.productcodes, "TO");
    String[] order3_strArr = util.calculateSalesTax().split(";");
    boolean flag = util.validateAmountTax(order3_Id, order3_strArr[0], order3_strArr[1]);
    if(flag && flagKVS && flagFC){
    }else{
    	resultString += "Oder03,";
    	resultString += "\n";
    }
    lg.writeLog("Result.txt", "********************" + "Front Counter #03 End" + "********************");
    lg.writeLog("Result.txt", "\n");
    String receipt = util.copyReceipt(order3_Id);
    System.out.println(receipt);*/
}

public static void FrontCounter04(){
	Click_POS figure = new Click_POS();
	Logging lg = new Logging();
	lg.createFolder("Log");
	lg.createFile("Log.txt");
    lg.createFile("Result.txt");
    lg.writeLog("Result.txt", "********************" + "Front Counter #04" + "********************");
	Click_POS.productcodes = "";
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part04"+"********************");
	figure.orange_Hic();
	figure.Egg_McMuffin();
	figure.grill_Button();
	 waitOneSecond();
	figure.grill_PageDown();
	waitOneSecond();
	figure.grill_PageDown();
	waitOneSecond();
	figure.grill_PageDown();
	waitOneSecond();
	Region region = new Region(560,220,70,70);
	try{
	    region.click();
	    lg.writeLog("Log.txt", "[Log]Grilled_Onion is selected ");
	    Click_POS.productcodes = Click_POS.productcodes + Grilled_Onion +";";
	}catch (Exception e) {
		// TODO: handle exception
		lg.writeLog("Log.txt", "[Error]" + "Grilled_Onion not found");
		e.printStackTrace();
		//System.exit(0);
	}
	figure.grill_Done();
	waitOneSecond();
	figure.take_Out_Total();
	waitOneSecond();
	figure.extract_Cash();
	figure.extract_Cash();
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part04 End"+"********************");
	lg.writeLog("Log.txt", "\n");
	System.out.println("This is what I want : " + Click_POS.productcodes);

/*//Validate KVS
	new SwitchWindow().switchWindow();
	boolean flagKVS = valiadte(myKVS04, observeTime, "04", timePause);
//Validate FC
    new SwitchWindow().switchWindow();
    boolean flagFC = valiadteFC(myFC04, observeTime, "04", timePause);
    new SwitchWindow().switchWindow();
	Util util = new Util();
    //figure.Sever_KVS31_FC();
	String order4_Id = util.getOrderId();
    util.calculatePrice(Click_POS.productcodes, "TO");
    String[] order4_strArr = util.calculateSalesTax().split(";");
    boolean flag = util.validateAmountTax(order4_Id, order4_strArr[0], order4_strArr[1]);
    if(flag && flagKVS && flagFC){
    }else{
    	resultString += "Oder04,";
    	resultString += "\n";
    }
    lg.writeLog("Result.txt", "********************" + "Front Counter #04 End" + "********************");
    lg.writeLog("Result.txt", "\n");
    String receipt = util.copyReceipt(order4_Id);
    System.out.println(receipt);*/
}

public static void FrontCounter05(){
	
	Click_POS figure = new Click_POS();
	Logging lg = new Logging();
	lg.createFolder("Log");
	lg.createFile("Log.txt");
	lg.createFile("Result.txt");
    lg.writeLog("Result.txt", "********************" + "Front Counter #05" + "********************");
	Click_POS.productcodes = "";
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part05"+"********************");
	figure.lunchButton();
	figure.lunchButton_Selected();
	waitOneSecond();
	figure.QTR_Ham();
	figure.small_Button();
	figure.coke();
	waitOneSecond();
	figure.Hamburger_HappyMeal();
	figure.take_Out_Total();
	waitOneSecond();
	figure.extract_Cash();
	figure.extract_Cash();
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part05 End"+"********************");
	lg.writeLog("Log.txt", "\n");
	System.out.println("This is what I want : " + Click_POS.productcodes);

/*//Validate KVS
	new SwitchWindow().switchWindow();
	boolean flagKVS = valiadte(myKVS05, observeTime, "05", timePause);
//Validate FC
    new SwitchWindow().switchWindow();
    boolean flagFC = valiadteFC(myFC05, observeTime, "05", timePause);
    new SwitchWindow().switchWindow();
	Util util = new Util();
    //figure.Sever_KVS31_FC();
	String order5_Id = util.getOrderId();
    util.calculatePrice(Click_POS.productcodes, "TO");
    String[] order5_strArr = util.calculateSalesTax().split(";");
    boolean flag = util.validateAmountTax(order5_Id, order5_strArr[0], order5_strArr[1]);
    if(flag && flagKVS && flagFC){
    }else{
    	resultString += "Oder05,";
    	resultString += "\n";
    }
    lg.writeLog("Result.txt", "********************" + "Front Counter #05 End" + "********************");
    lg.writeLog("Result.txt", "\n");
    String receipt = util.copyReceipt(order5_Id);
    System.out.println(receipt);*/
}

public static void FrontCounter06(){
	
	Click_POS figure = new Click_POS();
	Logging lg = new Logging();
	lg.createFolder("Log");
	lg.createFile("Log.txt");
	lg.createFile("Result.txt");
    lg.writeLog("Result.txt", "********************" + "Front Counter #06" + "********************");
	Click_POS.productcodes = "";
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part06"+"********************");
	figure.bigMac_Meal();
	waitOneSecond();
	figure.grill_Button();
	waitOneSecond();
	Region r = new Region(560,500,70,70);
	try{
	    r.click();
	    lg.writeLog("Log.txt", "[Log]American_Cheese is selected ");
	    Click_POS.productcodes = Click_POS.productcodes + American_Cheese +";";
	}catch (Exception e) {
		// TODO: handle exception
		lg.writeLog("Log.txt", "[Error]" + "American_Cheese not found");
		e.printStackTrace();
		//System.exit(0);
	}
	figure.grill_Done();
	waitOneSecond();
	figure.condiment_Gifts();
	figure.condiment_Gifts_Selected();
	 waitOneSecond();
	figure.Gift_Cert_5();
	figure.Gift_Cert_5();
	figure.take_Out_Total();
	waitOneSecond();
	figure.extract_Cash();
	figure.extract_Cash();
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part06 End"+"********************");
	lg.writeLog("Log.txt", "\n");
	System.out.println("This is what I want : " + Click_POS.productcodes);

/*//Validate KVS
	new SwitchWindow().switchWindow();
	boolean flagKVS = valiadte(myKVS06, observeTime, "06", timePause);
//Validate FC
    new SwitchWindow().switchWindow();
    boolean flagFC = valiadteFC(myFC06, observeTime, "06", timePause);
    new SwitchWindow().switchWindow();
    
	Util util = new Util();
	//figure.Sever_KVS31_FC();
	String order6_Id = util.getOrderId();
    util.calculatePrice(Click_POS.productcodes, "TO");
    String[] order6_strArr = util.calculateSalesTax().split(";");
    boolean flag = util.validateAmountTax(order6_Id, order6_strArr[0], order6_strArr[1]);
    if(flag && flagKVS && flagFC){
    }else{
    	resultString += "Oder06,";
    	resultString += "\n";
    }
    lg.writeLog("Result.txt", "********************" + "Front Counter #06 End" + "********************");
    lg.writeLog("Result.txt", "\n");
    String receipt = util.copyReceipt(order6_Id);
    System.out.println(receipt);*/
}

public static void FrontCounter07(){
	
	Click_POS figure = new Click_POS();
	Logging lg = new Logging();
	lg.createFolder("Log");
	lg.createFile("Log.txt");
	lg.createFile("Result.txt");
    lg.writeLog("Result.txt", "********************" + "Front Counter #07" + "********************");
	Click_POS.productcodes = "";
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part07"+"********************");
	figure.bigMac_Meal();
	figure.eat_In_Total();
	figure.tag_8();
	figure.tag_Enter();
	waitOneSecond();
	figure.extract_Cash();
	figure.extract_Cash();
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part07 End"+"********************");
	lg.writeLog("Log.txt", "\n");
	System.out.println("This is what I want : " + Click_POS.productcodes);
    
/*//Validate KVS
	new SwitchWindow().switchWindow();
	boolean flagKVS = valiadte(myKVS07, observeTime, "07", timePause);
//Validate FC
    new SwitchWindow().switchWindow();
    boolean flagFC = valiadteFC(myFC07, observeTime, "07", timePause);
    new SwitchWindow().switchWindow();
    
	Util util = new Util();
    //figure.Sever_KVS31_FC();
	String order7_Id = util.getOrderId();
    util.calculatePrice(Click_POS.productcodes, "EI");
    String[] order7_strArr = util.calculateSalesTax().split(";");
    boolean flag = util.validateAmountTax(order7_Id, order7_strArr[0], order7_strArr[1]);
    if(flag && flagKVS && flagFC){
    }else{
    	resultString += "Oder07,";
    	resultString += "\n";
    }
    lg.writeLog("Result.txt", "********************" + "Front Counter #07 End" + "********************");
    lg.writeLog("Result.txt", "\n");
    String receipt = util.copyReceipt(order7_Id);
    System.out.println(receipt);*/
}

public static void FrontCounter08(){
	
	Click_POS figure = new Click_POS();
	Logging lg = new Logging();
	lg.createFolder("Log");
	lg.createFile("Log.txt");
	lg.createFile("Result.txt");
	lg.writeLog("Result.txt", "********************" + "Front Counter #08" + "********************");
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part08"+"********************");
	figure.lunchButton();
	figure.large_Button();
	waitOneSecond();
	figure.Ckn_Cpy();
	figure.eat_In_Total();
	waitOneSecond();
	figure.diet_Coke();
	Click_POS.productcodes = "";
	Click_POS.productcodes += "4780";
	Click_POS.productcodes += ";";
	figure.tag_8();
	figure.tag_Enter();
	waitOneSecond();
	figure.extract_Cash();
	figure.extract_Cash();
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part08 End"+"********************");
	lg.writeLog("Log.txt", "\n");
	System.out.println("This is what I want : " + Click_POS.productcodes);

/*//Validate KVS
	new SwitchWindow().switchWindow();
	boolean flagKVS = valiadte(myKVS08, observeTime, "08", timePause);
//Validate FC
    new SwitchWindow().switchWindow();
    boolean flagFC = valiadteFC(myFC08, observeTime, "08", timePause);
    new SwitchWindow().switchWindow();
    
	Util util = new Util();
    //figure.Sever_KVS31_FC();
	String order8_Id = util.getOrderId();
    util.calculatePrice(Click_POS.productcodes, "EI");
    String[] order8_strArr = util.calculateSalesTax().split(";");
    boolean flag = util.validateAmountTax(order8_Id, order8_strArr[0], order8_strArr[1]);
    if(flag && flagKVS && flagFC){
    }else{
    	resultString += "Oder08,";
    	resultString += "\n";
    }
    lg.writeLog("Result.txt", "********************" + "Front Counter #08 End" + "********************");
    lg.writeLog("Result.txt", "\n");
    String receipt = util.copyReceipt(order8_Id);
    System.out.println(receipt);*/
}

public static void FrontCounter09(){
	Click_POS figure = new Click_POS();
	Logging lg = new Logging();
	lg.createFolder("Log");
	lg.createFile("Log.txt");
	lg.createFile("Result.txt");
	lg.writeLog("Result.txt", "********************" + "Front Counter #09" + "********************");
	Click_POS.productcodes = "";
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part09"+"********************");
	figure.Egg_McMuffin();
	figure.orange_Hic();
	figure.condiment_Gifts();
	figure.condiment_Gifts_Selected();
	 waitOneSecond();
	figure.Gift_Cert_5();
	figure.take_Out_Total();
	waitOneSecond();
	figure.extract_Cash();
	figure.extract_Cash();
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part09 End"+"********************");
	lg.writeLog("Log.txt", "\n");
	System.out.println("This is what I want : " + Click_POS.productcodes);
	
/*//Validate KVS
	new SwitchWindow().switchWindow();
	boolean flagKVS = valiadte(myKVS09, observeTime, "09", timePause);
//Validate FC
    new SwitchWindow().switchWindow();
    boolean flagFC = valiadteFC(myFC09, observeTime, "09", timePause);
    new SwitchWindow().switchWindow();
    
	Util util = new Util();
    //figure.Sever_KVS31_FC();
	String order9_Id = util.getOrderId();
    util.calculatePrice(Click_POS.productcodes, "TO");
    String[] order9_strArr = util.calculateSalesTax().split(";");
    boolean flag = util.validateAmountTax(order9_Id, order9_strArr[0], order9_strArr[1]);
    if(flag && flagKVS && flagFC){
    }else{
    	resultString += "Oder09,";
    	resultString += "\n";
    }
    lg.writeLog("Result.txt", "********************" + "Front Counter #09 End" + "********************");
    lg.writeLog("Result.txt", "\n");
    String receipt = util.copyReceipt(order9_Id);
    System.out.println(receipt);*/
}

public static void FrontCounter10(){
	Click_POS figure = new Click_POS();
	Logging lg = new Logging();
	lg.createFolder("Log");
	lg.createFile("Log.txt");
	lg.createFile("Result.txt");
	lg.writeLog("Result.txt", "********************" + "Front Counter #10" + "********************");
	Click_POS.productcodes = "";
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part10"+"********************");
	figure.hotCake();
	figure.hotCake();
	waitOneSecond();
	figure.bigMac_Meal();
	waitOneSecond();
	figure.breakfastButton();
	 waitOneSecond();
	figure.two_Hash();
	figure.take_Out_Total();
	waitOneSecond();
	figure.extract_Cash();
	figure.extract_Cash();
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part10 End"+"********************");
	lg.writeLog("Log.txt", "\n");
	System.out.println("This is what I want : " + Click_POS.productcodes);
	
/*//Validate KVS
	new SwitchWindow().switchWindow();
	boolean flagKVS = valiadte(myKVS10, observeTime, "10", timePause);
//Validate FC
    new SwitchWindow().switchWindow();
    boolean flagFC = valiadteFC(myFC10, observeTime, "10", timePause);
    new SwitchWindow().switchWindow();
    
	Util util = new Util();
    //figure.Sever_KVS31_FC();
	String order10_Id = util.getOrderId();
    util.calculatePrice(Click_POS.productcodes, "TO");
    String[] order10_strArr = util.calculateSalesTax().split(";");
    boolean flag = util.validateAmountTax(order10_Id, order10_strArr[0], order10_strArr[1]);
    if(flag && flagKVS && flagFC){
    }else{
    	resultString += "Oder10,";
    	resultString += "\n";
    }
    lg.writeLog("Result.txt", "********************" + "Front Counter #10 End" + "********************");
    lg.writeLog("Result.txt", "\n");
    String receipt = util.copyReceipt(order10_Id);
    System.out.println(receipt);*/
}

public static void FrontCounter11(){
	Click_POS figure = new Click_POS();
	Logging lg = new Logging();
	lg.createFolder("Log");
	lg.createFile("Log.txt");
	 lg.createFile("Result.txt");
	    lg.writeLog("Result.txt", "********************" + "Front Counter #11" + "********************");
	Click_POS.productcodes = "";
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part11"+"********************");
	figure.drinks();
	waitOneSecond();
	figure.vanilla_Shake();
	figure.lunchButton();
	figure.lunchButton_Selected();
	 waitOneSecond();
	figure.hamburger_Ham();
	figure.hamburger_Ham();
	figure.specialFunction();
	 waitOneSecond();
	figure.overring();
	figure.overring_Yes();
	figure.function_3();
	figure.function_enter();
	figure.function_3();
	figure.function_enter();
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part11 End"+"********************");
	lg.writeLog("Log.txt", "\n");
	System.out.println("This is what I want : " + Click_POS.productcodes);
    
	/*new SwitchWindow().switchWindow();
	boolean flagKVS = valiadte(myKVS11, observeTime, "11", timePause);
    new SwitchWindow().switchWindow();
    boolean flagFC = valiadteFC(myFC11, observeTime, "11", timePause);
    new SwitchWindow().switchWindow();
    
	Util util = new Util();
    //figure.Sever_KVS31_FC();
	String order11_Id = util.getOrderId();
    util.calculatePrice(Click_POS.productcodes, "EI");
    String[] order11_strArr = util.calculateSalesTax().split(";");
    boolean flag = util.validateAmountTax(order11_Id, order11_strArr[0], order11_strArr[1]);
    if(flag && flagKVS && flagFC){
    }else{
    	resultString += "Oder11,";
    	resultString += "\n";
    }
    lg.writeLog("Result.txt", "********************" + "Front Counter #11 End" + "********************");
    lg.writeLog("Result.txt", "\n");
    String receipt = util.copyReceipt(order11_Id);
    System.out.println(receipt);*/
}

public static void FrontCounter12(){
	Click_POS figure = new Click_POS();
	Logging lg = new Logging();
	lg.createFolder("Log");
	lg.createFile("Log.txt");
	lg.createFile("Result.txt");
	lg.writeLog("Result.txt", "********************" + "Front Counter #12" + "********************");
	Click_POS.productcodes = "";
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part12"+"********************");
	figure.specialFunction();
	waitOneSecond();
	figure.refund();
	figure.function_3();
	figure.function_enter();
	waitOneSecond();
	figure.function_3();
	figure.function_enter();
	figure.File_O_Fish_Meal();
	waitOneSecond();
	figure.dessert();
	figure.oreo();
	figure.take_Out_Total();
	waitOneSecond();
	figure.cash();
	/*Region region = new Region(440,400,70,70);
	region.click();*/
	
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part12 End"+"********************");
	lg.writeLog("Log.txt", "\n");
	System.out.println("This is what I want : " + Click_POS.productcodes);
	
	/*new SwitchWindow().switchWindow();
	boolean flagKVS = valiadte(myKVS12, observeTime, "12", timePause);
    new SwitchWindow().switchWindow();
    boolean flagFC = valiadteFC(myFC12, observeTime, "12", timePause);
    new SwitchWindow().switchWindow();
    
	Util util = new Util();
    //figure.Sever_KVS31_FC();
	String order12_Id = util.getOrderId();
    util.calculatePrice(Click_POS.productcodes, "TO");
    String[] order12_strArr = util.calculateSalesTax().split(";");
    boolean flag = util.validateAmountTax(order12_Id, order12_strArr[0], order12_strArr[1]);
    if(flag && flagKVS && flagFC){
    }else{
    	resultString += "Oder12,";
    	resultString += "\n";
    }
    lg.writeLog("Result.txt", "********************" + "Front Counter #12 End" + "********************");
    lg.writeLog("Result.txt", "\n");
    String receipt = util.copyReceipt(order12_Id);
    System.out.println(receipt);*/
}

public static void FrontCounter13(){
	
	Click_POS figure = new Click_POS();
	Logging lg = new Logging();
	lg.createFolder("Log");
	lg.createFile("Log.txt");
	lg.createFile("Result.txt");
	lg.writeLog("Result.txt", "********************" + "Front Counter #13" + "********************");
	Click_POS.productcodes = "";
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part13"+"********************");
	figure.Twenty_Nuggets_Meal();
	figure.take_Out_Total();
	figure.no_Tax();
	figure.function_3();
	figure.function_enter();
	figure.function_3();
	figure.function_enter();
	figure.extract_Cash();
	figure.extract_Cash();
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part13 End"+"********************");
	lg.writeLog("Log.txt", "\n");
	System.out.println("This is what I want : " + Click_POS.productcodes);

	/*new SwitchWindow().switchWindow();
	boolean flagKVS = valiadte(myKVS13, observeTime, "13", timePause);
    new SwitchWindow().switchWindow();
    boolean flagFC = valiadteFC(myFC13, observeTime, "13", timePause);
    new SwitchWindow().switchWindow();
    
	Util util = new Util();
    //figure.Sever_KVS31_FC();
	String order13_Id = util.getOrderId();
    util.calculatePrice(Click_POS.productcodes, "TO");
    String[] order13_strArr = util.calculateSalesTax().split(";");
    boolean flag = util.validateAmountTax(order13_Id, order13_strArr[4], order13_strArr[4]);
    if(flag && flagKVS && flagFC){
    }else{
    	resultString += "Oder13,";
    	resultString += "\n";
    }
    lg.writeLog("Result.txt", "********************" + "Front Counter #13 End" + "********************");
    lg.writeLog("Result.txt", "\n");
    String receipt = util.copyReceipt(order13_Id);
    System.out.println(receipt);*/
}

public static void FrontCounter14(){
	
	Click_POS figure = new Click_POS();
	Logging lg = new Logging();
	lg.createFolder("Log");
	lg.createFile("Log.txt");
	lg.createFile("Result.txt");
	lg.writeLog("Result.txt", "********************" + "Front Counter #14" + "********************");
	Click_POS.productcodes = "";
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part14"+"********************");
	figure.Cry_Ckn_Meal();
	figure.take_Out_Total();
	figure.coupon_Menu();
	waitOneSecond();
	figure.coupon_A();
	figure.coupon_Return();
	waitOneSecond();
	figure.extract_Cash();
	figure.extract_Cash();
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part14 End"+"********************");
	lg.writeLog("Log.txt", "\n");
	System.out.println("This is what I want : " + Click_POS.productcodes);
    
	/*new SwitchWindow().switchWindow();
	boolean flagKVS = valiadte(myKVS14, observeTime, "14", timePause);
    new SwitchWindow().switchWindow();
    boolean flagFC = valiadteFC(myFC14, observeTime, "14", timePause);
    new SwitchWindow().switchWindow();
    
	Util util = new Util();
    //figure.Sever_KVS31_FC();
	String order14_Id = util.getOrderId();
    util.calculatePrice(Click_POS.productcodes, "TO");
    String[] order14_strArr = util.calculateSalesTax().split(";");
    boolean flag = util.validateAmountTax(order14_Id, order14_strArr[0], order14_strArr[1]);
    if(flag && flagKVS && flagFC){
    }else{
    	resultString += "Oder14,";
    	resultString += "\n";
    }
    lg.writeLog("Result.txt", "********************" + "Front Counter #14 End" + "********************");
    lg.writeLog("Result.txt", "\n");
    String receipt = util.copyReceipt(order14_Id);
    System.out.println(receipt);*/
}

public static void FrontCounter15(){
	Click_POS figure = new Click_POS();
	Logging lg = new Logging();
	lg.createFolder("Log");
	lg.createFile("Log.txt");
	lg.createFile("Result.txt");
	lg.writeLog("Result.txt", "********************" + "Front Counter #15" + "********************");
	Click_POS.productcodes = "";
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part15"+"********************");
	figure.Dbl_Cheese_Meal();
	figure.take_Out_Total();
	figure.crew_Meal();
	figure.function_3();
	figure.function_enter();
	waitOneSecond();
	figure.function_3();
	figure.function_enter();
	waitOneSecond();
	figure.extract_Cash();
	figure.extract_Cash();
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part15 End"+"********************");
	lg.writeLog("Log.txt", "\n");
	System.out.println("This is what I want : " + Click_POS.productcodes);
	
	/*new SwitchWindow().switchWindow();
	boolean flagKVS = valiadte(myKVS15, observeTime, "15", timePause);
    new SwitchWindow().switchWindow();
    boolean flagFC = valiadteFC(myFC15, observeTime, "15", timePause);
    new SwitchWindow().switchWindow();
    
	Util util = new Util();
    //figure.Sever_KVS31_FC();
	String order15_Id = util.getOrderId();
    util.calculatePrice(Click_POS.productcodes, "TO");
    String[] order15_strArr = util.calculateSalesTax().split(";");
    boolean flag = util.validateAmountTax(order15_Id, order15_strArr[0], order15_strArr[1]);
    if(flag && flagKVS && flagFC){
    }else{
    	resultString += "Oder15,";
    	resultString += "\n";
    }
    lg.writeLog("Result.txt", "********************" + "Front Counter #15 End" + "********************");
    lg.writeLog("Result.txt", "\n");
    String receipt = util.copyReceipt(order15_Id);
    System.out.println(receipt);*/
}

public static void FrontCounter16(){
	Click_POS figure = new Click_POS();
	Logging lg = new Logging();
	lg.createFolder("Log");
	lg.createFile("Log.txt");
	lg.createFile("Result.txt");
	lg.writeLog("Result.txt", "********************" + "Front Counter #16" + "********************");
	Click_POS.productcodes = "";
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part16"+"********************");
	figure.Dbl_Cheese_Meal();
	figure.take_Out_Total();
	figure.manager_Meal();
	figure.function_3();
	figure.function_enter();
	waitOneSecond();
	figure.function_3();
	figure.function_enter();
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part16 End"+"********************");
	lg.writeLog("Log.txt", "\n");
	System.out.println("This is what I want : " + Click_POS.productcodes);
	
	/*new SwitchWindow().switchWindow();
	boolean flagKVS = valiadte(myKVS16, observeTime, "16", timePause);
    new SwitchWindow().switchWindow();
    boolean flagFC = valiadteFC(myFC16, observeTime, "16", timePause);
    new SwitchWindow().switchWindow();
    
	Util util = new Util();
    //figure.Sever_KVS31_FC();
	String order16_Id = util.getOrderId();
    util.calculatePrice(Click_POS.productcodes, "TO");
    String[] order16_strArr = util.calculateSalesTax().split(";");
    boolean flag = util.validateAmountTax(order16_Id, order16_strArr[0], order16_strArr[1]);
    if(flag && flagKVS && flagFC){
    }else{
    	resultString += "Oder16,";
    	resultString += "\n";
    }
    lg.writeLog("Result.txt", "********************" + "Front Counter #16 End" + "********************");
    lg.writeLog("Result.txt", "\n");
    String receipt = util.copyReceipt(order16_Id);
    System.out.println(receipt);*/
}

public static void FrontCounter17(){
	Click_POS figure = new Click_POS();
	Logging lg = new Logging();
	lg.createFolder("Log");
	lg.createFile("Log.txt");
	lg.createFile("Result.txt");
	lg.writeLog("Result.txt", "********************" + "Front Counter #17" + "********************");
	Click_POS.productcodes = "";
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part17"+"********************");
	figure.bigMac_Meal();
	waitOneSecond();
	figure.drinks();
	figure.straw_Shake();
	figure.take_Out_Total();
	waitOneSecond();
	figure.billable_Sales();
	figure.function_3();
	figure.function_enter();
	waitOneSecond();
	figure.function_3();
	figure.function_enter();
	lg.writeLog("Log.txt", "********************"+"FC Normal Order Taking Operations Part17 End"+"********************");
	lg.writeLog("Log.txt", "\n");
	System.out.println("This is what I want : " + Click_POS.productcodes);
	
	/*new SwitchWindow().switchWindow();
	boolean flagKVS = valiadte(myKVS17, observeTime, "17", timePause);
    new SwitchWindow().switchWindow();
    boolean flagFC = valiadteFC(myFC17, observeTime, "17", timePause);
    new SwitchWindow().switchWindow();
    
	Util util = new Util();
    //figure.Sever_KVS31_FC();
	String order17_Id = util.getOrderId();
    util.calculatePrice(Click_POS.productcodes, "TO");
    String[] order17_strArr = util.calculateSalesTax().split(";");
    boolean flag = util.validateAmountTax(order17_Id, order17_strArr[0], order17_strArr[1]);
    if(flag && flagKVS && flagFC){
    }else{
    	resultString += "Oder17,";
    	resultString += "\n";
    }
    lg.writeLog("Result.txt", "********************" + "Front Counter #17 End" + "********************");
    lg.writeLog("Result.txt", "\n");
    String receipt = util.copyReceipt(order17_Id);
    System.out.println(receipt);*/
}

public static void logOut(){
	
    	Click_POS figure = new Click_POS();
    	figure.log_Out();
    }

public static void waitOneSecond(){ 
	   try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   
public static void waitTwoSecond(){ 
	   try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   
public static void waitThreeSecond(){
	   try {
		Thread.sleep(timePause);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   
public static String getTimeStamp(){
	    SimpleDateFormat sdf = null;
       sdf = new SimpleDateFormat("yyyy/MM/dd/HH:mm:ss");
       String timeStamp = sdf.format(new Date());
       return timeStamp;
   }
    
public static boolean valiadte(String imgPath, int observeTime, String orderNum, int timePause){
	   
	    waitTwoSecond();
	    Logging lg = new Logging();
	    lg.createFolder("Log");
	    lg.createFile("Result.txt");
	    Region r1 = new Region(0,0,1016,740);
	  //  r1.saveScreenCapture(desktopPath);
		r1.onAppear(imgPath);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot(orderNum);
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] KVS_ScreenShot" + orderNum + " is detected");
			r1.stopObserver();
			System.out.println("KVS_ScreenShot" + orderNum + " is found");
			try {
				r1.click(imgPath);
			} catch (FindFailed e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] KVS_ScreenShot" + orderNum + " not found");
			System.out.println("ScreenShot" + orderNum + " not found");
		}
		waitOneSecond();
		return flag1;
   }
   
public static boolean valiadteFC(String imgPath, int observeTime, String orderNum, int timePause){
	   
	    waitTwoSecond();
	    Logging lg = new Logging();
	    lg.createFolder("Log");
	    lg.createFile("Result.txt");
	    Region r1 = new Region(0,0,1016,740);
		r1.onAppear(imgPath);
		boolean flag1 = r1.observe(observeTime);
		if(flag1){
			Util.getScreenShot(orderNum);
			lg.writeLog("result.txt", getTimeStamp() + "[Pass] FC_ScreenShot" + orderNum + " is detected");
			r1.stopObserver();
			System.out.println("FC_ScreenShot" + orderNum + " is found");
			try {
				r1.click(imgPath);
			} catch (FindFailed e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			lg.writeLog("result.txt", getTimeStamp() + "[Fail] FC_ScreenShot" + orderNum + " not found");
			System.out.println("FC_ScreenShot" + orderNum + " not found");
		}
		waitOneSecond();
		return flag1;
  }
}