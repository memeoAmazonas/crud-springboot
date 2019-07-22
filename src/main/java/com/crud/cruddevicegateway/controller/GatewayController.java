package com.crud.cruddevicegateway.controller;

import com.crud.cruddevicegateway.dao.entity.Device;
import com.crud.cruddevicegateway.dao.entity.Gateway;
import com.crud.cruddevicegateway.service.GatewayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/crud/gateway")
public class GatewayController {

    @Autowired
    GatewayService gatewayService;
    @GetMapping(value = "/get")
    public ResponseEntity getGateway(@RequestParam("id") String id){
        try {
            return  new ResponseEntity("work-2", HttpStatus.OK);
        }catch (Exception e){
            return  new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(value = "/getAll")
    public ResponseEntity getAllGateway(){
        try {
            return  new ResponseEntity("work-2", HttpStatus.OK);
        }catch (Exception e){
            return  new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(value = "/set")
    public ResponseEntity setGateway(@RequestBody Gateway gateway){
        try {
            return  new ResponseEntity(gatewayService.createGateway(gateway), HttpStatus.OK);
        }catch (Exception e){
            return  new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping(value = "/delete")
    public ResponseEntity deletetGateway(@RequestBody String id){
        try {
            return  new ResponseEntity(gatewayService.deleteGateway(id), HttpStatus.OK);
        }catch (Exception e){
            return  new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping(value = "/addDevice")
    public ResponseEntity addDevice(@RequestBody String device) {
        try {
            return new ResponseEntity("work-2", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
        @PostMapping(value = "/deleteDevice")
    public ResponseEntity deleteDevice( @RequestParam("id") String id){
        try {
            return  new ResponseEntity("work-2", HttpStatus.OK);
        }catch (Exception e){
            return  new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }




}
