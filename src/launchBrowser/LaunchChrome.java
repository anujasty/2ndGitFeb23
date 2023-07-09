package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Selenium Class 0 - Sunday, June 4th

//Workspace,Project, Package, Class are for organizing in Eclipse, in the the File Explorer
//they each are a folder
//For example if you navigate C:\Users\anuja\Selenium
//Initially when no project is created, that folder will have only .metadata folder
//Once "FirstSelenium" project is created, a folder called "FirstSelenium" is called in
//path mentioned above
//Once you expand the "FirstSelenium" folder, you see src which relates to src
//the Eclipse
//Then the .settings, bin, .classpath & .project relate to JRE lib

//Even though we give different names like project, package, class...they are nothing but folder
//Within in Industry, we don't use Java Project.  We use Maven Project. We do that from next class.

//In order to invoke our code we need a main method.
//main CTRL+space - auto correct suggestion
//Class contains methods and variables
//Methods contains Statements
//Java is associated with Classes and Objects

public class LaunchChrome {
	
	public static void main(String[] args) throws InterruptedException {
		
		//lets create an object
		Scanner snc = new Scanner(System.in);//Asking the system to take some input
		
		//Working with Selenium WebDriver, we need to create an object of a WebDriver;  
		//Object name here has to be "driver"
		//can't be any other name as it's industry standard.
		//Now we have to define which WebDriver we are gonna create; In our case it is the 
		//ChromeDriver
		//Launch Chrome
		WebDriver driver = new ChromeDriver();
		
		//When we hoover over, there is no import option for WebDriver or ChromeDriver.
		//This WebDriver belongs to Selenium.  Selenium should contain the WebDriver.
		//It's not part of JAVA, that is why it is not in the JRE.  It is a seperate tool or lib of tools
		//which we do not have in our project.
		
		//We need the JAR files for Selenium; That's why we downloaded selenium-java-4.9.1
		//First Navigate to C:\Users\anuja\Desktop\Selenium and unzip "selenium-java-4.9.1"
		//Create a folder "lib" under "FirstSelenium" (Project currently working on in Eclipse) 
		//Navigate to C:\Users\anuja\Desktop\Selenium\selenium-java-4.9.1
		//Copy all JAR in C:\Users\anuja\Desktop\Selenium\selenium-java-4.9.1 and navigate back to 
		//FirstSelenium | lib folder in Eclipse and paste them there
		
		//Navigate to C:\Users\anuja\Desktop\Selenium\selenium-java-4.9.1\lib
		//Copy all JAR files from C:\Users\anuja\Desktop\Selenium\selenium-java-4.9.1\lib and 
		//navigate back to FirstSelenium | lib folder in Eclipse and paste them there
		
		//Without these JAR files, you cannot work with WebDriver.  That is point that is being made here.
		//Going forward we use Maven Project, and we do not have to do all this.
		
		//Now they have to be referred to JRE system Library as well (Done something similar with APACHE POI)
		//Select the first JAR file under lib + SHIFT + select last file
		//Right click and choose Build Path -> Add to Build Path
		//It will Create "Referenced Libraries" folder under the current  Java Project 
		//and adds the reference to the
		//JRE System Library
		//These JAR files are put into Referenced Library which is ??toward the
		//JRE System Library
		//Its like we have  library and are adding new books to that Library
		//Now import the libraries needed 
		//If we use a browser other than Chrome, then the "ChromeDriver" should be 
		//replaced to the relevant option for that browser
		
		//Question:
		//When we have a new Workspace do we have have to import these files again in that project?
		//Not every workspace, if you have create a new project, and if you are required to work with Selenium
		//then you have to import Selenium JAR files.
		
		//For Maven project we do not have to do all those imports
		
		//Question:
		//In the statement: Scanner snc = new Scanner(System.in);
		//Both are Scanner Classes
		//however in: WebDriver driver = new ChromeDriver();
		//We say WebDriver and then ChromeDriver.  Why?
		//This is due to concept of Polymorphism in JAVA
		//When does this Polymorphism occur?  First rule of polymorphism is Inheritance has 
		//to be inplace
		//In here it is not actually extended, it is implemeneted as this WebDriver is an interface
		//So this is also polymorphism concept.  As all the WebDriver methods are 
		//used in ChromeDriver
		
		
		//Actually in there, it is not extended, but is implemented as the WebDriver Class
		//is an interface.
		//If you hoover over the WebDriver, you see "I", which means interface.
		//If you hoover over the ChromerDriver, you see "C" which means a class.
		//This is the concept of Polymorphism
		//With the reference of the superclass or parent class, we create an object of the 
		//child class
		//So all the common methods of the WebDriver are used in ChromeDriver
		
		//Interview Q:
		//Where does the OOPs concept apply in Selenium
		//When we create an object of WebDriver we are actually using the polymorphism 
		//concept because we are using WebDriver driver = new ChromeDriver();
		
		//When you run the code it will actually launch the Chrome Browser
		
		//When we create an object variable(in the above case: driver), it contains all 
		//the methods.  There is a get method that takes a variable in string format and 
		//fetch the requested Website
		driver.get( "https://www.google.com");
		
		//Why does it say as Java Application?  Beacuse we are using main method
		//Maximize the displayed browser
		//Asking the driver to manage the window and maximize it
		//Maximize Browser
		driver.manage().window().maximize();
		
		
		
		//All the elements on the website, such as icons, text boxes, buttons, images are 
		//all called web elements
		//All that you do using mouse, you can do more or less of everything with Selenium.
		//Selenium has methods to deal with those.  100% automataion is not achievable.
		//If you want to deal with the textbox to enter text for search, right click on 
		//box and click on inspect.  Piece of code responsible for that box is highlihjted
		//name = 'q' is what you are looking for
		//Type Selenium
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		//Pause for 3 secs
		Thread.sleep(3000);
		
		//Click on Search Button
		driver.findElement(By.name("btnK")).click();
		
		//Pause for 3 secs
		Thread.sleep(3000);
		
		//Close Browser
		driver.close();
	
	}
}
