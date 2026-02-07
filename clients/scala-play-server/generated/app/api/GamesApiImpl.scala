package api

import model.GenerationDetail
import model.PaginatedGenerationSummaryList
import model.PaginatedPokedexSummaryList
import model.PaginatedVersionGroupSummaryList
import model.PaginatedVersionSummaryList
import model.PokedexDetail
import model.VersionDetail
import model.VersionGroupDetail

/**
  * Provides a default implementation for [[GamesApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-02-07T04:22:15.008485676Z[Etc/UTC]", comments = "Generator version: 7.18.0")
class GamesApiImpl extends GamesApi {
  /**
    * @inheritdoc
    */
  override def generationList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedGenerationSummaryList = {
    // TODO: Implement better logic

    PaginatedGenerationSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def generationRetrieve(id: String): GenerationDetail = {
    // TODO: Implement better logic

    GenerationDetail(0, "", List.empty[AbilitySummary], RegionSummary("", ""), List.empty[MoveSummary], List.empty[GenerationName], List.empty[PokemonSpeciesSummary], List.empty[TypeSummary], List.empty[VersionGroupSummary])
  }

  /**
    * @inheritdoc
    */
  override def pokedexList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedPokedexSummaryList = {
    // TODO: Implement better logic

    PaginatedPokedexSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def pokedexRetrieve(id: String): PokedexDetail = {
    // TODO: Implement better logic

    PokedexDetail(0, "", None, List.empty[PokedexDescription], List.empty[PokedexName], List.empty[PokedexDetailPokemonEntriesInner], RegionSummary("", ""), List.empty[AbilityDetailPokemonInnerPokemon])
  }

  /**
    * @inheritdoc
    */
  override def versionGroupList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedVersionGroupSummaryList = {
    // TODO: Implement better logic

    PaginatedVersionGroupSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def versionGroupRetrieve(id: String): VersionGroupDetail = {
    // TODO: Implement better logic

    VersionGroupDetail(0, "", None, GenerationSummary("", ""), List.empty[AbilityDetailPokemonInnerPokemon], List.empty[AbilityDetailPokemonInnerPokemon], List.empty[AbilityDetailPokemonInnerPokemon], List.empty[VersionSummary])
  }

  /**
    * @inheritdoc
    */
  override def versionList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedVersionSummaryList = {
    // TODO: Implement better logic

    PaginatedVersionSummaryList(None, None, None, None)
  }

  /**
    * @inheritdoc
    */
  override def versionRetrieve(id: String): VersionDetail = {
    // TODO: Implement better logic

    VersionDetail(0, "", List.empty[VersionName], VersionGroupSummary("", ""))
  }
}
