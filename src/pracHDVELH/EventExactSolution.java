package pracHDVELH;

import java.util.Scanner;

public class EventExactSolution extends Event {

    private GUIManager guiM;
    private String reponse;


    public EventExactSolution(GUIManager guiM, String data, String reponse) {
        super(guiM,data);
        this.guiM = guiM;
        this.reponse = reponse;

    }


    public Event run() {
        guiM.outputln(getData() + " " + reponse + "\n");
        return getDaughter(0);
    }



}