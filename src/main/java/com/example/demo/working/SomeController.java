//package com.example.demo.working;
//
//import com.example.demo.MyClass;
//import lombok.AllArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import reactor.core.publisher.Mono;
//
//@RestController
//@RequestMapping("/path")
//@AllArgsConstructor
//public class SomeController {
//    private MyClass methodA;
//
//    @GetMapping
//    public Mono<ResponseEntity<?>> smth() {
//        return Mono.just(ResponseEntity.status(HttpStatus.OK).body(methodA.getType()));
//    }
//}
