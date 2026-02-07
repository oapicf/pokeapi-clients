package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.MachineDetail
import model.PaginatedMachineSummaryList

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class MachinesApiController @Inject()(cc: ControllerComponents, api: MachinesApi) extends AbstractController(cc) {
  /**
    * GET /api/v2/machine/?limit=[value]&offset=[value]&q=[value]
    */
  def machineList(): Action[AnyContent] = Action { request =>
    def executeApi(): PaginatedMachineSummaryList = {
      val limit = request.getQueryString("limit")
        .map(value => value.toInt)
        
      val offset = request.getQueryString("offset")
        .map(value => value.toInt)
        
      val q = request.getQueryString("q")
        
      api.machineList(limit, offset, q)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /api/v2/machine/:id/
    * @param id This parameter can be a string or an integer.
    */
  def machineRetrieve(id: String): Action[AnyContent] = Action { request =>
    def executeApi(): MachineDetail = {
      api.machineRetrieve(id)
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
