package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.ItemAttributeDetail
import model.ItemCategoryDetail
import model.ItemDetail
import model.ItemFlingEffectDetail
import model.ItemPocketDetail
import model.PaginatedItemAttributeSummaryList
import model.PaginatedItemCategorySummaryList
import model.PaginatedItemFlingEffectSummaryList
import model.PaginatedItemPocketSummaryList
import model.PaginatedItemSummaryList

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class ItemsApiController @Inject()(cc: ControllerComponents, api: ItemsApi) extends AbstractController(cc) {
  /**
    * GET /api/v2/item-attribute/?limit=[value]&offset=[value]&q=[value]
    */
  def itemAttributeList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedItemAttributeSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.itemAttributeList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/item-attribute/:id/
    * @param id This parameter can be a string or an integer.
    */
  def itemAttributeRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): ItemAttributeDetail = {
      api.itemAttributeRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/item-category/?limit=[value]&offset=[value]&q=[value]
    */
  def itemCategoryList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedItemCategorySummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.itemCategoryList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/item-category/:id/
    * @param id This parameter can be a string or an integer.
    */
  def itemCategoryRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): ItemCategoryDetail = {
      api.itemCategoryRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/item-fling-effect/?limit=[value]&offset=[value]&q=[value]
    */
  def itemFlingEffectList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedItemFlingEffectSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.itemFlingEffectList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/item-fling-effect/:id/
    * @param id This parameter can be a string or an integer.
    */
  def itemFlingEffectRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): ItemFlingEffectDetail = {
      api.itemFlingEffectRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/item/?limit=[value]&offset=[value]&q=[value]
    */
  def itemList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedItemSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.itemList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/item-pocket/?limit=[value]&offset=[value]&q=[value]
    */
  def itemPocketList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedItemPocketSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.itemPocketList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/item-pocket/:id/
    * @param id This parameter can be a string or an integer.
    */
  def itemPocketRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): ItemPocketDetail = {
      api.itemPocketRetrieve(id)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/item/:id/
    * @param id This parameter can be a string or an integer.
    */
  def itemRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): ItemDetail = {
      api.itemRetrieve(id)
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
