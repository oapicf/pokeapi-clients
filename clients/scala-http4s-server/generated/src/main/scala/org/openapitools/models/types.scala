package org.openapitools.models

import java.time._

import io.circe.refined._
import io.circe.syntax._
import io.circe.{ Decoder, Encoder }
import io.circe.generic.semiauto.{ deriveDecoder, deriveEncoder }

import eu.timepit.refined.api.Refined
import eu.timepit.refined.boolean.And
import eu.timepit.refined.collection.MaxSize
import eu.timepit.refined.numeric.GreaterEqual
import eu.timepit.refined.numeric.LessEqual
import java.net.URI
import scala.collection.immutable.HashMap

/**
* 
* @param versionUnderscoregroup 
* @param effectUnderscoreentries 
*/

case class AbilityChange(
  versionUnderscoregroup: VersionGroupSummary,
  effectUnderscoreentries: List[AbilityChangeEffectText]
)
object AbilityChange {
  implicit val encoderAbilityChange: Encoder[AbilityChange] = deriveEncoder[AbilityChange].mapJson(_.dropNullValues)
  implicit val decoderAbilityChange: Decoder[AbilityChange] = deriveDecoder[AbilityChange]
}

/**
* 
* @param effect 
* @param language 
*/

case class AbilityChangeEffectText(
  effect: Refined[String, MaxSize[6000]],
  language: LanguageSummary
)
object AbilityChangeEffectText {
  implicit val encoderAbilityChangeEffectText: Encoder[AbilityChangeEffectText] = deriveEncoder[AbilityChangeEffectText].mapJson(_.dropNullValues)
  implicit val decoderAbilityChangeEffectText: Decoder[AbilityChangeEffectText] = deriveDecoder[AbilityChangeEffectText]
}

/**
* 
* @param id 
* @param name 
* @param isUnderscoremainUnderscoreseries 
* @param generation 
* @param names 
* @param effectUnderscoreentries 
* @param effectUnderscorechanges 
* @param flavorUnderscoretextUnderscoreentries 
* @param pokemon 
*/

case class AbilityDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  isUnderscoremainUnderscoreseries: Option[Boolean],
  generation: GenerationSummary,
  names: List[AbilityName],
  effectUnderscoreentries: List[AbilityEffectText],
  effectUnderscorechanges: List[AbilityChange],
  flavorUnderscoretextUnderscoreentries: List[AbilityFlavorText],
  pokemon: List[AbilityDetailPokemonInner]
)
object AbilityDetail {
  implicit val encoderAbilityDetail: Encoder[AbilityDetail] = deriveEncoder[AbilityDetail].mapJson(_.dropNullValues)
  implicit val decoderAbilityDetail: Decoder[AbilityDetail] = deriveDecoder[AbilityDetail]
}

/**
* 
* @param isUnderscorehidden 
* @param slot 
* @param pokemon 
*/

case class AbilityDetailPokemonInner(
  isUnderscorehidden: Boolean,
  slot: Int,
  pokemon: AbilityDetailPokemonInnerPokemon
)
object AbilityDetailPokemonInner {
  implicit val encoderAbilityDetailPokemonInner: Encoder[AbilityDetailPokemonInner] = deriveEncoder[AbilityDetailPokemonInner].mapJson(_.dropNullValues)
  implicit val decoderAbilityDetailPokemonInner: Decoder[AbilityDetailPokemonInner] = deriveDecoder[AbilityDetailPokemonInner]
}

/**
* 
* @param name 
* @param url 
*/

case class AbilityDetailPokemonInnerPokemon(
  name: String,
  url: URI
)
object AbilityDetailPokemonInnerPokemon {
  implicit val encoderAbilityDetailPokemonInnerPokemon: Encoder[AbilityDetailPokemonInnerPokemon] = deriveEncoder[AbilityDetailPokemonInnerPokemon].mapJson(_.dropNullValues)
  implicit val decoderAbilityDetailPokemonInnerPokemon: Decoder[AbilityDetailPokemonInnerPokemon] = deriveDecoder[AbilityDetailPokemonInnerPokemon]
}

/**
* 
* @param effect 
* @param shortUnderscoreeffect 
* @param language 
*/

case class AbilityEffectText(
  effect: Refined[String, MaxSize[6000]],
  shortUnderscoreeffect: Refined[String, MaxSize[300]],
  language: LanguageSummary
)
object AbilityEffectText {
  implicit val encoderAbilityEffectText: Encoder[AbilityEffectText] = deriveEncoder[AbilityEffectText].mapJson(_.dropNullValues)
  implicit val decoderAbilityEffectText: Decoder[AbilityEffectText] = deriveDecoder[AbilityEffectText]
}

/**
* 
* @param flavorUnderscoretext 
* @param language 
* @param versionUnderscoregroup 
*/

case class AbilityFlavorText(
  flavorUnderscoretext: String,
  language: LanguageSummary,
  versionUnderscoregroup: VersionGroupSummary
)
object AbilityFlavorText {
  implicit val encoderAbilityFlavorText: Encoder[AbilityFlavorText] = deriveEncoder[AbilityFlavorText].mapJson(_.dropNullValues)
  implicit val decoderAbilityFlavorText: Decoder[AbilityFlavorText] = deriveDecoder[AbilityFlavorText]
}

/**
* 
* @param name 
* @param language 
*/

case class AbilityName(
  name: Refined[String, MaxSize[100]],
  language: LanguageSummary
)
object AbilityName {
  implicit val encoderAbilityName: Encoder[AbilityName] = deriveEncoder[AbilityName].mapJson(_.dropNullValues)
  implicit val decoderAbilityName: Decoder[AbilityName] = deriveDecoder[AbilityName]
}

/**
* 
* @param name 
* @param url 
*/

case class AbilitySummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object AbilitySummary {
  implicit val encoderAbilitySummary: Encoder[AbilitySummary] = deriveEncoder[AbilitySummary].mapJson(_.dropNullValues)
  implicit val decoderAbilitySummary: Decoder[AbilitySummary] = deriveDecoder[AbilitySummary]
}

/**
* 
* @param id 
* @param name 
* @param growthUnderscoretime 
* @param maxUnderscoreharvest 
* @param naturalUnderscoregiftUnderscorepower 
* @param size 
* @param smoothness 
* @param soilUnderscoredryness 
* @param firmness 
* @param flavors 
* @param item 
* @param naturalUnderscoregiftUnderscoretype 
*/

case class BerryDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  growthUnderscoretime: Int,
  maxUnderscoreharvest: Int,
  naturalUnderscoregiftUnderscorepower: Int,
  size: Int,
  smoothness: Int,
  soilUnderscoredryness: Int,
  firmness: BerryFirmnessSummary,
  flavors: List[BerryDetailFlavorsInner],
  item: ItemSummary,
  naturalUnderscoregiftUnderscoretype: TypeSummary
)
object BerryDetail {
  implicit val encoderBerryDetail: Encoder[BerryDetail] = deriveEncoder[BerryDetail].mapJson(_.dropNullValues)
  implicit val decoderBerryDetail: Decoder[BerryDetail] = deriveDecoder[BerryDetail]
}

/**
* 
* @param potency 
* @param flavor 
*/

case class BerryDetailFlavorsInner(
  potency: Int,
  flavor: BerryDetailFlavorsInnerFlavor
)
object BerryDetailFlavorsInner {
  implicit val encoderBerryDetailFlavorsInner: Encoder[BerryDetailFlavorsInner] = deriveEncoder[BerryDetailFlavorsInner].mapJson(_.dropNullValues)
  implicit val decoderBerryDetailFlavorsInner: Decoder[BerryDetailFlavorsInner] = deriveDecoder[BerryDetailFlavorsInner]
}

/**
* 
* @param name The name of the flavor
* @param url The URL to get more information about the flavor
*/

case class BerryDetailFlavorsInnerFlavor(
  name: Option[String],
  url: Option[URI]
)
object BerryDetailFlavorsInnerFlavor {
  implicit val encoderBerryDetailFlavorsInnerFlavor: Encoder[BerryDetailFlavorsInnerFlavor] = deriveEncoder[BerryDetailFlavorsInnerFlavor].mapJson(_.dropNullValues)
  implicit val decoderBerryDetailFlavorsInnerFlavor: Decoder[BerryDetailFlavorsInnerFlavor] = deriveDecoder[BerryDetailFlavorsInnerFlavor]
}

/**
* 
* @param id 
* @param name 
* @param berries 
* @param names 
*/

case class BerryFirmnessDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  berries: List[BerrySummary],
  names: List[BerryFirmnessName]
)
object BerryFirmnessDetail {
  implicit val encoderBerryFirmnessDetail: Encoder[BerryFirmnessDetail] = deriveEncoder[BerryFirmnessDetail].mapJson(_.dropNullValues)
  implicit val decoderBerryFirmnessDetail: Decoder[BerryFirmnessDetail] = deriveDecoder[BerryFirmnessDetail]
}

/**
* 
* @param name 
* @param language 
*/

case class BerryFirmnessName(
  name: Refined[String, MaxSize[100]],
  language: LanguageSummary
)
object BerryFirmnessName {
  implicit val encoderBerryFirmnessName: Encoder[BerryFirmnessName] = deriveEncoder[BerryFirmnessName].mapJson(_.dropNullValues)
  implicit val decoderBerryFirmnessName: Decoder[BerryFirmnessName] = deriveDecoder[BerryFirmnessName]
}

/**
* 
* @param name 
* @param url 
*/

case class BerryFirmnessSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object BerryFirmnessSummary {
  implicit val encoderBerryFirmnessSummary: Encoder[BerryFirmnessSummary] = deriveEncoder[BerryFirmnessSummary].mapJson(_.dropNullValues)
  implicit val decoderBerryFirmnessSummary: Decoder[BerryFirmnessSummary] = deriveDecoder[BerryFirmnessSummary]
}

/**
* 
* @param id 
* @param name 
* @param berries 
* @param contestUnderscoretype 
* @param names 
*/

case class BerryFlavorDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  berries: List[BerryFlavorDetailBerriesInner],
  contestUnderscoretype: ContestTypeSummary,
  names: List[BerryFlavorName]
)
object BerryFlavorDetail {
  implicit val encoderBerryFlavorDetail: Encoder[BerryFlavorDetail] = deriveEncoder[BerryFlavorDetail].mapJson(_.dropNullValues)
  implicit val decoderBerryFlavorDetail: Decoder[BerryFlavorDetail] = deriveDecoder[BerryFlavorDetail]
}

/**
* 
* @param potency 
* @param berry 
*/

case class BerryFlavorDetailBerriesInner(
  potency: Int,
  berry: BerryFlavorDetailBerriesInnerBerry
)
object BerryFlavorDetailBerriesInner {
  implicit val encoderBerryFlavorDetailBerriesInner: Encoder[BerryFlavorDetailBerriesInner] = deriveEncoder[BerryFlavorDetailBerriesInner].mapJson(_.dropNullValues)
  implicit val decoderBerryFlavorDetailBerriesInner: Decoder[BerryFlavorDetailBerriesInner] = deriveDecoder[BerryFlavorDetailBerriesInner]
}

/**
* 
* @param name The name of the berry
* @param url The URL to get more information about the berry
*/

case class BerryFlavorDetailBerriesInnerBerry(
  name: Option[String],
  url: Option[URI]
)
object BerryFlavorDetailBerriesInnerBerry {
  implicit val encoderBerryFlavorDetailBerriesInnerBerry: Encoder[BerryFlavorDetailBerriesInnerBerry] = deriveEncoder[BerryFlavorDetailBerriesInnerBerry].mapJson(_.dropNullValues)
  implicit val decoderBerryFlavorDetailBerriesInnerBerry: Decoder[BerryFlavorDetailBerriesInnerBerry] = deriveDecoder[BerryFlavorDetailBerriesInnerBerry]
}

/**
* 
* @param name 
* @param language 
*/

case class BerryFlavorName(
  name: Refined[String, MaxSize[100]],
  language: LanguageSummary
)
object BerryFlavorName {
  implicit val encoderBerryFlavorName: Encoder[BerryFlavorName] = deriveEncoder[BerryFlavorName].mapJson(_.dropNullValues)
  implicit val decoderBerryFlavorName: Decoder[BerryFlavorName] = deriveDecoder[BerryFlavorName]
}

/**
* 
* @param name 
* @param url 
*/

case class BerryFlavorSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object BerryFlavorSummary {
  implicit val encoderBerryFlavorSummary: Encoder[BerryFlavorSummary] = deriveEncoder[BerryFlavorSummary].mapJson(_.dropNullValues)
  implicit val decoderBerryFlavorSummary: Decoder[BerryFlavorSummary] = deriveDecoder[BerryFlavorSummary]
}

/**
* 
* @param name 
* @param url 
*/

case class BerrySummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object BerrySummary {
  implicit val encoderBerrySummary: Encoder[BerrySummary] = deriveEncoder[BerrySummary].mapJson(_.dropNullValues)
  implicit val decoderBerrySummary: Decoder[BerrySummary] = deriveDecoder[BerrySummary]
}

/**
* 
* @param description 
* @param language 
*/

case class CharacteristicDescription(
  description: Option[Refined[String, MaxSize[1000]]],
  language: LanguageSummary
)
object CharacteristicDescription {
  implicit val encoderCharacteristicDescription: Encoder[CharacteristicDescription] = deriveEncoder[CharacteristicDescription].mapJson(_.dropNullValues)
  implicit val decoderCharacteristicDescription: Decoder[CharacteristicDescription] = deriveDecoder[CharacteristicDescription]
}

/**
* 
* @param id 
* @param geneUnderscoremodulo 
* @param possibleUnderscorevalues 
* @param highestUnderscorestat 
* @param descriptions 
*/

case class CharacteristicDetail(
  id: Int,
  geneUnderscoremodulo: Int,
  possibleUnderscorevalues: List[Int],
  highestUnderscorestat: StatSummary,
  descriptions: List[CharacteristicDescription]
)
object CharacteristicDetail {
  implicit val encoderCharacteristicDetail: Encoder[CharacteristicDetail] = deriveEncoder[CharacteristicDetail].mapJson(_.dropNullValues)
  implicit val decoderCharacteristicDetail: Decoder[CharacteristicDetail] = deriveDecoder[CharacteristicDetail]
}

/**
* 
* @param url 
*/

case class CharacteristicSummary(
  url: URI
)
object CharacteristicSummary {
  implicit val encoderCharacteristicSummary: Encoder[CharacteristicSummary] = deriveEncoder[CharacteristicSummary].mapJson(_.dropNullValues)
  implicit val decoderCharacteristicSummary: Decoder[CharacteristicSummary] = deriveDecoder[CharacteristicSummary]
}

/**
* 
* @param id 
* @param appeal 
* @param jam 
* @param effectUnderscoreentries 
* @param flavorUnderscoretextUnderscoreentries 
*/

case class ContestEffectDetail(
  id: Int,
  appeal: Int,
  jam: Int,
  effectUnderscoreentries: List[ContestEffectEffectText],
  flavorUnderscoretextUnderscoreentries: List[ContestEffectFlavorText]
)
object ContestEffectDetail {
  implicit val encoderContestEffectDetail: Encoder[ContestEffectDetail] = deriveEncoder[ContestEffectDetail].mapJson(_.dropNullValues)
  implicit val decoderContestEffectDetail: Decoder[ContestEffectDetail] = deriveDecoder[ContestEffectDetail]
}

/**
* 
* @param effect 
* @param language 
*/

case class ContestEffectEffectText(
  effect: Refined[String, MaxSize[6000]],
  language: LanguageSummary
)
object ContestEffectEffectText {
  implicit val encoderContestEffectEffectText: Encoder[ContestEffectEffectText] = deriveEncoder[ContestEffectEffectText].mapJson(_.dropNullValues)
  implicit val decoderContestEffectEffectText: Decoder[ContestEffectEffectText] = deriveDecoder[ContestEffectEffectText]
}

/**
* 
* @param flavorUnderscoretext 
* @param language 
*/

case class ContestEffectFlavorText(
  flavorUnderscoretext: Refined[String, MaxSize[500]],
  language: LanguageSummary
)
object ContestEffectFlavorText {
  implicit val encoderContestEffectFlavorText: Encoder[ContestEffectFlavorText] = deriveEncoder[ContestEffectFlavorText].mapJson(_.dropNullValues)
  implicit val decoderContestEffectFlavorText: Decoder[ContestEffectFlavorText] = deriveDecoder[ContestEffectFlavorText]
}

/**
* 
* @param url 
*/

case class ContestEffectSummary(
  url: URI
)
object ContestEffectSummary {
  implicit val encoderContestEffectSummary: Encoder[ContestEffectSummary] = deriveEncoder[ContestEffectSummary].mapJson(_.dropNullValues)
  implicit val decoderContestEffectSummary: Decoder[ContestEffectSummary] = deriveDecoder[ContestEffectSummary]
}

/**
* 
* @param id 
* @param name 
* @param berryUnderscoreflavor 
* @param names 
*/

case class ContestTypeDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  berryUnderscoreflavor: BerryFlavorSummary,
  names: List[ContestTypeName]
)
object ContestTypeDetail {
  implicit val encoderContestTypeDetail: Encoder[ContestTypeDetail] = deriveEncoder[ContestTypeDetail].mapJson(_.dropNullValues)
  implicit val decoderContestTypeDetail: Decoder[ContestTypeDetail] = deriveDecoder[ContestTypeDetail]
}

/**
* 
* @param name 
* @param color 
* @param language 
*/

case class ContestTypeName(
  name: Refined[String, MaxSize[100]],
  color: Refined[String, MaxSize[10]],
  language: LanguageSummary
)
object ContestTypeName {
  implicit val encoderContestTypeName: Encoder[ContestTypeName] = deriveEncoder[ContestTypeName].mapJson(_.dropNullValues)
  implicit val decoderContestTypeName: Decoder[ContestTypeName] = deriveDecoder[ContestTypeName]
}

/**
* 
* @param name 
* @param url 
*/

case class ContestTypeSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object ContestTypeSummary {
  implicit val encoderContestTypeSummary: Encoder[ContestTypeSummary] = deriveEncoder[ContestTypeSummary].mapJson(_.dropNullValues)
  implicit val decoderContestTypeSummary: Decoder[ContestTypeSummary] = deriveDecoder[ContestTypeSummary]
}

/**
* 
* @param id 
* @param name 
* @param names 
* @param pokemonUnderscorespecies 
*/

case class EggGroupDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  names: List[EggGroupName],
  pokemonUnderscorespecies: List[EggGroupDetailPokemonSpeciesInner]
)
object EggGroupDetail {
  implicit val encoderEggGroupDetail: Encoder[EggGroupDetail] = deriveEncoder[EggGroupDetail].mapJson(_.dropNullValues)
  implicit val decoderEggGroupDetail: Decoder[EggGroupDetail] = deriveDecoder[EggGroupDetail]
}

/**
* 
* @param name Pokemon species name.
* @param url The URL to get more information about the species
*/

case class EggGroupDetailPokemonSpeciesInner(
  name: Option[String],
  url: Option[URI]
)
object EggGroupDetailPokemonSpeciesInner {
  implicit val encoderEggGroupDetailPokemonSpeciesInner: Encoder[EggGroupDetailPokemonSpeciesInner] = deriveEncoder[EggGroupDetailPokemonSpeciesInner].mapJson(_.dropNullValues)
  implicit val decoderEggGroupDetailPokemonSpeciesInner: Decoder[EggGroupDetailPokemonSpeciesInner] = deriveDecoder[EggGroupDetailPokemonSpeciesInner]
}

/**
* 
* @param name 
* @param language 
*/

case class EggGroupName(
  name: Refined[String, MaxSize[100]],
  language: LanguageSummary
)
object EggGroupName {
  implicit val encoderEggGroupName: Encoder[EggGroupName] = deriveEncoder[EggGroupName].mapJson(_.dropNullValues)
  implicit val decoderEggGroupName: Decoder[EggGroupName] = deriveDecoder[EggGroupName]
}

/**
* 
* @param name 
* @param url 
*/

case class EggGroupSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object EggGroupSummary {
  implicit val encoderEggGroupSummary: Encoder[EggGroupSummary] = deriveEncoder[EggGroupSummary].mapJson(_.dropNullValues)
  implicit val decoderEggGroupSummary: Decoder[EggGroupSummary] = deriveDecoder[EggGroupSummary]
}

/**
* 
* @param id 
* @param name 
* @param values 
* @param names 
*/

case class EncounterConditionDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  values: List[EncounterConditionValueSummary],
  names: List[EncounterConditionName]
)
object EncounterConditionDetail {
  implicit val encoderEncounterConditionDetail: Encoder[EncounterConditionDetail] = deriveEncoder[EncounterConditionDetail].mapJson(_.dropNullValues)
  implicit val decoderEncounterConditionDetail: Decoder[EncounterConditionDetail] = deriveDecoder[EncounterConditionDetail]
}

/**
* 
* @param name 
* @param language 
*/

case class EncounterConditionName(
  name: Refined[String, MaxSize[100]],
  language: LanguageSummary
)
object EncounterConditionName {
  implicit val encoderEncounterConditionName: Encoder[EncounterConditionName] = deriveEncoder[EncounterConditionName].mapJson(_.dropNullValues)
  implicit val decoderEncounterConditionName: Decoder[EncounterConditionName] = deriveDecoder[EncounterConditionName]
}

/**
* 
* @param name 
* @param url 
*/

case class EncounterConditionSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object EncounterConditionSummary {
  implicit val encoderEncounterConditionSummary: Encoder[EncounterConditionSummary] = deriveEncoder[EncounterConditionSummary].mapJson(_.dropNullValues)
  implicit val decoderEncounterConditionSummary: Decoder[EncounterConditionSummary] = deriveDecoder[EncounterConditionSummary]
}

/**
* 
* @param id 
* @param name 
* @param condition 
* @param names 
*/

case class EncounterConditionValueDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  condition: EncounterConditionSummary,
  names: List[EncounterConditionValueName]
)
object EncounterConditionValueDetail {
  implicit val encoderEncounterConditionValueDetail: Encoder[EncounterConditionValueDetail] = deriveEncoder[EncounterConditionValueDetail].mapJson(_.dropNullValues)
  implicit val decoderEncounterConditionValueDetail: Decoder[EncounterConditionValueDetail] = deriveDecoder[EncounterConditionValueDetail]
}

/**
* 
* @param name 
* @param language 
*/

case class EncounterConditionValueName(
  name: Refined[String, MaxSize[100]],
  language: LanguageSummary
)
object EncounterConditionValueName {
  implicit val encoderEncounterConditionValueName: Encoder[EncounterConditionValueName] = deriveEncoder[EncounterConditionValueName].mapJson(_.dropNullValues)
  implicit val decoderEncounterConditionValueName: Decoder[EncounterConditionValueName] = deriveDecoder[EncounterConditionValueName]
}

/**
* 
* @param name 
* @param url 
*/

case class EncounterConditionValueSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object EncounterConditionValueSummary {
  implicit val encoderEncounterConditionValueSummary: Encoder[EncounterConditionValueSummary] = deriveEncoder[EncounterConditionValueSummary].mapJson(_.dropNullValues)
  implicit val decoderEncounterConditionValueSummary: Decoder[EncounterConditionValueSummary] = deriveDecoder[EncounterConditionValueSummary]
}

/**
* 
* @param id 
* @param name 
* @param order 
* @param names 
*/

case class EncounterMethodDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  order: Option[Int],
  names: List[EncounterMethodName]
)
object EncounterMethodDetail {
  implicit val encoderEncounterMethodDetail: Encoder[EncounterMethodDetail] = deriveEncoder[EncounterMethodDetail].mapJson(_.dropNullValues)
  implicit val decoderEncounterMethodDetail: Decoder[EncounterMethodDetail] = deriveDecoder[EncounterMethodDetail]
}

/**
* 
* @param name 
* @param language 
*/

case class EncounterMethodName(
  name: Refined[String, MaxSize[100]],
  language: LanguageSummary
)
object EncounterMethodName {
  implicit val encoderEncounterMethodName: Encoder[EncounterMethodName] = deriveEncoder[EncounterMethodName].mapJson(_.dropNullValues)
  implicit val decoderEncounterMethodName: Decoder[EncounterMethodName] = deriveDecoder[EncounterMethodName]
}

/**
* 
* @param name 
* @param url 
*/

case class EncounterMethodSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object EncounterMethodSummary {
  implicit val encoderEncounterMethodSummary: Encoder[EncounterMethodSummary] = deriveEncoder[EncounterMethodSummary].mapJson(_.dropNullValues)
  implicit val decoderEncounterMethodSummary: Decoder[EncounterMethodSummary] = deriveDecoder[EncounterMethodSummary]
}

/**
* 
* @param id 
* @param babyUnderscoretriggerUnderscoreitem 
* @param chain 
*/

case class EvolutionChainDetail(
  id: Int,
  babyUnderscoretriggerUnderscoreitem: ItemSummary,
  chain: EvolutionChainDetailChain
)
object EvolutionChainDetail {
  implicit val encoderEvolutionChainDetail: Encoder[EvolutionChainDetail] = deriveEncoder[EvolutionChainDetail].mapJson(_.dropNullValues)
  implicit val decoderEvolutionChainDetail: Decoder[EvolutionChainDetail] = deriveDecoder[EvolutionChainDetail]
}

/**
* 
* @param evolutionUnderscoredetails 
* @param evolvesUnderscoreto 
* @param isUnderscorebaby 
* @param species 
*/

case class EvolutionChainDetailChain(
  evolutionUnderscoredetails: List[AnyType],
  evolvesUnderscoreto: List[EvolutionChainDetailChainEvolvesToInner],
  isUnderscorebaby: Boolean,
  species: EvolutionChainDetailChainSpecies
)
object EvolutionChainDetailChain {
  implicit val encoderEvolutionChainDetailChain: Encoder[EvolutionChainDetailChain] = deriveEncoder[EvolutionChainDetailChain].mapJson(_.dropNullValues)
  implicit val decoderEvolutionChainDetailChain: Decoder[EvolutionChainDetailChain] = deriveDecoder[EvolutionChainDetailChain]
}

/**
* 
* @param evolutionUnderscoredetails 
* @param isUnderscorebaby 
* @param species 
*/

case class EvolutionChainDetailChainEvolvesToInner(
  evolutionUnderscoredetails: List[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner],
  isUnderscorebaby: Boolean,
  species: EvolutionChainDetailChainEvolvesToInnerSpecies
)
object EvolutionChainDetailChainEvolvesToInner {
  implicit val encoderEvolutionChainDetailChainEvolvesToInner: Encoder[EvolutionChainDetailChainEvolvesToInner] = deriveEncoder[EvolutionChainDetailChainEvolvesToInner].mapJson(_.dropNullValues)
  implicit val decoderEvolutionChainDetailChainEvolvesToInner: Decoder[EvolutionChainDetailChainEvolvesToInner] = deriveDecoder[EvolutionChainDetailChainEvolvesToInner]
}

/**
* 
* @param gender 
* @param heldUnderscoreitem 
* @param item 
* @param knownUnderscoremove 
* @param knownUnderscoremoveUnderscoretype 
* @param location 
* @param minUnderscoreaffection 
* @param minUnderscorebeauty 
* @param minUnderscorehappiness 
* @param minUnderscorelevel 
* @param needsUnderscoreoverworldUnderscorerain 
* @param partyUnderscorespecies 
* @param partyUnderscoretype 
* @param relativeUnderscorephysicalUnderscorestats 
* @param timeUnderscoreofUnderscoreday 
* @param tradeUnderscorespecies 
* @param trigger 
* @param turnUnderscoreupsideUnderscoredown 
*/

case class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner(
  gender: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender,
  heldUnderscoreitem: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerHeldItem,
  item: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerItem,
  knownUnderscoremove: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerKnownMove,
  knownUnderscoremoveUnderscoretype: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerKnownMoveType,
  location: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerLocation,
  minUnderscoreaffection: Int,
  minUnderscorebeauty: Int,
  minUnderscorehappiness: Int,
  minUnderscorelevel: Int,
  needsUnderscoreoverworldUnderscorerain: Boolean,
  partyUnderscorespecies: String,
  partyUnderscoretype: String,
  relativeUnderscorephysicalUnderscorestats: String,
  timeUnderscoreofUnderscoreday: String,
  tradeUnderscorespecies: String,
  trigger: EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerTrigger,
  turnUnderscoreupsideUnderscoredown: Boolean
)
object EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner {
  implicit val encoderEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner: Encoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner] = deriveEncoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner].mapJson(_.dropNullValues)
  implicit val decoderEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner: Decoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner] = deriveDecoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner]
}

/**
* 
* @param name 
* @param url 
*/

case class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender(
  name: String,
  url: URI
)
object EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender {
  implicit val encoderEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender: Encoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender] = deriveEncoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender].mapJson(_.dropNullValues)
  implicit val decoderEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender: Decoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender] = deriveDecoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerGender]
}

/**
* 
* @param name 
* @param url 
*/

case class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerHeldItem(
  name: String,
  url: URI
)
object EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerHeldItem {
  implicit val encoderEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerHeldItem: Encoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerHeldItem] = deriveEncoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerHeldItem].mapJson(_.dropNullValues)
  implicit val decoderEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerHeldItem: Decoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerHeldItem] = deriveDecoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerHeldItem]
}

/**
* 
* @param name 
* @param url 
*/

case class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerItem(
  name: String,
  url: URI
)
object EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerItem {
  implicit val encoderEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerItem: Encoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerItem] = deriveEncoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerItem].mapJson(_.dropNullValues)
  implicit val decoderEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerItem: Decoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerItem] = deriveDecoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerItem]
}

/**
* 
* @param name 
* @param url 
*/

case class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerKnownMove(
  name: String,
  url: URI
)
object EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerKnownMove {
  implicit val encoderEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerKnownMove: Encoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerKnownMove] = deriveEncoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerKnownMove].mapJson(_.dropNullValues)
  implicit val decoderEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerKnownMove: Decoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerKnownMove] = deriveDecoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerKnownMove]
}

/**
* 
* @param name 
* @param url 
*/

case class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerKnownMoveType(
  name: String,
  url: URI
)
object EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerKnownMoveType {
  implicit val encoderEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerKnownMoveType: Encoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerKnownMoveType] = deriveEncoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerKnownMoveType].mapJson(_.dropNullValues)
  implicit val decoderEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerKnownMoveType: Decoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerKnownMoveType] = deriveDecoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerKnownMoveType]
}

/**
* 
* @param name 
* @param url 
*/

case class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerLocation(
  name: String,
  url: URI
)
object EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerLocation {
  implicit val encoderEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerLocation: Encoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerLocation] = deriveEncoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerLocation].mapJson(_.dropNullValues)
  implicit val decoderEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerLocation: Decoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerLocation] = deriveDecoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerLocation]
}

/**
* 
* @param name 
* @param url 
*/

case class EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerTrigger(
  name: String,
  url: URI
)
object EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerTrigger {
  implicit val encoderEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerTrigger: Encoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerTrigger] = deriveEncoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerTrigger].mapJson(_.dropNullValues)
  implicit val decoderEvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerTrigger: Decoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerTrigger] = deriveDecoder[EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInnerTrigger]
}

/**
* 
* @param name 
* @param url 
*/

case class EvolutionChainDetailChainEvolvesToInnerSpecies(
  name: String,
  url: URI
)
object EvolutionChainDetailChainEvolvesToInnerSpecies {
  implicit val encoderEvolutionChainDetailChainEvolvesToInnerSpecies: Encoder[EvolutionChainDetailChainEvolvesToInnerSpecies] = deriveEncoder[EvolutionChainDetailChainEvolvesToInnerSpecies].mapJson(_.dropNullValues)
  implicit val decoderEvolutionChainDetailChainEvolvesToInnerSpecies: Decoder[EvolutionChainDetailChainEvolvesToInnerSpecies] = deriveDecoder[EvolutionChainDetailChainEvolvesToInnerSpecies]
}

/**
* 
* @param name 
* @param url 
*/

case class EvolutionChainDetailChainSpecies(
  name: String,
  url: URI
)
object EvolutionChainDetailChainSpecies {
  implicit val encoderEvolutionChainDetailChainSpecies: Encoder[EvolutionChainDetailChainSpecies] = deriveEncoder[EvolutionChainDetailChainSpecies].mapJson(_.dropNullValues)
  implicit val decoderEvolutionChainDetailChainSpecies: Decoder[EvolutionChainDetailChainSpecies] = deriveDecoder[EvolutionChainDetailChainSpecies]
}

/**
* 
* @param url 
*/

case class EvolutionChainSummary(
  url: URI
)
object EvolutionChainSummary {
  implicit val encoderEvolutionChainSummary: Encoder[EvolutionChainSummary] = deriveEncoder[EvolutionChainSummary].mapJson(_.dropNullValues)
  implicit val decoderEvolutionChainSummary: Decoder[EvolutionChainSummary] = deriveDecoder[EvolutionChainSummary]
}

/**
* 
* @param id 
* @param name 
* @param names 
* @param pokemonUnderscorespecies 
*/

case class EvolutionTriggerDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  names: List[EvolutionTriggerName],
  pokemonUnderscorespecies: List[EvolutionTriggerDetailPokemonSpeciesInner]
)
object EvolutionTriggerDetail {
  implicit val encoderEvolutionTriggerDetail: Encoder[EvolutionTriggerDetail] = deriveEncoder[EvolutionTriggerDetail].mapJson(_.dropNullValues)
  implicit val decoderEvolutionTriggerDetail: Decoder[EvolutionTriggerDetail] = deriveDecoder[EvolutionTriggerDetail]
}

/**
* 
* @param name 
* @param url 
*/

case class EvolutionTriggerDetailPokemonSpeciesInner(
  name: String,
  url: URI
)
object EvolutionTriggerDetailPokemonSpeciesInner {
  implicit val encoderEvolutionTriggerDetailPokemonSpeciesInner: Encoder[EvolutionTriggerDetailPokemonSpeciesInner] = deriveEncoder[EvolutionTriggerDetailPokemonSpeciesInner].mapJson(_.dropNullValues)
  implicit val decoderEvolutionTriggerDetailPokemonSpeciesInner: Decoder[EvolutionTriggerDetailPokemonSpeciesInner] = deriveDecoder[EvolutionTriggerDetailPokemonSpeciesInner]
}

/**
* 
* @param name 
* @param language 
*/

case class EvolutionTriggerName(
  name: Refined[String, MaxSize[100]],
  language: LanguageSummary
)
object EvolutionTriggerName {
  implicit val encoderEvolutionTriggerName: Encoder[EvolutionTriggerName] = deriveEncoder[EvolutionTriggerName].mapJson(_.dropNullValues)
  implicit val decoderEvolutionTriggerName: Decoder[EvolutionTriggerName] = deriveDecoder[EvolutionTriggerName]
}

/**
* 
* @param name 
* @param url 
*/

case class EvolutionTriggerSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object EvolutionTriggerSummary {
  implicit val encoderEvolutionTriggerSummary: Encoder[EvolutionTriggerSummary] = deriveEncoder[EvolutionTriggerSummary].mapJson(_.dropNullValues)
  implicit val decoderEvolutionTriggerSummary: Decoder[EvolutionTriggerSummary] = deriveDecoder[EvolutionTriggerSummary]
}

/**
* 
* @param level 
* @param experience 
*/

case class Experience(
  level: Int,
  experience: Int
)
object Experience {
  implicit val encoderExperience: Encoder[Experience] = deriveEncoder[Experience].mapJson(_.dropNullValues)
  implicit val decoderExperience: Decoder[Experience] = deriveDecoder[Experience]
}

/**
* 
* @param id 
* @param name 
* @param pokemonUnderscorespeciesUnderscoredetails 
* @param requiredUnderscoreforUnderscoreevolution 
*/

case class GenderDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  pokemonUnderscorespeciesUnderscoredetails: List[GenderDetailPokemonSpeciesDetailsInner],
  requiredUnderscoreforUnderscoreevolution: List[GenderDetailRequiredForEvolutionInner]
)
object GenderDetail {
  implicit val encoderGenderDetail: Encoder[GenderDetail] = deriveEncoder[GenderDetail].mapJson(_.dropNullValues)
  implicit val decoderGenderDetail: Decoder[GenderDetail] = deriveDecoder[GenderDetail]
}

/**
* 
* @param rate 
* @param pokemonUnderscorespecies 
*/

case class GenderDetailPokemonSpeciesDetailsInner(
  rate: Int,
  pokemonUnderscorespecies: GenderDetailPokemonSpeciesDetailsInnerPokemonSpecies
)
object GenderDetailPokemonSpeciesDetailsInner {
  implicit val encoderGenderDetailPokemonSpeciesDetailsInner: Encoder[GenderDetailPokemonSpeciesDetailsInner] = deriveEncoder[GenderDetailPokemonSpeciesDetailsInner].mapJson(_.dropNullValues)
  implicit val decoderGenderDetailPokemonSpeciesDetailsInner: Decoder[GenderDetailPokemonSpeciesDetailsInner] = deriveDecoder[GenderDetailPokemonSpeciesDetailsInner]
}

/**
* 
* @param name 
* @param url 
*/

case class GenderDetailPokemonSpeciesDetailsInnerPokemonSpecies(
  name: String,
  url: URI
)
object GenderDetailPokemonSpeciesDetailsInnerPokemonSpecies {
  implicit val encoderGenderDetailPokemonSpeciesDetailsInnerPokemonSpecies: Encoder[GenderDetailPokemonSpeciesDetailsInnerPokemonSpecies] = deriveEncoder[GenderDetailPokemonSpeciesDetailsInnerPokemonSpecies].mapJson(_.dropNullValues)
  implicit val decoderGenderDetailPokemonSpeciesDetailsInnerPokemonSpecies: Decoder[GenderDetailPokemonSpeciesDetailsInnerPokemonSpecies] = deriveDecoder[GenderDetailPokemonSpeciesDetailsInnerPokemonSpecies]
}

/**
* 
* @param name 
* @param url 
*/

case class GenderDetailRequiredForEvolutionInner(
  name: String,
  url: URI
)
object GenderDetailRequiredForEvolutionInner {
  implicit val encoderGenderDetailRequiredForEvolutionInner: Encoder[GenderDetailRequiredForEvolutionInner] = deriveEncoder[GenderDetailRequiredForEvolutionInner].mapJson(_.dropNullValues)
  implicit val decoderGenderDetailRequiredForEvolutionInner: Decoder[GenderDetailRequiredForEvolutionInner] = deriveDecoder[GenderDetailRequiredForEvolutionInner]
}

/**
* 
* @param name 
* @param url 
*/

case class GenderSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object GenderSummary {
  implicit val encoderGenderSummary: Encoder[GenderSummary] = deriveEncoder[GenderSummary].mapJson(_.dropNullValues)
  implicit val decoderGenderSummary: Decoder[GenderSummary] = deriveDecoder[GenderSummary]
}

/**
* 
* @param id 
* @param name 
* @param abilities 
* @param mainUnderscoreregion 
* @param moves 
* @param names 
* @param pokemonUnderscorespecies 
* @param types 
* @param versionUnderscoregroups 
*/

case class GenerationDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  abilities: List[AbilitySummary],
  mainUnderscoreregion: RegionSummary,
  moves: List[MoveSummary],
  names: List[GenerationName],
  pokemonUnderscorespecies: List[PokemonSpeciesSummary],
  types: List[TypeSummary],
  versionUnderscoregroups: List[VersionGroupSummary]
)
object GenerationDetail {
  implicit val encoderGenerationDetail: Encoder[GenerationDetail] = deriveEncoder[GenerationDetail].mapJson(_.dropNullValues)
  implicit val decoderGenerationDetail: Decoder[GenerationDetail] = deriveDecoder[GenerationDetail]
}

/**
* 
* @param name 
* @param language 
*/

case class GenerationName(
  name: Refined[String, MaxSize[100]],
  language: LanguageSummary
)
object GenerationName {
  implicit val encoderGenerationName: Encoder[GenerationName] = deriveEncoder[GenerationName].mapJson(_.dropNullValues)
  implicit val decoderGenerationName: Decoder[GenerationName] = deriveDecoder[GenerationName]
}

/**
* 
* @param name 
* @param url 
*/

case class GenerationSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object GenerationSummary {
  implicit val encoderGenerationSummary: Encoder[GenerationSummary] = deriveEncoder[GenerationSummary].mapJson(_.dropNullValues)
  implicit val decoderGenerationSummary: Decoder[GenerationSummary] = deriveDecoder[GenerationSummary]
}

/**
* 
* @param description 
* @param language 
*/

case class GrowthRateDescription(
  description: Option[Refined[String, MaxSize[1000]]],
  language: LanguageSummary
)
object GrowthRateDescription {
  implicit val encoderGrowthRateDescription: Encoder[GrowthRateDescription] = deriveEncoder[GrowthRateDescription].mapJson(_.dropNullValues)
  implicit val decoderGrowthRateDescription: Decoder[GrowthRateDescription] = deriveDecoder[GrowthRateDescription]
}

/**
* 
* @param id 
* @param name 
* @param formula 
* @param descriptions 
* @param levels 
* @param pokemonUnderscorespecies 
*/

case class GrowthRateDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  formula: Refined[String, MaxSize[500]],
  descriptions: List[GrowthRateDescription],
  levels: List[Experience],
  pokemonUnderscorespecies: List[PokemonSpeciesSummary]
)
object GrowthRateDetail {
  implicit val encoderGrowthRateDetail: Encoder[GrowthRateDetail] = deriveEncoder[GrowthRateDetail].mapJson(_.dropNullValues)
  implicit val decoderGrowthRateDetail: Decoder[GrowthRateDetail] = deriveDecoder[GrowthRateDetail]
}

/**
* 
* @param name 
* @param url 
*/

case class GrowthRateSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object GrowthRateSummary {
  implicit val encoderGrowthRateSummary: Encoder[GrowthRateSummary] = deriveEncoder[GrowthRateSummary].mapJson(_.dropNullValues)
  implicit val decoderGrowthRateSummary: Decoder[GrowthRateSummary] = deriveDecoder[GrowthRateSummary]
}

/**
* 
* @param description 
* @param language 
*/

case class ItemAttributeDescription(
  description: Option[Refined[String, MaxSize[1000]]],
  language: LanguageSummary
)
object ItemAttributeDescription {
  implicit val encoderItemAttributeDescription: Encoder[ItemAttributeDescription] = deriveEncoder[ItemAttributeDescription].mapJson(_.dropNullValues)
  implicit val decoderItemAttributeDescription: Decoder[ItemAttributeDescription] = deriveDecoder[ItemAttributeDescription]
}

/**
* 
* @param id 
* @param name 
* @param descriptions 
* @param items 
* @param names 
*/

case class ItemAttributeDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  descriptions: List[ItemAttributeDescription],
  items: List[ItemAttributeDetailItemsInner],
  names: List[ItemAttributeName]
)
object ItemAttributeDetail {
  implicit val encoderItemAttributeDetail: Encoder[ItemAttributeDetail] = deriveEncoder[ItemAttributeDetail].mapJson(_.dropNullValues)
  implicit val decoderItemAttributeDetail: Decoder[ItemAttributeDetail] = deriveDecoder[ItemAttributeDetail]
}

/**
* 
* @param name 
* @param url 
*/

case class ItemAttributeDetailItemsInner(
  name: String,
  url: URI
)
object ItemAttributeDetailItemsInner {
  implicit val encoderItemAttributeDetailItemsInner: Encoder[ItemAttributeDetailItemsInner] = deriveEncoder[ItemAttributeDetailItemsInner].mapJson(_.dropNullValues)
  implicit val decoderItemAttributeDetailItemsInner: Decoder[ItemAttributeDetailItemsInner] = deriveDecoder[ItemAttributeDetailItemsInner]
}

/**
* 
* @param name 
* @param language 
*/

case class ItemAttributeName(
  name: Refined[String, MaxSize[100]],
  language: LanguageSummary
)
object ItemAttributeName {
  implicit val encoderItemAttributeName: Encoder[ItemAttributeName] = deriveEncoder[ItemAttributeName].mapJson(_.dropNullValues)
  implicit val decoderItemAttributeName: Decoder[ItemAttributeName] = deriveDecoder[ItemAttributeName]
}

/**
* 
* @param name 
* @param url 
*/

case class ItemAttributeSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object ItemAttributeSummary {
  implicit val encoderItemAttributeSummary: Encoder[ItemAttributeSummary] = deriveEncoder[ItemAttributeSummary].mapJson(_.dropNullValues)
  implicit val decoderItemAttributeSummary: Decoder[ItemAttributeSummary] = deriveDecoder[ItemAttributeSummary]
}

/**
* 
* @param id 
* @param name 
* @param items 
* @param names 
* @param pocket 
*/

case class ItemCategoryDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  items: List[ItemSummary],
  names: List[ItemCategoryName],
  pocket: ItemPocketSummary
)
object ItemCategoryDetail {
  implicit val encoderItemCategoryDetail: Encoder[ItemCategoryDetail] = deriveEncoder[ItemCategoryDetail].mapJson(_.dropNullValues)
  implicit val decoderItemCategoryDetail: Decoder[ItemCategoryDetail] = deriveDecoder[ItemCategoryDetail]
}

/**
* 
* @param name 
* @param language 
*/

case class ItemCategoryName(
  name: Refined[String, MaxSize[100]],
  language: LanguageSummary
)
object ItemCategoryName {
  implicit val encoderItemCategoryName: Encoder[ItemCategoryName] = deriveEncoder[ItemCategoryName].mapJson(_.dropNullValues)
  implicit val decoderItemCategoryName: Decoder[ItemCategoryName] = deriveDecoder[ItemCategoryName]
}

/**
* 
* @param name 
* @param url 
*/

case class ItemCategorySummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object ItemCategorySummary {
  implicit val encoderItemCategorySummary: Encoder[ItemCategorySummary] = deriveEncoder[ItemCategorySummary].mapJson(_.dropNullValues)
  implicit val decoderItemCategorySummary: Decoder[ItemCategorySummary] = deriveDecoder[ItemCategorySummary]
}

/**
* 
* @param id 
* @param name 
* @param cost 
* @param flingUnderscorepower 
* @param flingUnderscoreeffect 
* @param attributes 
* @param category 
* @param effectUnderscoreentries 
* @param flavorUnderscoretextUnderscoreentries 
* @param gameUnderscoreindices 
* @param names 
* @param heldUnderscorebyUnderscorepokemon 
* @param sprites 
* @param babyUnderscoretriggerUnderscorefor 
* @param machines 
*/

case class ItemDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  cost: Option[Int],
  flingUnderscorepower: Option[Int],
  flingUnderscoreeffect: ItemFlingEffectSummary,
  attributes: List[ItemDetailAttributesInner],
  category: ItemCategorySummary,
  effectUnderscoreentries: List[ItemEffectText],
  flavorUnderscoretextUnderscoreentries: List[ItemFlavorText],
  gameUnderscoreindices: List[ItemGameIndex],
  names: List[ItemName],
  heldUnderscorebyUnderscorepokemon: List[ItemDetailHeldByPokemonInner],
  sprites: ItemDetailSprites,
  babyUnderscoretriggerUnderscorefor: ItemDetailBabyTriggerFor,
  machines: List[ItemDetailMachinesInner]
)
object ItemDetail {
  implicit val encoderItemDetail: Encoder[ItemDetail] = deriveEncoder[ItemDetail].mapJson(_.dropNullValues)
  implicit val decoderItemDetail: Decoder[ItemDetail] = deriveDecoder[ItemDetail]
}

/**
* 
* @param name 
* @param url 
*/

case class ItemDetailAttributesInner(
  name: String,
  url: URI
)
object ItemDetailAttributesInner {
  implicit val encoderItemDetailAttributesInner: Encoder[ItemDetailAttributesInner] = deriveEncoder[ItemDetailAttributesInner].mapJson(_.dropNullValues)
  implicit val decoderItemDetailAttributesInner: Decoder[ItemDetailAttributesInner] = deriveDecoder[ItemDetailAttributesInner]
}

/**
* 
* @param url 
*/

case class ItemDetailBabyTriggerFor(
  url: URI
)
object ItemDetailBabyTriggerFor {
  implicit val encoderItemDetailBabyTriggerFor: Encoder[ItemDetailBabyTriggerFor] = deriveEncoder[ItemDetailBabyTriggerFor].mapJson(_.dropNullValues)
  implicit val decoderItemDetailBabyTriggerFor: Decoder[ItemDetailBabyTriggerFor] = deriveDecoder[ItemDetailBabyTriggerFor]
}

/**
* 
* @param pokemon 
* @param versionMinusdetails 
*/

case class ItemDetailHeldByPokemonInner(
  pokemon: ItemDetailHeldByPokemonInnerPokemon,
  versionMinusdetails: List[ItemDetailHeldByPokemonInnerVersionDetailsInner]
)
object ItemDetailHeldByPokemonInner {
  implicit val encoderItemDetailHeldByPokemonInner: Encoder[ItemDetailHeldByPokemonInner] = deriveEncoder[ItemDetailHeldByPokemonInner].mapJson(_.dropNullValues)
  implicit val decoderItemDetailHeldByPokemonInner: Decoder[ItemDetailHeldByPokemonInner] = deriveDecoder[ItemDetailHeldByPokemonInner]
}

/**
* 
* @param name 
* @param url 
*/

case class ItemDetailHeldByPokemonInnerPokemon(
  name: String,
  url: URI
)
object ItemDetailHeldByPokemonInnerPokemon {
  implicit val encoderItemDetailHeldByPokemonInnerPokemon: Encoder[ItemDetailHeldByPokemonInnerPokemon] = deriveEncoder[ItemDetailHeldByPokemonInnerPokemon].mapJson(_.dropNullValues)
  implicit val decoderItemDetailHeldByPokemonInnerPokemon: Decoder[ItemDetailHeldByPokemonInnerPokemon] = deriveDecoder[ItemDetailHeldByPokemonInnerPokemon]
}

/**
* 
* @param rarity 
* @param version 
*/

case class ItemDetailHeldByPokemonInnerVersionDetailsInner(
  rarity: Int,
  version: ItemDetailHeldByPokemonInnerVersionDetailsInnerVersion
)
object ItemDetailHeldByPokemonInnerVersionDetailsInner {
  implicit val encoderItemDetailHeldByPokemonInnerVersionDetailsInner: Encoder[ItemDetailHeldByPokemonInnerVersionDetailsInner] = deriveEncoder[ItemDetailHeldByPokemonInnerVersionDetailsInner].mapJson(_.dropNullValues)
  implicit val decoderItemDetailHeldByPokemonInnerVersionDetailsInner: Decoder[ItemDetailHeldByPokemonInnerVersionDetailsInner] = deriveDecoder[ItemDetailHeldByPokemonInnerVersionDetailsInner]
}

/**
* 
* @param name 
* @param url 
*/

case class ItemDetailHeldByPokemonInnerVersionDetailsInnerVersion(
  name: String,
  url: URI
)
object ItemDetailHeldByPokemonInnerVersionDetailsInnerVersion {
  implicit val encoderItemDetailHeldByPokemonInnerVersionDetailsInnerVersion: Encoder[ItemDetailHeldByPokemonInnerVersionDetailsInnerVersion] = deriveEncoder[ItemDetailHeldByPokemonInnerVersionDetailsInnerVersion].mapJson(_.dropNullValues)
  implicit val decoderItemDetailHeldByPokemonInnerVersionDetailsInnerVersion: Decoder[ItemDetailHeldByPokemonInnerVersionDetailsInnerVersion] = deriveDecoder[ItemDetailHeldByPokemonInnerVersionDetailsInnerVersion]
}

/**
* 
* @param machine 
* @param versionUnderscoregroup 
*/

case class ItemDetailMachinesInner(
  machine: URI,
  versionUnderscoregroup: ItemDetailMachinesInnerVersionGroup
)
object ItemDetailMachinesInner {
  implicit val encoderItemDetailMachinesInner: Encoder[ItemDetailMachinesInner] = deriveEncoder[ItemDetailMachinesInner].mapJson(_.dropNullValues)
  implicit val decoderItemDetailMachinesInner: Decoder[ItemDetailMachinesInner] = deriveDecoder[ItemDetailMachinesInner]
}

/**
* 
* @param name 
* @param url 
*/

case class ItemDetailMachinesInnerVersionGroup(
  name: String,
  url: URI
)
object ItemDetailMachinesInnerVersionGroup {
  implicit val encoderItemDetailMachinesInnerVersionGroup: Encoder[ItemDetailMachinesInnerVersionGroup] = deriveEncoder[ItemDetailMachinesInnerVersionGroup].mapJson(_.dropNullValues)
  implicit val decoderItemDetailMachinesInnerVersionGroup: Decoder[ItemDetailMachinesInnerVersionGroup] = deriveDecoder[ItemDetailMachinesInnerVersionGroup]
}

/**
* 
* @param `default` 
*/

case class ItemDetailSprites(
  `default`: URI
)
object ItemDetailSprites {
  implicit val encoderItemDetailSprites: Encoder[ItemDetailSprites] = deriveEncoder[ItemDetailSprites].mapJson(_.dropNullValues)
  implicit val decoderItemDetailSprites: Decoder[ItemDetailSprites] = deriveDecoder[ItemDetailSprites]
}

/**
* 
* @param effect 
* @param shortUnderscoreeffect 
* @param language 
*/

case class ItemEffectText(
  effect: Refined[String, MaxSize[6000]],
  shortUnderscoreeffect: Refined[String, MaxSize[300]],
  language: LanguageSummary
)
object ItemEffectText {
  implicit val encoderItemEffectText: Encoder[ItemEffectText] = deriveEncoder[ItemEffectText].mapJson(_.dropNullValues)
  implicit val decoderItemEffectText: Decoder[ItemEffectText] = deriveDecoder[ItemEffectText]
}

/**
* 
* @param text 
* @param versionUnderscoregroup 
* @param language 
*/

case class ItemFlavorText(
  text: String,
  versionUnderscoregroup: VersionGroupSummary,
  language: LanguageSummary
)
object ItemFlavorText {
  implicit val encoderItemFlavorText: Encoder[ItemFlavorText] = deriveEncoder[ItemFlavorText].mapJson(_.dropNullValues)
  implicit val decoderItemFlavorText: Decoder[ItemFlavorText] = deriveDecoder[ItemFlavorText]
}

/**
* 
* @param id 
* @param name 
* @param effectUnderscoreentries 
* @param items 
*/

case class ItemFlingEffectDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  effectUnderscoreentries: List[ItemFlingEffectEffectText],
  items: List[ItemSummary]
)
object ItemFlingEffectDetail {
  implicit val encoderItemFlingEffectDetail: Encoder[ItemFlingEffectDetail] = deriveEncoder[ItemFlingEffectDetail].mapJson(_.dropNullValues)
  implicit val decoderItemFlingEffectDetail: Decoder[ItemFlingEffectDetail] = deriveDecoder[ItemFlingEffectDetail]
}

/**
* 
* @param effect 
* @param language 
*/

case class ItemFlingEffectEffectText(
  effect: Refined[String, MaxSize[6000]],
  language: LanguageSummary
)
object ItemFlingEffectEffectText {
  implicit val encoderItemFlingEffectEffectText: Encoder[ItemFlingEffectEffectText] = deriveEncoder[ItemFlingEffectEffectText].mapJson(_.dropNullValues)
  implicit val decoderItemFlingEffectEffectText: Decoder[ItemFlingEffectEffectText] = deriveDecoder[ItemFlingEffectEffectText]
}

/**
* 
* @param name 
* @param url 
*/

case class ItemFlingEffectSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object ItemFlingEffectSummary {
  implicit val encoderItemFlingEffectSummary: Encoder[ItemFlingEffectSummary] = deriveEncoder[ItemFlingEffectSummary].mapJson(_.dropNullValues)
  implicit val decoderItemFlingEffectSummary: Decoder[ItemFlingEffectSummary] = deriveDecoder[ItemFlingEffectSummary]
}

/**
* 
* @param gameUnderscoreindex 
* @param generation 
*/

case class ItemGameIndex(
  gameUnderscoreindex: Int,
  generation: GenerationSummary
)
object ItemGameIndex {
  implicit val encoderItemGameIndex: Encoder[ItemGameIndex] = deriveEncoder[ItemGameIndex].mapJson(_.dropNullValues)
  implicit val decoderItemGameIndex: Decoder[ItemGameIndex] = deriveDecoder[ItemGameIndex]
}

/**
* 
* @param name 
* @param language 
*/

case class ItemName(
  name: Refined[String, MaxSize[100]],
  language: LanguageSummary
)
object ItemName {
  implicit val encoderItemName: Encoder[ItemName] = deriveEncoder[ItemName].mapJson(_.dropNullValues)
  implicit val decoderItemName: Decoder[ItemName] = deriveDecoder[ItemName]
}

/**
* 
* @param id 
* @param name 
* @param categories 
* @param names 
*/

case class ItemPocketDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  categories: List[ItemCategorySummary],
  names: List[ItemPocketName]
)
object ItemPocketDetail {
  implicit val encoderItemPocketDetail: Encoder[ItemPocketDetail] = deriveEncoder[ItemPocketDetail].mapJson(_.dropNullValues)
  implicit val decoderItemPocketDetail: Decoder[ItemPocketDetail] = deriveDecoder[ItemPocketDetail]
}

/**
* 
* @param name 
* @param language 
*/

case class ItemPocketName(
  name: Refined[String, MaxSize[100]],
  language: LanguageSummary
)
object ItemPocketName {
  implicit val encoderItemPocketName: Encoder[ItemPocketName] = deriveEncoder[ItemPocketName].mapJson(_.dropNullValues)
  implicit val decoderItemPocketName: Decoder[ItemPocketName] = deriveDecoder[ItemPocketName]
}

/**
* 
* @param name 
* @param url 
*/

case class ItemPocketSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object ItemPocketSummary {
  implicit val encoderItemPocketSummary: Encoder[ItemPocketSummary] = deriveEncoder[ItemPocketSummary].mapJson(_.dropNullValues)
  implicit val decoderItemPocketSummary: Decoder[ItemPocketSummary] = deriveDecoder[ItemPocketSummary]
}

/**
* 
* @param name 
* @param url 
*/

case class ItemSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object ItemSummary {
  implicit val encoderItemSummary: Encoder[ItemSummary] = deriveEncoder[ItemSummary].mapJson(_.dropNullValues)
  implicit val decoderItemSummary: Decoder[ItemSummary] = deriveDecoder[ItemSummary]
}

/**
* 
* @param id 
* @param name 
* @param official 
* @param iso639 
* @param iso3166 
* @param names 
*/

case class LanguageDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  official: Option[Boolean],
  iso639: Refined[String, MaxSize[10]],
  iso3166: Refined[String, MaxSize[2]],
  names: List[LanguageName]
)
object LanguageDetail {
  implicit val encoderLanguageDetail: Encoder[LanguageDetail] = deriveEncoder[LanguageDetail].mapJson(_.dropNullValues)
  implicit val decoderLanguageDetail: Decoder[LanguageDetail] = deriveDecoder[LanguageDetail]
}

/**
* 
* @param name 
* @param language 
*/

case class LanguageName(
  name: Refined[String, MaxSize[100]],
  language: LanguageSummary
)
object LanguageName {
  implicit val encoderLanguageName: Encoder[LanguageName] = deriveEncoder[LanguageName].mapJson(_.dropNullValues)
  implicit val decoderLanguageName: Decoder[LanguageName] = deriveDecoder[LanguageName]
}

/**
* 
* @param name 
* @param url 
*/

case class LanguageSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object LanguageSummary {
  implicit val encoderLanguageSummary: Encoder[LanguageSummary] = deriveEncoder[LanguageSummary].mapJson(_.dropNullValues)
  implicit val decoderLanguageSummary: Decoder[LanguageSummary] = deriveDecoder[LanguageSummary]
}

/**
* 
* @param id 
* @param name 
* @param gameUnderscoreindex 
* @param encounterUnderscoremethodUnderscorerates 
* @param location 
* @param names 
* @param pokemonUnderscoreencounters 
*/

case class LocationAreaDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  gameUnderscoreindex: Int,
  encounterUnderscoremethodUnderscorerates: List[LocationAreaDetailEncounterMethodRatesInner],
  location: LocationSummary,
  names: List[LocationAreaName],
  pokemonUnderscoreencounters: List[LocationAreaDetailPokemonEncountersInner]
)
object LocationAreaDetail {
  implicit val encoderLocationAreaDetail: Encoder[LocationAreaDetail] = deriveEncoder[LocationAreaDetail].mapJson(_.dropNullValues)
  implicit val decoderLocationAreaDetail: Decoder[LocationAreaDetail] = deriveDecoder[LocationAreaDetail]
}

/**
* 
* @param encounterUnderscoremethod 
* @param versionUnderscoredetails 
*/

case class LocationAreaDetailEncounterMethodRatesInner(
  encounterUnderscoremethod: LocationAreaDetailEncounterMethodRatesInnerEncounterMethod,
  versionUnderscoredetails: List[LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner]
)
object LocationAreaDetailEncounterMethodRatesInner {
  implicit val encoderLocationAreaDetailEncounterMethodRatesInner: Encoder[LocationAreaDetailEncounterMethodRatesInner] = deriveEncoder[LocationAreaDetailEncounterMethodRatesInner].mapJson(_.dropNullValues)
  implicit val decoderLocationAreaDetailEncounterMethodRatesInner: Decoder[LocationAreaDetailEncounterMethodRatesInner] = deriveDecoder[LocationAreaDetailEncounterMethodRatesInner]
}

/**
* 
* @param name 
* @param url 
*/

case class LocationAreaDetailEncounterMethodRatesInnerEncounterMethod(
  name: String,
  url: URI
)
object LocationAreaDetailEncounterMethodRatesInnerEncounterMethod {
  implicit val encoderLocationAreaDetailEncounterMethodRatesInnerEncounterMethod: Encoder[LocationAreaDetailEncounterMethodRatesInnerEncounterMethod] = deriveEncoder[LocationAreaDetailEncounterMethodRatesInnerEncounterMethod].mapJson(_.dropNullValues)
  implicit val decoderLocationAreaDetailEncounterMethodRatesInnerEncounterMethod: Decoder[LocationAreaDetailEncounterMethodRatesInnerEncounterMethod] = deriveDecoder[LocationAreaDetailEncounterMethodRatesInnerEncounterMethod]
}

/**
* 
* @param rate 
* @param version 
*/

case class LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner(
  rate: Int,
  version: LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerVersion
)
object LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner {
  implicit val encoderLocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner: Encoder[LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner] = deriveEncoder[LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner].mapJson(_.dropNullValues)
  implicit val decoderLocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner: Decoder[LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner] = deriveDecoder[LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner]
}

/**
* 
* @param name 
* @param url 
*/

case class LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerVersion(
  name: String,
  url: URI
)
object LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerVersion {
  implicit val encoderLocationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerVersion: Encoder[LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerVersion] = deriveEncoder[LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerVersion].mapJson(_.dropNullValues)
  implicit val decoderLocationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerVersion: Decoder[LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerVersion] = deriveDecoder[LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInnerVersion]
}

/**
* 
* @param pokemon 
* @param versionUnderscoredetails 
*/

case class LocationAreaDetailPokemonEncountersInner(
  pokemon: LocationAreaDetailPokemonEncountersInnerPokemon,
  versionUnderscoredetails: List[LocationAreaDetailPokemonEncountersInnerVersionDetailsInner]
)
object LocationAreaDetailPokemonEncountersInner {
  implicit val encoderLocationAreaDetailPokemonEncountersInner: Encoder[LocationAreaDetailPokemonEncountersInner] = deriveEncoder[LocationAreaDetailPokemonEncountersInner].mapJson(_.dropNullValues)
  implicit val decoderLocationAreaDetailPokemonEncountersInner: Decoder[LocationAreaDetailPokemonEncountersInner] = deriveDecoder[LocationAreaDetailPokemonEncountersInner]
}

/**
* 
* @param name 
* @param url 
*/

case class LocationAreaDetailPokemonEncountersInnerPokemon(
  name: String,
  url: URI
)
object LocationAreaDetailPokemonEncountersInnerPokemon {
  implicit val encoderLocationAreaDetailPokemonEncountersInnerPokemon: Encoder[LocationAreaDetailPokemonEncountersInnerPokemon] = deriveEncoder[LocationAreaDetailPokemonEncountersInnerPokemon].mapJson(_.dropNullValues)
  implicit val decoderLocationAreaDetailPokemonEncountersInnerPokemon: Decoder[LocationAreaDetailPokemonEncountersInnerPokemon] = deriveDecoder[LocationAreaDetailPokemonEncountersInnerPokemon]
}

/**
* 
* @param version 
* @param maxUnderscorechance 
* @param encounterUnderscoredetails 
*/

case class LocationAreaDetailPokemonEncountersInnerVersionDetailsInner(
  version: LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerVersion,
  maxUnderscorechance: Int,
  encounterUnderscoredetails: LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails
)
object LocationAreaDetailPokemonEncountersInnerVersionDetailsInner {
  implicit val encoderLocationAreaDetailPokemonEncountersInnerVersionDetailsInner: Encoder[LocationAreaDetailPokemonEncountersInnerVersionDetailsInner] = deriveEncoder[LocationAreaDetailPokemonEncountersInnerVersionDetailsInner].mapJson(_.dropNullValues)
  implicit val decoderLocationAreaDetailPokemonEncountersInnerVersionDetailsInner: Decoder[LocationAreaDetailPokemonEncountersInnerVersionDetailsInner] = deriveDecoder[LocationAreaDetailPokemonEncountersInnerVersionDetailsInner]
}

/**
* 
* @param minUnderscorelevel 
* @param maxUnderscorelevel 
* @param conditionUnderscorevalues 
* @param chance 
* @param method 
*/

case class LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails(
  minUnderscorelevel: Int,
  maxUnderscorelevel: Int,
  conditionUnderscorevalues: Option[LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsConditionValues],
  chance: Int,
  method: LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsMethod
)
object LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails {
  implicit val encoderLocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails: Encoder[LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails] = deriveEncoder[LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails].mapJson(_.dropNullValues)
  implicit val decoderLocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails: Decoder[LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails] = deriveDecoder[LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails]
}

/**
* 
* @param name 
* @param url 
*/

case class LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsConditionValues(
  name: String,
  url: URI
)
object LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsConditionValues {
  implicit val encoderLocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsConditionValues: Encoder[LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsConditionValues] = deriveEncoder[LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsConditionValues].mapJson(_.dropNullValues)
  implicit val decoderLocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsConditionValues: Decoder[LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsConditionValues] = deriveDecoder[LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsConditionValues]
}

/**
* 
* @param name 
* @param url 
*/

case class LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsMethod(
  name: String,
  url: URI
)
object LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsMethod {
  implicit val encoderLocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsMethod: Encoder[LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsMethod] = deriveEncoder[LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsMethod].mapJson(_.dropNullValues)
  implicit val decoderLocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsMethod: Decoder[LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsMethod] = deriveDecoder[LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetailsMethod]
}

/**
* 
* @param name 
* @param url 
*/

case class LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerVersion(
  name: String,
  url: URI
)
object LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerVersion {
  implicit val encoderLocationAreaDetailPokemonEncountersInnerVersionDetailsInnerVersion: Encoder[LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerVersion] = deriveEncoder[LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerVersion].mapJson(_.dropNullValues)
  implicit val decoderLocationAreaDetailPokemonEncountersInnerVersionDetailsInnerVersion: Decoder[LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerVersion] = deriveDecoder[LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerVersion]
}

/**
* 
* @param name 
* @param language 
*/

case class LocationAreaName(
  name: Refined[String, MaxSize[100]],
  language: LanguageSummary
)
object LocationAreaName {
  implicit val encoderLocationAreaName: Encoder[LocationAreaName] = deriveEncoder[LocationAreaName].mapJson(_.dropNullValues)
  implicit val decoderLocationAreaName: Decoder[LocationAreaName] = deriveDecoder[LocationAreaName]
}

/**
* 
* @param name 
* @param url 
*/

case class LocationAreaSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object LocationAreaSummary {
  implicit val encoderLocationAreaSummary: Encoder[LocationAreaSummary] = deriveEncoder[LocationAreaSummary].mapJson(_.dropNullValues)
  implicit val decoderLocationAreaSummary: Decoder[LocationAreaSummary] = deriveDecoder[LocationAreaSummary]
}

/**
* 
* @param id 
* @param name 
* @param region 
* @param names 
* @param gameUnderscoreindices 
* @param areas 
*/

case class LocationDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  region: RegionSummary,
  names: List[LocationName],
  gameUnderscoreindices: List[LocationGameIndex],
  areas: List[LocationAreaSummary]
)
object LocationDetail {
  implicit val encoderLocationDetail: Encoder[LocationDetail] = deriveEncoder[LocationDetail].mapJson(_.dropNullValues)
  implicit val decoderLocationDetail: Decoder[LocationDetail] = deriveDecoder[LocationDetail]
}

/**
* 
* @param gameUnderscoreindex 
* @param generation 
*/

case class LocationGameIndex(
  gameUnderscoreindex: Int,
  generation: GenerationSummary
)
object LocationGameIndex {
  implicit val encoderLocationGameIndex: Encoder[LocationGameIndex] = deriveEncoder[LocationGameIndex].mapJson(_.dropNullValues)
  implicit val decoderLocationGameIndex: Decoder[LocationGameIndex] = deriveDecoder[LocationGameIndex]
}

/**
* 
* @param name 
* @param language 
*/

case class LocationName(
  name: Refined[String, MaxSize[100]],
  language: LanguageSummary
)
object LocationName {
  implicit val encoderLocationName: Encoder[LocationName] = deriveEncoder[LocationName].mapJson(_.dropNullValues)
  implicit val decoderLocationName: Decoder[LocationName] = deriveDecoder[LocationName]
}

/**
* 
* @param name 
* @param url 
*/

case class LocationSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object LocationSummary {
  implicit val encoderLocationSummary: Encoder[LocationSummary] = deriveEncoder[LocationSummary].mapJson(_.dropNullValues)
  implicit val decoderLocationSummary: Decoder[LocationSummary] = deriveDecoder[LocationSummary]
}

/**
* 
* @param id 
* @param item 
* @param versionUnderscoregroup 
* @param move 
*/

case class MachineDetail(
  id: Int,
  item: ItemSummary,
  versionUnderscoregroup: VersionGroupSummary,
  move: MoveSummary
)
object MachineDetail {
  implicit val encoderMachineDetail: Encoder[MachineDetail] = deriveEncoder[MachineDetail].mapJson(_.dropNullValues)
  implicit val decoderMachineDetail: Decoder[MachineDetail] = deriveDecoder[MachineDetail]
}

/**
* 
* @param url 
*/

case class MachineSummary(
  url: URI
)
object MachineSummary {
  implicit val encoderMachineSummary: Encoder[MachineSummary] = deriveEncoder[MachineSummary].mapJson(_.dropNullValues)
  implicit val decoderMachineSummary: Decoder[MachineSummary] = deriveDecoder[MachineSummary]
}

/**
* 
* @param id 
* @param name 
* @param names 
*/

case class MoveBattleStyleDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  names: List[MoveBattleStyleName]
)
object MoveBattleStyleDetail {
  implicit val encoderMoveBattleStyleDetail: Encoder[MoveBattleStyleDetail] = deriveEncoder[MoveBattleStyleDetail].mapJson(_.dropNullValues)
  implicit val decoderMoveBattleStyleDetail: Decoder[MoveBattleStyleDetail] = deriveDecoder[MoveBattleStyleDetail]
}

/**
* 
* @param name 
* @param language 
*/

case class MoveBattleStyleName(
  name: Refined[String, MaxSize[100]],
  language: LanguageSummary
)
object MoveBattleStyleName {
  implicit val encoderMoveBattleStyleName: Encoder[MoveBattleStyleName] = deriveEncoder[MoveBattleStyleName].mapJson(_.dropNullValues)
  implicit val decoderMoveBattleStyleName: Decoder[MoveBattleStyleName] = deriveDecoder[MoveBattleStyleName]
}

/**
* 
* @param name 
* @param url 
*/

case class MoveBattleStyleSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object MoveBattleStyleSummary {
  implicit val encoderMoveBattleStyleSummary: Encoder[MoveBattleStyleSummary] = deriveEncoder[MoveBattleStyleSummary].mapJson(_.dropNullValues)
  implicit val decoderMoveBattleStyleSummary: Decoder[MoveBattleStyleSummary] = deriveDecoder[MoveBattleStyleSummary]
}

/**
* 
* @param accuracy 
* @param power 
* @param pp 
* @param effectUnderscorechance 
* @param effectUnderscoreentries 
* @param `type` 
* @param versionUnderscoregroup 
*/

case class MoveChange(
  accuracy: Option[Int],
  power: Option[Int],
  pp: Option[Int],
  effectUnderscorechance: Int,
  effectUnderscoreentries: List[MoveChangeEffectEntriesInner],
  `type`: TypeSummary,
  versionUnderscoregroup: VersionGroupSummary
)
object MoveChange {
  implicit val encoderMoveChange: Encoder[MoveChange] = deriveEncoder[MoveChange].mapJson(_.dropNullValues)
  implicit val decoderMoveChange: Decoder[MoveChange] = deriveDecoder[MoveChange]
}

/**
* 
* @param effect 
* @param shortUnderscoreeffect 
* @param language 
*/

case class MoveChangeEffectEntriesInner(
  effect: String,
  shortUnderscoreeffect: String,
  language: MoveChangeEffectEntriesInnerLanguage
)
object MoveChangeEffectEntriesInner {
  implicit val encoderMoveChangeEffectEntriesInner: Encoder[MoveChangeEffectEntriesInner] = deriveEncoder[MoveChangeEffectEntriesInner].mapJson(_.dropNullValues)
  implicit val decoderMoveChangeEffectEntriesInner: Decoder[MoveChangeEffectEntriesInner] = deriveDecoder[MoveChangeEffectEntriesInner]
}

/**
* 
* @param name 
* @param url 
*/

case class MoveChangeEffectEntriesInnerLanguage(
  name: String,
  url: URI
)
object MoveChangeEffectEntriesInnerLanguage {
  implicit val encoderMoveChangeEffectEntriesInnerLanguage: Encoder[MoveChangeEffectEntriesInnerLanguage] = deriveEncoder[MoveChangeEffectEntriesInnerLanguage].mapJson(_.dropNullValues)
  implicit val decoderMoveChangeEffectEntriesInnerLanguage: Decoder[MoveChangeEffectEntriesInnerLanguage] = deriveDecoder[MoveChangeEffectEntriesInnerLanguage]
}

/**
* 
* @param description 
* @param language 
*/

case class MoveDamageClassDescription(
  description: Option[Refined[String, MaxSize[1000]]],
  language: LanguageSummary
)
object MoveDamageClassDescription {
  implicit val encoderMoveDamageClassDescription: Encoder[MoveDamageClassDescription] = deriveEncoder[MoveDamageClassDescription].mapJson(_.dropNullValues)
  implicit val decoderMoveDamageClassDescription: Decoder[MoveDamageClassDescription] = deriveDecoder[MoveDamageClassDescription]
}

/**
* 
* @param id 
* @param name 
* @param descriptions 
* @param moves 
* @param names 
*/

case class MoveDamageClassDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  descriptions: List[MoveDamageClassDescription],
  moves: List[MoveSummary],
  names: List[MoveDamageClassName]
)
object MoveDamageClassDetail {
  implicit val encoderMoveDamageClassDetail: Encoder[MoveDamageClassDetail] = deriveEncoder[MoveDamageClassDetail].mapJson(_.dropNullValues)
  implicit val decoderMoveDamageClassDetail: Decoder[MoveDamageClassDetail] = deriveDecoder[MoveDamageClassDetail]
}

/**
* 
* @param name 
* @param language 
*/

case class MoveDamageClassName(
  name: Refined[String, MaxSize[100]],
  language: LanguageSummary
)
object MoveDamageClassName {
  implicit val encoderMoveDamageClassName: Encoder[MoveDamageClassName] = deriveEncoder[MoveDamageClassName].mapJson(_.dropNullValues)
  implicit val decoderMoveDamageClassName: Decoder[MoveDamageClassName] = deriveDecoder[MoveDamageClassName]
}

/**
* 
* @param name 
* @param url 
*/

case class MoveDamageClassSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object MoveDamageClassSummary {
  implicit val encoderMoveDamageClassSummary: Encoder[MoveDamageClassSummary] = deriveEncoder[MoveDamageClassSummary].mapJson(_.dropNullValues)
  implicit val decoderMoveDamageClassSummary: Decoder[MoveDamageClassSummary] = deriveDecoder[MoveDamageClassSummary]
}

/**
* 
* @param id 
* @param name 
* @param accuracy 
* @param effectUnderscorechance 
* @param pp 
* @param priority 
* @param power 
* @param contestUnderscorecombos 
* @param contestUnderscoretype 
* @param contestUnderscoreeffect 
* @param damageUnderscoreclass 
* @param effectUnderscoreentries 
* @param effectUnderscorechanges 
* @param generation 
* @param meta 
* @param names 
* @param pastUnderscorevalues 
* @param statUnderscorechanges 
* @param superUnderscorecontestUnderscoreeffect 
* @param target 
* @param `type` 
* @param machines 
* @param flavorUnderscoretextUnderscoreentries 
* @param learnedUnderscorebyUnderscorepokemon 
*/

case class MoveDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  accuracy: Option[Int],
  effectUnderscorechance: Int,
  pp: Option[Int],
  priority: Option[Int],
  power: Option[Int],
  contestUnderscorecombos: MoveDetailContestCombos,
  contestUnderscoretype: ContestTypeSummary,
  contestUnderscoreeffect: ContestEffectSummary,
  damageUnderscoreclass: MoveDamageClassSummary,
  effectUnderscoreentries: List[MoveDetailEffectEntriesInner],
  effectUnderscorechanges: List[MoveDetailEffectChangesInner],
  generation: GenerationSummary,
  meta: MoveMeta,
  names: List[MoveName],
  pastUnderscorevalues: List[MoveChange],
  statUnderscorechanges: List[MoveDetailStatChangesInner],
  superUnderscorecontestUnderscoreeffect: SuperContestEffectSummary,
  target: MoveTargetSummary,
  `type`: TypeSummary,
  machines: List[MoveDetailMachinesInner],
  flavorUnderscoretextUnderscoreentries: List[MoveFlavorText],
  learnedUnderscorebyUnderscorepokemon: List[MoveDetailLearnedByPokemonInner]
)
object MoveDetail {
  implicit val encoderMoveDetail: Encoder[MoveDetail] = deriveEncoder[MoveDetail].mapJson(_.dropNullValues)
  implicit val decoderMoveDetail: Decoder[MoveDetail] = deriveDecoder[MoveDetail]
}

/**
* 
* @param normal 
* @param `super` 
*/

case class MoveDetailContestCombos(
  normal: MoveDetailContestCombosNormal,
  `super`: MoveDetailContestCombosSuper
)
object MoveDetailContestCombos {
  implicit val encoderMoveDetailContestCombos: Encoder[MoveDetailContestCombos] = deriveEncoder[MoveDetailContestCombos].mapJson(_.dropNullValues)
  implicit val decoderMoveDetailContestCombos: Decoder[MoveDetailContestCombos] = deriveDecoder[MoveDetailContestCombos]
}

/**
* 
* @param useUnderscorebefore 
* @param useUnderscoreafter 
*/

case class MoveDetailContestCombosNormal(
  useUnderscorebefore: List[MoveDetailContestCombosNormalUseBeforeInner],
  useUnderscoreafter: List[MoveDetailContestCombosNormalUseAfterInner]
)
object MoveDetailContestCombosNormal {
  implicit val encoderMoveDetailContestCombosNormal: Encoder[MoveDetailContestCombosNormal] = deriveEncoder[MoveDetailContestCombosNormal].mapJson(_.dropNullValues)
  implicit val decoderMoveDetailContestCombosNormal: Decoder[MoveDetailContestCombosNormal] = deriveDecoder[MoveDetailContestCombosNormal]
}

/**
* 
* @param name 
* @param url 
*/

case class MoveDetailContestCombosNormalUseAfterInner(
  name: String,
  url: URI
)
object MoveDetailContestCombosNormalUseAfterInner {
  implicit val encoderMoveDetailContestCombosNormalUseAfterInner: Encoder[MoveDetailContestCombosNormalUseAfterInner] = deriveEncoder[MoveDetailContestCombosNormalUseAfterInner].mapJson(_.dropNullValues)
  implicit val decoderMoveDetailContestCombosNormalUseAfterInner: Decoder[MoveDetailContestCombosNormalUseAfterInner] = deriveDecoder[MoveDetailContestCombosNormalUseAfterInner]
}

/**
* 
* @param name 
* @param url 
*/

case class MoveDetailContestCombosNormalUseBeforeInner(
  name: String,
  url: URI
)
object MoveDetailContestCombosNormalUseBeforeInner {
  implicit val encoderMoveDetailContestCombosNormalUseBeforeInner: Encoder[MoveDetailContestCombosNormalUseBeforeInner] = deriveEncoder[MoveDetailContestCombosNormalUseBeforeInner].mapJson(_.dropNullValues)
  implicit val decoderMoveDetailContestCombosNormalUseBeforeInner: Decoder[MoveDetailContestCombosNormalUseBeforeInner] = deriveDecoder[MoveDetailContestCombosNormalUseBeforeInner]
}

/**
* 
* @param useUnderscorebefore 
* @param useUnderscoreafter 
*/

case class MoveDetailContestCombosSuper(
  useUnderscorebefore: List[MoveDetailContestCombosSuperUseBeforeInner],
  useUnderscoreafter: List[MoveDetailContestCombosSuperUseAfterInner]
)
object MoveDetailContestCombosSuper {
  implicit val encoderMoveDetailContestCombosSuper: Encoder[MoveDetailContestCombosSuper] = deriveEncoder[MoveDetailContestCombosSuper].mapJson(_.dropNullValues)
  implicit val decoderMoveDetailContestCombosSuper: Decoder[MoveDetailContestCombosSuper] = deriveDecoder[MoveDetailContestCombosSuper]
}

/**
* 
* @param name 
* @param url 
*/

case class MoveDetailContestCombosSuperUseAfterInner(
  name: String,
  url: URI
)
object MoveDetailContestCombosSuperUseAfterInner {
  implicit val encoderMoveDetailContestCombosSuperUseAfterInner: Encoder[MoveDetailContestCombosSuperUseAfterInner] = deriveEncoder[MoveDetailContestCombosSuperUseAfterInner].mapJson(_.dropNullValues)
  implicit val decoderMoveDetailContestCombosSuperUseAfterInner: Decoder[MoveDetailContestCombosSuperUseAfterInner] = deriveDecoder[MoveDetailContestCombosSuperUseAfterInner]
}

/**
* 
* @param name 
* @param url 
*/

case class MoveDetailContestCombosSuperUseBeforeInner(
  name: String,
  url: URI
)
object MoveDetailContestCombosSuperUseBeforeInner {
  implicit val encoderMoveDetailContestCombosSuperUseBeforeInner: Encoder[MoveDetailContestCombosSuperUseBeforeInner] = deriveEncoder[MoveDetailContestCombosSuperUseBeforeInner].mapJson(_.dropNullValues)
  implicit val decoderMoveDetailContestCombosSuperUseBeforeInner: Decoder[MoveDetailContestCombosSuperUseBeforeInner] = deriveDecoder[MoveDetailContestCombosSuperUseBeforeInner]
}

/**
* 
* @param effectUnderscoreentries 
* @param versionUnderscoregroup 
*/

case class MoveDetailEffectChangesInner(
  effectUnderscoreentries: List[MoveDetailEffectChangesInnerEffectEntriesInner],
  versionUnderscoregroup: MoveDetailEffectChangesInnerVersionGroup
)
object MoveDetailEffectChangesInner {
  implicit val encoderMoveDetailEffectChangesInner: Encoder[MoveDetailEffectChangesInner] = deriveEncoder[MoveDetailEffectChangesInner].mapJson(_.dropNullValues)
  implicit val decoderMoveDetailEffectChangesInner: Decoder[MoveDetailEffectChangesInner] = deriveDecoder[MoveDetailEffectChangesInner]
}

/**
* 
* @param effect 
* @param language 
*/

case class MoveDetailEffectChangesInnerEffectEntriesInner(
  effect: String,
  language: MoveDetailEffectChangesInnerEffectEntriesInnerLanguage
)
object MoveDetailEffectChangesInnerEffectEntriesInner {
  implicit val encoderMoveDetailEffectChangesInnerEffectEntriesInner: Encoder[MoveDetailEffectChangesInnerEffectEntriesInner] = deriveEncoder[MoveDetailEffectChangesInnerEffectEntriesInner].mapJson(_.dropNullValues)
  implicit val decoderMoveDetailEffectChangesInnerEffectEntriesInner: Decoder[MoveDetailEffectChangesInnerEffectEntriesInner] = deriveDecoder[MoveDetailEffectChangesInnerEffectEntriesInner]
}

/**
* 
* @param name 
* @param url 
*/

case class MoveDetailEffectChangesInnerEffectEntriesInnerLanguage(
  name: String,
  url: URI
)
object MoveDetailEffectChangesInnerEffectEntriesInnerLanguage {
  implicit val encoderMoveDetailEffectChangesInnerEffectEntriesInnerLanguage: Encoder[MoveDetailEffectChangesInnerEffectEntriesInnerLanguage] = deriveEncoder[MoveDetailEffectChangesInnerEffectEntriesInnerLanguage].mapJson(_.dropNullValues)
  implicit val decoderMoveDetailEffectChangesInnerEffectEntriesInnerLanguage: Decoder[MoveDetailEffectChangesInnerEffectEntriesInnerLanguage] = deriveDecoder[MoveDetailEffectChangesInnerEffectEntriesInnerLanguage]
}

/**
* 
* @param name 
* @param url 
*/

case class MoveDetailEffectChangesInnerVersionGroup(
  name: String,
  url: URI
)
object MoveDetailEffectChangesInnerVersionGroup {
  implicit val encoderMoveDetailEffectChangesInnerVersionGroup: Encoder[MoveDetailEffectChangesInnerVersionGroup] = deriveEncoder[MoveDetailEffectChangesInnerVersionGroup].mapJson(_.dropNullValues)
  implicit val decoderMoveDetailEffectChangesInnerVersionGroup: Decoder[MoveDetailEffectChangesInnerVersionGroup] = deriveDecoder[MoveDetailEffectChangesInnerVersionGroup]
}

/**
* 
* @param effect 
* @param shortUnderscoreeffect 
* @param language 
*/

case class MoveDetailEffectEntriesInner(
  effect: String,
  shortUnderscoreeffect: String,
  language: MoveDetailEffectEntriesInnerLanguage
)
object MoveDetailEffectEntriesInner {
  implicit val encoderMoveDetailEffectEntriesInner: Encoder[MoveDetailEffectEntriesInner] = deriveEncoder[MoveDetailEffectEntriesInner].mapJson(_.dropNullValues)
  implicit val decoderMoveDetailEffectEntriesInner: Decoder[MoveDetailEffectEntriesInner] = deriveDecoder[MoveDetailEffectEntriesInner]
}

/**
* 
* @param name 
* @param url 
*/

case class MoveDetailEffectEntriesInnerLanguage(
  name: String,
  url: URI
)
object MoveDetailEffectEntriesInnerLanguage {
  implicit val encoderMoveDetailEffectEntriesInnerLanguage: Encoder[MoveDetailEffectEntriesInnerLanguage] = deriveEncoder[MoveDetailEffectEntriesInnerLanguage].mapJson(_.dropNullValues)
  implicit val decoderMoveDetailEffectEntriesInnerLanguage: Decoder[MoveDetailEffectEntriesInnerLanguage] = deriveDecoder[MoveDetailEffectEntriesInnerLanguage]
}

/**
* 
* @param name 
* @param url 
*/

case class MoveDetailLearnedByPokemonInner(
  name: String,
  url: URI
)
object MoveDetailLearnedByPokemonInner {
  implicit val encoderMoveDetailLearnedByPokemonInner: Encoder[MoveDetailLearnedByPokemonInner] = deriveEncoder[MoveDetailLearnedByPokemonInner].mapJson(_.dropNullValues)
  implicit val decoderMoveDetailLearnedByPokemonInner: Decoder[MoveDetailLearnedByPokemonInner] = deriveDecoder[MoveDetailLearnedByPokemonInner]
}

/**
* 
* @param machine 
* @param versionUnderscoregroup 
*/

case class MoveDetailMachinesInner(
  machine: MoveDetailMachinesInnerMachine,
  versionUnderscoregroup: MoveDetailMachinesInnerVersionGroup
)
object MoveDetailMachinesInner {
  implicit val encoderMoveDetailMachinesInner: Encoder[MoveDetailMachinesInner] = deriveEncoder[MoveDetailMachinesInner].mapJson(_.dropNullValues)
  implicit val decoderMoveDetailMachinesInner: Decoder[MoveDetailMachinesInner] = deriveDecoder[MoveDetailMachinesInner]
}

/**
* 
* @param url 
*/

case class MoveDetailMachinesInnerMachine(
  url: URI
)
object MoveDetailMachinesInnerMachine {
  implicit val encoderMoveDetailMachinesInnerMachine: Encoder[MoveDetailMachinesInnerMachine] = deriveEncoder[MoveDetailMachinesInnerMachine].mapJson(_.dropNullValues)
  implicit val decoderMoveDetailMachinesInnerMachine: Decoder[MoveDetailMachinesInnerMachine] = deriveDecoder[MoveDetailMachinesInnerMachine]
}

/**
* 
* @param name 
* @param url 
*/

case class MoveDetailMachinesInnerVersionGroup(
  name: String,
  url: URI
)
object MoveDetailMachinesInnerVersionGroup {
  implicit val encoderMoveDetailMachinesInnerVersionGroup: Encoder[MoveDetailMachinesInnerVersionGroup] = deriveEncoder[MoveDetailMachinesInnerVersionGroup].mapJson(_.dropNullValues)
  implicit val decoderMoveDetailMachinesInnerVersionGroup: Decoder[MoveDetailMachinesInnerVersionGroup] = deriveDecoder[MoveDetailMachinesInnerVersionGroup]
}

/**
* 
* @param change 
* @param stat 
*/

case class MoveDetailStatChangesInner(
  change: Int,
  stat: MoveDetailStatChangesInnerStat
)
object MoveDetailStatChangesInner {
  implicit val encoderMoveDetailStatChangesInner: Encoder[MoveDetailStatChangesInner] = deriveEncoder[MoveDetailStatChangesInner].mapJson(_.dropNullValues)
  implicit val decoderMoveDetailStatChangesInner: Decoder[MoveDetailStatChangesInner] = deriveDecoder[MoveDetailStatChangesInner]
}

/**
* 
* @param name 
* @param url 
*/

case class MoveDetailStatChangesInnerStat(
  name: String,
  url: URI
)
object MoveDetailStatChangesInnerStat {
  implicit val encoderMoveDetailStatChangesInnerStat: Encoder[MoveDetailStatChangesInnerStat] = deriveEncoder[MoveDetailStatChangesInnerStat].mapJson(_.dropNullValues)
  implicit val decoderMoveDetailStatChangesInnerStat: Decoder[MoveDetailStatChangesInnerStat] = deriveDecoder[MoveDetailStatChangesInnerStat]
}

/**
* 
* @param flavorUnderscoretext 
* @param language 
* @param versionUnderscoregroup 
*/

case class MoveFlavorText(
  flavorUnderscoretext: String,
  language: LanguageSummary,
  versionUnderscoregroup: VersionGroupSummary
)
object MoveFlavorText {
  implicit val encoderMoveFlavorText: Encoder[MoveFlavorText] = deriveEncoder[MoveFlavorText].mapJson(_.dropNullValues)
  implicit val decoderMoveFlavorText: Decoder[MoveFlavorText] = deriveDecoder[MoveFlavorText]
}

/**
* 
* @param description 
* @param language 
*/

case class MoveLearnMethodDescription(
  description: Option[Refined[String, MaxSize[1000]]],
  language: LanguageSummary
)
object MoveLearnMethodDescription {
  implicit val encoderMoveLearnMethodDescription: Encoder[MoveLearnMethodDescription] = deriveEncoder[MoveLearnMethodDescription].mapJson(_.dropNullValues)
  implicit val decoderMoveLearnMethodDescription: Decoder[MoveLearnMethodDescription] = deriveDecoder[MoveLearnMethodDescription]
}

/**
* 
* @param id 
* @param name 
* @param names 
* @param descriptions 
* @param versionUnderscoregroups 
*/

case class MoveLearnMethodDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  names: List[MoveLearnMethodName],
  descriptions: List[MoveLearnMethodDescription],
  versionUnderscoregroups: List[MoveLearnMethodDetailVersionGroupsInner]
)
object MoveLearnMethodDetail {
  implicit val encoderMoveLearnMethodDetail: Encoder[MoveLearnMethodDetail] = deriveEncoder[MoveLearnMethodDetail].mapJson(_.dropNullValues)
  implicit val decoderMoveLearnMethodDetail: Decoder[MoveLearnMethodDetail] = deriveDecoder[MoveLearnMethodDetail]
}

/**
* 
* @param name 
* @param url 
*/

case class MoveLearnMethodDetailVersionGroupsInner(
  name: String,
  url: URI
)
object MoveLearnMethodDetailVersionGroupsInner {
  implicit val encoderMoveLearnMethodDetailVersionGroupsInner: Encoder[MoveLearnMethodDetailVersionGroupsInner] = deriveEncoder[MoveLearnMethodDetailVersionGroupsInner].mapJson(_.dropNullValues)
  implicit val decoderMoveLearnMethodDetailVersionGroupsInner: Decoder[MoveLearnMethodDetailVersionGroupsInner] = deriveDecoder[MoveLearnMethodDetailVersionGroupsInner]
}

/**
* 
* @param name 
* @param language 
*/

case class MoveLearnMethodName(
  name: Refined[String, MaxSize[100]],
  language: LanguageSummary
)
object MoveLearnMethodName {
  implicit val encoderMoveLearnMethodName: Encoder[MoveLearnMethodName] = deriveEncoder[MoveLearnMethodName].mapJson(_.dropNullValues)
  implicit val decoderMoveLearnMethodName: Decoder[MoveLearnMethodName] = deriveDecoder[MoveLearnMethodName]
}

/**
* 
* @param name 
* @param url 
*/

case class MoveLearnMethodSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object MoveLearnMethodSummary {
  implicit val encoderMoveLearnMethodSummary: Encoder[MoveLearnMethodSummary] = deriveEncoder[MoveLearnMethodSummary].mapJson(_.dropNullValues)
  implicit val decoderMoveLearnMethodSummary: Decoder[MoveLearnMethodSummary] = deriveDecoder[MoveLearnMethodSummary]
}

/**
* 
* @param ailment 
* @param category 
* @param minUnderscorehits 
* @param maxUnderscorehits 
* @param minUnderscoreturns 
* @param maxUnderscoreturns 
* @param drain 
* @param healing 
* @param critUnderscorerate 
* @param ailmentUnderscorechance 
* @param flinchUnderscorechance 
* @param statUnderscorechance 
*/

case class MoveMeta(
  ailment: MoveMetaAilmentSummary,
  category: MoveMetaCategorySummary,
  minUnderscorehits: Option[Int],
  maxUnderscorehits: Option[Int],
  minUnderscoreturns: Option[Int],
  maxUnderscoreturns: Option[Int],
  drain: Option[Int],
  healing: Option[Int],
  critUnderscorerate: Option[Int],
  ailmentUnderscorechance: Option[Int],
  flinchUnderscorechance: Option[Int],
  statUnderscorechance: Option[Int]
)
object MoveMeta {
  implicit val encoderMoveMeta: Encoder[MoveMeta] = deriveEncoder[MoveMeta].mapJson(_.dropNullValues)
  implicit val decoderMoveMeta: Decoder[MoveMeta] = deriveDecoder[MoveMeta]
}

/**
* 
* @param id 
* @param name 
* @param moves 
* @param names 
*/

case class MoveMetaAilmentDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  moves: List[MoveMetaAilmentDetailMovesInner],
  names: List[MoveMetaAilmentName]
)
object MoveMetaAilmentDetail {
  implicit val encoderMoveMetaAilmentDetail: Encoder[MoveMetaAilmentDetail] = deriveEncoder[MoveMetaAilmentDetail].mapJson(_.dropNullValues)
  implicit val decoderMoveMetaAilmentDetail: Decoder[MoveMetaAilmentDetail] = deriveDecoder[MoveMetaAilmentDetail]
}

/**
* 
* @param name 
* @param url 
*/

case class MoveMetaAilmentDetailMovesInner(
  name: String,
  url: URI
)
object MoveMetaAilmentDetailMovesInner {
  implicit val encoderMoveMetaAilmentDetailMovesInner: Encoder[MoveMetaAilmentDetailMovesInner] = deriveEncoder[MoveMetaAilmentDetailMovesInner].mapJson(_.dropNullValues)
  implicit val decoderMoveMetaAilmentDetailMovesInner: Decoder[MoveMetaAilmentDetailMovesInner] = deriveDecoder[MoveMetaAilmentDetailMovesInner]
}

/**
* 
* @param name 
* @param language 
*/

case class MoveMetaAilmentName(
  name: Refined[String, MaxSize[100]],
  language: LanguageSummary
)
object MoveMetaAilmentName {
  implicit val encoderMoveMetaAilmentName: Encoder[MoveMetaAilmentName] = deriveEncoder[MoveMetaAilmentName].mapJson(_.dropNullValues)
  implicit val decoderMoveMetaAilmentName: Decoder[MoveMetaAilmentName] = deriveDecoder[MoveMetaAilmentName]
}

/**
* 
* @param name 
* @param url 
*/

case class MoveMetaAilmentSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object MoveMetaAilmentSummary {
  implicit val encoderMoveMetaAilmentSummary: Encoder[MoveMetaAilmentSummary] = deriveEncoder[MoveMetaAilmentSummary].mapJson(_.dropNullValues)
  implicit val decoderMoveMetaAilmentSummary: Decoder[MoveMetaAilmentSummary] = deriveDecoder[MoveMetaAilmentSummary]
}

/**
* 
* @param description 
* @param language 
*/

case class MoveMetaCategoryDescription(
  description: Option[Refined[String, MaxSize[1000]]],
  language: LanguageSummary
)
object MoveMetaCategoryDescription {
  implicit val encoderMoveMetaCategoryDescription: Encoder[MoveMetaCategoryDescription] = deriveEncoder[MoveMetaCategoryDescription].mapJson(_.dropNullValues)
  implicit val decoderMoveMetaCategoryDescription: Decoder[MoveMetaCategoryDescription] = deriveDecoder[MoveMetaCategoryDescription]
}

/**
* 
* @param id 
* @param name 
* @param descriptions 
* @param moves 
*/

case class MoveMetaCategoryDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  descriptions: List[MoveMetaCategoryDescription],
  moves: List[MoveMetaCategoryDetailMovesInner]
)
object MoveMetaCategoryDetail {
  implicit val encoderMoveMetaCategoryDetail: Encoder[MoveMetaCategoryDetail] = deriveEncoder[MoveMetaCategoryDetail].mapJson(_.dropNullValues)
  implicit val decoderMoveMetaCategoryDetail: Decoder[MoveMetaCategoryDetail] = deriveDecoder[MoveMetaCategoryDetail]
}

/**
* 
* @param name 
* @param url 
*/

case class MoveMetaCategoryDetailMovesInner(
  name: String,
  url: URI
)
object MoveMetaCategoryDetailMovesInner {
  implicit val encoderMoveMetaCategoryDetailMovesInner: Encoder[MoveMetaCategoryDetailMovesInner] = deriveEncoder[MoveMetaCategoryDetailMovesInner].mapJson(_.dropNullValues)
  implicit val decoderMoveMetaCategoryDetailMovesInner: Decoder[MoveMetaCategoryDetailMovesInner] = deriveDecoder[MoveMetaCategoryDetailMovesInner]
}

/**
* 
* @param name 
* @param url 
*/

case class MoveMetaCategorySummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object MoveMetaCategorySummary {
  implicit val encoderMoveMetaCategorySummary: Encoder[MoveMetaCategorySummary] = deriveEncoder[MoveMetaCategorySummary].mapJson(_.dropNullValues)
  implicit val decoderMoveMetaCategorySummary: Decoder[MoveMetaCategorySummary] = deriveDecoder[MoveMetaCategorySummary]
}

/**
* 
* @param name 
* @param language 
*/

case class MoveName(
  name: Refined[String, MaxSize[100]],
  language: LanguageSummary
)
object MoveName {
  implicit val encoderMoveName: Encoder[MoveName] = deriveEncoder[MoveName].mapJson(_.dropNullValues)
  implicit val decoderMoveName: Decoder[MoveName] = deriveDecoder[MoveName]
}

/**
* 
* @param name 
* @param url 
*/

case class MoveSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object MoveSummary {
  implicit val encoderMoveSummary: Encoder[MoveSummary] = deriveEncoder[MoveSummary].mapJson(_.dropNullValues)
  implicit val decoderMoveSummary: Decoder[MoveSummary] = deriveDecoder[MoveSummary]
}

/**
* 
* @param description 
* @param language 
*/

case class MoveTargetDescription(
  description: Option[Refined[String, MaxSize[1000]]],
  language: LanguageSummary
)
object MoveTargetDescription {
  implicit val encoderMoveTargetDescription: Encoder[MoveTargetDescription] = deriveEncoder[MoveTargetDescription].mapJson(_.dropNullValues)
  implicit val decoderMoveTargetDescription: Decoder[MoveTargetDescription] = deriveDecoder[MoveTargetDescription]
}

/**
* 
* @param id 
* @param name 
* @param descriptions 
* @param moves 
* @param names 
*/

case class MoveTargetDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  descriptions: List[MoveTargetDescription],
  moves: List[MoveSummary],
  names: List[MoveTargetName]
)
object MoveTargetDetail {
  implicit val encoderMoveTargetDetail: Encoder[MoveTargetDetail] = deriveEncoder[MoveTargetDetail].mapJson(_.dropNullValues)
  implicit val decoderMoveTargetDetail: Decoder[MoveTargetDetail] = deriveDecoder[MoveTargetDetail]
}

/**
* 
* @param name 
* @param language 
*/

case class MoveTargetName(
  name: Refined[String, MaxSize[100]],
  language: LanguageSummary
)
object MoveTargetName {
  implicit val encoderMoveTargetName: Encoder[MoveTargetName] = deriveEncoder[MoveTargetName].mapJson(_.dropNullValues)
  implicit val decoderMoveTargetName: Decoder[MoveTargetName] = deriveDecoder[MoveTargetName]
}

/**
* 
* @param name 
* @param url 
*/

case class MoveTargetSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object MoveTargetSummary {
  implicit val encoderMoveTargetSummary: Encoder[MoveTargetSummary] = deriveEncoder[MoveTargetSummary].mapJson(_.dropNullValues)
  implicit val decoderMoveTargetSummary: Decoder[MoveTargetSummary] = deriveDecoder[MoveTargetSummary]
}

/**
* 
* @param lowUnderscorehpUnderscorepreference 
* @param highUnderscorehpUnderscorepreference 
* @param moveUnderscorebattleUnderscorestyle 
*/

case class NatureBattleStylePreference(
  lowUnderscorehpUnderscorepreference: Int,
  highUnderscorehpUnderscorepreference: Int,
  moveUnderscorebattleUnderscorestyle: MoveBattleStyleSummary
)
object NatureBattleStylePreference {
  implicit val encoderNatureBattleStylePreference: Encoder[NatureBattleStylePreference] = deriveEncoder[NatureBattleStylePreference].mapJson(_.dropNullValues)
  implicit val decoderNatureBattleStylePreference: Decoder[NatureBattleStylePreference] = deriveDecoder[NatureBattleStylePreference]
}

/**
* 
* @param id 
* @param name 
* @param decreasedUnderscorestat 
* @param increasedUnderscorestat 
* @param likesUnderscoreflavor 
* @param hatesUnderscoreflavor 
* @param berries 
* @param pokeathlonUnderscorestatUnderscorechanges 
* @param moveUnderscorebattleUnderscorestyleUnderscorepreferences 
* @param names 
*/

case class NatureDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  decreasedUnderscorestat: StatSummary,
  increasedUnderscorestat: StatSummary,
  likesUnderscoreflavor: BerryFlavorSummary,
  hatesUnderscoreflavor: BerryFlavorSummary,
  berries: List[BerrySummary],
  pokeathlonUnderscorestatUnderscorechanges: List[NatureDetailPokeathlonStatChangesInner],
  moveUnderscorebattleUnderscorestyleUnderscorepreferences: List[NatureBattleStylePreference],
  names: List[NatureName]
)
object NatureDetail {
  implicit val encoderNatureDetail: Encoder[NatureDetail] = deriveEncoder[NatureDetail].mapJson(_.dropNullValues)
  implicit val decoderNatureDetail: Decoder[NatureDetail] = deriveDecoder[NatureDetail]
}

/**
* 
* @param maxUnderscorechange 
* @param pokeathlonUnderscorestat 
*/

case class NatureDetailPokeathlonStatChangesInner(
  maxUnderscorechange: Int,
  pokeathlonUnderscorestat: NatureDetailPokeathlonStatChangesInnerPokeathlonStat
)
object NatureDetailPokeathlonStatChangesInner {
  implicit val encoderNatureDetailPokeathlonStatChangesInner: Encoder[NatureDetailPokeathlonStatChangesInner] = deriveEncoder[NatureDetailPokeathlonStatChangesInner].mapJson(_.dropNullValues)
  implicit val decoderNatureDetailPokeathlonStatChangesInner: Decoder[NatureDetailPokeathlonStatChangesInner] = deriveDecoder[NatureDetailPokeathlonStatChangesInner]
}

/**
* 
* @param name 
* @param url 
*/

case class NatureDetailPokeathlonStatChangesInnerPokeathlonStat(
  name: String,
  url: URI
)
object NatureDetailPokeathlonStatChangesInnerPokeathlonStat {
  implicit val encoderNatureDetailPokeathlonStatChangesInnerPokeathlonStat: Encoder[NatureDetailPokeathlonStatChangesInnerPokeathlonStat] = deriveEncoder[NatureDetailPokeathlonStatChangesInnerPokeathlonStat].mapJson(_.dropNullValues)
  implicit val decoderNatureDetailPokeathlonStatChangesInnerPokeathlonStat: Decoder[NatureDetailPokeathlonStatChangesInnerPokeathlonStat] = deriveDecoder[NatureDetailPokeathlonStatChangesInnerPokeathlonStat]
}

/**
* 
* @param name 
* @param language 
*/

case class NatureName(
  name: Refined[String, MaxSize[100]],
  language: LanguageSummary
)
object NatureName {
  implicit val encoderNatureName: Encoder[NatureName] = deriveEncoder[NatureName].mapJson(_.dropNullValues)
  implicit val decoderNatureName: Decoder[NatureName] = deriveDecoder[NatureName]
}

/**
* 
* @param name 
* @param url 
*/

case class NatureSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object NatureSummary {
  implicit val encoderNatureSummary: Encoder[NatureSummary] = deriveEncoder[NatureSummary].mapJson(_.dropNullValues)
  implicit val decoderNatureSummary: Decoder[NatureSummary] = deriveDecoder[NatureSummary]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedAbilitySummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[AbilitySummary]]
)
object PaginatedAbilitySummaryList {
  implicit val encoderPaginatedAbilitySummaryList: Encoder[PaginatedAbilitySummaryList] = deriveEncoder[PaginatedAbilitySummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedAbilitySummaryList: Decoder[PaginatedAbilitySummaryList] = deriveDecoder[PaginatedAbilitySummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedBerryFirmnessSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[BerryFirmnessSummary]]
)
object PaginatedBerryFirmnessSummaryList {
  implicit val encoderPaginatedBerryFirmnessSummaryList: Encoder[PaginatedBerryFirmnessSummaryList] = deriveEncoder[PaginatedBerryFirmnessSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedBerryFirmnessSummaryList: Decoder[PaginatedBerryFirmnessSummaryList] = deriveDecoder[PaginatedBerryFirmnessSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedBerryFlavorSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[BerryFlavorSummary]]
)
object PaginatedBerryFlavorSummaryList {
  implicit val encoderPaginatedBerryFlavorSummaryList: Encoder[PaginatedBerryFlavorSummaryList] = deriveEncoder[PaginatedBerryFlavorSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedBerryFlavorSummaryList: Decoder[PaginatedBerryFlavorSummaryList] = deriveDecoder[PaginatedBerryFlavorSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedBerrySummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[BerrySummary]]
)
object PaginatedBerrySummaryList {
  implicit val encoderPaginatedBerrySummaryList: Encoder[PaginatedBerrySummaryList] = deriveEncoder[PaginatedBerrySummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedBerrySummaryList: Decoder[PaginatedBerrySummaryList] = deriveDecoder[PaginatedBerrySummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedCharacteristicSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[CharacteristicSummary]]
)
object PaginatedCharacteristicSummaryList {
  implicit val encoderPaginatedCharacteristicSummaryList: Encoder[PaginatedCharacteristicSummaryList] = deriveEncoder[PaginatedCharacteristicSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedCharacteristicSummaryList: Decoder[PaginatedCharacteristicSummaryList] = deriveDecoder[PaginatedCharacteristicSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedContestEffectSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[ContestEffectSummary]]
)
object PaginatedContestEffectSummaryList {
  implicit val encoderPaginatedContestEffectSummaryList: Encoder[PaginatedContestEffectSummaryList] = deriveEncoder[PaginatedContestEffectSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedContestEffectSummaryList: Decoder[PaginatedContestEffectSummaryList] = deriveDecoder[PaginatedContestEffectSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedContestTypeSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[ContestTypeSummary]]
)
object PaginatedContestTypeSummaryList {
  implicit val encoderPaginatedContestTypeSummaryList: Encoder[PaginatedContestTypeSummaryList] = deriveEncoder[PaginatedContestTypeSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedContestTypeSummaryList: Decoder[PaginatedContestTypeSummaryList] = deriveDecoder[PaginatedContestTypeSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedEggGroupSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[EggGroupSummary]]
)
object PaginatedEggGroupSummaryList {
  implicit val encoderPaginatedEggGroupSummaryList: Encoder[PaginatedEggGroupSummaryList] = deriveEncoder[PaginatedEggGroupSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedEggGroupSummaryList: Decoder[PaginatedEggGroupSummaryList] = deriveDecoder[PaginatedEggGroupSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedEncounterConditionSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[EncounterConditionSummary]]
)
object PaginatedEncounterConditionSummaryList {
  implicit val encoderPaginatedEncounterConditionSummaryList: Encoder[PaginatedEncounterConditionSummaryList] = deriveEncoder[PaginatedEncounterConditionSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedEncounterConditionSummaryList: Decoder[PaginatedEncounterConditionSummaryList] = deriveDecoder[PaginatedEncounterConditionSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedEncounterConditionValueSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[EncounterConditionValueSummary]]
)
object PaginatedEncounterConditionValueSummaryList {
  implicit val encoderPaginatedEncounterConditionValueSummaryList: Encoder[PaginatedEncounterConditionValueSummaryList] = deriveEncoder[PaginatedEncounterConditionValueSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedEncounterConditionValueSummaryList: Decoder[PaginatedEncounterConditionValueSummaryList] = deriveDecoder[PaginatedEncounterConditionValueSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedEncounterMethodSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[EncounterMethodSummary]]
)
object PaginatedEncounterMethodSummaryList {
  implicit val encoderPaginatedEncounterMethodSummaryList: Encoder[PaginatedEncounterMethodSummaryList] = deriveEncoder[PaginatedEncounterMethodSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedEncounterMethodSummaryList: Decoder[PaginatedEncounterMethodSummaryList] = deriveDecoder[PaginatedEncounterMethodSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedEvolutionChainSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[EvolutionChainSummary]]
)
object PaginatedEvolutionChainSummaryList {
  implicit val encoderPaginatedEvolutionChainSummaryList: Encoder[PaginatedEvolutionChainSummaryList] = deriveEncoder[PaginatedEvolutionChainSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedEvolutionChainSummaryList: Decoder[PaginatedEvolutionChainSummaryList] = deriveDecoder[PaginatedEvolutionChainSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedEvolutionTriggerSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[EvolutionTriggerSummary]]
)
object PaginatedEvolutionTriggerSummaryList {
  implicit val encoderPaginatedEvolutionTriggerSummaryList: Encoder[PaginatedEvolutionTriggerSummaryList] = deriveEncoder[PaginatedEvolutionTriggerSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedEvolutionTriggerSummaryList: Decoder[PaginatedEvolutionTriggerSummaryList] = deriveDecoder[PaginatedEvolutionTriggerSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedGenderSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[GenderSummary]]
)
object PaginatedGenderSummaryList {
  implicit val encoderPaginatedGenderSummaryList: Encoder[PaginatedGenderSummaryList] = deriveEncoder[PaginatedGenderSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedGenderSummaryList: Decoder[PaginatedGenderSummaryList] = deriveDecoder[PaginatedGenderSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedGenerationSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[GenerationSummary]]
)
object PaginatedGenerationSummaryList {
  implicit val encoderPaginatedGenerationSummaryList: Encoder[PaginatedGenerationSummaryList] = deriveEncoder[PaginatedGenerationSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedGenerationSummaryList: Decoder[PaginatedGenerationSummaryList] = deriveDecoder[PaginatedGenerationSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedGrowthRateSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[GrowthRateSummary]]
)
object PaginatedGrowthRateSummaryList {
  implicit val encoderPaginatedGrowthRateSummaryList: Encoder[PaginatedGrowthRateSummaryList] = deriveEncoder[PaginatedGrowthRateSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedGrowthRateSummaryList: Decoder[PaginatedGrowthRateSummaryList] = deriveDecoder[PaginatedGrowthRateSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedItemAttributeSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[ItemAttributeSummary]]
)
object PaginatedItemAttributeSummaryList {
  implicit val encoderPaginatedItemAttributeSummaryList: Encoder[PaginatedItemAttributeSummaryList] = deriveEncoder[PaginatedItemAttributeSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedItemAttributeSummaryList: Decoder[PaginatedItemAttributeSummaryList] = deriveDecoder[PaginatedItemAttributeSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedItemCategorySummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[ItemCategorySummary]]
)
object PaginatedItemCategorySummaryList {
  implicit val encoderPaginatedItemCategorySummaryList: Encoder[PaginatedItemCategorySummaryList] = deriveEncoder[PaginatedItemCategorySummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedItemCategorySummaryList: Decoder[PaginatedItemCategorySummaryList] = deriveDecoder[PaginatedItemCategorySummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedItemFlingEffectSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[ItemFlingEffectSummary]]
)
object PaginatedItemFlingEffectSummaryList {
  implicit val encoderPaginatedItemFlingEffectSummaryList: Encoder[PaginatedItemFlingEffectSummaryList] = deriveEncoder[PaginatedItemFlingEffectSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedItemFlingEffectSummaryList: Decoder[PaginatedItemFlingEffectSummaryList] = deriveDecoder[PaginatedItemFlingEffectSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedItemPocketSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[ItemPocketSummary]]
)
object PaginatedItemPocketSummaryList {
  implicit val encoderPaginatedItemPocketSummaryList: Encoder[PaginatedItemPocketSummaryList] = deriveEncoder[PaginatedItemPocketSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedItemPocketSummaryList: Decoder[PaginatedItemPocketSummaryList] = deriveDecoder[PaginatedItemPocketSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedItemSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[ItemSummary]]
)
object PaginatedItemSummaryList {
  implicit val encoderPaginatedItemSummaryList: Encoder[PaginatedItemSummaryList] = deriveEncoder[PaginatedItemSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedItemSummaryList: Decoder[PaginatedItemSummaryList] = deriveDecoder[PaginatedItemSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedLanguageSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[LanguageSummary]]
)
object PaginatedLanguageSummaryList {
  implicit val encoderPaginatedLanguageSummaryList: Encoder[PaginatedLanguageSummaryList] = deriveEncoder[PaginatedLanguageSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedLanguageSummaryList: Decoder[PaginatedLanguageSummaryList] = deriveDecoder[PaginatedLanguageSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedLocationAreaSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[LocationAreaSummary]]
)
object PaginatedLocationAreaSummaryList {
  implicit val encoderPaginatedLocationAreaSummaryList: Encoder[PaginatedLocationAreaSummaryList] = deriveEncoder[PaginatedLocationAreaSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedLocationAreaSummaryList: Decoder[PaginatedLocationAreaSummaryList] = deriveDecoder[PaginatedLocationAreaSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedLocationSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[LocationSummary]]
)
object PaginatedLocationSummaryList {
  implicit val encoderPaginatedLocationSummaryList: Encoder[PaginatedLocationSummaryList] = deriveEncoder[PaginatedLocationSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedLocationSummaryList: Decoder[PaginatedLocationSummaryList] = deriveDecoder[PaginatedLocationSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedMachineSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[MachineSummary]]
)
object PaginatedMachineSummaryList {
  implicit val encoderPaginatedMachineSummaryList: Encoder[PaginatedMachineSummaryList] = deriveEncoder[PaginatedMachineSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedMachineSummaryList: Decoder[PaginatedMachineSummaryList] = deriveDecoder[PaginatedMachineSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedMoveBattleStyleSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[MoveBattleStyleSummary]]
)
object PaginatedMoveBattleStyleSummaryList {
  implicit val encoderPaginatedMoveBattleStyleSummaryList: Encoder[PaginatedMoveBattleStyleSummaryList] = deriveEncoder[PaginatedMoveBattleStyleSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedMoveBattleStyleSummaryList: Decoder[PaginatedMoveBattleStyleSummaryList] = deriveDecoder[PaginatedMoveBattleStyleSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedMoveDamageClassSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[MoveDamageClassSummary]]
)
object PaginatedMoveDamageClassSummaryList {
  implicit val encoderPaginatedMoveDamageClassSummaryList: Encoder[PaginatedMoveDamageClassSummaryList] = deriveEncoder[PaginatedMoveDamageClassSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedMoveDamageClassSummaryList: Decoder[PaginatedMoveDamageClassSummaryList] = deriveDecoder[PaginatedMoveDamageClassSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedMoveLearnMethodSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[MoveLearnMethodSummary]]
)
object PaginatedMoveLearnMethodSummaryList {
  implicit val encoderPaginatedMoveLearnMethodSummaryList: Encoder[PaginatedMoveLearnMethodSummaryList] = deriveEncoder[PaginatedMoveLearnMethodSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedMoveLearnMethodSummaryList: Decoder[PaginatedMoveLearnMethodSummaryList] = deriveDecoder[PaginatedMoveLearnMethodSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedMoveMetaAilmentSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[MoveMetaAilmentSummary]]
)
object PaginatedMoveMetaAilmentSummaryList {
  implicit val encoderPaginatedMoveMetaAilmentSummaryList: Encoder[PaginatedMoveMetaAilmentSummaryList] = deriveEncoder[PaginatedMoveMetaAilmentSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedMoveMetaAilmentSummaryList: Decoder[PaginatedMoveMetaAilmentSummaryList] = deriveDecoder[PaginatedMoveMetaAilmentSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedMoveMetaCategorySummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[MoveMetaCategorySummary]]
)
object PaginatedMoveMetaCategorySummaryList {
  implicit val encoderPaginatedMoveMetaCategorySummaryList: Encoder[PaginatedMoveMetaCategorySummaryList] = deriveEncoder[PaginatedMoveMetaCategorySummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedMoveMetaCategorySummaryList: Decoder[PaginatedMoveMetaCategorySummaryList] = deriveDecoder[PaginatedMoveMetaCategorySummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedMoveSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[MoveSummary]]
)
object PaginatedMoveSummaryList {
  implicit val encoderPaginatedMoveSummaryList: Encoder[PaginatedMoveSummaryList] = deriveEncoder[PaginatedMoveSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedMoveSummaryList: Decoder[PaginatedMoveSummaryList] = deriveDecoder[PaginatedMoveSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedMoveTargetSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[MoveTargetSummary]]
)
object PaginatedMoveTargetSummaryList {
  implicit val encoderPaginatedMoveTargetSummaryList: Encoder[PaginatedMoveTargetSummaryList] = deriveEncoder[PaginatedMoveTargetSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedMoveTargetSummaryList: Decoder[PaginatedMoveTargetSummaryList] = deriveDecoder[PaginatedMoveTargetSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedNatureSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[NatureSummary]]
)
object PaginatedNatureSummaryList {
  implicit val encoderPaginatedNatureSummaryList: Encoder[PaginatedNatureSummaryList] = deriveEncoder[PaginatedNatureSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedNatureSummaryList: Decoder[PaginatedNatureSummaryList] = deriveDecoder[PaginatedNatureSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedPalParkAreaSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[PalParkAreaSummary]]
)
object PaginatedPalParkAreaSummaryList {
  implicit val encoderPaginatedPalParkAreaSummaryList: Encoder[PaginatedPalParkAreaSummaryList] = deriveEncoder[PaginatedPalParkAreaSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedPalParkAreaSummaryList: Decoder[PaginatedPalParkAreaSummaryList] = deriveDecoder[PaginatedPalParkAreaSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedPokeathlonStatSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[PokeathlonStatSummary]]
)
object PaginatedPokeathlonStatSummaryList {
  implicit val encoderPaginatedPokeathlonStatSummaryList: Encoder[PaginatedPokeathlonStatSummaryList] = deriveEncoder[PaginatedPokeathlonStatSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedPokeathlonStatSummaryList: Decoder[PaginatedPokeathlonStatSummaryList] = deriveDecoder[PaginatedPokeathlonStatSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedPokedexSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[PokedexSummary]]
)
object PaginatedPokedexSummaryList {
  implicit val encoderPaginatedPokedexSummaryList: Encoder[PaginatedPokedexSummaryList] = deriveEncoder[PaginatedPokedexSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedPokedexSummaryList: Decoder[PaginatedPokedexSummaryList] = deriveDecoder[PaginatedPokedexSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedPokemonColorSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[PokemonColorSummary]]
)
object PaginatedPokemonColorSummaryList {
  implicit val encoderPaginatedPokemonColorSummaryList: Encoder[PaginatedPokemonColorSummaryList] = deriveEncoder[PaginatedPokemonColorSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedPokemonColorSummaryList: Decoder[PaginatedPokemonColorSummaryList] = deriveDecoder[PaginatedPokemonColorSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedPokemonFormSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[PokemonFormSummary]]
)
object PaginatedPokemonFormSummaryList {
  implicit val encoderPaginatedPokemonFormSummaryList: Encoder[PaginatedPokemonFormSummaryList] = deriveEncoder[PaginatedPokemonFormSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedPokemonFormSummaryList: Decoder[PaginatedPokemonFormSummaryList] = deriveDecoder[PaginatedPokemonFormSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedPokemonHabitatSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[PokemonHabitatSummary]]
)
object PaginatedPokemonHabitatSummaryList {
  implicit val encoderPaginatedPokemonHabitatSummaryList: Encoder[PaginatedPokemonHabitatSummaryList] = deriveEncoder[PaginatedPokemonHabitatSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedPokemonHabitatSummaryList: Decoder[PaginatedPokemonHabitatSummaryList] = deriveDecoder[PaginatedPokemonHabitatSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedPokemonShapeSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[PokemonShapeSummary]]
)
object PaginatedPokemonShapeSummaryList {
  implicit val encoderPaginatedPokemonShapeSummaryList: Encoder[PaginatedPokemonShapeSummaryList] = deriveEncoder[PaginatedPokemonShapeSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedPokemonShapeSummaryList: Decoder[PaginatedPokemonShapeSummaryList] = deriveDecoder[PaginatedPokemonShapeSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedPokemonSpeciesSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[PokemonSpeciesSummary]]
)
object PaginatedPokemonSpeciesSummaryList {
  implicit val encoderPaginatedPokemonSpeciesSummaryList: Encoder[PaginatedPokemonSpeciesSummaryList] = deriveEncoder[PaginatedPokemonSpeciesSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedPokemonSpeciesSummaryList: Decoder[PaginatedPokemonSpeciesSummaryList] = deriveDecoder[PaginatedPokemonSpeciesSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedPokemonSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[PokemonSummary]]
)
object PaginatedPokemonSummaryList {
  implicit val encoderPaginatedPokemonSummaryList: Encoder[PaginatedPokemonSummaryList] = deriveEncoder[PaginatedPokemonSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedPokemonSummaryList: Decoder[PaginatedPokemonSummaryList] = deriveDecoder[PaginatedPokemonSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedRegionSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[RegionSummary]]
)
object PaginatedRegionSummaryList {
  implicit val encoderPaginatedRegionSummaryList: Encoder[PaginatedRegionSummaryList] = deriveEncoder[PaginatedRegionSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedRegionSummaryList: Decoder[PaginatedRegionSummaryList] = deriveDecoder[PaginatedRegionSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedStatSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[StatSummary]]
)
object PaginatedStatSummaryList {
  implicit val encoderPaginatedStatSummaryList: Encoder[PaginatedStatSummaryList] = deriveEncoder[PaginatedStatSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedStatSummaryList: Decoder[PaginatedStatSummaryList] = deriveDecoder[PaginatedStatSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedSuperContestEffectSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[SuperContestEffectSummary]]
)
object PaginatedSuperContestEffectSummaryList {
  implicit val encoderPaginatedSuperContestEffectSummaryList: Encoder[PaginatedSuperContestEffectSummaryList] = deriveEncoder[PaginatedSuperContestEffectSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedSuperContestEffectSummaryList: Decoder[PaginatedSuperContestEffectSummaryList] = deriveDecoder[PaginatedSuperContestEffectSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedTypeSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[TypeSummary]]
)
object PaginatedTypeSummaryList {
  implicit val encoderPaginatedTypeSummaryList: Encoder[PaginatedTypeSummaryList] = deriveEncoder[PaginatedTypeSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedTypeSummaryList: Decoder[PaginatedTypeSummaryList] = deriveDecoder[PaginatedTypeSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedVersionGroupSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[VersionGroupSummary]]
)
object PaginatedVersionGroupSummaryList {
  implicit val encoderPaginatedVersionGroupSummaryList: Encoder[PaginatedVersionGroupSummaryList] = deriveEncoder[PaginatedVersionGroupSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedVersionGroupSummaryList: Decoder[PaginatedVersionGroupSummaryList] = deriveDecoder[PaginatedVersionGroupSummaryList]
}

/**
* 
* @param count 
* @param next 
* @param previous 
* @param results 
*/

case class PaginatedVersionSummaryList(
  count: Option[Int],
  next: Option[URI],
  previous: Option[URI],
  results: Option[List[VersionSummary]]
)
object PaginatedVersionSummaryList {
  implicit val encoderPaginatedVersionSummaryList: Encoder[PaginatedVersionSummaryList] = deriveEncoder[PaginatedVersionSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedVersionSummaryList: Decoder[PaginatedVersionSummaryList] = deriveDecoder[PaginatedVersionSummaryList]
}

/**
* 
* @param id 
* @param name 
* @param names 
* @param pokemonUnderscoreencounters 
*/

case class PalParkAreaDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  names: List[PalParkAreaName],
  pokemonUnderscoreencounters: List[PalParkAreaDetailPokemonEncountersInner]
)
object PalParkAreaDetail {
  implicit val encoderPalParkAreaDetail: Encoder[PalParkAreaDetail] = deriveEncoder[PalParkAreaDetail].mapJson(_.dropNullValues)
  implicit val decoderPalParkAreaDetail: Decoder[PalParkAreaDetail] = deriveDecoder[PalParkAreaDetail]
}

/**
* 
* @param baseUnderscorescore 
* @param pokemonMinusspecies 
* @param rate 
*/

case class PalParkAreaDetailPokemonEncountersInner(
  baseUnderscorescore: Int,
  pokemonMinusspecies: PalParkAreaDetailPokemonEncountersInnerPokemonSpecies,
  rate: Int
)
object PalParkAreaDetailPokemonEncountersInner {
  implicit val encoderPalParkAreaDetailPokemonEncountersInner: Encoder[PalParkAreaDetailPokemonEncountersInner] = deriveEncoder[PalParkAreaDetailPokemonEncountersInner].mapJson(_.dropNullValues)
  implicit val decoderPalParkAreaDetailPokemonEncountersInner: Decoder[PalParkAreaDetailPokemonEncountersInner] = deriveDecoder[PalParkAreaDetailPokemonEncountersInner]
}

/**
* 
* @param name 
* @param url 
*/

case class PalParkAreaDetailPokemonEncountersInnerPokemonSpecies(
  name: String,
  url: URI
)
object PalParkAreaDetailPokemonEncountersInnerPokemonSpecies {
  implicit val encoderPalParkAreaDetailPokemonEncountersInnerPokemonSpecies: Encoder[PalParkAreaDetailPokemonEncountersInnerPokemonSpecies] = deriveEncoder[PalParkAreaDetailPokemonEncountersInnerPokemonSpecies].mapJson(_.dropNullValues)
  implicit val decoderPalParkAreaDetailPokemonEncountersInnerPokemonSpecies: Decoder[PalParkAreaDetailPokemonEncountersInnerPokemonSpecies] = deriveDecoder[PalParkAreaDetailPokemonEncountersInnerPokemonSpecies]
}

/**
* 
* @param name 
* @param language 
*/

case class PalParkAreaName(
  name: Refined[String, MaxSize[100]],
  language: LanguageSummary
)
object PalParkAreaName {
  implicit val encoderPalParkAreaName: Encoder[PalParkAreaName] = deriveEncoder[PalParkAreaName].mapJson(_.dropNullValues)
  implicit val decoderPalParkAreaName: Decoder[PalParkAreaName] = deriveDecoder[PalParkAreaName]
}

/**
* 
* @param name 
* @param url 
*/

case class PalParkAreaSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object PalParkAreaSummary {
  implicit val encoderPalParkAreaSummary: Encoder[PalParkAreaSummary] = deriveEncoder[PalParkAreaSummary].mapJson(_.dropNullValues)
  implicit val decoderPalParkAreaSummary: Decoder[PalParkAreaSummary] = deriveDecoder[PalParkAreaSummary]
}

/**
* 
* @param id 
* @param name 
* @param affectingUnderscorenatures 
* @param names 
*/

case class PokeathlonStatDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  affectingUnderscorenatures: PokeathlonStatDetailAffectingNatures,
  names: List[PokeathlonStatName]
)
object PokeathlonStatDetail {
  implicit val encoderPokeathlonStatDetail: Encoder[PokeathlonStatDetail] = deriveEncoder[PokeathlonStatDetail].mapJson(_.dropNullValues)
  implicit val decoderPokeathlonStatDetail: Decoder[PokeathlonStatDetail] = deriveDecoder[PokeathlonStatDetail]
}

/**
* 
* @param decrease 
* @param increase 
*/

case class PokeathlonStatDetailAffectingNatures(
  decrease: List[PokeathlonStatDetailAffectingNaturesDecreaseInner],
  increase: List[PokeathlonStatDetailAffectingNaturesIncreaseInner]
)
object PokeathlonStatDetailAffectingNatures {
  implicit val encoderPokeathlonStatDetailAffectingNatures: Encoder[PokeathlonStatDetailAffectingNatures] = deriveEncoder[PokeathlonStatDetailAffectingNatures].mapJson(_.dropNullValues)
  implicit val decoderPokeathlonStatDetailAffectingNatures: Decoder[PokeathlonStatDetailAffectingNatures] = deriveDecoder[PokeathlonStatDetailAffectingNatures]
}

/**
* 
* @param maxUnderscorechange 
* @param nature 
*/

case class PokeathlonStatDetailAffectingNaturesDecreaseInner(
  maxUnderscorechange: Refined[Int, LessEqual[-1]],
  nature: PokeathlonStatDetailAffectingNaturesDecreaseInnerNature
)
object PokeathlonStatDetailAffectingNaturesDecreaseInner {
  implicit val encoderPokeathlonStatDetailAffectingNaturesDecreaseInner: Encoder[PokeathlonStatDetailAffectingNaturesDecreaseInner] = deriveEncoder[PokeathlonStatDetailAffectingNaturesDecreaseInner].mapJson(_.dropNullValues)
  implicit val decoderPokeathlonStatDetailAffectingNaturesDecreaseInner: Decoder[PokeathlonStatDetailAffectingNaturesDecreaseInner] = deriveDecoder[PokeathlonStatDetailAffectingNaturesDecreaseInner]
}

/**
* 
* @param name 
* @param url 
*/

case class PokeathlonStatDetailAffectingNaturesDecreaseInnerNature(
  name: String,
  url: URI
)
object PokeathlonStatDetailAffectingNaturesDecreaseInnerNature {
  implicit val encoderPokeathlonStatDetailAffectingNaturesDecreaseInnerNature: Encoder[PokeathlonStatDetailAffectingNaturesDecreaseInnerNature] = deriveEncoder[PokeathlonStatDetailAffectingNaturesDecreaseInnerNature].mapJson(_.dropNullValues)
  implicit val decoderPokeathlonStatDetailAffectingNaturesDecreaseInnerNature: Decoder[PokeathlonStatDetailAffectingNaturesDecreaseInnerNature] = deriveDecoder[PokeathlonStatDetailAffectingNaturesDecreaseInnerNature]
}

/**
* 
* @param maxUnderscorechange 
* @param nature 
*/

case class PokeathlonStatDetailAffectingNaturesIncreaseInner(
  maxUnderscorechange: Refined[Int, GreaterEqual[1]],
  nature: PokeathlonStatDetailAffectingNaturesIncreaseInnerNature
)
object PokeathlonStatDetailAffectingNaturesIncreaseInner {
  implicit val encoderPokeathlonStatDetailAffectingNaturesIncreaseInner: Encoder[PokeathlonStatDetailAffectingNaturesIncreaseInner] = deriveEncoder[PokeathlonStatDetailAffectingNaturesIncreaseInner].mapJson(_.dropNullValues)
  implicit val decoderPokeathlonStatDetailAffectingNaturesIncreaseInner: Decoder[PokeathlonStatDetailAffectingNaturesIncreaseInner] = deriveDecoder[PokeathlonStatDetailAffectingNaturesIncreaseInner]
}

/**
* 
* @param name 
* @param url 
*/

case class PokeathlonStatDetailAffectingNaturesIncreaseInnerNature(
  name: String,
  url: URI
)
object PokeathlonStatDetailAffectingNaturesIncreaseInnerNature {
  implicit val encoderPokeathlonStatDetailAffectingNaturesIncreaseInnerNature: Encoder[PokeathlonStatDetailAffectingNaturesIncreaseInnerNature] = deriveEncoder[PokeathlonStatDetailAffectingNaturesIncreaseInnerNature].mapJson(_.dropNullValues)
  implicit val decoderPokeathlonStatDetailAffectingNaturesIncreaseInnerNature: Decoder[PokeathlonStatDetailAffectingNaturesIncreaseInnerNature] = deriveDecoder[PokeathlonStatDetailAffectingNaturesIncreaseInnerNature]
}

/**
* 
* @param name 
* @param language 
*/

case class PokeathlonStatName(
  name: Refined[String, MaxSize[100]],
  language: LanguageSummary
)
object PokeathlonStatName {
  implicit val encoderPokeathlonStatName: Encoder[PokeathlonStatName] = deriveEncoder[PokeathlonStatName].mapJson(_.dropNullValues)
  implicit val decoderPokeathlonStatName: Decoder[PokeathlonStatName] = deriveDecoder[PokeathlonStatName]
}

/**
* 
* @param name 
* @param url 
*/

case class PokeathlonStatSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object PokeathlonStatSummary {
  implicit val encoderPokeathlonStatSummary: Encoder[PokeathlonStatSummary] = deriveEncoder[PokeathlonStatSummary].mapJson(_.dropNullValues)
  implicit val decoderPokeathlonStatSummary: Decoder[PokeathlonStatSummary] = deriveDecoder[PokeathlonStatSummary]
}

/**
* 
* @param description 
* @param language 
*/

case class PokedexDescription(
  description: Option[Refined[String, MaxSize[1000]]],
  language: LanguageSummary
)
object PokedexDescription {
  implicit val encoderPokedexDescription: Encoder[PokedexDescription] = deriveEncoder[PokedexDescription].mapJson(_.dropNullValues)
  implicit val decoderPokedexDescription: Decoder[PokedexDescription] = deriveDecoder[PokedexDescription]
}

/**
* 
* @param id 
* @param name 
* @param isUnderscoremainUnderscoreseries 
* @param descriptions 
* @param names 
* @param pokemonUnderscoreentries 
* @param region 
* @param versionUnderscoregroups 
*/

case class PokedexDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  isUnderscoremainUnderscoreseries: Option[Boolean],
  descriptions: List[PokedexDescription],
  names: List[PokedexName],
  pokemonUnderscoreentries: List[PokedexDetailPokemonEntriesInner],
  region: RegionSummary,
  versionUnderscoregroups: List[PokedexDetailVersionGroupsInner]
)
object PokedexDetail {
  implicit val encoderPokedexDetail: Encoder[PokedexDetail] = deriveEncoder[PokedexDetail].mapJson(_.dropNullValues)
  implicit val decoderPokedexDetail: Decoder[PokedexDetail] = deriveDecoder[PokedexDetail]
}

/**
* 
* @param entryUnderscorenumber 
* @param pokemonUnderscorespecies 
*/

case class PokedexDetailPokemonEntriesInner(
  entryUnderscorenumber: Int,
  pokemonUnderscorespecies: PokedexDetailPokemonEntriesInnerPokemonSpecies
)
object PokedexDetailPokemonEntriesInner {
  implicit val encoderPokedexDetailPokemonEntriesInner: Encoder[PokedexDetailPokemonEntriesInner] = deriveEncoder[PokedexDetailPokemonEntriesInner].mapJson(_.dropNullValues)
  implicit val decoderPokedexDetailPokemonEntriesInner: Decoder[PokedexDetailPokemonEntriesInner] = deriveDecoder[PokedexDetailPokemonEntriesInner]
}

/**
* 
* @param name 
* @param url 
*/

case class PokedexDetailPokemonEntriesInnerPokemonSpecies(
  name: String,
  url: URI
)
object PokedexDetailPokemonEntriesInnerPokemonSpecies {
  implicit val encoderPokedexDetailPokemonEntriesInnerPokemonSpecies: Encoder[PokedexDetailPokemonEntriesInnerPokemonSpecies] = deriveEncoder[PokedexDetailPokemonEntriesInnerPokemonSpecies].mapJson(_.dropNullValues)
  implicit val decoderPokedexDetailPokemonEntriesInnerPokemonSpecies: Decoder[PokedexDetailPokemonEntriesInnerPokemonSpecies] = deriveDecoder[PokedexDetailPokemonEntriesInnerPokemonSpecies]
}

/**
* 
* @param name 
* @param url 
*/

case class PokedexDetailVersionGroupsInner(
  name: String,
  url: URI
)
object PokedexDetailVersionGroupsInner {
  implicit val encoderPokedexDetailVersionGroupsInner: Encoder[PokedexDetailVersionGroupsInner] = deriveEncoder[PokedexDetailVersionGroupsInner].mapJson(_.dropNullValues)
  implicit val decoderPokedexDetailVersionGroupsInner: Decoder[PokedexDetailVersionGroupsInner] = deriveDecoder[PokedexDetailVersionGroupsInner]
}

/**
* 
* @param name 
* @param language 
*/

case class PokedexName(
  name: Refined[String, MaxSize[100]],
  language: LanguageSummary
)
object PokedexName {
  implicit val encoderPokedexName: Encoder[PokedexName] = deriveEncoder[PokedexName].mapJson(_.dropNullValues)
  implicit val decoderPokedexName: Decoder[PokedexName] = deriveDecoder[PokedexName]
}

/**
* 
* @param name 
* @param url 
*/

case class PokedexSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object PokedexSummary {
  implicit val encoderPokedexSummary: Encoder[PokedexSummary] = deriveEncoder[PokedexSummary].mapJson(_.dropNullValues)
  implicit val decoderPokedexSummary: Decoder[PokedexSummary] = deriveDecoder[PokedexSummary]
}

/**
* 
* @param id 
* @param name 
* @param names 
* @param pokemonUnderscorespecies 
*/

case class PokemonColorDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  names: List[PokemonColorName],
  pokemonUnderscorespecies: List[PokemonSpeciesSummary]
)
object PokemonColorDetail {
  implicit val encoderPokemonColorDetail: Encoder[PokemonColorDetail] = deriveEncoder[PokemonColorDetail].mapJson(_.dropNullValues)
  implicit val decoderPokemonColorDetail: Decoder[PokemonColorDetail] = deriveDecoder[PokemonColorDetail]
}

/**
* 
* @param name 
* @param language 
*/

case class PokemonColorName(
  name: Refined[String, MaxSize[100]],
  language: LanguageSummary
)
object PokemonColorName {
  implicit val encoderPokemonColorName: Encoder[PokemonColorName] = deriveEncoder[PokemonColorName].mapJson(_.dropNullValues)
  implicit val decoderPokemonColorName: Decoder[PokemonColorName] = deriveDecoder[PokemonColorName]
}

/**
* 
* @param name 
* @param url 
*/

case class PokemonColorSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object PokemonColorSummary {
  implicit val encoderPokemonColorSummary: Encoder[PokemonColorSummary] = deriveEncoder[PokemonColorSummary].mapJson(_.dropNullValues)
  implicit val decoderPokemonColorSummary: Decoder[PokemonColorSummary] = deriveDecoder[PokemonColorSummary]
}

/**
* 
* @param id 
* @param name 
* @param baseUnderscoreexperience 
* @param height 
* @param isUnderscoredefault 
* @param order 
* @param weight 
* @param abilities 
* @param pastUnderscoreabilities 
* @param forms 
* @param gameUnderscoreindices 
* @param heldUnderscoreitems 
* @param locationUnderscoreareaUnderscoreencounters 
* @param moves 
* @param species 
* @param sprites 
* @param cries 
* @param stats 
* @param types 
* @param pastUnderscoretypes 
*/

case class PokemonDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  baseUnderscoreexperience: Option[Int],
  height: Option[Int],
  isUnderscoredefault: Option[Boolean],
  order: Option[Int],
  weight: Option[Int],
  abilities: List[PokemonDetailAbilitiesInner],
  pastUnderscoreabilities: List[PokemonDetailPastAbilitiesInner],
  forms: List[PokemonFormSummary],
  gameUnderscoreindices: List[PokemonGameIndex],
  heldUnderscoreitems: PokemonDetailHeldItems,
  locationUnderscoreareaUnderscoreencounters: String,
  moves: List[PokemonDetailMovesInner],
  species: PokemonSpeciesSummary,
  sprites: PokemonDetailSprites,
  cries: PokemonDetailCries,
  stats: List[PokemonStat],
  types: List[PokemonDetailTypesInner],
  pastUnderscoretypes: List[PokemonDetailPastTypesInner]
)
object PokemonDetail {
  implicit val encoderPokemonDetail: Encoder[PokemonDetail] = deriveEncoder[PokemonDetail].mapJson(_.dropNullValues)
  implicit val decoderPokemonDetail: Decoder[PokemonDetail] = deriveDecoder[PokemonDetail]
}

/**
* 
* @param ability 
* @param isUnderscorehidden 
* @param slot 
*/

case class PokemonDetailAbilitiesInner(
  ability: PokemonDetailAbilitiesInnerAbility,
  isUnderscorehidden: Boolean,
  slot: Int
)
object PokemonDetailAbilitiesInner {
  implicit val encoderPokemonDetailAbilitiesInner: Encoder[PokemonDetailAbilitiesInner] = deriveEncoder[PokemonDetailAbilitiesInner].mapJson(_.dropNullValues)
  implicit val decoderPokemonDetailAbilitiesInner: Decoder[PokemonDetailAbilitiesInner] = deriveDecoder[PokemonDetailAbilitiesInner]
}

/**
* 
* @param name 
* @param url 
*/

case class PokemonDetailAbilitiesInnerAbility(
  name: String,
  url: URI
)
object PokemonDetailAbilitiesInnerAbility {
  implicit val encoderPokemonDetailAbilitiesInnerAbility: Encoder[PokemonDetailAbilitiesInnerAbility] = deriveEncoder[PokemonDetailAbilitiesInnerAbility].mapJson(_.dropNullValues)
  implicit val decoderPokemonDetailAbilitiesInnerAbility: Decoder[PokemonDetailAbilitiesInnerAbility] = deriveDecoder[PokemonDetailAbilitiesInnerAbility]
}

/**
* 
* @param latest 
* @param legacy 
*/

case class PokemonDetailCries(
  latest: URI,
  legacy: URI
)
object PokemonDetailCries {
  implicit val encoderPokemonDetailCries: Encoder[PokemonDetailCries] = deriveEncoder[PokemonDetailCries].mapJson(_.dropNullValues)
  implicit val decoderPokemonDetailCries: Decoder[PokemonDetailCries] = deriveDecoder[PokemonDetailCries]
}

/**
* 
* @param item 
* @param versionUnderscoredetails 
*/

case class PokemonDetailHeldItems(
  item: PokemonDetailHeldItemsItem,
  versionUnderscoredetails: List[PokemonDetailHeldItemsVersionDetailsInner]
)
object PokemonDetailHeldItems {
  implicit val encoderPokemonDetailHeldItems: Encoder[PokemonDetailHeldItems] = deriveEncoder[PokemonDetailHeldItems].mapJson(_.dropNullValues)
  implicit val decoderPokemonDetailHeldItems: Decoder[PokemonDetailHeldItems] = deriveDecoder[PokemonDetailHeldItems]
}

/**
* 
* @param name 
* @param url 
*/

case class PokemonDetailHeldItemsItem(
  name: String,
  url: URI
)
object PokemonDetailHeldItemsItem {
  implicit val encoderPokemonDetailHeldItemsItem: Encoder[PokemonDetailHeldItemsItem] = deriveEncoder[PokemonDetailHeldItemsItem].mapJson(_.dropNullValues)
  implicit val decoderPokemonDetailHeldItemsItem: Decoder[PokemonDetailHeldItemsItem] = deriveDecoder[PokemonDetailHeldItemsItem]
}

/**
* 
* @param rarity 
* @param version 
*/

case class PokemonDetailHeldItemsVersionDetailsInner(
  rarity: Int,
  version: PokemonDetailHeldItemsVersionDetailsInnerVersion
)
object PokemonDetailHeldItemsVersionDetailsInner {
  implicit val encoderPokemonDetailHeldItemsVersionDetailsInner: Encoder[PokemonDetailHeldItemsVersionDetailsInner] = deriveEncoder[PokemonDetailHeldItemsVersionDetailsInner].mapJson(_.dropNullValues)
  implicit val decoderPokemonDetailHeldItemsVersionDetailsInner: Decoder[PokemonDetailHeldItemsVersionDetailsInner] = deriveDecoder[PokemonDetailHeldItemsVersionDetailsInner]
}

/**
* 
* @param name 
* @param url 
*/

case class PokemonDetailHeldItemsVersionDetailsInnerVersion(
  name: String,
  url: URI
)
object PokemonDetailHeldItemsVersionDetailsInnerVersion {
  implicit val encoderPokemonDetailHeldItemsVersionDetailsInnerVersion: Encoder[PokemonDetailHeldItemsVersionDetailsInnerVersion] = deriveEncoder[PokemonDetailHeldItemsVersionDetailsInnerVersion].mapJson(_.dropNullValues)
  implicit val decoderPokemonDetailHeldItemsVersionDetailsInnerVersion: Decoder[PokemonDetailHeldItemsVersionDetailsInnerVersion] = deriveDecoder[PokemonDetailHeldItemsVersionDetailsInnerVersion]
}

/**
* 
* @param move 
* @param versionUnderscoregroupUnderscoredetails 
*/

case class PokemonDetailMovesInner(
  move: PokemonDetailMovesInnerMove,
  versionUnderscoregroupUnderscoredetails: List[PokemonDetailMovesInnerVersionGroupDetailsInner]
)
object PokemonDetailMovesInner {
  implicit val encoderPokemonDetailMovesInner: Encoder[PokemonDetailMovesInner] = deriveEncoder[PokemonDetailMovesInner].mapJson(_.dropNullValues)
  implicit val decoderPokemonDetailMovesInner: Decoder[PokemonDetailMovesInner] = deriveDecoder[PokemonDetailMovesInner]
}

/**
* 
* @param name 
* @param url 
*/

case class PokemonDetailMovesInnerMove(
  name: String,
  url: URI
)
object PokemonDetailMovesInnerMove {
  implicit val encoderPokemonDetailMovesInnerMove: Encoder[PokemonDetailMovesInnerMove] = deriveEncoder[PokemonDetailMovesInnerMove].mapJson(_.dropNullValues)
  implicit val decoderPokemonDetailMovesInnerMove: Decoder[PokemonDetailMovesInnerMove] = deriveDecoder[PokemonDetailMovesInnerMove]
}

/**
* 
* @param levelUnderscorelearnedUnderscoreat 
* @param moveUnderscorelearnUnderscoremethod 
* @param versionUnderscoregroup 
*/

case class PokemonDetailMovesInnerVersionGroupDetailsInner(
  levelUnderscorelearnedUnderscoreat: Int,
  moveUnderscorelearnUnderscoremethod: PokemonDetailMovesInnerVersionGroupDetailsInnerMoveLearnMethod,
  versionUnderscoregroup: PokemonDetailMovesInnerVersionGroupDetailsInnerVersionGroup
)
object PokemonDetailMovesInnerVersionGroupDetailsInner {
  implicit val encoderPokemonDetailMovesInnerVersionGroupDetailsInner: Encoder[PokemonDetailMovesInnerVersionGroupDetailsInner] = deriveEncoder[PokemonDetailMovesInnerVersionGroupDetailsInner].mapJson(_.dropNullValues)
  implicit val decoderPokemonDetailMovesInnerVersionGroupDetailsInner: Decoder[PokemonDetailMovesInnerVersionGroupDetailsInner] = deriveDecoder[PokemonDetailMovesInnerVersionGroupDetailsInner]
}

/**
* 
* @param name 
* @param url 
*/

case class PokemonDetailMovesInnerVersionGroupDetailsInnerMoveLearnMethod(
  name: String,
  url: URI
)
object PokemonDetailMovesInnerVersionGroupDetailsInnerMoveLearnMethod {
  implicit val encoderPokemonDetailMovesInnerVersionGroupDetailsInnerMoveLearnMethod: Encoder[PokemonDetailMovesInnerVersionGroupDetailsInnerMoveLearnMethod] = deriveEncoder[PokemonDetailMovesInnerVersionGroupDetailsInnerMoveLearnMethod].mapJson(_.dropNullValues)
  implicit val decoderPokemonDetailMovesInnerVersionGroupDetailsInnerMoveLearnMethod: Decoder[PokemonDetailMovesInnerVersionGroupDetailsInnerMoveLearnMethod] = deriveDecoder[PokemonDetailMovesInnerVersionGroupDetailsInnerMoveLearnMethod]
}

/**
* 
* @param name 
* @param url 
*/

case class PokemonDetailMovesInnerVersionGroupDetailsInnerVersionGroup(
  name: String,
  url: URI
)
object PokemonDetailMovesInnerVersionGroupDetailsInnerVersionGroup {
  implicit val encoderPokemonDetailMovesInnerVersionGroupDetailsInnerVersionGroup: Encoder[PokemonDetailMovesInnerVersionGroupDetailsInnerVersionGroup] = deriveEncoder[PokemonDetailMovesInnerVersionGroupDetailsInnerVersionGroup].mapJson(_.dropNullValues)
  implicit val decoderPokemonDetailMovesInnerVersionGroupDetailsInnerVersionGroup: Decoder[PokemonDetailMovesInnerVersionGroupDetailsInnerVersionGroup] = deriveDecoder[PokemonDetailMovesInnerVersionGroupDetailsInnerVersionGroup]
}

/**
* 
* @param abilities 
* @param generation 
*/

case class PokemonDetailPastAbilitiesInner(
  abilities: List[PokemonDetailPastAbilitiesInnerAbilitiesInner],
  generation: PokemonDetailPastAbilitiesInnerGeneration
)
object PokemonDetailPastAbilitiesInner {
  implicit val encoderPokemonDetailPastAbilitiesInner: Encoder[PokemonDetailPastAbilitiesInner] = deriveEncoder[PokemonDetailPastAbilitiesInner].mapJson(_.dropNullValues)
  implicit val decoderPokemonDetailPastAbilitiesInner: Decoder[PokemonDetailPastAbilitiesInner] = deriveDecoder[PokemonDetailPastAbilitiesInner]
}

/**
* 
* @param ability 
* @param isUnderscorehidden 
* @param slot 
*/

case class PokemonDetailPastAbilitiesInnerAbilitiesInner(
  ability: PokemonDetailPastAbilitiesInnerAbilitiesInnerAbility,
  isUnderscorehidden: Boolean,
  slot: Int
)
object PokemonDetailPastAbilitiesInnerAbilitiesInner {
  implicit val encoderPokemonDetailPastAbilitiesInnerAbilitiesInner: Encoder[PokemonDetailPastAbilitiesInnerAbilitiesInner] = deriveEncoder[PokemonDetailPastAbilitiesInnerAbilitiesInner].mapJson(_.dropNullValues)
  implicit val decoderPokemonDetailPastAbilitiesInnerAbilitiesInner: Decoder[PokemonDetailPastAbilitiesInnerAbilitiesInner] = deriveDecoder[PokemonDetailPastAbilitiesInnerAbilitiesInner]
}

/**
* 
* @param name 
* @param url 
*/

case class PokemonDetailPastAbilitiesInnerAbilitiesInnerAbility(
  name: String,
  url: URI
)
object PokemonDetailPastAbilitiesInnerAbilitiesInnerAbility {
  implicit val encoderPokemonDetailPastAbilitiesInnerAbilitiesInnerAbility: Encoder[PokemonDetailPastAbilitiesInnerAbilitiesInnerAbility] = deriveEncoder[PokemonDetailPastAbilitiesInnerAbilitiesInnerAbility].mapJson(_.dropNullValues)
  implicit val decoderPokemonDetailPastAbilitiesInnerAbilitiesInnerAbility: Decoder[PokemonDetailPastAbilitiesInnerAbilitiesInnerAbility] = deriveDecoder[PokemonDetailPastAbilitiesInnerAbilitiesInnerAbility]
}

/**
* 
* @param name 
* @param url 
*/

case class PokemonDetailPastAbilitiesInnerGeneration(
  name: String,
  url: URI
)
object PokemonDetailPastAbilitiesInnerGeneration {
  implicit val encoderPokemonDetailPastAbilitiesInnerGeneration: Encoder[PokemonDetailPastAbilitiesInnerGeneration] = deriveEncoder[PokemonDetailPastAbilitiesInnerGeneration].mapJson(_.dropNullValues)
  implicit val decoderPokemonDetailPastAbilitiesInnerGeneration: Decoder[PokemonDetailPastAbilitiesInnerGeneration] = deriveDecoder[PokemonDetailPastAbilitiesInnerGeneration]
}

/**
* 
* @param generation 
* @param types 
*/

case class PokemonDetailPastTypesInner(
  generation: PokemonDetailPastTypesInnerGeneration,
  types: List[PokemonDetailPastTypesInnerTypesInner]
)
object PokemonDetailPastTypesInner {
  implicit val encoderPokemonDetailPastTypesInner: Encoder[PokemonDetailPastTypesInner] = deriveEncoder[PokemonDetailPastTypesInner].mapJson(_.dropNullValues)
  implicit val decoderPokemonDetailPastTypesInner: Decoder[PokemonDetailPastTypesInner] = deriveDecoder[PokemonDetailPastTypesInner]
}

/**
* 
* @param name 
* @param url 
*/

case class PokemonDetailPastTypesInnerGeneration(
  name: String,
  url: URI
)
object PokemonDetailPastTypesInnerGeneration {
  implicit val encoderPokemonDetailPastTypesInnerGeneration: Encoder[PokemonDetailPastTypesInnerGeneration] = deriveEncoder[PokemonDetailPastTypesInnerGeneration].mapJson(_.dropNullValues)
  implicit val decoderPokemonDetailPastTypesInnerGeneration: Decoder[PokemonDetailPastTypesInnerGeneration] = deriveDecoder[PokemonDetailPastTypesInnerGeneration]
}

/**
* 
* @param slot 
* @param `type` 
*/

case class PokemonDetailPastTypesInnerTypesInner(
  slot: Int,
  `type`: PokemonDetailPastTypesInnerTypesInnerType
)
object PokemonDetailPastTypesInnerTypesInner {
  implicit val encoderPokemonDetailPastTypesInnerTypesInner: Encoder[PokemonDetailPastTypesInnerTypesInner] = deriveEncoder[PokemonDetailPastTypesInnerTypesInner].mapJson(_.dropNullValues)
  implicit val decoderPokemonDetailPastTypesInnerTypesInner: Decoder[PokemonDetailPastTypesInnerTypesInner] = deriveDecoder[PokemonDetailPastTypesInnerTypesInner]
}

/**
* 
* @param name 
* @param url 
*/

case class PokemonDetailPastTypesInnerTypesInnerType(
  name: String,
  url: URI
)
object PokemonDetailPastTypesInnerTypesInnerType {
  implicit val encoderPokemonDetailPastTypesInnerTypesInnerType: Encoder[PokemonDetailPastTypesInnerTypesInnerType] = deriveEncoder[PokemonDetailPastTypesInnerTypesInnerType].mapJson(_.dropNullValues)
  implicit val decoderPokemonDetailPastTypesInnerTypesInnerType: Decoder[PokemonDetailPastTypesInnerTypesInnerType] = deriveDecoder[PokemonDetailPastTypesInnerTypesInnerType]
}

/**
* 
* @param frontUnderscoredefault 
*/

case class PokemonDetailSprites(
  frontUnderscoredefault: Option[URI]
)
object PokemonDetailSprites {
  implicit val encoderPokemonDetailSprites: Encoder[PokemonDetailSprites] = deriveEncoder[PokemonDetailSprites].mapJson(_.dropNullValues)
  implicit val decoderPokemonDetailSprites: Decoder[PokemonDetailSprites] = deriveDecoder[PokemonDetailSprites]
}

/**
* 
* @param slot 
* @param `type` 
*/

case class PokemonDetailTypesInner(
  slot: Int,
  `type`: PokemonDetailTypesInnerType
)
object PokemonDetailTypesInner {
  implicit val encoderPokemonDetailTypesInner: Encoder[PokemonDetailTypesInner] = deriveEncoder[PokemonDetailTypesInner].mapJson(_.dropNullValues)
  implicit val decoderPokemonDetailTypesInner: Decoder[PokemonDetailTypesInner] = deriveDecoder[PokemonDetailTypesInner]
}

/**
* 
* @param name 
* @param url 
*/

case class PokemonDetailTypesInnerType(
  name: String,
  url: URI
)
object PokemonDetailTypesInnerType {
  implicit val encoderPokemonDetailTypesInnerType: Encoder[PokemonDetailTypesInnerType] = deriveEncoder[PokemonDetailTypesInnerType].mapJson(_.dropNullValues)
  implicit val decoderPokemonDetailTypesInnerType: Decoder[PokemonDetailTypesInnerType] = deriveDecoder[PokemonDetailTypesInnerType]
}

/**
* 
* @param entryUnderscorenumber 
* @param pokedex 
*/

case class PokemonDexEntry(
  entryUnderscorenumber: Int,
  pokedex: PokedexSummary
)
object PokemonDexEntry {
  implicit val encoderPokemonDexEntry: Encoder[PokemonDexEntry] = deriveEncoder[PokemonDexEntry].mapJson(_.dropNullValues)
  implicit val decoderPokemonDexEntry: Decoder[PokemonDexEntry] = deriveDecoder[PokemonDexEntry]
}

/**
* 
* @param id 
* @param name 
* @param order 
* @param formUnderscoreorder 
* @param isUnderscoredefault 
* @param isUnderscorebattleUnderscoreonly 
* @param isUnderscoremega 
* @param formUnderscorename 
* @param pokemon 
* @param sprites 
* @param versionUnderscoregroup 
* @param formUnderscorenames 
* @param names 
* @param types 
*/

case class PokemonFormDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  order: Option[Int],
  formUnderscoreorder: Option[Int],
  isUnderscoredefault: Option[Boolean],
  isUnderscorebattleUnderscoreonly: Option[Boolean],
  isUnderscoremega: Option[Boolean],
  formUnderscorename: Refined[String, MaxSize[30]],
  pokemon: PokemonSummary,
  sprites: PokemonFormDetailSprites,
  versionUnderscoregroup: VersionGroupSummary,
  formUnderscorenames: List[PokemonFormDetailFormNamesInner],
  names: List[PokemonFormDetailNamesInner],
  types: List[PokemonFormDetailTypesInner]
)
object PokemonFormDetail {
  implicit val encoderPokemonFormDetail: Encoder[PokemonFormDetail] = deriveEncoder[PokemonFormDetail].mapJson(_.dropNullValues)
  implicit val decoderPokemonFormDetail: Decoder[PokemonFormDetail] = deriveDecoder[PokemonFormDetail]
}

/**
* 
* @param language 
* @param name 
*/

case class PokemonFormDetailFormNamesInner(
  language: PokemonFormDetailFormNamesInnerLanguage,
  name: String
)
object PokemonFormDetailFormNamesInner {
  implicit val encoderPokemonFormDetailFormNamesInner: Encoder[PokemonFormDetailFormNamesInner] = deriveEncoder[PokemonFormDetailFormNamesInner].mapJson(_.dropNullValues)
  implicit val decoderPokemonFormDetailFormNamesInner: Decoder[PokemonFormDetailFormNamesInner] = deriveDecoder[PokemonFormDetailFormNamesInner]
}

/**
* 
* @param name 
* @param url 
*/

case class PokemonFormDetailFormNamesInnerLanguage(
  name: String,
  url: URI
)
object PokemonFormDetailFormNamesInnerLanguage {
  implicit val encoderPokemonFormDetailFormNamesInnerLanguage: Encoder[PokemonFormDetailFormNamesInnerLanguage] = deriveEncoder[PokemonFormDetailFormNamesInnerLanguage].mapJson(_.dropNullValues)
  implicit val decoderPokemonFormDetailFormNamesInnerLanguage: Decoder[PokemonFormDetailFormNamesInnerLanguage] = deriveDecoder[PokemonFormDetailFormNamesInnerLanguage]
}

/**
* 
* @param language 
* @param name 
*/

case class PokemonFormDetailNamesInner(
  language: PokemonFormDetailNamesInnerLanguage,
  name: String
)
object PokemonFormDetailNamesInner {
  implicit val encoderPokemonFormDetailNamesInner: Encoder[PokemonFormDetailNamesInner] = deriveEncoder[PokemonFormDetailNamesInner].mapJson(_.dropNullValues)
  implicit val decoderPokemonFormDetailNamesInner: Decoder[PokemonFormDetailNamesInner] = deriveDecoder[PokemonFormDetailNamesInner]
}

/**
* 
* @param name 
* @param url 
*/

case class PokemonFormDetailNamesInnerLanguage(
  name: String,
  url: URI
)
object PokemonFormDetailNamesInnerLanguage {
  implicit val encoderPokemonFormDetailNamesInnerLanguage: Encoder[PokemonFormDetailNamesInnerLanguage] = deriveEncoder[PokemonFormDetailNamesInnerLanguage].mapJson(_.dropNullValues)
  implicit val decoderPokemonFormDetailNamesInnerLanguage: Decoder[PokemonFormDetailNamesInnerLanguage] = deriveDecoder[PokemonFormDetailNamesInnerLanguage]
}

/**
* 
* @param `default` 
*/

case class PokemonFormDetailSprites(
  `default`: Option[URI]
)
object PokemonFormDetailSprites {
  implicit val encoderPokemonFormDetailSprites: Encoder[PokemonFormDetailSprites] = deriveEncoder[PokemonFormDetailSprites].mapJson(_.dropNullValues)
  implicit val decoderPokemonFormDetailSprites: Decoder[PokemonFormDetailSprites] = deriveDecoder[PokemonFormDetailSprites]
}

/**
* 
* @param slot 
* @param `type` 
*/

case class PokemonFormDetailTypesInner(
  slot: Int,
  `type`: PokemonFormDetailTypesInnerType
)
object PokemonFormDetailTypesInner {
  implicit val encoderPokemonFormDetailTypesInner: Encoder[PokemonFormDetailTypesInner] = deriveEncoder[PokemonFormDetailTypesInner].mapJson(_.dropNullValues)
  implicit val decoderPokemonFormDetailTypesInner: Decoder[PokemonFormDetailTypesInner] = deriveDecoder[PokemonFormDetailTypesInner]
}

/**
* 
* @param name 
* @param url 
*/

case class PokemonFormDetailTypesInnerType(
  name: String,
  url: URI
)
object PokemonFormDetailTypesInnerType {
  implicit val encoderPokemonFormDetailTypesInnerType: Encoder[PokemonFormDetailTypesInnerType] = deriveEncoder[PokemonFormDetailTypesInnerType].mapJson(_.dropNullValues)
  implicit val decoderPokemonFormDetailTypesInnerType: Decoder[PokemonFormDetailTypesInnerType] = deriveDecoder[PokemonFormDetailTypesInnerType]
}

/**
* 
* @param name 
* @param url 
*/

case class PokemonFormSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object PokemonFormSummary {
  implicit val encoderPokemonFormSummary: Encoder[PokemonFormSummary] = deriveEncoder[PokemonFormSummary].mapJson(_.dropNullValues)
  implicit val decoderPokemonFormSummary: Decoder[PokemonFormSummary] = deriveDecoder[PokemonFormSummary]
}

/**
* 
* @param gameUnderscoreindex 
* @param version 
*/

case class PokemonGameIndex(
  gameUnderscoreindex: Int,
  version: VersionSummary
)
object PokemonGameIndex {
  implicit val encoderPokemonGameIndex: Encoder[PokemonGameIndex] = deriveEncoder[PokemonGameIndex].mapJson(_.dropNullValues)
  implicit val decoderPokemonGameIndex: Decoder[PokemonGameIndex] = deriveDecoder[PokemonGameIndex]
}

/**
* 
* @param id 
* @param name 
* @param names 
* @param pokemonUnderscorespecies 
*/

case class PokemonHabitatDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  names: List[PokemonHabitatName],
  pokemonUnderscorespecies: List[PokemonSpeciesSummary]
)
object PokemonHabitatDetail {
  implicit val encoderPokemonHabitatDetail: Encoder[PokemonHabitatDetail] = deriveEncoder[PokemonHabitatDetail].mapJson(_.dropNullValues)
  implicit val decoderPokemonHabitatDetail: Decoder[PokemonHabitatDetail] = deriveDecoder[PokemonHabitatDetail]
}

/**
* 
* @param name 
* @param language 
*/

case class PokemonHabitatName(
  name: Refined[String, MaxSize[100]],
  language: LanguageSummary
)
object PokemonHabitatName {
  implicit val encoderPokemonHabitatName: Encoder[PokemonHabitatName] = deriveEncoder[PokemonHabitatName].mapJson(_.dropNullValues)
  implicit val decoderPokemonHabitatName: Decoder[PokemonHabitatName] = deriveDecoder[PokemonHabitatName]
}

/**
* 
* @param name 
* @param url 
*/

case class PokemonHabitatSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object PokemonHabitatSummary {
  implicit val encoderPokemonHabitatSummary: Encoder[PokemonHabitatSummary] = deriveEncoder[PokemonHabitatSummary].mapJson(_.dropNullValues)
  implicit val decoderPokemonHabitatSummary: Decoder[PokemonHabitatSummary] = deriveDecoder[PokemonHabitatSummary]
}

/**
* 
* @param id 
* @param name 
* @param awesomeUnderscorenames 
* @param names 
* @param pokemonUnderscorespecies 
*/

case class PokemonShapeDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  awesomeUnderscorenames: List[PokemonShapeDetailAwesomeNamesInner],
  names: List[PokemonShapeDetailNamesInner],
  pokemonUnderscorespecies: List[PokemonSpeciesSummary]
)
object PokemonShapeDetail {
  implicit val encoderPokemonShapeDetail: Encoder[PokemonShapeDetail] = deriveEncoder[PokemonShapeDetail].mapJson(_.dropNullValues)
  implicit val decoderPokemonShapeDetail: Decoder[PokemonShapeDetail] = deriveDecoder[PokemonShapeDetail]
}

/**
* 
* @param awesomeUnderscorename 
* @param language 
*/

case class PokemonShapeDetailAwesomeNamesInner(
  awesomeUnderscorename: String,
  language: PokemonShapeDetailAwesomeNamesInnerLanguage
)
object PokemonShapeDetailAwesomeNamesInner {
  implicit val encoderPokemonShapeDetailAwesomeNamesInner: Encoder[PokemonShapeDetailAwesomeNamesInner] = deriveEncoder[PokemonShapeDetailAwesomeNamesInner].mapJson(_.dropNullValues)
  implicit val decoderPokemonShapeDetailAwesomeNamesInner: Decoder[PokemonShapeDetailAwesomeNamesInner] = deriveDecoder[PokemonShapeDetailAwesomeNamesInner]
}

/**
* 
* @param name 
* @param url 
*/

case class PokemonShapeDetailAwesomeNamesInnerLanguage(
  name: String,
  url: URI
)
object PokemonShapeDetailAwesomeNamesInnerLanguage {
  implicit val encoderPokemonShapeDetailAwesomeNamesInnerLanguage: Encoder[PokemonShapeDetailAwesomeNamesInnerLanguage] = deriveEncoder[PokemonShapeDetailAwesomeNamesInnerLanguage].mapJson(_.dropNullValues)
  implicit val decoderPokemonShapeDetailAwesomeNamesInnerLanguage: Decoder[PokemonShapeDetailAwesomeNamesInnerLanguage] = deriveDecoder[PokemonShapeDetailAwesomeNamesInnerLanguage]
}

/**
* 
* @param url 
* @param name 
*/

case class PokemonShapeDetailNamesInner(
  url: URI,
  name: String
)
object PokemonShapeDetailNamesInner {
  implicit val encoderPokemonShapeDetailNamesInner: Encoder[PokemonShapeDetailNamesInner] = deriveEncoder[PokemonShapeDetailNamesInner].mapJson(_.dropNullValues)
  implicit val decoderPokemonShapeDetailNamesInner: Decoder[PokemonShapeDetailNamesInner] = deriveDecoder[PokemonShapeDetailNamesInner]
}

/**
* 
* @param name 
* @param url 
*/

case class PokemonShapeSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object PokemonShapeSummary {
  implicit val encoderPokemonShapeSummary: Encoder[PokemonShapeSummary] = deriveEncoder[PokemonShapeSummary].mapJson(_.dropNullValues)
  implicit val decoderPokemonShapeSummary: Decoder[PokemonShapeSummary] = deriveDecoder[PokemonShapeSummary]
}

/**
* 
* @param description 
* @param language 
*/

case class PokemonSpeciesDescription(
  description: Option[Refined[String, MaxSize[1000]]],
  language: LanguageSummary
)
object PokemonSpeciesDescription {
  implicit val encoderPokemonSpeciesDescription: Encoder[PokemonSpeciesDescription] = deriveEncoder[PokemonSpeciesDescription].mapJson(_.dropNullValues)
  implicit val decoderPokemonSpeciesDescription: Decoder[PokemonSpeciesDescription] = deriveDecoder[PokemonSpeciesDescription]
}

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

case class PokemonSpeciesDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
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
  pokedexUnderscorenumbers: List[PokemonDexEntry],
  eggUnderscoregroups: List[PokemonSpeciesDetailEggGroupsInner],
  color: PokemonColorSummary,
  shape: PokemonShapeSummary,
  evolvesUnderscorefromUnderscorespecies: PokemonSpeciesSummary,
  evolutionUnderscorechain: EvolutionChainSummary,
  habitat: PokemonHabitatSummary,
  generation: GenerationSummary,
  names: List[PokemonSpeciesDetailNamesInner],
  palUnderscoreparkUnderscoreencounters: List[PokemonSpeciesDetailPalParkEncountersInner],
  formUnderscoredescriptions: List[PokemonSpeciesDescription],
  flavorUnderscoretextUnderscoreentries: List[PokemonSpeciesFlavorText],
  genera: List[PokemonSpeciesDetailGeneraInner],
  varieties: List[PokemonSpeciesDetailVarietiesInner]
)
object PokemonSpeciesDetail {
  implicit val encoderPokemonSpeciesDetail: Encoder[PokemonSpeciesDetail] = deriveEncoder[PokemonSpeciesDetail].mapJson(_.dropNullValues)
  implicit val decoderPokemonSpeciesDetail: Decoder[PokemonSpeciesDetail] = deriveDecoder[PokemonSpeciesDetail]
}

/**
* 
* @param name 
* @param url 
*/

case class PokemonSpeciesDetailEggGroupsInner(
  name: String,
  url: URI
)
object PokemonSpeciesDetailEggGroupsInner {
  implicit val encoderPokemonSpeciesDetailEggGroupsInner: Encoder[PokemonSpeciesDetailEggGroupsInner] = deriveEncoder[PokemonSpeciesDetailEggGroupsInner].mapJson(_.dropNullValues)
  implicit val decoderPokemonSpeciesDetailEggGroupsInner: Decoder[PokemonSpeciesDetailEggGroupsInner] = deriveDecoder[PokemonSpeciesDetailEggGroupsInner]
}

/**
* 
* @param genus 
* @param language 
*/

case class PokemonSpeciesDetailGeneraInner(
  genus: String,
  language: PokemonSpeciesDetailGeneraInnerLanguage
)
object PokemonSpeciesDetailGeneraInner {
  implicit val encoderPokemonSpeciesDetailGeneraInner: Encoder[PokemonSpeciesDetailGeneraInner] = deriveEncoder[PokemonSpeciesDetailGeneraInner].mapJson(_.dropNullValues)
  implicit val decoderPokemonSpeciesDetailGeneraInner: Decoder[PokemonSpeciesDetailGeneraInner] = deriveDecoder[PokemonSpeciesDetailGeneraInner]
}

/**
* 
* @param name 
* @param url 
*/

case class PokemonSpeciesDetailGeneraInnerLanguage(
  name: String,
  url: URI
)
object PokemonSpeciesDetailGeneraInnerLanguage {
  implicit val encoderPokemonSpeciesDetailGeneraInnerLanguage: Encoder[PokemonSpeciesDetailGeneraInnerLanguage] = deriveEncoder[PokemonSpeciesDetailGeneraInnerLanguage].mapJson(_.dropNullValues)
  implicit val decoderPokemonSpeciesDetailGeneraInnerLanguage: Decoder[PokemonSpeciesDetailGeneraInnerLanguage] = deriveDecoder[PokemonSpeciesDetailGeneraInnerLanguage]
}

/**
* 
* @param language 
* @param name 
*/

case class PokemonSpeciesDetailNamesInner(
  language: PokemonSpeciesDetailNamesInnerLanguage,
  name: String
)
object PokemonSpeciesDetailNamesInner {
  implicit val encoderPokemonSpeciesDetailNamesInner: Encoder[PokemonSpeciesDetailNamesInner] = deriveEncoder[PokemonSpeciesDetailNamesInner].mapJson(_.dropNullValues)
  implicit val decoderPokemonSpeciesDetailNamesInner: Decoder[PokemonSpeciesDetailNamesInner] = deriveDecoder[PokemonSpeciesDetailNamesInner]
}

/**
* 
* @param name 
* @param url 
*/

case class PokemonSpeciesDetailNamesInnerLanguage(
  name: String,
  url: URI
)
object PokemonSpeciesDetailNamesInnerLanguage {
  implicit val encoderPokemonSpeciesDetailNamesInnerLanguage: Encoder[PokemonSpeciesDetailNamesInnerLanguage] = deriveEncoder[PokemonSpeciesDetailNamesInnerLanguage].mapJson(_.dropNullValues)
  implicit val decoderPokemonSpeciesDetailNamesInnerLanguage: Decoder[PokemonSpeciesDetailNamesInnerLanguage] = deriveDecoder[PokemonSpeciesDetailNamesInnerLanguage]
}

/**
* 
* @param area 
* @param baseUnderscorescore 
* @param rate 
*/

case class PokemonSpeciesDetailPalParkEncountersInner(
  area: PokemonSpeciesDetailPalParkEncountersInnerArea,
  baseUnderscorescore: Int,
  rate: Int
)
object PokemonSpeciesDetailPalParkEncountersInner {
  implicit val encoderPokemonSpeciesDetailPalParkEncountersInner: Encoder[PokemonSpeciesDetailPalParkEncountersInner] = deriveEncoder[PokemonSpeciesDetailPalParkEncountersInner].mapJson(_.dropNullValues)
  implicit val decoderPokemonSpeciesDetailPalParkEncountersInner: Decoder[PokemonSpeciesDetailPalParkEncountersInner] = deriveDecoder[PokemonSpeciesDetailPalParkEncountersInner]
}

/**
* 
* @param name 
* @param url 
*/

case class PokemonSpeciesDetailPalParkEncountersInnerArea(
  name: String,
  url: URI
)
object PokemonSpeciesDetailPalParkEncountersInnerArea {
  implicit val encoderPokemonSpeciesDetailPalParkEncountersInnerArea: Encoder[PokemonSpeciesDetailPalParkEncountersInnerArea] = deriveEncoder[PokemonSpeciesDetailPalParkEncountersInnerArea].mapJson(_.dropNullValues)
  implicit val decoderPokemonSpeciesDetailPalParkEncountersInnerArea: Decoder[PokemonSpeciesDetailPalParkEncountersInnerArea] = deriveDecoder[PokemonSpeciesDetailPalParkEncountersInnerArea]
}

/**
* 
* @param isUnderscoredefault 
* @param pokemon 
*/

case class PokemonSpeciesDetailVarietiesInner(
  isUnderscoredefault: Boolean,
  pokemon: PokemonSpeciesDetailVarietiesInnerPokemon
)
object PokemonSpeciesDetailVarietiesInner {
  implicit val encoderPokemonSpeciesDetailVarietiesInner: Encoder[PokemonSpeciesDetailVarietiesInner] = deriveEncoder[PokemonSpeciesDetailVarietiesInner].mapJson(_.dropNullValues)
  implicit val decoderPokemonSpeciesDetailVarietiesInner: Decoder[PokemonSpeciesDetailVarietiesInner] = deriveDecoder[PokemonSpeciesDetailVarietiesInner]
}

/**
* 
* @param name 
* @param url 
*/

case class PokemonSpeciesDetailVarietiesInnerPokemon(
  name: String,
  url: URI
)
object PokemonSpeciesDetailVarietiesInnerPokemon {
  implicit val encoderPokemonSpeciesDetailVarietiesInnerPokemon: Encoder[PokemonSpeciesDetailVarietiesInnerPokemon] = deriveEncoder[PokemonSpeciesDetailVarietiesInnerPokemon].mapJson(_.dropNullValues)
  implicit val decoderPokemonSpeciesDetailVarietiesInnerPokemon: Decoder[PokemonSpeciesDetailVarietiesInnerPokemon] = deriveDecoder[PokemonSpeciesDetailVarietiesInnerPokemon]
}

/**
* 
* @param flavorUnderscoretext 
* @param language 
* @param version 
*/

case class PokemonSpeciesFlavorText(
  flavorUnderscoretext: String,
  language: LanguageSummary,
  version: VersionSummary
)
object PokemonSpeciesFlavorText {
  implicit val encoderPokemonSpeciesFlavorText: Encoder[PokemonSpeciesFlavorText] = deriveEncoder[PokemonSpeciesFlavorText].mapJson(_.dropNullValues)
  implicit val decoderPokemonSpeciesFlavorText: Decoder[PokemonSpeciesFlavorText] = deriveDecoder[PokemonSpeciesFlavorText]
}

/**
* 
* @param name 
* @param url 
*/

case class PokemonSpeciesSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object PokemonSpeciesSummary {
  implicit val encoderPokemonSpeciesSummary: Encoder[PokemonSpeciesSummary] = deriveEncoder[PokemonSpeciesSummary].mapJson(_.dropNullValues)
  implicit val decoderPokemonSpeciesSummary: Decoder[PokemonSpeciesSummary] = deriveDecoder[PokemonSpeciesSummary]
}

/**
* 
* @param baseUnderscorestat 
* @param effort 
* @param stat 
*/

case class PokemonStat(
  baseUnderscorestat: Int,
  effort: Int,
  stat: StatSummary
)
object PokemonStat {
  implicit val encoderPokemonStat: Encoder[PokemonStat] = deriveEncoder[PokemonStat].mapJson(_.dropNullValues)
  implicit val decoderPokemonStat: Decoder[PokemonStat] = deriveDecoder[PokemonStat]
}

/**
* 
* @param name 
* @param url 
*/

case class PokemonSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object PokemonSummary {
  implicit val encoderPokemonSummary: Encoder[PokemonSummary] = deriveEncoder[PokemonSummary].mapJson(_.dropNullValues)
  implicit val decoderPokemonSummary: Decoder[PokemonSummary] = deriveDecoder[PokemonSummary]
}

/**
* 
* @param id 
* @param name 
* @param locations 
* @param mainUnderscoregeneration 
* @param names 
* @param pokedexes 
* @param versionUnderscoregroups 
*/

case class RegionDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  locations: List[LocationSummary],
  mainUnderscoregeneration: GenerationSummary,
  names: List[RegionName],
  pokedexes: List[PokedexSummary],
  versionUnderscoregroups: List[RegionDetailVersionGroupsInner]
)
object RegionDetail {
  implicit val encoderRegionDetail: Encoder[RegionDetail] = deriveEncoder[RegionDetail].mapJson(_.dropNullValues)
  implicit val decoderRegionDetail: Decoder[RegionDetail] = deriveDecoder[RegionDetail]
}

/**
* 
* @param name 
* @param url 
*/

case class RegionDetailVersionGroupsInner(
  name: String,
  url: URI
)
object RegionDetailVersionGroupsInner {
  implicit val encoderRegionDetailVersionGroupsInner: Encoder[RegionDetailVersionGroupsInner] = deriveEncoder[RegionDetailVersionGroupsInner].mapJson(_.dropNullValues)
  implicit val decoderRegionDetailVersionGroupsInner: Decoder[RegionDetailVersionGroupsInner] = deriveDecoder[RegionDetailVersionGroupsInner]
}

/**
* 
* @param name 
* @param language 
*/

case class RegionName(
  name: Refined[String, MaxSize[100]],
  language: LanguageSummary
)
object RegionName {
  implicit val encoderRegionName: Encoder[RegionName] = deriveEncoder[RegionName].mapJson(_.dropNullValues)
  implicit val decoderRegionName: Decoder[RegionName] = deriveDecoder[RegionName]
}

/**
* 
* @param name 
* @param url 
*/

case class RegionSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object RegionSummary {
  implicit val encoderRegionSummary: Encoder[RegionSummary] = deriveEncoder[RegionSummary].mapJson(_.dropNullValues)
  implicit val decoderRegionSummary: Decoder[RegionSummary] = deriveDecoder[RegionSummary]
}

/**
* 
* @param id 
* @param name 
* @param gameUnderscoreindex 
* @param isUnderscorebattleUnderscoreonly 
* @param affectingUnderscoremoves 
* @param affectingUnderscorenatures 
* @param characteristics 
* @param moveUnderscoredamageUnderscoreclass 
* @param names 
*/

case class StatDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  gameUnderscoreindex: Int,
  isUnderscorebattleUnderscoreonly: Option[Boolean],
  affectingUnderscoremoves: StatDetailAffectingMoves,
  affectingUnderscorenatures: StatDetailAffectingNatures,
  characteristics: List[CharacteristicSummary],
  moveUnderscoredamageUnderscoreclass: MoveDamageClassSummary,
  names: List[StatName]
)
object StatDetail {
  implicit val encoderStatDetail: Encoder[StatDetail] = deriveEncoder[StatDetail].mapJson(_.dropNullValues)
  implicit val decoderStatDetail: Decoder[StatDetail] = deriveDecoder[StatDetail]
}

/**
* 
* @param increase 
* @param decrease 
*/

case class StatDetailAffectingMoves(
  increase: List[StatDetailAffectingMovesIncreaseInner],
  decrease: List[StatDetailAffectingMovesDecreaseInner]
)
object StatDetailAffectingMoves {
  implicit val encoderStatDetailAffectingMoves: Encoder[StatDetailAffectingMoves] = deriveEncoder[StatDetailAffectingMoves].mapJson(_.dropNullValues)
  implicit val decoderStatDetailAffectingMoves: Decoder[StatDetailAffectingMoves] = deriveDecoder[StatDetailAffectingMoves]
}

/**
* 
* @param change 
* @param move 
*/

case class StatDetailAffectingMovesDecreaseInner(
  change: Int,
  move: StatDetailAffectingMovesDecreaseInnerMove
)
object StatDetailAffectingMovesDecreaseInner {
  implicit val encoderStatDetailAffectingMovesDecreaseInner: Encoder[StatDetailAffectingMovesDecreaseInner] = deriveEncoder[StatDetailAffectingMovesDecreaseInner].mapJson(_.dropNullValues)
  implicit val decoderStatDetailAffectingMovesDecreaseInner: Decoder[StatDetailAffectingMovesDecreaseInner] = deriveDecoder[StatDetailAffectingMovesDecreaseInner]
}

/**
* 
* @param name 
* @param url 
*/

case class StatDetailAffectingMovesDecreaseInnerMove(
  name: String,
  url: URI
)
object StatDetailAffectingMovesDecreaseInnerMove {
  implicit val encoderStatDetailAffectingMovesDecreaseInnerMove: Encoder[StatDetailAffectingMovesDecreaseInnerMove] = deriveEncoder[StatDetailAffectingMovesDecreaseInnerMove].mapJson(_.dropNullValues)
  implicit val decoderStatDetailAffectingMovesDecreaseInnerMove: Decoder[StatDetailAffectingMovesDecreaseInnerMove] = deriveDecoder[StatDetailAffectingMovesDecreaseInnerMove]
}

/**
* 
* @param change 
* @param move 
*/

case class StatDetailAffectingMovesIncreaseInner(
  change: Int,
  move: StatDetailAffectingMovesIncreaseInnerMove
)
object StatDetailAffectingMovesIncreaseInner {
  implicit val encoderStatDetailAffectingMovesIncreaseInner: Encoder[StatDetailAffectingMovesIncreaseInner] = deriveEncoder[StatDetailAffectingMovesIncreaseInner].mapJson(_.dropNullValues)
  implicit val decoderStatDetailAffectingMovesIncreaseInner: Decoder[StatDetailAffectingMovesIncreaseInner] = deriveDecoder[StatDetailAffectingMovesIncreaseInner]
}

/**
* 
* @param name 
* @param url 
*/

case class StatDetailAffectingMovesIncreaseInnerMove(
  name: String,
  url: URI
)
object StatDetailAffectingMovesIncreaseInnerMove {
  implicit val encoderStatDetailAffectingMovesIncreaseInnerMove: Encoder[StatDetailAffectingMovesIncreaseInnerMove] = deriveEncoder[StatDetailAffectingMovesIncreaseInnerMove].mapJson(_.dropNullValues)
  implicit val decoderStatDetailAffectingMovesIncreaseInnerMove: Decoder[StatDetailAffectingMovesIncreaseInnerMove] = deriveDecoder[StatDetailAffectingMovesIncreaseInnerMove]
}

/**
* 
* @param increase 
* @param decrease 
*/

case class StatDetailAffectingNatures(
  increase: List[StatDetailAffectingNaturesIncreaseInner],
  decrease: List[StatDetailAffectingNaturesDecreaseInner]
)
object StatDetailAffectingNatures {
  implicit val encoderStatDetailAffectingNatures: Encoder[StatDetailAffectingNatures] = deriveEncoder[StatDetailAffectingNatures].mapJson(_.dropNullValues)
  implicit val decoderStatDetailAffectingNatures: Decoder[StatDetailAffectingNatures] = deriveDecoder[StatDetailAffectingNatures]
}

/**
* 
* @param name 
* @param url 
*/

case class StatDetailAffectingNaturesDecreaseInner(
  name: String,
  url: URI
)
object StatDetailAffectingNaturesDecreaseInner {
  implicit val encoderStatDetailAffectingNaturesDecreaseInner: Encoder[StatDetailAffectingNaturesDecreaseInner] = deriveEncoder[StatDetailAffectingNaturesDecreaseInner].mapJson(_.dropNullValues)
  implicit val decoderStatDetailAffectingNaturesDecreaseInner: Decoder[StatDetailAffectingNaturesDecreaseInner] = deriveDecoder[StatDetailAffectingNaturesDecreaseInner]
}

/**
* 
* @param name 
* @param url 
*/

case class StatDetailAffectingNaturesIncreaseInner(
  name: String,
  url: URI
)
object StatDetailAffectingNaturesIncreaseInner {
  implicit val encoderStatDetailAffectingNaturesIncreaseInner: Encoder[StatDetailAffectingNaturesIncreaseInner] = deriveEncoder[StatDetailAffectingNaturesIncreaseInner].mapJson(_.dropNullValues)
  implicit val decoderStatDetailAffectingNaturesIncreaseInner: Decoder[StatDetailAffectingNaturesIncreaseInner] = deriveDecoder[StatDetailAffectingNaturesIncreaseInner]
}

/**
* 
* @param name 
* @param language 
*/

case class StatName(
  name: Refined[String, MaxSize[100]],
  language: LanguageSummary
)
object StatName {
  implicit val encoderStatName: Encoder[StatName] = deriveEncoder[StatName].mapJson(_.dropNullValues)
  implicit val decoderStatName: Decoder[StatName] = deriveDecoder[StatName]
}

/**
* 
* @param name 
* @param url 
*/

case class StatSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object StatSummary {
  implicit val encoderStatSummary: Encoder[StatSummary] = deriveEncoder[StatSummary].mapJson(_.dropNullValues)
  implicit val decoderStatSummary: Decoder[StatSummary] = deriveDecoder[StatSummary]
}

/**
* 
* @param id 
* @param appeal 
* @param flavorUnderscoretextUnderscoreentries 
* @param moves 
*/

case class SuperContestEffectDetail(
  id: Int,
  appeal: Int,
  flavorUnderscoretextUnderscoreentries: List[SuperContestEffectFlavorText],
  moves: List[MoveSummary]
)
object SuperContestEffectDetail {
  implicit val encoderSuperContestEffectDetail: Encoder[SuperContestEffectDetail] = deriveEncoder[SuperContestEffectDetail].mapJson(_.dropNullValues)
  implicit val decoderSuperContestEffectDetail: Decoder[SuperContestEffectDetail] = deriveDecoder[SuperContestEffectDetail]
}

/**
* 
* @param flavorUnderscoretext 
* @param language 
*/

case class SuperContestEffectFlavorText(
  flavorUnderscoretext: Refined[String, MaxSize[500]],
  language: LanguageSummary
)
object SuperContestEffectFlavorText {
  implicit val encoderSuperContestEffectFlavorText: Encoder[SuperContestEffectFlavorText] = deriveEncoder[SuperContestEffectFlavorText].mapJson(_.dropNullValues)
  implicit val decoderSuperContestEffectFlavorText: Decoder[SuperContestEffectFlavorText] = deriveDecoder[SuperContestEffectFlavorText]
}

/**
* 
* @param url 
*/

case class SuperContestEffectSummary(
  url: URI
)
object SuperContestEffectSummary {
  implicit val encoderSuperContestEffectSummary: Encoder[SuperContestEffectSummary] = deriveEncoder[SuperContestEffectSummary].mapJson(_.dropNullValues)
  implicit val decoderSuperContestEffectSummary: Decoder[SuperContestEffectSummary] = deriveDecoder[SuperContestEffectSummary]
}

/**
* Serializer for the Type resource
* @param id 
* @param name 
* @param damageUnderscorerelations 
* @param pastUnderscoredamageUnderscorerelations 
* @param gameUnderscoreindices 
* @param generation 
* @param moveUnderscoredamageUnderscoreclass 
* @param names 
* @param pokemon 
* @param moves 
* @param sprites 
*/

case class TypeDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  damageUnderscorerelations: TypeDetailDamageRelations,
  pastUnderscoredamageUnderscorerelations: List[TypeDetailPastDamageRelationsInner],
  gameUnderscoreindices: List[TypeGameIndex],
  generation: GenerationSummary,
  moveUnderscoredamageUnderscoreclass: MoveDamageClassSummary,
  names: List[AbilityName],
  pokemon: List[TypeDetailPokemonInner],
  moves: List[MoveSummary],
  sprites: Map[String, Map[String, TypeDetailSpritesValueValue]]
)
object TypeDetail {
  implicit val encoderTypeDetail: Encoder[TypeDetail] = deriveEncoder[TypeDetail].mapJson(_.dropNullValues)
  implicit val decoderTypeDetail: Decoder[TypeDetail] = deriveDecoder[TypeDetail]
}

/**
* 
* @param noUnderscoredamageUnderscoreto 
* @param halfUnderscoredamageUnderscoreto 
* @param doubleUnderscoredamageUnderscoreto 
* @param noUnderscoredamageUnderscorefrom 
* @param halfUnderscoredamageUnderscorefrom 
* @param doubleUnderscoredamageUnderscorefrom 
*/

case class TypeDetailDamageRelations(
  noUnderscoredamageUnderscoreto: List[TypeDetailDamageRelationsNoDamageToInner],
  halfUnderscoredamageUnderscoreto: List[TypeDetailDamageRelationsHalfDamageToInner],
  doubleUnderscoredamageUnderscoreto: List[TypeDetailDamageRelationsDoubleDamageToInner],
  noUnderscoredamageUnderscorefrom: List[TypeDetailDamageRelationsNoDamageFromInner],
  halfUnderscoredamageUnderscorefrom: List[TypeDetailDamageRelationsHalfDamageFromInner],
  doubleUnderscoredamageUnderscorefrom: List[TypeDetailDamageRelationsDoubleDamageFromInner]
)
object TypeDetailDamageRelations {
  implicit val encoderTypeDetailDamageRelations: Encoder[TypeDetailDamageRelations] = deriveEncoder[TypeDetailDamageRelations].mapJson(_.dropNullValues)
  implicit val decoderTypeDetailDamageRelations: Decoder[TypeDetailDamageRelations] = deriveDecoder[TypeDetailDamageRelations]
}

/**
* 
* @param name 
* @param url 
*/

case class TypeDetailDamageRelationsDoubleDamageFromInner(
  name: String,
  url: URI
)
object TypeDetailDamageRelationsDoubleDamageFromInner {
  implicit val encoderTypeDetailDamageRelationsDoubleDamageFromInner: Encoder[TypeDetailDamageRelationsDoubleDamageFromInner] = deriveEncoder[TypeDetailDamageRelationsDoubleDamageFromInner].mapJson(_.dropNullValues)
  implicit val decoderTypeDetailDamageRelationsDoubleDamageFromInner: Decoder[TypeDetailDamageRelationsDoubleDamageFromInner] = deriveDecoder[TypeDetailDamageRelationsDoubleDamageFromInner]
}

/**
* 
* @param name 
* @param url 
*/

case class TypeDetailDamageRelationsDoubleDamageToInner(
  name: String,
  url: URI
)
object TypeDetailDamageRelationsDoubleDamageToInner {
  implicit val encoderTypeDetailDamageRelationsDoubleDamageToInner: Encoder[TypeDetailDamageRelationsDoubleDamageToInner] = deriveEncoder[TypeDetailDamageRelationsDoubleDamageToInner].mapJson(_.dropNullValues)
  implicit val decoderTypeDetailDamageRelationsDoubleDamageToInner: Decoder[TypeDetailDamageRelationsDoubleDamageToInner] = deriveDecoder[TypeDetailDamageRelationsDoubleDamageToInner]
}

/**
* 
* @param name 
* @param url 
*/

case class TypeDetailDamageRelationsHalfDamageFromInner(
  name: String,
  url: URI
)
object TypeDetailDamageRelationsHalfDamageFromInner {
  implicit val encoderTypeDetailDamageRelationsHalfDamageFromInner: Encoder[TypeDetailDamageRelationsHalfDamageFromInner] = deriveEncoder[TypeDetailDamageRelationsHalfDamageFromInner].mapJson(_.dropNullValues)
  implicit val decoderTypeDetailDamageRelationsHalfDamageFromInner: Decoder[TypeDetailDamageRelationsHalfDamageFromInner] = deriveDecoder[TypeDetailDamageRelationsHalfDamageFromInner]
}

/**
* 
* @param name 
* @param url 
*/

case class TypeDetailDamageRelationsHalfDamageToInner(
  name: String,
  url: URI
)
object TypeDetailDamageRelationsHalfDamageToInner {
  implicit val encoderTypeDetailDamageRelationsHalfDamageToInner: Encoder[TypeDetailDamageRelationsHalfDamageToInner] = deriveEncoder[TypeDetailDamageRelationsHalfDamageToInner].mapJson(_.dropNullValues)
  implicit val decoderTypeDetailDamageRelationsHalfDamageToInner: Decoder[TypeDetailDamageRelationsHalfDamageToInner] = deriveDecoder[TypeDetailDamageRelationsHalfDamageToInner]
}

/**
* 
* @param name 
* @param url 
*/

case class TypeDetailDamageRelationsNoDamageFromInner(
  name: String,
  url: URI
)
object TypeDetailDamageRelationsNoDamageFromInner {
  implicit val encoderTypeDetailDamageRelationsNoDamageFromInner: Encoder[TypeDetailDamageRelationsNoDamageFromInner] = deriveEncoder[TypeDetailDamageRelationsNoDamageFromInner].mapJson(_.dropNullValues)
  implicit val decoderTypeDetailDamageRelationsNoDamageFromInner: Decoder[TypeDetailDamageRelationsNoDamageFromInner] = deriveDecoder[TypeDetailDamageRelationsNoDamageFromInner]
}

/**
* 
* @param name 
* @param url 
*/

case class TypeDetailDamageRelationsNoDamageToInner(
  name: String,
  url: URI
)
object TypeDetailDamageRelationsNoDamageToInner {
  implicit val encoderTypeDetailDamageRelationsNoDamageToInner: Encoder[TypeDetailDamageRelationsNoDamageToInner] = deriveEncoder[TypeDetailDamageRelationsNoDamageToInner].mapJson(_.dropNullValues)
  implicit val decoderTypeDetailDamageRelationsNoDamageToInner: Decoder[TypeDetailDamageRelationsNoDamageToInner] = deriveDecoder[TypeDetailDamageRelationsNoDamageToInner]
}

/**
* 
* @param generation 
* @param damageUnderscorerelations 
*/

case class TypeDetailPastDamageRelationsInner(
  generation: TypeDetailPastDamageRelationsInnerGeneration,
  damageUnderscorerelations: TypeDetailPastDamageRelationsInnerDamageRelations
)
object TypeDetailPastDamageRelationsInner {
  implicit val encoderTypeDetailPastDamageRelationsInner: Encoder[TypeDetailPastDamageRelationsInner] = deriveEncoder[TypeDetailPastDamageRelationsInner].mapJson(_.dropNullValues)
  implicit val decoderTypeDetailPastDamageRelationsInner: Decoder[TypeDetailPastDamageRelationsInner] = deriveDecoder[TypeDetailPastDamageRelationsInner]
}

/**
* 
* @param noUnderscoredamageUnderscoreto 
* @param halfUnderscoredamageUnderscoreto 
* @param doubleUnderscoredamageUnderscoreto 
* @param noUnderscoredamageUnderscorefrom 
* @param halfUnderscoredamageUnderscorefrom 
* @param doubleUnderscoredamageUnderscorefrom 
*/

case class TypeDetailPastDamageRelationsInnerDamageRelations(
  noUnderscoredamageUnderscoreto: List[TypeDetailPastDamageRelationsInnerDamageRelationsNoDamageToInner],
  halfUnderscoredamageUnderscoreto: List[TypeDetailPastDamageRelationsInnerDamageRelationsHalfDamageToInner],
  doubleUnderscoredamageUnderscoreto: List[TypeDetailPastDamageRelationsInnerDamageRelationsDoubleDamageToInner],
  noUnderscoredamageUnderscorefrom: List[TypeDetailPastDamageRelationsInnerDamageRelationsNoDamageFromInner],
  halfUnderscoredamageUnderscorefrom: List[TypeDetailPastDamageRelationsInnerDamageRelationsHalfDamageFromInner],
  doubleUnderscoredamageUnderscorefrom: List[TypeDetailPastDamageRelationsInnerDamageRelationsDoubleDamageFromInner]
)
object TypeDetailPastDamageRelationsInnerDamageRelations {
  implicit val encoderTypeDetailPastDamageRelationsInnerDamageRelations: Encoder[TypeDetailPastDamageRelationsInnerDamageRelations] = deriveEncoder[TypeDetailPastDamageRelationsInnerDamageRelations].mapJson(_.dropNullValues)
  implicit val decoderTypeDetailPastDamageRelationsInnerDamageRelations: Decoder[TypeDetailPastDamageRelationsInnerDamageRelations] = deriveDecoder[TypeDetailPastDamageRelationsInnerDamageRelations]
}

/**
* 
* @param name 
* @param url 
*/

case class TypeDetailPastDamageRelationsInnerDamageRelationsDoubleDamageFromInner(
  name: String,
  url: URI
)
object TypeDetailPastDamageRelationsInnerDamageRelationsDoubleDamageFromInner {
  implicit val encoderTypeDetailPastDamageRelationsInnerDamageRelationsDoubleDamageFromInner: Encoder[TypeDetailPastDamageRelationsInnerDamageRelationsDoubleDamageFromInner] = deriveEncoder[TypeDetailPastDamageRelationsInnerDamageRelationsDoubleDamageFromInner].mapJson(_.dropNullValues)
  implicit val decoderTypeDetailPastDamageRelationsInnerDamageRelationsDoubleDamageFromInner: Decoder[TypeDetailPastDamageRelationsInnerDamageRelationsDoubleDamageFromInner] = deriveDecoder[TypeDetailPastDamageRelationsInnerDamageRelationsDoubleDamageFromInner]
}

/**
* 
* @param name 
* @param url 
*/

case class TypeDetailPastDamageRelationsInnerDamageRelationsDoubleDamageToInner(
  name: String,
  url: URI
)
object TypeDetailPastDamageRelationsInnerDamageRelationsDoubleDamageToInner {
  implicit val encoderTypeDetailPastDamageRelationsInnerDamageRelationsDoubleDamageToInner: Encoder[TypeDetailPastDamageRelationsInnerDamageRelationsDoubleDamageToInner] = deriveEncoder[TypeDetailPastDamageRelationsInnerDamageRelationsDoubleDamageToInner].mapJson(_.dropNullValues)
  implicit val decoderTypeDetailPastDamageRelationsInnerDamageRelationsDoubleDamageToInner: Decoder[TypeDetailPastDamageRelationsInnerDamageRelationsDoubleDamageToInner] = deriveDecoder[TypeDetailPastDamageRelationsInnerDamageRelationsDoubleDamageToInner]
}

/**
* 
* @param name 
* @param url 
*/

case class TypeDetailPastDamageRelationsInnerDamageRelationsHalfDamageFromInner(
  name: String,
  url: URI
)
object TypeDetailPastDamageRelationsInnerDamageRelationsHalfDamageFromInner {
  implicit val encoderTypeDetailPastDamageRelationsInnerDamageRelationsHalfDamageFromInner: Encoder[TypeDetailPastDamageRelationsInnerDamageRelationsHalfDamageFromInner] = deriveEncoder[TypeDetailPastDamageRelationsInnerDamageRelationsHalfDamageFromInner].mapJson(_.dropNullValues)
  implicit val decoderTypeDetailPastDamageRelationsInnerDamageRelationsHalfDamageFromInner: Decoder[TypeDetailPastDamageRelationsInnerDamageRelationsHalfDamageFromInner] = deriveDecoder[TypeDetailPastDamageRelationsInnerDamageRelationsHalfDamageFromInner]
}

/**
* 
* @param name 
* @param url 
*/

case class TypeDetailPastDamageRelationsInnerDamageRelationsHalfDamageToInner(
  name: String,
  url: URI
)
object TypeDetailPastDamageRelationsInnerDamageRelationsHalfDamageToInner {
  implicit val encoderTypeDetailPastDamageRelationsInnerDamageRelationsHalfDamageToInner: Encoder[TypeDetailPastDamageRelationsInnerDamageRelationsHalfDamageToInner] = deriveEncoder[TypeDetailPastDamageRelationsInnerDamageRelationsHalfDamageToInner].mapJson(_.dropNullValues)
  implicit val decoderTypeDetailPastDamageRelationsInnerDamageRelationsHalfDamageToInner: Decoder[TypeDetailPastDamageRelationsInnerDamageRelationsHalfDamageToInner] = deriveDecoder[TypeDetailPastDamageRelationsInnerDamageRelationsHalfDamageToInner]
}

/**
* 
* @param name 
* @param url 
*/

case class TypeDetailPastDamageRelationsInnerDamageRelationsNoDamageFromInner(
  name: String,
  url: URI
)
object TypeDetailPastDamageRelationsInnerDamageRelationsNoDamageFromInner {
  implicit val encoderTypeDetailPastDamageRelationsInnerDamageRelationsNoDamageFromInner: Encoder[TypeDetailPastDamageRelationsInnerDamageRelationsNoDamageFromInner] = deriveEncoder[TypeDetailPastDamageRelationsInnerDamageRelationsNoDamageFromInner].mapJson(_.dropNullValues)
  implicit val decoderTypeDetailPastDamageRelationsInnerDamageRelationsNoDamageFromInner: Decoder[TypeDetailPastDamageRelationsInnerDamageRelationsNoDamageFromInner] = deriveDecoder[TypeDetailPastDamageRelationsInnerDamageRelationsNoDamageFromInner]
}

/**
* 
* @param name 
* @param url 
*/

case class TypeDetailPastDamageRelationsInnerDamageRelationsNoDamageToInner(
  name: String,
  url: URI
)
object TypeDetailPastDamageRelationsInnerDamageRelationsNoDamageToInner {
  implicit val encoderTypeDetailPastDamageRelationsInnerDamageRelationsNoDamageToInner: Encoder[TypeDetailPastDamageRelationsInnerDamageRelationsNoDamageToInner] = deriveEncoder[TypeDetailPastDamageRelationsInnerDamageRelationsNoDamageToInner].mapJson(_.dropNullValues)
  implicit val decoderTypeDetailPastDamageRelationsInnerDamageRelationsNoDamageToInner: Decoder[TypeDetailPastDamageRelationsInnerDamageRelationsNoDamageToInner] = deriveDecoder[TypeDetailPastDamageRelationsInnerDamageRelationsNoDamageToInner]
}

/**
* 
* @param name 
* @param url 
*/

case class TypeDetailPastDamageRelationsInnerGeneration(
  name: String,
  url: URI
)
object TypeDetailPastDamageRelationsInnerGeneration {
  implicit val encoderTypeDetailPastDamageRelationsInnerGeneration: Encoder[TypeDetailPastDamageRelationsInnerGeneration] = deriveEncoder[TypeDetailPastDamageRelationsInnerGeneration].mapJson(_.dropNullValues)
  implicit val decoderTypeDetailPastDamageRelationsInnerGeneration: Decoder[TypeDetailPastDamageRelationsInnerGeneration] = deriveDecoder[TypeDetailPastDamageRelationsInnerGeneration]
}

/**
* 
* @param slot 
* @param pokemon 
*/

case class TypeDetailPokemonInner(
  slot: Option[Int],
  pokemon: Option[TypeDetailPokemonInnerPokemon]
)
object TypeDetailPokemonInner {
  implicit val encoderTypeDetailPokemonInner: Encoder[TypeDetailPokemonInner] = deriveEncoder[TypeDetailPokemonInner].mapJson(_.dropNullValues)
  implicit val decoderTypeDetailPokemonInner: Decoder[TypeDetailPokemonInner] = deriveDecoder[TypeDetailPokemonInner]
}

/**
* 
* @param name The name of the pokemon
* @param url The URL to get more information about the pokemon
*/

case class TypeDetailPokemonInnerPokemon(
  name: Option[String],
  url: Option[URI]
)
object TypeDetailPokemonInnerPokemon {
  implicit val encoderTypeDetailPokemonInnerPokemon: Encoder[TypeDetailPokemonInnerPokemon] = deriveEncoder[TypeDetailPokemonInnerPokemon].mapJson(_.dropNullValues)
  implicit val decoderTypeDetailPokemonInnerPokemon: Decoder[TypeDetailPokemonInnerPokemon] = deriveDecoder[TypeDetailPokemonInnerPokemon]
}

/**
* 
* @param nameMinusicon 
*/

case class TypeDetailSpritesValueValue(
  nameMinusicon: Option[URI]
)
object TypeDetailSpritesValueValue {
  implicit val encoderTypeDetailSpritesValueValue: Encoder[TypeDetailSpritesValueValue] = deriveEncoder[TypeDetailSpritesValueValue].mapJson(_.dropNullValues)
  implicit val decoderTypeDetailSpritesValueValue: Decoder[TypeDetailSpritesValueValue] = deriveDecoder[TypeDetailSpritesValueValue]
}

/**
* 
* @param gameUnderscoreindex 
* @param generation 
*/

case class TypeGameIndex(
  gameUnderscoreindex: Int,
  generation: GenerationSummary
)
object TypeGameIndex {
  implicit val encoderTypeGameIndex: Encoder[TypeGameIndex] = deriveEncoder[TypeGameIndex].mapJson(_.dropNullValues)
  implicit val decoderTypeGameIndex: Decoder[TypeGameIndex] = deriveDecoder[TypeGameIndex]
}

/**
* 
* @param name 
* @param url 
*/

case class TypeSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object TypeSummary {
  implicit val encoderTypeSummary: Encoder[TypeSummary] = deriveEncoder[TypeSummary].mapJson(_.dropNullValues)
  implicit val decoderTypeSummary: Decoder[TypeSummary] = deriveDecoder[TypeSummary]
}

/**
* Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I'm not sure how to add anything other than a hyperlink
* @param id 
* @param name 
* @param names 
* @param versionUnderscoregroup 
*/

case class VersionDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  names: List[VersionName],
  versionUnderscoregroup: VersionGroupSummary
)
object VersionDetail {
  implicit val encoderVersionDetail: Encoder[VersionDetail] = deriveEncoder[VersionDetail].mapJson(_.dropNullValues)
  implicit val decoderVersionDetail: Decoder[VersionDetail] = deriveDecoder[VersionDetail]
}

/**
* 
* @param id 
* @param name 
* @param order 
* @param generation 
* @param moveUnderscorelearnUnderscoremethods 
* @param pokedexes 
* @param regions 
* @param versions 
*/

case class VersionGroupDetail(
  id: Int,
  name: Refined[String, MaxSize[100]],
  order: Option[Int],
  generation: GenerationSummary,
  moveUnderscorelearnUnderscoremethods: List[VersionGroupDetailMoveLearnMethodsInner],
  pokedexes: List[VersionGroupDetailPokedexesInner],
  regions: List[VersionGroupDetailRegionsInner],
  versions: List[VersionSummary]
)
object VersionGroupDetail {
  implicit val encoderVersionGroupDetail: Encoder[VersionGroupDetail] = deriveEncoder[VersionGroupDetail].mapJson(_.dropNullValues)
  implicit val decoderVersionGroupDetail: Decoder[VersionGroupDetail] = deriveDecoder[VersionGroupDetail]
}

/**
* 
* @param name 
* @param url 
*/

case class VersionGroupDetailMoveLearnMethodsInner(
  name: String,
  url: URI
)
object VersionGroupDetailMoveLearnMethodsInner {
  implicit val encoderVersionGroupDetailMoveLearnMethodsInner: Encoder[VersionGroupDetailMoveLearnMethodsInner] = deriveEncoder[VersionGroupDetailMoveLearnMethodsInner].mapJson(_.dropNullValues)
  implicit val decoderVersionGroupDetailMoveLearnMethodsInner: Decoder[VersionGroupDetailMoveLearnMethodsInner] = deriveDecoder[VersionGroupDetailMoveLearnMethodsInner]
}

/**
* 
* @param name 
* @param url 
*/

case class VersionGroupDetailPokedexesInner(
  name: String,
  url: URI
)
object VersionGroupDetailPokedexesInner {
  implicit val encoderVersionGroupDetailPokedexesInner: Encoder[VersionGroupDetailPokedexesInner] = deriveEncoder[VersionGroupDetailPokedexesInner].mapJson(_.dropNullValues)
  implicit val decoderVersionGroupDetailPokedexesInner: Decoder[VersionGroupDetailPokedexesInner] = deriveDecoder[VersionGroupDetailPokedexesInner]
}

/**
* 
* @param name 
* @param url 
*/

case class VersionGroupDetailRegionsInner(
  name: String,
  url: URI
)
object VersionGroupDetailRegionsInner {
  implicit val encoderVersionGroupDetailRegionsInner: Encoder[VersionGroupDetailRegionsInner] = deriveEncoder[VersionGroupDetailRegionsInner].mapJson(_.dropNullValues)
  implicit val decoderVersionGroupDetailRegionsInner: Decoder[VersionGroupDetailRegionsInner] = deriveDecoder[VersionGroupDetailRegionsInner]
}

/**
* 
* @param name 
* @param url 
*/

case class VersionGroupSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object VersionGroupSummary {
  implicit val encoderVersionGroupSummary: Encoder[VersionGroupSummary] = deriveEncoder[VersionGroupSummary].mapJson(_.dropNullValues)
  implicit val decoderVersionGroupSummary: Decoder[VersionGroupSummary] = deriveDecoder[VersionGroupSummary]
}

/**
* 
* @param name 
* @param language 
*/

case class VersionName(
  name: Refined[String, MaxSize[100]],
  language: LanguageSummary
)
object VersionName {
  implicit val encoderVersionName: Encoder[VersionName] = deriveEncoder[VersionName].mapJson(_.dropNullValues)
  implicit val decoderVersionName: Decoder[VersionName] = deriveDecoder[VersionName]
}

/**
* 
* @param name 
* @param url 
*/

case class VersionSummary(
  name: Refined[String, MaxSize[100]],
  url: URI
)
object VersionSummary {
  implicit val encoderVersionSummary: Encoder[VersionSummary] = deriveEncoder[VersionSummary].mapJson(_.dropNullValues)
  implicit val decoderVersionSummary: Decoder[VersionSummary] = deriveDecoder[VersionSummary]
}

