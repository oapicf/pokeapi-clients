package api

import model.MoveBattleStyleDetail
import model.MoveDetail
import model.MoveLearnMethodDetail
import model.MoveMetaAilmentDetail
import model.MoveMetaCategoryDetail
import model.MoveTargetDetail
import model.PaginatedMoveBattleStyleSummaryList
import model.PaginatedMoveLearnMethodSummaryList
import model.PaginatedMoveMetaAilmentSummaryList
import model.PaginatedMoveMetaCategorySummaryList
import model.PaginatedMoveSummaryList
import model.PaginatedMoveTargetSummaryList

/**
  * Provides a default implementation for [[MovesApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
class MovesApiImpl extends MovesApi {
  /**
    * @inheritdoc
    */
  override def moveAilmentList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedMoveMetaAilmentSummaryList = {
    // TODO: Implement better logic

    PaginatedMoveMetaAilmentSummaryList(0, None, None, List.empty[MoveMetaAilmentSummary])
  }

  /**
    * @inheritdoc
    */
  override def moveAilmentRetrieve(id: String): MoveMetaAilmentDetail = {
    // TODO: Implement better logic

    MoveMetaAilmentDetail(0, "", List.empty[MoveSummary], List.empty[MoveMetaAilmentName])
  }

  /**
    * @inheritdoc
    */
  override def moveBattleStyleList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedMoveBattleStyleSummaryList = {
    // TODO: Implement better logic

    PaginatedMoveBattleStyleSummaryList(0, None, None, List.empty[MoveBattleStyleSummary])
  }

  /**
    * @inheritdoc
    */
  override def moveBattleStyleRetrieve(id: String): MoveBattleStyleDetail = {
    // TODO: Implement better logic

    MoveBattleStyleDetail(0, "", List.empty[MoveBattleStyleName])
  }

  /**
    * @inheritdoc
    */
  override def moveCategoryList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedMoveMetaCategorySummaryList = {
    // TODO: Implement better logic

    PaginatedMoveMetaCategorySummaryList(0, None, None, List.empty[MoveMetaCategorySummary])
  }

  /**
    * @inheritdoc
    */
  override def moveCategoryRetrieve(id: String): MoveMetaCategoryDetail = {
    // TODO: Implement better logic

    MoveMetaCategoryDetail(0, "", List.empty[MoveMetaCategoryDescription], List.empty[MoveSummary])
  }

  /**
    * @inheritdoc
    */
  override def moveLearnMethodList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedMoveLearnMethodSummaryList = {
    // TODO: Implement better logic

    PaginatedMoveLearnMethodSummaryList(0, None, None, List.empty[MoveLearnMethodSummary])
  }

  /**
    * @inheritdoc
    */
  override def moveLearnMethodRetrieve(id: String): MoveLearnMethodDetail = {
    // TODO: Implement better logic

    MoveLearnMethodDetail(0, "", List.empty[MoveLearnMethodName], List.empty[MoveLearnMethodDescription], List.empty[VersionGroupSummary])
  }

  /**
    * @inheritdoc
    */
  override def moveList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedMoveSummaryList = {
    // TODO: Implement better logic

    PaginatedMoveSummaryList(0, None, None, List.empty[MoveSummary])
  }

  /**
    * @inheritdoc
    */
  override def moveRetrieve(id: String): MoveDetail = {
    // TODO: Implement better logic

    MoveDetail(0, "", None, 0, None, None, None, MoveCombos(MoveComboUsage(List.empty[MoveSummary], List.empty[MoveSummary]), MoveComboUsage(List.empty[MoveSummary], List.empty[MoveSummary])), ContestTypeSummary("", ""), ContestEffectSummary(""), MoveDamageClassSummary("", ""), List.empty[MoveEffectEffectText], List.empty[MoveEffectChange], GenerationSummary("", ""), MoveMeta(MoveMetaAilmentSummary("", ""), MoveMetaCategorySummary("", ""), None, None, None, None, None, None, None, None, None, None), List.empty[MoveName], List.empty[MoveChange], List.empty[MoveMetaStatChange], SuperContestEffectSummary(""), MoveTargetSummary("", ""), TypeSummary("", ""), List.empty[ItemMachine], List.empty[MoveFlavorText], List.empty[PokemonSummary])
  }

  /**
    * @inheritdoc
    */
  override def moveTargetList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedMoveTargetSummaryList = {
    // TODO: Implement better logic

    PaginatedMoveTargetSummaryList(0, None, None, List.empty[MoveTargetSummary])
  }

  /**
    * @inheritdoc
    */
  override def moveTargetRetrieve(id: String): MoveTargetDetail = {
    // TODO: Implement better logic

    MoveTargetDetail(0, "", List.empty[MoveTargetDescription], List.empty[MoveSummary], List.empty[MoveTargetName])
  }
}
