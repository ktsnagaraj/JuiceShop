package com.shop.utilities;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.checkerframework.common.reflection.qual.GetClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.print.PageSize;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.pdf.PdfDocument;
import com.itextpdf.text.pdf.PdfWriter;
public class ScreenShotMaker {	
	
	public static void screenShot(WebDriver driver) throws IOException, DocumentException{
	TakesScreenshot screenshot  = (TakesScreenshot)driver;
	File sourceScreen = screenshot.getScreenshotAs(OutputType.FILE);
	String screenShotName = "screen";
	screenShotName = screenShotName+Math.random();
	FileHandler.copy(sourceScreen, new File("C:\\Users\\Dra Nallely Corona\\Desktop\\Selenium Automation\\Exercise 1\\ScreenShots\\"+screenShotName+".png"));
	
	PDDocument document = new PDDocument();
	PDPage firstPage = new PDPage(); 
	document.addPage(firstPage);
	PDImageXObject image1 = PDImageXObject.createFromFile("C:\\Users\\Dra Nallely Corona\\Desktop\\Selenium Automation\\Exercise 1\\ScreenShots\\"+screenShotName+".png", document);
	PDPageContentStream contentStream = new PDPageContentStream(document, firstPage);
	contentStream.drawImage(image1, 30, 340, 560, 280);
	contentStream.close();
	document.save("C:\\Users\\Dra Nallely Corona\\Desktop\\Selenium Automation\\Exercise 1\\ScreenShots\\"+screenShotName+".pdf");
	document.close();
	}
}