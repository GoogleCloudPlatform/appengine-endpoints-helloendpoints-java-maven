appengine-endpoints-helloendpoints-java-maven
=============================================

A "hello world" application for Google Cloud Endpoints in Java.

## Products
- [App Engine][1]

## Language
- [Java][2]

## APIs
- [Google Cloud Endpoints][3]
- [Google App Engine Maven plugin][4]

## Setup Instructions
1. Update the value of `application` in `appengine-web.xml` to the app ID you
   have registered in the App Engine admin console and would like to use to host
   your instance of this sample.
1. `mvn clean install`
1. Run the application with `mvn appengine:devserver`, and ensure it's running
   by visiting your local server's address (by default [localhost:8080][5].)
1. Get the client library with `mvn appengine:endpoints_get_client_lib` (it will generate a zip file named `helloworld-v1-java.zip` in the root of your project.)
1. Deploy your application with `mvn appengine:update`


[1]: https://developers.google.com/appengine
[2]: http://java.com/en/
[3]: https://developers.google.com/appengine/docs/java/endpoints/
[4]: https://developers.google.com/appengine/docs/java/tools/maven
[5]: https://localhost:8080/
