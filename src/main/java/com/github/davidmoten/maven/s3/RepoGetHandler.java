package com.github.davidmoten.maven.s3;

import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.s3.AmazonS3Client;

public class RepoGetHandler {

    public String get(Map<String, Object> input, Context context) {
        LambdaLogger log = context.getLogger();

        log.log(input.toString());
        // Map<String, Object> parameters = ((Map<String, Object>)
        // input.get("params"));
        // Map<String, Object> ctxt = ((Map<String, Object>)
        // input.get("context"));
        // String username = String.valueOf(ctxt.get("api-key"));
        // log.log(parameters.toString());
        // log.log(ctxt.toString());

        AmazonS3Client s3 = new AmazonS3Client();
        // url will be passed through in "errorMessage" property
        throw new RuntimeException("https://github.com");
    }

}
