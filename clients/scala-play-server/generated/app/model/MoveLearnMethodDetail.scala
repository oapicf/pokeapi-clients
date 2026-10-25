package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveLearnMethodDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-10-25T05:53:17.467323765Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class MoveLearnMethodDetail(
  id: Int,
  name: String,
  names: List[MoveLearnMethodName],
  descriptions: List[MoveLearnMethodDescription],
  versionGroups: List[AbilityDetailPokemonInnerPokemon]
)

object MoveLearnMethodDetail {
  implicit lazy val moveLearnMethodDetailJsonFormat: Format[MoveLearnMethodDetail] = Json.format[MoveLearnMethodDetail]
}

