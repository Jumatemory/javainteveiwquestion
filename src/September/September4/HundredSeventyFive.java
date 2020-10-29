package September.September4;

public class HundredSeventyFive {
    public static void main(String[] args) {

    }
    public boolean validateTask(boolean notEmpty,int taskId,int currentId)
    {
        boolean check = false;
        if (notEmpty==true && taskId==currentId+1){
            check=true;
        }




        return check;
    }
}
