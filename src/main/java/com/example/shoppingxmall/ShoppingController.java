package com.example.shoppingxmall;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//public class ShoppingController {
//
//}

@RestController
public class ShoppingController
{
    @Autowired
    private ShoppingService service;

    // RESTful API methods for Retrieval operations
    @GetMapping("/Shopping")
    public List<Shopping> list()
    {
        return service.listAll();
    }
    @GetMapping("/Shopping/{id}")
    public ResponseEntity<Shopping> get(@PathVariable Integer id)
    {
        try
        {
            Shopping Shopping = service.get(id);
            return new ResponseEntity<Shopping>(Shopping, HttpStatus.OK);
        }
        catch (NoSuchElementException e)
        {
            return new ResponseEntity<Shopping>(HttpStatus.NOT_FOUND);
        }
    }
    // RESTful API method for Create operation
    @PostMapping("/Shopping")
    public void add(@RequestBody Shopping Shopping)
    {
        service.save(Shopping);
    }

    // RESTful API method for Update operation
    @PutMapping("/Shopping/{id}")
    public ResponseEntity<?> update(@RequestBody Shopping Shopping, @PathVariable Integer id)
    {
        try
        {
            Shopping existShopping = service.get(id);
            service.save(Shopping);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch (NoSuchElementException e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    // RESTful API method for Delete operation
    @DeleteMapping("/Shoppings/{id}")
    public void delete(@PathVariable Integer id)
    {
        service.delete(id);
    }
}
