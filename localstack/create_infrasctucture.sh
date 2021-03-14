awslocal sns create-topic --name example-topic
awslocal sns subscribe --topic-arn arn:aws:sns:us-east-1:000000000000:example-topic --protocol sqs --notification-endpoint arn:aws:sns:us-east-1:000000000000:example-topicqueue
