# openapi::PokemonDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | The identifier for this resource. | [readonly] 
**name** | **character** | The name for this resource. | [Max. length: 200] 
**base_experience** | **integer** | The base experience gained for defeating this Pokémon. | [optional] [Max: 2147483647] [Min: -2147483648] 
**height** | **integer** | The height of this Pokémon in decimetres. | [optional] [Max: 2147483647] [Min: -2147483648] 
**is_default** | **character** | Set for exactly one Pokémon used as the default for each species. | [optional] 
**order** | **integer** | Order for sorting. Almost national order, except families are grouped together. | [optional] [Max: 2147483647] [Min: -2147483648] 
**weight** | **integer** | The weight of this Pokémon in hectograms. | [optional] [Max: 2147483647] [Min: -2147483648] 
**abilities** | [**array[PokemonAbility]**](PokemonAbility.md) | A list of abilities this Pokémon could potentially have. | [readonly] 
**past_abilities** | [**array[PokemonPastAbility]**](PokemonPastAbility.md) | A list of details showing abilities this pokémon had in previous generations | [readonly] 
**forms** | [**array[PokemonFormSummary]**](PokemonFormSummary.md) | A list of forms this Pokémon can take on. | [readonly] 
**game_indices** | [**array[PokemonGameIndex]**](PokemonGameIndex.md) | A list of game indices relevent to Pokémon item by generation. | [readonly] 
**held_items** | [**array[PokemonHeldItemSummary]**](PokemonHeldItemSummary.md) | A list of items this Pokémon may be holding when encountered. | [readonly] 
**location_area_encounters** | **character** | A link to a list of location areas, as well as encounter details pertaining to specific versions. | [readonly] 
**moves** | [**array[PokemonMove]**](PokemonMove.md) | A list of moves along with learn methods and level details pertaining to specific version groups. | [readonly] 
**species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The species this Pokémon belongs to. | 
**sprites** | [**PokemonSprites**](PokemonSprites.md) | A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/sprites#sprites&#39;&gt;PokeAPI/sprites&lt;/a&gt; | [readonly] 
**cries** | [**PokemonCries**](PokemonCries.md) | A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/cries#cries&#39;&gt;PokeAPI/cries&lt;/a&gt; | [readonly] 
**stats** | [**array[PokemonStat]**](PokemonStat.md) | A list of base stat values for this Pokémon. | [readonly] 
**past_stats** | [**array[PokemonPastStat]**](PokemonPastStat.md) | A list of details showing stats this pokémon had in previous generations | [readonly] 
**types** | [**array[PokemonType]**](PokemonType.md) | A list of details showing types this Pokémon has. | [readonly] 
**past_types** | [**array[PokemonPastType]**](PokemonPastType.md) | A list of details showing types this pokémon had in previous generations | [readonly] 


