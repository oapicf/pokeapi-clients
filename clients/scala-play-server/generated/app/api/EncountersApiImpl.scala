package api

import model.EncounterConditionDetail
import model.EncounterConditionValueDetail
import model.EncounterMethodDetail
import model.PaginatedEncounterConditionSummaryList
import model.PaginatedEncounterConditionValueSummaryList
import model.PaginatedEncounterMethodSummaryList

/**
  * Provides a default implementation for [[EncountersApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T15:28:57.811621661Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class EncountersApiImpl extends EncountersApi {
  /**
    * @inheritdoc
    */
  override def encounterConditionList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedEncounterConditionSummaryList = {
    // TODO: Implement better logic

    PaginatedEncounterConditionSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def encounterConditionRetrieve(id: String): EncounterConditionDetail = {
    // TODO: Implement better logic

    EncounterConditionDetail(0, "", List.empty[EncounterConditionValueSummary], List.empty[EncounterConditionName])
  }

  /**
    * @inheritdoc
    */
  override def encounterConditionValueList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedEncounterConditionValueSummaryList = {
    // TODO: Implement better logic

    PaginatedEncounterConditionValueSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def encounterConditionValueRetrieve(id: String): EncounterConditionValueDetail = {
    // TODO: Implement better logic

    EncounterConditionValueDetail(0, "", EncounterConditionSummary("", ""), List.empty[EncounterConditionValueName])
  }

  /**
    * @inheritdoc
    */
  override def encounterMethodList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedEncounterMethodSummaryList = {
    // TODO: Implement better logic

    PaginatedEncounterMethodSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def encounterMethodRetrieve(id: String): EncounterMethodDetail = {
    // TODO: Implement better logic

    EncounterMethodDetail(0, "", None, List.empty[EncounterMethodName])
  }
}
