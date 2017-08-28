package co.gersua.aws;

import org.junit.Assert;
import org.junit.Test;

public class MyLambdaTest {

    @Test
    public void handleRequestTest() {
        String testString = "test input";
        MyLambda myLambda = new MyLambda();
        Request request = new Request(testString);
        Response response = myLambda.handleRequest(request, null);
        Assert.assertTrue(response.getOutput().equals(testString.toUpperCase()));
    }
}
