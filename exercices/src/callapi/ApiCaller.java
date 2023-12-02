package callapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiCaller {

    public static String callApi(String apiUrl, String method) throws IOException {
        URL url = new URL(apiUrl);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Définir la méthode de la requête (GET, POST, etc.)
        connection.setRequestMethod(method);

        // Lire la réponse de l'API
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            response.append(line);
        }

        reader.close();
        connection.disconnect();

        return response.toString();
    }

    public static void main(String[] args) {
        try {
            String apiUrl = "https://api.coingecko.com/api/v3/ping";
            String apiResponse = callApi(apiUrl, "GET");

            // Afficher la réponse
            System.out.println(apiResponse);

            // À partir d'ici, vous pouvez traiter les données de la réponse selon le format de l'API
            // Vous pouvez utiliser une bibliothèque JSON (comme Jackson ou Gson) si la réponse est en JSON, par exemple.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
