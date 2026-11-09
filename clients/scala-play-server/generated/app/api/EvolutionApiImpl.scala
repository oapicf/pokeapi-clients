package api

import model.EvolutionChainDetail
import model.EvolutionTriggerDetail
import model.EvolutionVariableDetail
import model.PaginatedEvolutionChainSummaryList
import model.PaginatedEvolutionTriggerSummaryList
import model.PaginatedEvolutionVariableSummaryList

/**
  * Provides a default implementation for [[EvolutionApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
class EvolutionApiImpl extends EvolutionApi {
  /**
    * @inheritdoc
    */
  override def evolutionChainList(limit: Option[Int], offset: Option[Int]): PaginatedEvolutionChainSummaryList = {
    // TODO: Implement better logic

    PaginatedEvolutionChainSummaryList(0, None, None, List.empty[EvolutionChainSummary])
  }

  /**
    * @inheritdoc
    */
  override def evolutionChainRetrieve(id: String): EvolutionChainDetail = {
    // TODO: Implement better logic

    EvolutionChainDetail(0, ItemSummary("", ""), EvolutionChainLink(false, PokemonSpeciesSummary("", ""), List.empty[PokemonEvolution], List.empty[EvolutionChainLink]))
  }

  /**
    * @inheritdoc
    */
  override def evolutionTriggerList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedEvolutionTriggerSummaryList = {
    // TODO: Implement better logic

    PaginatedEvolutionTriggerSummaryList(0, None, None, List.empty[EvolutionTriggerSummary])
  }

  /**
    * @inheritdoc
    */
  override def evolutionTriggerRetrieve(id: String): EvolutionTriggerDetail = {
    // TODO: Implement better logic

    EvolutionTriggerDetail(0, "", List.empty[EvolutionTriggerName], List.empty[PokemonSpeciesSummary])
  }

  /**
    * @inheritdoc
    */
  override def evolutionVariableList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedEvolutionVariableSummaryList = {
    // TODO: Implement better logic

    PaginatedEvolutionVariableSummaryList(0, None, None, List.empty[EvolutionVariableSummary])
  }

  /**
    * @inheritdoc
    */
  override def evolutionVariableRetrieve(id: String): EvolutionVariableDetail = {
    // TODO: Implement better logic

    EvolutionVariableDetail(0, "", "", None, None, VersionGroupSummary("", ""), List.empty[EvolutionVariableName], List.empty[EvolutionVariableDescription])
  }
}
