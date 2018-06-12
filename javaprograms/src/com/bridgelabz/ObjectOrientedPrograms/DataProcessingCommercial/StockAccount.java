
package com.bridgelabz.ObjectOrientedPrograms.DataProcessingCommercial;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.datastructureprograms.LinkedStack;
import com.bridgelabz.datastructureprograms.Queue;

import com.bridgelabz.util.Utility;

public class StockAccount {
    ArrayList<Stock> list = new ArrayList<Stock>();
    static File file;
  
    static File FILE = new File(
            "/home/bridgelabz/Javaprograms/javaprograms/src/com/bridgelabz/ObjectOrientedPrograms/DataProcessingCommercial/StockAccount.json");
    static Queue queue = new Queue();
    static LinkedStack stack = new LinkedStack();
    static ObjectMapper map = new ObjectMapper();
/**
 * 
 */
public StockAccount() {
       super();
   }
    /**
     * this method is to create a new account from file
     * @param filename
     * @throws IOException
     */
    public StockAccount(String filename) throws IOException {
        file = new File(
                "/home/bridgelabz/Downloads/sts-bundle/sts-3.9.2.RELEASE/processing",
                filename);
       System.out.println(file.getAbsolutePath());
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * @param filepath
     * @throws IOException
     */
    public void createNewFile(String filepath) throws IOException {
        File f = new File(filepath);
        if (f.createNewFile()) {
            System.out.println("file  created");
        } else {
            System.out.println("file  exists");
        }
        return;
    }
/**
 * @return
 */
    public static Stock cmpnysharesObject() {
        Stock companyShares = new Stock();
        System.out.println("Enter the symbol of shares:");
        String symbol = Utility.String();
        companyShares.setSymbol(symbol);
        System.out.println("Enter the number of shares:");
        int numberOfShares = Utility.Int();
        companyShares.setNoOfShares(numberOfShares);
        String dateTime = new SimpleDateFormat("dd/MM/yyyy").format(new Date(numberOfShares));
        companyShares.setDateTime(dateTime);
        System.out.println("Enter the price of share:");
        double price = Utility.Double();
        companyShares.setPrice(price);
        return companyShares;
    }

   /**
 * @param filepath
 * @param symbol
 * @param buyShares
 * @param amount
 * @throws IOException
 */
public void updateAccount(String filepath, String symbol, int buyShares, double amount) throws IOException {
        FileWriter fw = new FileWriter(filepath);
        BufferedWriter bw = new BufferedWriter(fw);
        String fileData = "shares  " + symbol + "\n" + "total shares present " + buyShares + "\n"
                + "amount remaining " + amount + "\n" + "DateTime  " + LocalDateTime.now() + "\n" + "\n";
        bw.write(fileData);
       bw.flush();
       bw.close();
    }

    /**
     * @param filePath
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ParseException
     * @throws org.json.simple.parser.ParseException
     */
    public void save(String filePath) throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {
        JSONArray ar = readFromFile(filePath);
        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
        }
    }

    /**
     * @param filePath
     * @param newAccountPath
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ParseException
     * @throws org.json.simple.parser.ParseException
     */
    @SuppressWarnings("unchecked")
    public void sell(String filePath, String newpath) throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {
        save(filePath);
        Stock companyShares = cmpnysharesObject();
        JSONObject jsonObject = toJsonObject(companyShares);
        stack.push((String) jsonObject.get("symbol"));
        JSONArray jsonArray = readFromFile(filePath);
        System.out.println(jsonArray);
        jsonArray.add(jsonObject);
        writeToFile(jsonArray, filePath);
        writeToFile(jsonArray, newpath);
        System.out.println("shares added to  account");
        System.out.println("Symbol added to  stack");
        stack.display();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String date = dateFormat.format(new Date());
        queue.enqueue(date);
        System.out.println("DateTime added to queue");
        queue.display();

    }

    /**
     * @param amount
     * @param symbol
     * @param filepath
     * @param newAccountFilePath
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ParseException
     * @throws org.json.simple.parser.ParseException
     */
    @SuppressWarnings("unchecked")
	public void buy(int amount, String symbol, String filepath, String newAccountFilePath)
            throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {
        JSONArray array = readFromFile(filepath);
        System.out.println(array);
        System.out.println(" enter shares you want to buy?");
        int buyShares = Utility.Int();
        for (int i = 0; i < array.size(); i++) {
            JSONObject term= (JSONObject) array.get(i);
            System.out.println(term);
            if (symbol.equals(term.get("symbol"))) {

                long temp = (long) term.get("numberOfShares") - buyShares;
                term.put("numberOfShares", temp);
                array.remove(i);
                array.add(i, term);
                amount = (int) (amount - (buyShares * (long) term.get("price")));
                writeToFile(array, filepath);
                updateAccount(newAccountFilePath, symbol, buyShares, amount);
                stack.push((String) term.get("symbol"));
                System.out.println("Symbol pushed to the Stack");
                stack.display();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                String date = dateFormat.format(new Date());
                queue.enqueue(date);
                System.out.println("DateTime added to queue");
                queue.display();
                break;
                }
        }

    }
    /**
     * @param companyShares
     * @return
     */
    @SuppressWarnings("unchecked")
	public static JSONObject toJsonObject(Stock companyShares) {
        JSONObject obj = new JSONObject();
        obj.put("symbol", companyShares.getSymbol());
        obj.put("numberOfShares", companyShares.getNoOfShares());
        obj.put("price", companyShares.getPrice());
        obj.put("Value", companyShares.getValue());
        obj.put("dateTime", companyShares.getDateTime());
        return obj;
    }

    /**
     * @param filepath
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ParseException
     * @throws org.json.simple.parser.ParseException
     */
    public JSONArray readFromFile(String filepath) throws FileNotFoundException, IOException, ParseException, org.json.simple.parser.ParseException {
        JSONParser parser = new JSONParser();
        JSONArray jsonAr = (JSONArray) parser.parse(new FileReader(filepath));
        return jsonAr;
    }

    /**
     * @param jsonArray
     * @param filepath
     * @throws JsonGenerationException
     * @throws JsonMappingException
     * @throws IOException
     */
    public void writeToFile(JSONArray jsonArray, String filepath)
            throws JsonGenerationException, JsonMappingException, IOException {

        map.writeValue(new File(filepath), jsonArray);
    }

   
}
