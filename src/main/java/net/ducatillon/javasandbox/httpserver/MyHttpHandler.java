package net.ducatillon.javasandbox.httpserver;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

public class MyHttpHandler implements HttpHandler {

    public static final int R_CODE = 502;
    private static int index = 0;

    @Override
    public void handle(HttpExchange httpExchange) throws IOException {
        System.out.println("request : " + ++index + ((index % 5 == 3) ? "=> response : 404" : ""));
        Headers requestHeaders = httpExchange.getRequestHeaders();
        List<String> strings = requestHeaders.get("X-Correlation-Id");
        //if (strings.size() > 0) System.out.println("request Headers: " + strings.get(0));

        String requestParamValue = null;
        OutputStream outputStream = httpExchange.getResponseBody();
        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append("{ " +
                "\"error\" : \"NOT FOUNT\"," +
                "\"message\" : \"Hello " + R_CODE + " !!\"," +
                "\"error_description\" : \"Not found, it returns  " + R_CODE + " !!\"" +
                "}");
        // encode HTML content
        if (index % 5 == 3) {
            httpExchange.sendResponseHeaders(404, htmlBuilder.toString().length());
        } else {
            httpExchange.sendResponseHeaders(R_CODE, htmlBuilder.toString().length());
        }
        outputStream.write(htmlBuilder.toString().getBytes());
        outputStream.flush();
        outputStream.close();
    }
}
