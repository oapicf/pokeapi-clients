package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveMetaCategoryDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MoveMetaCategoryDetail(
  id: Int,
  name: String,
  descriptions: List[MoveMetaCategoryDescription],
  moves: List[AbilityDetailPokemonInnerPokemon]
)

object MoveMetaCategoryDetail {
  implicit lazy val moveMetaCategoryDetailJsonFormat: Format[MoveMetaCategoryDetail] = Json.format[MoveMetaCategoryDetail]
}

