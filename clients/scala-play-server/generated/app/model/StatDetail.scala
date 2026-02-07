package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for StatDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class StatDetail(
  id: Int,
  name: String,
  gameIndex: Int,
  isBattleOnly: Option[Boolean],
  affectingMoves: StatDetailAffectingMoves,
  affectingNatures: StatDetailAffectingNatures,
  characteristics: List[CharacteristicSummary],
  moveDamageClass: MoveDamageClassSummary,
  names: List[StatName]
)

object StatDetail {
  implicit lazy val statDetailJsonFormat: Format[StatDetail] = Json.format[StatDetail]
}

