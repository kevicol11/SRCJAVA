package device;

import commad.Commad;

public class DiviceButton {
    private Commad commad;

    public DiviceButton(Commad commad){
        this.commad = commad;
    }
    public void press(){
        commad.execute();
    }
    public void pressundo(){
        commad.undo();
    }
}


