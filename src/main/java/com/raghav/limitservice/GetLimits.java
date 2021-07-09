package com.raghav.limitservice;

import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class GetLimits {
    private int maximum;
    private int minimum;

    public GetLimits() {
    }

    public GetLimits(int maximum, int minimum) {
        this.maximum = maximum;
        this.minimum = minimum;
    }
}
