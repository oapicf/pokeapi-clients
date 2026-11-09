
package org.openapitools.client.model


case class PokemonSpeciesDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* The order in which species should be sorted. Based on National Dex order, except families are grouped together and sorted by stage. */
    _order: Option[Integer],
    /* The chance of this Pokémon being female, in eighths; or -1 for genderless. */
    _genderRate: Option[Integer],
    /* The base capture rate; up to 255. The higher the number, the easier the catch. */
    _captureRate: Option[Integer],
    /* The happiness when caught by a normal Pokéball; up to 255. The higher the number, the happier the Pokémon. */
    _baseHappiness: Option[Integer],
    /* Whether or not this is a baby Pokémon. */
    _isBaby: Option[Boolean],
    /* Whether or not this is a legendary Pokémon. */
    _isLegendary: Option[Boolean],
    /* Whether or not this is a mythical Pokémon. */
    _isMythical: Option[Boolean],
    /* Initial hatch counter: one must walk Y × (hatch_counter + 1) steps before this Pokémon's egg hatches, unless utilizing bonuses like Flame Body's. Y varies per generation. In Generations II, III, and VII, Egg cycles are 256 steps long. In Generation IV, Egg cycles are 255 steps long. In Pokémon Brilliant Diamond and Shining Pearl, Egg cycles are also 255 steps long, but are shorter on special dates. In Generations V and VI, Egg cycles are 257 steps long. In Pokémon Sword and Shield, and in Pokémon Scarlet and Violet, Egg cycles are 128 steps long. */
    _hatchCounter: Option[Integer],
    /* Whether or not this Pokémon has visual gender differences. */
    _hasGenderDifferences: Option[Boolean],
    /* Whether or not this Pokémon has multiple forms and can switch between them. */
    _formsSwitchable: Option[Boolean],
    /* The rate at which this Pokémon species gains levels. */
    _growthRate: GrowthRateSummary,
    /* A list of Pokedexes and the indexes reserved within them for this Pokémon species. */
    _pokedexNumbers: List[PokemonDexEntry],
    /* A list of egg groups this Pokémon species is a member of. */
    _eggGroups: List[EggGroupSummary],
    /* The color of this Pokémon for Pokédex search. */
    _color: PokemonColorSummary,
    /* The shape of this Pokémon for Pokédex search. */
    _shape: PokemonShapeSummary,
    /* The Pokémon species that evolves into this Pokemon_species. */
    _evolvesFromSpecies: PokemonSpeciesSummary,
    /* The evolution chain this Pokémon species is a member of. */
    _evolutionChain: EvolutionChainSummary,
    /* The habitat this Pokémon species can be encountered in. */
    _habitat: PokemonHabitatSummary,
    /* The generation this Pokémon species was introduced in. */
    _generation: GenerationSummary,
    /* The name of this resource listed in different languages. */
    _names: List[PokemonSpeciesName],
    /* A list of encounters that can be had with this Pokémon species in pal park. */
    _palParkEncounters: List[PokemonSpeciesPalParkEncounter],
    /* Descriptions of different forms Pokémon take on within the Pokémon species. */
    _formDescriptions: List[PokemonSpeciesDescription],
    /* A list of flavor text entries for this Pokémon species. */
    _flavorTextEntries: List[PokemonSpeciesFlavorText],
    /* The genus of this Pokémon species listed in multiple languages. */
    _genera: List[PokemonSpeciesGenus],
    /* A list of the Pokémon that exist within this Pokémon species. */
    _varieties: List[PokemonSpeciesVariety]
)
object PokemonSpeciesDetail {
    def toStringBody(var_id: Object, var_name: Object, var_order: Object, var_genderRate: Object, var_captureRate: Object, var_baseHappiness: Object, var_isBaby: Object, var_isLegendary: Object, var_isMythical: Object, var_hatchCounter: Object, var_hasGenderDifferences: Object, var_formsSwitchable: Object, var_growthRate: Object, var_pokedexNumbers: Object, var_eggGroups: Object, var_color: Object, var_shape: Object, var_evolvesFromSpecies: Object, var_evolutionChain: Object, var_habitat: Object, var_generation: Object, var_names: Object, var_palParkEncounters: Object, var_formDescriptions: Object, var_flavorTextEntries: Object, var_genera: Object, var_varieties: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"order":$var_order,"genderRate":$var_genderRate,"captureRate":$var_captureRate,"baseHappiness":$var_baseHappiness,"isBaby":$var_isBaby,"isLegendary":$var_isLegendary,"isMythical":$var_isMythical,"hatchCounter":$var_hatchCounter,"hasGenderDifferences":$var_hasGenderDifferences,"formsSwitchable":$var_formsSwitchable,"growthRate":$var_growthRate,"pokedexNumbers":$var_pokedexNumbers,"eggGroups":$var_eggGroups,"color":$var_color,"shape":$var_shape,"evolvesFromSpecies":$var_evolvesFromSpecies,"evolutionChain":$var_evolutionChain,"habitat":$var_habitat,"generation":$var_generation,"names":$var_names,"palParkEncounters":$var_palParkEncounters,"formDescriptions":$var_formDescriptions,"flavorTextEntries":$var_flavorTextEntries,"genera":$var_genera,"varieties":$var_varieties
        | }
        """.stripMargin
}
