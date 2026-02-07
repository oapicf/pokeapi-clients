package api

import play.api.libs.json._
import model.MachineDetail
import model.PaginatedMachineSummaryList

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
trait MachinesApi {
  /**
    * List machines
    * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    * @param q &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property. 
    */
  def machineList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedMachineSummaryList

  /**
    * Get machine
    * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
    * @param id This parameter can be a string or an integer.
    */
  def machineRetrieve(id: String): MachineDetail
}
