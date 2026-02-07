package api

import model.EvolutionChainDetail
import model.EvolutionTriggerDetail
import model.PaginatedEvolutionChainSummaryList
import model.PaginatedEvolutionTriggerSummaryList

/**
  * Provides a default implementation for [[EvolutionApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class EvolutionApiImpl extends EvolutionApi {
  /**
    * @inheritdoc
    */
  override def evolutionChainList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedEvolutionChainSummaryList = {
    // TODO: Implement better logic

    PaginatedEvolutionChainSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def evolutionChainRetrieve(id: String): EvolutionChainDetail = {
    // TODO: Implement better logic

    EvolutionChainDetail(0, ItemSummary("", ""), EvolutionChainDetailChain(List.empty[OasAnyTypeNotMapped], List.empty[EvolutionChainDetailChainEvolvesToInner], false, AbilityDetailPokemonInnerPokemon("", "")))
  }

  /**
    * @inheritdoc
    */
  override def evolutionTriggerList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedEvolutionTriggerSummaryList = {
    // TODO: Implement better logic

    PaginatedEvolutionTriggerSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def evolutionTriggerRetrieve(id: String): EvolutionTriggerDetail = {
    // TODO: Implement better logic

    EvolutionTriggerDetail(0, "", List.empty[EvolutionTriggerName], List.empty[AbilityDetailPokemonInnerPokemon])
  }
}
