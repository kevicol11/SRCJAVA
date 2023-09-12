package device;

public class Television implements ElectronicaDevice {
    private int volumen = 0 ;
    private String name;

    public Television (String name){
    this.name = name ;

}

    @Override
    public void off() {
        System.out.println(name + " televisor prender ");
        
    }

    @Override
    public void on() {
        System.out.println(name + " televisor apagar ");
        
    }

    @Override
    public void volumenUp() {
        volumen++;
        System.out.println(name + " televisro subir volumen " + volumen);
        
    }

    @Override
    public void volumenDum() {
       volumen--;
        System.out.println(name + " televisro bajar volumen " + volumen);
    }
}