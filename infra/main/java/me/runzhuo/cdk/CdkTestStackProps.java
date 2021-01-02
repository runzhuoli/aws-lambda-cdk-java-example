package me.runzhuo.cdk;

import software.amazon.awscdk.core.StackProps;

public class CdkTestStackProps implements StackProps {
    private String lambdaCodeLocation;

    public String getLambdaCodeLocation() {
        return lambdaCodeLocation;
    }

    public void setLambdaCodeLocation(String lambdaCodeLocation) {
        this.lambdaCodeLocation = lambdaCodeLocation;
    }
}
