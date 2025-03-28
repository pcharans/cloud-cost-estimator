package com.pruthvi.cloud_cost_estimator.model;

public class CostEstimateRequest {
    private int ec2Instances;
    private double s3StorageGb;
    private long lambdaInvocationsPerMonth;

    public int getEc2Instances() {
        return ec2Instances;
    }

    public void setEc2Instances(int ec2Instances) {
        this.ec2Instances = ec2Instances;
    }

    public double getS3StorageGb() {
        return s3StorageGb;
    }

    public void setS3StorageGb(double s3StorageGb) {
        this.s3StorageGb = s3StorageGb;
    }

    public long getLambdaInvocationsPerMonth() {
        return lambdaInvocationsPerMonth;
    }

    public void setLambdaInvocationsPerMonth(long lambdaInvocationsPerMonth) {
        this.lambdaInvocationsPerMonth = lambdaInvocationsPerMonth;
    }
}
