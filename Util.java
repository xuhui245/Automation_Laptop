/**
    * Copyright
    * All right reserved.
    * @author: Xuhui Jiang
    * date: 2017-3-8
    */

//Package includes Utility and methods like "calculatePrice" "calculateTax"
package automation;

import automation.Logging;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import javax.swing.filechooser.FileSystemView;

import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;
import org.sikuli.basics.Settings;

public class Util {

//parameters from outside file
	String Manager_id = "";
	String Manager_Password = "";
	String Crew_id = "";
	String Crew_Password = "";
	String Tax1 = "";
	String Tax2 = "";
	String Sales_Tax_Seq = "";
	String Region = "";
	String receiptTax1LineText = "";
	String receiptTax2LineText = "";
	String Currency = "";
	String Receipt_Currency_Conversion = "";
	String row1 = "";
	String row2 = "";
	static String laptopLoadPack = "";
	static FileSystemView fsv = FileSystemView.getFileSystemView(); 
	static String desktopPath = fsv.getHomeDirectory().toString();
	double taxTotal;
	double nonTaxTotal;
	double tax1total;
	double tax2total;
	int localTaxExempt = 0;
	int count = 0;
	int regx = 5;
	int regy = 25;
	int regh = 305;
	int regw = 420;
//Screenshot size	
	public static int regx1 = 0;
	public static int regy1 = 0;
	public static int regw1 = 520;
	public static int regh1 = 200;
	
	static String savePath = desktopPath + "\\Automation\\KVS_ScreenShot";
    public String path = desktopPath + "\\Automation\\Input_Variable.txt";
	public String reprintPath = desktopPath + "\\" + laptopLoadPack + "\\OutPutFiles01\\Reprint61";
	public String originalScreenShots = desktopPath + "\\Automation";
	public String POSReceiptpath = desktopPath + "\\Automation\\Result\\out";  //Automation_Result
	public String receiptDes = desktopPath + "\\Automation\\Result\\out\\Receipts";

//Hashmap for products and prices
	static Map<String,String> priceHash = new HashMap<String, String>();
    
	public void ReadXml(){
		
	File file = new File(path);
	InputStreamReader reader = null;
	try {
		reader = new InputStreamReader(new FileInputStream(file));
	    BufferedReader br = new BufferedReader(reader);
		String line = br.readLine();
		while(line != null){
			
			String[] split = line.split(":");
			if(split.length == 2 && split[1] != ""){

				if(split[0].equals("Manager id")){
					Manager_id = split[1];
				}
				if(split[0].equals("Manager Password")){
					Manager_Password = split[1];
				}
				if(split[0].equals("Crew id")){
					Crew_id = split[1];
				}
				if(split[0].equals("Crew Password")){
					Crew_Password = split[1];
				}
				if(split[0].equals("Tax1")){
					Tax1 = split[1];
				}
				if(split[0].equals("Tax2")){
					Tax2 = split[1];
				}
				if(split[0].equals("Sales Tax Seq")){
					Sales_Tax_Seq = split[1];
				}
				if(split[0].equals("Region")){
					Region = split[1];
				}
				if(split[0].equals("receiptTax1LineText")){
					receiptTax1LineText = split[1];
				}
				if(split[0].equals("receiptTax2LineText")){
					receiptTax2LineText = split[1];
				}
				if(split[0].equals("Currency")){
					Currency = split[1];
				}
				if(split[0].equals("Receipt_Currency_Conversion")){
					Receipt_Currency_Conversion = split[1];
				}
				if(split[0].equals("row1")){
					row1 = split[1];
				}
				if(split[0].equals("row2")){
					row2 = split[1];
				}
				if(split[0].equals("LaptopLoadPackage")){
					laptopLoadPack = split[1];
					reprintPath = desktopPath + "\\" + laptopLoadPack + "\\OutPutFiles01\\Reprint61";
				}
			}
			line = br.readLine();
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

	public static void getpriceHash(){
		
		String priceDic = " '1':'0.89;ALWAYS;0.89;ALWAYS', '4':'1.69;ALWAYS;1.69;ALWAYS', '5':'3.99;ALWAYS;3.99;ALWAYS', "
				+ "'31':'2.49;ALWAYS;2.49;ALWAYS', '32':'2.99;ALWAYS;2.99;ALWAYS', '6':'3.69;ALWAYS;3.69;ALWAYS',"
				+ "'60':'2.79;ALWAYS;2.79;ALWAYS', '61':'5.00;ALWAYS;5.00;ALWAYS','2794':'0.50;ALWAYS;0.50;ALWAYS',"
				+ "'1598':'2.69;ALWAYS;2.69;ALWAYS', '520':'1.00;ALWAYS;1.00;ALWAYS', '651':'1.00;ALWAYS;1.00;ALWAYS',"
				+ "'46':'3.19;ALWAYS;3.19;ALWAYS', '5926':'3.89;ALWAYS;3.89;ALWAYS', '913':'0.30;ALWAYS;0.30;ALWAYS',"
				+ "'50':'1.00;ALWAYS;1.00;ALWAYS', '620':'1.00;ALWAYS;1.00;ALWAYS','3832':'2.59;ALWAYS;2.59;ALWAYS',"
				+ "'720':'1.00;ALWAYS;1.00;ALWAYS', '1513':'2.69;ALWAYS;2.69;ALWAYS', '8072':'2.00;ALWAYS;2.00;ALWAYS',"
				+ "'3809':'1.39;ALWAYS;1.39;ALWAYS', '937':'5.00;NEVER;5.00;NEVER', '6063':'0.30;ALWAYS;0.30;ALWAYS',"
				+ "'8936':'5.99;ALWAYS;5.99;ALWAYS','6975':'2.99;ALWAYS;2.99;ALWAYS', '4780':'7.19;ALWAYS;7.19;ALWAYS',"
				+ "'8944':'5.89;ALWAYS;5.89;ALWAYS', '8956':'7.79;ALWAYS;7.79;ALWAYS', '3908':'0.40;ALWAYS;0.40;ALWAYS', "
				+ "'345':'0.50;ALWAYS;0.50;ALWAYS','123':'0.39;ALWAYS;0.39;ALWAYS','6243':'4.89;ALWAYS;4.89;ALWAYS',"
				+ "'567':'0.00;ALWAYS;0.00;ALWAYS', '1511':'2.69;ALWAYS;2.69;ALWAYS'";
		priceDic = priceDic.replaceAll("'", "");
		String[] tmp = priceDic.split(",");
		for(int i = 0; i < tmp.length; i++){
			String tmpKey = tmp[i].split(":")[0].trim();
			String tmpValue = tmp[i].split(":")[1].trim();
			priceHash.put(tmpKey, tmpValue);
		}
	}
	
	public void calculatePrice(String productcodes, String orderType){
		
		taxTotal = 0.00;
		nonTaxTotal = 0.00;
		String productCodes = productcodes;
			String[] productCodesArr = productCodes.split(";");
			int i = 0;
			while(i < productCodesArr.length){
				String str1 = getPrice(productCodesArr[i], orderType);
				String[] strArr2 = str1.split(";");
				if(strArr2[1].equals("ALWAYS")){
					if(productCodesArr[i].equals("123")){
					taxTotal = taxTotal - castDouble(strArr2[0]);
					}else if(productCodesArr[i].equals("345")){
					double tmpTaxTotal = taxTotal;
					taxTotal = (digital((tmpTaxTotal / 2), 2) > (tmpTaxTotal - digital((tmpTaxTotal / 2), 2))) ? (digital((tmpTaxTotal / 2), 2)):(tmpTaxTotal - digital((tmpTaxTotal / 2), 2));
					}else if(productCodesArr[i].equals("567")){	
					taxTotal = 0.00;	
					}else{
					taxTotal = taxTotal + castDouble(strArr2[0]);
					}
				}else{
					nonTaxTotal = nonTaxTotal + castDouble(strArr2[0]); 
				}
			i++;
			}
			
			System.out.println("taxTotal = " + appendZeroAndString(taxTotal));
			System.out.println("nonTaxTotal = " + appendZeroAndString(nonTaxTotal));
		}
	
    public String calculateSalesTax(){
		
		   tax1total = percentage(castDouble(Tax1), taxTotal);
		   tax1total = roundHalfEven(tax1total);
		   tax2total = 0.00;
		  
		  if(Sales_Tax_Seq.equals("S")){
			  tax2total = percentage(castDouble(Tax2), taxTotal+tax1total);
		  }else if(Sales_Tax_Seq.equals("P")){
			  tax2total = percentage(castDouble(Tax2), taxTotal);
		  }
		  taxTotal = roundNumbers(taxTotal);
		  nonTaxTotal = roundNumbers(nonTaxTotal);
		  tax2total = roundHalfEven(tax2total);
		  double taxSubTotal = tax1total + tax2total;
		  if( localTaxExempt == 1){
			  taxSubTotal = tax1total;
		  }
		  double subtotal = taxTotal + taxSubTotal + nonTaxTotal;
		  //  Total_Temp = subtotal;
		  System.out.println("subTotal = " + appendZeroAndString(subtotal));
		  System.out.println("taxSubTotal = " + taxSubTotal);
		  return appendZeroAndString(subtotal) + ";" + appendZeroAndString(taxSubTotal) + ";" + appendZeroAndString(tax1total) + ";" + appendZeroAndString(tax2total)
		  + ";" + appendZeroAndString(taxTotal);
		}
    
	public double roundHalfEven(double amt){
		double digitals = digital(amt, 2);
		if(divmod(amt, 0.005)[1] == 0.0 && divmod((int)((divmod(amt, 1)[1])*100),2)[1] == 0){
			if(divmod(amt, 0.010)[1] == 0.0){
				return digitals;
			}else{
				return digitals - 0.01;
			}
		}else{
			return digitals;
		}
	}
		
	public double percentage(double percent,double whole){
		return (percent*whole) / 100.0;
	}

	public double roundNumbers(double num1){
		
		String str = String.valueOf(num1);
		String[] strArr = str.split("\\.");
		if(strArr[1].length() > 2){
		String tmpStr = strArr[1].substring(2);
		tmpStr = tmpStr.replace('5', '4');
		strArr[1] = strArr[1].substring(0, 2) + tmpStr;
		}
		num1 = Double.parseDouble(strArr[0] + "." + strArr[1]);
		double numTemp = digital(num1, 2);
		return numTemp;
	}
	
	public double digital(double num, int n){ 
		double p = Math.pow(10,n);
		return Math.round(num*p) / p;	
	}
	
	public double[] divmod(double x, double n){
		double[] result = new double[2];
		result[0] = Math.floor(x/n);
		result[1] = x%n;
		return result;
	}
    public double[] divmod(double x, int n){
		double[] result = new double[2];
		result[0] = Math.floor(x/n);
		result[1] = x%n;
		return result;
	}
	public int[] divmod(int x, int n){
		int[] result = new int[2];
		result[0] = x/n;
		result[1] = x%n;
		return result;
	}
	
    public double castDouble(String string){
		return Double.parseDouble(string);
	}
    
    public String appendZeroAndString(double strNum){
    	
    	String strArr = String.valueOf(digital(strNum,2));
    	String[] sArr = strArr.split("\\.");
    	String tmpStr = sArr[1];
    	if(tmpStr.length() == 1){
    		tmpStr = tmpStr + "0";
    	}
    	sArr[1] = tmpStr;
    	return sArr[0] + "." + sArr[1];
    }

    public boolean validateAmountTax(String orderId, String subTotal, String tax){	
    	
    	Logging lg = new Logging();
    	lg.createFolder("Log");
    	lg.createFile("Result.txt");
    	String SalesPanel_Path = Getscreenshot(orderId);
    	Settings.OcrTextRead = true;
    	Settings.OcrTextSearch = true;
    	Region rl = new Region(regx,regy,regh,regw);
    	System.out.println(rl.text());
    	String text = rl.text().replaceAll(" ", "");
    	System.out.println(text);
    	if(text.contains(subTotal) && text.contains(tax)){
    	   if(subTotal.equals(tax)){
    		   lg.writeLog("Result.txt", getTimeStamp()+"[Pass] Sales Panel Validation: Expected Final Total = " + subTotal+ " & Expected Tax = " + "0.00"); 
    	   }else{
    		   lg.writeLog("Result.txt", getTimeStamp()+"[Pass] Sales Panel Validation: Expected Final Total = " + subTotal+ " & Expected Tax = " + tax);}
    	    return true;
    	}else{
    		lg.writeLog("Result.txt", getTimeStamp()+"[Fail] Sales Panel Validation: Unable to parse Text from Sales Panel");
    	    return false;
    	}
    }

    public String Getscreenshot(String orderId){
    	
    	String imgPath = "";
    	Logging lg = new Logging();
    	lg.createFolder("out");
    	String SalespanelDir = POSReceiptpath + "\\" + "SalesPanel";
    	String sId = orderId;
    	if(sId.length() == 1){
    		sId = "0" + orderId;
    	}
    	
    	File file = new File(SalespanelDir) ;
    	if( !file.exists() && !file.isDirectory()){
    		file.mkdir();
    	}
    	Screen screen  = new Screen();
        ScreenImage image = screen.capture(5,25,303,483);
        String tmpPath = image.save(SalespanelDir);
        File tmpFile = new File(tmpPath);
        String parentPath = tmpFile.getParent();
        imgPath = parentPath + "\\" +"SalesPanel_" + sId + ".png";
        tmpFile.renameTo(new File(imgPath));
        return imgPath;
        
    }

    public String getOrderId(){
    	
    	String orderId = "0";
    	Region region = new Region(regx,regy,regh,regw);
    	File originalScreen = new File(originalScreenShots + "\\" + "OriginalScreenShots");
    	if(!originalScreen.exists() && !originalScreen.isDirectory()){
    		originalScreen.mkdir();
    	}
    	region.saveScreenCapture(originalScreen.getAbsolutePath());
    	Settings.OcrTextRead = true;
    	Settings.OcrTextSearch = true;
    	//System.out.println(region.text());
    	String text = region.text().replace("Order Id: ","Order Id:");
    	int orderLoc = text.indexOf("Order Id:");
    	System.out.println("order location is :" + orderLoc);
    	orderId = region.text().substring(orderLoc + 10, orderLoc + 12);
    	orderId = orderId.trim();
    	//System.out.println("orderId is :" + orderId);
    	if(orderLoc == -1 || orderId.equals("") || Integer.parseInt(orderId) < count){
    		orderId = String.valueOf(count+1);
    	}else{
    		count = Integer.parseInt(orderId);
    	}
    	return orderId;
    }
    
    public String getPrice(String pCode, String orderType){
        getpriceHash();
        String strTemp=null;
        if(orderType.equals("EI")){
     	   String[] strP = priceHash.get(pCode).split(";");
            strTemp = strP[0].trim() + ";" + strP[1].trim();
        }else if(orderType.equals("TO")){
     	   String[] strP = priceHash.get(pCode).split(";");
     	   strTemp = strP[2].trim() + ";" + strP[3].trim();
        }
        return strTemp;
     }
   
    public String copyReceipt(String currentOderId){
      
    	String sId = currentOderId;
    	String fileName;
    	if(sId.length() == 1){
    		sId = "0" + sId;
    	}
    	File receiptDesFile = new File(receiptDes);
    	if(!receiptDesFile.exists() && !receiptDesFile.isDirectory()){
    		receiptDesFile.mkdir();
    		System.out.println("receipt folder is created");
    	}
    	File file = new File(reprintPath);
    	File[] singleFile = file.listFiles();
    	if(singleFile.length == 0){
    		System.out.println("No file in the folder");
    	}else{
    		for(int i = 0; i < singleFile.length; i++){
    			String tmp = singleFile[i].getAbsolutePath();
    			String pattern = Pattern.quote(System.getProperty("file.separator"));
    			String[] singleFilePath = tmp.split(pattern);
    			fileName = singleFilePath[singleFilePath.length - 1];
    			if(fileName.substring(24, 26).equals(sId)){
    				try {
						copy_File(new File(tmp), new File(receiptDes + "\\" + "order_" + sId + ".txt"));
					//    System.out.println("Copy successed");
    				} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
    				break;
    			}	
    		}
    	}
    	return receiptDes + "\\order_" + sId + ".txt";	
    }
  
    public void copy_File(File From_File, File Out_File) throws IOException{
		
		FileInputStream inFile = new FileInputStream(From_File);
		BufferedInputStream inbuf = new BufferedInputStream(inFile);
		
		FileOutputStream outfile = new FileOutputStream(Out_File);
		BufferedOutputStream outbuf = new BufferedOutputStream(outfile);
		
		byte[] bt = new byte[2048];
		int len;
		
		while((len = inbuf.read(bt)) != -1){
			outbuf.write(bt,0,len);
		}
		
		outbuf.flush();
		inFile.close();
		inbuf.close();
		
		outfile.close();
		outbuf.close();
	}
    
    public void validateReceipt(String currentId, String lineText1, String lineValue1, 
    		String lineTex2, String lineValue2, String lineText3, String lineValue3) throws IOException{
    	boolean line1 = false;
    	boolean line2 = false;
    	boolean line3 = false;
    	
    	File tmpFile = new File(receiptDes + "\\order_" + currentId + ".txt");
    	InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(tmpFile));
    	BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    	
    	String line = bufferedReader.readLine();
    	while(line != null){
    		String txt = line.replace("\n","");
    		txt = txt.trim();
    		
    		boolean orn1 = txt.contains(lineText1);
    		if(orn1){	
    			String txtVal = txt.substring(lineText1.length());
    			if ((txtVal.trim()).equals(lineValue1.trim())){
    				 line1 = true;
    			}
    		}
    		
    		boolean orn2 = txt.contains(lineTex2);
    		if(orn2){
    			String txtVal = txt.substring(lineTex2.length());
    			if((txtVal.trim()).equals(lineValue2.trim())){
    				 line2 = true;
    			}
    		}
    		
    		boolean orn3 = txt.contains(lineText3);
    		if(orn3){
    			String txtVal = txt.substring(lineText3.length());
    			if((txt.trim()).equals(lineText3.trim())){
    				 line3 = true;
    			}
    		}
    		line  = bufferedReader.readLine();
    	}
    		if(line1){
    			if(lineText1.equals("MXN (in USD)")){
    				
    			}else if(lineText1.equals("Billable Sales")){
    				
    			}else{
    				
    			}
    		}else{
    			System.out.println("line1 is failed");
    		}
    		
    		if(!((lineTex2.equals(""))||(lineTex2.equals("0.00"))||(lineTex2.equals("0.0")))){
    			if(line2){
    			}else{
    				System.out.println("line2 is failed");
    			}
    			
    		if(!lineText3.equals("")){
    			if(line3){
    				
    			}else{
    				System.out.println("line3 is failed");
    			}
    		}
    	}
    }

    public static String getTimeStamp(){
	    SimpleDateFormat sdf = null;
        sdf = new SimpleDateFormat("yyyy/MM/dd/HH:mm:ss");
        String timeStamp = sdf.format(new Date());
        return timeStamp;
    }

    public static String getorderId(){
		
		Region region = new Region(regx1, regy1, regw1, regh1);
		Settings.OcrTextRead = true;
		Settings.OcrTextSearch = true;
		String tmpRegion = region.text().replaceAll("R02-", "R02 -");
		System.out.println(tmpRegion);
		int index = tmpRegion.indexOf("R02 -");
		return tmpRegion.substring(index+5, index+7);
	}
	
	public static void getScreenShot(String orderId){
		
		File file = new File(savePath);
		if(!file.exists() && !file.isDirectory()){
			file.mkdirs();
		}else{
		}
		Screen screen = new Screen();
		ScreenImage image = screen.capture(regx1, regy1, regw1, regh1);
		String tmpPath = image.save(savePath);
		File tmpFile = new File(tmpPath);
	    String parentPath = tmpFile.getParent();
	    tmpFile.renameTo(new File(parentPath + "\\" + "order_" + orderId + ".png"));
		
	}
}
