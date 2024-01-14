import java.util.InputMismatchException;
import java.util.Scanner;

//Create an abstract class for character customization
abstract class CharacterCustomization {
 private String username;
 protected String gender;
 protected int height;
 protected int heightPercentage;
 protected String bodyType;
 protected String skinTone;
 protected String nose;
 protected String piercing;
 protected String vehicle;
 protected String headAccessories;
 protected String torso;
 protected String legs;
 protected String faceShape;
 protected String eyes;
 protected String eyebrow;
 protected String mouthShape;
 protected String jacket;
 protected String eyeAccessories;
 protected String socks;
 protected String tattoo;
 protected String background;
 protected String bag;

 // Method Overloading
 protected static String getUserInput(String prompt, Scanner scanner) {
     System.out.println(prompt);
     return scanner.nextLine().trim();
 }
 protected static double calculateHeight(int percentage) {
    
     double baseHeight = 150.0; 

     if (percentage == 40) {
         return baseHeight * 0.4;
     } else if (percentage == 70) {
         return baseHeight * 0.7;
     } else if (percentage == 100) {
         return baseHeight;
     } else { 
         return baseHeight * 1.2;
     }
 }

 // Method Overloading
 protected static String getUserChoice(String prompt, Scanner scanner, String... options) {
     while (true) {
         System.out.println(prompt);

         for (int i = 0; i < options.length; i++) {
             System.out.println((i + 1) + ". " + options[i]);
         }

         int choice;
         try {
             choice = scanner.nextInt();
             scanner.nextLine();

             if (choice >= 1 && choice <= options.length) {
                 return options[choice - 1];
             } else {
                 System.out.println("Invalid choice. Please enter a valid option.");
             }
         } catch (java.util.InputMismatchException e) {
             scanner.nextLine(); // Consume the invalid input
             System.out.println("Invalid input. Please enter a valid option.");
         }
         
     }
 }

 // Constructor for character details
 protected CharacterCustomization(String username, String gender, int heightPercentage, String bodyType,
                                  String skinTone, String nose, String piercing, String vehicle,
                                  String headAccessories, String torso, String legs, String faceShape,
                                  String eyes, String eyebrow, String mouthShape, String jacket,
                                  String eyeAccessories, String socks, String tattoo, String background,
                                  String bag) {
     // Initialize character details
     this.username = username;
     this.gender = gender;
     
     this.heightPercentage = heightPercentage;
     this.bodyType = bodyType;
     this.skinTone = skinTone;
     this.nose = nose;
     this.piercing = piercing;
     this.vehicle = vehicle;
     this.headAccessories = headAccessories;
     this.torso = torso;
     this.legs = legs;
     this.faceShape = faceShape;
     this.eyes = eyes;
     this.eyebrow = eyebrow;
     this.mouthShape = mouthShape;
     this.jacket = jacket;
     this.eyeAccessories = eyeAccessories;
     this.socks = socks;
     this.tattoo = tattoo;
     this.background = background;
     this.bag = bag;
 }

 // Display character details
 protected void displayCharacterDetails() {
     System.out.println("\nCharacter Details:");
     System.out.println("Username: " + username);
     System.out.println("Gender: " + gender);
     double height = calculateHeight(heightPercentage);
     System.out.println("Height: " + height + " cm");
     System.out.println("Body Type: " + bodyType);
     System.out.println("Skin Tone: " + skinTone);
     System.out.println("Nose: " + nose);
     System.out.println("Piercing: " + piercing);
     System.out.println("Vehicle: " + vehicle);
     System.out.println("Head Accessories: " + headAccessories);
     System.out.println("Torso: " + torso);
     System.out.println("Legs: " + legs);
     System.out.println("Face Shape: " + faceShape);
     System.out.println("Eyes: " + eyes);
     System.out.println("Eyebrow: " + eyebrow);
     System.out.println("Mouth Shape: " + mouthShape);
     System.out.println("Jacket: " + jacket);
     System.out.println("Eye Accessories: " + eyeAccessories);
     System.out.println("Socks: " + socks);
     System.out.println("Tattoo: " + tattoo);
     System.out.println("Background: " + background);
     System.out.println("Bag: " + bag);
 }

}


//Inheritance:
public class AVATAR extends CharacterCustomization {
	

 public AVATAR(String username, String gender,int heightPercentage, String bodyType, String skinTone,
               String nose, String piercing, String vehicle, String headAccessories, String torso,
               String legs, String faceShape, String eyes, String eyebrow, String mouthShape,
               String jacket, String eyeAccessories, String socks, String tattoo, String background,
               String bag) {
     // Call super class constructor
     super(username, gender, heightPercentage, bodyType, skinTone, nose, piercing, vehicle, headAccessories,
             torso, legs, faceShape, eyes, eyebrow, mouthShape, jacket, eyeAccessories, socks,
             tattoo, background, bag);
 }

 @Override
 protected void displayCharacterDetails() {
   
     super.displayCharacterDetails();
     
 }

 // Method Overloading:
 public static void QuestionsAndAnswer() {
     Scanner scanner = new Scanner(System.in);

String username = " ";
    while(true){
     username = getUserInput("Hello player! Welcome to the streets!! Let's ride soon! " +
             "But first, we need your outfit customization to be done! And oh, by the way, what is your name? ", scanner);
              
             if(username.isEmpty()){
                 System.out.println("Please enter the username!");
               
             }
            
             else{

               break;
             }

            }
     
        
      
     System.out.println("Wow, what a nice name!! Now let's proceed to your customization!!");

     String gender = getUserChoice("Enter gender: ", scanner, "LALAKE", "BABAE", "BADING", "TOMBOY", "BI NA BI");
    
     
        
     int heightPercentage = 0;

     boolean validInput = false;

     while (!validInput) {
         try {
             String heightPercentageStr = getUserInput("Enter height percentage: \n1. 40% \n2. 70%\n3. 100%\n4. 120%:\n ", scanner);
             heightPercentage = Integer.parseInt(heightPercentageStr);

             switch(heightPercentageStr){
                case "1":
                heightPercentage = 40; 
                double height1 = calculateHeight(heightPercentage);
                System.out.println("Height corresponding to " + heightPercentage + "% is: " + height1 + " cm");
                break;
                case "2":
                heightPercentage = 70;
                double height2 = calculateHeight(heightPercentage);
                 System.out.println("Height corresponding to " + heightPercentage + "% is: " + height2 + " cm");
                break;
                case "3":
                heightPercentage = 100; 
                double height3 = calculateHeight(heightPercentage);
                 System.out.println("Height corresponding to " + heightPercentage + "% is: " + height3 + " cm");
                 break;
                case "4":
                heightPercentage = 120; 
                double height4 = calculateHeight(heightPercentage);
                 System.out.println("Height corresponding to " + heightPercentage + "% is: " + height4 + " cm");
                 break;
                 default: continue;
             }
             validInput = true;
            
         } catch (NumberFormatException e) {
             System.out.println("Invalid input! Please enter a valid integer for height percentage.");
             
             
         }
     } 

     String bodyType = getUserChoice("Enter body type: ", scanner, "FAT", "MUSCULAR", "SLIM", "ATHLETIC", "SEMI MUSCULAR");

     String faceShape = getUserChoice("Choose face shape: ", scanner, "OVAL", "ROUND", "SQUARE", "DIAMOND", "HEART");

     String eyes = getUserChoice("Choose eyes: ", scanner, "ALMOND EYES", "ROUND EYES", "MONOLOID EYES", "PROTOUNDING EYES", "DOWNTURNED EYES");

     String eyebrow = getUserChoice("Choose eyebrow: ", scanner, "CLASSIC", "BACKARCHED", "STRAIGHT", "HIGH-ARCH", "ANGLED");

     String mouthShape = getUserChoice("Choose mouth shape: ", scanner, "FULL LIPS", "HEAVY UPPER LIPS", "WIDE LIPS", "ROUND LIPS", "THIN LIPS");

     String nose = getUserChoice("Enter nose type: ", scanner, "DROOPY", "SNUB", "ROMAN", "BULBOUS", "DELICATE");

     String piercing = getUserChoice("Enter piercing type: ", scanner, "EARS", "NOSE", "EYEBROW", "MOUTH", "NIPPLE");

     String skinTone = getUserChoice("Enter skin tone: ", scanner, "PALE", "NORMAL", "TAN", "MEDIUM", "DARK");

     String headAccessories = getUserChoice("Choose head accessories: ", scanner, "HELMET", "CAP", "BANDANA", "HEADPHONE", "BEANIE");

     String eyeAccessories = getUserChoice("Choose eye accessories: ", scanner, "NONE", "SUNGLASSES", "GOOGLES", "EYE PATCH", "FUNNY EYEGLASSES");

     String jacket = getUserChoice("Choose jacket: ", scanner, "NONE", "HOODIE", "DENIM", "LONG SLEEVE", "WIND BREAKER");

     String torso = getUserChoice("Choose torso: ", scanner, "NONE", "SANDO", "TSHIRT", "POLO", "JERSEY");

     String legs = getUserChoice("Choose legs: ", scanner, "NONE", "SHORT", "SLIM PANTS", "LOOSE PANTS", "CARGO PANTS");

     String vehicle = getUserChoice("Choose a vehicle: ", scanner, "SKATE", "BMX", "SCOOTER", "ROLLERS", "FIXIE BICYCLE");

     String socks = getUserChoice("Choose socks: ", scanner, "KIKE", "ADIDABADAS", "CONVERGE", "PUSA", "MIKE JORDY");

     String tattoo = getUserChoice("Choose tattoo: ", scanner, "NONE", "BACK", "SHOULDER", "LEGS", "NECK");

     String background = getUserChoice("Choose background: ", scanner, "SKATE PARK", "BIKE PARK", "SCOOTER PARK", "STREET", "SCHOOL");

     String bag = getUserChoice("Choose a bag: ", scanner, "NONE", "BAGPACK", "VEST BAG", "BELT BAG", "SHOULDER BAG");

     AVATAR avatar = new AVATAR(username, gender, heightPercentage, bodyType, skinTone, nose, piercing, vehicle,
             headAccessories, torso, legs, faceShape, eyes, eyebrow, mouthShape, jacket, eyeAccessories,
             socks, tattoo, background, bag);

     // Display the character details
     avatar.displayCharacterDetails();
     while(true){
     System.out.println("Choose if you want to play International? (YES/NO)");
     String choose = scanner.nextLine();

     if (choose.equalsIgnoreCase("YES")) {
         System.out.println("Yo, welcome to the Ultimate ShowdownGrand Stage of the International Tournament, " + username + "! Listen up, no shady business allowed. It's all about pulling off those sick moves within the ticking clock. Get ready to rock the stage and own your epic journey, dude!");
         break;

     } else if (choose.equalsIgnoreCase("NO")) {
         System.out.println("Hey there, champ! Get ready for the Local Throwdown on our Local stage Tourna, " + username + "! Easy rules – no sneaky stuff. No rush, no time limit. Just stick those tricks, and remember, the game's up if you miss one. Let the showdown begin!");
         break;
     } else {
         System.out.println("Invalid input! Please enter only YES or NO.");
     }
    }

 }
 // Main method
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     
     QuestionsAndAnswer();
     
     boolean playAgain = true;
     while (playAgain) {
         System.out.println("\nDo you want to play again? YES/NO\n");
         String userAnswer = scanner.nextLine();

         if (userAnswer.equalsIgnoreCase("YES")) {
             playAgain = true;
             QuestionsAndAnswer();
         } else if (userAnswer.equalsIgnoreCase("NO")) {
             playAgain = false;
             System.out.println("Goodbye!");
             System.exit(0);
         } else {
             System.out.println("Invalid input! Please enter only YES or NO.");
         }
     }
     }
 }