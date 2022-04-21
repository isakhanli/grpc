package com.test.serviceb;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBController {

    @PostMapping ("/returnSum")
    public int returnSum(@RequestBody FindSumDto findSumDto){
        return findSumDto.getA() + findSumDto.getB();
    }
}
