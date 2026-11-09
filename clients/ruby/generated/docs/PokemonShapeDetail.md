# PokeApiClient::PokemonShapeDetail

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | The identifier for this resource. | [readonly] |
| **name** | **String** | The name for this resource. |  |
| **awesome_names** | [**Array&lt;PokemonShapeAwesomeName&gt;**](PokemonShapeAwesomeName.md) | The \&quot;scientific\&quot; name of this Pokémon shape listed in different languages. | [readonly] |
| **names** | [**Array&lt;PokemonShapeName&gt;**](PokemonShapeName.md) | The name of this resource listed in different languages. | [readonly] |
| **pokemon_species** | [**Array&lt;PokemonSpeciesSummary&gt;**](PokemonSpeciesSummary.md) | A list of the Pokémon species that have this shape. | [readonly] |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokemonShapeDetail.new(
  id: null,
  name: null,
  awesome_names: null,
  names: null,
  pokemon_species: null
)
```

