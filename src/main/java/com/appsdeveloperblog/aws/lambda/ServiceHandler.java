package com.appsdeveloperblog.aws.lambda;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;

public class ServiceHandler implements RequestHandler<APIGatewayProxyRequestEvent, String> {

    @Override
    public String handleRequest(APIGatewayProxyRequestEvent req, Context context) {
        context.getLogger().log("Input: ");
        return "Lambda Function is invoked through the AWS API Gateway....";
    }
}