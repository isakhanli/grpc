package com.test.servicea;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@AllArgsConstructor
@RestController
public class ServiceAContoller {
    private final GRPCClientService grpcClientService;

    @GetMapping("/findsum")
    public ResponseEntity<Integer> findsum(@RequestBody FindSumDto findSumDto){
        /* Rest

        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8082/returnSum";
        Integer response = restTemplate.postForObject(url, findSumDto, Integer.class);
        return new ResponseEntity<>(response, HttpStatus.OK);
         */

        //GRPC
        return new ResponseEntity<>(grpcClientService.findSum(findSumDto.getA(), findSumDto.getB()), HttpStatus.OK);

    }
}
