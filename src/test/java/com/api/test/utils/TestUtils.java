package com.api.test.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

/**
 * <p>Placeholder class level text</p>
 * @Author Siddharth Mishra
 */
public class TestUtils {
	
	public static Properties configProps;
	public RestAssured restAssured;
	
	/**
	 * <p>This static method reads configuration parameters</p>
	 * @Version 1.0
	 */
	public static void readConfig() {
		configProps = new Properties();
		try {
			FileInputStream fis = new FileInputStream(new File("./src/test/resources/config.properties"));
			configProps.load(fis);
			System.out.println(configProps.getProperty("base_uri"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * <p>Places GET request to provided endpoint</p>
	 * @param headers
	 * @param model
	 * @param urlPath
	 */
	public void getRequest(Map<String, String> headers, String urlPath) {
		RestAssured.baseURI = configProps.getProperty("base_uri");
		Response response = RestAssured.given()
				.headers(headers)
				.contentType(ContentType.JSON)
				.get(urlPath);
	}
	
	/**
	 * <p>Places GET request to provided endpoint</p>
	 * @param headers
	 * @param model
	 * @param urlPath
	 */
	public void getRequest(Map<String, String> headers, Object model, String urlPath) {
		RestAssured.baseURI = configProps.getProperty("base_uri");
		String modelJson = this.getSerializedObject(model);
		Response response = RestAssured.given()
				.headers(headers)
				.contentType(ContentType.JSON)
				.body(modelJson)
				.get(urlPath);
	}
	
	/**
	 * <p>Places GET request to provided endpoint</p>
	 * @param headers
	 * @param model
	 * @param urlPath
	 */
	public void getRequest(Map<String, String> headers, String payLoad, String urlPath) {
		RestAssured.baseURI = configProps.getProperty("base_uri");
		Response response = RestAssured.given()
				.headers(headers)
				.contentType(ContentType.JSON)
				.body(payLoad)
				.get(urlPath);
	}
	
	/**
	 * <p>Places POST request to provided endpoint</p>
	 * @param headers
	 * @param model
	 * @param urlPath
	 */
	public void postRequest(Map<String, String> headers, Object model, String urlPath) {
		RestAssured.baseURI = configProps.getProperty("base_uri");
		String modelJson = this.getSerializedObject(model);
		System.out.println(modelJson);
		Response response = RestAssured.given()
				.headers(headers)
				.contentType(ContentType.JSON)
				.body(modelJson)
				.post(urlPath);
	}
	
	/**
	 * <p>Serializes Java POJO to JSON String</p>
	 * @param modelObject
	 * @return
	 */
	public String getSerializedObject(Object modelObject) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
			ObjectWriter ow = mapper.writer().withDefaultPrettyPrinter();
			return ow.writeValueAsString(modelObject);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * <p>Reads Excel and responds with 2D object array</p>
	 * @return
	 */
	public Object[][] readExcel(String sheetName) {
		try {
			FileInputStream fis = new FileInputStream(new File(configProps.getProperty("test_data_source")));
			Workbook workbook = new XSSFWorkbook(fis);
			Sheet sheet = workbook.getSheet(sheetName);
			int rowCount = sheet.getLastRowNum();
			int colCount = sheet.getRow(0).getLastCellNum();
			Object[][] data = new Object[rowCount][colCount];
			System.out.println(rowCount+" | "+colCount);
			for(int i=1; i<=rowCount; i++) {
				for(int j=0; j<colCount; j++) {
					data[i-1][j] = sheet.getRow(i).getCell(j).getStringCellValue();
				}
			}
			return data;
		} catch (IOException e) {
			System.out.println("Error while Reading Test Data");
		}
		return null;
	}
}
