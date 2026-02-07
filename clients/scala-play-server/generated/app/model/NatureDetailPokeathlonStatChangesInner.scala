package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for NatureDetail_pokeathlon_stat_changes_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class NatureDetailPokeathlonStatChangesInner(
  maxChange: Int,
  pokeathlonStat: AbilityDetailPokemonInnerPokemon
)

object NatureDetailPokeathlonStatChangesInner {
  implicit lazy val natureDetailPokeathlonStatChangesInnerJsonFormat: Format[NatureDetailPokeathlonStatChangesInner] = Json.format[NatureDetailPokeathlonStatChangesInner]
}

