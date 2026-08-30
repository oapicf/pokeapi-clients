package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveMetaCategoryDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class MoveMetaCategoryDetail(
  id: Int,
  name: String,
  descriptions: List[MoveMetaCategoryDescription],
  moves: List[AbilityDetailPokemonInnerPokemon]
)

object MoveMetaCategoryDetail {
  implicit lazy val moveMetaCategoryDetailJsonFormat: Format[MoveMetaCategoryDetail] = Json.format[MoveMetaCategoryDetail]
}

