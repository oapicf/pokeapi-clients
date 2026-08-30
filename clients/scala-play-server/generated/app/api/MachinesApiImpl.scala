package api

import model.MachineDetail
import model.PaginatedMachineSummaryList

/**
  * Provides a default implementation for [[MachinesApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T02:00:26.523807909Z[Etc/UTC]", comments = "Generator version: 7.24.0")
class MachinesApiImpl extends MachinesApi {
  /**
    * @inheritdoc
    */
  override def machineList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedMachineSummaryList = {
    // TODO: Implement better logic

    PaginatedMachineSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def machineRetrieve(id: String): MachineDetail = {
    // TODO: Implement better logic

    MachineDetail(0, ItemSummary("", ""), VersionGroupSummary("", ""), MoveSummary("", ""))
  }
}
