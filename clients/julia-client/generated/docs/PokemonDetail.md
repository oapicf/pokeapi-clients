# PokemonDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`Int64`** | The identifier for this resource. | [readonly] [default to nothing]
**`name`** | **`String`** | The name for this resource. | [default to nothing]
**`base_experience`** | **`Int64`** | The base experience gained for defeating this Pokémon. | [optional] [default to nothing]
**`height`** | **`Int64`** | The height of this Pokémon in decimetres. | [optional] [default to nothing]
**`is_default`** | **`Bool`** | Set for exactly one Pokémon used as the default for each species. | [optional] [default to nothing]
**`order`** | **`Int64`** | Order for sorting. Almost national order, except families are grouped together. | [optional] [default to nothing]
**`weight`** | **`Int64`** | The weight of this Pokémon in hectograms. | [optional] [default to nothing]
**`abilities`** | [**`Vector{PokemonAbility}`**](PokemonAbility.md) | A list of abilities this Pokémon could potentially have. | [readonly] [default to nothing]
**`past_abilities`** | [**`Vector{PokemonPastAbility}`**](PokemonPastAbility.md) | A list of details showing abilities this pokémon had in previous generations | [readonly] [default to nothing]
**`forms`** | [**`Vector{PokemonFormSummary}`**](PokemonFormSummary.md) | A list of forms this Pokémon can take on. | [readonly] [default to nothing]
**`game_indices`** | [**`Vector{PokemonGameIndex}`**](PokemonGameIndex.md) | A list of game indices relevent to Pokémon item by generation. | [readonly] [default to nothing]
**`held_items`** | [**`Vector{PokemonHeldItemSummary}`**](PokemonHeldItemSummary.md) | A list of items this Pokémon may be holding when encountered. | [readonly] [default to nothing]
**`location_area_encounters`** | **`String`** | A link to a list of location areas, as well as encounter details pertaining to specific versions. | [readonly] [default to nothing]
**`moves`** | [**`Vector{PokemonMove}`**](PokemonMove.md) | A list of moves along with learn methods and level details pertaining to specific version groups. | [readonly] [default to nothing]
**`species`** | [**`*PokemonSpeciesSummary`**](PokemonSpeciesSummary.md) | The species this Pokémon belongs to. | [default to nothing]
**`sprites`** | [**`*PokemonSprites`**](PokemonSprites.md) | A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/sprites#sprites&#39;&gt;PokeAPI/sprites&lt;/a&gt; | [readonly] [default to nothing]
**`cries`** | [**`*PokemonCries`**](PokemonCries.md) | A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/cries#cries&#39;&gt;PokeAPI/cries&lt;/a&gt; | [readonly] [default to nothing]
**`stats`** | [**`Vector{PokemonStat}`**](PokemonStat.md) | A list of base stat values for this Pokémon. | [readonly] [default to nothing]
**`past_stats`** | [**`Vector{PokemonPastStat}`**](PokemonPastStat.md) | A list of details showing stats this pokémon had in previous generations | [readonly] [default to nothing]
**`types`** | [**`Vector{PokemonType}`**](PokemonType.md) | A list of details showing types this Pokémon has. | [readonly] [default to nothing]
**`past_types`** | [**`Vector{PokemonPastType}`**](PokemonPastType.md) | A list of details showing types this pokémon had in previous generations | [readonly] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


