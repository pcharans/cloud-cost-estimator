package com.pruthvi.cloud_cost_estimator.controller;

import com.pruthvi.cloud_cost_estimator.model.CostEstimateRequest;
import com.pruthvi.cloud_cost_estimator.service.CostEstimatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/cost")
public class CostEstimatorController {

    @Autowired
    private CostEstimatorService costEstimatorService;

    @PostMapping("/estimate")
    public double estimateCost(@RequestBody CostEstimateRequest request) {
        return costEstimatorService.calculateEstimatedCost(request);
    }
}
