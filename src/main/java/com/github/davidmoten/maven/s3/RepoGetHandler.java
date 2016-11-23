package com.github.davidmoten.maven.s3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.util.IOUtils;

public class RepoGetHandler implements RequestStreamHandler {

    @Override
    public void handleRequest(InputStream input, OutputStream output, Context context)
            throws IOException {
        LambdaLogger log = context.getLogger();

        log.log("in=" + IOUtils.toString(input));
        // Map<String, Object> parameters = ((Map<String, Object>)
        // input.get("params"));
        // Map<String, Object> ctxt = ((Map<String, Object>)
        // input.get("context"));
        // String username = String.valueOf(ctxt.get("api-key"));
        // log.log(parameters.toString());
        // log.log(ctxt.toString());

        AmazonS3Client s3 = new AmazonS3Client();
        // url will be passed through in "errorMessage" property
        byte[] b64 = Base64.getEncoder().encode("hello there".getBytes(StandardCharsets.UTF_8));
        output.write(b64);
    }

}
