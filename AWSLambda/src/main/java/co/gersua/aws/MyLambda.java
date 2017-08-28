package co.gersua.aws;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class MyLambda implements RequestHandler<Request, Response> {

    @Override
    public Response handleRequest(Request request, Context context) {
        return new Response(request.getInput().toUpperCase());
    }
}