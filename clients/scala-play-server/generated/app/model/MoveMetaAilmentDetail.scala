package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveMetaAilmentDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MoveMetaAilmentDetail(
  id: Int,
  name: String,
  moves: List[AbilityDetailPokemonInnerPokemon],
  names: List[MoveMetaAilmentName]
)

object MoveMetaAilmentDetail {
  implicit lazy val moveMetaAilmentDetailJsonFormat: Format[MoveMetaAilmentDetail] = Json.format[MoveMetaAilmentDetail]
}

