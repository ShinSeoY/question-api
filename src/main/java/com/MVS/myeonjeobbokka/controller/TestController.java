package com.MVS.myeonjeobbokka.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequiredArgsConstructor
public class TestController {

  @GetMapping("/test/date")
  public Map<String, Object> getDate() {
    Map<String, Object> result = new HashMap<>();
    result.put("date", LocalDateTime.now());
    return result;
  }

}

