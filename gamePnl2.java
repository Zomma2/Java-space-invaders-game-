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
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ class gamePnl2
/*      */   extends JPanel
/*      */ {
/*      */   JLabel lev;
/*      */   JLabel score;
/* 1229 */   int style = 1;
/* 1230 */   Font font = new Font("Comic Sans MS", this.style, 11);
/* 1231 */   playershipBlue sh1 = new playershipBlue();
/* 1232 */   playershipRed sh2 = new playershipRed();
/*      */   
/*      */   private Timer t1;
/*      */   private Timer t2;
/*      */   private Timer t3;
/*      */   private Timer t4;
/*      */   boolean die;
/* 1239 */   public int pnl_width = 900;
/* 1240 */   protected int pnl_length = 800;
/* 1241 */   playershipBlue shp1 = new playershipBlue();
/* 1242 */   playershipRed shp2 = new playershipRed();
/*      */   
/* 1244 */   GrpOFEn Ge = new GrpOFEn();
/* 1245 */   GunBullet b1 = new GunBullet();
/* 1246 */   GunBullet b2 = new GunBullet();
/*      */   
/*      */   boolean ok;
/*      */   boolean EnemyReady;
/* 1250 */   ArrayOfEnmyWeap enWeapon = new ArrayOfEnmyWeap();
/*      */   
/*      */   public gamePnl2() {
/* 1253 */     setBackground(new Color(55, 71, 79));
/* 1254 */     setLayout((LayoutManager)null);
/* 1255 */     this.lev = new JLabel("LEVEL  X0" + GmConst.level);
/* 1256 */     this.score = new JLabel("SCORE X" + GmConst.score);
/* 1257 */     this.lev.setLocation(20, 685);
/* 1258 */     this.score.setLocation(800, 685);
/* 1259 */     this.lev.setForeground(Color.white);
/* 1260 */     this.score.setForeground(Color.white);
/* 1261 */     this.lev.setFont(this.font.deriveFont(80, 30.0F));
/* 1262 */     this.score.setFont(this.font.deriveFont(80, 30.0F));
/* 1263 */     this.lev.setSize(new Dimension(500, 200));
/* 1264 */     this.score.setSize(new Dimension(500, 200));
/* 1265 */     add(this.lev);
/* 1266 */     add(this.score);
/* 1267 */     setSize(this.pnl_width, this.pnl_length);
/* 1268 */     addKeyListener(new KeyAdapter() {
/*      */           public void keyPressed(KeyEvent e) {
/* 1270 */             if (e.getKeyCode() == 39) {
/* 1271 */               gamePnl2.this.shp1.setDirection(Dir.RIGHT);
/* 1272 */             } else if (e.getKeyCode() == 37) {
/* 1273 */               gamePnl2.this.shp1.setDirection(Dir.LEFT);
/*      */             }
/* 1275 */             else if (e.getKeyCode() == 32) {
/* 1276 */               gamePnl2.this.shp1.fire = true;
/*      */               
/* 1278 */               gamePnl2.this.b1.AddBullet(gamePnl2.this.shp1.getX(), gamePnl2.this.shp1.getY() - 15);
/* 1279 */               gamePnl2.this.repaint();
/*      */             } 
/* 1281 */             if (e.getKeyCode() == 68) {
/* 1282 */               gamePnl2.this.shp2.setDirection(Dir.RIGHT);
/* 1283 */             } else if (e.getKeyCode() == 65) {
/* 1284 */               gamePnl2.this.shp2.setDirection(Dir.LEFT);
/*      */             }
/* 1286 */             else if (e.getKeyCode() == 87) {
/* 1287 */               gamePnl2.this.shp2.fire = true;
/* 1288 */               gamePnl2.this.b2.AddBullet(gamePnl2.this.shp2.getX(), gamePnl2.this.shp2.getY() - 15);
/* 1289 */               gamePnl2.this.repaint();
/*      */             } 
/* 1291 */             if (e.getKeyCode() == 68 && e.getKeyCode() == 39) {
/*      */               
/* 1293 */               gamePnl2.this.shp2.setDirection(Dir.RIGHT);
/* 1294 */               gamePnl2.this.shp1.setDirection(Dir.RIGHT);
/*      */             }
/* 1296 */             else if (e.getKeyCode() == 65 && e.getKeyCode() == 37) {
/*      */               
/* 1298 */               gamePnl2.this.shp2.setDirection(Dir.LEFT);
/* 1299 */               gamePnl2.this.shp1.setDirection(Dir.LEFT);
/*      */             }
/* 1301 */             else if (e.getKeyCode() == 87 && e.getKeyCode() == 32) {
/* 1302 */               gamePnl2.this.shp1.fire = true;
/* 1303 */               gamePnl2.this.shp2.fire = true;
/* 1304 */               gamePnl2.this.b2.AddBullet(gamePnl2.this.shp2.getX(), gamePnl2.this.shp2.getY() - 15);
/* 1305 */               gamePnl2.this.b1.AddBullet(gamePnl2.this.shp1.getX(), gamePnl2.this.shp1.getY() - 15);
/* 1306 */               gamePnl2.this.repaint();
/*      */             } 
/*      */           }
/*      */         });
/*      */ 
/*      */ 
/*      */     
/* 1313 */     this.t1 = new Timer(40, new ActionListener()
/*      */         {
/*      */           public void actionPerformed(ActionEvent e)
/*      */           {
/* 1317 */             gamePnl2.this.Ge.move();
/*      */             
/* 1319 */             if (gamePnl2.this.shp1.Isdead || gamePnl2.this.shp2.Isdead) {
/*      */               return;
/*      */             }
/*      */             
/* 1323 */             gamePnl2.this.repaint();
/*      */           }
/*      */         });
/*      */ 
/*      */     
/* 1328 */     this.t1.start();
/*      */     
/* 1330 */     this.t2 = new Timer(20, new ActionListener() {
/*      */           public void actionPerformed(ActionEvent e) {
/* 1332 */             if (gamePnl2.this.shp1.fire)
/*      */             {
/* 1334 */               if (gamePnl2.this.ok) {
/*      */                 
/* 1336 */                 gamePnl2.this.b1.move();
/* 1337 */                 if (gamePnl2.this.shp1.Isdead || gamePnl2.this.shp2.Isdead) {
/*      */                   return;
/*      */                 }
/*      */                 
/* 1341 */                 gamePnl2.this.repaint();
/*      */               } 
/*      */             }
/* 1344 */             if (gamePnl2.this.shp2.fire)
/*      */             {
/* 1346 */               if (gamePnl2.this.ok)
/*      */               {
/* 1348 */                 gamePnl2.this.b2.move();
/*      */               }
/*      */             }
/*      */           }
/*      */         });
/*      */     
/* 1354 */     this.t2.start();
/*      */     
/* 1356 */     this.t3 = new Timer(500, new ActionListener() {
/*      */           public void actionPerformed(ActionEvent e) {
/* 1358 */             Enemy En = gamePnl2.this.Ge.RandEnemy();
/* 1359 */             int dx = En.getEnX();
/* 1360 */             int dy = En.getEnY();
/* 1361 */             gamePnl2.this.enWeapon.EnemyGun.add(new EnemyWeapons(dx + 10, dy + 22));
/* 1362 */             gamePnl2.this.EnemyReady = true;
/* 1363 */             if (gamePnl2.this.shp1.Isdead || gamePnl2.this.shp2.Isdead) {
/*      */               return;
/*      */             }
/*      */             
/* 1367 */             gamePnl2.this.repaint();
/*      */           }
/*      */         });
/*      */ 
/*      */ 
/*      */     
/* 1373 */     this.t3.start();
/*      */ 
/*      */ 
/*      */     
/* 1377 */     this.t4 = new Timer(10, new ActionListener() {
/*      */           public void actionPerformed(ActionEvent e) {
/* 1379 */             if (gamePnl2.this.EnemyReady) {
/*      */ 
/*      */ 
/*      */ 
/*      */               
/* 1384 */               gamePnl2.this.enWeapon.move();
/* 1385 */               if (gamePnl2.this.shp1.Isdead || gamePnl2.this.shp2.Isdead) {
/*      */                 return;
/*      */               }
/*      */               
/* 1389 */               gamePnl2.this.repaint();
/*      */             } 
/*      */           }
/*      */         });
/*      */ 
/*      */     
/* 1395 */     this.t4.start();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void paintComponent(Graphics g) {
/* 1405 */     super.paintComponent(g);
/* 1406 */     playerCollision();
/* 1407 */     EnemyCollision();
/* 1408 */     GunCollision();
/* 1409 */     Win();
/* 1410 */     if (this.shp1.Isdead || this.shp2.Isdead) {
/*      */       
/* 1412 */       JOptionPane.showMessageDialog(this, "Game Over!");
/* 1413 */       System.exit(0);
/*      */     } else {
/*      */       
/* 1416 */       this.shp1.drawPlayerShip(g);
/* 1417 */       this.shp2.drawPlayerShip(g);
/* 1418 */       if (this.shp1.fire) {
/*      */         
/* 1420 */         this.b1.draw(g);
/* 1421 */         this.ok = true;
/*      */       } 
/* 1423 */       this.Ge.draw(g);
/*      */       
/* 1425 */       if (this.shp2.fire) {
/*      */         
/* 1427 */         this.b2.draw(g);
/* 1428 */         this.ok = true;
/*      */       } 
/* 1430 */       this.Ge.draw(g);
/*      */       
/* 1432 */       if (this.EnemyReady)
/*      */       {
/* 1434 */         this.enWeapon.draw(g); } 
/*      */     } 
/*      */   }
/*      */   
/*      */   public void playerCollision() {
/* 1439 */     for (int i = 0; i < this.enWeapon.EnemyGun.size(); i++) {
/*      */       
/* 1441 */       if (this.shp1.PlayerRec.intersects(((EnemyWeapons)this.enWeapon.EnemyGun.get(i)).EnWeRec)) {
/*      */         
/* 1443 */         this.shp1.Isdead = true;
/* 1444 */         this.enWeapon.EnemyGun.remove(i);
/*      */       } 
/* 1446 */       if (this.shp2.PlayerRec.intersects(((EnemyWeapons)this.enWeapon.EnemyGun.get(i)).EnWeRec)) {
/*      */         
/* 1448 */         this.shp2.Isdead = true;
/* 1449 */         this.enWeapon.EnemyGun.remove(i);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void EnemyCollision() {
/* 1458 */     for (int i = 0; i < this.Ge.Enemies.size(); i++) {
/*      */       int j;
/* 1460 */       for (j = 0; j < this.b1.Gun.size(); j++) {
/*      */ 
/*      */ 
/*      */         
/* 1464 */         if (((Enemy)this.Ge.Enemies.get(i)).EnRec.intersects(((Bullet)this.b1.Gun.get(j)).playerFireRec)) {
/*      */ 
/*      */ 
/*      */           
/* 1468 */           this.Ge.Enemies.remove(i);
/* 1469 */           this.b1.Gun.remove(j);
/* 1470 */           GmConst.score++;
/* 1471 */           this.score.setText("SCORE X" + GmConst.score);
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1477 */       for (j = 0; j < this.b2.Gun.size(); j++) {
/*      */ 
/*      */ 
/*      */         
/* 1481 */         if (((Enemy)this.Ge.Enemies.get(i)).EnRec.intersects(((Bullet)this.b2.Gun.get(j)).playerFireRec)) {
/*      */ 
/*      */ 
/*      */           
/* 1485 */           this.Ge.Enemies.remove(i);
/* 1486 */           this.b2.Gun.remove(j);
/* 1487 */           GmConst.score++;
/* 1488 */           this.score.setText("SCORE X" + GmConst.score);
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void GunCollision() {
/* 1504 */     for (int i = 0; i < this.enWeapon.EnemyGun.size(); i++) {
/*      */       int j;
/* 1506 */       for (j = 0; j < this.b1.Gun.size(); j++) {
/*      */ 
/*      */ 
/*      */         
/* 1510 */         if (((EnemyWeapons)this.enWeapon.EnemyGun.get(i)).EnWeRec.intersects(((Bullet)this.b1.Gun.get(j)).playerFireRec)) {
/*      */ 
/*      */ 
/*      */           
/* 1514 */           this.enWeapon.EnemyGun.remove(i);
/* 1515 */           this.b1.Gun.remove(j);
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/* 1521 */       for (j = 0; j < this.b2.Gun.size(); j++) {
/*      */ 
/*      */ 
/*      */         
/* 1525 */         if (((EnemyWeapons)this.enWeapon.EnemyGun.get(i)).EnWeRec.intersects(((Bullet)this.b2.Gun.get(j)).playerFireRec)) {
/*      */ 
/*      */ 
/*      */           
/* 1529 */           this.enWeapon.EnemyGun.remove(i);
/* 1530 */           this.b2.Gun.remove(j);
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
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public void Win() {
/* 1546 */     if (this.Ge.Enemies.isEmpty() && GmConst.level < 4) {
/*      */       
/* 1548 */       GmConst.level++;
/* 1549 */       GmConst.DELAY -= 10 * GmConst.level;
/* 1550 */       GmConst.EnDELAY -= 50 * GmConst.level;
/* 1551 */       JOptionPane.showMessageDialog(null, "level up !");
/*      */     
/*      */     }
/* 1554 */     else if (GmConst.level == 4) {
/* 1555 */       this.shp1.Isdead = true;
/* 1556 */       this.shp2.Isdead = true;
/*      */       
/* 1558 */       JOptionPane.showMessageDialog(null, "YOU WIN !");
/* 1559 */       System.exit(0);
/*      */     } 
/*      */   }
/*      */ }


/* Location:              E:\DESK2019\New folder\Game_v1.0\Final build\SpaceInvadersGame.jar!\game\gamePnl2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */