package command;

public class RemoteControlTest {
    public static void main(String[] args) {
        /*SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();*/

        RemoteControl remote = new RemoteControl();

        // Create Classes
        Light livingRoomLight = new Light();
        Light kitchenLight = new Light();
        Fan ceilingFan = new Fan();
        Door garageDoor = new Door();
        Stereo stereo = new Stereo();

        // Create Commands
        LightOnCommand lLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand lLightOff = new LightOffCommand(livingRoomLight);

        LightOnCommand kLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kLightOff = new LightOffCommand(kitchenLight);

        FanHighCommand cFanHigh = new FanHighCommand(ceilingFan);
        FanLowCommand cFanLow = new FanLowCommand(ceilingFan);

        DoorOpenCommand gDoorOpen = new DoorOpenCommand(garageDoor);
        DoorCloseCommand gDoorClose = new DoorCloseCommand(garageDoor);

        StereoOnCommand sOn = new StereoOnCommand(stereo);
        StereoOffCommand sOff = new StereoOffCommand(stereo);

        remote.getCommand(lLightOn);
        remote.getCommand(lLightOff);

        remote.getCommand(kLightOn);
        remote.getCommand(kLightOff);

        remote.getCommand(cFanHigh);
        remote.getCommand(cFanLow);

        remote.getCommand(gDoorOpen);
        remote.getCommand(gDoorClose);

        remote.getCommand(sOn);
        remote.getCommand(sOff);

        remote.useCommand();


    }
}
