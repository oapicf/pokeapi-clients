package api

import play.api.libs.json._
import model.BerryDetail
import model.BerryFirmnessDetail
import model.BerryFlavorDetail
import model.PaginatedBerryFirmnessSummaryList
import model.PaginatedBerryFlavorSummaryList
import model.PaginatedBerrySummaryList

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait BerriesApi {
  /**
    * List berry firmness
    * Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def berryFirmnessList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedBerryFirmnessSummaryList

  /**
    * Get berry by firmness
    * Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.
    * @param id This parameter can be a string or an integer.
    */
  def berryFirmnessRetrieve(id: String): BerryFirmnessDetail

  /**
    * List berry flavors
    * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def berryFlavorList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedBerryFlavorSummaryList

  /**
    * Get berries by flavor
    * Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.
    * @param id This parameter can be a string or an integer.
    */
  def berryFlavorRetrieve(id: String): BerryFlavorDetail

  /**
    * List berries
    * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def berryList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedBerrySummaryList

  /**
    * Get a berry
    * Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.
    * @param id This parameter can be a string or an integer.
    */
  def berryRetrieve(id: String): BerryDetail
}
