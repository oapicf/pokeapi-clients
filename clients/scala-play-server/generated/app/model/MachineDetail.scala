package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MachineDetail.
  * @param id The identifier for this resource.
  * @param item The TM or HM item that corresponds to this machine.
  * @param versionGroup The version group that this machine applies to.
  * @param move The move that is taught by this machine.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class MachineDetail(
  id: Int,
  item: ItemSummary,
  versionGroup: VersionGroupSummary,
  move: MoveSummary
)

object MachineDetail {
  implicit lazy val machineDetailJsonFormat: Format[MachineDetail] = Json.format[MachineDetail]
}

