/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package galaga;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ColorModel;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 *
 * @author user
 */
public class LoadSpriteSheets extends JFrame{
    BufferedImage spriteSheet;
    int width;
    int height;
    int rows;
    int columns;

    public LoadSpriteSheets() {
        try {
            String cwd = System.getProperty("user.dir");
            System.out.println("Current working directory : " + cwd);
            this.spriteSheet = ImageIO.read(new File(".\\src\\galaga\\assets\\sprites.png"));
        } catch (IOException ex) {
            Logger.getLogger(LoadSpriteSheets.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        //Graphics2D g2 = ()
        BufferedImageOp op = new BufferedImageOp() {
            @Override
            public BufferedImage filter(BufferedImage src, BufferedImage dest) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Rectangle2D getBounds2D(BufferedImage src) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public BufferedImage createCompatibleDestImage(BufferedImage src, ColorModel destCM) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Point2D getPoint2D(Point2D srcPt, Point2D dstPt) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public RenderingHints getRenderingHints() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        //((Graphics2D) g).drawImage(spriteSheet, null, 0, 0);
        ((Graphics2D) g).drawImage(spriteSheet.getSubimage(452, 373, 32, 36), null, 32,36);
    }
    
    
    
}
