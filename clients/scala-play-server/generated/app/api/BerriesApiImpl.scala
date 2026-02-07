package api

import model.BerryDetail
import model.BerryFirmnessDetail
import model.BerryFlavorDetail
import model.PaginatedBerryFirmnessSummaryList
import model.PaginatedBerryFlavorSummaryList
import model.PaginatedBerrySummaryList

/**
  * Provides a default implementation for [[BerriesApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class BerriesApiImpl extends BerriesApi {
  /**
    * @inheritdoc
    */
  override def berryFirmnessList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedBerryFirmnessSummaryList = {
    // TODO: Implement better logic

    PaginatedBerryFirmnessSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def berryFirmnessRetrieve(id: String): BerryFirmnessDetail = {
    // TODO: Implement better logic

    BerryFirmnessDetail(0, "", List.empty[BerrySummary], List.empty[BerryFirmnessName])
  }

  /**
    * @inheritdoc
    */
  override def berryFlavorList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedBerryFlavorSummaryList = {
    // TODO: Implement better logic

    PaginatedBerryFlavorSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def berryFlavorRetrieve(id: String): BerryFlavorDetail = {
    // TODO: Implement better logic

    BerryFlavorDetail(0, "", List.empty[BerryFlavorDetailBerriesInner], ContestTypeSummary("", ""), List.empty[BerryFlavorName])
  }

  /**
    * @inheritdoc
    */
  override def berryList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedBerrySummaryList = {
    // TODO: Implement better logic

    PaginatedBerrySummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def berryRetrieve(id: String): BerryDetail = {
    // TODO: Implement better logic

    BerryDetail(0, "", 0, 0, 0, 0, 0, 0, BerryFirmnessSummary("", ""), List.empty[BerryDetailFlavorsInner], ItemSummary("", ""), TypeSummary("", ""))
  }
}
