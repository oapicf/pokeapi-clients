
package org.openapitools.client.model


case class PokemonDetail (
    /* The identifier for this resource. */
    _id: Integer,
    /* The name for this resource. */
    _name: String,
    /* The base experience gained for defeating this Pokémon. */
    _baseExperience: Option[Integer],
    /* The height of this Pokémon in decimetres. */
    _height: Option[Integer],
    /* Set for exactly one Pokémon used as the default for each species. */
    _isDefault: Option[Boolean],
    /* Order for sorting. Almost national order, except families are grouped together. */
    _order: Option[Integer],
    /* The weight of this Pokémon in hectograms. */
    _weight: Option[Integer],
    /* A list of abilities this Pokémon could potentially have. */
    _abilities: List[PokemonAbility],
    /* A list of details showing abilities this pokémon had in previous generations */
    _pastAbilities: List[PokemonPastAbility],
    /* A list of forms this Pokémon can take on. */
    _forms: List[PokemonFormSummary],
    /* A list of game indices relevent to Pokémon item by generation. */
    _gameIndices: List[PokemonGameIndex],
    /* A list of items this Pokémon may be holding when encountered. */
    _heldItems: List[PokemonHeldItemSummary],
    /* A link to a list of location areas, as well as encounter details pertaining to specific versions. */
    _locationAreaEncounters: String,
    /* A list of moves along with learn methods and level details pertaining to specific version groups. */
    _moves: List[PokemonMove],
    /* The species this Pokémon belongs to. */
    _species: PokemonSpeciesSummary,
    /* A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a> */
    _sprites: PokemonSprites,
    /* A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a> */
    _cries: PokemonCries,
    /* A list of base stat values for this Pokémon. */
    _stats: List[PokemonStat],
    /* A list of details showing stats this pokémon had in previous generations */
    _pastStats: List[PokemonPastStat],
    /* A list of details showing types this Pokémon has. */
    _types: List[PokemonType],
    /* A list of details showing types this pokémon had in previous generations */
    _pastTypes: List[PokemonPastType]
)
object PokemonDetail {
    def toStringBody(var_id: Object, var_name: Object, var_baseExperience: Object, var_height: Object, var_isDefault: Object, var_order: Object, var_weight: Object, var_abilities: Object, var_pastAbilities: Object, var_forms: Object, var_gameIndices: Object, var_heldItems: Object, var_locationAreaEncounters: Object, var_moves: Object, var_species: Object, var_sprites: Object, var_cries: Object, var_stats: Object, var_pastStats: Object, var_types: Object, var_pastTypes: Object) =
        s"""
        | {
        | "id":$var_id,"name":$var_name,"baseExperience":$var_baseExperience,"height":$var_height,"isDefault":$var_isDefault,"order":$var_order,"weight":$var_weight,"abilities":$var_abilities,"pastAbilities":$var_pastAbilities,"forms":$var_forms,"gameIndices":$var_gameIndices,"heldItems":$var_heldItems,"locationAreaEncounters":$var_locationAreaEncounters,"moves":$var_moves,"species":$var_species,"sprites":$var_sprites,"cries":$var_cries,"stats":$var_stats,"pastStats":$var_pastStats,"types":$var_types,"pastTypes":$var_pastTypes
        | }
        """.stripMargin
}
