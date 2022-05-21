package api

import play.api.libs.json._

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-21T04:06:20.868089Z[Etc/UTC]")
trait PokemonHabitatApi {
  /**
    */
  def pokemonHabitatList(limit: Option[Int], offset: Option[Int]): String

  /**
    */
  def pokemonHabitatRead(id: Int): String
}
