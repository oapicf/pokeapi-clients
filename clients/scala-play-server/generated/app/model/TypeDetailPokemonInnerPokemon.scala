package model

import play.api.libs.json._
import java.net.URI

/**
  * Represents the Swagger definition for TypeDetail_pokemon_inner_pokemon.
  * @param name The name of the pokemon
  * @param url The URL to get more information about the pokemon
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TypeDetailPokemonInnerPokemon(
  name: Option[String],
  url: Option[URI]
)

object TypeDetailPokemonInnerPokemon {
  implicit lazy val typeDetailPokemonInnerPokemonJsonFormat: Format[TypeDetailPokemonInnerPokemon] = Json.format[TypeDetailPokemonInnerPokemon]
}

