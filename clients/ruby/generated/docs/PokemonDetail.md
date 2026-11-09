# PokeApiClient::PokemonDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **base_experience** | **Integer** | The base experience gained for defeating this Pokémon. | [optional] |
| **height** | **Integer** | The height of this Pokémon in decimetres. | [optional] |
| **is_default** | **Boolean** | Set for exactly one Pokémon used as the default for each species. | [optional] |
| **order** | **Integer** | Order for sorting. Almost national order, except families are grouped together. | [optional] |
| **weight** | **Integer** | The weight of this Pokémon in hectograms. | [optional] |
| **abilities** | [**Array&lt;PokemonAbility&gt;**](PokemonAbility.md) | A list of abilities this Pokémon could potentially have. | [readonly] |
| **past_abilities** | [**Array&lt;PokemonPastAbility&gt;**](PokemonPastAbility.md) | A list of details showing abilities this pokémon had in previous generations | [readonly] |
| **forms** | [**Array&lt;PokemonFormSummary&gt;**](PokemonFormSummary.md) | A list of forms this Pokémon can take on. | [readonly] |
| **game_indices** | [**Array&lt;PokemonGameIndex&gt;**](PokemonGameIndex.md) | A list of game indices relevent to Pokémon item by generation. | [readonly] |
| **held_items** | [**Array&lt;PokemonHeldItemSummary&gt;**](PokemonHeldItemSummary.md) | A list of items this Pokémon may be holding when encountered. | [readonly] |
| **location_area_encounters** | **String** | A link to a list of location areas, as well as encounter details pertaining to specific versions. | [readonly] |
| **moves** | [**Array&lt;PokemonMove&gt;**](PokemonMove.md) | A list of moves along with learn methods and level details pertaining to specific version groups. | [readonly] |
| **species** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The species this Pokémon belongs to. |  |
| **sprites** | [**PokemonSprites**](PokemonSprites.md) | A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/sprites#sprites&#39;&gt;PokeAPI/sprites&lt;/a&gt; | [readonly] |
| **cries** | [**PokemonCries**](PokemonCries.md) | A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at &lt;a href&#x3D;&#39;https://github.com/PokeAPI/cries#cries&#39;&gt;PokeAPI/cries&lt;/a&gt; | [readonly] |
| **stats** | [**Array&lt;PokemonStat&gt;**](PokemonStat.md) | A list of base stat values for this Pokémon. | [readonly] |
| **past_stats** | [**Array&lt;PokemonPastStat&gt;**](PokemonPastStat.md) | A list of details showing stats this pokémon had in previous generations | [readonly] |
| **types** | [**Array&lt;PokemonType&gt;**](PokemonType.md) | A list of details showing types this Pokémon has. | [readonly] |
| **past_types** | [**Array&lt;PokemonPastType&gt;**](PokemonPastType.md) | A list of details showing types this pokémon had in previous generations | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonDetail.new(
  id: null,
  name: null,
  base_experience: null,
  height: null,
  is_default: null,
  order: null,
  weight: null,
  abilities: null,
  past_abilities: null,
  forms: null,
  game_indices: null,
  held_items: null,
  location_area_encounters: null,
  moves: null,
  species: null,
  sprites: null,
  cries: null,
  stats: null,
  past_stats: null,
  types: null,
  past_types: null
)
```

