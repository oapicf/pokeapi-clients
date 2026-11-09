# openapi::AbilityPokemonDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_hidden** | **character** | Whether or not this a hidden ability for the referenced Pokémon. | [optional] 
**slot** | **integer** | Pokémon have 3 ability &#39;slots&#39; which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon. | [Max: 2147483647] [Min: -2147483648] 
**pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon this ability could belong to. | 


