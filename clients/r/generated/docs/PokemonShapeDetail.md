# openapi::PokemonShapeDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | The identifier for this resource. | [readonly] 
**name** | **character** | The name for this resource. | [Max. length: 200] 
**awesome_names** | [**array[PokemonShapeAwesomeName]**](PokemonShapeAwesomeName.md) | The \&quot;scientific\&quot; name of this Pokémon shape listed in different languages. | [readonly] 
**names** | [**array[PokemonShapeName]**](PokemonShapeName.md) | The name of this resource listed in different languages. | [readonly] 
**pokemon_species** | [**array[PokemonSpeciesSummary]**](PokemonSpeciesSummary.md) | A list of the Pokémon species that have this shape. | [readonly] 


