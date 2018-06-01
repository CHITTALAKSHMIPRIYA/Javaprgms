
package com.bridgelabz.ObjectOrientedPrograms;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonInventoryData {
  static int sumRice=0;
  static int totalRice=0;
  static int sumWheat=0;
  static int totalWheat=0;
  static int sumPulses=0;
  static int totalPulses=0;
	
	public static void main(String[] args) {
		JSONParser parser=new JSONParser();
		try
		{
			Object obj=parser.parse(new FileReader("/home/bridgelabz/Inventory.json"));
			JSONObject  jsonObject=(JSONObject)obj;
			JSONArray rice=(JSONArray)jsonObject.get("Rice");
			for(int i=0;i<rice.size();i++)
			{
				JSONObject objRice=(JSONObject)(rice.get(i));
				sumRice+=(Integer.parseInt(objRice.get("Weight in Kg").toString()))*
						(Integer.parseInt(objRice.get("Price per kg").toString()));
				totalRice+=(Integer.parseInt(objRice.get("Weight in Kg").toString()));
			}
			System.out.println(rice);
			System.out.println(totalRice);
			System.out.println(sumRice);
			JSONArray wheat=(JSONArray)jsonObject.get("Wheat");
			for(int i=0;i<wheat.size();i++)
			{
				JSONObject objWheat=(JSONObject)(wheat.get(i));
				sumWheat+=(Integer.parseInt(objWheat.get("Weight in Kg").toString()))*
						(Integer.parseInt(objWheat.get("Price per kg").toString()));
				totalWheat+=(Integer.parseInt(objWheat.get("Weight in Kg").toString()));
			}
			System.out.println(wheat);
			System.out.println(totalWheat);
			System.out.println(sumWheat);
			JSONArray pulses=(JSONArray)jsonObject.get("Pulses");
			for(int i=0;i<pulses.size();i++)
			{
				JSONObject objPulses=(JSONObject)(pulses.get(i));
				sumPulses+=(Integer.parseInt(objPulses.get("Weight in Kg").toString()))*
						(Integer.parseInt(objPulses.get("Price per kg").toString()));
				totalPulses+=(Integer.parseInt(objPulses.get("Weight in Kg").toString()));
			}
			System.out.println(pulses);
			System.out.println(totalPulses);
			System.out.println(sumPulses);
		}
		catch(FileNotFoundException e) {e.printStackTrace();}
		catch(IOException e) {e.printStackTrace();}
	
		catch(Exception e) {e.printStackTrace();}

	}

}
