package api

import play.api.libs.json._
import model.EncounterConditionDetail
import model.EncounterConditionValueDetail
import model.EncounterMethodDetail
import model.PaginatedEncounterConditionSummaryList
import model.PaginatedEncounterConditionValueSummaryList
import model.PaginatedEncounterMethodSummaryList
import model.PokemonEncountersRetrieve200ResponseInner

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait EncountersApi {
  /**
    * List encounter conditions
    * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def encounterConditionList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedEncounterConditionSummaryList

  /**
    * Get encounter condition
    * Conditions which affect what pokemon might appear in the wild, e.g., day or night.
    * @param id This parameter can be a string or an integer.
    */
  def encounterConditionRetrieve(id: String): EncounterConditionDetail

  /**
    * List encounter condition values
    * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def encounterConditionValueList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedEncounterConditionValueSummaryList

  /**
    * Get encounter condition value
    * Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.
    * @param id This parameter can be a string or an integer.
    */
  def encounterConditionValueRetrieve(id: String): EncounterConditionValueDetail

  /**
    * List encounter methods
    * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def encounterMethodList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedEncounterMethodSummaryList

  /**
    * Get encounter method
    * Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.
    * @param id This parameter can be a string or an integer.
    */
  def encounterMethodRetrieve(id: String): EncounterMethodDetail

  /**
    * Get pokemon encounter
    * Handles Pokemon Encounters as a sub-resource.
    */
  def pokemonEncountersRetrieve(pokemonId: String): List[PokemonEncountersRetrieve200ResponseInner]
}
