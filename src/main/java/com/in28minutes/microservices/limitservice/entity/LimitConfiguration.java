package com.in28minutes.microservices.limitservice.entity;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LimitConfiguration {
    private int minimum;
    private int maximum;
}
