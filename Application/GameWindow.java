package ru.geekbrains.Application;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {

    private int width = 1000;
    private int height = 600;
    private int posX = 300;
    private int posY = 150;

    private JButton buttonStart;
    private JButton buttonExit;
    private JPanel mainToolsPanel;
    private JPanel settPanel;

    private Map map;

        GameWindow() {

            prepareWindow();
            prepareToolsPanel();
            prepareButtons();
            prepareSettingsPanel();


            map = new Map();

            mainToolsPanel.add(settPanel,BorderLayout.NORTH);
            add(mainToolsPanel, BorderLayout.EAST);
            add(map);

           // add(buttonStart, BorderLayout.NORTH) ;  // видно только выход,  тк старт за  выходом
           // add(buttonExit,BorderLayout.WEST);   // для настройки менеджер компоновки  BorderLayOut(5 part)

            setVisible(true);

        }
        private void prepareWindow() {
        setSize(width, height);
        setLocation(posX, posY);
        setTitle("Application");
        setBackground(Color.red);
        setResizable(false); //запретили пользователю менять размер
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void prepareToolsPanel() {
            mainToolsPanel = new JPanel();
            mainToolsPanel.setBackground(Color.CYAN);
            mainToolsPanel.setLayout(new GridLayout(2,1));
        }
        private void prepareButtons() {
            buttonStart = new JButton("Push to start");
            buttonExit = new JButton("Push to END");
        }
        private void prepareSettingsPanel() {
            settPanel = new JPanel();
            mainToolsPanel.setBackground(Color.PINK);
            settPanel.setLayout(new GridLayout(4,1));

            settPanel.add(buttonStart);
            settPanel.add(buttonExit);
        }
    }


