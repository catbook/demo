package com.cn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWeb {
    public static void man() {
        // TODO Auto-generated method stub
        //启动浏览器
        System.setProperty("webdriver.chrome.driver","D:/chromedriver/chromedriver.exe");
        WebDriver dr = new ChromeDriver();
        //打开网站
        String url = "http://www.baidu.com";
        dr.get(url);
        //等待时间
        sleep(3);
		//定位账号框
		WebElement input = dr.findElement(By.xpath("//*[@id=\"kw\"]"));
//		WebElement btn = dr.findElement(By.xpath("//*[@id=\"su\"]"));
		//输入搜索内容
		input.sendKeys("哆啦A梦");
		sleep(3);
//		btn.sendKeys("yijinrongtest");
		//定位到按钮点击确定
		WebElement btn = dr.findElement(By.xpath("//*[@id=\"su\"]"));
//		btn.click();

    }
    public static void sleep(int time) {
        Thread s = new Thread();
        try {
            s.sleep(time*1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
