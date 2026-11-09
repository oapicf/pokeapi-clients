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
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
class ContestsApiImpl extends ContestsApi {
  /**
    * @inheritdoc
    */
  override def contestEffectList(limit: Option[Int], offset: Option[Int]): PaginatedContestEffectSummaryList = {
    // TODO: Implement better logic

    PaginatedContestEffectSummaryList(0, None, None, List.empty[ContestEffectSummary])
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

    PaginatedContestTypeSummaryList(0, None, None, List.empty[ContestTypeSummary])
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
  override def superContestEffectList(limit: Option[Int], offset: Option[Int]): PaginatedSuperContestEffectSummaryList = {
    // TODO: Implement better logic

    PaginatedSuperContestEffectSummaryList(0, None, None, List.empty[SuperContestEffectSummary])
  }

  /**
    * @inheritdoc
    */
  override def superContestEffectRetrieve(id: String): SuperContestEffectDetail = {
    // TODO: Implement better logic

    SuperContestEffectDetail(0, 0, List.empty[SuperContestEffectFlavorText], List.empty[MoveSummary])
  }
}
