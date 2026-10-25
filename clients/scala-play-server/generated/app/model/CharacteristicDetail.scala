package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CharacteristicDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-25T05:53:17.467323765Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

