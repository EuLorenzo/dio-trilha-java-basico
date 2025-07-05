import MusicPlayer.MusicPlayer;
import Navegator.Navegator;
import TelephoneDevice.TelephoneDevice;
import exceptions.DoNotMatchException;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws DoNotMatchException {
        final Iphone iphone = new Iphone();

        while(true){
            System.out.println("========Iphone========");
            System.out.println("1 - Abrir Itunes");
            System.out.println("2 - Abrir Safari");
            System.out.println("3 - Abrir Telefone");
            System.out.println("4 - Desligar");
            var userInput = s.nextInt();

            try{
                if(userInput == 4) break;

                switch(userInput){
                    case 1 -> ItunesMethods(iphone);
                    case 2 -> SafariMethods(iphone);
                    case 3 -> TelephoneMethods(iphone);
                    default -> throw new DoNotMatchException("Está opção não existe!");
                }
            } catch (DoNotMatchException e) {
                System.out.println(e.getMessage());
            }
        }

    }

    static void ItunesMethods(Iphone iphone) throws DoNotMatchException {
        MusicPlayer musicPlayer = iphone.musicPlayer;

        System.out.println("1 - Tocar música");
        System.out.println("2 - Parar música");
        System.out.println("3 - Selecionar música");
        System.out.println("4 - Qual música está tocando ?");
        int userInput = s.nextInt();

        switch (userInput){
            case 1 -> musicPlayer.playMusic();
            case 2 -> musicPlayer.stopMusic();
            case 3 -> {
                System.out.print("Digite o nome do musica: ");
                //Utilizado aqui para limpar o /n do buffer
                //Sem isto, o código não pega a linha
                s.nextLine();
                String music = s.nextLine();
                musicPlayer.selectMusic(music);
            }
            case 4 -> musicPlayer.getCurrentMusic();
            default -> throw new DoNotMatchException("Essa opção não existe");
        }

    }


    static void SafariMethods(Iphone iphone) throws DoNotMatchException {
        Navegator safari = iphone.navegator;
        System.out.println("1 - Recarregar página");
        System.out.println("2 - Nova aba");
        System.out.println("3 - Abrir página");
        int userInput = s.nextInt();

        switch (userInput){
            case 1 -> safari.refreshPage();
            case 2 -> safari.addNewTab();
            case 3 -> {
                System.out.print("Qual site, deseja abrir: ");
                //Mesma coisa que na linha 52 ....
                s.nextLine();
                String site = s.nextLine();
                safari.openPage(site);
            }
            default -> throw new DoNotMatchException("Essa opção não existe");
        }
    }

    static void TelephoneMethods(Iphone iphone) throws DoNotMatchException {
        TelephoneDevice telephoneDevice = iphone.telephoneDevice;

        System.out.println("1 - Começar VoiceMail");
        System.out.println("2 - Atender telefone");
        System.out.println("3 - Ligar");
        int userInput = s.nextInt();

        switch (userInput){
            case 1 -> telephoneDevice.initiateVoiceMail();
            case 2 -> telephoneDevice.answer();
            case 3 -> {
                System.out.print("Número à ligar: ");
                //O mesmo que na linha 52 ....
                s.nextLine();
                String number = s.nextLine();
                telephoneDevice.call(number);
            }
            default -> throw new DoNotMatchException("Essa opção não existe");
        }
    }
}