/*      */ package game;
/*      */ 
/*      */ import java.awt.Color;
/*      */ import java.awt.Dimension;
/*      */ import java.awt.Font;
/*      */ import java.awt.Graphics;
/*      */ import java.awt.LayoutManager;
/*      */ import java.awt.event.ActionEvent;
/*      */ import java.awt.event.ActionListener;
/*      */ import java.awt.event.KeyAdapter;
/*      */ import java.awt.event.KeyEvent;
/*      */ import javax.swing.JLabel;
/*      */ import javax.swing.JOptionPane;
/*      */ import javax.swing.JPanel;
/*      */ import javax.swing.Timer;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ class gamePnl1
/*      */   extends JPanel
/*      */ {
/*      */   JLabel lev;
/*      */   JLabel score;
/*  980 */   int style = 1;
/*  981 */   Font font = new Font("Comic Sans MS", this.style, 11);
/*  982 */   playershipBlue sh1 = new playershipBlue();
/*      */   private Timer t1;
/*      */   private Timer t2;
/*      */   private Timer t3;
/*      */   private Timer t4;
/*      */   private Timer t5;
/*      */   boolean die;
/*  989 */   public int pnl_width = 900;
/*  990 */   protected int pnl_length = 800;
/*  991 */   playershipBlue shp1 = new playershipBlue();
/*  992 */   GrpOFEn Ge = new GrpOFEn();
/*  993 */   GunBullet b1 = new GunBullet();
/*      */   boolean ok;
/*      */   boolean EnemyReady;
/*  996 */   ArrayOfEnmyWeap enWeapon = new ArrayOfEnmyWeap();
/*      */   
/*      */   public gamePnl1() {
/*  999 */     setBackground(new Color(55, 71, 79));
/* 1000 */     setLayout((LayoutManager)null);
/* 1001 */     this.lev = new JLabel("LEVEL  X0" + GmConst.level);
/* 1002 */     this.score = new JLabel("SCORE X" + GmConst.score);
/* 1003 */     this.lev.setLocation(20, 685);
/* 1004 */     this.score.setLocation(800, 685);
/* 1005 */     this.lev.setForeground(Color.white);
/* 1006 */     this.score.setForeground(Color.white);
/* 1007 */     this.lev.setFont(this.font.deriveFont(80, 30.0F));
/* 1008 */     this.score.setFont(this.font.deriveFont(80, 30.0F));
/* 1009 */     this.lev.setSize(new Dimension(500, 200));
/* 1010 */     this.score.setSize(new Dimension(500, 200));
/* 1011 */     add(this.lev);
/* 1012 */     add(this.score);
/* 1013 */     setSize(this.pnl_width, this.pnl_length);
/*      */     
/* 1015 */     addKeyListener(new KeyAdapter() {
/*      */           public void keyPressed(KeyEvent e) {
/* 1017 */             if (e.getKeyCode() == 39) {
/* 1018 */               gamePnl1.this.shp1.setDirection(Dir.RIGHT);
/* 1019 */             } else if (e.getKeyCode() == 37) {
/* 1020 */               gamePnl1.this.shp1.setDirection(Dir.LEFT);
/*      */             }
/* 1022 */             else if (e.getKeyCode() == 32) {
/* 1023 */               gamePnl1.this.shp1.fire = true;
/* 1024 */               gamePnl1.this.b1.AddBullet(gamePnl1.this.shp1.getX(), gamePnl1.this.shp1.getY() - 15);
/* 1025 */               gamePnl1.this.repaint();
/*      */             } 
/*      */           }
/*      */         });
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1035 */     this.t1 = new Timer(40, new ActionListener()
/*      */         {
/*      */           public void actionPerformed(ActionEvent e)
/*      */           {
/* 1039 */             gamePnl1.this.Ge.move();
/*      */             
/* 1041 */             if (gamePnl1.this.shp1.Isdead) {
/*      */               return;
/*      */             }
/*      */             
/* 1045 */             gamePnl1.this.repaint();
/*      */           }
/*      */         });
/*      */ 
/*      */     
/* 1050 */     this.t1.start();
/*      */     
/* 1052 */     this.t2 = new Timer(20, new ActionListener() {
/*      */           public void actionPerformed(ActionEvent e) {
/* 1054 */             if (gamePnl1.this.shp1.fire)
/*      */             {
/* 1056 */               if (gamePnl1.this.ok) {
/*      */                 
/* 1058 */                 gamePnl1.this.b1.move();
/*      */                 
/* 1060 */                 if (gamePnl1.this.shp1.Isdead) {
/*      */                   return;
/*      */                 }
/*      */                 
/* 1064 */                 gamePnl1.this.repaint();
/*      */               } 
/*      */             }
/*      */           }
/*      */         });
/*      */     
/* 1070 */     this.t2.start();
/*      */     
/* 1072 */     this.t3 = new Timer(GmConst.EnDELAY, new ActionListener() {
/*      */           public void actionPerformed(ActionEvent e) {
/* 1074 */             Enemy En = gamePnl1.this.Ge.RandEnemy();
/* 1075 */             int dx = En.getEnX();
/* 1076 */             int dy = En.getEnY();
/* 1077 */             gamePnl1.this.enWeapon.EnemyGun.add(new EnemyWeapons(dx + 10, dy + 22));
/* 1078 */             gamePnl1.this.EnemyReady = true;
/* 1079 */             if (gamePnl1.this.shp1.Isdead) {
/*      */               return;
/*      */             }
/*      */             
/* 1083 */             gamePnl1.this.repaint();
/*      */           }
/*      */         });
/*      */ 
/*      */     
/* 1088 */     this.t3.start();
/*      */ 
/*      */ 
/*      */     
/* 1092 */     this.t4 = new Timer(10, new ActionListener() {
/*      */           public void actionPerformed(ActionEvent e) {
/* 1094 */             if (gamePnl1.this.EnemyReady) {
/*      */ 
/*      */ 
/*      */ 
/*      */               
/* 1099 */               gamePnl1.this.enWeapon.move();
/* 1100 */               if (gamePnl1.this.shp1.Isdead) {
/*      */                 return;
/*      */               }
/*      */               
/* 1104 */               gamePnl1.this.repaint();
/*      */             } 
/*      */           }
/*      */         });
/*      */     
/* 1109 */     this.t4.start();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void paintComponent(Graphics g) {
/* 1118 */     super.paintComponent(g);
/* 1119 */     playerCollision();
/* 1120 */     EnemyCollision();
/* 1121 */     GunCollision();
/* 1122 */     Win();
/* 1123 */     if (this.shp1.Isdead) {
/*      */       
/* 1125 */       JOptionPane.showMessageDialog(null, "Game Over!");
/* 1126 */       System.exit(0);
/*      */     
/*      */     }
/*      */     else {
/*      */       
/* 1131 */       this.shp1.drawPlayerShip(g);
/* 1132 */       if (this.shp1.fire) {
/*      */         
/* 1134 */         this.b1.draw(g);
/* 1135 */         this.ok = true;
/*      */       } 
/* 1137 */       this.Ge.draw(g);
/*      */       
/* 1139 */       if (this.EnemyReady)
/*      */       {
/* 1141 */         this.enWeapon.draw(g); } 
/*      */     } 
/*      */   }
/*      */   public void playerCollision() {
/* 1145 */     for (int i = 0; i < this.enWeapon.EnemyGun.size(); i++) {
/*      */       
/* 1147 */       if (this.shp1.PlayerRec.intersects(((EnemyWeapons)this.enWeapon.EnemyGun.get(i)).EnWeRec)) {
/*      */         
/* 1149 */         this.shp1.Isdead = true;
/*      */         
/* 1151 */         this.enWeapon.EnemyGun.remove(i);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void EnemyCollision() {
/* 1162 */     for (int i = 0; i < this.Ge.Enemies.size(); i++) {
/*      */       
/* 1164 */       for (int j = 0; j < this.b1.Gun.size(); j++) {
/*      */ 
/*      */ 
/*      */         
/* 1168 */         if (((Enemy)this.Ge.Enemies.get(i)).EnRec.intersects(((Bullet)this.b1.Gun.get(j)).playerFireRec)) {
/*      */ 
/*      */ 
/*      */           
/* 1172 */           this.Ge.Enemies.remove(i);
/* 1173 */           this.b1.Gun.remove(j);
/* 1174 */           GmConst.score++;
/* 1175 */           this.score.setText("SCORE X" + GmConst.score);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void GunCollision() {
/* 1187 */     for (int i = 0; i < this.enWeapon.EnemyGun.size(); i++) {
/*      */       
/* 1189 */       for (int j = 0; j < this.b1.Gun.size(); j++) {
/*      */ 
/*      */ 
/*      */         
/* 1193 */         if (((EnemyWeapons)this.enWeapon.EnemyGun.get(i)).EnWeRec.intersects(((Bullet)this.b1.Gun.get(j)).playerFireRec)) {
/*      */ 
/*      */ 
/*      */           
/* 1197 */           this.enWeapon.EnemyGun.remove(i);
/* 1198 */           this.b1.Gun.remove(j);
/*      */         } 
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void Win() {
/* 1209 */     if (this.Ge.Enemies.isEmpty() && GmConst.level < 4) {
/*      */       
/* 1211 */       GmConst.level++;
/* 1212 */       GmConst.DELAY -= 10 * GmConst.level;
/* 1213 */       GmConst.EnDELAY -= 50 * GmConst.level;
/* 1214 */       JOptionPane.showMessageDialog(null, "level up !");
/*      */     
/*      */     }
/* 1217 */     else if (GmConst.level == 4) {
/* 1218 */       this.shp1.Isdead = true;
/* 1219 */       JOptionPane.showMessageDialog(null, "YOU WIN !");
/* 1220 */       System.exit(0);
/*      */     } 
/*      */   }
/*      */ }


/* Location:              E:\DESK2019\New folder\Game_v1.0\Final build\SpaceInvadersGame.jar!\game\gamePnl1.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */