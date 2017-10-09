package nwpu.edu.bishe.controller;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chunk on 2017/10/9.
 */
@Controller
public class HelloPage {

    @RequestMapping(value = "/helloPage")
    public JSONObject helloPage(){

        return new JSONObject("what");
    }
}
