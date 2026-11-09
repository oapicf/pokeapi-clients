# PokeApiClient::PokeathlonStatAffectingNatures

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **increase** | [**Array&lt;PokeathlonStatAffectingNature&gt;**](PokeathlonStatAffectingNature.md) | A list of natures and how they change the referenced Pokéathlon stat. |  |
| **decrease** | [**Array&lt;PokeathlonStatAffectingNature&gt;**](PokeathlonStatAffectingNature.md) | A list of natures and how they change the referenced Pokéathlon stat. |  |

## Example

```ruby
require 'pokeapi_client'

instance = PokeApiClient::PokeathlonStatAffectingNatures.new(
  increase: null,
  decrease: null
)
```

