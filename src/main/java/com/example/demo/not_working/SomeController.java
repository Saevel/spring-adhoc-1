package com.example.demo.not_working;

import com.example.demo.MyClass;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import static com.example.demo.not_working.ResourceBeanClass.MYCLASS_METHOD_B_BEAN;

@RestController // Zakomentuj tę anotację to zacznie działać...
@RequestMapping("/path")
public class SomeController {
    @Autowired
    @Qualifier(MYCLASS_METHOD_B_BEAN)
    private MyClass myClass;

    @GetMapping
    public Mono<ResponseEntity<?>> smth() {
        return Mono.just(ResponseEntity.status(HttpStatus.OK).body(myClass.getType()));
    }
}
