package me.runzhuo.cdk;

import software.amazon.awscdk.core.App;

public class CdkTestApp {
    public static void main(final String[] args) {
        final App app = new App();
        final CdkTestStackProps props = new CdkTestStackProps();
        props.setLambdaCodeLocation("target/lambda.jar");
        // create cloud formation stack
        new CdkTestStack(app, "CdkTestStack", props);
        // synth
        app.synth();
    }
}
