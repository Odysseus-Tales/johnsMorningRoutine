import java.util.Scanner;

public class johnsMorning {
    private String hour2, minute2,time, answer;
    private int hour,minute, accumalated;

    public void divider(){
        System.out.println("*********");
    }
    public int getHour(){
        boolean r = true;
        while (r){
        
            hour = (int) (Math.random() * 8);
            if (hour ==7){
                r = false;
            
            }
            else if (hour ==6){
                r = false;
            }
            else {
                r = true;
            }
        }
        return hour;

     
    }
    public String turnHour(){
        hour2 = Integer.toString(hour);
        return hour2;
    }
    public int getMinute(){
        if (hour == 6){
            minute = (int) (Math.random() * 59);
        }
        if (hour == 7){
            minute = (int) (Math.random() * 30);
         
        }
        return minute;

    }
    public String turnMinute(){
        if (minute > 60){
            minute = minute%60;
            hour +=1;
        }
        if (minute < 10){
                
            minute2 ="0"+ Integer.toString(minute);
            return minute2;
        }
        else {
            minute2 =Integer.toString(minute);
            return minute2;
        }   
    }
    public String currentTime(){
        time = hour2 +":"+minute2;
        return time;
    }
    public void timeIs(){
        System.out.println(time);
    }
    public void nowWakeup(){
        System.out.println("Wake up it is "+ time);
    
    }
    public void extraFive(){
        System.out.println("Do you want to sleep an extra 5 minutes?");
        boolean z = true;
        while (z){
        
            int yOn = (int) (Math.random() * 4);
            if (yOn ==1){
                z = false;
                System.out.println("yes");
                System.out.println("you are lazy today");
            }
            else if (yOn ==2){
                z = false;
                System.out.println("no");
                System.out.println("Good, now go check if have alot time");
            }
            else {
                z = true;
                System.out.println("hmmm");
            }
        }

     
    }
    
    public void showerDecision(){
        System.out.println("Do you have time to shower?");
        boolean x = true;
        while (x){
        
            int clean = (int) (Math.random() * 4);
            if (clean ==1){
                x = false;
                System.out.println("yes");
                System.out.println("Jenny might think im stinky");
            }
            else if (clean ==2){
                x = false;
                System.out.println("no");
                System.out.println("im in a rush, i probably smell fine");
            }
            else {
                x = true;
                System.out.println("hmmm");
            }
        }
    }
    public void fit(){
        System.out.println("what should i wear today?");

        
        int day = (int) (Math.random() *5);
        switch (day) {
            case 1:
            System.out.println("nude");
            System.out.println("kinda hot today");
            break;
            case 2:
            System.out.println("same fit worn since freshman year");
            System.out.println("i dont own any other clothes though im rich");
            break;
            case 3:
            System.out.println("i'll call her to make my fit");
            System.out.println("but she lowkey has bad taste");
            break;
            case 4:
            System.out.println("shorts and sweater");
            System.out.println("Old reliable");
            break;
            default:
            System.out.println("hmmmmm");
            break;
        }
    }
    public void chainOfEvents(){
        System.out.println("board or nah?");
        boolean q = true;
        while (q){
        
            int skate = (int) (Math.random() * 4);
            if (skate ==1){
                q = false;
                System.out.println("yes");
                System.out.println("i just know Carlos will bring his");
            }
            else if (skate ==2){
                q = false;
                System.out.println("no");
                System.out.println("ill ditch the boys for her today");
                System.out.println("Should i pick my girlfriend today?");
                boolean l = true;
                while (l){
                
                    int meat = (int) (Math.random() * 4);
                    if (meat ==1){
                        l = false;
                        System.out.println("yes");
                        System.out.println("Jenny must be craving me");
                        System.out.println("SideQuest;)?");
                        boolean d = true;
                        while (d){
                
                             int wild = (int) (Math.random() * 4);
                             if (wild ==1){
                                d = false;
                                System.out.println("yes");
                                System.out.println("i think its tuesday");
                        
                             }
                             else if (wild ==2){
                                d = false;
                                System.out.println("no");
                                System.out.println("damn one minute be disapointing");
                            }
                             else {
                                d = true;
                                System.out.println("hmmm");
                    }
                }
                        
                    }
                    else if (meat ==2){
                        l = false;
                        System.out.println("no");
                        System.out.println("hopefully she wont hit me");
                    }
                    else {
                        l = true;
                        System.out.println("hmmm");
                    }
                }
            }
            else {
                q = true;
                System.out.println("hmmm");
            }
        }

    }

    public void transit(){
        System.out.println("Does the Bus or Train sound quicker?");
        boolean a = true;
        while (a){
        
            int mode = (int) (Math.random() * 4);
            if (mode ==1){
                a = false;
                System.out.println("bus");
                System.out.println("will definitely see some side characters");
            }
            else if (mode ==2){
                a = false;
                System.out.println("train");
                System.out.println("its always slow but its empty");
                boolean b = true;
                while (b){
                
                    int luck = (int) (Math.random() * 4);
                    if (luck ==1){
                        b = false;
                        System.out.println("there will be a 15 delay");
                        System.out.println("this is what you get for trying to go to school calmly");
                    }
                    else if (luck ==2){
                        b = false;
                        System.out.println("train running smoothly");
                        System.out.println("if there was a delay, that wouldve been rude");
                    }
                    
                }
    
            }
            else {
                a = true;
                System.out.println("hmmm");
            }
        }
    }

    public void meal(){
        System.out.println("what breakfeast are we in the mood for this morning");

        
        int food = (int) (Math.random() *5);
        switch (food) {
            case 1:
            System.out.println("jenny");
            System.out.println("she a snack");
            break;
            case 2:
            System.out.println("not hungry");
            System.out.println("im cutting, food is bad");
            break;
            case 3:
            System.out.println("glucose");
            System.out.println("mmmmmm tasty");
            break;
            case 4:
            System.out.println("a sandwhich");
            System.out.println("i rarely get one");
            break;
            default:
            System.out.println("hmmmmm");
            break;
        }
    }

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        johnsMorning John = new johnsMorning();
        John.divider();
        System.out.println("You are John and you have to go to school today which starts at 8 ");
        System.out.println("You'll awake at a random time from 6-7:30");
        System.out.println("Note that your prompted decisions will chosen at random");
        System.out.println("The goal is to understand the cause and effect of johns decisions as he heads to school");
        John.divider();
        John.getHour();
        John.turnHour();
        John.getMinute();
        John.turnMinute();
        John.currentTime();
        John.nowWakeup();
        John.divider();
        John.extraFive();
        John.divider();
        John.showerDecision();
        John.divider();
        John.fit();
        John.divider();
        John.chainOfEvents();
        John.divider();
        John.transit();
        John.divider();
        John.meal();
        John.divider();
        System.out.println("alright after a long journey, youve made it to school");

    }
}
