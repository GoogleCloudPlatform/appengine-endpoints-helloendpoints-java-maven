package com.google.devrel.samples.helloendpoints;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.appengine.api.users.User;

import java.util.ArrayList;

import javax.inject.Named;

/**
 * Defines v1 of a helloworld API, which provides simple "greeting" methods.
 */
@Api(
    name = "helloworld",
    version = "v1",
    clientIds = {Ids.WEB_CLIENT_ID, Ids.ANDROID_CLIENT_ID, Ids.IOS_CLIENT_ID},
    audiences = {Ids.ANDROID_AUDIENCE}
)
public class Greetings {

  public static ArrayList<Greeting> greetings = new ArrayList<Greeting>();

  static {
    greetings.add(new Greeting("hello world!"));
    greetings.add(new Greeting("goodbye world!"));
  }

  public Greeting getGreeting(@Named("id") Integer id) {
    return greetings.get(id);
  }

  public ArrayList<Greeting> listGreeting() {
    return greetings;
  }

  @ApiMethod(name = "greetings.multiply", httpMethod = "post")
  public Greeting insertGreeting(@Named("times") Integer times, Greeting greeting) {
    Greeting response = new Greeting();
    StringBuilder responseBuilder = new StringBuilder();
    for (int i = 0; i < times; i++) {
      responseBuilder.append(greeting.getMessage());
    }
    response.setMessage(responseBuilder.toString());
    return response;
  }

  @ApiMethod(name = "greetings.authed", path = "greeting/authed")
  public Greeting authedGreeting(User user) {
    Greeting response = new Greeting("hello " + user.getEmail());
    return response;
  }
}
