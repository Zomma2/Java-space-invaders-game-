/*     */ package game;
/*     */ 
/*     */ import java.awt.Graphics;
/*     */ import java.awt.Image;
/*     */ import java.awt.Rectangle;
/*     */ import javax.swing.ImageIcon;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class playershipRed
/*     */ {
/*     */   protected int x;
/*     */   protected int y;
/*     */   protected int height;
/*     */   protected int width;
/*     */   protected Rectangle PlayerRec;
/*     */   protected boolean Isdead = false;
/*     */   protected boolean fire;
/*     */   private Dir Dir;
/*     */   protected Image image;
/*     */   
/*     */   public playershipRed() {
/*  59 */     ImageIcon ship = new ImageIcon(getClass().getResource("playerShip2.png"));
/*  60 */     this.width = ship.getImage().getWidth(null);
/*     */     
/*  62 */     this.height = ship.getImage().getHeight(null);
/*  63 */     this.x = 400;
/*  64 */     this.y = 520;
/*     */     
/*  66 */     this.image = ship.getImage();
/*  67 */     this.PlayerRec = new Rectangle(this.x, this.y, this.width, this.height);
/*     */   }
/*     */   
/*  70 */   public int getX() { return this.x; } public int getY() {
/*  71 */     return this.y;
/*     */   }
/*     */   public void drawPlayerShip(Graphics g) {
/*  74 */     if (!this.Isdead)
/*     */     {
/*     */       
/*  77 */       g.drawImage(this.image, this.x, this.y, null);
/*     */     }
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void setDirection(Dir d) {
/*  89 */     this.Dir = d;
/*  90 */     movePlayer();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void movePlayer() {
/*  97 */     if (this.Dir == Dir.RIGHT && this.x > 870) {
/*     */       
/*  99 */       this.x = this.x;
/* 100 */       this.y = this.y;
/*     */     }
/*     */     else {
/*     */       
/* 104 */       if (this.x <= 2) {
/* 105 */         this.x = 2;
/*     */       }
/*     */       
/* 108 */       switch (this.Dir) {
/*     */         
/*     */         case RIGHT:
/* 111 */           this.x += 5;
/*     */           break;
/*     */         
/*     */         case LEFT:
/* 115 */           this.x -= 5;
/*     */           break;
/*     */       } 
/*     */ 
/*     */     
/*     */     } 
/* 121 */     this.PlayerRec.setRect(this.x, this.y, this.width, this.height);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean died() {
/* 128 */     return this.Isdead = true;
/*     */   }
/*     */ }


/* Location:              E:\DESK2019\New folder\Game_v1.0\Final build\SpaceInvadersGame.jar!\game\playershipRed.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */