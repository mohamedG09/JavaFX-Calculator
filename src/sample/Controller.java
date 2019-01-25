package sample;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    public Button butt0;
    public Button butt1;
    public Button butt2;
    public Button butt3;
    public Button butt4;
    public Button butt5;
    public Button butt6;
    public Button butt7;
    public Button butt8;
    public Button butt9;
    public Button buttdot;
    public Button buttSwitchSign;
    public Button buttdelete;
    public Button buttCE;
    public Label mainlabel;
    public Label historylabel;

    public double extractDecimal(double x){
        double fractional = x-((int) x);
        return fractional;
    }

    public void insertNum(String s){
        mainlabel.setText(mainlabel.getText()+s);
    }



    public void actionButt0(){
        if(mainlabel.getText().charAt(0)=='0'){return;}
        insertNum("0");
    }

    public void actionButt1(){
        insertNum("1");
    }

    public void actionButt2(){
        insertNum("2");
    }

    public void actionButt3(){
        insertNum("3");
    }

    public void actionButt4(){
        insertNum("4");
    }

    public void actionButt5(){
        insertNum("5");
    }

    public void actionButt6(){
        insertNum("6");
    }

    public void actionButt7(){
        insertNum("7");
    }

    public void actionButt8(){
        insertNum("8");
    }

    public void actionButt9(){
        insertNum("9");
    }

    public void actionButtDot(){
        boolean flag=true;
        for(int i=0;i<mainlabel.getText().length();i++){
            if(mainlabel.getText().charAt(i)=='.'){
                flag = false;
                break;
            }
        }
        if(flag){
            mainlabel.setText(mainlabel.getText()+".");
            flag = false;
        }
    }

    public void actionButtSwitchSign() {
        double x = Double.parseDouble(mainlabel.getText());
        x *= -1;
        if(extractDecimal(x)==0){
        mainlabel.setText(String.valueOf((int)x));
        }
        else{
            mainlabel.setText(String.valueOf(x));
        }
    }

    public void actionButtDelete(){
        String num = mainlabel.getText();
        num = num.substring(0, num.length() - 1);
        mainlabel.setText(num);
    }

    public void actionButtCE(){
        mainlabel.setText("");
    }

}
