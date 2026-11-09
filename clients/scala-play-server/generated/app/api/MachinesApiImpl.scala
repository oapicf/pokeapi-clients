package api

import model.MachineDetail
import model.PaginatedMachineSummaryList

/**
  * Provides a default implementation for [[MachinesApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
class MachinesApiImpl extends MachinesApi {
  /**
    * @inheritdoc
    */
  override def machineList(limit: Option[Int], offset: Option[Int]): PaginatedMachineSummaryList = {
    // TODO: Implement better logic

    PaginatedMachineSummaryList(0, None, None, List.empty[MachineSummary])
  }

  /**
    * @inheritdoc
    */
  override def machineRetrieve(id: String): MachineDetail = {
    // TODO: Implement better logic

    MachineDetail(0, ItemSummary("", ""), VersionGroupSummary("", ""), MoveSummary("", ""))
  }
}
