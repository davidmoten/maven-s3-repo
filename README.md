# maven-s3-repo
Read from an S3-backed maven repository using standard http wagon authentication and serverless architecture.

Features
* uses S3 storage (3c/GB/month)
* expose repo via AWS API Gateway and Lambda
* low to medium usage = zero runtime costs
* uses standard http wagon (custom wagon extensions not allowed in some CI environments)

One issue is that API Gateway doesn't support binary responses but it can return an HTTP redirect to a temporary authenticated S3 url which will return binary data. Plan is to make a proof-of-concept to see if maven http wagon is happy with redirects. Preliminary readings indicate it supports HTTP GET and HTTP PUT redirects so worth following up. I'll put this up soon.

Update: as of about 18 November 2016, AWS Gateway now supports binary inputs and responses. This project is definitely a goer.
