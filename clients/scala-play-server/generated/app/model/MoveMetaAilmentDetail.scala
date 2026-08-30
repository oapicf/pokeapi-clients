package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveMetaAilmentDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class MoveMetaAilmentDetail(
  id: Int,
  name: String,
  moves: List[AbilityDetailPokemonInnerPokemon],
  names: List[MoveMetaAilmentName]
)

object MoveMetaAilmentDetail {
  implicit lazy val moveMetaAilmentDetailJsonFormat: Format[MoveMetaAilmentDetail] = Json.format[MoveMetaAilmentDetail]
}

