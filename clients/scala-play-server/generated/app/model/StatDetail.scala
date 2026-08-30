package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for StatDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

