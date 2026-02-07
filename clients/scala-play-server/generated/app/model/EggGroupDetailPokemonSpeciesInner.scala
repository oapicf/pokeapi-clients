package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for EggGroupDetail_pokemon_species_inner.
  * @param name Pokemon species name.
  * @param url The URL to get more information about the species
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class EggGroupDetailPokemonSpeciesInner(
  name: Option[String],
  url: Option[URI]
)

object EggGroupDetailPokemonSpeciesInner {
  implicit lazy val eggGroupDetailPokemonSpeciesInnerJsonFormat: Format[EggGroupDetailPokemonSpeciesInner] = Json.format[EggGroupDetailPokemonSpeciesInner]
}

