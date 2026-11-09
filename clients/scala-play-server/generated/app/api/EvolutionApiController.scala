package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.EvolutionChainDetail
import model.EvolutionTriggerDetail
import model.EvolutionVariableDetail
import model.PaginatedEvolutionChainSummaryList
import model.PaginatedEvolutionTriggerSummaryList
import model.PaginatedEvolutionVariableSummaryList

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
@Singleton
class EvolutionApiController @Inject()(cc: ControllerComponents, api: EvolutionApi) extends AbstractController(cc) {
  /**
    * GET /api/v2/evolution-chain/?limit=[value]&offset=[value]
    */
  def evolutionChainList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedEvolutionChainSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      api.evolutionChainList(limit, offset)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/evolution-chain/:id/
    * @param id This parameter can be a string or an integer.
    */
  def evolutionChainRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): EvolutionChainDetail = {
      api.evolutionChainRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/evolution-trigger/?limit=[value]&offset=[value]&q=[value]
    */
  def evolutionTriggerList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedEvolutionTriggerSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.evolutionTriggerList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/evolution-trigger/:id/
    * @param id This parameter can be a string or an integer.
    */
  def evolutionTriggerRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): EvolutionTriggerDetail = {
      api.evolutionTriggerRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/evolution-variable/?limit=[value]&offset=[value]&q=[value]
    */
  def evolutionVariableList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedEvolutionVariableSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.evolutionVariableList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/evolution-variable/:id/
    * @param id This parameter can be a string or an integer.
    */
  def evolutionVariableRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): EvolutionVariableDetail = {
      api.evolutionVariableRetrieve(id)
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
