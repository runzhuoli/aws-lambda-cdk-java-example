package me.runzhuo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.amazonaws.services.lambda.runtime.Context;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Map;

@ExtendWith(MockitoExtension.class)
public class HandlerTest {

    @Mock
    private Context context;

    @Mock
    private Map<String, String> event;

    @Test
    public void testHandleRequest(){
        Handler function = new Handler();
        Object result = function.handleRequest(event, context);
        assertEquals("200 OK", result);
    }
}
