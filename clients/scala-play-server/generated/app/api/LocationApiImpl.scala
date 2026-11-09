package api

import model.LocationAreaDetail
import model.LocationDetail
import model.PaginatedLocationAreaSummaryList
import model.PaginatedLocationSummaryList
import model.PaginatedPalParkAreaSummaryList
import model.PaginatedRegionSummaryList
import model.PalParkAreaDetail
import model.RegionDetail

/**
  * Provides a default implementation for [[LocationApi]].
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-09T13:53:31.572745352Z[Etc/UTC]", comments = "Generator version: 7.26.0")
class LocationApiImpl extends LocationApi {
  /**
    * @inheritdoc
    */
  override def locationAreaList(limit: Option[Int], offset: Option[Int]): PaginatedLocationAreaSummaryList = {
    // TODO: Implement better logic

    PaginatedLocationAreaSummaryList(0, None, None, List.empty[LocationAreaSummary])
  }

  /**
    * @inheritdoc
    */
  override def locationAreaRetrieve(id: Int): LocationAreaDetail = {
    // TODO: Implement better logic

    LocationAreaDetail(0, "", 0, List.empty[LocationAreaEncounterRate], LocationSummary("", ""), List.empty[LocationAreaName], List.empty[LocationAreaPokemonEncounter])
  }

  /**
    * @inheritdoc
    */
  override def locationList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedLocationSummaryList = {
    // TODO: Implement better logic

    PaginatedLocationSummaryList(0, None, None, List.empty[LocationSummary])
  }

  /**
    * @inheritdoc
    */
  override def locationRetrieve(id: String): LocationDetail = {
    // TODO: Implement better logic

    LocationDetail(0, "", RegionSummary("", ""), List.empty[LocationName], List.empty[LocationGameIndex], List.empty[LocationAreaSummary])
  }

  /**
    * @inheritdoc
    */
  override def palParkAreaList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedPalParkAreaSummaryList = {
    // TODO: Implement better logic

    PaginatedPalParkAreaSummaryList(0, None, None, List.empty[PalParkAreaSummary])
  }

  /**
    * @inheritdoc
    */
  override def palParkAreaRetrieve(id: String): PalParkAreaDetail = {
    // TODO: Implement better logic

    PalParkAreaDetail(0, "", List.empty[PalParkAreaName], List.empty[PalParkEncounter])
  }

  /**
    * @inheritdoc
    */
  override def regionList(limit: Option[Int], offset: Option[Int], q: Option[String]): PaginatedRegionSummaryList = {
    // TODO: Implement better logic

    PaginatedRegionSummaryList(0, None, None, List.empty[RegionSummary])
  }

  /**
    * @inheritdoc
    */
  override def regionRetrieve(id: String): RegionDetail = {
    // TODO: Implement better logic

    RegionDetail(0, "", List.empty[LocationSummary], GenerationSummary("", ""), List.empty[RegionName], List.empty[PokedexSummary], List.empty[VersionGroupSummary])
  }
}
