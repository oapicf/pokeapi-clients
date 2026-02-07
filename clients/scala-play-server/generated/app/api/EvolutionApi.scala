package api

import play.api.libs.json._
import model.EvolutionChainDetail
import model.EvolutionTriggerDetail
import model.PaginatedEvolutionChainSummaryList
import model.PaginatedEvolutionTriggerSummaryList

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait EvolutionApi {
  /**
    * List evolution chains
    * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def evolutionChainList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedEvolutionChainSummaryList

  /**
    * Get evolution chain
    * Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.
    * @param id This parameter can be a string or an integer.
    */
  def evolutionChainRetrieve(id: String): EvolutionChainDetail

  /**
    * List evolution triggers
    * Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def evolutionTriggerList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedEvolutionTriggerSummaryList

  /**
    * Get evolution trigger
    * Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.
    * @param id This parameter can be a string or an integer.
    */
  def evolutionTriggerRetrieve(id: String): EvolutionTriggerDetail
}
