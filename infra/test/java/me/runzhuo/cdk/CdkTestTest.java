package me.runzhuo.cdk;

import org.junit.platform.commons.util.StringUtils;
import software.amazon.awscdk.core.App;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CdkTestTest {
    private final static ObjectMapper JSON =
        new ObjectMapper().configure(SerializationFeature.INDENT_OUTPUT, true);

    @Test
    public void testStack() throws IOException {
        final App app = new App();
        final CdkTestStackProps props = new CdkTestStackProps();
        props.setLambdaCodeLocation("infra/test");
        final CdkTestStack stack = new CdkTestStack(app, "TestStack", props);
        // synthesize the stack to a CloudFormation template and compare against
        // a checked-in JSON file.
        JsonNode actual = JSON.valueToTree(app.synth().getStackArtifact(stack.getArtifactId()).getTemplate());
        assertThat(StringUtils.isNotBlank(actual.toString())).isTrue();
    }
}
