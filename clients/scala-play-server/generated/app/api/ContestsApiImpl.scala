package api

import model.ContestEffectDetail
import model.ContestTypeDetail
import model.PaginatedContestEffectSummaryList
import model.PaginatedContestTypeSummaryList
import model.PaginatedSuperContestEffectSummaryList
import model.SuperContestEffectDetail

/**
  * Provides a default implementation for [[ContestsApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class ContestsApiImpl extends ContestsApi {
  /**
    * @inheritdoc
    */
  override def contestEffectList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedContestEffectSummaryList = {
    // TODO: Implement better logic

    PaginatedContestEffectSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def contestEffectRetrieve(id: String): ContestEffectDetail = {
    // TODO: Implement better logic

    ContestEffectDetail(0, 0, 0, List.empty[ContestEffectEffectText], List.empty[ContestEffectFlavorText])
  }

  /**
    * @inheritdoc
    */
  override def contestTypeList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedContestTypeSummaryList = {
    // TODO: Implement better logic

    PaginatedContestTypeSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def contestTypeRetrieve(id: String): ContestTypeDetail = {
    // TODO: Implement better logic

    ContestTypeDetail(0, "", BerryFlavorSummary("", ""), List.empty[ContestTypeName])
  }

  /**
    * @inheritdoc
    */
  override def superContestEffectList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedSuperContestEffectSummaryList = {
    // TODO: Implement better logic

    PaginatedSuperContestEffectSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def superContestEffectRetrieve(id: String): SuperContestEffectDetail = {
    // TODO: Implement better logic

    SuperContestEffectDetail(0, 0, List.empty[SuperContestEffectFlavorText], List.empty[MoveSummary])
  }
}
