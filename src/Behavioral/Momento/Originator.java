package Behavioral.Momento;

public class Originator {

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Momento saveToMomento() {
        return new Momento(this.state);
    }

    public void restoreFromMomento(Momento momento) {
        this.state = momento.getSavedState();
    }

    public static class Momento {
        private final String state;

        public Momento(String state) {
            this.state = state;
        }

        public String getSavedState() {
            return state;
        }
    }
}
