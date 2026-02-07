package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.MoveBattleStyleDetail
import model.MoveDetail
import model.MoveLearnMethodDetail
import model.MoveMetaAilmentDetail
import model.MoveMetaCategoryDetail
import model.MoveTargetDetail
import model.PaginatedMoveBattleStyleSummaryList
import model.PaginatedMoveLearnMethodSummaryList
import model.PaginatedMoveMetaAilmentSummaryList
import model.PaginatedMoveMetaCategorySummaryList
import model.PaginatedMoveSummaryList
import model.PaginatedMoveTargetSummaryList

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class MovesApiController @Inject()(cc: ControllerComponents, api: MovesApi) extends AbstractController(cc) {
  /**
    * GET /api/v2/move-ailment/?limit=[value]&offset=[value]&q=[value]
    */
  def moveAilmentList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedMoveMetaAilmentSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.moveAilmentList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/move-ailment/:id/
    * @param id This parameter can be a string or an integer.
    */
  def moveAilmentRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): MoveMetaAilmentDetail = {
      api.moveAilmentRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/move-battle-style/?limit=[value]&offset=[value]&q=[value]
    */
  def moveBattleStyleList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedMoveBattleStyleSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.moveBattleStyleList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/move-battle-style/:id/
    * @param id This parameter can be a string or an integer.
    */
  def moveBattleStyleRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): MoveBattleStyleDetail = {
      api.moveBattleStyleRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/move-category/?limit=[value]&offset=[value]&q=[value]
    */
  def moveCategoryList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedMoveMetaCategorySummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.moveCategoryList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/move-category/:id/
    * @param id This parameter can be a string or an integer.
    */
  def moveCategoryRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): MoveMetaCategoryDetail = {
      api.moveCategoryRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/move-learn-method/?limit=[value]&offset=[value]&q=[value]
    */
  def moveLearnMethodList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedMoveLearnMethodSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.moveLearnMethodList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/move-learn-method/:id/
    * @param id This parameter can be a string or an integer.
    */
  def moveLearnMethodRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): MoveLearnMethodDetail = {
      api.moveLearnMethodRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/move/?limit=[value]&offset=[value]&q=[value]
    */
  def moveList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedMoveSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.moveList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/move/:id/
    * @param id This parameter can be a string or an integer.
    */
  def moveRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): MoveDetail = {
      api.moveRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/move-target/?limit=[value]&offset=[value]&q=[value]
    */
  def moveTargetList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedMoveTargetSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.moveTargetList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/move-target/:id/
    * @param id This parameter can be a string or an integer.
    */
  def moveTargetRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): MoveTargetDetail = {
      api.moveTargetRetrieve(id)
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
