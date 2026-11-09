package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CharacteristicDetail.
  * @param id The identifier for this resource.
  * @param geneModulo The remainder of the highest stat/IV divided by 5.
  * @param possibleValues The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5.
  * @param highestStat The stat which results in this characteristic.
  * @param descriptions The descriptions of this characteristic listed in different languages.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

