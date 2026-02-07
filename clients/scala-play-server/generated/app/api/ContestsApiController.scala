package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.ContestEffectDetail
import model.ContestTypeDetail
import model.PaginatedContestEffectSummaryList
import model.PaginatedContestTypeSummaryList
import model.PaginatedSuperContestEffectSummaryList
import model.SuperContestEffectDetail

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class ContestsApiController @Inject()(cc: ControllerComponents, api: ContestsApi) extends AbstractController(cc) {
  /**
    * GET /api/v2/contest-effect/?limit=[value]&offset=[value]&q=[value]
    */
  def contestEffectList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedContestEffectSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.contestEffectList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/contest-effect/:id/
    * @param id This parameter can be a string or an integer.
    */
  def contestEffectRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): ContestEffectDetail = {
      api.contestEffectRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/contest-type/?limit=[value]&offset=[value]&q=[value]
    */
  def contestTypeList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedContestTypeSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.contestTypeList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/contest-type/:id/
    * @param id This parameter can be a string or an integer.
    */
  def contestTypeRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): ContestTypeDetail = {
      api.contestTypeRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/super-contest-effect/?limit=[value]&offset=[value]&q=[value]
    */
  def superContestEffectList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedSuperContestEffectSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.superContestEffectList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/super-contest-effect/:id/
    * @param id This parameter can be a string or an integer.
    */
  def superContestEffectRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): SuperContestEffectDetail = {
      api.superContestEffectRetrieve(id)
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
