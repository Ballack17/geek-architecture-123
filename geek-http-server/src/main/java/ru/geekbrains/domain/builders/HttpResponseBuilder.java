package ru.geekbrains.domain.builders;

import ru.geekbrains.domain.HttpResponse;

import java.util.Map;

public class HttpResponseBuilder
{

    private final HttpResponse httpResponse;

    public HttpResponseBuilder(int statusCode)
    {
        httpResponse = new HttpResponse(statusCode);
    }

    public HttpResponseBuilder what(String body)
    {
        httpResponse.setBody(body);
        return this;
    }

    public HttpResponseBuilder headers(Map<String, String> headers)
    {
        httpResponse.setHeaders(headers);
        return this;
    }

    public HttpResponse build()
    {
        return httpResponse;
    }
}
