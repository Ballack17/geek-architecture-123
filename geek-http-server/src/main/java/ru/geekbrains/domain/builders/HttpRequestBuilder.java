package ru.geekbrains.domain.builders;

import ru.geekbrains.domain.HttpRequest;

import java.util.Map;

public class HttpRequestBuilder
{
    private final HttpRequest httpRequest;

    public HttpRequestBuilder(String method) {
        httpRequest = new HttpRequest(method);
    }
    public HttpRequestBuilder where(String path) {
        httpRequest.setPath(path);
        return this;
    }
    public HttpRequestBuilder what(String body) {
        httpRequest.setBody(body);
        return this;
    }
    public HttpRequestBuilder headers(Map<String, String> headers) {
        httpRequest.setHeaders(headers);
        return this;
    }

    public HttpRequest build() {
        return httpRequest;
    }
}
