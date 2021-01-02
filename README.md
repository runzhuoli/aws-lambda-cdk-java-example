# Welcome to your CDK Java project!

This is the mini code bast to create an AWS Lambda function with AWS CDK based on Java 11. 

CDK related code are located in `infra` folder. The `cdk.json` file tells the CDK Toolkit how to execute your app.

Lambda function code is located in `src` folder. It is compiled and packaged into `lambda.zip` through Maven. See `pom.xml` for detailed configs.

It is a [Maven](https://maven.apache.org/) based project, so you can open this project with any Maven compatible Java IDE to build and run tests.

## Useful commands

 * `mvn package`     compile and run tests
 * `cdk bootstrap`   create cdk tool kit stack if not exists
 * `cdk ls`          list all stacks in the app
 * `cdk synth`       emits the synthesized CloudFormation template
 * `cdk deploy`      deploy this stack to your default AWS account/region
 * `cdk diff`        compare deployed stack with current state
 * `cdk docs`        open CDK documentation

Enjoy!
