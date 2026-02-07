package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MoveLearnMethodDetail.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

