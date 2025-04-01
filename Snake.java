import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        boolean dev = false;
        boolean dead = false;
        int px = 1;
        int py = 1;
        int apples = 0;
        int ax = rand.nextInt(5);
        int ay = rand.nextInt(5);
        //spritesheet
        String empty = ("⬛");
        String empty_alt = ("⬛");
        String plr = ("🐍");
        String apple = ("🍎");
        //gridmap
        String x1,x3,x5,x8,x10,x12,x13,x15,x17,x20,x22,x24,x25,x27,x29,x32,x34,x36;
        x1=x3=x5=x8=x10=x12=x13=x15=x17=x20=x22=x24=x25=x27=x29=x32=x34=x36=empty;
        String x2,x4,x6,x7,x9,x11,x14,x16,x18,x19,x21,x23,x26,x28,x30,x31,x33,x35;
        x2=x4=x6=x7=x9=x11=x14=x16=x18=x19=x21=x23=x26=x28=x30=x31=x33=x35=empty_alt;
        //Gameplay
        while(dead==false){
            //A
            ArrayList<String> a = new ArrayList<String>();
            a.add(x1);
            a.add(x2);
            a.add(x3);
            a.add(x4);
            a.add(x5);
            a.add(x6);
            //B
            ArrayList<String> b = new ArrayList<String>();
            b.add(x7);
            b.add(x8);
            b.add(x9);
            b.add(x10);
            b.add(x11);
            b.add(x12);
            //C
            ArrayList<String> c = new ArrayList<String>();
            c.add(x13);
            c.add(x14);
            c.add(x15);
            c.add(x16);
            c.add(x17);
            c.add(x18);
            //D
            ArrayList<String> d = new ArrayList<String>();
            d.add(x19);
            d.add(x20);
            d.add(x21);
            d.add(x22);
            d.add(x23);
            d.add(x24);
            //e
            ArrayList<String> e = new ArrayList<String>();
            e.add(x25);
            e.add(x26);
            e.add(x27);
            e.add(x28);
            e.add(x29);
            e.add(x30);
            //F
            ArrayList<String> f = new ArrayList<String>();
            f.add(x31);
            f.add(x32);
            f.add(x33);
            f.add(x34);
            f.add(x35);
            f.add(x36);
            //apple

            if(ay==0){
                a.set(ax, apple);
            }
            if(ay==1){
                b.set(ax, apple);
            }
            if(ay==2){
                c.set(ax, apple);
            }
            if(ay==3){
                d.set(ax, apple);
            }
            if(ay==4){
                e.set(ax, apple);
            }
            if(ay==5){
                f.set(ax, apple);
            }
            //Snake
            if(py==0){
                a.set(px, plr);
            }
            if(py==1){
                b.set(px, plr);
            }
            if(py==2){
                c.set(px, plr);
            }
            if(py==3){
                d.set(px, plr);
            }
            if(py==4){
                e.set(px, plr);
            }
            if(py==5){
                f.set(px, plr);
            }
            if(px==ax){
                if(py==ay){
                    apples++;
                    ax = rand.nextInt(5);
                    ay = rand.nextInt(5);
                }
            }
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(e);
            System.out.println(f);
            System.out.print("🍎"+apples);
            if(dev==true){
                System.out.println(" - "+ax +" , "+ ay);
                System.out.print("🐍"+" - "+px +" , "+ py);
            }
            String gamepad = ("");
            gamepad = scanner.nextLine();

            if(gamepad.equals("w")){
                py--;
            }
            if(gamepad.equals("s")){
                py++;
            }
            if(gamepad.equals("a")){
                px--;
            }
            if(gamepad.equals("d")){
                px++;
            }
            System.out.println(gamepad);
        }
    }
}
