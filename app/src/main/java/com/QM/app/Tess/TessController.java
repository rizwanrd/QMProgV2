package com.QM.app.Tess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/tess")
public class TessController {

    @GetMapping
    public String Tess() {
        TessScanner test = new TessScanner();
        return test.TessScanner();
    }

}
