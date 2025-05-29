package com.productservice.paymentservice.controllers;

import jdk.jfr.Event;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stripeWebhook")
public class StripeWebhookController {

//    @PostMapping
//    public void stripeWebhook(@RequestBody Event event) {
//        System.out.println("Stripe Webhook endpoint");
//
//        if(event.getType() == "payment_link.created"){
//
//        }else if (event.getType() == "payment_link.updated"){
//
//        }else if(event.getType() == "payment_link.deleted"){
//
//        }
//    }
}
