package com.company;

import com.company.BehavioralTemplate.MoveListTemplate;
import com.company.BehavioralTemplate.ScorpionMoveList;
import com.company.BehavioralTemplate.SubzeroMoveList;
import com.company.Creational.*;
import com.company.Structural.Bridge.*;
import com.company.Structural.Adapter.*;
import com.company.Structural.Decorator.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to Death Arena. Choose your fighter");

        TimerSingleton timer = TimerSingleton.getInstance();
        timer.startCountdown();

        SubzeroController subzeroController = new SubzeroController();
        ScorpionController scorpionController = new ScorpionController();

        /// Player 1 select fighter
        FighterAbstractFactory playerFactory1 = FighterFactoryProducer.getPlayerFactory(1);

        System.out.println("Player1 Select Fighter: \n Scorpion/Subzero");
        String fighter1name = input.readLine();

        FighterFactory fighterFactory1 = new FighterFactory();
        //get an object of Fighter and call its select method.
        Fighter fighter1 = playerFactory1.getFighter(fighter1name);
        fighter1.select();

            //Select costume
        System.out.println("Player1 Select Costume Type (A/B):");
        String fighter1costume = input.readLine();
        fighter1.costume(fighter1costume);

        ///DECORATOR pattern
        Costume costume1 = new CostumeDecorator(new ColorPalleteDecorator(new AuraDecorator(new BaseCostume())));
        System.out.println(costume1.chooseCostume());

        // Bridge: Assign Player to character
        Player1 player1 = null;
        if (fighter1name.equalsIgnoreCase("Subzero")) {
            player1 = new Player1(subzeroController);
        } else if (fighter1name.equalsIgnoreCase("Scorpion")) {
            player1 = new Player1(scorpionController);
        } else {
            System.out.println("Wrong player");
        }
        TimeUnit.SECONDS.sleep(2);


        /// Player 2 select fighter
        FighterAbstractFactory playerFactory2 = FighterFactoryProducer.getPlayerFactory(2);

        System.out.println("\n Player2 Select Fighter: \n Scorpion/Subzero");
        String fighter2name = input.readLine();

        FighterFactory fighterFactory2 = new FighterFactory();
        //get an object of Fighter and call its select method.
        Fighter fighter2 = playerFactory2.getFighter(fighter2name);
        fighter2.select();

        //Select costume
        System.out.println("Player2 Select Costume Type (A/B):");
        String fighter2costume = input.readLine();
        fighter2.costume(fighter2costume);

        ///DECORATOR pattern
        Costume costume2 = new CostumeDecorator(new AuraDecorator(new ColorPalleteDecorator(new BaseCostume())));
        System.out.println(costume2.chooseCostume());

        // Bridge: Assign Player to character
        Player2 player2 = null;
        if(fighter2name.equalsIgnoreCase("Subzero")) {
            player2 = new Player2(subzeroController);
        } else if(fighter2name.equalsIgnoreCase("Scorpion")) {
            player2 = new Player2(scorpionController);
        } else {
            System.out.println("Wrong player");
        }

        System.out.println("....................");

        System.out.println("FIGHT!");
        System.out.println(". \n. \n");
        TimeUnit.SECONDS.sleep(2);

        System.out.println("Player 1's turn!");
        player1.doCombo1();
        System.out.println("Player 1's hit dealt damage!");
        System.out.println(". \n. \n");
        TimeUnit.SECONDS.sleep(2);

        System.out.println("Player 2's turn!");
        player2.doCombo2();
        player2.doCombo1();
        System.out.println("Player 2's hit dealt big damage!");
        System.out.println(". \n. \n");
        TimeUnit.SECONDS.sleep(2);

        System.out.println("Player 1's turn!");
        player1.doCombo1();
        player1.doCombo2();
        player1.doSpecialCombo();
        System.out.println("Player 1's hit dealt HUGE damage!");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("KO!");
        System.out.println(". \n. \n");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("Player 1 WINS!");


        /// ADAPTER
        System.out.println("SPECIAL EVENT!!! DC VS Mortal Kombat!");
        MKUniverse battleField = new MKUniverse(1000);
        MKCharacter mkCharacter = new MKCharacter(900);

        if (battleField.compatible(mkCharacter)) {
            System.out.println("This MK Character with power is compatible with the universe!");
        }

        DCCharacter dcCharacterHarley = new DCCharacter(600);
        DCCharacter dcCharacterSuperman = new DCCharacter(99999);

        // Adapter will convert DC's force to MK Universe power
        DCVsMortalKombatAdapter dcHarleyAdaptor = new DCVsMortalKombatAdapter(dcCharacterHarley);
        DCVsMortalKombatAdapter dcSupermanAdaptor = new DCVsMortalKombatAdapter(dcCharacterSuperman);
        if (battleField.compatible(dcHarleyAdaptor)) {
            System.out.println("Harley Quinn's force to Mortal Kombat power! Ready to kick some MK a88!");
        } else {
            System.out.println("Harley Quinn's force seems to high to Mortal Kombat power! She  was kicked for cheating!");
        }

        if (battleField.compatible(dcSupermanAdaptor)) {
            System.out.println("Superman's force seems weak today...Welcome to Mortal Kombat!");
        } else {
            System.out.println("Superman's force is not compatible with Mortal Kombat power!");
        }

        System.out.println("DC VS Mortal Kombat!");


        System.out.println("NEW ROUND FOR TEMPLATE PATTERN!");
        MoveListTemplate scorpion = new ScorpionMoveList();
        scorpion.performCombo1();
        MoveListTemplate subzero = new SubzeroMoveList();
        subzero.performCombo1();
    }
}
