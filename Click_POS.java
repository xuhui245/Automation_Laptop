/**
    * Copyright
    * All right reserved.
    * @author: Xuhui Jiang
    * date: 2017-3-8
    */

//Click each icon on the register panel
package automation;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import automation.Logging;

public class Click_POS {
	
	public String Two_PK_Hash = "3809";
	public String Five_Gift_Cert = "937";
	public String Six_Nuggets = "60";
	public String Twenty_Nuggets = "61";
	public String APSLC = "2794";
	public String BBQCUP = "900";
	public String BECBIS5 = "";
	public String BIGMAC1S = "5";
	public String Coke = "520";
	public String Dbl_Cheese = "4";
	public String Diet_Coke = "651";
	public String Egg_McMuffin = "46";
	public String Filet_O_Fish = "5926";
	public String Hamburger_Ham = "1";
	public String HotCake = "31";
	public String HotCake_Sauage = "32";
	public String Iced_Tea = "50";
	public String Orange_Hic = "620";
	public String Oreo = "3832";
	public String QTR_Ham = "6";
	public String Sprite = "720";
	public String Straw_Shake = "1511";
	public String Under_3Toy = "5323";
	public String USA_TODAY = "8072";
	public String Vanilla_Shake = "1598";
	public String BigMac_Meal = "8936";
	public String HappyMeal_Ham = "6975";
	public String Filet_O_Fish_Meal = "8944";
	public String Twenty_Nuggets_Meal = "8956";
	public String Cry_Ckn_Meal = "4780";
	public String Dbl_Cheese_Meal = "6243";
	public String Coupon_A = "123";
	public String Crew_Meal = "345";
	public String Manager_Meal = "567";
	Logging lg = new Logging();
	Screen screen = new Screen();
	public static String productcodes = "";
	
	public void function_0(){//fixed images only
		
		pressButtons("manager_0", "manager_0");
	}
	public void function_1(){//fixed

		pressButtons("manager_1", "manager_1");
		
	}
	public void function_2(){//fixed

		pressButtons("manager_2", "manager_2");
	}	
	public void function_3(){//fixed

		pressButtons("manager_3", "manager_3");
		
	}	
	public void function_4(){//fixed

		pressButtons("manager_4", "manager_4");
	}	
	public void function_5(){//fixed

		pressButtons("manager_5", "manager_5");
	}
	public void function_6(){//fixed

		pressButtons("manager_6", "manager_6");
	}
    public void function_7(){//fixed

		pressButtons("manager_7", "manager_7");
	}
	public void function_8(){//fixed

		pressButtons("manager_8", "manager_8");
	}
	public void function_9(){//fixed

		pressButtons("manager_9", "manager_9");
	}
	public void tag_0(){//fixed
			
		pressButtons("Tag_0", "Tag_0");
	}
	public void tag_1(){//fixed
		
		pressButtons("Tag_1", "Tag_1");
	}
	public void tag_2(){//fixed
		
		pressButtons("Tag_2", "Tag_2");
	}
	public void tag_3(){//fixed
		
		pressButtons("Tag_3", "Tag_3");
	}
	public void tag_4(){//fixed
			
		pressButtons("Tag_4", "Tag_4");
	}
	public void tag_5(){//fixed
			
		pressButtons("Tag_5", "Tag_5");
	}
	public void tag_6(){//fixed
		
		pressButtons("Tag_6", "Tag_6");
	}
	public void tag_7(){//fixed
		
		pressButtons("Tag_7", "Tag_7");
	}
	public void tag_8(){//fixed
		
		pressButtons("Tag_8", "Tag_8");
	}
	public void tag_9(){//fixed
		
		pressButtons("Tag_9", "Tag_9");
	}
	public void no_Tax(){
		
		pressButtons("G1_NOTAX", "No_Tax");
	}
	public void billable_Sales(){
	
		pressButtons("B1_BillableSales2", "Billable_Sales");
	}
	public void tag_Clear(){
			
		pressButtons("Clear3", "Tag_Clear");
	}
	public void tag_Enter(){
	
		pressButtons("Enter3", "Tag_Enter");
	}
    public void function_enter(){//fixed

    	pressButtons("managere", "managere");
    }
    public void manager_option(){
    	
    	pressButtons("R1_MGR", "manager");
    }
    public void specialFunction(){
    	
    	pressButtons("R1_SPCFN", "SpecialFunctions");
    }
    public void overring(){
   
    	pressButtons("Overring", "Overring");
    }
    public void crew_Meal(){

    	pressButtons("B1_CRWML", "CrewMeal");
    	productcodes += Crew_Meal;
		productcodes += ";";
    }
    public void manager_Meal(){
    	
    	pressButtons("B1_MGRML", "Manager_Meal");
    	productcodes += Manager_Meal;
	    productcodes += ";";
    }
    public void discount_Meal(){
    	
    	pressButtons("G1_DSCNTMN", "Discount_Menu");
    }
    public void refund(){
    
    	pressButtons("Refund", "Refund");
    }
    public void coupon_Menu(){
    	
    	pressButtons("G1_CPNMN", "Coupon_Menu");
    }
    public void coupon_A(){
    	
    	pressButtons("coupon_a", "Coupon_A");
    	productcodes += Coupon_A;
		productcodes += ";";
    }
    public void discount_10(){
    	
    	pressButtons("G1_10OFF", "Discount_10");
    }    
    public void coupon_Return(){
    	
    	pressButtons("return", "coupon_Return");
    }
    public void discount_Return(){
    	
    	pressButtons("return", "Discount_Return");
    }
    public void overring_Yes(){
    	
    	pressButtons("Overring_Yes", "Overring_Yes");
    }
    public void logInCashierFC(){
    	
    	pressButtons("logincashierfc", "Log_In_CashierFC");
    }
    public void logInEnter(){
    	
    	pressButtons("btn_cen", "Log_In_Enter");
    }
    public void logInYes(){//fixed
    
    	pressButtons("Log_In_Yes", "Log_In_Yes");
    }
    public void specialFunctionReturn(){
    	
    	pressButtons("return", "specialFuncreturn");
    }
    public void breakfastButton(){
    	
    	pressButtons("MenuPage_Brkfast3", "Breakfast");
    }
    public void breakfastButton_Selected(){
    	
    	pressButtons("MenuPage_Brkfast2", "Breakfast_selected");
    }
    public void lunchButton(){
   
    	pressButtons("MenuPage_Lunch3", "Lunch");
    }
    public void lunchButton_Selected(){
    	
    	pressButtons("MenuPage_Lunch1", "Lunch_Selected");
    }
    public void dessert(){
    	
    	pressButtons("MenuPage_DESSERT3", "Dessert");
    }
    public void happy_Meal(){
    
    	pressButtons("MenuPage_HM_Bday3", "Happy_Meal");
    }
    public void drinks(){
    	
    	pressButtons("MenuPage_Drinks", "Drinks");
    }
    public void condiment_Gifts(){
    	
    	pressButtons("MenuPage_CondimentsGifts", "Condiments_Gifts");
    } 
    public void condiment_Gifts_Selected(){

    	pressButtons("MenuPage_CondimentsGifts_Condiments_H", "Condiments_Gifts_Selected");
    } 
    public void eat_In_Total(){
    	
    	pressButtons("BL_EITOT", "Eat_In_Total");
    }
    public void take_Out_Total(){
    	
    	pressButtons("BL_TOTOT", "Take_Out_Total");
    }
    public void extract_Cash(){
    	
    	pressButtons("G1_Exact Cash", "Extract_Cash");
    }
    public void small_Button(){
    	
    	pressButtons("Y1_SMLL", "Small_Button");
    }
    public void medium_Button(){
    	
        pressButtons("Y1_MEDM", "Medium_Button");	
    }
    public void large_Button(){
    	
    	pressButtons("Y1_LARGE", "Large_Button");
    }
    public void grill_Button(){
    	
    	pressButtons("G1_GRLL", "Grill_Button");
    }
    public void grill_Done(){
    	
    	pressButtons("G1_DONE", "Grill_Done");
    }
    public void coke(){
    	
    	pressButtons("D_COKE", "Coke");
    	productcodes += Coke;
		productcodes += ";";
    }
    public void diet_Coke(){
  
    	pressButtons("D_DCOKE", "Diet_Coke");
    	productcodes += Diet_Coke;
		productcodes += ";";
    }
    public void iced_Tea(){
    	
    	pressButtons("D_ICTEA", "Iced_Tea");
    	productcodes += Iced_Tea;
		productcodes += ";";
    }
    public void sprite(){
    	
    	pressButtons("D_SPRT", "Sprite");
    	productcodes += Sprite;
		productcodes += ";";
    }
    public void orange_Hic(){
    	
    	pressButtons("D_ORHIC", "Orange_Hic");
    	productcodes += Orange_Hic;
		productcodes += ";";
    }
    public void Egg_McMuffin(){
    		
    	pressButtons("EMCMUF1", "Egg_McMuffin");
    	productcodes += Egg_McMuffin;
		productcodes += ";";
    }
    public void BIGMAC1S(){
    		
    	pressButtons("BIGMAC1S", "Big_Mac");
    	productcodes += BIGMAC1S;
		productcodes += ";";
    }
    public void Hamburger(){
    	
    	pressButtons("HmbrgrHM", "Hamburger");
    }
    public void APSLC(){
    	
    	pressButtons("APSLC", "Apple_Slices");
    	productcodes += APSLC;
		productcodes += ";";
    }
    public void grill_PageDown(){
    	
    	pressButtons("down", "Grill_pageDown");
    }
    public void under_3_Toy(){
    	
    	pressButtons("TODLRTOY", "Under_3_Toy");
    }
    public void HotCakes_Sauage(){
    	
    	pressButtons("HOTCAKES_W_SAUS", "HotCakes&Sauage");
    	productcodes += HotCake_Sauage;
		productcodes += ";";
    }
    public void Usa_Today(){
    		
    	pressButtons("PAPERUS", "USA_TODAY");
    	productcodes += USA_TODAY;
		productcodes += ";";
    }
    public void Gift_Cert_5(){
    	
    	pressButtons("G1_5GIFT", "5_Gift_Cert");
    	productcodes += Five_Gift_Cert;
		productcodes += ";";
    }
    public void QTR_Ham(){
    		
    	pressButtons("QTRHAM", "QTR_Ham");
    	productcodes += QTR_Ham;
		productcodes += ";";
    }
    public void BECBIS5(){
    	
    	pressButtons("BECBIS5", "BEC_Biscuit");
    }
    public void Ckn_Cpy(){
    		
    	pressButtons("Buttermilk Crispy Chicken - 5", "Ckn_Cpy");
    }
    public void hotCake(){
    
    	pressButtons("HOTCKS", "HotCake");
    	productcodes += HotCake;
		productcodes += ";";
    }
    public void sE_Biscuit(){
    		
    	pressButtons("SEBIS6", "SE_Biscuit");
    }
    public void two_Hash(){
    	
    	pressButtons("2HASHBN", "2_PK_Hash");
    	productcodes += Two_PK_Hash;
		productcodes += ";";
    }
    public void vanilla_Shake(){
    	
    	pressButtons("ShakeVanCC", "Vanilla_Shake");
    	productcodes += Vanilla_Shake;
		productcodes += ";";
    }
    public void hamburger_Ham(){
  
    	pressButtons("HAMB", "Hamburger_Ham");
    	productcodes += Hamburger_Ham;
		productcodes += ";";
    }
    public void filet_O_Fish(){
   	
    	pressButtons("Filet O Fish - 8", "Filet_O_Fish");
    	productcodes += Filet_O_Fish;
		productcodes += ";";
    }
    public void oreo(){
    	
    	pressButtons("FLRRYO", "Oreo");
    	productcodes += Oreo;
		productcodes += ";";
    }
    public void straw_Shake(){
    		
    	pressButtons("ShakeStrawCC", "Straw_Shake");
    	productcodes += Straw_Shake;
		productcodes += ";";
    }
    public void cash(){
    		
    	pressButtons("cash", "Cash");
    }
    public void Twenty_Nuggets(){
    		
    	pressButtons("20NUG", "20_Nuggets");
    	productcodes += Twenty_Nuggets;
		productcodes += ";";
    }
    public void Six_Nuggets(){
    	
    	pressButtons("6NUG", "6_Nuggets");
    	productcodes += Six_Nuggets;
		productcodes += ";";
    }
    public void BBQCUP(){
    	
    	pressButtons("BBQCUP", "BBQ_Sause");
    }
    public void dbl_Cheese(){
    	
    	pressButtons("DBLCHS", "Dbl_Cheese");
    	productcodes += Dbl_Cheese;
		productcodes += ";";
    }
    public void bigMac_Meal(){
    		
    	pressButtons("MenuPage_Lunch3", "Lunch");
    	waitOneSecond();
    	pressButtons("Y1_MEDM", "Medium_Button");
    	pressButtons("BIGMAC1S", "Big_Mac");
    	waitOneSecond();
    	pressButtons("D_COKE", "Coke");
    	productcodes += BigMac_Meal;
		productcodes += ";";
    }
    public void Hamburger_HappyMeal(){
              
            pressButtons("MenuPage_HM_Bday3", "Happy_Meal");
            waitOneSecond();
            pressButtons("HmbrgrHM", "Hamburger");
            waitOneSecond();
            pressButtons("APSLC", "Apple_Slices");
            pressButtons("TODLRTOY", "Under_3_Toy");
            pressButtons("D_COKE", "Coke");
            productcodes += HappyMeal_Ham;
			productcodes += ";";
    }
    public void File_O_Fish_Meal(){
    	
    	pressButtons("MenuPage_Lunch3", "Lunch");
    	waitOneSecond();
    	pressButtons("Y1_MEDM", "Medium_Button");
    	pressButtons("Filet O Fish - 8", "Filet_O_Fish");
    	pressButtons("Y1_LARGE", "Large_Button");
    	pressButtons("D_ORHIC", "Orange_Hic");
		productcodes += Filet_O_Fish_Meal;
		productcodes += ";";
    }
    public void Twenty_Nuggets_Meal(){
    	
    	pressButtons("MenuPage_Lunch3", "Lunch");
    	waitOneSecond();
    	pressButtons("MenuPage_Lunch1", "Lunch_Selected");
    	waitOneSecond();
    	pressButtons("Y1_MEDM", "Medium_Button");
    	pressButtons("20NUG", "20_Nuggets");
    	pressButtons("BBQCUP", "BBQ_Sause");
    	pressButtons("BBQCUP", "BBQ_Sause");
    	pressButtons("BBQCUP", "BBQ_Sause");
    	pressButtons("Y1_LARGE", "Large_Button");
    	pressButtons("D_ICTEA", "Iced_Tea");
    	productcodes += Twenty_Nuggets_Meal;
		productcodes += ";";
    	
    }
    public void Cry_Ckn_Meal(){
    	
    	pressButtons("MenuPage_Lunch3", "Lunch");
    	waitOneSecond();
    	pressButtons("Y1_LARGE", "Large_Button");
    	pressButtons("Buttermilk Crispy Chicken - 5", "Ckn_Cpy");
    	pressButtons("Y1_LARGE", "Large_Button");
    	pressButtons("D_DCOKE", "Diet_Coke");
		productcodes += Cry_Ckn_Meal;
		productcodes += ";";
    }
    public void Dbl_Cheese_Meal(){
    	
    	pressButtons("MenuPage_Lunch3", "Lunch");
    	waitOneSecond();
    	pressButtons("Y1_LARGE", "Large_Button");
    	pressButtons("DBLCHS", "Dbl_Cheese");
    	pressButtons("Y1_LARGE", "Large_Button");
    	pressButtons("D_DCOKE", "Diet_Coke");
    	productcodes += Dbl_Cheese_Meal;
		productcodes += ";";
    }
    
    public void Sever_KVS31_FC(){
    	
          try {
			screen.click("images/R1_SPCFN.png");
			screen.click("images/softbump.png");
			screen.click("images/selectkvs.png");
			screen.click("images/Kitchen_Lunch_S1.png");
			screen.click("images/Select_KVS_OK.png");
			screen.click("images/Serve.png");
			
			screen.click("images/selectkvs.png");
 			screen.click("images/Front_Counter.png");
 			screen.click("images/Select_KVS_OK.png");
 			screen.click("images/Serve.png");
 			screen.click("images/return.png");
 			screen.click("images/return.png");
			
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + "Items might be wrong in Bump Serve");
			e.printStackTrace();
			//System.exit(0);
		}
    }
    
    public void log_Out(){
    	
    	pressButtons("R1_MGR", "manager");
    	pressButtons("manager_3", "manager_3");
    	pressButtons("managere", "managere");
    	pressButtons("manager_3", "manager_3");
    	pressButtons("managere", "managere");
    	waitOneSecond();
    	pressButtons("cashout_drawer", "cash_out");
    	pressButtons("Log_In_Yes", "Log_In_Yes");
    	pressButtons("return", "return");
    }
    
    public void waitOneSecond(){
    	
    	try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public void pressButtons(String img1, String img2){
    	
    	try {
    		lg.createFolder("Log");
			lg.createFile("Log.txt");
			if(screen.exists("images/" + img1) != null){
			screen.click("images/" + img1 + ".png");
			lg.writeLog("Log.txt", "[Log]" + img1 + " is seleced");
			}else{
			screen.click("fixedImages/" + img2 + ".png");
			lg.writeLog("Log.txt", "[Log\\]" + img2 + " is seleced");
			}
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			lg.writeLog("Log.txt", "[Error]" + img1 +" not found");
			e.printStackTrace();
		}
    }
}

