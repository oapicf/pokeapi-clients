# POKEMON_DETAIL

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_32** | The identifier for this resource. | [readonly] [default to null]
**name** | [**STRING_32**](STRING_32.md) | The name for this resource. | [default to null]
**base_experience** | **INTEGER_32** | The base experience gained for defeating this Pokémon. | [optional] [default to null]
**height** | **INTEGER_32** | The height of this Pokémon in decimetres. | [optional] [default to null]
**is_default** | **BOOLEAN** | Set for exactly one Pokémon used as the default for each species. | [optional] [default to null]
**order** | **INTEGER_32** | Order for sorting. Almost national order, except families are grouped together. | [optional] [default to null]
**weight** | **INTEGER_32** | The weight of this Pokémon in hectograms. | [optional] [default to null]
**abilities** | [**LIST [POKEMON_ABILITY]**](PokemonAbility.md) | A list of abilities this Pokémon could potentially have. | [readonly] [default to null]
**past_abilities** | [**LIST [POKEMON_PAST_ABILITY]**](PokemonPastAbility.md) | A list of details showing abilities this pokémon had in previous generations | [readonly] [default to null]
**forms** | [**LIST [POKEMON_FORM_SUMMARY]**](PokemonFormSummary.md) | A list of forms this Pokémon can take on. | [readonly] [default to null]
**game_indices** | [**LIST [POKEMON_GAME_INDEX]**](PokemonGameIndex.md) | A list of game indices relevent to Pokémon item by generation. | [readonly] [default to null]
**held_items** | [**LIST [POKEMON_HELD_ITEM_SUMMARY]**](PokemonHeldItemSummary.md) | A list of items this Pokémon may be holding when encountered. | [readonly] [default to null]
**location_area_encounters** | [**STRING_32**](STRING_32.md) | A link to a list of location areas, as well as encounter details pertaining to specific versions. | [readonly] [default to null]
**moves** | [**LIST [POKEMON_MOVE]**](PokemonMove.md) | A list of moves along with learn methods and level details pertaining to specific version groups. | [readonly] [default to null]
**species** | [**POKEMON_SPECIES_SUMMARY**](PokemonSpeciesSummary.md) | The species this Pokémon belongs to. | [default to null]
**sprites** | [**POKEMON_SPRITES**](PokemonSprites.md) | A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/sprites#sprites&#39;&gt;PokeAPI/sprites&lt;/a&gt; | [readonly] [default to null]
**cries** | [**POKEMON_CRIES**](PokemonCries.md) | A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/cries#cries&#39;&gt;PokeAPI/cries&lt;/a&gt; | [readonly] [default to null]
**stats** | [**LIST [POKEMON_STAT]**](PokemonStat.md) | A list of base stat values for this Pokémon. | [readonly] [default to null]
**past_stats** | [**LIST [POKEMON_PAST_STAT]**](PokemonPastStat.md) | A list of details showing stats this pokémon had in previous generations | [readonly] [default to null]
**types** | [**LIST [POKEMON_TYPE]**](PokemonType.md) | A list of details showing types this Pokémon has. | [readonly] [default to null]
**past_types** | [**LIST [POKEMON_PAST_TYPE]**](PokemonPastType.md) | A list of details showing types this pokémon had in previous generations | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


