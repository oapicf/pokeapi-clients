package api

import play.api.libs.json._
import model.ContestEffectDetail
import model.ContestTypeDetail
import model.PaginatedContestEffectSummaryList
import model.PaginatedContestTypeSummaryList
import model.PaginatedSuperContestEffectSummaryList
import model.SuperContestEffectDetail

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait ContestsApi {
  /**
    * List contest effects
    * Contest effects refer to the effects of moves when used in contests.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def contestEffectList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedContestEffectSummaryList

  /**
    * Get contest effect
    * Contest effects refer to the effects of moves when used in contests.
    * @param id This parameter can be a string or an integer.
    */
  def contestEffectRetrieve(id: String): ContestEffectDetail

  /**
    * List contest types
    * Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def contestTypeList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedContestTypeSummaryList

  /**
    * Get contest type
    * Contest types are categories judges used to weigh a Pokémon&#39;s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.
    * @param id This parameter can be a string or an integer.
    */
  def contestTypeRetrieve(id: String): ContestTypeDetail

  /**
    * List super contest effects
    * Super contest effects refer to the effects of moves when used in super contests.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def superContestEffectList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedSuperContestEffectSummaryList

  /**
    * Get super contest effect
    * Super contest effects refer to the effects of moves when used in super contests.
    * @param id This parameter can be a string or an integer.
    */
  def superContestEffectRetrieve(id: String): SuperContestEffectDetail
}
