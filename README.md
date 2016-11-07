# maven-s3-repo
Read from an S3-backed maven repository using standard http wagon authentication.

Features
* uses S3 storage (3c/GB/month)
* expose repo via AWS API Gateway and Lambda
* low to medium usage = zero runtime costs
* uses standard http wagon (custom wagon extensions not allowed in some CI environments)

