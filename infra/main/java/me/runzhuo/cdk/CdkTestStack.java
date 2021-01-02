package me.runzhuo.cdk;

import software.amazon.awscdk.core.Construct;
import software.amazon.awscdk.core.Stack;
import software.amazon.awscdk.services.lambda.Code;
import software.amazon.awscdk.services.lambda.Function;
import software.amazon.awscdk.services.lambda.Runtime;

public class CdkTestStack extends Stack {
    public CdkTestStack(final Construct scope, final String id, final CdkTestStackProps props) {
        super(scope, id, props);
        // create an aws lambda function with JAVA 11
        Function.Builder.create(this, "cdk-test-lambda")
                .runtime(Runtime.JAVA_11)
                .code(Code.fromAsset(props.getLambdaCodeLocation()))
                .handler("me.runzhuo.Handler")
                .build();
    }
}
