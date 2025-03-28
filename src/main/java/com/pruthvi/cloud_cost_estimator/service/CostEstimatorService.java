package com.pruthvi.cloud_cost_estimator.service;

import org.springframework.stereotype.Service;
import com.pruthvi.cloud_cost_estimator.model.CostEstimateRequest;

@Service
public class CostEstimatorService {

    public double calculateEstimatedCost(CostEstimateRequest request) {
        double ec2Cost = request.getEc2Instances() * 30.0;
        double s3Cost = request.getS3StorageGb() * 0.023;
        double lambdaCost = (request.getLambdaInvocationsPerMonth() / 1000000.0) * 0.20;

        return ec2Cost + s3Cost + lambdaCost;
    }
}
