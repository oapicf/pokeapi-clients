package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for StatDetail_affecting_natures.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class StatDetailAffectingNatures(
  increase: List[AbilityDetailPokemonInnerPokemon],
  decrease: List[AbilityDetailPokemonInnerPokemon]
)

object StatDetailAffectingNatures {
  implicit lazy val statDetailAffectingNaturesJsonFormat: Format[StatDetailAffectingNatures] = Json.format[StatDetailAffectingNatures]
}

