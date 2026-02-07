package api

import play.api.libs.json._
import model.GenerationDetail
import model.PaginatedGenerationSummaryList
import model.PaginatedPokedexSummaryList
import model.PaginatedVersionGroupSummaryList
import model.PaginatedVersionSummaryList
import model.PokedexDetail
import model.VersionDetail
import model.VersionGroupDetail

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait GamesApi {
  /**
    * List genrations
    * A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def generationList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedGenerationSummaryList

  /**
    * Get genration
    * A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
    * @param id This parameter can be a string or an integer.
    */
  def generationRetrieve(id: String): GenerationDetail

  /**
    * List pokedex
    * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def pokedexList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedPokedexSummaryList

  /**
    * Get pokedex
    * A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
    * @param id This parameter can be a string or an integer.
    */
  def pokedexRetrieve(id: String): PokedexDetail

  /**
    * List version groups
    * Version groups categorize highly similar versions of the games.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def versionGroupList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedVersionGroupSummaryList

  /**
    * Get version group
    * Version groups categorize highly similar versions of the games.
    * @param id This parameter can be a string or an integer.
    */
  def versionGroupRetrieve(id: String): VersionGroupDetail

  /**
    * List versions
    * Versions of the games, e.g., Red, Blue or Yellow.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def versionList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedVersionSummaryList

  /**
    * Get version
    * Versions of the games, e.g., Red, Blue or Yellow.
    * @param id This parameter can be a string or an integer.
    */
  def versionRetrieve(id: String): VersionDetail
}
