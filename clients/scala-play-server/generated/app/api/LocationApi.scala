package api

import play.api.libs.json._
import model.LocationAreaDetail
import model.LocationDetail
import model.PaginatedLocationAreaSummaryList
import model.PaginatedLocationSummaryList
import model.PaginatedPalParkAreaSummaryList
import model.PaginatedRegionSummaryList
import model.PalParkAreaDetail
import model.RegionDetail

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait LocationApi {
  /**
    * List location areas
    * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    */
  def locationAreaList(limit: Option[Int], offset: Option[Int]): PaginatedLocationAreaSummaryList

  /**
    * Get location area
    * Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.
    * @param id A unique integer value identifying this location area.
    */
  def locationAreaRetrieve(id: Int): LocationAreaDetail

  /**
    * List locations
    * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def locationList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedLocationSummaryList

  /**
    * Get location
    * Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.
    * @param id This parameter can be a string or an integer.
    */
  def locationRetrieve(id: String): LocationDetail

  /**
    * List pal park areas
    * Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def palParkAreaList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedPalParkAreaSummaryList

  /**
    * Get pal park area
    * Areas used for grouping Pokémon encounters in Pal Park. They&#39;re like habitats that are specific to Pal Park.
    * @param id This parameter can be a string or an integer.
    */
  def palParkAreaRetrieve(id: String): PalParkAreaDetail

  /**
    * List regions
    * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def regionList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedRegionSummaryList

  /**
    * Get region
    * A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.
    * @param id This parameter can be a string or an integer.
    */
  def regionRetrieve(id: String): RegionDetail
}
