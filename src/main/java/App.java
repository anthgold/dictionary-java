import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {

  // public static void main(String[] args) {
  //   staticFileLocation("/public");
  //   String layout = "templates/layout.vtl";
  //
  //   get("/", (request, response) -> {
  //     HashMap<String, Object> model = new HashMap<String, Object>();
  //     model.put("template", "templates/index.vtl");
  //     return new ModelAndView(model, layout);
  //   }, new VelocityTemplateEngine());
  //
  //   get("definitions/new", (request, response) -> {
  //     HashMap<String, Object> model = new HashMap<String, Object>();
      // model.put("template", "templates/definition-form.vtl");
  //     return new ModelAndView(model, layout);
  //   }, new VelocityTemplateEngine());
  //
  //   get("/definitions", (request, response) -> {
  //     HashMap<String, Object> model = new HashMap<String, Object>();
  //     model.put("definitions", Definition.all());
  //     model.put("template", "templates/definitions.vtl");
  //     return new ModelAndView(model, layout);
  //   }, new VelocityTemplateEngine());
  //
  //   post("/definitions", (request, response) -> {
  //     HashMap<String, Object> model = new HashMap<String, Object>();
  //     String meaning = request.queryParams("meaning");
  //     Definition newDefinition = new Definition(meaning);
  //     model.put("template", "templates/success.vtl");
  //     return new ModelAndView(model, layout);
  //   }, new VelocityTemplateEngine());
  //
  // }

}
