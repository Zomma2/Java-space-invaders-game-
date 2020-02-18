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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class playershipBlue
/*     */ {
/*     */   protected int x;
/*     */   protected int y;
/*     */   protected int height;
/*     */   protected int width;
/*     */   protected Rectangle PlayerRec;
/*     */   protected boolean Isdead;
/*     */   protected boolean fire;
/*     */   private Dir Dir;
/*     */   protected Image image;
/*     */   
/*     */   public playershipBlue() {
/* 151 */     ImageIcon ship = new ImageIcon(getClass().getResource("playerShip.png"));
/* 152 */     this.width = ship.getImage().getWidth(null);
/*     */     
/* 154 */     this.height = ship.getImage().getHeight(null);
/* 155 */     this.x = 400;
/* 156 */     this.y = 580;
/*     */     
/* 158 */     this.image = ship.getImage();
/* 159 */     this.PlayerRec = new Rectangle(this.x, this.y, this.width, this.height);
/*     */   }
/*     */   
/* 162 */   public int getX() { return this.x; } public int getY() {
/* 163 */     return this.y;
/*     */   }
/*     */   public void drawPlayerShip(Graphics g) {
/* 166 */     if (!this.Isdead)
/*     */     {
/*     */       
/* 169 */       g.drawImage(this.image, this.x, this.y, null);
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
/* 181 */     this.Dir = d;
/* 182 */     movePlayer();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void movePlayer() {
/* 189 */     if (this.Dir == Dir.RIGHT && this.x > 870) {
/*     */       
/* 191 */       this.x = this.x;
/* 192 */       this.y = this.y;
/*     */     }
/*     */     else {
/*     */       
/* 196 */       if (this.x <= 2) {
/* 197 */         this.x = 2;
/*     */       }
/*     */       
/* 200 */       switch (this.Dir) {
/*     */         
/*     */         case RIGHT:
/* 203 */           this.x += 5;
/*     */           break;
/*     */         
/*     */         case LEFT:
/* 207 */           this.x -= 5;
/*     */           break;
/*     */       } 
/*     */ 
/*     */     
/*     */     } 
/* 213 */     this.PlayerRec.setRect(this.x, this.y, this.width, this.height);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean died() {
/* 220 */     return this.Isdead = true;
/*     */   }
/*     */ }


/* Location:              E:\DESK2019\New folder\Game_v1.0\Final build\SpaceInvadersGame.jar!\game\playershipBlue.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */