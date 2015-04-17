package eu.maurosabatino.openweather.exception;

public class IconNotFoundException extends Exception {
    public IconNotFoundException(){
        super("Icon for weather not found");
    }

}
