
package org.openapitools.client.model


case class PokemonSpeciesDetail (
    _id: Integer,
    _name: String,
    _order: Option[Integer],
    _genderRate: Option[Integer],
    _captureRate: Option[Integer],
    _baseHappiness: Option[Integer],
    _isBaby: Option[Boolean],
    _isLegendary: Option[Boolean],
    _isMythical: Option[Boolean],
    _hatchCounter: Option[Integer],
    _hasGenderDifferences: Option[Boolean],
    _formsSwitchable: Option[Boolean],
    _growthRate: GrowthRateSummary,
    _pokedexNumbers: List[PokemonDexEntry],
    _eggGroups: List[AbilityDetailPokemonInnerPokemon],
    _color: PokemonColorSummary,
    _shape: PokemonShapeSummary,
    _evolvesFromSpecies: PokemonSpeciesSummary,
    _evolutionChain: EvolutionChainSummary,
    _habitat: PokemonHabitatSummary,
    _generation: GenerationSummary,
    _names: List[PokemonFormDetailFormNamesInner],
    _palParkEncounters: List[PokemonSpeciesDetailPalParkEncountersInner],
    _formDescriptions: List[PokemonSpeciesDescription],
    _flavorTextEntries: List[PokemonSpeciesFlavorText],
    _genera: List[PokemonSpeciesDetailGeneraInner],
    _varieties: List[PokemonSpeciesDetailVarietiesInner]
)
object PokemonSpeciesDetail {
    def toStringBody(var_id: Object, var_name: Object, var_order: Object, var_genderRate: Object, var_captureRate: Object, var_baseHappiness: Object, var_isBaby: Object, var_isLegendary: Object, var_isMythical: Object, var_hatchCounter: Object, var_hasGenderDifferences: Object, var_formsSwitchable: Object, var_growthRate: Object, var_pokedexNumbers: Object, var_eggGroups: Object, var_color: Object, var_shape: Object, var_evolvesFromSpecies: Object, var_evolutionChain: Object, var_habitat: Object, var_generation: Object, var_names: Object, var_palParkEncounters: Object, var_formDescriptions: Object, var_flavorTextEntries: Object, var_genera: Object, var_varieties: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"order":$var_order,"genderRate":$var_genderRate,"captureRate":$var_captureRate,"baseHappiness":$var_baseHappiness,"isBaby":$var_isBaby,"isLegendary":$var_isLegendary,"isMythical":$var_isMythical,"hatchCounter":$var_hatchCounter,"hasGenderDifferences":$var_hasGenderDifferences,"formsSwitchable":$var_formsSwitchable,"growthRate":$var_growthRate,"pokedexNumbers":$var_pokedexNumbers,"eggGroups":$var_eggGroups,"color":$var_color,"shape":$var_shape,"evolvesFromSpecies":$var_evolvesFromSpecies,"evolutionChain":$var_evolutionChain,"habitat":$var_habitat,"generation":$var_generation,"names":$var_names,"palParkEncounters":$var_palParkEncounters,"formDescriptions":$var_formDescriptions,"flavorTextEntries":$var_flavorTextEntries,"genera":$var_genera,"varieties":$var_varieties
        | }
        """.stripMargin
}
