package api

import play.api.libs.json._
import model.MachineDetail
import model.PaginatedMachineSummaryList

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
trait MachinesApi {
  /**
    * List machines
    * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
    * @param limit Number of results to return per page.
    * @param offset The initial index from which to return the results.
    */
  def machineList(limit: Option[Int], offset: Option[Int]): PaginatedMachineSummaryList

  /**
    * Get machine
    * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
    * @param id This parameter can be a string or an integer.
    */
  def machineRetrieve(id: String): MachineDetail
}
