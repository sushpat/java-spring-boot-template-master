package com.daimler.app.controller;

import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="*")
public class AppController {
  
  @GetMapping("/get")
  public ResponseEntity<String[]> getString()
  {
    // Get controller
    String[] strings = {"one","two","three","four"};
    return new ResponseEntity<>( strings ,HttpStatus.OK);    
  }
  
  @PostMapping("/post")
  public ResponseEntity<String[]> postString(@RequestBody String[] arrayOfStrings)
  {
    // Post controller
    return new ResponseEntity<>(arrayOfStrings, HttpStatus.CREATED);
  }
  
  @PutMapping("/put")
  public ResponseEntity<String> putString(@RequestBody String[] arrayOfStrings)
  {
    return new ResponseEntity<>(HttpStatus.OK);
  }
  
  @PatchMapping("/patch")
  public ResponseEntity<String> patchValues(@RequestBody Map<String,String> patchValues)  
  {
    // Patch controller
    // patch value logic
    return new ResponseEntity<>(HttpStatus.OK);
  }
  
  @DeleteMapping("/delete")
  public ResponseEntity<String> deleteString(@RequestBody String stringValue)
  {
    // Delete controller
    // delete logic
    return new ResponseEntity<>(HttpStatus.OK);
  }

}
