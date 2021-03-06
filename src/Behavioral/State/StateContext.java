package Behavioral.State;

public class StateContext {
    private State state;

    public StateContext() {
        this.state = new LowerCaseState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void writeName(String name) {
        state.writeName(this, name);
    }
}
