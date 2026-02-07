package api

import model.MachineDetail
import model.PaginatedMachineSummaryList

/**
  * Provides a default implementation for [[MachinesApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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
