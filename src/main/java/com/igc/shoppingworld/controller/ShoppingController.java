package com.igc.shoppingworld.controller;

import com.igc.shoppingworld.model.ShoppingModel;
import com.igc.shoppingworld.response.Response;
import com.igc.shoppingworld.service.impl.ShoppingService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ControllerClassOfMall")
public class ShoppingController {

    @Autowired
    ShoppingService shoppingService;

    @GetMapping("/home")
    public String showHome() {
        return "-----  Welcome in Paras Shopping Center  -----";
    }

    @PostMapping("/addData")
    public ResponseEntity<?> addData(@RequestBody @Valid ShoppingModel shoppingModel) {
        return new ResponseEntity<>(new Response("Data is added.", HttpStatus.CREATED, shoppingService.addData(shoppingModel)), HttpStatus.CREATED);
    }

    @GetMapping("/getAllData")
    public ResponseEntity<?> getAllData() {
        return new ResponseEntity<>(new Response("Data is listed.", HttpStatus.OK, shoppingService.getAllData()), HttpStatus.OK);
    }

    @GetMapping("/updateData/{id}")
    public ResponseEntity<?> updateData(@PathVariable ("id") Integer id, @RequestBody ShoppingModel shoppingModel) {
        return new ResponseEntity<>(new Response("Data is updated.", HttpStatus.CREATED, shoppingService.updateData(id, shoppingModel)), HttpStatus.CREATED);
    }

    @GetMapping("/deleteData/{id}")
    public ResponseEntity<?> deleteData(@PathVariable ("id") Integer id) {
        return new ResponseEntity<>(new Response("Data is deleted.", HttpStatus.OK, shoppingService.deleteData(id)), HttpStatus.OK);
    }

    @GetMapping("/getDataFromId/{id}")
    public ResponseEntity<?> getDataFromId(@PathVariable ("id") Integer id) {
        return new ResponseEntity<>(new Response("Data displays.", HttpStatus.FOUND, shoppingService.getDataFromId(id)), HttpStatus.FOUND);
    }
}
