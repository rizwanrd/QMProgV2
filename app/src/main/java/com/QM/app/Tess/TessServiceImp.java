package com.QM.app.Tess;


import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

@Service
public class TessServiceImp implements TessService {


    @Override
    public String getTextFromScanner() {

        try {
            File img = new File(getClass().getResource("/img/img4.jpeg").toURI());
            BufferedImage bimg = ImageIO.read(img);

            if(img.exists()) {
                System.out.println(img);
            }

            ColorSpace cs = ColorSpace.getInstance(ColorSpace.CS_GRAY);
            ColorConvertOp op = new ColorConvertOp(cs, null);
            op.filter(bimg, bimg);

            ITesseract instance = new Tesseract();
            instance.setDatapath("C:/Program Files/Tesseract-OCR/tessdata");

            System.out.println(instance);

            String result = instance.doOCR(bimg);
            System.out.println(result);
            return result;
        } catch (IOException ex) {
            System.out.println(ex);
            return "";
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
            return "";
        } catch (URISyntaxException e) {
            System.out.println(e);
            return "";
        }
    }
}
