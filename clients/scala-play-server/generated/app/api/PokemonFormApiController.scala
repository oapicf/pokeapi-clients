package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-21T04:06:20.868089Z[Etc/UTC]")
@Singleton
class PokemonFormApiController @Inject()(cc: ControllerComponents, api: PokemonFormApi) extends AbstractController(cc) {
  /**
    * GET /api/v2/pokemon-form/?limit=[value]&offset=[value]
    */
  def pokemonFormList(): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
      api.pokemonFormList(limit, offset)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/pokemon-form/:id/
    */
  def pokemonFormRead(id: Int): Action[AnyContent] = Action { request =>
    def executeApi(): String = {
      api.pokemonFormRead(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
