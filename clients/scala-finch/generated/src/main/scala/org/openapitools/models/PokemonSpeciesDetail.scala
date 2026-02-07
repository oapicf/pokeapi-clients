package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AbilityDetailPokemonInnerPokemon
import org.openapitools.models.EvolutionChainSummary
import org.openapitools.models.GenerationSummary
import org.openapitools.models.GrowthRateSummary
import org.openapitools.models.PokemonColorSummary
import org.openapitools.models.PokemonDexEntry
import org.openapitools.models.PokemonFormDetailFormNamesInner
import org.openapitools.models.PokemonHabitatSummary
import org.openapitools.models.PokemonShapeSummary
import org.openapitools.models.PokemonSpeciesDescription
import org.openapitools.models.PokemonSpeciesDetailGeneraInner
import org.openapitools.models.PokemonSpeciesDetailPalParkEncountersInner
import org.openapitools.models.PokemonSpeciesDetailVarietiesInner
import org.openapitools.models.PokemonSpeciesFlavorText
import org.openapitools.models.PokemonSpeciesSummary
import scala.collection.immutable.Seq

/**
 * 
 * @param id 
 * @param name 
 * @param order 
 * @param genderUnderscorerate 
 * @param captureUnderscorerate 
 * @param baseUnderscorehappiness 
 * @param isUnderscorebaby 
 * @param isUnderscorelegendary 
 * @param isUnderscoremythical 
 * @param hatchUnderscorecounter 
 * @param hasUnderscoregenderUnderscoredifferences 
 * @param formsUnderscoreswitchable 
 * @param growthUnderscorerate 
 * @param pokedexUnderscorenumbers 
 * @param eggUnderscoregroups 
 * @param color 
 * @param shape 
 * @param evolvesUnderscorefromUnderscorespecies 
 * @param evolutionUnderscorechain 
 * @param habitat 
 * @param generation 
 * @param names 
 * @param palUnderscoreparkUnderscoreencounters 
 * @param formUnderscoredescriptions 
 * @param flavorUnderscoretextUnderscoreentries 
 * @param genera 
 * @param varieties 
 */
case class PokemonSpeciesDetail(id: Int,
                name: String,
                order: Option[Int],
                genderUnderscorerate: Option[Int],
                captureUnderscorerate: Option[Int],
                baseUnderscorehappiness: Option[Int],
                isUnderscorebaby: Option[Boolean],
                isUnderscorelegendary: Option[Boolean],
                isUnderscoremythical: Option[Boolean],
                hatchUnderscorecounter: Option[Int],
                hasUnderscoregenderUnderscoredifferences: Option[Boolean],
                formsUnderscoreswitchable: Option[Boolean],
                growthUnderscorerate: GrowthRateSummary,
                pokedexUnderscorenumbers: Seq[PokemonDexEntry],
                eggUnderscoregroups: Seq[AbilityDetailPokemonInnerPokemon],
                color: PokemonColorSummary,
                shape: PokemonShapeSummary,
                evolvesUnderscorefromUnderscorespecies: PokemonSpeciesSummary,
                evolutionUnderscorechain: EvolutionChainSummary,
                habitat: PokemonHabitatSummary,
                generation: GenerationSummary,
                names: Seq[PokemonFormDetailFormNamesInner],
                palUnderscoreparkUnderscoreencounters: Seq[PokemonSpeciesDetailPalParkEncountersInner],
                formUnderscoredescriptions: Seq[PokemonSpeciesDescription],
                flavorUnderscoretextUnderscoreentries: Seq[PokemonSpeciesFlavorText],
                genera: Seq[PokemonSpeciesDetailGeneraInner],
                varieties: Seq[PokemonSpeciesDetailVarietiesInner]
                )

object PokemonSpeciesDetail {
    /**
     * Creates the codec for converting PokemonSpeciesDetail from and to JSON.
     */
    implicit val decoder: Decoder[PokemonSpeciesDetail] = deriveDecoder
    implicit val encoder: ObjectEncoder[PokemonSpeciesDetail] = deriveEncoder
}
