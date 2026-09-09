package uz.pdp.with_video;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class example {
    static void main() throws URISyntaxException, IOException, InterruptedException {

//        URL url= new URL("https://kun.uz");
//        URLConnection urlConnection = url.openConnection();;
//        InputStream inputStream = urlConnection.getInputStream();
//        Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8);
//
//
//       while (scanner.hasNext()){
//           String string = scanner.nextLine();
//           System.out.println(string);
//           TimeUnit.MILLISECONDS.sleep(10);
//       }

       // not recommended

        // java 11 http client  ihlatamiz
        //  http  has three parts  respone
// http client  removed servicega ulanish ma'lumot olsihs 
        // http client  4 ta qism get post put = uptade


        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest
                //.newBuilder(URI.create("http://localhost:8080/api/users/1"))
                .newBuilder(URI.create("http:localhost:8080/api/users/11"))//
                .GET()
                .build();

        HttpResponse<String>response = httpClient.send(httpRequest,HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

    }
}
