public class Usuario {
    
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo Status -> TV Ligada? " + smartTv.ligada);

        smartTv.diminuirVolume ();
        smartTv.diminuirVolume ();
        smartTv.diminuirVolume ();
        smartTv.aumentarVolume ();
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.mudarCanal(27);
        System.out.println("Canal atual: " + smartTv.canal);


    }

}