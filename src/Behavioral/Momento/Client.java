package Behavioral.Momento;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        List<Originator.Momento> momentoList = new ArrayList<>();

        Originator originator = new Originator();
        originator.setState("State1");
        originator.setState("State2");
        momentoList.add(originator.saveToMomento());

        for (Originator.Momento momento: momentoList) {
            System.out.println(momento.getSavedState());
        }

        originator.setState("State3");
        originator.setState("State4");

        System.out.println(originator.getState());

        originator.restoreFromMomento(momentoList.get(0));

        System.out.println(originator.getState());

    }
}
