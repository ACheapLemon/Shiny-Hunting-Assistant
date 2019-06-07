package shinyhunting;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

/**
 *
 * @author A Cheap Lemon
 */
public class ShinyHunting extends javax.swing.JFrame {

    public ShinyHunting() {
        initComponents();
    }

    // Initialise variables
    int dNChain = 0, dNCount = 0;
    int fChain = 0, sChain = 0;
    int gscCount = 0;
    double gsc1male = 50, gsc1female = 50, gsc2male = 50, gsc2female = 50;
    int cCount = 0, cChance = 8192, staticChance = 8192, shinyChance = 2731;
    private static DecimalFormat noDec = new DecimalFormat("#");
    private static DecimalFormat fourDec = new DecimalFormat("#.####");

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        staticButtonGroup = new javax.swing.ButtonGroup();
        tabs = new javax.swing.JTabbedPane();
        dexNav = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dexNavChain = new javax.swing.JTextField();
        dexNavCounter = new javax.swing.JTextField();
        dexNavChainMinus = new javax.swing.JButton();
        dexNavCounterMinus = new javax.swing.JButton();
        dexNavPlus = new javax.swing.JButton();
        dexNavChainReset = new javax.swing.JButton();
        dexNavCounterReset = new javax.swing.JButton();
        dexNavCharm = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        dNText = new javax.swing.JTextArea();
        dexNavChainPlusS = new javax.swing.JButton();
        dexNavCounterPlusS = new javax.swing.JButton();
        chainFishing = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        fishingChain = new javax.swing.JTextField();
        fishingCharm = new javax.swing.JCheckBox();
        fishingMinus = new javax.swing.JButton();
        fishingPlus = new javax.swing.JButton();
        fishingReset = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        fishingText = new javax.swing.JTextArea();
        sosChaining = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        sosChain = new javax.swing.JTextField();
        sosMinus = new javax.swing.JButton();
        sosPlus = new javax.swing.JButton();
        sosReset = new javax.swing.JButton();
        sosCharm = new javax.swing.JCheckBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        sosText = new javax.swing.JTextArea();
        gscBreed = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        gsc1Shiny = new javax.swing.JRadioButton();
        gsc1Ditto = new javax.swing.JRadioButton();
        gsc2Shiny = new javax.swing.JRadioButton();
        gsc2Ditto = new javax.swing.JRadioButton();
        gsc2Male = new javax.swing.JTextField();
        gsc2Female = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        gscBreedText = new javax.swing.JTextArea();
        gscCounter = new javax.swing.JTextField();
        gscMinus = new javax.swing.JButton();
        gscPlus = new javax.swing.JButton();
        gscReset = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        custom = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        customCount = new javax.swing.JTextField();
        customMinus = new javax.swing.JButton();
        customPlus = new javax.swing.JButton();
        customReset = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        customText = new javax.swing.JTextArea();
        customChance = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        staticOdds = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        staticNormal2to5 = new javax.swing.JRadioButton();
        staticNormal6 = new javax.swing.JRadioButton();
        staticMasuda4 = new javax.swing.JRadioButton();
        staticMasuda5 = new javax.swing.JRadioButton();
        staticMasuda6 = new javax.swing.JRadioButton();
        staticFriendSafari = new javax.swing.JRadioButton();
        staticHorde = new javax.swing.JRadioButton();
        staticCharm = new javax.swing.JCheckBox();
        staticImport = new javax.swing.JButton();
        shinyOdds = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        shinyNormal2to5 = new javax.swing.JRadioButton();
        shinyNormal6 = new javax.swing.JRadioButton();
        shinyMasuda5 = new javax.swing.JRadioButton();
        shinyMasuda6 = new javax.swing.JRadioButton();
        shinyFriendSafari = new javax.swing.JRadioButton();
        shinyHorde = new javax.swing.JRadioButton();
        shinyCharm = new javax.swing.JCheckBox();
        shinyImport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Shiny Hunting Assistant v0.3 - Created by A Cheap Lemon");
        setMinimumSize(new java.awt.Dimension(400, 600));
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jLabel1.setText("DexNav Chain");

        jLabel2.setText("Search Level");

        dexNavChain.setText("0");
        dexNavChain.setToolTipText("Your Current Chain Length");
        dexNavChain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dexNavChainActionPerformed(evt);
            }
        });

        dexNavCounter.setText("0");
        dexNavCounter.setToolTipText("Your Current DexNav Search Level");
        dexNavCounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dexNavCounterActionPerformed(evt);
            }
        });

        dexNavChainMinus.setText("-");
        dexNavChainMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dexNavChainMinusActionPerformed(evt);
            }
        });

        dexNavCounterMinus.setText("-");
        dexNavCounterMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dexNavCounterMinusActionPerformed(evt);
            }
        });

        dexNavPlus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dexNavPlus.setText("+");
        dexNavPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dexNavPlusActionPerformed(evt);
            }
        });

        dexNavChainReset.setText("Reset Chain");
        dexNavChainReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dexNavChainResetActionPerformed(evt);
            }
        });

        dexNavCounterReset.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        dexNavCounterReset.setText("Reset Level");
        dexNavCounterReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dexNavCounterResetActionPerformed(evt);
            }
        });

        dexNavCharm.setText("Shiny Charm");
        dexNavCharm.setAlignmentX(0.5F);
        dexNavCharm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dexNavCharm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dexNavCharmActionPerformed(evt);
            }
        });

        dNText.setEditable(false);
        dNText.setColumns(20);
        dNText.setLineWrap(true);
        dNText.setRows(5);
        dNText.setText("Forced Shiny Chance = 0%\nTotal Shiny Chance = 0.0244% or approximately 1/4096\n\nSearch Level At 50% Chance = 579\nSearch Level At 90% Chance = >999\nCumulative % = 0\n\n0-Star Potential: ?\n1-Star Potential: ?\n2-Star Potential: ?\n3-Star Potential: ?\n10 Level Boost: 4%\nAdditional Levels: 0\n\nEgg Move as first move: 21%\nHidden Ability: 0%");
        dNText.setWrapStyleWord(true);
        jScrollPane1.setViewportView(dNText);

        dexNavChainPlusS.setText("+");
        dexNavChainPlusS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dexNavChainPlusSActionPerformed(evt);
            }
        });

        dexNavCounterPlusS.setText("+");
        dexNavCounterPlusS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dexNavCounterPlusSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dexNavLayout = new javax.swing.GroupLayout(dexNav);
        dexNav.setLayout(dexNavLayout);
        dexNavLayout.setHorizontalGroup(
            dexNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dexNavLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dexNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dexNavLayout.createSequentialGroup()
                        .addGroup(dexNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(dexNavLayout.createSequentialGroup()
                                .addGap(0, 103, Short.MAX_VALUE)
                                .addGroup(dexNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(dexNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dexNavChain, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dexNavCounter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(dexNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dexNavChainMinus)
                                    .addComponent(dexNavCounterMinus))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(dexNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dexNavChainPlusS)
                                    .addComponent(dexNavCounterPlusS))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dexNavPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 104, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dexNavLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(dexNavCounterReset)
                        .addGap(18, 18, 18)
                        .addComponent(dexNavChainReset)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(dexNavLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dexNavCharm, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        dexNavLayout.setVerticalGroup(
            dexNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dexNavLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(dexNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(dexNavPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(dexNavLayout.createSequentialGroup()
                        .addComponent(dexNavChainPlusS)
                        .addGap(10, 10, 10)
                        .addComponent(dexNavCounterPlusS))
                    .addGroup(dexNavLayout.createSequentialGroup()
                        .addComponent(dexNavChainMinus)
                        .addGap(10, 10, 10)
                        .addComponent(dexNavCounterMinus))
                    .addGroup(dexNavLayout.createSequentialGroup()
                        .addComponent(dexNavChain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(dexNavCounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dexNavLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dexNavLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dexNavChainReset, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dexNavCounterReset, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dexNavCharm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("DexNav", dexNav);

        chainFishing.setMaximumSize(new java.awt.Dimension(328, 92));
        chainFishing.setMinimumSize(new java.awt.Dimension(328, 92));

        jLabel3.setText("Chain Length");

        fishingChain.setText("0");
        fishingChain.setToolTipText("Your Current Chain Length");
        fishingChain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fishingChainActionPerformed(evt);
            }
        });

        fishingCharm.setText("Shiny Charm");
        fishingCharm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fishingCharm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fishingCharmActionPerformed(evt);
            }
        });

        fishingMinus.setText("-");
        fishingMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fishingMinusActionPerformed(evt);
            }
        });

        fishingPlus.setText("+");
        fishingPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fishingPlusActionPerformed(evt);
            }
        });

        fishingReset.setText("Reset Chain");
        fishingReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fishingResetActionPerformed(evt);
            }
        });

        fishingText.setEditable(false);
        fishingText.setColumns(20);
        fishingText.setLineWrap(true);
        fishingText.setRows(5);
        fishingText.setText("Shiny Chance = 0.0244% or approximately 1/4096\n\nChain At 50% Chance = 80\nChain At 90% Chance = 241\nCumulative % = 0%");
        fishingText.setWrapStyleWord(true);
        jScrollPane2.setViewportView(fishingText);

        javax.swing.GroupLayout chainFishingLayout = new javax.swing.GroupLayout(chainFishing);
        chainFishing.setLayout(chainFishingLayout);
        chainFishingLayout.setHorizontalGroup(
            chainFishingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chainFishingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(chainFishingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(chainFishingLayout.createSequentialGroup()
                        .addGap(0, 143, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(chainFishingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(chainFishingLayout.createSequentialGroup()
                                .addComponent(fishingChain, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(fishingMinus))
                            .addComponent(fishingReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fishingCharm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fishingPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 143, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        chainFishingLayout.setVerticalGroup(
            chainFishingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chainFishingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(chainFishingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fishingChain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fishingMinus)
                    .addComponent(fishingPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fishingReset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fishingCharm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("Chain Fishing", chainFishing);

        jLabel4.setText("Chain Length");

        sosChain.setText("0");
        sosChain.setToolTipText("Your Current SOS Chain Length");
        sosChain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sosChainActionPerformed(evt);
            }
        });

        sosMinus.setText("-");
        sosMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sosMinusActionPerformed(evt);
            }
        });

        sosPlus.setText("+");
        sosPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sosPlusActionPerformed(evt);
            }
        });

        sosReset.setText("Reset Chain");
        sosReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sosResetActionPerformed(evt);
            }
        });

        sosCharm.setText("Shiny Charm");
        sosCharm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sosCharm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sosCharmActionPerformed(evt);
            }
        });

        sosText.setEditable(false);
        sosText.setColumns(20);
        sosText.setLineWrap(true);
        sosText.setRows(5);
        sosText.setText("Shiny Chance = 0.0244% or approximately 1/4096\n\nChain At 50% Chance = 237\nChain At 90% Chance = 744\nCumulative % = 0%\n\nMinimum Perfect IVs = 0\nHidden Ability Chance = 0%");
        sosText.setWrapStyleWord(true);
        jScrollPane4.setViewportView(sosText);

        javax.swing.GroupLayout sosChainingLayout = new javax.swing.GroupLayout(sosChaining);
        sosChaining.setLayout(sosChainingLayout);
        sosChainingLayout.setHorizontalGroup(
            sosChainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sosChainingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sosChainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(sosChainingLayout.createSequentialGroup()
                        .addGap(0, 143, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(sosChainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sosCharm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(sosChainingLayout.createSequentialGroup()
                                .addComponent(sosChain, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sosMinus))
                            .addComponent(sosReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sosPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 143, Short.MAX_VALUE)))
                .addContainerGap())
        );
        sosChainingLayout.setVerticalGroup(
            sosChainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sosChainingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(sosChainingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(sosChain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sosMinus)
                    .addComponent(sosPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sosReset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sosCharm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("SOS Battles", sosChaining);

        gscBreed.setMaximumSize(new java.awt.Dimension(328, 92));
        gscBreed.setMinimumSize(new java.awt.Dimension(328, 92));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Male Pokémon");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Female Pokémon");

        jLabel11.setText("Male %");

        jLabel12.setText("Female %");

        jLabel13.setText("Egg Count");

        gsc1Shiny.setText("Shiny");
        gsc1Shiny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gsc1ShinyActionPerformed(evt);
            }
        });

        gsc1Ditto.setText("Ditto?");
        gsc1Ditto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gsc1DittoActionPerformed(evt);
            }
        });

        gsc2Shiny.setText("Shiny");
        gsc2Shiny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gsc2ShinyActionPerformed(evt);
            }
        });

        gsc2Ditto.setText("Ditto?");
        gsc2Ditto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gsc2DittoActionPerformed(evt);
            }
        });

        gsc2Male.setText("50");
        gsc2Male.setToolTipText("Your Current Chain Length");
        gsc2Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gsc2MaleActionPerformed(evt);
            }
        });

        gsc2Female.setText("50");
        gsc2Female.setToolTipText("Your Current Chain Length");
        gsc2Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gsc2FemaleActionPerformed(evt);
            }
        });

        gscBreedText.setEditable(false);
        gscBreedText.setColumns(20);
        gscBreedText.setLineWrap(true);
        gscBreedText.setRows(5);
        gscBreedText.setText("Shiny Chance = 0.0122% or approximately 1/8192\n\nEggs Until 50% Chance = 5678\nEggs Until 90% Chance = 18862\nCumulative % = 0");
        gscBreedText.setWrapStyleWord(true);
        gscBreedText.setAutoscrolls(false);
        jScrollPane5.setViewportView(gscBreedText);

        gscCounter.setText("0");
        gscCounter.setToolTipText("Your Current SOS Chain Length");
        gscCounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gscCounterActionPerformed(evt);
            }
        });

        gscMinus.setText("-");
        gscMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gscMinusActionPerformed(evt);
            }
        });

        gscPlus.setText("+");
        gscPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gscPlusActionPerformed(evt);
            }
        });

        gscReset.setText("Reset");
        gscReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gscResetActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Offspring (Female Species)");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout gscBreedLayout = new javax.swing.GroupLayout(gscBreed);
        gscBreed.setLayout(gscBreedLayout);
        gscBreedLayout.setHorizontalGroup(
            gscBreedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gscBreedLayout.createSequentialGroup()
                .addGroup(gscBreedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gscBreedLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane5))
                    .addGroup(gscBreedLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(gscBreedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(gscBreedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(gscBreedLayout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(gsc2Female, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(gscBreedLayout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(gsc2Male, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(gscBreedLayout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addGroup(gscBreedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addGroup(gscBreedLayout.createSequentialGroup()
                        .addComponent(gsc1Shiny)
                        .addGap(18, 18, 18)
                        .addComponent(gsc1Ditto)))
                .addGap(115, 115, 115)
                .addGroup(gscBreedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gscBreedLayout.createSequentialGroup()
                        .addComponent(gsc2Shiny)
                        .addGap(18, 18, 18)
                        .addComponent(gsc2Ditto))
                    .addComponent(jLabel10))
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gscBreedLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(gscReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(gscBreedLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gscCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gscMinus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gscPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        gscBreedLayout.setVerticalGroup(
            gscBreedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gscBreedLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(gscBreedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gscBreedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gsc2Shiny)
                    .addComponent(gsc2Ditto)
                    .addComponent(gsc1Ditto)
                    .addComponent(gsc1Shiny))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gscBreedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(gsc2Male, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gscBreedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(gsc2Female, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gscBreedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(gscCounter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gscMinus)
                    .addComponent(gscPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gscReset, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("Gen II Breeding", gscBreed);

        custom.setMaximumSize(new java.awt.Dimension(328, 92));
        custom.setMinimumSize(new java.awt.Dimension(328, 92));

        jLabel5.setText("Encounters");

        customCount.setText("0");
        customCount.setToolTipText("Your Current Number Of Encounters");
        customCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customCountActionPerformed(evt);
            }
        });

        customMinus.setText("-");
        customMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customMinusActionPerformed(evt);
            }
        });

        customPlus.setText("+");
        customPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customPlusActionPerformed(evt);
            }
        });

        customReset.setText("Reset");
        customReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customResetActionPerformed(evt);
            }
        });

        customText.setEditable(false);
        customText.setColumns(20);
        customText.setLineWrap(true);
        customText.setRows(5);
        customText.setText("Shiny Chance = 0.0122%\n\nEncounters Until 50% Chance = 5678\nEncounters Until 90% Chance = 18862\nCumulative % = 0");
        customText.setWrapStyleWord(true);
        jScrollPane3.setViewportView(customText);

        customChance.setText("8192");
        customChance.setToolTipText("Current Chance of Finding a Shiny (eg. 8192, 4096, etc.)");
        customChance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customChanceActionPerformed(evt);
            }
        });

        jLabel6.setText("Shiny Chance   1/");

        javax.swing.GroupLayout customLayout = new javax.swing.GroupLayout(custom);
        custom.setLayout(customLayout);
        customLayout.setHorizontalGroup(
            customLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(customLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customChance, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(customLayout.createSequentialGroup()
                        .addGap(0, 144, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(customCount, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customMinus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(customPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 144, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(customLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(customReset, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        customLayout.setVerticalGroup(
            customLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(customCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customMinus)
                    .addComponent(customPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(customLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(customChance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customReset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("Custom", custom);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Normal Encounters/Soft Resets (Gen 2-5)");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Normal Encounters/Soft Resets (Gen 6+)");
        jLabel15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Masuda Method (Gen 4)");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Masuda Method (Gen 5)");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Masuda Method (Gen 6+)");
        jLabel20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Friend Safari (XY)");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Horde Encounters (Gen 6)");
        jLabel19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        staticButtonGroup.add(staticNormal2to5);
        staticNormal2to5.setSelected(true);
        staticNormal2to5.setText("Shiny Chance = 0.0122% or approximately 1/8192");
        staticNormal2to5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        staticNormal2to5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staticNormal2to5ActionPerformed(evt);
            }
        });

        staticButtonGroup.add(staticNormal6);
        staticNormal6.setText("Shiny Chance = 0.0244% or approximately 1/4096");
        staticNormal6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        staticNormal6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staticNormal6ActionPerformed(evt);
            }
        });

        staticButtonGroup.add(staticMasuda4);
        staticMasuda4.setText("Shiny Chance = 0.061% or approximately 1/1639");
        staticMasuda4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        staticMasuda4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staticMasuda4ActionPerformed(evt);
            }
        });

        staticButtonGroup.add(staticMasuda5);
        staticMasuda5.setText("Shiny Chance = 0.0732% or approximately 1/1366");
        staticMasuda5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        staticMasuda5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staticMasuda5ActionPerformed(evt);
            }
        });

        staticButtonGroup.add(staticMasuda6);
        staticMasuda6.setText("Shiny Chance = 0.1465% or approximately 1/683");
        staticMasuda6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        staticMasuda6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staticMasuda6ActionPerformed(evt);
            }
        });

        staticButtonGroup.add(staticFriendSafari);
        staticFriendSafari.setText("Shiny Chance = 0.1221% or approximately 1/819");
        staticFriendSafari.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        staticFriendSafari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staticFriendSafariActionPerformed(evt);
            }
        });

        staticButtonGroup.add(staticHorde);
        staticHorde.setText("Shiny Chance = 0.1219% or approximately 1/820");
        staticHorde.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        staticHorde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staticHordeActionPerformed(evt);
            }
        });

        staticCharm.setText("Shiny Charm");
        staticCharm.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        staticCharm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staticCharmActionPerformed(evt);
            }
        });

        staticImport.setText("Import to Custom Tab");
        staticImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staticImportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout staticOddsLayout = new javax.swing.GroupLayout(staticOdds);
        staticOdds.setLayout(staticOddsLayout);
        staticOddsLayout.setHorizontalGroup(
            staticOddsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staticOddsLayout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addGroup(staticOddsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(staticMasuda5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(staticMasuda4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(staticNormal6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(staticNormal2to5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(staticMasuda6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(staticFriendSafari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(staticHorde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(staticOddsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(staticImport)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(staticOddsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(staticCharm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        staticOddsLayout.setVerticalGroup(
            staticOddsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staticOddsLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(staticCharm)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(staticNormal2to5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(staticNormal6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(staticMasuda4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(staticMasuda5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(staticMasuda6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(staticFriendSafari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(staticHorde)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(staticImport)
                .addGap(50, 50, 50))
        );

        tabs.addTab("Static Shiny Odds", staticOdds);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Normal Encounters/Soft Resets (B2W2)");
        jLabel14.setFocusable(false);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Normal Encounters/Soft Resets (Gen 6+)");
        jLabel21.setFocusable(false);

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Masuda Method (B2W2)");
        jLabel23.setFocusable(false);

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Masuda Method (Gen 6+)");
        jLabel24.setFocusable(false);

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Friend Safari (XY)");
        jLabel25.setFocusable(false);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Horde Encounters (Gen 6)");
        jLabel26.setFocusable(false);

        staticButtonGroup.add(shinyNormal2to5);
        shinyNormal2to5.setText("Shiny Chance = 0.0366% or approximately 1/2731");
        shinyNormal2to5.setFocusable(false);
        shinyNormal2to5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shinyNormal2to5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shinyNormal2to5ActionPerformed(evt);
            }
        });

        staticButtonGroup.add(shinyNormal6);
        shinyNormal6.setText("Shiny Chance = 0.0732% or approximately 1/1366");
        shinyNormal6.setFocusable(false);
        shinyNormal6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shinyNormal6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shinyNormal6ActionPerformed(evt);
            }
        });

        staticButtonGroup.add(shinyMasuda5);
        shinyMasuda5.setText("Shiny Chance = 0.0976% or approximately 1/1024");
        shinyMasuda5.setFocusable(false);
        shinyMasuda5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shinyMasuda5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shinyMasuda5ActionPerformed(evt);
            }
        });

        staticButtonGroup.add(shinyMasuda6);
        shinyMasuda6.setText("Shiny Chance = 0.1953% or approximately 1/512");
        shinyMasuda6.setFocusable(false);
        shinyMasuda6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shinyMasuda6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shinyMasuda6ActionPerformed(evt);
            }
        });

        staticButtonGroup.add(shinyFriendSafari);
        shinyFriendSafari.setText("Shiny Chance = 0.1709% or approximately 1/585");
        shinyFriendSafari.setFocusable(false);
        shinyFriendSafari.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shinyFriendSafari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shinyFriendSafariActionPerformed(evt);
            }
        });

        staticButtonGroup.add(shinyHorde);
        shinyHorde.setText("Shiny Chance = 0.3655% or approximately 1/274");
        shinyHorde.setFocusable(false);
        shinyHorde.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shinyHorde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shinyHordeActionPerformed(evt);
            }
        });

        shinyCharm.setSelected(true);
        shinyCharm.setText("Shiny Charm");
        shinyCharm.setFocusable(false);
        shinyCharm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        shinyCharm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shinyCharmActionPerformed(evt);
            }
        });

        shinyImport.setText("Import to Custom Tab");
        shinyImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shinyImportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout shinyOddsLayout = new javax.swing.GroupLayout(shinyOdds);
        shinyOdds.setLayout(shinyOddsLayout);
        shinyOddsLayout.setHorizontalGroup(
            shinyOddsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shinyOddsLayout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addGroup(shinyOddsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(shinyNormal2to5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shinyNormal6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shinyMasuda5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shinyMasuda6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shinyFriendSafari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shinyHorde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(shinyOddsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(shinyCharm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(shinyOddsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(shinyImport)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        shinyOddsLayout.setVerticalGroup(
            shinyOddsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(shinyOddsLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(shinyCharm)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shinyNormal2to5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shinyNormal6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shinyMasuda5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shinyMasuda6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shinyFriendSafari)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(shinyHorde)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(shinyImport)
                .addGap(50, 50, 50))
        );

        tabs.addTab("Static Shiny Odds", shinyOdds);

        staticOdds.setName("Static Shiny Odds");
        shinyOdds.setName("Static Shiny Odds");
        tabs.remove(shinyOdds);

        getContentPane().add(tabs);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customChanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customChanceActionPerformed
        cChance = Integer.parseInt(customChance.getText());
        if (cChance > 99999999) {
            cChance = 99999999;
        }
        customChance.setText(String.valueOf(cChance));
        cRecalculate();
    }//GEN-LAST:event_customChanceActionPerformed
    private void customResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customResetActionPerformed
        cCount = 0;
        customCount.setText("0");
        cRecalculate();
    }//GEN-LAST:event_customResetActionPerformed
    private void customPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customPlusActionPerformed
        cCount++;
        if (cCount > 999999) {
            cCount = 999999;
        }
        customCount.setText(String.valueOf(cCount));
        cRecalculate();
    }//GEN-LAST:event_customPlusActionPerformed
    private void customMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customMinusActionPerformed
        if (cCount > 0) {
            cCount--;
        }
        customCount.setText(String.valueOf(cCount));
        cRecalculate();
    }//GEN-LAST:event_customMinusActionPerformed
    private void customCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customCountActionPerformed
        if (Double.parseDouble(customCount.getText()) > 999999) {
            cCount = 999999;
            customCount.setText("999999");
        } else if (Double.parseDouble(customCount.getText()) < 0) {
            cCount = 0;
        } else {
            cCount = Integer.parseInt(customCount.getText());
        }
        customCount.setText(String.valueOf(cCount));
        cRecalculate();
    }//GEN-LAST:event_customCountActionPerformed

    private void fishingResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fishingResetActionPerformed
        fChain = 0;
        fishingChain.setText("0");
        fRecalculate();
    }//GEN-LAST:event_fishingResetActionPerformed
    private void fishingPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fishingPlusActionPerformed
        fChain++;
        if (fChain > 99999) {
            fChain = 99999;
        }
        fishingChain.setText(String.valueOf(fChain));
        fRecalculate();
    }//GEN-LAST:event_fishingPlusActionPerformed
    private void fishingMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fishingMinusActionPerformed
        if (fChain > 0) {
            fChain--;
        }
        fishingChain.setText(String.valueOf(fChain));
        fRecalculate();
    }//GEN-LAST:event_fishingMinusActionPerformed
    private void fishingCharmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fishingCharmActionPerformed
        fRecalculate();
    }//GEN-LAST:event_fishingCharmActionPerformed
    private void fishingChainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fishingChainActionPerformed
        if (Double.parseDouble(fishingChain.getText()) > 99999) {
            fChain = 99999;
            fishingChain.setText("99999");
        } else if (Double.parseDouble(fishingChain.getText()) < 0) {
            fChain = 0;
        } else {
            fChain = Integer.parseInt(fishingChain.getText());
        }
        fishingChain.setText(String.valueOf(fChain));
        fRecalculate();
    }//GEN-LAST:event_fishingChainActionPerformed

    private void dexNavCharmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dexNavCharmActionPerformed
        dNRecalculate();
    }//GEN-LAST:event_dexNavCharmActionPerformed
    private void dexNavCounterResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dexNavCounterResetActionPerformed
        dNCount = 0;
        dexNavCounter.setText("0");
        dNRecalculate();
    }//GEN-LAST:event_dexNavCounterResetActionPerformed
    private void dexNavChainResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dexNavChainResetActionPerformed
        dNChain = 0;
        dexNavChain.setText("0");
        dNRecalculate();
    }//GEN-LAST:event_dexNavChainResetActionPerformed
    private void dexNavPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dexNavPlusActionPerformed
        dNChain++;
        dNCount++;
        if (dNCount > 999) {
            dNCount = 999;
        }
        if (dNChain > 99999) {
            dNChain = 99999;
        }
        dexNavChain.setText(String.valueOf(dNChain));
        dexNavCounter.setText(String.valueOf(dNCount));
        dNRecalculate();
    }//GEN-LAST:event_dexNavPlusActionPerformed
    private void dexNavCounterMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dexNavCounterMinusActionPerformed
        if (dNCount > 0) {
            dNCount--;
        }
        dexNavCounter.setText(String.valueOf(dNCount));
        dNRecalculate();
    }//GEN-LAST:event_dexNavCounterMinusActionPerformed
    private void dexNavChainMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dexNavChainMinusActionPerformed
        if (dNChain > 0) {
            dNChain--;
        }
        dexNavChain.setText(String.valueOf(dNChain));
        dNRecalculate();
    }//GEN-LAST:event_dexNavChainMinusActionPerformed
    private void dexNavCounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dexNavCounterActionPerformed
        if (Double.parseDouble(dexNavCounter.getText()) > 999) {
            dNCount = 999;
        } else if (Double.parseDouble(dexNavCounter.getText()) < 0) {
            dNCount = 0;
        } else {
            dNCount = Integer.parseInt(dexNavCounter.getText());
        }
        dexNavCounter.setText(String.valueOf(dNCount));
        dNRecalculate();
    }//GEN-LAST:event_dexNavCounterActionPerformed
    private void dexNavChainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dexNavChainActionPerformed
        if (Double.parseDouble(dexNavChain.getText()) > 99999) {
            dNChain = 99999;
            dexNavChain.setText("99999");
        } else if (Double.parseDouble(dexNavChain.getText()) < 0) {
            dNChain = 0;
        } else {
            dNChain = Integer.parseInt(dexNavChain.getText());
        }
        dexNavChain.setText(String.valueOf(dNChain));
        dNRecalculate();
    }//GEN-LAST:event_dexNavChainActionPerformed

    private void gsc1ShinyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gsc1ShinyActionPerformed
        gscRecalculate();
    }//GEN-LAST:event_gsc1ShinyActionPerformed
    private void gsc2MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gsc2MaleActionPerformed
        if (Double.parseDouble(gsc2Male.getText()) > 100) {
            gsc2male = 100;
        } else if (Double.parseDouble(gsc2Male.getText()) < 0) {
            gsc2male = 0;
        } else {
            gsc2male = Double.parseDouble(gsc2Male.getText());
        }
        gsc2Male.setText(String.valueOf(gsc2male));
        gsc2Female.setText(String.valueOf(100 - gsc2male));
        gscRecalculate();
    }//GEN-LAST:event_gsc2MaleActionPerformed
    private void gsc2FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gsc2FemaleActionPerformed
        if (Double.parseDouble(gsc2Female.getText()) > 100) {
            gsc2female = 100;
        } else if (Double.parseDouble(gsc2Female.getText()) < 0) {
            gsc2female = 0;
        } else {
            gsc2female = Double.parseDouble(gsc2Female.getText());
        }
        gsc2Female.setText(String.valueOf(gsc2female));
        gsc2Male.setText(String.valueOf(100 - gsc2female));
        gscRecalculate();
    }//GEN-LAST:event_gsc2FemaleActionPerformed
    private void gsc2DittoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gsc2DittoActionPerformed
        gscRecalculate();
    }//GEN-LAST:event_gsc2DittoActionPerformed
    private void gsc2ShinyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gsc2ShinyActionPerformed
        gscRecalculate();
    }//GEN-LAST:event_gsc2ShinyActionPerformed
    private void gsc1DittoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gsc1DittoActionPerformed
        gscRecalculate();
    }//GEN-LAST:event_gsc1DittoActionPerformed
    private void gscCounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gscCounterActionPerformed
        if (Double.parseDouble(gscCounter.getText()) > 99999) {
            gscCount = 99999;
            gscCounter.setText("99999");
        } else if (Double.parseDouble(gscCounter.getText()) < 0) {
            gscCount = 0;
        } else {
            gscCount = Integer.parseInt(gscCounter.getText());
        }
        gscCounter.setText(String.valueOf(gscCount));
        gscRecalculate();
    }//GEN-LAST:event_gscCounterActionPerformed
    private void gscMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gscMinusActionPerformed
        if (gscCount > 0) {
            gscCount--;
        }
        gscCounter.setText(String.valueOf(gscCount));
        gscRecalculate();
    }//GEN-LAST:event_gscMinusActionPerformed
    private void gscPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gscPlusActionPerformed
        gscCount++;
        if (gscCount > 99999) {
            gscCount = 99999;
        }
        gscCounter.setText(String.valueOf(gscCount));
        gscRecalculate();
    }//GEN-LAST:event_gscPlusActionPerformed
    private void gscResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gscResetActionPerformed
        gscCount = 0;
        gscCounter.setText(String.valueOf(gscCount));
        gscRecalculate();
    }//GEN-LAST:event_gscResetActionPerformed

    private void dexNavChainPlusSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dexNavChainPlusSActionPerformed
        dNChain++;
        if (dNChain > 99999) {
            dNChain = 99999;
        }
        dexNavChain.setText(String.valueOf(dNChain));
        dNRecalculate();
    }//GEN-LAST:event_dexNavChainPlusSActionPerformed
    private void dexNavCounterPlusSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dexNavCounterPlusSActionPerformed
        dNCount++;
        if (dNCount > 999) {
            dNCount = 999;
        }
        dexNavCounter.setText(String.valueOf(dNCount));
        dNRecalculate();
    }//GEN-LAST:event_dexNavCounterPlusSActionPerformed

    private void sosCharmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sosCharmActionPerformed
        sRecalculate();
    }//GEN-LAST:event_sosCharmActionPerformed
    private void sosResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sosResetActionPerformed
        sChain = 0;
        sosChain.setText("0");
        sRecalculate();
    }//GEN-LAST:event_sosResetActionPerformed
    private void sosPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sosPlusActionPerformed
        sChain++;
        if (sChain > 99999) {
            sChain = 99999;
        }
        sosChain.setText(String.valueOf(sChain));
        sRecalculate();
    }//GEN-LAST:event_sosPlusActionPerformed
    private void sosMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sosMinusActionPerformed
        if (sChain > 0) {
            sChain--;
        }
        sosChain.setText(String.valueOf(sChain));
        sRecalculate();
    }//GEN-LAST:event_sosMinusActionPerformed
    private void sosChainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sosChainActionPerformed
        if (Double.parseDouble(sosChain.getText()) > 99999) {
            sChain = 99999;
            sosChain.setText("99999");
        } else if (Double.parseDouble(sosChain.getText()) < 0) {
            sChain = 0;
        } else {
            sChain = Integer.parseInt(sosChain.getText());
        }
        sosChain.setText(String.valueOf(sChain));
        sRecalculate();
    }//GEN-LAST:event_sosChainActionPerformed

    private void staticCharmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staticCharmActionPerformed
        staticCharm.setSelected(false);
        tabs.remove(staticOdds);
        tabs.add(shinyOdds);
        shinyCharm.setSelected(true);
        shinyOdds.setName("Static Shiny Odds");
        shinyNormal2to5.setSelected(true);
        staticChance = 2731;
        tabs.setSelectedComponent(shinyOdds);
    }//GEN-LAST:event_staticCharmActionPerformed
    private void shinyCharmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shinyCharmActionPerformed
        shinyCharm.setSelected(true);
        tabs.remove(shinyOdds);
        tabs.add(staticOdds);
        staticCharm.setSelected(false);
        staticOdds.setName("Static Shiny Odds");
        staticNormal2to5.setSelected(true);
        staticChance = 8192;
        tabs.setSelectedComponent(staticOdds);
    }//GEN-LAST:event_shinyCharmActionPerformed
    private void staticImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staticImportActionPerformed
        cChance = staticChance;
        customChance.setText(String.valueOf(cChance));
        cRecalculate();
        tabs.setSelectedComponent(custom);
    }//GEN-LAST:event_staticImportActionPerformed
    private void shinyImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shinyImportActionPerformed
        cChance = staticChance;
        customChance.setText(String.valueOf(cChance));
        cRecalculate();
        tabs.setSelectedComponent(custom);
    }//GEN-LAST:event_shinyImportActionPerformed

    private void staticNormal2to5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staticNormal2to5ActionPerformed
        staticChance = 8192;
    }//GEN-LAST:event_staticNormal2to5ActionPerformed
    private void staticNormal6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staticNormal6ActionPerformed
        staticChance = 4096;
    }//GEN-LAST:event_staticNormal6ActionPerformed
    private void staticMasuda4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staticMasuda4ActionPerformed
        staticChance = 1639;
    }//GEN-LAST:event_staticMasuda4ActionPerformed
    private void staticMasuda5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staticMasuda5ActionPerformed
        staticChance = 1366;
    }//GEN-LAST:event_staticMasuda5ActionPerformed
    private void staticMasuda6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staticMasuda6ActionPerformed
        staticChance = 683;
    }//GEN-LAST:event_staticMasuda6ActionPerformed
    private void staticFriendSafariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staticFriendSafariActionPerformed
        staticChance = 819;
    }//GEN-LAST:event_staticFriendSafariActionPerformed
    private void staticHordeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staticHordeActionPerformed
        staticChance = 820;
    }//GEN-LAST:event_staticHordeActionPerformed
    private void shinyNormal2to5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shinyNormal2to5ActionPerformed
        staticChance = 2731;
    }//GEN-LAST:event_shinyNormal2to5ActionPerformed
    private void shinyNormal6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shinyNormal6ActionPerformed
        staticChance = 1366;
    }//GEN-LAST:event_shinyNormal6ActionPerformed
    private void shinyMasuda5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shinyMasuda5ActionPerformed
        staticChance = 1024;
    }//GEN-LAST:event_shinyMasuda5ActionPerformed
    private void shinyMasuda6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shinyMasuda6ActionPerformed
        staticChance = 512;
    }//GEN-LAST:event_shinyMasuda6ActionPerformed
    private void shinyFriendSafariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shinyFriendSafariActionPerformed
        staticChance = 585;
    }//GEN-LAST:event_shinyFriendSafariActionPerformed
    private void shinyHordeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shinyHordeActionPerformed
        staticChance = 274;
    }//GEN-LAST:event_shinyHordeActionPerformed

    // Find out [n] events with [p] probability that give an overall probability of [q]
    public double distributionCalculate(double p, double q) {
        return Math.log(1 - q) / Math.log(1 - p);
    }

    // Cumulative Individual Event Calculation with [p] (dec) Chance and [n] Events
    public double cumulativeCalculate(double p, int n) {
        double num = 1 - Math.pow(1 - p, n);
        if (n == 0) {
            return 0;
        }
        if (num > 0.999999) {
            return 0.999999;
        }
        return num;
    }

    // DexNav Average Shiny Chance Calculation Loop
    public double dNLoop() {
        double avgActual = 0;
        for (int i = 0; i < dNCount; i++) {
            double base = 0;
            int tryNum = 1;
            double actualTries = 1;
            double chance = 0;
            double forced = 0;
            double actual = 0;
            double num = 0;

            if (i > 200) {
                base = (i - 200) + 800;
            } else if (i > 100) {
                base = (i - 100) * 2 + 600;
            } else {
                base = i * 6;
            }
            if (i == 49) {
                tryNum += 5;
            }
            if (i == 99) {
                tryNum += 10;
            }
            if (dexNavCharm.isSelected()) {
                tryNum += 2;
            }
            actualTries *= tryNum;
            actualTries += 0.16;
            chance = base / 10000;
            forced = 1 - chance;
            forced = Math.pow(forced, actualTries);
            forced = (1 - forced) / 100;
            if (dexNavCharm.isSelected()) {
                num = 4096 / 3.0;
                actual = (1.0 - (1.0 / num)) * (1 - forced);
            } else {
                num = 4096;
                actual = (1.0 - (1.0 / num)) * (1 - forced);
            }

            actual = 1 - actual;
            avgActual += actual;
        }
        avgActual /= dNCount;
        return avgActual;
    }

    // Chain Fishing Average Shiny Chance Calculation Loop
    public double fLoop() {
        double avgActual = 0;
        for (int i = 0; i < fChain; i++) {
            double actual = 0;
            int tries = 0;

            // Calculate PID Roll Count
            if (i > 20) {
                tries = 41;
            } else {
                tries = 1 + 2 * i;
            }
            if (fishingCharm.isSelected()) {
                tries += 2;
            }

            // Calculate Shiny Odds
            actual = 1 - (1.0 / 4096);
            actual = Math.pow(actual, tries);
            actual = 1 - actual;
            avgActual += actual;
        }
        avgActual /= fChain;
        return avgActual;
    }

    // SOS Chaining Average Shiny Chance Calculation Loop
    public double sLoop() {
        double avgActual = 0;
        for (int i = 0; i < sChain; i++) {
            double actual = 0;
            int tries = 1;
            int ivs = 0;
            int ha = 0;

            // Calculate PID Roll Count
            if (i > 29) {
                tries = 13;
            } else if (i > 19) {
                tries = 9;
            } else if (i > 9) {
                tries = 5;
            }
            if (sosCharm.isSelected()) {
                tries += 2;
            }

            // Calculate Shiny Odds
            actual = 1 - (1.0 / 4096);
            actual = Math.pow(actual, tries);
            actual = 1 - actual;
            avgActual += actual;
        }
        avgActual /= sChain;
        return avgActual;
    }

    // DexNav Text Recalculation
    public void dNRecalculate() {
        double avgActual = dNLoop();
        double base = 0;
        int tryNum = 1;
        int tries = 1;
        double actualTries = 1;
        double chance = 0;
        double forced = 0;
        double actual = 0;
        String chance50 = "";
        String chance90 = "";
        double num = 0;

        String star0 = "?";
        String star1 = "?";
        String star2 = "?";
        String star3 = "?";
        String eggMove = "21%";
        String hidden = "0%";
        int extraLevels = 0;

        if (dNCount > 4 && dNCount < 10) {
            star0 = "85%";
            star1 = "14%";
            star2 = "1% (Might only occur with level boost)";
            star3 = "0%";
            eggMove = "46%";
            hidden = "0%";
        } else if (dNCount > 4 && dNCount < 25) {
            star0 = "73%";
            star1 = "17%";
            star2 = "9%";
            star3 = "1% (Might only occur with level boost)";
            eggMove = "58%";
            hidden = "5%";
        } else if (dNCount > 4 && dNCount < 50) {
            star0 = "60%";
            star1 = "17%";
            star2 = "16%";
            star3 = "7%";
            eggMove = "63%";
            hidden = "15%";
        } else if (dNCount > 4 && dNCount < 100) {
            star0 = "62%";
            star1 = "15%";
            star2 = "17%";
            star3 = "6%";
            eggMove = "65%";
            hidden = "20%";
        } else if (dNCount > 99) {
            star0 = "56%";
            star1 = "8%";
            star2 = "24%";
            star3 = "12%";
            eggMove = "83%";
            hidden = "23%";
        }

        if (dNChain > 0) {
            extraLevels = dNChain % 100 / 5;
        }

        if (dNCount > 200) {
            base = (dNCount - 200) + 800;
        } else if (dNCount > 100) {
            base = (dNCount - 100) * 2 + 600;
        } else {
            base = dNCount * 6;
        }
        if (dNChain == 49) {
            tryNum += 5;
        }
        if (dNChain == 99) {
            tryNum += 10;
        }
        if (dexNavCharm.isSelected()) {
            tryNum += 2;
        }
        tries *= tryNum;
        actualTries *= tryNum;
        actualTries += 0.16;
        chance = base / 10000;
        forced = 1 - chance;
        forced = Math.pow(forced, actualTries);
        forced = (1 - forced) / 100;
        if (dexNavCharm.isSelected()) {
            num = 1.0 / (1 - Math.pow(1 - 1.0 / 4096, 3));
            chance50 = "279";
            chance90 = "704";
            actual = (1.0 - (1.0 / num)) * (1 - forced);
        } else {
            num = 4096;
            chance50 = "579";
            chance90 = ">999";
            actual = (1.0 - (1.0 / num)) * (1 - forced);
        }

        actual = 1 - actual;

        if (dNCount == 0) {
            dNText.setText(
                    "Forced Shiny Chance = 0%\n"
                    + "Total Shiny Chance = " + String.valueOf(fourDec.format(1.0 / num * 100)) + "% or approximately 1/" + Math.round(num) + "\n\n"
                    + "Search Level At 50% Chance = " + chance50 + "\n"
                    + "Search Level At 90% Chance = " + chance90 + "\n"
                    + "Cumulative % = " + String.valueOf(fourDec.format(cumulativeCalculate(actual, dNCount) * 100)) + "\n\n"
                    + "0-Star Potential: " + star0 + "\n"
                    + "1-Star Potential: " + star1 + "\n"
                    + "2-Star Potential: " + star2 + "\n"
                    + "3-Star Potential: " + star3 + "\n"
                    + "10 Level Boost: 4%" + "\n"
                    + "Additional Levels: " + extraLevels + "\n\n"
                    + "Egg Move as first move: " + eggMove + "\n"
                    + "Hidden Ability: " + hidden);
        } else {
            dNText.setText(
                    "Forced Shiny Chance = " + String.valueOf(fourDec.format(forced * 100)) + "% or approximately 1/" + Math.round(1.0 / (forced)) + "\n"
                    + "Total Shiny Chance = " + String.valueOf(fourDec.format(actual * 100)) + "% or approximately 1/" + Math.round(1.0 / (actual)) + "\n\n"
                    + "Search Level At 50% Chance = " + chance50 + "\n"
                    + "Search Level At 90% Chance = " + chance90 + "\n"
                    + "Cumulative % = " + String.valueOf(fourDec.format(cumulativeCalculate(avgActual, dNCount) * 100)) + "\n\n"
                    + "0-Star Potential: " + star0 + "\n"
                    + "1-Star Potential: " + star1 + "\n"
                    + "2-Star Potential: " + star2 + "\n"
                    + "3-Star Potential: " + star3 + "\n"
                    + "10 Level Boost: 4%" + "\n"
                    + "Additional Levels: " + extraLevels + "\n\n"
                    + "Egg Move as first move: " + eggMove + "\n"
                    + "Hidden Ability: " + hidden);
        }
        fileOutput("text_output\\hunt_type.txt", "DexNav");
        fileOutput("text_output\\dexnav_chain.txt", String.valueOf(dNChain));
        fileOutput("text_output\\encounters.txt", String.valueOf(dNCount));
        fileOutput("text_output\\shiny_chance.txt", "1/" + Math.round(1.0 / (actual)));
        fileOutput("text_output\\cumulative.txt", String.valueOf(fourDec.format(cumulativeCalculate(avgActual, dNCount) * 100)) + "%");
    }

    // Chain Fishing Text Recalculation
    public void fRecalculate() {
        double avgActual = fLoop();
        double actual = 0;
        int tries = 0;
        int chance50 = 80;
        int chance90 = 241;

        // Calculate PID Roll Count
        if (fChain > 20) {
            tries = 41;
        } else {
            tries = 1 + 2 * fChain;
        }
        if (fishingCharm.isSelected()) {
            tries += 2;
            chance50 = 76;
            chance90 = 230;
        }

        // Calculate Shiny Odds
        actual = 1 - (1.0 / 4096);
        actual = Math.pow(actual, tries);
        actual = 1 - actual;

        fishingText.setText("Shiny Chance = " + String.valueOf(fourDec.format(actual * 100)) + "% or approximately 1/" + Math.round(1.0 / actual) + "\n\n"
                + "Chain At 50% Chance = " + chance50 + "\n"
                + "Chain At 90% Chance = " + chance90 + "\n"
                + "Cumulative % = " + String.valueOf(fourDec.format(cumulativeCalculate(avgActual, fChain) * 100)) + "%");

        fileOutput("text_output\\hunt_type.txt", "Chain Fishing");
        fileOutput("text_output\\encounters.txt", String.valueOf(fChain));
        fileOutput("text_output\\shiny_chance.txt", "1/" + Math.round(1.0 / (actual)));
        fileOutput("text_output\\cumulative.txt", String.valueOf(fourDec.format(cumulativeCalculate(avgActual, fChain) * 100)) + "%");
    }

    // SOS Chaining Text Recalculation
    public void sRecalculate() {
        double avgActual = sLoop();
        double actual = 0;
        int tries = 1;
        int ivs = 0;
        int ha = 0;
        int chance50 = 237;
        int chance90 = 744;

        // Calculate PID Roll Count
        if (sChain > 29) {
            tries = 13;
        } else if (sChain > 19) {
            tries = 9;
        } else if (sChain > 9) {
            tries = 5;
        }
        if (sosCharm.isSelected()) {
            tries += 2;
            chance50 = 206;
            chance90 = 645;
        }

        // Calculate Mimnimum Perfect IVs and Hidden Ability %
        if (sChain > 28) {
            ivs = 4;
            ha = 15;
        } else if (sChain > 18) {
            ivs = 3;
            ha = 10;
        } else if (sChain > 8) {
            ivs = 2;
            ha = 5;
        } else if (sChain > 3) {
            ivs = 1;
        }

        // Calculate Shiny Odds
        actual = 1 - (1.0 / 4096);
        actual = Math.pow(actual, tries);
        actual = 1 - actual;

        sosText.setText("Shiny Chance = " + String.valueOf(fourDec.format(actual * 100)) + "% or approximately 1/" + Math.round(1.0 / actual) + "\n\n"
                + "Chain At 50% Chance = " + chance50 + "\n"
                + "Chain At 90% Chance = " + chance90 + "\n"
                + "Cumulative % = " + String.valueOf(fourDec.format(cumulativeCalculate(avgActual, sChain) * 100)) + "%\n\n"
                + "Minimum Perfect IVs = " + ivs + "\n"
                + "Hidden Ability Chance = " + ha + "%");

        fileOutput("text_output\\hunt_type.txt", "SOS Chaining");
        fileOutput("text_output\\encounters.txt", String.valueOf(sChain));
        fileOutput("text_output\\shiny_chance.txt", "1/" + Math.round(1.0 / (actual)));
        fileOutput("text_output\\cumulative.txt", String.valueOf(fourDec.format(cumulativeCalculate(avgActual, sChain) * 100)) + "%");
    }

    // Gen II Breeding Text Recalculation
    public void gscRecalculate() {
        double gscChance = 8192;
        fileOutput("text_output\\hunt_type.txt", "Gen II Breeding");

        if (gsc1Ditto.isSelected() && gsc2Ditto.isSelected()) {         // Two Dittos At Once
            gscBreedText.setText("Two Ditto cannot breed together");
            return;
        } else if (gsc1Ditto.isSelected() && !gsc1Shiny.isSelected()) {   // Non-Shiny Ditto in 1
        } else if (gsc2Ditto.isSelected() && !gsc2Shiny.isSelected()) {   // Non-Shiny Ditto in 2
        } else if (gsc1Ditto.isSelected() && gsc1Shiny.isSelected()) {    // Shiny Ditto in 1
            gscChance = 64;
        } else if (gsc2Ditto.isSelected() && gsc2Shiny.isSelected()) {    // Shiny Ditto in 2
            gscChance = 64;
        } else if (gsc1Shiny.isSelected() && gsc2Shiny.isSelected()) {    // 1 and 2 are Shiny
            gscChance = 64;
        } else if (gsc1Shiny.isSelected()) {                              // Shiny in 1
            if (Double.parseDouble(gsc2Female.getText()) == 0) {
                gscChance = 8192;
            } else {
                gscChance = 64 / (Double.parseDouble(gsc2Female.getText()) / 100.0);
            }
        } else if (gsc2Shiny.isSelected()) {                              // Shiny in 2
            if (Double.parseDouble(gsc2Male.getText()) == 0) {
                gscChance = 8192;
            } else {
                gscChance = 64 / (Double.parseDouble(gsc2Male.getText()) / 100.0);
            }
        }

        if (gsc1Ditto.isSelected() && !gsc1Shiny.isSelected() || gsc2Ditto.isSelected() && !gsc2Shiny.isSelected()) {
            gscBreedText.setText("Shiny Chance = " + String.valueOf(fourDec.format(1.0 / gscChance * 100)) + "% or approximately 1/" + Math.round(gscChance) + "\n\n"
                    + "Eggs Until 50% Chance = " + String.valueOf(noDec.format(Math.ceil(distributionCalculate((1.0 / gscChance), 0.5)))) + "\n"
                    + "Eggs Until 90% Chance = " + String.valueOf(noDec.format(Math.ceil(distributionCalculate((1.0 / gscChance), 0.9)))) + "\n"
                    + "Cumulative % = " + String.valueOf(fourDec.format(cumulativeCalculate(1.0 / gscChance, gscCount) * 100)) + "\n\n"
                    + "(Reminder: When breeding a Ditto, the offspring will use the Ditto's stats regardless of the other parent's gender.)");
        } else if (gsc1Shiny.isSelected() && gsc2Shiny.isSelected()) {
            gscBreedText.setText("Shiny Chance = " + String.valueOf(fourDec.format(1.0 / gscChance * 100)) + "% or approximately 1/" + Math.round(gscChance) + "\n\n"
                    + "Eggs Until 50% Chance = " + String.valueOf(noDec.format(Math.ceil(distributionCalculate((1.0 / gscChance), 0.5)))) + "\n"
                    + "Eggs Until 90% Chance = " + String.valueOf(noDec.format(Math.ceil(distributionCalculate((1.0 / gscChance), 0.9)))) + "\n"
                    + "Cumulative % = " + String.valueOf(fourDec.format(cumulativeCalculate(1.0 / gscChance, gscCount) * 100)) + "\n\n"
                    + "(Reminder: When both parents are shiny, it is likely that the game will consider them \"related\" and won't produce any eggs. To obtain the maximum 1/64 chance, it is best to breed a shiny Ditto.)");
        } else {
            gscBreedText.setText("Shiny Chance = " + String.valueOf(fourDec.format(1.0 / gscChance * 100)) + "% or approximately 1/" + Math.round(gscChance) + "\n\n"
                    + "Eggs Until 50% Chance = " + String.valueOf(noDec.format(Math.ceil(distributionCalculate((1.0 / gscChance), 0.5)))) + "\n"
                    + "Eggs Until 90% Chance = " + String.valueOf(noDec.format(Math.ceil(distributionCalculate((1.0 / gscChance), 0.9)))) + "\n"
                    + "Cumulative % = " + String.valueOf(fourDec.format(cumulativeCalculate(1.0 / gscChance, gscCount) * 100)));
        }

        fileOutput("text_output\\encounters.txt", String.valueOf(gscCount));
        fileOutput("text_output\\shiny_chance.txt", "1/" + Math.round(gscChance));
        fileOutput("text_output\\cumulative.txt", String.valueOf(fourDec.format(cumulativeCalculate(1.0 / gscChance, gscCount) * 100)) + "%");
    }

    // Custom Chance Recalculation
    public void cRecalculate() {
        // Calculate Shiny Odds As Decimal
        double cDec = 1.0 / cChance;

        customText.setText(
                "Shiny Chance = " + String.valueOf(fourDec.format(1.0 / cChance * 100)) + "%\n\n"
                + "Encounters Until 50% Chance = " + String.valueOf(noDec.format(Math.ceil(distributionCalculate((1.0 / cChance), 0.5)))) + "\n"
                + "Encounters Until 90% Chance = " + String.valueOf(noDec.format(Math.ceil(distributionCalculate((1.0 / cChance), 0.9)))) + "\n"
                + "Cumulative % = " + String.valueOf(fourDec.format(cumulativeCalculate(cDec, cCount) * 100)));

        fileOutput("text_output\\hunt_type.txt", "Random Encounters/Soft Resets/Breeding");
        fileOutput("text_output\\encounters.txt", String.valueOf(cCount));
        fileOutput("text_output\\shiny_chance.txt", "1/" + cChance);
        fileOutput("text_output\\cumulative.txt", String.valueOf(fourDec.format(cumulativeCalculate(cDec, cCount) * 100)) + "%");
    }

    // Output to text file with file name and text as Strings
    public void fileOutput(String fileName, String text) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
            out.write(text);
            out.close();
        } catch (IOException e) {
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ShinyHunting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShinyHunting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShinyHunting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShinyHunting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShinyHunting().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel chainFishing;
    private javax.swing.JPanel custom;
    private javax.swing.JTextField customChance;
    private javax.swing.JTextField customCount;
    private javax.swing.JButton customMinus;
    private javax.swing.JButton customPlus;
    private javax.swing.JButton customReset;
    private javax.swing.JTextArea customText;
    private javax.swing.JTextArea dNText;
    private javax.swing.JPanel dexNav;
    private javax.swing.JTextField dexNavChain;
    private javax.swing.JButton dexNavChainMinus;
    private javax.swing.JButton dexNavChainPlusS;
    private javax.swing.JButton dexNavChainReset;
    private javax.swing.JCheckBox dexNavCharm;
    private javax.swing.JTextField dexNavCounter;
    private javax.swing.JButton dexNavCounterMinus;
    private javax.swing.JButton dexNavCounterPlusS;
    private javax.swing.JButton dexNavCounterReset;
    private javax.swing.JButton dexNavPlus;
    private javax.swing.JTextField fishingChain;
    private javax.swing.JCheckBox fishingCharm;
    private javax.swing.JButton fishingMinus;
    private javax.swing.JButton fishingPlus;
    private javax.swing.JButton fishingReset;
    private javax.swing.JTextArea fishingText;
    private javax.swing.JRadioButton gsc1Ditto;
    private javax.swing.JRadioButton gsc1Shiny;
    private javax.swing.JRadioButton gsc2Ditto;
    private javax.swing.JTextField gsc2Female;
    private javax.swing.JTextField gsc2Male;
    private javax.swing.JRadioButton gsc2Shiny;
    private javax.swing.JPanel gscBreed;
    private javax.swing.JTextArea gscBreedText;
    private javax.swing.JTextField gscCounter;
    private javax.swing.JButton gscMinus;
    private javax.swing.JButton gscPlus;
    private javax.swing.JButton gscReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JCheckBox shinyCharm;
    private javax.swing.JRadioButton shinyFriendSafari;
    private javax.swing.JRadioButton shinyHorde;
    private javax.swing.JButton shinyImport;
    private javax.swing.JRadioButton shinyMasuda5;
    private javax.swing.JRadioButton shinyMasuda6;
    private javax.swing.JRadioButton shinyNormal2to5;
    private javax.swing.JRadioButton shinyNormal6;
    public javax.swing.JPanel shinyOdds;
    private javax.swing.JTextField sosChain;
    private javax.swing.JPanel sosChaining;
    private javax.swing.JCheckBox sosCharm;
    private javax.swing.JButton sosMinus;
    private javax.swing.JButton sosPlus;
    private javax.swing.JButton sosReset;
    private javax.swing.JTextArea sosText;
    private javax.swing.ButtonGroup staticButtonGroup;
    private javax.swing.JCheckBox staticCharm;
    private javax.swing.JRadioButton staticFriendSafari;
    private javax.swing.JRadioButton staticHorde;
    private javax.swing.JButton staticImport;
    private javax.swing.JRadioButton staticMasuda4;
    private javax.swing.JRadioButton staticMasuda5;
    private javax.swing.JRadioButton staticMasuda6;
    private javax.swing.JRadioButton staticNormal2to5;
    private javax.swing.JRadioButton staticNormal6;
    public javax.swing.JPanel staticOdds;
    public javax.swing.JTabbedPane tabs;
    // End of variables declaration//GEN-END:variables
}
