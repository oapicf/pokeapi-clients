package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CharacteristicDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CharacteristicDetail(
  id: Int,
  geneModulo: Int,
  possibleValues: List[Int],
  highestStat: StatSummary,
  descriptions: List[CharacteristicDescription]
)

object CharacteristicDetail {
  implicit lazy val characteristicDetailJsonFormat: Format[CharacteristicDetail] = Json.format[CharacteristicDetail]
}

