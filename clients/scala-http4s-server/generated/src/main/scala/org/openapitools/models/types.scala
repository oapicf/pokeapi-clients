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

/**
* 
* @param versionUnderscoregroup The version group in which the previous effect of this ability originated.
* @param effectUnderscoreentries The previous effect of this ability listed in different languages.
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
* @param effect The localized effect text for an API resource in a specific language.
* @param language The language this effect is in.
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
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param isUnderscoremainUnderscoreseries Whether or not this ability originated in the main series of the video games.
* @param generation The generation this ability originated in.
* @param names The name of this resource listed in different languages.
* @param effectUnderscoreentries The effect of this ability listed in different languages.
* @param effectUnderscorechanges The list of previous effects this ability has had across version groups.
* @param flavorUnderscoretextUnderscoreentries The flavor text of this ability listed in different languages.
* @param pokemon A list of Pokémon that could potentially have this ability.
*/

case class AbilityDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  isUnderscoremainUnderscoreseries: Option[Boolean],
  generation: GenerationSummary,
  names: List[AbilityName],
  effectUnderscoreentries: List[AbilityEffectText],
  effectUnderscorechanges: List[AbilityChange],
  flavorUnderscoretextUnderscoreentries: List[AbilityFlavorText],
  pokemon: List[AbilityPokemonDetail]
)
object AbilityDetail {
  implicit val encoderAbilityDetail: Encoder[AbilityDetail] = deriveEncoder[AbilityDetail].mapJson(_.dropNullValues)
  implicit val decoderAbilityDetail: Decoder[AbilityDetail] = deriveDecoder[AbilityDetail]
}

/**
* 
* @param effect The localized effect text for an API resource in a specific language.
* @param shortUnderscoreeffect The localized effect text in brief.
* @param language The language this effect is in.
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
* @param flavorUnderscoretext The localized name for an API resource in a specific language.
* @param language The language this text resource is in.
* @param versionUnderscoregroup The version group that uses this flavor text.
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
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class AbilityName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object AbilityName {
  implicit val encoderAbilityName: Encoder[AbilityName] = deriveEncoder[AbilityName].mapJson(_.dropNullValues)
  implicit val decoderAbilityName: Decoder[AbilityName] = deriveDecoder[AbilityName]
}

/**
* 
* @param isUnderscorehidden Whether or not this a hidden ability for the referenced Pokémon.
* @param slot Pokémon have 3 ability 'slots' which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon.
* @param pokemon The Pokémon this ability could belong to.
*/

case class AbilityPokemonDetail(
  isUnderscorehidden: Option[Boolean],
  slot: Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]],
  pokemon: PokemonSummary
)
object AbilityPokemonDetail {
  implicit val encoderAbilityPokemonDetail: Encoder[AbilityPokemonDetail] = deriveEncoder[AbilityPokemonDetail].mapJson(_.dropNullValues)
  implicit val decoderAbilityPokemonDetail: Decoder[AbilityPokemonDetail] = deriveDecoder[AbilityPokemonDetail]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class AbilitySummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object AbilitySummary {
  implicit val encoderAbilitySummary: Encoder[AbilitySummary] = deriveEncoder[AbilitySummary].mapJson(_.dropNullValues)
  implicit val decoderAbilitySummary: Decoder[AbilitySummary] = deriveDecoder[AbilitySummary]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param growthUnderscoretime Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.
* @param maxUnderscoreharvest The maximum number of these berries that can grow on one tree in Generation IV.
* @param naturalUnderscoregiftUnderscorepower The power of the move \"Natural Gift\" when used with this Berry.
* @param size The size of this Berry, in millimeters.
* @param smoothness The smoothness of this Berry, used in making Pokéblocks or Poffins.
* @param soilUnderscoredryness The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.
* @param firmness The firmness of this berry, used in making Pokéblocks or Poffins.
* @param flavors A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.
* @param item Berries are actually items. This is a reference to the item specific data for this berry.
* @param naturalUnderscoregiftUnderscoretype The type inherited by \"Natural Gift\" when used with this Berry.
*/

case class BerryDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  growthUnderscoretime: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  maxUnderscoreharvest: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  naturalUnderscoregiftUnderscorepower: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  size: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  smoothness: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  soilUnderscoredryness: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  firmness: BerryFirmnessSummary,
  flavors: List[BerryFlavorMap],
  item: ItemSummary,
  naturalUnderscoregiftUnderscoretype: TypeSummary
)
object BerryDetail {
  implicit val encoderBerryDetail: Encoder[BerryDetail] = deriveEncoder[BerryDetail].mapJson(_.dropNullValues)
  implicit val decoderBerryDetail: Decoder[BerryDetail] = deriveDecoder[BerryDetail]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param berries A list of the berries with this firmness.
* @param names The name of this resource listed in different languages.
*/

case class BerryFirmnessDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  berries: List[BerrySummary],
  names: List[BerryFirmnessName]
)
object BerryFirmnessDetail {
  implicit val encoderBerryFirmnessDetail: Encoder[BerryFirmnessDetail] = deriveEncoder[BerryFirmnessDetail].mapJson(_.dropNullValues)
  implicit val decoderBerryFirmnessDetail: Decoder[BerryFirmnessDetail] = deriveDecoder[BerryFirmnessDetail]
}

/**
* 
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class BerryFirmnessName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object BerryFirmnessName {
  implicit val encoderBerryFirmnessName: Encoder[BerryFirmnessName] = deriveEncoder[BerryFirmnessName].mapJson(_.dropNullValues)
  implicit val decoderBerryFirmnessName: Decoder[BerryFirmnessName] = deriveDecoder[BerryFirmnessName]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class BerryFirmnessSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object BerryFirmnessSummary {
  implicit val encoderBerryFirmnessSummary: Encoder[BerryFirmnessSummary] = deriveEncoder[BerryFirmnessSummary].mapJson(_.dropNullValues)
  implicit val decoderBerryFirmnessSummary: Decoder[BerryFirmnessSummary] = deriveDecoder[BerryFirmnessSummary]
}

/**
* 
* @param potency How powerful the referenced flavor is for this berry.
* @param berry The berry with the referenced flavor.
*/

case class BerryFlavorBerryMap(
  potency: Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]],
  berry: BerrySummary
)
object BerryFlavorBerryMap {
  implicit val encoderBerryFlavorBerryMap: Encoder[BerryFlavorBerryMap] = deriveEncoder[BerryFlavorBerryMap].mapJson(_.dropNullValues)
  implicit val decoderBerryFlavorBerryMap: Decoder[BerryFlavorBerryMap] = deriveDecoder[BerryFlavorBerryMap]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param berries A list of the berries with this flavor.
* @param contestUnderscoretype The contest type that correlates with this berry flavor.
* @param names The name of this resource listed in different languages.
*/

case class BerryFlavorDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  berries: List[BerryFlavorBerryMap],
  contestUnderscoretype: ContestTypeSummary,
  names: List[BerryFlavorName]
)
object BerryFlavorDetail {
  implicit val encoderBerryFlavorDetail: Encoder[BerryFlavorDetail] = deriveEncoder[BerryFlavorDetail].mapJson(_.dropNullValues)
  implicit val decoderBerryFlavorDetail: Decoder[BerryFlavorDetail] = deriveDecoder[BerryFlavorDetail]
}

/**
* 
* @param potency How powerful the referenced flavor is for this berry.
* @param flavor The referenced berry flavor.
*/

case class BerryFlavorMap(
  potency: Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]],
  flavor: BerryFlavorSummary
)
object BerryFlavorMap {
  implicit val encoderBerryFlavorMap: Encoder[BerryFlavorMap] = deriveEncoder[BerryFlavorMap].mapJson(_.dropNullValues)
  implicit val decoderBerryFlavorMap: Decoder[BerryFlavorMap] = deriveDecoder[BerryFlavorMap]
}

/**
* 
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class BerryFlavorName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object BerryFlavorName {
  implicit val encoderBerryFlavorName: Encoder[BerryFlavorName] = deriveEncoder[BerryFlavorName].mapJson(_.dropNullValues)
  implicit val decoderBerryFlavorName: Decoder[BerryFlavorName] = deriveDecoder[BerryFlavorName]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class BerryFlavorSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object BerryFlavorSummary {
  implicit val encoderBerryFlavorSummary: Encoder[BerryFlavorSummary] = deriveEncoder[BerryFlavorSummary].mapJson(_.dropNullValues)
  implicit val decoderBerryFlavorSummary: Decoder[BerryFlavorSummary] = deriveDecoder[BerryFlavorSummary]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class BerrySummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object BerrySummary {
  implicit val encoderBerrySummary: Encoder[BerrySummary] = deriveEncoder[BerrySummary].mapJson(_.dropNullValues)
  implicit val decoderBerrySummary: Decoder[BerrySummary] = deriveDecoder[BerrySummary]
}

/**
* 
* @param description The localized description for an API resource in a specific language.
* @param language The language this name is in.
*/

case class CharacteristicDescription(
  description: Option[Refined[String, MaxSize[2000]]],
  language: LanguageSummary
)
object CharacteristicDescription {
  implicit val encoderCharacteristicDescription: Encoder[CharacteristicDescription] = deriveEncoder[CharacteristicDescription].mapJson(_.dropNullValues)
  implicit val decoderCharacteristicDescription: Decoder[CharacteristicDescription] = deriveDecoder[CharacteristicDescription]
}

/**
* 
* @param id The identifier for this resource.
* @param geneUnderscoremodulo The remainder of the highest stat/IV divided by 5.
* @param possibleUnderscorevalues The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5.
* @param highestUnderscorestat The stat which results in this characteristic.
* @param descriptions The descriptions of this characteristic listed in different languages.
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
* @param url The URL of the referenced resource.
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
* @param id The identifier for this resource.
* @param appeal The base number of hearts the user of this move gets.
* @param jam The base number of hearts the user's opponent loses.
* @param effectUnderscoreentries The result of this contest effect listed in different languages.
* @param flavorUnderscoretextUnderscoreentries The flavor text of this contest effect listed in different languages.
*/

case class ContestEffectDetail(
  id: Int,
  appeal: Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]],
  jam: Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]],
  effectUnderscoreentries: List[ContestEffectEffectText],
  flavorUnderscoretextUnderscoreentries: List[ContestEffectFlavorText]
)
object ContestEffectDetail {
  implicit val encoderContestEffectDetail: Encoder[ContestEffectDetail] = deriveEncoder[ContestEffectDetail].mapJson(_.dropNullValues)
  implicit val decoderContestEffectDetail: Decoder[ContestEffectDetail] = deriveDecoder[ContestEffectDetail]
}

/**
* 
* @param effect The localized effect text for an API resource in a specific language.
* @param language The language this effect is in.
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
* @param flavorUnderscoretext The localized flavor text for an API resource in a specific language.
* @param language The language this name is in.
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
* @param url The URL of the referenced resource.
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
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param berryUnderscoreflavor The berry flavor that correlates with this contest type.
* @param names The name of this contest type listed in different languages.
*/

case class ContestTypeDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  berryUnderscoreflavor: BerryFlavorSummary,
  names: List[ContestTypeName]
)
object ContestTypeDetail {
  implicit val encoderContestTypeDetail: Encoder[ContestTypeDetail] = deriveEncoder[ContestTypeDetail].mapJson(_.dropNullValues)
  implicit val decoderContestTypeDetail: Decoder[ContestTypeDetail] = deriveDecoder[ContestTypeDetail]
}

/**
* 
* @param name The name for this contest.
* @param color The color associated with this contest's name.
* @param language The language that this name is in.
*/

case class ContestTypeName(
  name: Refined[String, MaxSize[200]],
  color: Refined[String, MaxSize[10]],
  language: LanguageSummary
)
object ContestTypeName {
  implicit val encoderContestTypeName: Encoder[ContestTypeName] = deriveEncoder[ContestTypeName].mapJson(_.dropNullValues)
  implicit val decoderContestTypeName: Decoder[ContestTypeName] = deriveDecoder[ContestTypeName]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class ContestTypeSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object ContestTypeSummary {
  implicit val encoderContestTypeSummary: Encoder[ContestTypeSummary] = deriveEncoder[ContestTypeSummary].mapJson(_.dropNullValues)
  implicit val decoderContestTypeSummary: Decoder[ContestTypeSummary] = deriveDecoder[ContestTypeSummary]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param names The name of this resource listed in different languages.
*/

case class CurrencyDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  names: List[CurrencyName]
)
object CurrencyDetail {
  implicit val encoderCurrencyDetail: Encoder[CurrencyDetail] = deriveEncoder[CurrencyDetail].mapJson(_.dropNullValues)
  implicit val decoderCurrencyDetail: Decoder[CurrencyDetail] = deriveDecoder[CurrencyDetail]
}

/**
* 
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class CurrencyName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object CurrencyName {
  implicit val encoderCurrencyName: Encoder[CurrencyName] = deriveEncoder[CurrencyName].mapJson(_.dropNullValues)
  implicit val decoderCurrencyName: Decoder[CurrencyName] = deriveDecoder[CurrencyName]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class CurrencySummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object CurrencySummary {
  implicit val encoderCurrencySummary: Encoder[CurrencySummary] = deriveEncoder[CurrencySummary].mapJson(_.dropNullValues)
  implicit val decoderCurrencySummary: Decoder[CurrencySummary] = deriveDecoder[CurrencySummary]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param names The name of this resource listed in different languages.
* @param pokemonUnderscorespecies A list of all Pokémon species that are members of this egg group.
*/

case class EggGroupDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  names: List[EggGroupName],
  pokemonUnderscorespecies: List[PokemonSpeciesSummary]
)
object EggGroupDetail {
  implicit val encoderEggGroupDetail: Encoder[EggGroupDetail] = deriveEncoder[EggGroupDetail].mapJson(_.dropNullValues)
  implicit val decoderEggGroupDetail: Decoder[EggGroupDetail] = deriveDecoder[EggGroupDetail]
}

/**
* 
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class EggGroupName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object EggGroupName {
  implicit val encoderEggGroupName: Encoder[EggGroupName] = deriveEncoder[EggGroupName].mapJson(_.dropNullValues)
  implicit val decoderEggGroupName: Decoder[EggGroupName] = deriveDecoder[EggGroupName]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class EggGroupSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object EggGroupSummary {
  implicit val encoderEggGroupSummary: Encoder[EggGroupSummary] = deriveEncoder[EggGroupSummary].mapJson(_.dropNullValues)
  implicit val decoderEggGroupSummary: Decoder[EggGroupSummary] = deriveDecoder[EggGroupSummary]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param values A list of possible values for this encounter condition.
* @param names The name of this resource listed in different languages.
*/

case class EncounterConditionDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  values: List[EncounterConditionValueSummary],
  names: List[EncounterConditionName]
)
object EncounterConditionDetail {
  implicit val encoderEncounterConditionDetail: Encoder[EncounterConditionDetail] = deriveEncoder[EncounterConditionDetail].mapJson(_.dropNullValues)
  implicit val decoderEncounterConditionDetail: Decoder[EncounterConditionDetail] = deriveDecoder[EncounterConditionDetail]
}

/**
* 
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class EncounterConditionName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object EncounterConditionName {
  implicit val encoderEncounterConditionName: Encoder[EncounterConditionName] = deriveEncoder[EncounterConditionName].mapJson(_.dropNullValues)
  implicit val decoderEncounterConditionName: Decoder[EncounterConditionName] = deriveDecoder[EncounterConditionName]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class EncounterConditionSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object EncounterConditionSummary {
  implicit val encoderEncounterConditionSummary: Encoder[EncounterConditionSummary] = deriveEncoder[EncounterConditionSummary].mapJson(_.dropNullValues)
  implicit val decoderEncounterConditionSummary: Decoder[EncounterConditionSummary] = deriveDecoder[EncounterConditionSummary]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param condition The condition this encounter condition value pertains to.
* @param names The name of this resource listed in different languages.
*/

case class EncounterConditionValueDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  condition: EncounterConditionSummary,
  names: List[EncounterConditionValueName]
)
object EncounterConditionValueDetail {
  implicit val encoderEncounterConditionValueDetail: Encoder[EncounterConditionValueDetail] = deriveEncoder[EncounterConditionValueDetail].mapJson(_.dropNullValues)
  implicit val decoderEncounterConditionValueDetail: Decoder[EncounterConditionValueDetail] = deriveDecoder[EncounterConditionValueDetail]
}

/**
* 
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class EncounterConditionValueName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object EncounterConditionValueName {
  implicit val encoderEncounterConditionValueName: Encoder[EncounterConditionValueName] = deriveEncoder[EncounterConditionValueName].mapJson(_.dropNullValues)
  implicit val decoderEncounterConditionValueName: Decoder[EncounterConditionValueName] = deriveDecoder[EncounterConditionValueName]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class EncounterConditionValueSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object EncounterConditionValueSummary {
  implicit val encoderEncounterConditionValueSummary: Encoder[EncounterConditionValueSummary] = deriveEncoder[EncounterConditionValueSummary].mapJson(_.dropNullValues)
  implicit val decoderEncounterConditionValueSummary: Decoder[EncounterConditionValueSummary] = deriveDecoder[EncounterConditionValueSummary]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param order A good value for sorting.
* @param names The name of this resource listed in different languages.
*/

case class EncounterMethodDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  order: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  names: List[EncounterMethodName]
)
object EncounterMethodDetail {
  implicit val encoderEncounterMethodDetail: Encoder[EncounterMethodDetail] = deriveEncoder[EncounterMethodDetail].mapJson(_.dropNullValues)
  implicit val decoderEncounterMethodDetail: Decoder[EncounterMethodDetail] = deriveDecoder[EncounterMethodDetail]
}

/**
* 
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class EncounterMethodName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object EncounterMethodName {
  implicit val encoderEncounterMethodName: Encoder[EncounterMethodName] = deriveEncoder[EncounterMethodName].mapJson(_.dropNullValues)
  implicit val decoderEncounterMethodName: Decoder[EncounterMethodName] = deriveDecoder[EncounterMethodName]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class EncounterMethodSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object EncounterMethodSummary {
  implicit val encoderEncounterMethodSummary: Encoder[EncounterMethodSummary] = deriveEncoder[EncounterMethodSummary].mapJson(_.dropNullValues)
  implicit val decoderEncounterMethodSummary: Decoder[EncounterMethodSummary] = deriveDecoder[EncounterMethodSummary]
}

/**
* 
* @param minUnderscoreperfectUnderscoreivs The minimum number of perfect IVs, or null if unspecified.
* @param alwaysUnderscoreshiny Whether the encountered Pokémon is always shiny.
* @param neverUnderscoreshiny Whether the encountered Pokémon can never be shiny.
* @param isUnderscorealpha Whether the encountered Pokémon is an alpha Pokémon.
*/

case class EncounterPokemonDetail(
  minUnderscoreperfectUnderscoreivs: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  alwaysUnderscoreshiny: Option[Boolean],
  neverUnderscoreshiny: Option[Boolean],
  isUnderscorealpha: Option[Boolean]
)
object EncounterPokemonDetail {
  implicit val encoderEncounterPokemonDetail: Encoder[EncounterPokemonDetail] = deriveEncoder[EncounterPokemonDetail].mapJson(_.dropNullValues)
  implicit val decoderEncounterPokemonDetail: Decoder[EncounterPokemonDetail] = deriveDecoder[EncounterPokemonDetail]
}

/**
* 
* @param id The identifier for this resource.
* @param babyUnderscoretriggerUnderscoreitem The item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon.
* @param chain The base chain link object. Each link contains evolution details for a Pokémon in the chain. Each link references the next Pokémon in the natural evolution order.
*/

case class EvolutionChainDetail(
  id: Int,
  babyUnderscoretriggerUnderscoreitem: ItemSummary,
  chain: EvolutionChainLink
)
object EvolutionChainDetail {
  implicit val encoderEvolutionChainDetail: Encoder[EvolutionChainDetail] = deriveEncoder[EvolutionChainDetail].mapJson(_.dropNullValues)
  implicit val decoderEvolutionChainDetail: Decoder[EvolutionChainDetail] = deriveDecoder[EvolutionChainDetail]
}

/**
* 
* @param isUnderscorebaby Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
* @param species The Pokémon species at this point in the evolution chain.
* @param evolutionUnderscoredetails All details regarding the specific details of the referenced Pokémon species evolution.
* @param evolvesUnderscoreto A List of chain objects.
*/

case class EvolutionChainLink(
  isUnderscorebaby: Boolean,
  species: PokemonSpeciesSummary,
  evolutionUnderscoredetails: List[PokemonEvolution],
  evolvesUnderscoreto: List[EvolutionChainLink]
)
object EvolutionChainLink {
  implicit val encoderEvolutionChainLink: Encoder[EvolutionChainLink] = deriveEncoder[EvolutionChainLink].mapJson(_.dropNullValues)
  implicit val decoderEvolutionChainLink: Decoder[EvolutionChainLink] = deriveDecoder[EvolutionChainLink]
}

/**
* 
* @param url The URL of the referenced resource.
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
* @param expression Evaluatable RPN condition expression using evolution variables (e.g. 'EC 100 % 0 ==')
* @param percentageUnderscorechance Percentage chance of evolution under this condition (0-100)
* @param variables Evolution variables referenced in the expression
*/

case class EvolutionConditionExpression(
  expression: String,
  percentageUnderscorechance: Double,
  variables: List[EvolutionVariableSummary]
)
object EvolutionConditionExpression {
  implicit val encoderEvolutionConditionExpression: Encoder[EvolutionConditionExpression] = deriveEncoder[EvolutionConditionExpression].mapJson(_.dropNullValues)
  implicit val decoderEvolutionConditionExpression: Decoder[EvolutionConditionExpression] = deriveDecoder[EvolutionConditionExpression]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param names The name of this resource listed in different languages.
* @param pokemonUnderscorespecies A list of pokemon species that result from this evolution trigger.
*/

case class EvolutionTriggerDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  names: List[EvolutionTriggerName],
  pokemonUnderscorespecies: List[PokemonSpeciesSummary]
)
object EvolutionTriggerDetail {
  implicit val encoderEvolutionTriggerDetail: Encoder[EvolutionTriggerDetail] = deriveEncoder[EvolutionTriggerDetail].mapJson(_.dropNullValues)
  implicit val decoderEvolutionTriggerDetail: Decoder[EvolutionTriggerDetail] = deriveDecoder[EvolutionTriggerDetail]
}

/**
* 
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class EvolutionTriggerName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object EvolutionTriggerName {
  implicit val encoderEvolutionTriggerName: Encoder[EvolutionTriggerName] = deriveEncoder[EvolutionTriggerName].mapJson(_.dropNullValues)
  implicit val decoderEvolutionTriggerName: Decoder[EvolutionTriggerName] = deriveDecoder[EvolutionTriggerName]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class EvolutionTriggerSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object EvolutionTriggerSummary {
  implicit val encoderEvolutionTriggerSummary: Encoder[EvolutionTriggerSummary] = deriveEncoder[EvolutionTriggerSummary].mapJson(_.dropNullValues)
  implicit val decoderEvolutionTriggerSummary: Decoder[EvolutionTriggerSummary] = deriveDecoder[EvolutionTriggerSummary]
}

/**
* 
* @param description The localized description for an API resource in a specific language.
* @param language The language this name is in.
*/

case class EvolutionVariableDescription(
  description: Option[Refined[String, MaxSize[2000]]],
  language: LanguageSummary
)
object EvolutionVariableDescription {
  implicit val encoderEvolutionVariableDescription: Encoder[EvolutionVariableDescription] = deriveEncoder[EvolutionVariableDescription].mapJson(_.dropNullValues)
  implicit val decoderEvolutionVariableDescription: Decoder[EvolutionVariableDescription] = deriveDecoder[EvolutionVariableDescription]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param symbol The symbol used for this variable in evolution condition expressions.
* @param dataUnderscoretype The data type of this variable.
* @param source The source of the variable value.
* @param versionUnderscoregroup The version group in which this variable was introduced.
* @param names The name of this resource listed in different languages.
* @param descriptions The description of this resource listed in different languages.
*/

case class EvolutionVariableDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  symbol: Refined[String, MaxSize[10]],
  dataUnderscoretype: Option[Refined[String, MaxSize[20]]],
  source: Option[Refined[String, MaxSize[20]]],
  versionUnderscoregroup: VersionGroupSummary,
  names: List[EvolutionVariableName],
  descriptions: List[EvolutionVariableDescription]
)
object EvolutionVariableDetail {
  implicit val encoderEvolutionVariableDetail: Encoder[EvolutionVariableDetail] = deriveEncoder[EvolutionVariableDetail].mapJson(_.dropNullValues)
  implicit val decoderEvolutionVariableDetail: Decoder[EvolutionVariableDetail] = deriveDecoder[EvolutionVariableDetail]
}

/**
* 
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class EvolutionVariableName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object EvolutionVariableName {
  implicit val encoderEvolutionVariableName: Encoder[EvolutionVariableName] = deriveEncoder[EvolutionVariableName].mapJson(_.dropNullValues)
  implicit val decoderEvolutionVariableName: Decoder[EvolutionVariableName] = deriveDecoder[EvolutionVariableName]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class EvolutionVariableSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object EvolutionVariableSummary {
  implicit val encoderEvolutionVariableSummary: Encoder[EvolutionVariableSummary] = deriveEncoder[EvolutionVariableSummary].mapJson(_.dropNullValues)
  implicit val decoderEvolutionVariableSummary: Decoder[EvolutionVariableSummary] = deriveDecoder[EvolutionVariableSummary]
}

/**
* 
* @param level The level gained.
* @param experience The amount of experience required to reach the referenced level.
*/

case class Experience(
  level: Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]],
  experience: Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]
)
object Experience {
  implicit val encoderExperience: Encoder[Experience] = deriveEncoder[Experience].mapJson(_.dropNullValues)
  implicit val decoderExperience: Decoder[Experience] = deriveDecoder[Experience]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param pokemonUnderscorespeciesUnderscoredetails A list of Pokémon species that can be this gender and how likely it is that they will be.
* @param requiredUnderscoreforUnderscoreevolution A list of Pokémon species that required this gender in order for a Pokémon to evolve into them.
*/

case class GenderDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  pokemonUnderscorespeciesUnderscoredetails: List[GenderPokemonSpecies],
  requiredUnderscoreforUnderscoreevolution: List[PokemonSpeciesSummary]
)
object GenderDetail {
  implicit val encoderGenderDetail: Encoder[GenderDetail] = deriveEncoder[GenderDetail].mapJson(_.dropNullValues)
  implicit val decoderGenderDetail: Decoder[GenderDetail] = deriveDecoder[GenderDetail]
}

/**
* 
* @param rate The chance of this Pokémon being female, in eighths; or -1 for genderless.
* @param pokemonUnderscorespecies A Pokémon species that can be the referenced gender.
*/

case class GenderPokemonSpecies(
  rate: Int,
  pokemonUnderscorespecies: PokemonSpeciesSummary
)
object GenderPokemonSpecies {
  implicit val encoderGenderPokemonSpecies: Encoder[GenderPokemonSpecies] = deriveEncoder[GenderPokemonSpecies].mapJson(_.dropNullValues)
  implicit val decoderGenderPokemonSpecies: Decoder[GenderPokemonSpecies] = deriveDecoder[GenderPokemonSpecies]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class GenderSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object GenderSummary {
  implicit val encoderGenderSummary: Encoder[GenderSummary] = deriveEncoder[GenderSummary].mapJson(_.dropNullValues)
  implicit val decoderGenderSummary: Decoder[GenderSummary] = deriveDecoder[GenderSummary]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param abilities A list of abilities that were introduced in this generation.
* @param mainUnderscoreregion The main region travelled in this generation.
* @param moves A list of moves that were introduced in this generation.
* @param names The name of this resource listed in different languages.
* @param pokemonUnderscorespecies A list of Pokémon species that were introduced in this generation.
* @param types A list of types that were introduced in this generation.
* @param versionUnderscoregroups A list of version groups that were introduced in this generation.
*/

case class GenerationDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
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
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class GenerationName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object GenerationName {
  implicit val encoderGenerationName: Encoder[GenerationName] = deriveEncoder[GenerationName].mapJson(_.dropNullValues)
  implicit val decoderGenerationName: Decoder[GenerationName] = deriveDecoder[GenerationName]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class GenerationSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object GenerationSummary {
  implicit val encoderGenerationSummary: Encoder[GenerationSummary] = deriveEncoder[GenerationSummary].mapJson(_.dropNullValues)
  implicit val decoderGenerationSummary: Decoder[GenerationSummary] = deriveDecoder[GenerationSummary]
}

/**
* 
* @param description The localized description for an API resource in a specific language.
* @param language The language this name is in.
*/

case class GrowthRateDescription(
  description: Option[Refined[String, MaxSize[2000]]],
  language: LanguageSummary
)
object GrowthRateDescription {
  implicit val encoderGrowthRateDescription: Encoder[GrowthRateDescription] = deriveEncoder[GrowthRateDescription].mapJson(_.dropNullValues)
  implicit val decoderGrowthRateDescription: Decoder[GrowthRateDescription] = deriveDecoder[GrowthRateDescription]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param formula The formula used to calculate the rate at which the Pokémon species gains level.
* @param descriptions The descriptions of this characteristic listed in different languages.
* @param levels A list of levels and the amount of experienced needed to atain them based on this growth rate.
* @param pokemonUnderscorespecies A list of Pokémon species that gain levels at this growth rate.
*/

case class GrowthRateDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
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
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class GrowthRateSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object GrowthRateSummary {
  implicit val encoderGrowthRateSummary: Encoder[GrowthRateSummary] = deriveEncoder[GrowthRateSummary].mapJson(_.dropNullValues)
  implicit val decoderGrowthRateSummary: Decoder[GrowthRateSummary] = deriveDecoder[GrowthRateSummary]
}

/**
* 
* @param description The localized description for an API resource in a specific language.
* @param language The language this name is in.
*/

case class ItemAttributeDescription(
  description: Option[Refined[String, MaxSize[2000]]],
  language: LanguageSummary
)
object ItemAttributeDescription {
  implicit val encoderItemAttributeDescription: Encoder[ItemAttributeDescription] = deriveEncoder[ItemAttributeDescription].mapJson(_.dropNullValues)
  implicit val decoderItemAttributeDescription: Decoder[ItemAttributeDescription] = deriveDecoder[ItemAttributeDescription]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param descriptions The description of this item attribute listed in different languages.
* @param items A list of items that have this attribute.
* @param names The name of this item attribute listed in different languages.
*/

case class ItemAttributeDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  descriptions: List[ItemAttributeDescription],
  items: List[ItemSummary],
  names: List[ItemAttributeName]
)
object ItemAttributeDetail {
  implicit val encoderItemAttributeDetail: Encoder[ItemAttributeDetail] = deriveEncoder[ItemAttributeDetail].mapJson(_.dropNullValues)
  implicit val decoderItemAttributeDetail: Decoder[ItemAttributeDetail] = deriveDecoder[ItemAttributeDetail]
}

/**
* 
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class ItemAttributeName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object ItemAttributeName {
  implicit val encoderItemAttributeName: Encoder[ItemAttributeName] = deriveEncoder[ItemAttributeName].mapJson(_.dropNullValues)
  implicit val decoderItemAttributeName: Decoder[ItemAttributeName] = deriveDecoder[ItemAttributeName]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class ItemAttributeSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object ItemAttributeSummary {
  implicit val encoderItemAttributeSummary: Encoder[ItemAttributeSummary] = deriveEncoder[ItemAttributeSummary].mapJson(_.dropNullValues)
  implicit val decoderItemAttributeSummary: Decoder[ItemAttributeSummary] = deriveDecoder[ItemAttributeSummary]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param items A list of items that are a part of this category.
* @param names The name of this item category listed in different languages.
* @param pocket The pocket items in this category would be put in.
*/

case class ItemCategoryDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
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
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class ItemCategoryName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object ItemCategoryName {
  implicit val encoderItemCategoryName: Encoder[ItemCategoryName] = deriveEncoder[ItemCategoryName].mapJson(_.dropNullValues)
  implicit val decoderItemCategoryName: Decoder[ItemCategoryName] = deriveDecoder[ItemCategoryName]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class ItemCategorySummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object ItemCategorySummary {
  implicit val encoderItemCategorySummary: Encoder[ItemCategorySummary] = deriveEncoder[ItemCategorySummary].mapJson(_.dropNullValues)
  implicit val decoderItemCategorySummary: Decoder[ItemCategorySummary] = deriveDecoder[ItemCategorySummary]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param flingUnderscorepower The power of the move Fling when used with this item.
* @param flingUnderscoreeffect The effect of the move Fling when used with this item.
* @param attributes A list of attributes this item has.
* @param category The category of items this item falls into.
* @param effectUnderscoreentries The effect of this ability listed in different languages.
* @param flavorUnderscoretextUnderscoreentries The flavor text of this ability listed in different languages.
* @param gameUnderscoreindices A list of game indices relevent to this item by generation.
* @param prices Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.
* @param names The name of this item listed in different languages.
* @param heldUnderscorebyUnderscorepokemon A list of Pokémon that might be found in the wild holding this item.
* @param sprites A set of sprites used to depict this item in the game.
* @param babyUnderscoretriggerUnderscorefor An evolution chain this item requires to produce a bay during mating.
* @param machines A list of the machines related to this item.
*/

case class ItemDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  flingUnderscorepower: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  flingUnderscoreeffect: ItemFlingEffectSummary,
  attributes: List[ItemAttributeSummary],
  category: ItemCategorySummary,
  effectUnderscoreentries: List[ItemEffectText],
  flavorUnderscoretextUnderscoreentries: List[ItemFlavorText],
  gameUnderscoreindices: List[ItemGameIndex],
  prices: List[ItemPrice],
  names: List[ItemName],
  heldUnderscorebyUnderscorepokemon: List[PokemonHeldItem],
  sprites: ItemSprites,
  babyUnderscoretriggerUnderscorefor: EvolutionChainSummary,
  machines: List[ItemMachine]
)
object ItemDetail {
  implicit val encoderItemDetail: Encoder[ItemDetail] = deriveEncoder[ItemDetail].mapJson(_.dropNullValues)
  implicit val decoderItemDetail: Decoder[ItemDetail] = deriveDecoder[ItemDetail]
}

/**
* 
* @param effect The localized effect text for an API resource in a specific language.
* @param shortUnderscoreeffect The localized effect text in brief.
* @param language The language this effect is in.
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
* @param text The localized flavor text for an API resource in a specific language.
* @param versionUnderscoregroup The version group which uses this flavor text.
* @param language The language this name is in.
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
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param effectUnderscoreentries The result of this fling effect listed in different languages.
* @param items A list of items that have this fling effect.
*/

case class ItemFlingEffectDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  effectUnderscoreentries: List[ItemFlingEffectEffectText],
  items: List[ItemSummary]
)
object ItemFlingEffectDetail {
  implicit val encoderItemFlingEffectDetail: Encoder[ItemFlingEffectDetail] = deriveEncoder[ItemFlingEffectDetail].mapJson(_.dropNullValues)
  implicit val decoderItemFlingEffectDetail: Decoder[ItemFlingEffectDetail] = deriveDecoder[ItemFlingEffectDetail]
}

/**
* 
* @param effect The localized effect text for an API resource in a specific language.
* @param language The language this effect is in.
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
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class ItemFlingEffectSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object ItemFlingEffectSummary {
  implicit val encoderItemFlingEffectSummary: Encoder[ItemFlingEffectSummary] = deriveEncoder[ItemFlingEffectSummary].mapJson(_.dropNullValues)
  implicit val decoderItemFlingEffectSummary: Decoder[ItemFlingEffectSummary] = deriveDecoder[ItemFlingEffectSummary]
}

/**
* 
* @param gameUnderscoreindex The internal id of an API resource within game data.
* @param generation The generation relevent to this game index.
*/

case class ItemGameIndex(
  gameUnderscoreindex: Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]],
  generation: GenerationSummary
)
object ItemGameIndex {
  implicit val encoderItemGameIndex: Encoder[ItemGameIndex] = deriveEncoder[ItemGameIndex].mapJson(_.dropNullValues)
  implicit val decoderItemGameIndex: Decoder[ItemGameIndex] = deriveDecoder[ItemGameIndex]
}

/**
* 
* @param machine The machine that teaches a move from an item.
* @param versionUnderscoregroup The version group of this specific machine.
*/

case class ItemMachine(
  machine: MachineSummary,
  versionUnderscoregroup: VersionGroupSummary
)
object ItemMachine {
  implicit val encoderItemMachine: Encoder[ItemMachine] = deriveEncoder[ItemMachine].mapJson(_.dropNullValues)
  implicit val decoderItemMachine: Decoder[ItemMachine] = deriveDecoder[ItemMachine]
}

/**
* 
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class ItemName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object ItemName {
  implicit val encoderItemName: Encoder[ItemName] = deriveEncoder[ItemName].mapJson(_.dropNullValues)
  implicit val decoderItemName: Decoder[ItemName] = deriveDecoder[ItemName]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param categories A list of item categories that are relevant to this item pocket.
* @param names The name of this resource listed in different languages.
*/

case class ItemPocketDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  categories: List[ItemCategorySummary],
  names: List[ItemPocketName]
)
object ItemPocketDetail {
  implicit val encoderItemPocketDetail: Encoder[ItemPocketDetail] = deriveEncoder[ItemPocketDetail].mapJson(_.dropNullValues)
  implicit val decoderItemPocketDetail: Decoder[ItemPocketDetail] = deriveDecoder[ItemPocketDetail]
}

/**
* 
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class ItemPocketName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object ItemPocketName {
  implicit val encoderItemPocketName: Encoder[ItemPocketName] = deriveEncoder[ItemPocketName].mapJson(_.dropNullValues)
  implicit val decoderItemPocketName: Decoder[ItemPocketName] = deriveDecoder[ItemPocketName]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class ItemPocketSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object ItemPocketSummary {
  implicit val encoderItemPocketSummary: Encoder[ItemPocketSummary] = deriveEncoder[ItemPocketSummary].mapJson(_.dropNullValues)
  implicit val decoderItemPocketSummary: Decoder[ItemPocketSummary] = deriveDecoder[ItemPocketSummary]
}

/**
* 
* @param purchaseUnderscoreprice The purchase price in this currency and version group, or null if unavailable.
* @param sellUnderscoreprice The sell price in this currency and version group, or null if unavailable.
* @param currency The currency used for this price.
* @param versionUnderscoregroup The version group to which this price applies.
*/

case class ItemPrice(
  purchaseUnderscoreprice: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  sellUnderscoreprice: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  currency: CurrencySummary,
  versionUnderscoregroup: VersionGroupSummary
)
object ItemPrice {
  implicit val encoderItemPrice: Encoder[ItemPrice] = deriveEncoder[ItemPrice].mapJson(_.dropNullValues)
  implicit val decoderItemPrice: Decoder[ItemPrice] = deriveDecoder[ItemPrice]
}

/**
* 
* @param `default` The default depiction of this item.
*/

case class ItemSprites(
  `default`: String
)
object ItemSprites {
  implicit val encoderItemSprites: Encoder[ItemSprites] = deriveEncoder[ItemSprites].mapJson(_.dropNullValues)
  implicit val decoderItemSprites: Decoder[ItemSprites] = deriveDecoder[ItemSprites]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class ItemSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object ItemSummary {
  implicit val encoderItemSummary: Encoder[ItemSummary] = deriveEncoder[ItemSummary].mapJson(_.dropNullValues)
  implicit val decoderItemSummary: Decoder[ItemSummary] = deriveDecoder[ItemSummary]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param official Whether or not the games are published in this language.
* @param iso639 The two-letter ISO 639-1 language code. Multiple PokéAPI language records may share this code.
* @param iso3166 The two-letter ISO 3166-1 alpha-2 code of the country or region associated with this language record. Multiple PokéAPI language records may share this code.
* @param names The name of this resource listed in different languages.
*/

case class LanguageDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
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
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class LanguageName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object LanguageName {
  implicit val encoderLanguageName: Encoder[LanguageName] = deriveEncoder[LanguageName].mapJson(_.dropNullValues)
  implicit val decoderLanguageName: Decoder[LanguageName] = deriveDecoder[LanguageName]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class LanguageSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object LanguageSummary {
  implicit val encoderLanguageSummary: Encoder[LanguageSummary] = deriveEncoder[LanguageSummary].mapJson(_.dropNullValues)
  implicit val decoderLanguageSummary: Decoder[LanguageSummary] = deriveDecoder[LanguageSummary]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param gameUnderscoreindex The internal id of an API resource within game data.
* @param encounterUnderscoremethodUnderscorerates A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game.
* @param location The region this location area can be found in.
* @param names The name of this resource listed in different languages.
* @param pokemonUnderscoreencounters A list of Pokémon that can be encountered in this area along with version specific details about the encounter.
*/

case class LocationAreaDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  gameUnderscoreindex: Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]],
  encounterUnderscoremethodUnderscorerates: List[LocationAreaEncounterRate],
  location: LocationSummary,
  names: List[LocationAreaName],
  pokemonUnderscoreencounters: List[LocationAreaPokemonEncounter]
)
object LocationAreaDetail {
  implicit val encoderLocationAreaDetail: Encoder[LocationAreaDetail] = deriveEncoder[LocationAreaDetail].mapJson(_.dropNullValues)
  implicit val decoderLocationAreaDetail: Decoder[LocationAreaDetail] = deriveDecoder[LocationAreaDetail]
}

/**
* 
* @param minUnderscorelevel The lowest level the Pokémon could be encountered at.
* @param maxUnderscorelevel The highest level the Pokémon could be encountered at.
* @param chance Percent chance that this encounter will occur.
* @param method The method by which this encounter happens.
* @param conditionUnderscorevalues A list of condition values that must be in effect for this encounter to occur.
* @param pokemonUnderscoredetails Additional properties of the encountered Pokémon, or null if unspecified.
*/

case class LocationAreaEncounterDetail(
  minUnderscorelevel: Int,
  maxUnderscorelevel: Int,
  chance: Option[Int],
  method: Option[EncounterMethodSummary],
  conditionUnderscorevalues: List[EncounterConditionValueSummary],
  pokemonUnderscoredetails: EncounterPokemonDetail
)
object LocationAreaEncounterDetail {
  implicit val encoderLocationAreaEncounterDetail: Encoder[LocationAreaEncounterDetail] = deriveEncoder[LocationAreaEncounterDetail].mapJson(_.dropNullValues)
  implicit val decoderLocationAreaEncounterDetail: Decoder[LocationAreaEncounterDetail] = deriveDecoder[LocationAreaEncounterDetail]
}

/**
* 
* @param encounterUnderscoremethod The method in which Pokémon may be encountered in an area..
* @param versionUnderscoredetails The chance of the encounter to occur on a version of the game.
*/

case class LocationAreaEncounterRate(
  encounterUnderscoremethod: EncounterMethodSummary,
  versionUnderscoredetails: List[LocationAreaEncounterVersionDetail]
)
object LocationAreaEncounterRate {
  implicit val encoderLocationAreaEncounterRate: Encoder[LocationAreaEncounterRate] = deriveEncoder[LocationAreaEncounterRate].mapJson(_.dropNullValues)
  implicit val decoderLocationAreaEncounterRate: Decoder[LocationAreaEncounterRate] = deriveDecoder[LocationAreaEncounterRate]
}

/**
* 
* @param rate The chance of an encounter to occur.
* @param version The version of the game in which the encounter can occur with the given chance.
*/

case class LocationAreaEncounterVersionDetail(
  rate: Int,
  version: VersionSummary
)
object LocationAreaEncounterVersionDetail {
  implicit val encoderLocationAreaEncounterVersionDetail: Encoder[LocationAreaEncounterVersionDetail] = deriveEncoder[LocationAreaEncounterVersionDetail].mapJson(_.dropNullValues)
  implicit val decoderLocationAreaEncounterVersionDetail: Decoder[LocationAreaEncounterVersionDetail] = deriveDecoder[LocationAreaEncounterVersionDetail]
}

/**
* 
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class LocationAreaName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object LocationAreaName {
  implicit val encoderLocationAreaName: Encoder[LocationAreaName] = deriveEncoder[LocationAreaName].mapJson(_.dropNullValues)
  implicit val decoderLocationAreaName: Decoder[LocationAreaName] = deriveDecoder[LocationAreaName]
}

/**
* 
* @param pokemon The Pokémon being encountered.
* @param versionUnderscoredetails A list of versions and encounters with Pokémon that might happen in the referenced location area.
*/

case class LocationAreaPokemonEncounter(
  pokemon: PokemonSummary,
  versionUnderscoredetails: List[LocationAreaPokemonEncounterVersion]
)
object LocationAreaPokemonEncounter {
  implicit val encoderLocationAreaPokemonEncounter: Encoder[LocationAreaPokemonEncounter] = deriveEncoder[LocationAreaPokemonEncounter].mapJson(_.dropNullValues)
  implicit val decoderLocationAreaPokemonEncounter: Decoder[LocationAreaPokemonEncounter] = deriveDecoder[LocationAreaPokemonEncounter]
}

/**
* 
* @param version The game version this encounter happens in.
* @param maxUnderscorechance The total percentage of all encounter potential.
* @param encounterUnderscoredetails A list of encounters and their specifics.
*/

case class LocationAreaPokemonEncounterVersion(
  version: VersionSummary,
  maxUnderscorechance: Int,
  encounterUnderscoredetails: List[LocationAreaEncounterDetail]
)
object LocationAreaPokemonEncounterVersion {
  implicit val encoderLocationAreaPokemonEncounterVersion: Encoder[LocationAreaPokemonEncounterVersion] = deriveEncoder[LocationAreaPokemonEncounterVersion].mapJson(_.dropNullValues)
  implicit val decoderLocationAreaPokemonEncounterVersion: Decoder[LocationAreaPokemonEncounterVersion] = deriveDecoder[LocationAreaPokemonEncounterVersion]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class LocationAreaSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object LocationAreaSummary {
  implicit val encoderLocationAreaSummary: Encoder[LocationAreaSummary] = deriveEncoder[LocationAreaSummary].mapJson(_.dropNullValues)
  implicit val decoderLocationAreaSummary: Decoder[LocationAreaSummary] = deriveDecoder[LocationAreaSummary]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param region The region this location can be found in.
* @param names The name of this resource listed in different languages.
* @param gameUnderscoreindices A list of game indices relevent to this location by generation.
* @param areas Areas that can be found within this location.
*/

case class LocationDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
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
* @param gameUnderscoreindex The internal id of an API resource within game data.
* @param generation The generation relevent to this game index.
*/

case class LocationGameIndex(
  gameUnderscoreindex: Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]],
  generation: GenerationSummary
)
object LocationGameIndex {
  implicit val encoderLocationGameIndex: Encoder[LocationGameIndex] = deriveEncoder[LocationGameIndex].mapJson(_.dropNullValues)
  implicit val decoderLocationGameIndex: Decoder[LocationGameIndex] = deriveDecoder[LocationGameIndex]
}

/**
* 
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class LocationName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object LocationName {
  implicit val encoderLocationName: Encoder[LocationName] = deriveEncoder[LocationName].mapJson(_.dropNullValues)
  implicit val decoderLocationName: Decoder[LocationName] = deriveDecoder[LocationName]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class LocationSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object LocationSummary {
  implicit val encoderLocationSummary: Encoder[LocationSummary] = deriveEncoder[LocationSummary].mapJson(_.dropNullValues)
  implicit val decoderLocationSummary: Decoder[LocationSummary] = deriveDecoder[LocationSummary]
}

/**
* 
* @param id The identifier for this resource.
* @param item The TM or HM item that corresponds to this machine.
* @param versionUnderscoregroup The version group that this machine applies to.
* @param move The move that is taught by this machine.
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
* @param url The URL of the referenced resource.
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
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param names The name of this resource listed in different languages.
*/

case class MoveBattleStyleDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  names: List[MoveBattleStyleName]
)
object MoveBattleStyleDetail {
  implicit val encoderMoveBattleStyleDetail: Encoder[MoveBattleStyleDetail] = deriveEncoder[MoveBattleStyleDetail].mapJson(_.dropNullValues)
  implicit val decoderMoveBattleStyleDetail: Decoder[MoveBattleStyleDetail] = deriveDecoder[MoveBattleStyleDetail]
}

/**
* 
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class MoveBattleStyleName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object MoveBattleStyleName {
  implicit val encoderMoveBattleStyleName: Encoder[MoveBattleStyleName] = deriveEncoder[MoveBattleStyleName].mapJson(_.dropNullValues)
  implicit val decoderMoveBattleStyleName: Decoder[MoveBattleStyleName] = deriveDecoder[MoveBattleStyleName]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class MoveBattleStyleSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object MoveBattleStyleSummary {
  implicit val encoderMoveBattleStyleSummary: Encoder[MoveBattleStyleSummary] = deriveEncoder[MoveBattleStyleSummary].mapJson(_.dropNullValues)
  implicit val decoderMoveBattleStyleSummary: Decoder[MoveBattleStyleSummary] = deriveDecoder[MoveBattleStyleSummary]
}

/**
* 
* @param accuracy The percent value of how likely this move is to be successful.
* @param power The base power before the listed version group, or null if power did not change.
* @param pp Power points. The number of times this move can be used.
* @param effectUnderscorechance The percent value of how likely it is this moves effect will take effect.
* @param effectUnderscoreentries The effect of this move listed in different languages.
* @param `type` The elemental type of this move.
* @param versionUnderscoregroup The version group in which these move stat values were in effect.
*/

case class MoveChange(
  accuracy: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  power: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  pp: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  effectUnderscorechance: Int,
  effectUnderscoreentries: List[MoveEffectEffectText],
  `type`: TypeSummary,
  versionUnderscoregroup: VersionGroupSummary
)
object MoveChange {
  implicit val encoderMoveChange: Encoder[MoveChange] = deriveEncoder[MoveChange].mapJson(_.dropNullValues)
  implicit val decoderMoveChange: Decoder[MoveChange] = deriveDecoder[MoveChange]
}

/**
* 
* @param useUnderscorebefore A list of moves to use before this move.
* @param useUnderscoreafter A list of moves to use after this move.
*/

case class MoveComboUsage(
  useUnderscorebefore: List[MoveSummary],
  useUnderscoreafter: List[MoveSummary]
)
object MoveComboUsage {
  implicit val encoderMoveComboUsage: Encoder[MoveComboUsage] = deriveEncoder[MoveComboUsage].mapJson(_.dropNullValues)
  implicit val decoderMoveComboUsage: Decoder[MoveComboUsage] = deriveDecoder[MoveComboUsage]
}

/**
* 
* @param normal A detail of moves this move can be used before or after, granting additional appeal points in contests.
* @param `super` A detail of moves this move can be used before or after, granting additional appeal points in super contests.
*/

case class MoveCombos(
  normal: MoveComboUsage,
  `super`: MoveComboUsage
)
object MoveCombos {
  implicit val encoderMoveCombos: Encoder[MoveCombos] = deriveEncoder[MoveCombos].mapJson(_.dropNullValues)
  implicit val decoderMoveCombos: Decoder[MoveCombos] = deriveDecoder[MoveCombos]
}

/**
* 
* @param description The localized description for an API resource in a specific language.
* @param language The language this name is in.
*/

case class MoveDamageClassDescription(
  description: Option[Refined[String, MaxSize[2000]]],
  language: LanguageSummary
)
object MoveDamageClassDescription {
  implicit val encoderMoveDamageClassDescription: Encoder[MoveDamageClassDescription] = deriveEncoder[MoveDamageClassDescription].mapJson(_.dropNullValues)
  implicit val decoderMoveDamageClassDescription: Decoder[MoveDamageClassDescription] = deriveDecoder[MoveDamageClassDescription]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param descriptions The description of this resource listed in different languages.
* @param moves A list of moves that fall into this damage class.
* @param names The name of this resource listed in different languages.
*/

case class MoveDamageClassDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
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
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class MoveDamageClassName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object MoveDamageClassName {
  implicit val encoderMoveDamageClassName: Encoder[MoveDamageClassName] = deriveEncoder[MoveDamageClassName].mapJson(_.dropNullValues)
  implicit val decoderMoveDamageClassName: Decoder[MoveDamageClassName] = deriveDecoder[MoveDamageClassName]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class MoveDamageClassSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object MoveDamageClassSummary {
  implicit val encoderMoveDamageClassSummary: Encoder[MoveDamageClassSummary] = deriveEncoder[MoveDamageClassSummary].mapJson(_.dropNullValues)
  implicit val decoderMoveDamageClassSummary: Decoder[MoveDamageClassSummary] = deriveDecoder[MoveDamageClassSummary]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param accuracy The percent value of how likely this move is to be successful.
* @param effectUnderscorechance The percent value of how likely it is this moves effect will happen.
* @param pp Power points. The number of times this move can be used.
* @param priority A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.
* @param power The base power of this move, or null if it has no fixed base power.
* @param contestUnderscorecombos A detail of normal and super contest combos that require this move.
* @param contestUnderscoretype The type of appeal this move gives a Pokémon when used in a contest.
* @param contestUnderscoreeffect The effect the move has when used in a contest.
* @param damageUnderscoreclass The type of damage the move inflicts on the target, e.g. physical.
* @param effectUnderscoreentries The effect of this move listed in different languages.
* @param effectUnderscorechanges The list of previous effects this move has had across version groups of the games.
* @param generation The generation in which this move was introduced.
* @param meta Metadata about this move
* @param names The name of this resource listed in different languages.
* @param pastUnderscorevalues A list of move resource value changes across version groups of the game.
* @param statUnderscorechanges A list of stats this moves effects and how much it effects them.
* @param superUnderscorecontestUnderscoreeffect The effect the move has when used in a super contest.
* @param target The type of target that will receive the effects of the attack.
* @param `type` The elemental type of this move.
* @param machines A list of the machines that teach this move.
* @param flavorUnderscoretextUnderscoreentries The flavor text of this move listed in different languages.
* @param learnedUnderscorebyUnderscorepokemon List of Pokemon that can learn the move
*/

case class MoveDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  accuracy: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  effectUnderscorechance: Int,
  pp: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  priority: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  power: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  contestUnderscorecombos: MoveCombos,
  contestUnderscoretype: ContestTypeSummary,
  contestUnderscoreeffect: ContestEffectSummary,
  damageUnderscoreclass: MoveDamageClassSummary,
  effectUnderscoreentries: List[MoveEffectEffectText],
  effectUnderscorechanges: List[MoveEffectChange],
  generation: GenerationSummary,
  meta: MoveMeta,
  names: List[MoveName],
  pastUnderscorevalues: List[MoveChange],
  statUnderscorechanges: List[MoveMetaStatChange],
  superUnderscorecontestUnderscoreeffect: SuperContestEffectSummary,
  target: MoveTargetSummary,
  `type`: TypeSummary,
  machines: List[ItemMachine],
  flavorUnderscoretextUnderscoreentries: List[MoveFlavorText],
  learnedUnderscorebyUnderscorepokemon: List[PokemonSummary]
)
object MoveDetail {
  implicit val encoderMoveDetail: Encoder[MoveDetail] = deriveEncoder[MoveDetail].mapJson(_.dropNullValues)
  implicit val decoderMoveDetail: Decoder[MoveDetail] = deriveDecoder[MoveDetail]
}

/**
* 
* @param versionUnderscoregroup The version group in which the previous effect of this ability originated.
* @param effectUnderscoreentries The previous effect of this ability listed in different languages.
*/

case class MoveEffectChange(
  versionUnderscoregroup: VersionGroupSummary,
  effectUnderscoreentries: List[MoveEffectChangeEffectText]
)
object MoveEffectChange {
  implicit val encoderMoveEffectChange: Encoder[MoveEffectChange] = deriveEncoder[MoveEffectChange].mapJson(_.dropNullValues)
  implicit val decoderMoveEffectChange: Decoder[MoveEffectChange] = deriveDecoder[MoveEffectChange]
}

/**
* 
* @param effect The localized effect text for an API resource in a specific language.
* @param language The language this effect is in.
*/

case class MoveEffectChangeEffectText(
  effect: Refined[String, MaxSize[6000]],
  language: LanguageSummary
)
object MoveEffectChangeEffectText {
  implicit val encoderMoveEffectChangeEffectText: Encoder[MoveEffectChangeEffectText] = deriveEncoder[MoveEffectChangeEffectText].mapJson(_.dropNullValues)
  implicit val decoderMoveEffectChangeEffectText: Decoder[MoveEffectChangeEffectText] = deriveDecoder[MoveEffectChangeEffectText]
}

/**
* 
* @param effect The localized effect text for an API resource in a specific language.
* @param shortUnderscoreeffect The localized effect text in brief.
* @param language The language this effect is in.
*/

case class MoveEffectEffectText(
  effect: Refined[String, MaxSize[6000]],
  shortUnderscoreeffect: Refined[String, MaxSize[300]],
  language: LanguageSummary
)
object MoveEffectEffectText {
  implicit val encoderMoveEffectEffectText: Encoder[MoveEffectEffectText] = deriveEncoder[MoveEffectEffectText].mapJson(_.dropNullValues)
  implicit val decoderMoveEffectEffectText: Decoder[MoveEffectEffectText] = deriveDecoder[MoveEffectEffectText]
}

/**
* 
* @param flavorUnderscoretext The localized flavor text for an api resource in a specific language.
* @param language The language this name is in.
* @param versionUnderscoregroup The version group that uses this flavor text.
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
* @param description The localized description for an API resource in a specific language.
* @param language The language this name is in.
*/

case class MoveLearnMethodDescription(
  description: Option[Refined[String, MaxSize[2000]]],
  language: LanguageSummary
)
object MoveLearnMethodDescription {
  implicit val encoderMoveLearnMethodDescription: Encoder[MoveLearnMethodDescription] = deriveEncoder[MoveLearnMethodDescription].mapJson(_.dropNullValues)
  implicit val decoderMoveLearnMethodDescription: Decoder[MoveLearnMethodDescription] = deriveDecoder[MoveLearnMethodDescription]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param names The name of this resource listed in different languages.
* @param descriptions The description of this resource listed in different languages.
* @param versionUnderscoregroups A list of version groups where moves can be learned through this method.
*/

case class MoveLearnMethodDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  names: List[MoveLearnMethodName],
  descriptions: List[MoveLearnMethodDescription],
  versionUnderscoregroups: List[VersionGroupSummary]
)
object MoveLearnMethodDetail {
  implicit val encoderMoveLearnMethodDetail: Encoder[MoveLearnMethodDetail] = deriveEncoder[MoveLearnMethodDetail].mapJson(_.dropNullValues)
  implicit val decoderMoveLearnMethodDetail: Decoder[MoveLearnMethodDetail] = deriveDecoder[MoveLearnMethodDetail]
}

/**
* 
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class MoveLearnMethodName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object MoveLearnMethodName {
  implicit val encoderMoveLearnMethodName: Encoder[MoveLearnMethodName] = deriveEncoder[MoveLearnMethodName].mapJson(_.dropNullValues)
  implicit val decoderMoveLearnMethodName: Decoder[MoveLearnMethodName] = deriveDecoder[MoveLearnMethodName]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class MoveLearnMethodSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object MoveLearnMethodSummary {
  implicit val encoderMoveLearnMethodSummary: Encoder[MoveLearnMethodSummary] = deriveEncoder[MoveLearnMethodSummary].mapJson(_.dropNullValues)
  implicit val decoderMoveLearnMethodSummary: Decoder[MoveLearnMethodSummary] = deriveDecoder[MoveLearnMethodSummary]
}

/**
* 
* @param ailment The status ailment this move inflicts on its target.
* @param category The category of move this move falls under, e.g. damage or ailment.
* @param minUnderscorehits The minimum number of times this move hits. Null if it always only hits once.
* @param maxUnderscorehits The maximum number of times this move hits. Null if it always only hits once.
* @param minUnderscoreturns The minimum number of turns this move continues to take effect. Null if it always only lasts one turn.
* @param maxUnderscoreturns The maximum number of turns this move continues to take effect. Null if it always only lasts one turn.
* @param drain HP drain (if positive) or Recoil damage (if negative), in percent of damage done.
* @param healing The amount of hp gained by the attacking Pokemon, in percent of it's maximum HP.
* @param critUnderscorerate Critical hit rate bonus.
* @param ailmentUnderscorechance The likelihood this attack will cause an ailment.
* @param flinchUnderscorechance The likelihood this attack will cause the target Pokémon to flinch.
* @param statUnderscorechance The likelihood this attack will cause a stat change in the target Pokémon.
*/

case class MoveMeta(
  ailment: MoveMetaAilmentSummary,
  category: MoveMetaCategorySummary,
  minUnderscorehits: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  maxUnderscorehits: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  minUnderscoreturns: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  maxUnderscoreturns: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  drain: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  healing: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  critUnderscorerate: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  ailmentUnderscorechance: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  flinchUnderscorechance: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  statUnderscorechance: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]]
)
object MoveMeta {
  implicit val encoderMoveMeta: Encoder[MoveMeta] = deriveEncoder[MoveMeta].mapJson(_.dropNullValues)
  implicit val decoderMoveMeta: Decoder[MoveMeta] = deriveDecoder[MoveMeta]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param moves A list of moves that cause this ailment.
* @param names The name of this resource listed in different languages.
*/

case class MoveMetaAilmentDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  moves: List[MoveSummary],
  names: List[MoveMetaAilmentName]
)
object MoveMetaAilmentDetail {
  implicit val encoderMoveMetaAilmentDetail: Encoder[MoveMetaAilmentDetail] = deriveEncoder[MoveMetaAilmentDetail].mapJson(_.dropNullValues)
  implicit val decoderMoveMetaAilmentDetail: Decoder[MoveMetaAilmentDetail] = deriveDecoder[MoveMetaAilmentDetail]
}

/**
* 
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class MoveMetaAilmentName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object MoveMetaAilmentName {
  implicit val encoderMoveMetaAilmentName: Encoder[MoveMetaAilmentName] = deriveEncoder[MoveMetaAilmentName].mapJson(_.dropNullValues)
  implicit val decoderMoveMetaAilmentName: Decoder[MoveMetaAilmentName] = deriveDecoder[MoveMetaAilmentName]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class MoveMetaAilmentSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object MoveMetaAilmentSummary {
  implicit val encoderMoveMetaAilmentSummary: Encoder[MoveMetaAilmentSummary] = deriveEncoder[MoveMetaAilmentSummary].mapJson(_.dropNullValues)
  implicit val decoderMoveMetaAilmentSummary: Decoder[MoveMetaAilmentSummary] = deriveDecoder[MoveMetaAilmentSummary]
}

/**
* 
* @param description The localized description for an API resource in a specific language.
* @param language The language this name is in.
*/

case class MoveMetaCategoryDescription(
  description: Option[Refined[String, MaxSize[2000]]],
  language: LanguageSummary
)
object MoveMetaCategoryDescription {
  implicit val encoderMoveMetaCategoryDescription: Encoder[MoveMetaCategoryDescription] = deriveEncoder[MoveMetaCategoryDescription].mapJson(_.dropNullValues)
  implicit val decoderMoveMetaCategoryDescription: Decoder[MoveMetaCategoryDescription] = deriveDecoder[MoveMetaCategoryDescription]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param descriptions The description of this resource listed in different languages.
* @param moves A list of moves that fall into this category.
*/

case class MoveMetaCategoryDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  descriptions: List[MoveMetaCategoryDescription],
  moves: List[MoveSummary]
)
object MoveMetaCategoryDetail {
  implicit val encoderMoveMetaCategoryDetail: Encoder[MoveMetaCategoryDetail] = deriveEncoder[MoveMetaCategoryDetail].mapJson(_.dropNullValues)
  implicit val decoderMoveMetaCategoryDetail: Decoder[MoveMetaCategoryDetail] = deriveDecoder[MoveMetaCategoryDetail]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class MoveMetaCategorySummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object MoveMetaCategorySummary {
  implicit val encoderMoveMetaCategorySummary: Encoder[MoveMetaCategorySummary] = deriveEncoder[MoveMetaCategorySummary].mapJson(_.dropNullValues)
  implicit val decoderMoveMetaCategorySummary: Decoder[MoveMetaCategorySummary] = deriveDecoder[MoveMetaCategorySummary]
}

/**
* 
* @param change The amount of change.
* @param stat The stat being affected.
*/

case class MoveMetaStatChange(
  change: Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]],
  stat: StatSummary
)
object MoveMetaStatChange {
  implicit val encoderMoveMetaStatChange: Encoder[MoveMetaStatChange] = deriveEncoder[MoveMetaStatChange].mapJson(_.dropNullValues)
  implicit val decoderMoveMetaStatChange: Decoder[MoveMetaStatChange] = deriveDecoder[MoveMetaStatChange]
}

/**
* 
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class MoveName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object MoveName {
  implicit val encoderMoveName: Encoder[MoveName] = deriveEncoder[MoveName].mapJson(_.dropNullValues)
  implicit val decoderMoveName: Decoder[MoveName] = deriveDecoder[MoveName]
}

/**
* 
* @param change The maximum amount of change to the referenced stat.
* @param move The move causing the change.
*/

case class MoveStatChange(
  change: Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]],
  move: MoveSummary
)
object MoveStatChange {
  implicit val encoderMoveStatChange: Encoder[MoveStatChange] = deriveEncoder[MoveStatChange].mapJson(_.dropNullValues)
  implicit val decoderMoveStatChange: Decoder[MoveStatChange] = deriveDecoder[MoveStatChange]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class MoveSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object MoveSummary {
  implicit val encoderMoveSummary: Encoder[MoveSummary] = deriveEncoder[MoveSummary].mapJson(_.dropNullValues)
  implicit val decoderMoveSummary: Decoder[MoveSummary] = deriveDecoder[MoveSummary]
}

/**
* 
* @param description The localized description for an API resource in a specific language.
* @param language The language this name is in.
*/

case class MoveTargetDescription(
  description: Option[Refined[String, MaxSize[2000]]],
  language: LanguageSummary
)
object MoveTargetDescription {
  implicit val encoderMoveTargetDescription: Encoder[MoveTargetDescription] = deriveEncoder[MoveTargetDescription].mapJson(_.dropNullValues)
  implicit val decoderMoveTargetDescription: Decoder[MoveTargetDescription] = deriveDecoder[MoveTargetDescription]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param descriptions The description of this resource listed in different languages.
* @param moves A list of moves that that are directed at this target.
* @param names The name of this resource listed in different languages.
*/

case class MoveTargetDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
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
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class MoveTargetName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object MoveTargetName {
  implicit val encoderMoveTargetName: Encoder[MoveTargetName] = deriveEncoder[MoveTargetName].mapJson(_.dropNullValues)
  implicit val decoderMoveTargetName: Decoder[MoveTargetName] = deriveDecoder[MoveTargetName]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class MoveTargetSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object MoveTargetSummary {
  implicit val encoderMoveTargetSummary: Encoder[MoveTargetSummary] = deriveEncoder[MoveTargetSummary].mapJson(_.dropNullValues)
  implicit val decoderMoveTargetSummary: Decoder[MoveTargetSummary] = deriveDecoder[MoveTargetSummary]
}

/**
* 
* @param lowUnderscorehpUnderscorepreference Chance of using the move, in percent, if HP is under one half.
* @param highUnderscorehpUnderscorepreference Chance of using the move, in percent, if HP is over one half.
* @param moveUnderscorebattleUnderscorestyle The move battle style.
*/

case class NatureBattleStylePreference(
  lowUnderscorehpUnderscorepreference: Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]],
  highUnderscorehpUnderscorepreference: Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]],
  moveUnderscorebattleUnderscorestyle: MoveBattleStyleSummary
)
object NatureBattleStylePreference {
  implicit val encoderNatureBattleStylePreference: Encoder[NatureBattleStylePreference] = deriveEncoder[NatureBattleStylePreference].mapJson(_.dropNullValues)
  implicit val decoderNatureBattleStylePreference: Decoder[NatureBattleStylePreference] = deriveDecoder[NatureBattleStylePreference]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param decreasedUnderscorestat The stat decreased by 10% in Pokémon with this nature.
* @param increasedUnderscorestat The stat increased by 10% in Pokémon with this nature.
* @param likesUnderscoreflavor The flavor liked by Pokémon with this nature.
* @param hatesUnderscoreflavor The flavor hated by Pokémon with this nature.
* @param pokeathlonUnderscorestatUnderscorechanges A list of Pokéathlon stats this nature effects and how much it effects them.
* @param moveUnderscorebattleUnderscorestyleUnderscorepreferences A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent.
* @param names The name of this resource listed in different languages.
*/

case class NatureDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  decreasedUnderscorestat: StatSummary,
  increasedUnderscorestat: StatSummary,
  likesUnderscoreflavor: BerryFlavorSummary,
  hatesUnderscoreflavor: BerryFlavorSummary,
  pokeathlonUnderscorestatUnderscorechanges: List[NaturePokeathlonStat],
  moveUnderscorebattleUnderscorestyleUnderscorepreferences: List[NatureBattleStylePreference],
  names: List[NatureName]
)
object NatureDetail {
  implicit val encoderNatureDetail: Encoder[NatureDetail] = deriveEncoder[NatureDetail].mapJson(_.dropNullValues)
  implicit val decoderNatureDetail: Decoder[NatureDetail] = deriveDecoder[NatureDetail]
}

/**
* 
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class NatureName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object NatureName {
  implicit val encoderNatureName: Encoder[NatureName] = deriveEncoder[NatureName].mapJson(_.dropNullValues)
  implicit val decoderNatureName: Decoder[NatureName] = deriveDecoder[NatureName]
}

/**
* 
* @param maxUnderscorechange The amount of change.
* @param pokeathlonUnderscorestat The stat being affected.
*/

case class NaturePokeathlonStat(
  maxUnderscorechange: Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]],
  pokeathlonUnderscorestat: PokeathlonStatSummary
)
object NaturePokeathlonStat {
  implicit val encoderNaturePokeathlonStat: Encoder[NaturePokeathlonStat] = deriveEncoder[NaturePokeathlonStat].mapJson(_.dropNullValues)
  implicit val decoderNaturePokeathlonStat: Decoder[NaturePokeathlonStat] = deriveDecoder[NaturePokeathlonStat]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class NatureSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object NatureSummary {
  implicit val encoderNatureSummary: Encoder[NatureSummary] = deriveEncoder[NatureSummary].mapJson(_.dropNullValues)
  implicit val decoderNatureSummary: Decoder[NatureSummary] = deriveDecoder[NatureSummary]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedAbilitySummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[AbilitySummary]
)
object PaginatedAbilitySummaryList {
  implicit val encoderPaginatedAbilitySummaryList: Encoder[PaginatedAbilitySummaryList] = deriveEncoder[PaginatedAbilitySummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedAbilitySummaryList: Decoder[PaginatedAbilitySummaryList] = deriveDecoder[PaginatedAbilitySummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedBerryFirmnessSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[BerryFirmnessSummary]
)
object PaginatedBerryFirmnessSummaryList {
  implicit val encoderPaginatedBerryFirmnessSummaryList: Encoder[PaginatedBerryFirmnessSummaryList] = deriveEncoder[PaginatedBerryFirmnessSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedBerryFirmnessSummaryList: Decoder[PaginatedBerryFirmnessSummaryList] = deriveDecoder[PaginatedBerryFirmnessSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedBerryFlavorSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[BerryFlavorSummary]
)
object PaginatedBerryFlavorSummaryList {
  implicit val encoderPaginatedBerryFlavorSummaryList: Encoder[PaginatedBerryFlavorSummaryList] = deriveEncoder[PaginatedBerryFlavorSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedBerryFlavorSummaryList: Decoder[PaginatedBerryFlavorSummaryList] = deriveDecoder[PaginatedBerryFlavorSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedBerrySummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[BerrySummary]
)
object PaginatedBerrySummaryList {
  implicit val encoderPaginatedBerrySummaryList: Encoder[PaginatedBerrySummaryList] = deriveEncoder[PaginatedBerrySummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedBerrySummaryList: Decoder[PaginatedBerrySummaryList] = deriveDecoder[PaginatedBerrySummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedCharacteristicSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[CharacteristicSummary]
)
object PaginatedCharacteristicSummaryList {
  implicit val encoderPaginatedCharacteristicSummaryList: Encoder[PaginatedCharacteristicSummaryList] = deriveEncoder[PaginatedCharacteristicSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedCharacteristicSummaryList: Decoder[PaginatedCharacteristicSummaryList] = deriveDecoder[PaginatedCharacteristicSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedContestEffectSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[ContestEffectSummary]
)
object PaginatedContestEffectSummaryList {
  implicit val encoderPaginatedContestEffectSummaryList: Encoder[PaginatedContestEffectSummaryList] = deriveEncoder[PaginatedContestEffectSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedContestEffectSummaryList: Decoder[PaginatedContestEffectSummaryList] = deriveDecoder[PaginatedContestEffectSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedContestTypeSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[ContestTypeSummary]
)
object PaginatedContestTypeSummaryList {
  implicit val encoderPaginatedContestTypeSummaryList: Encoder[PaginatedContestTypeSummaryList] = deriveEncoder[PaginatedContestTypeSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedContestTypeSummaryList: Decoder[PaginatedContestTypeSummaryList] = deriveDecoder[PaginatedContestTypeSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedCurrencySummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[CurrencySummary]
)
object PaginatedCurrencySummaryList {
  implicit val encoderPaginatedCurrencySummaryList: Encoder[PaginatedCurrencySummaryList] = deriveEncoder[PaginatedCurrencySummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedCurrencySummaryList: Decoder[PaginatedCurrencySummaryList] = deriveDecoder[PaginatedCurrencySummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedEggGroupSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[EggGroupSummary]
)
object PaginatedEggGroupSummaryList {
  implicit val encoderPaginatedEggGroupSummaryList: Encoder[PaginatedEggGroupSummaryList] = deriveEncoder[PaginatedEggGroupSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedEggGroupSummaryList: Decoder[PaginatedEggGroupSummaryList] = deriveDecoder[PaginatedEggGroupSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedEncounterConditionSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[EncounterConditionSummary]
)
object PaginatedEncounterConditionSummaryList {
  implicit val encoderPaginatedEncounterConditionSummaryList: Encoder[PaginatedEncounterConditionSummaryList] = deriveEncoder[PaginatedEncounterConditionSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedEncounterConditionSummaryList: Decoder[PaginatedEncounterConditionSummaryList] = deriveDecoder[PaginatedEncounterConditionSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedEncounterConditionValueSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[EncounterConditionValueSummary]
)
object PaginatedEncounterConditionValueSummaryList {
  implicit val encoderPaginatedEncounterConditionValueSummaryList: Encoder[PaginatedEncounterConditionValueSummaryList] = deriveEncoder[PaginatedEncounterConditionValueSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedEncounterConditionValueSummaryList: Decoder[PaginatedEncounterConditionValueSummaryList] = deriveDecoder[PaginatedEncounterConditionValueSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedEncounterMethodSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[EncounterMethodSummary]
)
object PaginatedEncounterMethodSummaryList {
  implicit val encoderPaginatedEncounterMethodSummaryList: Encoder[PaginatedEncounterMethodSummaryList] = deriveEncoder[PaginatedEncounterMethodSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedEncounterMethodSummaryList: Decoder[PaginatedEncounterMethodSummaryList] = deriveDecoder[PaginatedEncounterMethodSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedEvolutionChainSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[EvolutionChainSummary]
)
object PaginatedEvolutionChainSummaryList {
  implicit val encoderPaginatedEvolutionChainSummaryList: Encoder[PaginatedEvolutionChainSummaryList] = deriveEncoder[PaginatedEvolutionChainSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedEvolutionChainSummaryList: Decoder[PaginatedEvolutionChainSummaryList] = deriveDecoder[PaginatedEvolutionChainSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedEvolutionTriggerSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[EvolutionTriggerSummary]
)
object PaginatedEvolutionTriggerSummaryList {
  implicit val encoderPaginatedEvolutionTriggerSummaryList: Encoder[PaginatedEvolutionTriggerSummaryList] = deriveEncoder[PaginatedEvolutionTriggerSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedEvolutionTriggerSummaryList: Decoder[PaginatedEvolutionTriggerSummaryList] = deriveDecoder[PaginatedEvolutionTriggerSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedEvolutionVariableSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[EvolutionVariableSummary]
)
object PaginatedEvolutionVariableSummaryList {
  implicit val encoderPaginatedEvolutionVariableSummaryList: Encoder[PaginatedEvolutionVariableSummaryList] = deriveEncoder[PaginatedEvolutionVariableSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedEvolutionVariableSummaryList: Decoder[PaginatedEvolutionVariableSummaryList] = deriveDecoder[PaginatedEvolutionVariableSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedGenderSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[GenderSummary]
)
object PaginatedGenderSummaryList {
  implicit val encoderPaginatedGenderSummaryList: Encoder[PaginatedGenderSummaryList] = deriveEncoder[PaginatedGenderSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedGenderSummaryList: Decoder[PaginatedGenderSummaryList] = deriveDecoder[PaginatedGenderSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedGenerationSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[GenerationSummary]
)
object PaginatedGenerationSummaryList {
  implicit val encoderPaginatedGenerationSummaryList: Encoder[PaginatedGenerationSummaryList] = deriveEncoder[PaginatedGenerationSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedGenerationSummaryList: Decoder[PaginatedGenerationSummaryList] = deriveDecoder[PaginatedGenerationSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedGrowthRateSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[GrowthRateSummary]
)
object PaginatedGrowthRateSummaryList {
  implicit val encoderPaginatedGrowthRateSummaryList: Encoder[PaginatedGrowthRateSummaryList] = deriveEncoder[PaginatedGrowthRateSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedGrowthRateSummaryList: Decoder[PaginatedGrowthRateSummaryList] = deriveDecoder[PaginatedGrowthRateSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedItemAttributeSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[ItemAttributeSummary]
)
object PaginatedItemAttributeSummaryList {
  implicit val encoderPaginatedItemAttributeSummaryList: Encoder[PaginatedItemAttributeSummaryList] = deriveEncoder[PaginatedItemAttributeSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedItemAttributeSummaryList: Decoder[PaginatedItemAttributeSummaryList] = deriveDecoder[PaginatedItemAttributeSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedItemCategorySummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[ItemCategorySummary]
)
object PaginatedItemCategorySummaryList {
  implicit val encoderPaginatedItemCategorySummaryList: Encoder[PaginatedItemCategorySummaryList] = deriveEncoder[PaginatedItemCategorySummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedItemCategorySummaryList: Decoder[PaginatedItemCategorySummaryList] = deriveDecoder[PaginatedItemCategorySummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedItemFlingEffectSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[ItemFlingEffectSummary]
)
object PaginatedItemFlingEffectSummaryList {
  implicit val encoderPaginatedItemFlingEffectSummaryList: Encoder[PaginatedItemFlingEffectSummaryList] = deriveEncoder[PaginatedItemFlingEffectSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedItemFlingEffectSummaryList: Decoder[PaginatedItemFlingEffectSummaryList] = deriveDecoder[PaginatedItemFlingEffectSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedItemPocketSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[ItemPocketSummary]
)
object PaginatedItemPocketSummaryList {
  implicit val encoderPaginatedItemPocketSummaryList: Encoder[PaginatedItemPocketSummaryList] = deriveEncoder[PaginatedItemPocketSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedItemPocketSummaryList: Decoder[PaginatedItemPocketSummaryList] = deriveDecoder[PaginatedItemPocketSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedItemSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[ItemSummary]
)
object PaginatedItemSummaryList {
  implicit val encoderPaginatedItemSummaryList: Encoder[PaginatedItemSummaryList] = deriveEncoder[PaginatedItemSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedItemSummaryList: Decoder[PaginatedItemSummaryList] = deriveDecoder[PaginatedItemSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedLanguageSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[LanguageSummary]
)
object PaginatedLanguageSummaryList {
  implicit val encoderPaginatedLanguageSummaryList: Encoder[PaginatedLanguageSummaryList] = deriveEncoder[PaginatedLanguageSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedLanguageSummaryList: Decoder[PaginatedLanguageSummaryList] = deriveDecoder[PaginatedLanguageSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedLocationAreaSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[LocationAreaSummary]
)
object PaginatedLocationAreaSummaryList {
  implicit val encoderPaginatedLocationAreaSummaryList: Encoder[PaginatedLocationAreaSummaryList] = deriveEncoder[PaginatedLocationAreaSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedLocationAreaSummaryList: Decoder[PaginatedLocationAreaSummaryList] = deriveDecoder[PaginatedLocationAreaSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedLocationSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[LocationSummary]
)
object PaginatedLocationSummaryList {
  implicit val encoderPaginatedLocationSummaryList: Encoder[PaginatedLocationSummaryList] = deriveEncoder[PaginatedLocationSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedLocationSummaryList: Decoder[PaginatedLocationSummaryList] = deriveDecoder[PaginatedLocationSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedMachineSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[MachineSummary]
)
object PaginatedMachineSummaryList {
  implicit val encoderPaginatedMachineSummaryList: Encoder[PaginatedMachineSummaryList] = deriveEncoder[PaginatedMachineSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedMachineSummaryList: Decoder[PaginatedMachineSummaryList] = deriveDecoder[PaginatedMachineSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedMoveBattleStyleSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[MoveBattleStyleSummary]
)
object PaginatedMoveBattleStyleSummaryList {
  implicit val encoderPaginatedMoveBattleStyleSummaryList: Encoder[PaginatedMoveBattleStyleSummaryList] = deriveEncoder[PaginatedMoveBattleStyleSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedMoveBattleStyleSummaryList: Decoder[PaginatedMoveBattleStyleSummaryList] = deriveDecoder[PaginatedMoveBattleStyleSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedMoveDamageClassSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[MoveDamageClassSummary]
)
object PaginatedMoveDamageClassSummaryList {
  implicit val encoderPaginatedMoveDamageClassSummaryList: Encoder[PaginatedMoveDamageClassSummaryList] = deriveEncoder[PaginatedMoveDamageClassSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedMoveDamageClassSummaryList: Decoder[PaginatedMoveDamageClassSummaryList] = deriveDecoder[PaginatedMoveDamageClassSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedMoveLearnMethodSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[MoveLearnMethodSummary]
)
object PaginatedMoveLearnMethodSummaryList {
  implicit val encoderPaginatedMoveLearnMethodSummaryList: Encoder[PaginatedMoveLearnMethodSummaryList] = deriveEncoder[PaginatedMoveLearnMethodSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedMoveLearnMethodSummaryList: Decoder[PaginatedMoveLearnMethodSummaryList] = deriveDecoder[PaginatedMoveLearnMethodSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedMoveMetaAilmentSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[MoveMetaAilmentSummary]
)
object PaginatedMoveMetaAilmentSummaryList {
  implicit val encoderPaginatedMoveMetaAilmentSummaryList: Encoder[PaginatedMoveMetaAilmentSummaryList] = deriveEncoder[PaginatedMoveMetaAilmentSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedMoveMetaAilmentSummaryList: Decoder[PaginatedMoveMetaAilmentSummaryList] = deriveDecoder[PaginatedMoveMetaAilmentSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedMoveMetaCategorySummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[MoveMetaCategorySummary]
)
object PaginatedMoveMetaCategorySummaryList {
  implicit val encoderPaginatedMoveMetaCategorySummaryList: Encoder[PaginatedMoveMetaCategorySummaryList] = deriveEncoder[PaginatedMoveMetaCategorySummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedMoveMetaCategorySummaryList: Decoder[PaginatedMoveMetaCategorySummaryList] = deriveDecoder[PaginatedMoveMetaCategorySummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedMoveSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[MoveSummary]
)
object PaginatedMoveSummaryList {
  implicit val encoderPaginatedMoveSummaryList: Encoder[PaginatedMoveSummaryList] = deriveEncoder[PaginatedMoveSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedMoveSummaryList: Decoder[PaginatedMoveSummaryList] = deriveDecoder[PaginatedMoveSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedMoveTargetSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[MoveTargetSummary]
)
object PaginatedMoveTargetSummaryList {
  implicit val encoderPaginatedMoveTargetSummaryList: Encoder[PaginatedMoveTargetSummaryList] = deriveEncoder[PaginatedMoveTargetSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedMoveTargetSummaryList: Decoder[PaginatedMoveTargetSummaryList] = deriveDecoder[PaginatedMoveTargetSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedNatureSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[NatureSummary]
)
object PaginatedNatureSummaryList {
  implicit val encoderPaginatedNatureSummaryList: Encoder[PaginatedNatureSummaryList] = deriveEncoder[PaginatedNatureSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedNatureSummaryList: Decoder[PaginatedNatureSummaryList] = deriveDecoder[PaginatedNatureSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedPalParkAreaSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[PalParkAreaSummary]
)
object PaginatedPalParkAreaSummaryList {
  implicit val encoderPaginatedPalParkAreaSummaryList: Encoder[PaginatedPalParkAreaSummaryList] = deriveEncoder[PaginatedPalParkAreaSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedPalParkAreaSummaryList: Decoder[PaginatedPalParkAreaSummaryList] = deriveDecoder[PaginatedPalParkAreaSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedPokeathlonStatSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[PokeathlonStatSummary]
)
object PaginatedPokeathlonStatSummaryList {
  implicit val encoderPaginatedPokeathlonStatSummaryList: Encoder[PaginatedPokeathlonStatSummaryList] = deriveEncoder[PaginatedPokeathlonStatSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedPokeathlonStatSummaryList: Decoder[PaginatedPokeathlonStatSummaryList] = deriveDecoder[PaginatedPokeathlonStatSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedPokedexSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[PokedexSummary]
)
object PaginatedPokedexSummaryList {
  implicit val encoderPaginatedPokedexSummaryList: Encoder[PaginatedPokedexSummaryList] = deriveEncoder[PaginatedPokedexSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedPokedexSummaryList: Decoder[PaginatedPokedexSummaryList] = deriveDecoder[PaginatedPokedexSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedPokemonColorSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[PokemonColorSummary]
)
object PaginatedPokemonColorSummaryList {
  implicit val encoderPaginatedPokemonColorSummaryList: Encoder[PaginatedPokemonColorSummaryList] = deriveEncoder[PaginatedPokemonColorSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedPokemonColorSummaryList: Decoder[PaginatedPokemonColorSummaryList] = deriveDecoder[PaginatedPokemonColorSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedPokemonFormSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[PokemonFormSummary]
)
object PaginatedPokemonFormSummaryList {
  implicit val encoderPaginatedPokemonFormSummaryList: Encoder[PaginatedPokemonFormSummaryList] = deriveEncoder[PaginatedPokemonFormSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedPokemonFormSummaryList: Decoder[PaginatedPokemonFormSummaryList] = deriveDecoder[PaginatedPokemonFormSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedPokemonHabitatSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[PokemonHabitatSummary]
)
object PaginatedPokemonHabitatSummaryList {
  implicit val encoderPaginatedPokemonHabitatSummaryList: Encoder[PaginatedPokemonHabitatSummaryList] = deriveEncoder[PaginatedPokemonHabitatSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedPokemonHabitatSummaryList: Decoder[PaginatedPokemonHabitatSummaryList] = deriveDecoder[PaginatedPokemonHabitatSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedPokemonShapeSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[PokemonShapeSummary]
)
object PaginatedPokemonShapeSummaryList {
  implicit val encoderPaginatedPokemonShapeSummaryList: Encoder[PaginatedPokemonShapeSummaryList] = deriveEncoder[PaginatedPokemonShapeSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedPokemonShapeSummaryList: Decoder[PaginatedPokemonShapeSummaryList] = deriveDecoder[PaginatedPokemonShapeSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedPokemonSpeciesSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[PokemonSpeciesSummary]
)
object PaginatedPokemonSpeciesSummaryList {
  implicit val encoderPaginatedPokemonSpeciesSummaryList: Encoder[PaginatedPokemonSpeciesSummaryList] = deriveEncoder[PaginatedPokemonSpeciesSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedPokemonSpeciesSummaryList: Decoder[PaginatedPokemonSpeciesSummaryList] = deriveDecoder[PaginatedPokemonSpeciesSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedPokemonSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[PokemonSummary]
)
object PaginatedPokemonSummaryList {
  implicit val encoderPaginatedPokemonSummaryList: Encoder[PaginatedPokemonSummaryList] = deriveEncoder[PaginatedPokemonSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedPokemonSummaryList: Decoder[PaginatedPokemonSummaryList] = deriveDecoder[PaginatedPokemonSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedRegionSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[RegionSummary]
)
object PaginatedRegionSummaryList {
  implicit val encoderPaginatedRegionSummaryList: Encoder[PaginatedRegionSummaryList] = deriveEncoder[PaginatedRegionSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedRegionSummaryList: Decoder[PaginatedRegionSummaryList] = deriveDecoder[PaginatedRegionSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedStatSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[StatSummary]
)
object PaginatedStatSummaryList {
  implicit val encoderPaginatedStatSummaryList: Encoder[PaginatedStatSummaryList] = deriveEncoder[PaginatedStatSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedStatSummaryList: Decoder[PaginatedStatSummaryList] = deriveDecoder[PaginatedStatSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedSuperContestEffectSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[SuperContestEffectSummary]
)
object PaginatedSuperContestEffectSummaryList {
  implicit val encoderPaginatedSuperContestEffectSummaryList: Encoder[PaginatedSuperContestEffectSummaryList] = deriveEncoder[PaginatedSuperContestEffectSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedSuperContestEffectSummaryList: Decoder[PaginatedSuperContestEffectSummaryList] = deriveDecoder[PaginatedSuperContestEffectSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedTypeSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[TypeSummary]
)
object PaginatedTypeSummaryList {
  implicit val encoderPaginatedTypeSummaryList: Encoder[PaginatedTypeSummaryList] = deriveEncoder[PaginatedTypeSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedTypeSummaryList: Decoder[PaginatedTypeSummaryList] = deriveDecoder[PaginatedTypeSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedVersionGroupSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[VersionGroupSummary]
)
object PaginatedVersionGroupSummaryList {
  implicit val encoderPaginatedVersionGroupSummaryList: Encoder[PaginatedVersionGroupSummaryList] = deriveEncoder[PaginatedVersionGroupSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedVersionGroupSummaryList: Decoder[PaginatedVersionGroupSummaryList] = deriveDecoder[PaginatedVersionGroupSummaryList]
}

/**
* 
* @param count The total number of resources available from this API.
* @param next The URL for the next page in the list, or null if there is no next page.
* @param previous The URL for the previous page in the list, or null if there is no previous page.
* @param results A list of API resources on this page.
*/

case class PaginatedVersionSummaryList(
  count: Int,
  next: Option[URI],
  previous: Option[URI],
  results: List[VersionSummary]
)
object PaginatedVersionSummaryList {
  implicit val encoderPaginatedVersionSummaryList: Encoder[PaginatedVersionSummaryList] = deriveEncoder[PaginatedVersionSummaryList].mapJson(_.dropNullValues)
  implicit val decoderPaginatedVersionSummaryList: Decoder[PaginatedVersionSummaryList] = deriveDecoder[PaginatedVersionSummaryList]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param names The name of this resource listed in different languages.
* @param pokemonUnderscoreencounters A list of Pokémon encountered in thi pal park area along with details.
*/

case class PalParkAreaDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  names: List[PalParkAreaName],
  pokemonUnderscoreencounters: List[PalParkEncounter]
)
object PalParkAreaDetail {
  implicit val encoderPalParkAreaDetail: Encoder[PalParkAreaDetail] = deriveEncoder[PalParkAreaDetail].mapJson(_.dropNullValues)
  implicit val decoderPalParkAreaDetail: Decoder[PalParkAreaDetail] = deriveDecoder[PalParkAreaDetail]
}

/**
* 
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class PalParkAreaName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object PalParkAreaName {
  implicit val encoderPalParkAreaName: Encoder[PalParkAreaName] = deriveEncoder[PalParkAreaName].mapJson(_.dropNullValues)
  implicit val decoderPalParkAreaName: Decoder[PalParkAreaName] = deriveDecoder[PalParkAreaName]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class PalParkAreaSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object PalParkAreaSummary {
  implicit val encoderPalParkAreaSummary: Encoder[PalParkAreaSummary] = deriveEncoder[PalParkAreaSummary].mapJson(_.dropNullValues)
  implicit val decoderPalParkAreaSummary: Decoder[PalParkAreaSummary] = deriveDecoder[PalParkAreaSummary]
}

/**
* 
* @param baseUnderscorescore The base score given to the player when this Pokémon is caught during a pal park run.
* @param rate The base rate for encountering this Pokémon in this pal park area.
* @param pokemonUnderscorespecies The Pokémon species being encountered.
*/

case class PalParkEncounter(
  baseUnderscorescore: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  rate: Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]],
  pokemonUnderscorespecies: PokemonSpeciesSummary
)
object PalParkEncounter {
  implicit val encoderPalParkEncounter: Encoder[PalParkEncounter] = deriveEncoder[PalParkEncounter].mapJson(_.dropNullValues)
  implicit val decoderPalParkEncounter: Decoder[PalParkEncounter] = deriveDecoder[PalParkEncounter]
}

/**
* 
* @param deployUnderscoredate The deployment time as a Unix timestamp string.
* @param hash The source commit hash used for this deployment.
* @param tag The deployment tag, or null if the deployment has no tag.
*/

case class PokeapiMetaResponse(
  deployUnderscoredate: String,
  hash: String,
  tag: String
)
object PokeapiMetaResponse {
  implicit val encoderPokeapiMetaResponse: Encoder[PokeapiMetaResponse] = deriveEncoder[PokeapiMetaResponse].mapJson(_.dropNullValues)
  implicit val decoderPokeapiMetaResponse: Decoder[PokeapiMetaResponse] = deriveDecoder[PokeapiMetaResponse]
}

/**
* 
* @param maxUnderscorechange The maximum amount of change to the referenced Pokéathlon stat.
* @param nature The nature causing the change.
*/

case class PokeathlonStatAffectingNature(
  maxUnderscorechange: Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]],
  nature: NatureSummary
)
object PokeathlonStatAffectingNature {
  implicit val encoderPokeathlonStatAffectingNature: Encoder[PokeathlonStatAffectingNature] = deriveEncoder[PokeathlonStatAffectingNature].mapJson(_.dropNullValues)
  implicit val decoderPokeathlonStatAffectingNature: Decoder[PokeathlonStatAffectingNature] = deriveDecoder[PokeathlonStatAffectingNature]
}

/**
* 
* @param increase A list of natures and how they change the referenced Pokéathlon stat.
* @param decrease A list of natures and how they change the referenced Pokéathlon stat.
*/

case class PokeathlonStatAffectingNatures(
  increase: List[PokeathlonStatAffectingNature],
  decrease: List[PokeathlonStatAffectingNature]
)
object PokeathlonStatAffectingNatures {
  implicit val encoderPokeathlonStatAffectingNatures: Encoder[PokeathlonStatAffectingNatures] = deriveEncoder[PokeathlonStatAffectingNatures].mapJson(_.dropNullValues)
  implicit val decoderPokeathlonStatAffectingNatures: Decoder[PokeathlonStatAffectingNatures] = deriveDecoder[PokeathlonStatAffectingNatures]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param affectingUnderscorenatures A detail of natures which affect this Pokéathlon stat positively or negatively.
* @param names The name of this resource listed in different languages.
*/

case class PokeathlonStatDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  affectingUnderscorenatures: PokeathlonStatAffectingNatures,
  names: List[PokeathlonStatName]
)
object PokeathlonStatDetail {
  implicit val encoderPokeathlonStatDetail: Encoder[PokeathlonStatDetail] = deriveEncoder[PokeathlonStatDetail].mapJson(_.dropNullValues)
  implicit val decoderPokeathlonStatDetail: Decoder[PokeathlonStatDetail] = deriveDecoder[PokeathlonStatDetail]
}

/**
* 
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class PokeathlonStatName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object PokeathlonStatName {
  implicit val encoderPokeathlonStatName: Encoder[PokeathlonStatName] = deriveEncoder[PokeathlonStatName].mapJson(_.dropNullValues)
  implicit val decoderPokeathlonStatName: Decoder[PokeathlonStatName] = deriveDecoder[PokeathlonStatName]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class PokeathlonStatSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object PokeathlonStatSummary {
  implicit val encoderPokeathlonStatSummary: Encoder[PokeathlonStatSummary] = deriveEncoder[PokeathlonStatSummary].mapJson(_.dropNullValues)
  implicit val decoderPokeathlonStatSummary: Decoder[PokeathlonStatSummary] = deriveDecoder[PokeathlonStatSummary]
}

/**
* 
* @param description The localized description for an API resource in a specific language.
* @param language The language this name is in.
*/

case class PokedexDescription(
  description: Option[Refined[String, MaxSize[2000]]],
  language: LanguageSummary
)
object PokedexDescription {
  implicit val encoderPokedexDescription: Encoder[PokedexDescription] = deriveEncoder[PokedexDescription].mapJson(_.dropNullValues)
  implicit val decoderPokedexDescription: Decoder[PokedexDescription] = deriveDecoder[PokedexDescription]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param isUnderscoremainUnderscoreseries Whether or not this Pokédex originated in the main series of the video games.
* @param descriptions The description of this resource listed in different languages.
* @param names The name of this resource listed in different languages.
* @param pokemonUnderscoreentries A list of Pokémon catalogued in this Pokédex and their indexes.
* @param region The region this Pokédex catalogues Pokémon for.
* @param versionUnderscoregroups A list of version groups this Pokédex is relevant to.
*/

case class PokedexDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  isUnderscoremainUnderscoreseries: Option[Boolean],
  descriptions: List[PokedexDescription],
  names: List[PokedexName],
  pokemonUnderscoreentries: List[PokemonDexNumber],
  region: RegionSummary,
  versionUnderscoregroups: List[VersionGroupSummary]
)
object PokedexDetail {
  implicit val encoderPokedexDetail: Encoder[PokedexDetail] = deriveEncoder[PokedexDetail].mapJson(_.dropNullValues)
  implicit val decoderPokedexDetail: Decoder[PokedexDetail] = deriveDecoder[PokedexDetail]
}

/**
* 
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class PokedexName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object PokedexName {
  implicit val encoderPokedexName: Encoder[PokedexName] = deriveEncoder[PokedexName].mapJson(_.dropNullValues)
  implicit val decoderPokedexName: Decoder[PokedexName] = deriveDecoder[PokedexName]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class PokedexSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object PokedexSummary {
  implicit val encoderPokedexSummary: Encoder[PokedexSummary] = deriveEncoder[PokedexSummary].mapJson(_.dropNullValues)
  implicit val decoderPokedexSummary: Decoder[PokedexSummary] = deriveDecoder[PokedexSummary]
}

/**
* 
* @param isUnderscorehidden Whether or not this is a hidden ability.
* @param slot The slot this ability occupies in this Pokémon species.
* @param ability The ability the Pokémon may have.
*/

case class PokemonAbility(
  isUnderscorehidden: Option[Boolean],
  slot: Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]],
  ability: AbilitySummary
)
object PokemonAbility {
  implicit val encoderPokemonAbility: Encoder[PokemonAbility] = deriveEncoder[PokemonAbility].mapJson(_.dropNullValues)
  implicit val decoderPokemonAbility: Decoder[PokemonAbility] = deriveDecoder[PokemonAbility]
}

/**
* 
* @param isUnderscorehidden Whether or not this is a hidden ability.
* @param slot The slot this ability occupies in this Pokémon species.
* @param ability The ability the Pokémon may have.
*/

case class PokemonAbilityPast(
  isUnderscorehidden: Option[Boolean],
  slot: Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]],
  ability: AbilitySummary
)
object PokemonAbilityPast {
  implicit val encoderPokemonAbilityPast: Encoder[PokemonAbilityPast] = deriveEncoder[PokemonAbilityPast].mapJson(_.dropNullValues)
  implicit val decoderPokemonAbilityPast: Decoder[PokemonAbilityPast] = deriveDecoder[PokemonAbilityPast]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param names The name of this resource listed in different languages.
* @param pokemonUnderscorespecies A list of the Pokémon species that have this color.
*/

case class PokemonColorDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  names: List[PokemonColorName],
  pokemonUnderscorespecies: List[PokemonSpeciesSummary]
)
object PokemonColorDetail {
  implicit val encoderPokemonColorDetail: Encoder[PokemonColorDetail] = deriveEncoder[PokemonColorDetail].mapJson(_.dropNullValues)
  implicit val decoderPokemonColorDetail: Decoder[PokemonColorDetail] = deriveDecoder[PokemonColorDetail]
}

/**
* 
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class PokemonColorName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object PokemonColorName {
  implicit val encoderPokemonColorName: Encoder[PokemonColorName] = deriveEncoder[PokemonColorName].mapJson(_.dropNullValues)
  implicit val decoderPokemonColorName: Decoder[PokemonColorName] = deriveDecoder[PokemonColorName]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class PokemonColorSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object PokemonColorSummary {
  implicit val encoderPokemonColorSummary: Encoder[PokemonColorSummary] = deriveEncoder[PokemonColorSummary].mapJson(_.dropNullValues)
  implicit val decoderPokemonColorSummary: Decoder[PokemonColorSummary] = deriveDecoder[PokemonColorSummary]
}

/**
* 
* @param latest The latest depiction of this Pokémon's cry.
* @param legacy The legacy depiction of this Pokémon's cry.
*/

case class PokemonCries(
  latest: String,
  legacy: String
)
object PokemonCries {
  implicit val encoderPokemonCries: Encoder[PokemonCries] = deriveEncoder[PokemonCries].mapJson(_.dropNullValues)
  implicit val decoderPokemonCries: Decoder[PokemonCries] = deriveDecoder[PokemonCries]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param baseUnderscoreexperience The base experience gained for defeating this Pokémon.
* @param height The height of this Pokémon in decimetres.
* @param isUnderscoredefault Set for exactly one Pokémon used as the default for each species.
* @param order Order for sorting. Almost national order, except families are grouped together.
* @param weight The weight of this Pokémon in hectograms.
* @param abilities A list of abilities this Pokémon could potentially have.
* @param pastUnderscoreabilities A list of details showing abilities this pokémon had in previous generations
* @param forms A list of forms this Pokémon can take on.
* @param gameUnderscoreindices A list of game indices relevent to Pokémon item by generation.
* @param heldUnderscoreitems A list of items this Pokémon may be holding when encountered.
* @param locationUnderscoreareaUnderscoreencounters A link to a list of location areas, as well as encounter details pertaining to specific versions.
* @param moves A list of moves along with learn methods and level details pertaining to specific version groups.
* @param species The species this Pokémon belongs to.
* @param sprites A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a>
* @param cries A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a>
* @param stats A list of base stat values for this Pokémon.
* @param pastUnderscorestats A list of details showing stats this pokémon had in previous generations
* @param types A list of details showing types this Pokémon has.
* @param pastUnderscoretypes A list of details showing types this pokémon had in previous generations
*/

case class PokemonDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  baseUnderscoreexperience: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  height: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  isUnderscoredefault: Option[Boolean],
  order: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  weight: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  abilities: List[PokemonAbility],
  pastUnderscoreabilities: List[PokemonPastAbility],
  forms: List[PokemonFormSummary],
  gameUnderscoreindices: List[PokemonGameIndex],
  heldUnderscoreitems: List[PokemonHeldItemSummary],
  locationUnderscoreareaUnderscoreencounters: String,
  moves: List[PokemonMove],
  species: PokemonSpeciesSummary,
  sprites: PokemonSprites,
  cries: PokemonCries,
  stats: List[PokemonStat],
  pastUnderscorestats: List[PokemonPastStat],
  types: List[PokemonType],
  pastUnderscoretypes: List[PokemonPastType]
)
object PokemonDetail {
  implicit val encoderPokemonDetail: Encoder[PokemonDetail] = deriveEncoder[PokemonDetail].mapJson(_.dropNullValues)
  implicit val decoderPokemonDetail: Decoder[PokemonDetail] = deriveDecoder[PokemonDetail]
}

/**
* 
* @param entryUnderscorenumber The index number within the Pokédex.
* @param pokedex The Pokédex the referenced Pokémon species can be found in.
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
* @param entryUnderscorenumber The index of this Pokémon species entry within the Pokédex.
* @param pokemonUnderscorespecies The Pokémon species being encountered.
*/

case class PokemonDexNumber(
  entryUnderscorenumber: Int,
  pokemonUnderscorespecies: PokemonSpeciesSummary
)
object PokemonDexNumber {
  implicit val encoderPokemonDexNumber: Encoder[PokemonDexNumber] = deriveEncoder[PokemonDexNumber].mapJson(_.dropNullValues)
  implicit val decoderPokemonDexNumber: Decoder[PokemonDexNumber] = deriveDecoder[PokemonDexNumber]
}

/**
* 
* @param chance Percent chance that this encounter will occur.
* @param conditionUnderscorevalues A list of condition values that must be in effect for this encounter to occur.
* @param maxUnderscorelevel The highest level the Pokémon could be encountered at.
* @param method The method by which this encounter happens.
* @param minUnderscorelevel The lowest level the Pokémon could be encountered at.
*/

case class PokemonEncounterDetailResponse(
  chance: Int,
  conditionUnderscorevalues: List[EncounterConditionValueSummary],
  maxUnderscorelevel: Int,
  method: EncounterMethodSummary,
  minUnderscorelevel: Int
)
object PokemonEncounterDetailResponse {
  implicit val encoderPokemonEncounterDetailResponse: Encoder[PokemonEncounterDetailResponse] = deriveEncoder[PokemonEncounterDetailResponse].mapJson(_.dropNullValues)
  implicit val decoderPokemonEncounterDetailResponse: Decoder[PokemonEncounterDetailResponse] = deriveDecoder[PokemonEncounterDetailResponse]
}

/**
* 
* @param locationUnderscorearea The location area the referenced Pokémon can be encountered in.
* @param versionUnderscoredetails A list of versions and encounters with the referenced Pokémon that might happen.
*/

case class PokemonEncounterResponse(
  locationUnderscorearea: LocationAreaSummary,
  versionUnderscoredetails: List[PokemonEncounterVersionDetailResponse]
)
object PokemonEncounterResponse {
  implicit val encoderPokemonEncounterResponse: Encoder[PokemonEncounterResponse] = deriveEncoder[PokemonEncounterResponse].mapJson(_.dropNullValues)
  implicit val decoderPokemonEncounterResponse: Decoder[PokemonEncounterResponse] = deriveDecoder[PokemonEncounterResponse]
}

/**
* 
* @param version The game version this encounter happens in.
* @param maxUnderscorechance The total percentage of all encounter potential.
* @param encounterUnderscoredetails A list of encounters and their specifics.
*/

case class PokemonEncounterVersionDetailResponse(
  version: VersionSummary,
  maxUnderscorechance: Int,
  encounterUnderscoredetails: List[PokemonEncounterDetailResponse]
)
object PokemonEncounterVersionDetailResponse {
  implicit val encoderPokemonEncounterVersionDetailResponse: Encoder[PokemonEncounterVersionDetailResponse] = deriveEncoder[PokemonEncounterVersionDetailResponse].mapJson(_.dropNullValues)
  implicit val decoderPokemonEncounterVersionDetailResponse: Decoder[PokemonEncounterVersionDetailResponse] = deriveDecoder[PokemonEncounterVersionDetailResponse]
}

/**
* 
* @param versionUnderscoregroup The version group in which these evolution requirements apply.
* @param isUnderscoredefault Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one 'default' evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker.
* @param item The item required to cause evolution this into Pokémon species.
* @param trigger The type of event that triggers evolution into this Pokémon species.
* @param gender The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.
* @param heldUnderscoreitem The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.
* @param knownUnderscoremove 
* @param knownUnderscoremoveUnderscoretype 
* @param location The location the evolution must be triggered at.
* @param minUnderscorelevel The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.
* @param minUnderscorehappiness The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.
* @param minUnderscorebeauty The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.
* @param minUnderscoreaffection The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.
* @param nearUnderscorespecialUnderscorerock Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species.
* @param needsUnderscoremultiplayer Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle).
* @param needsUnderscoreoverworldUnderscorerain Whether or not it must be raining in the overworld to cause evolution this Pokémon species.
* @param partyUnderscorespecies The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.
* @param partyUnderscoretype The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.
* @param relativeUnderscorephysicalUnderscorestats The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense.
* @param timeUnderscoreofUnderscoreday The required time of day. Day or night.
* @param tradeUnderscorespecies Pokémon species for which this one must be traded.
* @param turnUnderscoreupsideUnderscoredown Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.
* @param region The required region in which this evolution can occur.
* @param requiredUnderscorepokemonUnderscoreform The Pokémon form required before evolving, or null if unrestricted.
* @param evolvedUnderscorepokemonUnderscoreform The Pokémon form produced by this evolution, or null if unspecified.
* @param usedUnderscoremove The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.
* @param minUnderscoremoveUnderscorecount The minimum number of times a move must be used in order to evolve into this Pokémon species.
* @param minUnderscoresteps The minimum number of steps that must be taken in order to evolve into this Pokémon species.
* @param minUnderscoredamageUnderscoretaken The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species.
* @param allowedUnderscorenatures The natures that allow this evolution, or null if unrestricted.
* @param conditionUnderscoreexpression An additional evolution condition expressed in reverse Polish notation, or null if none.
*/

case class PokemonEvolution(
  versionUnderscoregroup: VersionGroupSummary,
  isUnderscoredefault: Option[Boolean],
  item: ItemSummary,
  trigger: EvolutionTriggerSummary,
  gender: Option[Int],
  heldUnderscoreitem: ItemSummary,
  knownUnderscoremove: PokemonEvolutionKnownMove,
  knownUnderscoremoveUnderscoretype: PokemonEvolutionKnownMoveType,
  location: LocationSummary,
  minUnderscorelevel: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  minUnderscorehappiness: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  minUnderscorebeauty: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  minUnderscoreaffection: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  nearUnderscorespecialUnderscorerock: Option[Boolean],
  needsUnderscoremultiplayer: Option[Boolean],
  needsUnderscoreoverworldUnderscorerain: Option[Boolean],
  partyUnderscorespecies: PokemonSpeciesSummary,
  partyUnderscoretype: TypeSummary,
  relativeUnderscorephysicalUnderscorestats: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  timeUnderscoreofUnderscoreday: Option[Refined[String, MaxSize[10]]],
  tradeUnderscorespecies: PokemonSpeciesSummary,
  turnUnderscoreupsideUnderscoredown: Option[Boolean],
  region: RegionSummary,
  requiredUnderscorepokemonUnderscoreform: PokemonFormSummary,
  evolvedUnderscorepokemonUnderscoreform: PokemonFormSummary,
  usedUnderscoremove: MoveSummary,
  minUnderscoremoveUnderscorecount: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  minUnderscoresteps: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  minUnderscoredamageUnderscoretaken: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  allowedUnderscorenatures: List[NatureSummary],
  conditionUnderscoreexpression: EvolutionConditionExpression
)
object PokemonEvolution {
  implicit val encoderPokemonEvolution: Encoder[PokemonEvolution] = deriveEncoder[PokemonEvolution].mapJson(_.dropNullValues)
  implicit val decoderPokemonEvolution: Decoder[PokemonEvolution] = deriveDecoder[PokemonEvolution]
}

/**
* 
* @param name 
* @param url 
*/

case class PokemonEvolutionKnownMove(
  name: String,
  url: URI
)
object PokemonEvolutionKnownMove {
  implicit val encoderPokemonEvolutionKnownMove: Encoder[PokemonEvolutionKnownMove] = deriveEncoder[PokemonEvolutionKnownMove].mapJson(_.dropNullValues)
  implicit val decoderPokemonEvolutionKnownMove: Decoder[PokemonEvolutionKnownMove] = deriveDecoder[PokemonEvolutionKnownMove]
}

/**
* 
* @param name 
* @param url 
*/

case class PokemonEvolutionKnownMoveType(
  name: String,
  url: URI
)
object PokemonEvolutionKnownMoveType {
  implicit val encoderPokemonEvolutionKnownMoveType: Encoder[PokemonEvolutionKnownMoveType] = deriveEncoder[PokemonEvolutionKnownMoveType].mapJson(_.dropNullValues)
  implicit val decoderPokemonEvolutionKnownMoveType: Decoder[PokemonEvolutionKnownMoveType] = deriveDecoder[PokemonEvolutionKnownMoveType]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param order The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name.
* @param formUnderscoreorder The order in which forms should be sorted within a species' forms.
* @param isUnderscoredefault True for exactly one form used as the default for each Pokémon.
* @param isUnderscorebattleUnderscoreonly Whether or not this form can only happen during battle.
* @param isUnderscoremega Whether or not this form requires mega evolution.
* @param formUnderscorename The name of this form.
* @param pokemon The Pokémon that can take on this form.
* @param sprites A set of sprites used to depict this Pokémon form in the game.
* @param versionUnderscoregroup The version group this Pokémon form was introduced in.
* @param formUnderscorenames The form specific form name of this Pokémon form, or empty if the form does not have a specific name.
* @param names The form specific full name of this Pokémon form, or empty if the form does not have a specific name.
* @param types A list of details showing types this Pokémon form has.
* @param triggerUnderscoreconditions The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource.
* @param flavorUnderscoretextUnderscoreentries The flavor text of this form listed in different languages and versions.
*/

case class PokemonFormDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  order: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  formUnderscoreorder: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  isUnderscoredefault: Option[Boolean],
  isUnderscorebattleUnderscoreonly: Option[Boolean],
  isUnderscoremega: Option[Boolean],
  formUnderscorename: Refined[String, MaxSize[30]],
  pokemon: PokemonSummary,
  sprites: PokemonFormSprites,
  versionUnderscoregroup: VersionGroupSummary,
  formUnderscorenames: List[PokemonFormName],
  names: List[PokemonFormName],
  types: List[PokemonFormType],
  triggerUnderscoreconditions: List[PokemonFormTriggerCondition],
  flavorUnderscoretextUnderscoreentries: List[PokemonFormFlavorText]
)
object PokemonFormDetail {
  implicit val encoderPokemonFormDetail: Encoder[PokemonFormDetail] = deriveEncoder[PokemonFormDetail].mapJson(_.dropNullValues)
  implicit val decoderPokemonFormDetail: Decoder[PokemonFormDetail] = deriveDecoder[PokemonFormDetail]
}

/**
* 
* @param flavorUnderscoretext The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this <a href='https://github.com/veekun/pokedex/issues/218#issuecomment-339841781' >issue</a> to find out more. 
* @param language The language this name is in.
* @param version The game version this flavor text is extracted from.
*/

case class PokemonFormFlavorText(
  flavorUnderscoretext: String,
  language: LanguageSummary,
  version: VersionSummary
)
object PokemonFormFlavorText {
  implicit val encoderPokemonFormFlavorText: Encoder[PokemonFormFlavorText] = deriveEncoder[PokemonFormFlavorText].mapJson(_.dropNullValues)
  implicit val decoderPokemonFormFlavorText: Decoder[PokemonFormFlavorText] = deriveDecoder[PokemonFormFlavorText]
}

/**
* 
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class PokemonFormName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object PokemonFormName {
  implicit val encoderPokemonFormName: Encoder[PokemonFormName] = deriveEncoder[PokemonFormName].mapJson(_.dropNullValues)
  implicit val decoderPokemonFormName: Decoder[PokemonFormName] = deriveDecoder[PokemonFormName]
}

/**
* 
* @param frontUnderscoredefault The default depiction of this Pokémon from the front in battle.
* @param frontUnderscoreshiny The shiny depiction of this Pokémon from the front in battle.
* @param frontUnderscorefemale The female depiction of this Pokémon from the front in battle.
* @param frontUnderscoreshinyUnderscorefemale The shiny female depiction of this Pokémon from the front in battle.
* @param backUnderscoredefault The default depiction of this Pokémon from the back in battle.
* @param backUnderscoreshiny The shiny depiction of this Pokémon from the back in battle.
* @param backUnderscorefemale The female depiction of this Pokémon from the back in battle.
* @param backUnderscoreshinyUnderscorefemale The shiny female depiction of this Pokémon from the back in battle.
* @param other Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.
* @param versions Sprites grouped by generation and game. Available keys vary by resource.
*/

case class PokemonFormSprites(
  frontUnderscoredefault: String,
  frontUnderscoreshiny: String,
  frontUnderscorefemale: String,
  frontUnderscoreshinyUnderscorefemale: String,
  backUnderscoredefault: String,
  backUnderscoreshiny: String,
  backUnderscorefemale: String,
  backUnderscoreshinyUnderscorefemale: String,
  other: Option[PokemonSpritesOther],
  versions: Option[Map[String, Map[String, AnyType]]]
)
object PokemonFormSprites {
  implicit val encoderPokemonFormSprites: Encoder[PokemonFormSprites] = deriveEncoder[PokemonFormSprites].mapJson(_.dropNullValues)
  implicit val decoderPokemonFormSprites: Decoder[PokemonFormSprites] = deriveDecoder[PokemonFormSprites]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class PokemonFormSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object PokemonFormSummary {
  implicit val encoderPokemonFormSummary: Encoder[PokemonFormSummary] = deriveEncoder[PokemonFormSummary].mapJson(_.dropNullValues)
  implicit val decoderPokemonFormSummary: Decoder[PokemonFormSummary] = deriveDecoder[PokemonFormSummary]
}

/**
* 
* @param trigger The trigger for this form change.
* @param name The name of the required item, ability, or move. Only present for a resource-based trigger.
* @param url The URL of the required item, ability, or move. Only present for a resource-based trigger.
* @param baseUnderscoreform The required base form. Only present when the trigger specifies one.
*/

case class PokemonFormTriggerCondition(
  trigger: String,
  name: Option[String],
  url: Option[URI],
  baseUnderscoreform: Option[PokemonFormSummary]
)
object PokemonFormTriggerCondition {
  implicit val encoderPokemonFormTriggerCondition: Encoder[PokemonFormTriggerCondition] = deriveEncoder[PokemonFormTriggerCondition].mapJson(_.dropNullValues)
  implicit val decoderPokemonFormTriggerCondition: Decoder[PokemonFormTriggerCondition] = deriveDecoder[PokemonFormTriggerCondition]
}

/**
* 
* @param slot The order the Pokémon's types are listed in.
* @param `type` The type the referenced Form has.
*/

case class PokemonFormType(
  slot: Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]],
  `type`: TypeSummary
)
object PokemonFormType {
  implicit val encoderPokemonFormType: Encoder[PokemonFormType] = deriveEncoder[PokemonFormType].mapJson(_.dropNullValues)
  implicit val decoderPokemonFormType: Decoder[PokemonFormType] = deriveDecoder[PokemonFormType]
}

/**
* 
* @param gameUnderscoreindex The internal id of an API resource within game data.
* @param version The version relevent to this game index.
*/

case class PokemonGameIndex(
  gameUnderscoreindex: Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]],
  version: VersionSummary
)
object PokemonGameIndex {
  implicit val encoderPokemonGameIndex: Encoder[PokemonGameIndex] = deriveEncoder[PokemonGameIndex].mapJson(_.dropNullValues)
  implicit val decoderPokemonGameIndex: Decoder[PokemonGameIndex] = deriveDecoder[PokemonGameIndex]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param names The name of this resource listed in different languages.
* @param pokemonUnderscorespecies A list of the Pokémon species that can be found in this habitat.
*/

case class PokemonHabitatDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  names: List[PokemonHabitatName],
  pokemonUnderscorespecies: List[PokemonSpeciesSummary]
)
object PokemonHabitatDetail {
  implicit val encoderPokemonHabitatDetail: Encoder[PokemonHabitatDetail] = deriveEncoder[PokemonHabitatDetail].mapJson(_.dropNullValues)
  implicit val decoderPokemonHabitatDetail: Decoder[PokemonHabitatDetail] = deriveDecoder[PokemonHabitatDetail]
}

/**
* 
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class PokemonHabitatName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object PokemonHabitatName {
  implicit val encoderPokemonHabitatName: Encoder[PokemonHabitatName] = deriveEncoder[PokemonHabitatName].mapJson(_.dropNullValues)
  implicit val decoderPokemonHabitatName: Decoder[PokemonHabitatName] = deriveDecoder[PokemonHabitatName]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class PokemonHabitatSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object PokemonHabitatSummary {
  implicit val encoderPokemonHabitatSummary: Encoder[PokemonHabitatSummary] = deriveEncoder[PokemonHabitatSummary].mapJson(_.dropNullValues)
  implicit val decoderPokemonHabitatSummary: Decoder[PokemonHabitatSummary] = deriveDecoder[PokemonHabitatSummary]
}

/**
* 
* @param pokemon The Pokémon that holds this item.
* @param versionUnderscoredetails The details for the version that this item is held in by the Pokémon.
*/

case class PokemonHeldItem(
  pokemon: PokemonSummary,
  versionUnderscoredetails: List[PokemonHeldItemVersion]
)
object PokemonHeldItem {
  implicit val encoderPokemonHeldItem: Encoder[PokemonHeldItem] = deriveEncoder[PokemonHeldItem].mapJson(_.dropNullValues)
  implicit val decoderPokemonHeldItem: Decoder[PokemonHeldItem] = deriveDecoder[PokemonHeldItem]
}

/**
* 
* @param item The item the referenced Pokémon holds.
* @param versionUnderscoredetails The details of the different versions in which the item is held.
*/

case class PokemonHeldItemSummary(
  item: ItemSummary,
  versionUnderscoredetails: List[PokemonHeldItemVersion]
)
object PokemonHeldItemSummary {
  implicit val encoderPokemonHeldItemSummary: Encoder[PokemonHeldItemSummary] = deriveEncoder[PokemonHeldItemSummary].mapJson(_.dropNullValues)
  implicit val decoderPokemonHeldItemSummary: Decoder[PokemonHeldItemSummary] = deriveDecoder[PokemonHeldItemSummary]
}

/**
* 
* @param rarity How often the item is held.
* @param version The version in which the item is held.
*/

case class PokemonHeldItemVersion(
  rarity: Int,
  version: VersionSummary
)
object PokemonHeldItemVersion {
  implicit val encoderPokemonHeldItemVersion: Encoder[PokemonHeldItemVersion] = deriveEncoder[PokemonHeldItemVersion].mapJson(_.dropNullValues)
  implicit val decoderPokemonHeldItemVersion: Decoder[PokemonHeldItemVersion] = deriveDecoder[PokemonHeldItemVersion]
}

/**
* 
* @param move The move the Pokémon can learn.
* @param versionUnderscoregroupUnderscoredetails The details of the version in which the Pokémon can learn the move.
*/

case class PokemonMove(
  move: MoveSummary,
  versionUnderscoregroupUnderscoredetails: List[PokemonMoveVersionGroup]
)
object PokemonMove {
  implicit val encoderPokemonMove: Encoder[PokemonMove] = deriveEncoder[PokemonMove].mapJson(_.dropNullValues)
  implicit val decoderPokemonMove: Decoder[PokemonMove] = deriveDecoder[PokemonMove]
}

/**
* 
* @param levelUnderscorelearnedUnderscoreat The minimum level to learn the move.
* @param moveUnderscorelearnUnderscoremethod The method by which the move is learned.
* @param versionUnderscoregroup The version group in which the move is learned.
* @param order Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order.
*/

case class PokemonMoveVersionGroup(
  levelUnderscorelearnedUnderscoreat: Int,
  moveUnderscorelearnUnderscoremethod: MoveLearnMethodSummary,
  versionUnderscoregroup: VersionGroupSummary,
  order: Option[Int]
)
object PokemonMoveVersionGroup {
  implicit val encoderPokemonMoveVersionGroup: Encoder[PokemonMoveVersionGroup] = deriveEncoder[PokemonMoveVersionGroup].mapJson(_.dropNullValues)
  implicit val decoderPokemonMoveVersionGroup: Decoder[PokemonMoveVersionGroup] = deriveDecoder[PokemonMoveVersionGroup]
}

/**
* 
* @param abilities The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty.
* @param generation The last generation in which the referenced pokémon had the listed abilities.
*/

case class PokemonPastAbility(
  abilities: List[PokemonAbilityPast],
  generation: GenerationSummary
)
object PokemonPastAbility {
  implicit val encoderPokemonPastAbility: Encoder[PokemonPastAbility] = deriveEncoder[PokemonPastAbility].mapJson(_.dropNullValues)
  implicit val decoderPokemonPastAbility: Decoder[PokemonPastAbility] = deriveDecoder[PokemonPastAbility]
}

/**
* 
* @param generation The last generation in which the referenced pokémon had the listed stats.
* @param stats The stat the Pokémon had up to and including the listed generation.
*/

case class PokemonPastStat(
  generation: GenerationSummary,
  stats: List[PokemonStat]
)
object PokemonPastStat {
  implicit val encoderPokemonPastStat: Encoder[PokemonPastStat] = deriveEncoder[PokemonPastStat].mapJson(_.dropNullValues)
  implicit val decoderPokemonPastStat: Decoder[PokemonPastStat] = deriveDecoder[PokemonPastStat]
}

/**
* 
* @param generation The last generation in which the referenced pokémon had the listed types.
* @param types The types the referenced pokémon had up to and including the listed generation.
*/

case class PokemonPastType(
  generation: GenerationSummary,
  types: List[PokemonType]
)
object PokemonPastType {
  implicit val encoderPokemonPastType: Encoder[PokemonPastType] = deriveEncoder[PokemonPastType].mapJson(_.dropNullValues)
  implicit val decoderPokemonPastType: Decoder[PokemonPastType] = deriveDecoder[PokemonPastType]
}

/**
* 
* @param awesomeUnderscorename The localized \"scientific\" name for an API resource in a specific language.
* @param language The language this \"scientific\" name is in.
*/

case class PokemonShapeAwesomeName(
  awesomeUnderscorename: Refined[String, MaxSize[30]],
  language: LanguageSummary
)
object PokemonShapeAwesomeName {
  implicit val encoderPokemonShapeAwesomeName: Encoder[PokemonShapeAwesomeName] = deriveEncoder[PokemonShapeAwesomeName].mapJson(_.dropNullValues)
  implicit val decoderPokemonShapeAwesomeName: Decoder[PokemonShapeAwesomeName] = deriveDecoder[PokemonShapeAwesomeName]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param awesomeUnderscorenames The \"scientific\" name of this Pokémon shape listed in different languages.
* @param names The name of this resource listed in different languages.
* @param pokemonUnderscorespecies A list of the Pokémon species that have this shape.
*/

case class PokemonShapeDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  awesomeUnderscorenames: List[PokemonShapeAwesomeName],
  names: List[PokemonShapeName],
  pokemonUnderscorespecies: List[PokemonSpeciesSummary]
)
object PokemonShapeDetail {
  implicit val encoderPokemonShapeDetail: Encoder[PokemonShapeDetail] = deriveEncoder[PokemonShapeDetail].mapJson(_.dropNullValues)
  implicit val decoderPokemonShapeDetail: Decoder[PokemonShapeDetail] = deriveDecoder[PokemonShapeDetail]
}

/**
* 
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class PokemonShapeName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object PokemonShapeName {
  implicit val encoderPokemonShapeName: Encoder[PokemonShapeName] = deriveEncoder[PokemonShapeName].mapJson(_.dropNullValues)
  implicit val decoderPokemonShapeName: Decoder[PokemonShapeName] = deriveDecoder[PokemonShapeName]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class PokemonShapeSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object PokemonShapeSummary {
  implicit val encoderPokemonShapeSummary: Encoder[PokemonShapeSummary] = deriveEncoder[PokemonShapeSummary].mapJson(_.dropNullValues)
  implicit val decoderPokemonShapeSummary: Decoder[PokemonShapeSummary] = deriveDecoder[PokemonShapeSummary]
}

/**
* 
* @param description The localized description for an API resource in a specific language.
* @param language The language this name is in.
*/

case class PokemonSpeciesDescription(
  description: Option[Refined[String, MaxSize[2000]]],
  language: LanguageSummary
)
object PokemonSpeciesDescription {
  implicit val encoderPokemonSpeciesDescription: Encoder[PokemonSpeciesDescription] = deriveEncoder[PokemonSpeciesDescription].mapJson(_.dropNullValues)
  implicit val decoderPokemonSpeciesDescription: Decoder[PokemonSpeciesDescription] = deriveDecoder[PokemonSpeciesDescription]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param order The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage.
* @param genderUnderscorerate The chance of this Pokémon being female, in eighths; or -1 for genderless.
* @param captureUnderscorerate The base capture rate; up to 255. The higher the number, the easier the catch.
* @param baseUnderscorehappiness The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon.
* @param isUnderscorebaby Whether or not this is a baby Pokémon.
* @param isUnderscorelegendary Whether or not this is a legendary Pokémon.
* @param isUnderscoremythical Whether or not this is a mythical Pokémon.
* @param hatchUnderscorecounter Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon's egg hatches, unless utilizing bonuses like Flame Body's. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long.
* @param hasUnderscoregenderUnderscoredifferences Whether or not this Pokémon has visual gender differences.
* @param formsUnderscoreswitchable Whether or not this Pokémon has multiple forms and can switch between them.
* @param growthUnderscorerate The rate at which this Pokémon species gains levels.
* @param pokedexUnderscorenumbers A list of Pokedexes and the indexes reserved within them for this Pokémon species.
* @param eggUnderscoregroups A list of egg groups this Pokémon species is a member of.
* @param color The color of this Pokémon for Pokédex search.
* @param shape The shape of this Pokémon for Pokédex search.
* @param evolvesUnderscorefromUnderscorespecies The Pokémon species that evolves into this Pokemon_species.
* @param evolutionUnderscorechain The evolution chain this Pokémon species is a member of.
* @param habitat The habitat this Pokémon species can be encountered in.
* @param generation The generation this Pokémon species was introduced in.
* @param names The name of this resource listed in different languages.
* @param palUnderscoreparkUnderscoreencounters A list of encounters that can be had with this Pokémon species in pal park.
* @param formUnderscoredescriptions Descriptions of different forms Pokémon take on within the Pokémon species.
* @param flavorUnderscoretextUnderscoreentries A list of flavor text entries for this Pokémon species.
* @param genera The genus of this Pokémon species listed in multiple languages.
* @param varieties A list of the Pokémon that exist within this Pokémon species.
*/

case class PokemonSpeciesDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  order: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  genderUnderscorerate: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  captureUnderscorerate: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  baseUnderscorehappiness: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  isUnderscorebaby: Option[Boolean],
  isUnderscorelegendary: Option[Boolean],
  isUnderscoremythical: Option[Boolean],
  hatchUnderscorecounter: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  hasUnderscoregenderUnderscoredifferences: Option[Boolean],
  formsUnderscoreswitchable: Option[Boolean],
  growthUnderscorerate: GrowthRateSummary,
  pokedexUnderscorenumbers: List[PokemonDexEntry],
  eggUnderscoregroups: List[EggGroupSummary],
  color: PokemonColorSummary,
  shape: PokemonShapeSummary,
  evolvesUnderscorefromUnderscorespecies: PokemonSpeciesSummary,
  evolutionUnderscorechain: EvolutionChainSummary,
  habitat: PokemonHabitatSummary,
  generation: GenerationSummary,
  names: List[PokemonSpeciesName],
  palUnderscoreparkUnderscoreencounters: List[PokemonSpeciesPalParkEncounter],
  formUnderscoredescriptions: List[PokemonSpeciesDescription],
  flavorUnderscoretextUnderscoreentries: List[PokemonSpeciesFlavorText],
  genera: List[PokemonSpeciesGenus],
  varieties: List[PokemonSpeciesVariety]
)
object PokemonSpeciesDetail {
  implicit val encoderPokemonSpeciesDetail: Encoder[PokemonSpeciesDetail] = deriveEncoder[PokemonSpeciesDetail].mapJson(_.dropNullValues)
  implicit val decoderPokemonSpeciesDetail: Decoder[PokemonSpeciesDetail] = deriveDecoder[PokemonSpeciesDetail]
}

/**
* 
* @param flavorUnderscoretext The localized flavor text for an API resource in a specific language. Note that this text is left unprocessed as it is found in game files. This means that it contains special characters that one might want to replace with their visible decodable version. Please check out this <a href='https://github.com/veekun/pokedex/issues/218#issuecomment-339841781' >issue</a> to find out more. 
* @param language The language this name is in.
* @param version The game version this flavor text is extracted from.
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
* @param genus The localized genus for the referenced Pokémon species
* @param language The language this genus is in.
*/

case class PokemonSpeciesGenus(
  genus: Refined[String, MaxSize[30]],
  language: LanguageSummary
)
object PokemonSpeciesGenus {
  implicit val encoderPokemonSpeciesGenus: Encoder[PokemonSpeciesGenus] = deriveEncoder[PokemonSpeciesGenus].mapJson(_.dropNullValues)
  implicit val decoderPokemonSpeciesGenus: Decoder[PokemonSpeciesGenus] = deriveDecoder[PokemonSpeciesGenus]
}

/**
* 
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class PokemonSpeciesName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object PokemonSpeciesName {
  implicit val encoderPokemonSpeciesName: Encoder[PokemonSpeciesName] = deriveEncoder[PokemonSpeciesName].mapJson(_.dropNullValues)
  implicit val decoderPokemonSpeciesName: Decoder[PokemonSpeciesName] = deriveDecoder[PokemonSpeciesName]
}

/**
* 
* @param baseUnderscorescore The base score given to the player when the referenced Pokémon is caught during a pal park run.
* @param rate The base rate for encountering the referenced Pokémon in this pal park area.
* @param area The pal park area where this encounter happens.
*/

case class PokemonSpeciesPalParkEncounter(
  baseUnderscorescore: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  rate: Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]],
  area: PalParkAreaSummary
)
object PokemonSpeciesPalParkEncounter {
  implicit val encoderPokemonSpeciesPalParkEncounter: Encoder[PokemonSpeciesPalParkEncounter] = deriveEncoder[PokemonSpeciesPalParkEncounter].mapJson(_.dropNullValues)
  implicit val decoderPokemonSpeciesPalParkEncounter: Decoder[PokemonSpeciesPalParkEncounter] = deriveDecoder[PokemonSpeciesPalParkEncounter]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class PokemonSpeciesSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object PokemonSpeciesSummary {
  implicit val encoderPokemonSpeciesSummary: Encoder[PokemonSpeciesSummary] = deriveEncoder[PokemonSpeciesSummary].mapJson(_.dropNullValues)
  implicit val decoderPokemonSpeciesSummary: Decoder[PokemonSpeciesSummary] = deriveDecoder[PokemonSpeciesSummary]
}

/**
* 
* @param isUnderscoredefault Whether this variety is the default variety.
* @param pokemon The Pokémon variety.
*/

case class PokemonSpeciesVariety(
  isUnderscoredefault: Boolean,
  pokemon: PokemonSummary
)
object PokemonSpeciesVariety {
  implicit val encoderPokemonSpeciesVariety: Encoder[PokemonSpeciesVariety] = deriveEncoder[PokemonSpeciesVariety].mapJson(_.dropNullValues)
  implicit val decoderPokemonSpeciesVariety: Decoder[PokemonSpeciesVariety] = deriveDecoder[PokemonSpeciesVariety]
}

/**
* 
* @param frontUnderscoredefault The default depiction of this Pokémon from the front in battle.
* @param frontUnderscoreshiny The shiny depiction of this Pokémon from the front in battle.
* @param frontUnderscorefemale The female depiction of this Pokémon from the front in battle.
* @param frontUnderscoreshinyUnderscorefemale The shiny female depiction of this Pokémon from the front in battle.
* @param backUnderscoredefault The default depiction of this Pokémon from the back in battle.
* @param backUnderscoreshiny The shiny depiction of this Pokémon from the back in battle.
* @param backUnderscorefemale The female depiction of this Pokémon from the back in battle.
* @param backUnderscoreshinyUnderscorefemale The shiny female depiction of this Pokémon from the back in battle.
* @param other Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.
* @param versions Sprites grouped by generation and game. Available keys vary by resource.
*/

case class PokemonSprites(
  frontUnderscoredefault: String,
  frontUnderscoreshiny: String,
  frontUnderscorefemale: String,
  frontUnderscoreshinyUnderscorefemale: String,
  backUnderscoredefault: String,
  backUnderscoreshiny: String,
  backUnderscorefemale: String,
  backUnderscoreshinyUnderscorefemale: String,
  other: Option[PokemonSpritesOther],
  versions: Option[Map[String, Map[String, AnyType]]]
)
object PokemonSprites {
  implicit val encoderPokemonSprites: Encoder[PokemonSprites] = deriveEncoder[PokemonSprites].mapJson(_.dropNullValues)
  implicit val decoderPokemonSprites: Decoder[PokemonSprites] = deriveDecoder[PokemonSprites]
}

/**
* 
* @param dreamUnderscoreworld Pokémon Dream World artwork URLs.
* @param home Pokémon HOME sprite URLs.
* @param showdown Pokémon Showdown sprite URLs.
* @param officialMinusartwork Official Pokémon artwork URLs, including shiny artwork and version-specific variants.
*/

case class PokemonSpritesOther(
  dreamUnderscoreworld: Option[PokemonSpritesOtherDreamWorld],
  home: Option[PokemonSpritesOtherHome],
  showdown: Option[PokemonSpritesOtherShowdown],
  officialMinusartwork: Option[PokemonSpritesOtherOfficialArtwork]
)
object PokemonSpritesOther {
  implicit val encoderPokemonSpritesOther: Encoder[PokemonSpritesOther] = deriveEncoder[PokemonSpritesOther].mapJson(_.dropNullValues)
  implicit val decoderPokemonSpritesOther: Decoder[PokemonSpritesOther] = deriveDecoder[PokemonSpritesOther]
}

/**
* 
* @param frontUnderscoredefault The URL of the default Pokémon Dream World front image, or null if unavailable.
* @param frontUnderscorefemale The URL of the female Pokémon Dream World front image, or null if unavailable.
*/

case class PokemonSpritesOtherDreamWorld(
  frontUnderscoredefault: String,
  frontUnderscorefemale: String
)
object PokemonSpritesOtherDreamWorld {
  implicit val encoderPokemonSpritesOtherDreamWorld: Encoder[PokemonSpritesOtherDreamWorld] = deriveEncoder[PokemonSpritesOtherDreamWorld].mapJson(_.dropNullValues)
  implicit val decoderPokemonSpritesOtherDreamWorld: Decoder[PokemonSpritesOtherDreamWorld] = deriveDecoder[PokemonSpritesOtherDreamWorld]
}

/**
* 
* @param frontUnderscoredefault The URL of the default Pokémon HOME front image, or null if unavailable.
* @param frontUnderscorefemale The URL of the female Pokémon HOME front image, or null if unavailable.
* @param frontUnderscoreshiny The URL of the shiny Pokémon HOME front image, or null if unavailable.
* @param frontUnderscoreshinyUnderscorefemale The URL of the shiny female Pokémon HOME front image, or null if unavailable.
*/

case class PokemonSpritesOtherHome(
  frontUnderscoredefault: String,
  frontUnderscorefemale: String,
  frontUnderscoreshiny: String,
  frontUnderscoreshinyUnderscorefemale: String
)
object PokemonSpritesOtherHome {
  implicit val encoderPokemonSpritesOtherHome: Encoder[PokemonSpritesOtherHome] = deriveEncoder[PokemonSpritesOtherHome].mapJson(_.dropNullValues)
  implicit val decoderPokemonSpritesOtherHome: Decoder[PokemonSpritesOtherHome] = deriveDecoder[PokemonSpritesOtherHome]
}

/**
* 
* @param frontUnderscoredefault The URL of the default front official artwork, or null if unavailable.
* @param frontUnderscoreshiny The URL of the shiny front official artwork, or null if unavailable.
* @param versions Additional official artwork grouped by version. Available keys vary by resource.
*/

case class PokemonSpritesOtherOfficialArtwork(
  frontUnderscoredefault: String,
  frontUnderscoreshiny: String,
  versions: Option[Map[String, Map[String, AnyType]]]
)
object PokemonSpritesOtherOfficialArtwork {
  implicit val encoderPokemonSpritesOtherOfficialArtwork: Encoder[PokemonSpritesOtherOfficialArtwork] = deriveEncoder[PokemonSpritesOtherOfficialArtwork].mapJson(_.dropNullValues)
  implicit val decoderPokemonSpritesOtherOfficialArtwork: Decoder[PokemonSpritesOtherOfficialArtwork] = deriveDecoder[PokemonSpritesOtherOfficialArtwork]
}

/**
* 
* @param frontUnderscoredefault The URL of the default Pokémon Showdown front image, or null if unavailable.
* @param frontUnderscorefemale The URL of the female Pokémon Showdown front image, or null if unavailable.
* @param frontUnderscoreshiny The URL of the shiny Pokémon Showdown front image, or null if unavailable.
* @param frontUnderscoreshinyUnderscorefemale The URL of the shiny female Pokémon Showdown front image, or null if unavailable.
* @param backUnderscoredefault The URL of the default Pokémon Showdown back image, or null if unavailable.
* @param backUnderscorefemale The URL of the female Pokémon Showdown back image, or null if unavailable.
* @param backUnderscoreshiny The URL of the shiny Pokémon Showdown back image, or null if unavailable.
* @param backUnderscoreshinyUnderscorefemale The URL of the shiny female Pokémon Showdown back image, or null if unavailable.
*/

case class PokemonSpritesOtherShowdown(
  frontUnderscoredefault: String,
  frontUnderscorefemale: String,
  frontUnderscoreshiny: String,
  frontUnderscoreshinyUnderscorefemale: String,
  backUnderscoredefault: String,
  backUnderscorefemale: String,
  backUnderscoreshiny: String,
  backUnderscoreshinyUnderscorefemale: String
)
object PokemonSpritesOtherShowdown {
  implicit val encoderPokemonSpritesOtherShowdown: Encoder[PokemonSpritesOtherShowdown] = deriveEncoder[PokemonSpritesOtherShowdown].mapJson(_.dropNullValues)
  implicit val decoderPokemonSpritesOtherShowdown: Decoder[PokemonSpritesOtherShowdown] = deriveDecoder[PokemonSpritesOtherShowdown]
}

/**
* 
* @param baseUnderscorestat The base value of the stat.
* @param effort The effort points (EV) the Pokémon has in the stat.
* @param stat The stat the Pokémon has.
*/

case class PokemonStat(
  baseUnderscorestat: Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]],
  effort: Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]],
  stat: StatSummary
)
object PokemonStat {
  implicit val encoderPokemonStat: Encoder[PokemonStat] = deriveEncoder[PokemonStat].mapJson(_.dropNullValues)
  implicit val decoderPokemonStat: Decoder[PokemonStat] = deriveDecoder[PokemonStat]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class PokemonSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object PokemonSummary {
  implicit val encoderPokemonSummary: Encoder[PokemonSummary] = deriveEncoder[PokemonSummary].mapJson(_.dropNullValues)
  implicit val decoderPokemonSummary: Decoder[PokemonSummary] = deriveDecoder[PokemonSummary]
}

/**
* 
* @param slot The order the Pokémon's types are listed in.
* @param `type` The type the referenced Pokémon has.
*/

case class PokemonType(
  slot: Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]],
  `type`: TypeSummary
)
object PokemonType {
  implicit val encoderPokemonType: Encoder[PokemonType] = deriveEncoder[PokemonType].mapJson(_.dropNullValues)
  implicit val decoderPokemonType: Decoder[PokemonType] = deriveDecoder[PokemonType]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param locations A list of locations that can be found in this region.
* @param mainUnderscoregeneration The generation this region was introduced in.
* @param names The name of this resource listed in different languages.
* @param pokedexes A list of pokédexes that catalogue Pokémon in this region.
* @param versionUnderscoregroups A list of version groups where this region can be visited.
*/

case class RegionDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  locations: List[LocationSummary],
  mainUnderscoregeneration: GenerationSummary,
  names: List[RegionName],
  pokedexes: List[PokedexSummary],
  versionUnderscoregroups: List[VersionGroupSummary]
)
object RegionDetail {
  implicit val encoderRegionDetail: Encoder[RegionDetail] = deriveEncoder[RegionDetail].mapJson(_.dropNullValues)
  implicit val decoderRegionDetail: Decoder[RegionDetail] = deriveDecoder[RegionDetail]
}

/**
* 
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class RegionName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object RegionName {
  implicit val encoderRegionName: Encoder[RegionName] = deriveEncoder[RegionName].mapJson(_.dropNullValues)
  implicit val decoderRegionName: Decoder[RegionName] = deriveDecoder[RegionName]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class RegionSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object RegionSummary {
  implicit val encoderRegionSummary: Encoder[RegionSummary] = deriveEncoder[RegionSummary].mapJson(_.dropNullValues)
  implicit val decoderRegionSummary: Decoder[RegionSummary] = deriveDecoder[RegionSummary]
}

/**
* 
* @param increase A list of moves and how they change the referenced stat.
* @param decrease A list of moves and how they change the referenced stat.
*/

case class StatAffectingMoves(
  increase: List[MoveStatChange],
  decrease: List[MoveStatChange]
)
object StatAffectingMoves {
  implicit val encoderStatAffectingMoves: Encoder[StatAffectingMoves] = deriveEncoder[StatAffectingMoves].mapJson(_.dropNullValues)
  implicit val decoderStatAffectingMoves: Decoder[StatAffectingMoves] = deriveDecoder[StatAffectingMoves]
}

/**
* 
* @param increase A list of natures and how they change the referenced stat.
* @param decrease A list of nature sand how they change the referenced stat.
*/

case class StatAffectingNatures(
  increase: List[NatureSummary],
  decrease: List[NatureSummary]
)
object StatAffectingNatures {
  implicit val encoderStatAffectingNatures: Encoder[StatAffectingNatures] = deriveEncoder[StatAffectingNatures].mapJson(_.dropNullValues)
  implicit val decoderStatAffectingNatures: Decoder[StatAffectingNatures] = deriveDecoder[StatAffectingNatures]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param gameUnderscoreindex ID the games use for this stat.
* @param isUnderscorebattleUnderscoreonly Whether this stat only exists within a battle.
* @param affectingUnderscoremoves A detail of moves which affect this stat positively or negatively.
* @param affectingUnderscorenatures A detail of natures which affect this stat positively or negatively.
* @param affectingUnderscoreitems Items that affect this stat, such as vitamins and battle items.
* @param characteristics A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
* @param moveUnderscoredamageUnderscoreclass The class of damage this stat is directly related to.
* @param names The name of this resource listed in different languages.
*/

case class StatDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  gameUnderscoreindex: Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]],
  isUnderscorebattleUnderscoreonly: Option[Boolean],
  affectingUnderscoremoves: StatAffectingMoves,
  affectingUnderscorenatures: StatAffectingNatures,
  affectingUnderscoreitems: List[ItemSummary],
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
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class StatName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object StatName {
  implicit val encoderStatName: Encoder[StatName] = deriveEncoder[StatName].mapJson(_.dropNullValues)
  implicit val decoderStatName: Decoder[StatName] = deriveDecoder[StatName]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class StatSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object StatSummary {
  implicit val encoderStatSummary: Encoder[StatSummary] = deriveEncoder[StatSummary].mapJson(_.dropNullValues)
  implicit val decoderStatSummary: Decoder[StatSummary] = deriveDecoder[StatSummary]
}

/**
* 
* @param id The identifier for this resource.
* @param appeal The level of appeal this super contest effect has.
* @param flavorUnderscoretextUnderscoreentries The flavor text of this super contest effect listed in different languages.
* @param moves A list of moves that have the effect when used in super contests.
*/

case class SuperContestEffectDetail(
  id: Int,
  appeal: Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]],
  flavorUnderscoretextUnderscoreentries: List[SuperContestEffectFlavorText],
  moves: List[MoveSummary]
)
object SuperContestEffectDetail {
  implicit val encoderSuperContestEffectDetail: Encoder[SuperContestEffectDetail] = deriveEncoder[SuperContestEffectDetail].mapJson(_.dropNullValues)
  implicit val decoderSuperContestEffectDetail: Decoder[SuperContestEffectDetail] = deriveDecoder[SuperContestEffectDetail]
}

/**
* 
* @param flavorUnderscoretext The localized flavor text for an API resource in a specific language.
* @param language The language this name is in.
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
* @param url The URL of the referenced resource.
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
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param damageUnderscorerelations A detail of how effective this type is toward others and vice versa.
* @param pastUnderscoredamageUnderscorerelations A list of details of how effective this type was toward others and vice versa in previous generations
* @param gameUnderscoreindices A list of game indices relevent to this item by generation.
* @param generation The generation this type was introduced in.
* @param moveUnderscoredamageUnderscoreclass The class of damage inflicted by this type.
* @param names The name of this resource listed in different languages.
* @param pokemon A list of details of Pokémon that have this type.
* @param moves A list of moves that have this type.
* @param sprites Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.
*/

case class TypeDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  damageUnderscorerelations: TypeRelationships,
  pastUnderscoredamageUnderscorerelations: List[TypePastRelationships],
  gameUnderscoreindices: List[TypeGameIndex],
  generation: GenerationSummary,
  moveUnderscoredamageUnderscoreclass: MoveDamageClassSummary,
  names: List[TypeName],
  pokemon: List[TypePokemon],
  moves: List[MoveSummary],
  sprites: Map[String, Map[String, TypeGameSprite]]
)
object TypeDetail {
  implicit val encoderTypeDetail: Encoder[TypeDetail] = deriveEncoder[TypeDetail].mapJson(_.dropNullValues)
  implicit val decoderTypeDetail: Decoder[TypeDetail] = deriveDecoder[TypeDetail]
}

/**
* 
* @param gameUnderscoreindex The internal id of an API resource within game data.
* @param generation The generation relevent to this game index.
*/

case class TypeGameIndex(
  gameUnderscoreindex: Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]],
  generation: GenerationSummary
)
object TypeGameIndex {
  implicit val encoderTypeGameIndex: Encoder[TypeGameIndex] = deriveEncoder[TypeGameIndex].mapJson(_.dropNullValues)
  implicit val decoderTypeGameIndex: Decoder[TypeGameIndex] = deriveDecoder[TypeGameIndex]
}

/**
* 
* @param nameUnderscoreicon The URL of the icon displaying the type name in this game, or null if unavailable.
* @param symbolUnderscoreicon The URL of the type symbol icon in this game, or null if unavailable.
*/

case class TypeGameSprite(
  nameUnderscoreicon: Option[String],
  symbolUnderscoreicon: Option[String]
)
object TypeGameSprite {
  implicit val encoderTypeGameSprite: Encoder[TypeGameSprite] = deriveEncoder[TypeGameSprite].mapJson(_.dropNullValues)
  implicit val decoderTypeGameSprite: Decoder[TypeGameSprite] = deriveDecoder[TypeGameSprite]
}

/**
* 
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class TypeName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object TypeName {
  implicit val encoderTypeName: Encoder[TypeName] = deriveEncoder[TypeName].mapJson(_.dropNullValues)
  implicit val decoderTypeName: Decoder[TypeName] = deriveDecoder[TypeName]
}

/**
* 
* @param generation The last generation in which the referenced type had the listed damage relations
* @param damageUnderscorerelations The damage relations the referenced type had up to and including the listed generation
*/

case class TypePastRelationships(
  generation: GenerationSummary,
  damageUnderscorerelations: TypeRelationships
)
object TypePastRelationships {
  implicit val encoderTypePastRelationships: Encoder[TypePastRelationships] = deriveEncoder[TypePastRelationships].mapJson(_.dropNullValues)
  implicit val decoderTypePastRelationships: Decoder[TypePastRelationships] = deriveDecoder[TypePastRelationships]
}

/**
* 
* @param slot The order the Pokémon's types are listed in.
* @param pokemon The Pokémon that has the referenced type.
*/

case class TypePokemon(
  slot: Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]],
  pokemon: PokemonSummary
)
object TypePokemon {
  implicit val encoderTypePokemon: Encoder[TypePokemon] = deriveEncoder[TypePokemon].mapJson(_.dropNullValues)
  implicit val decoderTypePokemon: Decoder[TypePokemon] = deriveDecoder[TypePokemon]
}

/**
* 
* @param noUnderscoredamageUnderscoreto A list of types this type has no effect on.
* @param halfUnderscoredamageUnderscoreto A list of types this type is not very effect against.
* @param doubleUnderscoredamageUnderscoreto A list of types this type is very effect against.
* @param noUnderscoredamageUnderscorefrom A list of types that have no effect on this type.
* @param halfUnderscoredamageUnderscorefrom A list of types that are not very effective against this type.
* @param doubleUnderscoredamageUnderscorefrom A list of types that are very effective against this type.
*/

case class TypeRelationships(
  noUnderscoredamageUnderscoreto: List[TypeSummary],
  halfUnderscoredamageUnderscoreto: List[TypeSummary],
  doubleUnderscoredamageUnderscoreto: List[TypeSummary],
  noUnderscoredamageUnderscorefrom: List[TypeSummary],
  halfUnderscoredamageUnderscorefrom: List[TypeSummary],
  doubleUnderscoredamageUnderscorefrom: List[TypeSummary]
)
object TypeRelationships {
  implicit val encoderTypeRelationships: Encoder[TypeRelationships] = deriveEncoder[TypeRelationships].mapJson(_.dropNullValues)
  implicit val decoderTypeRelationships: Decoder[TypeRelationships] = deriveDecoder[TypeRelationships]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class TypeSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object TypeSummary {
  implicit val encoderTypeSummary: Encoder[TypeSummary] = deriveEncoder[TypeSummary].mapJson(_.dropNullValues)
  implicit val decoderTypeSummary: Decoder[TypeSummary] = deriveDecoder[TypeSummary]
}

/**
* Should have a link to Version Group info but the Circular dependency and compilation order fight eachother and I'm not sure how to add anything other than a hyperlink
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param names The name of this resource listed in different languages.
* @param versionUnderscoregroup The version group this version belongs to.
*/

case class VersionDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  names: List[VersionName],
  versionUnderscoregroup: VersionGroupSummary
)
object VersionDetail {
  implicit val encoderVersionDetail: Encoder[VersionDetail] = deriveEncoder[VersionDetail].mapJson(_.dropNullValues)
  implicit val decoderVersionDetail: Decoder[VersionDetail] = deriveDecoder[VersionDetail]
}

/**
* 
* @param id The identifier for this resource.
* @param name The name for this resource.
* @param order Order for sorting. Almost by date of release, except similar versions are grouped together.
* @param generation The generation this version was introduced in.
* @param moveUnderscorelearnUnderscoremethods A list of methods in which Pokémon can learn moves in this version group.
* @param pokedexes A list of Pokédexes introduces in this version group.
* @param regions A list of regions that can be visited in this version group.
* @param versions The versions this version group owns.
*/

case class VersionGroupDetail(
  id: Int,
  name: Refined[String, MaxSize[200]],
  order: Option[Refined[Int, GreaterEqual[-2147483648] And LessEqual[2147483647]]],
  generation: GenerationSummary,
  moveUnderscorelearnUnderscoremethods: List[MoveLearnMethodSummary],
  pokedexes: List[PokedexSummary],
  regions: List[RegionSummary],
  versions: List[VersionSummary]
)
object VersionGroupDetail {
  implicit val encoderVersionGroupDetail: Encoder[VersionGroupDetail] = deriveEncoder[VersionGroupDetail].mapJson(_.dropNullValues)
  implicit val decoderVersionGroupDetail: Decoder[VersionGroupDetail] = deriveDecoder[VersionGroupDetail]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class VersionGroupSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object VersionGroupSummary {
  implicit val encoderVersionGroupSummary: Encoder[VersionGroupSummary] = deriveEncoder[VersionGroupSummary].mapJson(_.dropNullValues)
  implicit val decoderVersionGroupSummary: Decoder[VersionGroupSummary] = deriveDecoder[VersionGroupSummary]
}

/**
* 
* @param name The localized name for an API resource in a specific language.
* @param language The language this name is in.
*/

case class VersionName(
  name: Refined[String, MaxSize[200]],
  language: LanguageSummary
)
object VersionName {
  implicit val encoderVersionName: Encoder[VersionName] = deriveEncoder[VersionName].mapJson(_.dropNullValues)
  implicit val decoderVersionName: Decoder[VersionName] = deriveDecoder[VersionName]
}

/**
* 
* @param name The name of the referenced resource.
* @param url The URL of the referenced resource.
*/

case class VersionSummary(
  name: Refined[String, MaxSize[200]],
  url: URI
)
object VersionSummary {
  implicit val encoderVersionSummary: Encoder[VersionSummary] = deriveEncoder[VersionSummary].mapJson(_.dropNullValues)
  implicit val decoderVersionSummary: Decoder[VersionSummary] = deriveDecoder[VersionSummary]
}

