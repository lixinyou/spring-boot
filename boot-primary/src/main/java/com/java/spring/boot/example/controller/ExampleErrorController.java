package com.java.spring.boot.example.controller;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.boot.autoconfigure.web.BasicErrorController;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("${server.error.path:${error.path:/error}}")
public class ExampleErrorController extends BasicErrorController {

  public ExampleErrorController(ErrorAttributes errorAttributes) {
    super(errorAttributes, new ErrorProperties());
  }

  @RequestMapping(produces = "application/json")
  @ResponseBody
  public Map<String, Object> errorJSON(HttpServletRequest request,
      HttpServletResponse response) {
    Map<String, Object> errorMap = new HashMap<>();
    errorMap.put("errorCode", 0);
    errorMap.put("errorMsg", "fail");
    return errorMap;
  }
}
