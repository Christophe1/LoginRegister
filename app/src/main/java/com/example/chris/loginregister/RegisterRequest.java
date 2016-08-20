package com.example.chris.loginregister;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Chris on 24/07/2016.
 */

public class RegisterRequest extends StringRequest {

//    private static final String REGISTER_REQUEST_URL = "http://christophe.comxa.com/Register.php";


    private static final String REGISTER_REQUEST_URL = "http://37.139.17.25/Register.php";
    private Map<String, String> params;

    public RegisterRequest(String username, Response.Listener<String> listener){

        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("username", username);

    }

    @Override
    public Map<String, String> getParams() {

        return params;
    }
}
