/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.example.Vishal.myapplication.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.myapplication.Vishal.example.com",
                ownerName = "backend.myapplication.Vishal.example.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /**
     * A simple endpoint method that takes a name and says Hi back
 /*    *//*
    @ApiMethod(name = "sayHi")
    public MyBean sayHi(@Named("name") String name) {
        MyBean response = new MyBean();
        response.setData("Hi, " + name+" "+response.getJoke());

        return response;
    }*/


    @ApiMethod(name = "putJoke")
    public MyBean putJoke(MyBean joke) {
//        JokeBean response = new JokeBean();
//        response.setJoke("Hi, " + name);
        return joke;
    }
   /* @ApiMethod(name = "selectJoke")
    public MyBean selectJoke(MyBean joke) {
        return joke;
    }*/

}
