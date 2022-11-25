package com.QM.app.Tess;

import net.sourceforge.tess4j.*;

import java.io.File;

public class TessScanner {

    public String TessScanner() {
        File img = new File("/Users/rizwanrashid/Desktop/project/QMProgV2/app/src/main/java/com/QM/app/img/testimg.jpeg").getAbsoluteFile();
        if(img.exists()) {
            System.out.println(img);
        }

        ITesseract instance = new Tesseract();
        instance.setDatapath("/Users/rizwanrashid/Desktop/project/QMProgV2/app/src/main/java/com/QM/app/Tess4J/tessdata");

        System.out.println(instance);

        try {
            String result = instance.doOCR(img);
            return result;
        }

        catch (TesseractException e) {
            System.err.println(e.getMessage());
            return "";
        }
    }

}
