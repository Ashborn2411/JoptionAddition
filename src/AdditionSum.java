import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AdditionSum {
    private  int first,second;
    public int getfirst(){
        return  first;
    }
    public int getsecond(){
       return  second;
    }
    public void setfirst(String s){
        this.first=Integer.parseInt(s);
    }
    public void setsecond(String s){
        this.second=Integer.parseInt(s);
    }
    public int getSum(){
        return  getfirst()+getsecond();
    }

     public  void doSum(){
        try{
            String first=JOptionPane.showInputDialog(UtilString.firstmessage);
            String second=JOptionPane.showInputDialog(UtilString.secondmessage);
            setfirst(first);
            setsecond(second);
            JOptionPane.showMessageDialog(null ,
                    UtilString.summessage+getSum(),
                    UtilString.titlemessage,
                    JOptionPane.PLAIN_MESSAGE);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,
                    UtilString.inputError,
                    UtilString.invalidInput
                    ,
                    JOptionPane.ERROR_MESSAGE);

        }

     }
    public static void main(String[] args) {
         AdditionSum additionSum=new AdditionSum();
         additionSum.doSum();
        }
    }
