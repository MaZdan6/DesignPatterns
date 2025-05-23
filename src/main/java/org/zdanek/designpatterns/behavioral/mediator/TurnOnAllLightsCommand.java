package org.zdanek.designpatterns.behavioral.mediator;

//concrete command
public class TurnOnAllLightsCommand implements Command {

    private Mediator med;

    public TurnOnAllLightsCommand(Mediator med) {
        this.med = med;
    }

    @Override
    public void execute() {
        med.turnOnAllLights();
    }
}