package edu.escuelaing.arem;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import spark.Request;
import spark.Response;
import spark.Route;
import static spark.Spark.*;


public class App 
{
    public static void main(String[] args) {
        port(getPort());
        get("/", (req, res) -> inputDataPage(req, res));
        get("/results", (req, res) -> resultsPage(req, res));
    }
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set(i.e. on localhost)
    }
    public static Integer square(Integer i){
        return i*i;
    }
    
     private static String inputDataPage(Request req, Response res) {
        String pageContent
                = "<!DOCTYPE html>"
                + "<html>"
                +"<head>"
                +"<link href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" rel=\"stylesheet\"" 
                +"integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">" 
                +"</head>"
                + "<body>"
                + "<h2>Calculate the square of a number</h2>"
                + "<form action=\"/results\">"
                + "  Enter a number:<br>"
                + "  <br>"
                + "  <textarea class=\"form-control\" name=\"data\" placeholder=\"5\">5</textarea>"
                + "  <br>"
                + "  <button class= \"btn btn-outline-primary\" type=\"submit\">Calculate</button>"
                + "</form>"
                +" <br>"
                + "<p><i>If you click the \"Calculate\" button, the form-data will be sent to a page called \"/results\".</i></p>"
                + "</body>"
                + "</html>";
        return pageContent;
    }
    private static String resultsPage(Request req, Response res) throws Exception {
        String number=(req.queryParams("data"));
         URL pagina=new URL("https://do54nf3jsg.execute-api.us-east-1.amazonaws.com/Beta?value="+number);
        String contenido="";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(pagina.openStream()))) {
			String inputLine = null;
			while ((inputLine = reader.readLine()) != null) {
				contenido+=inputLine;
			}
		} catch (IOException io) {
			System.err.println(io);

		}
        return contenido;
    }
}
