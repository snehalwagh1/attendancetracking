package com.zoho.attendance.controller;

import com.zoho.attendance.entity.HolidayDetail;
import com.zoho.attendance.service.HolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/holidaydetail")
public class HolidayController {
    @Autowired
    HolidayService holidayservice;

    @PostMapping(path = "/addholiday")
    @CrossOrigin
    @ResponseBody
    public ResponseEntity<String> addUser(@RequestBody HolidayDetail holidaydetail) {
        HttpHeaders headers = new HttpHeaders();

        try {

            return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(holidayservice.addUser(holidaydetail));
        } catch (Exception e) {
            // TODO: handle exception
            headers.add("Message", "false");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers).body("Failed to add the user");
        }

    }


    @GetMapping(path = "/findallholiday")
    @CrossOrigin
    @ResponseBody
    public ResponseEntity<?> findAllHoliday() {
        HttpHeaders headers = new HttpHeaders();

        try {

            return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(holidayservice.findAllHoliday());
        } catch (Exception e) {
            // TODO: handle exception
            headers.add("Message", "false");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers).body("Failed to add the user");
        }
    }


    @GetMapping(path = "/findbydateholiday")
    @CrossOrigin
    @ResponseBody
    public ResponseEntity<?> findByDate(@RequestParam long date) {
        HttpHeaders headers = new HttpHeaders();

        try {

            return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(holidayservice.findByDate(date));
        } catch (Exception e) {
            // TODO: handle exception
            headers.add("Message", "false");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers).body("Failed to add the user");
        }

    }

    @GetMapping(path = "/deletebydateholiday")
    @CrossOrigin
    @ResponseBody
    public ResponseEntity<?> deleteBydeptid(@RequestParam long date) {
        HttpHeaders headers = new HttpHeaders();

        try {

            return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(holidayservice.deleteBydeptid(date));
        } catch (Exception e) {
            // TODO: handle exception
            headers.add("Message", "false");
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).headers(headers).body("Failed to add the user");
        }


    }

}
