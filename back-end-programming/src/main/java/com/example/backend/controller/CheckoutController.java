package com.example.backend.controller;

import com.example.backend.dto.Purchase;
import com.example.backend.dto.PurchaseResponse;
import com.example.backend.services.CheckoutService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService){
        this.checkoutService = checkoutService;

    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase){


        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase);

        return purchaseResponse;


    }

}
