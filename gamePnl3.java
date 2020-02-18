/*     */ package game;
/*     */ 
/*     */ import java.awt.Color;
/*     */ import java.awt.Dimension;
/*     */ import java.awt.Font;
/*     */ import java.awt.Graphics;
/*     */ import java.awt.LayoutManager;
/*     */ import java.awt.event.ActionEvent;
/*     */ import java.awt.event.ActionListener;
/*     */ import java.awt.event.KeyAdapter;
/*     */ import java.awt.event.KeyEvent;
/*     */ import javax.swing.JLabel;
/*     */ import javax.swing.JOptionPane;
/*     */ import javax.swing.JPanel;
/*     */ import javax.swing.Timer;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class gamePnl3
/*     */   extends JPanel
/*     */ {
/* 713 */   int timer = 600;
/*     */   JLabel lev;
/* 715 */   int style = 1; JLabel score; JLabel time;
/* 716 */   Font font = new Font("Comic Sans MS", this.style, 11);
/* 717 */   playershipBlue sh1 = new playershipBlue();
/*     */   
/*     */   private Timer t1;
/*     */   private Timer t5;
/*     */   private Timer t2;
/*     */   private Timer t3;
/*     */   private Timer t4;
/*     */   boolean die;
/* 725 */   public int pnl_width = 900;
/* 726 */   protected int pnl_length = 800;
/* 727 */   playershipBlue shp1 = new playershipBlue();
/* 728 */   GrpOFEn Ge = new GrpOFEn();
/* 729 */   GunBullet b1 = new GunBullet();
/*     */   boolean ok;
/*     */   boolean EnemyReady;
/* 732 */   ArrayOfEnmyWeap enWeapon = new ArrayOfEnmyWeap();
/*     */   
/*     */   public gamePnl3() {
/* 735 */     setBackground(new Color(55, 71, 79));
/* 736 */     setLayout((LayoutManager)null);
/* 737 */     this.time = new JLabel("Time left: " + (this.timer / 10) + " sec");
/* 738 */     this.lev = new JLabel("LEVEL  X0" + GmConst.level);
/* 739 */     this.score = new JLabel("SCORE X" + GmConst.score);
/* 740 */     this.lev.setLocation(20, 685);
/* 741 */     this.time.setLocation(400, 690);
/* 742 */     this.score.setLocation(800, 685);
/* 743 */     this.lev.setForeground(Color.white);
/* 744 */     this.time.setForeground(Color.white);
/* 745 */     this.score.setForeground(Color.white);
/* 746 */     this.time.setForeground(Color.white);
/* 747 */     this.lev.setFont(this.font.deriveFont(80, 30.0F));
/* 748 */     this.score.setFont(this.font.deriveFont(80, 30.0F));
/* 749 */     this.time.setFont(this.font.deriveFont(80, 30.0F));
/* 750 */     this.lev.setSize(new Dimension(500, 200));
/* 751 */     this.score.setSize(new Dimension(500, 200));
/* 752 */     this.time.setSize(new Dimension(300, 100));
/* 753 */     add(this.lev);
/* 754 */     add(this.score);
/* 755 */     add(this.time);
/* 756 */     setSize(this.pnl_width, this.pnl_length);
/* 757 */     addKeyListener(new KeyAdapter() {
/*     */           public void keyPressed(KeyEvent e) {
/* 759 */             if (e.getKeyCode() == 39) {
/* 760 */               gamePnl3.this.shp1.setDirection(Dir.RIGHT);
/* 761 */             } else if (e.getKeyCode() == 37) {
/* 762 */               gamePnl3.this.shp1.setDirection(Dir.LEFT);
/*     */             }
/* 764 */             else if (e.getKeyCode() == 32) {
/* 765 */               gamePnl3.this.shp1.fire = true;
/* 766 */               gamePnl3.this.b1.AddBullet(gamePnl3.this.shp1.getX(), gamePnl3.this.shp1.getY() - 15);
/* 767 */               gamePnl3.this.repaint();
/*     */             } 
/*     */           }
/*     */         });
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 775 */     this.t1 = new Timer(60, new ActionListener()
/*     */         {
/*     */           public void actionPerformed(ActionEvent e)
/*     */           {
/* 779 */             gamePnl3.this.Ge.move();
/*     */             
/* 781 */             if (gamePnl3.this.shp1.Isdead) {
/*     */               return;
/*     */             }
/*     */             
/* 785 */             gamePnl3.this.repaint();
/*     */             
/* 787 */             gamePnl3.this.timer--;
/* 788 */             gamePnl3.this.time.setText("Time left: " + (gamePnl3.this.timer / 10) + "sec");
/*     */           }
/*     */         });
/*     */ 
/*     */     
/* 793 */     this.t1.start();
/*     */     
/* 795 */     this.t2 = new Timer(20, new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 797 */             if (gamePnl3.this.shp1.fire)
/*     */             {
/* 799 */               if (gamePnl3.this.ok) {
/*     */                 
/* 801 */                 gamePnl3.this.b1.move();
/*     */                 
/* 803 */                 if (gamePnl3.this.shp1.Isdead) {
/*     */                   return;
/*     */                 }
/*     */                 
/* 807 */                 gamePnl3.this.repaint();
/*     */               } 
/*     */             }
/*     */           }
/*     */         });
/*     */     
/* 813 */     this.t2.start();
/*     */     
/* 815 */     this.t3 = new Timer(GmConst.EnDELAY, new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 817 */             Enemy En = gamePnl3.this.Ge.RandEnemy();
/* 818 */             int dx = En.getEnX();
/* 819 */             int dy = En.getEnY();
/* 820 */             gamePnl3.this.enWeapon.EnemyGun.add(new EnemyWeapons(dx + 10, dy + 22));
/* 821 */             gamePnl3.this.EnemyReady = true;
/* 822 */             if (gamePnl3.this.shp1.Isdead) {
/*     */               return;
/*     */             }
/*     */             
/* 826 */             gamePnl3.this.repaint();
/*     */           }
/*     */         });
/*     */ 
/*     */     
/* 831 */     this.t3.start();
/*     */ 
/*     */ 
/*     */     
/* 835 */     this.t4 = new Timer(10, new ActionListener() {
/*     */           public void actionPerformed(ActionEvent e) {
/* 837 */             if (gamePnl3.this.EnemyReady) {
/*     */ 
/*     */ 
/*     */ 
/*     */               
/* 842 */               gamePnl3.this.enWeapon.move();
/* 843 */               if (gamePnl3.this.shp1.Isdead) {
/*     */                 return;
/*     */               }
/*     */               
/* 847 */               gamePnl3.this.repaint();
/*     */             } 
/*     */           }
/*     */         });
/*     */     
/* 852 */     this.t4.start();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void paintComponent(Graphics g) {
/* 862 */     super.paintComponent(g);
/* 863 */     playerCollision();
/* 864 */     EnemyCollision();
/* 865 */     GunCollision();
/* 866 */     Win();
/* 867 */     if (this.shp1.Isdead) {
/*     */       
/* 869 */       JOptionPane.showMessageDialog(null, "Game Over!");
/* 870 */       System.exit(0);
/*     */     } 
/* 872 */     if (this.timer == 0) {
/* 873 */       this.t1.stop();
/* 874 */       this.t2.stop();
/* 875 */       this.t3.stop();
/* 876 */       this.t4.stop();
/* 877 */       JOptionPane.showMessageDialog(this, "Time's UP !");
/* 878 */       System.exit(0);
/*     */     } else {
/*     */       
/* 881 */       this.shp1.drawPlayerShip(g);
/* 882 */       if (this.shp1.fire) {
/*     */         
/* 884 */         this.b1.draw(g);
/* 885 */         this.ok = true;
/*     */       } 
/* 887 */       this.Ge.draw(g);
/*     */       
/* 889 */       if (this.EnemyReady)
/*     */       {
/* 891 */         this.enWeapon.draw(g); } 
/*     */     } 
/*     */   }
/*     */   public void playerCollision() {
/* 895 */     for (int i = 0; i < this.enWeapon.EnemyGun.size(); i++) {
/*     */       
/* 897 */       if (this.shp1.PlayerRec.intersects(((EnemyWeapons)this.enWeapon.EnemyGun.get(i)).EnWeRec)) {
/*     */         
/* 899 */         this.shp1.Isdead = true;
/*     */         
/* 901 */         this.enWeapon.EnemyGun.remove(i);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void EnemyCollision() {
/* 912 */     for (int i = 0; i < this.Ge.Enemies.size(); i++) {
/*     */       
/* 914 */       for (int j = 0; j < this.b1.Gun.size(); j++) {
/*     */ 
/*     */ 
/*     */         
/* 918 */         if (((Enemy)this.Ge.Enemies.get(i)).EnRec.intersects(((Bullet)this.b1.Gun.get(j)).playerFireRec)) {
/*     */ 
/*     */ 
/*     */           
/* 922 */           this.Ge.Enemies.remove(i);
/* 923 */           this.b1.Gun.remove(j);
/* 924 */           GmConst.score++;
/* 925 */           this.score.setText("SCORE X" + GmConst.score);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void GunCollision() {
/* 937 */     for (int i = 0; i < this.enWeapon.EnemyGun.size(); i++) {
/*     */       
/* 939 */       for (int j = 0; j < this.b1.Gun.size(); j++) {
/*     */ 
/*     */ 
/*     */         
/* 943 */         if (((EnemyWeapons)this.enWeapon.EnemyGun.get(i)).EnWeRec.intersects(((Bullet)this.b1.Gun.get(j)).playerFireRec)) {
/*     */ 
/*     */ 
/*     */           
/* 947 */           this.enWeapon.EnemyGun.remove(i);
/* 948 */           this.b1.Gun.remove(j);
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void Win() {
/* 959 */     if (this.Ge.Enemies.isEmpty() && GmConst.level < 4) {
/*     */       
/* 961 */       GmConst.level++;
/* 962 */       GmConst.DELAY -= 10 * GmConst.level;
/* 963 */       GmConst.EnDELAY -= 50 * GmConst.level;
/* 964 */       JOptionPane.showMessageDialog(null, "level up !");
/*     */     
/*     */     }
/* 967 */     else if (GmConst.level == 4) {
/* 968 */       this.shp1.Isdead = true;
/* 969 */       JOptionPane.showMessageDialog(null, "YOU WIN !");
/* 970 */       System.exit(0);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              E:\DESK2019\New folder\Game_v1.0\Final build\SpaceInvadersGame.jar!\game\gamePnl3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */