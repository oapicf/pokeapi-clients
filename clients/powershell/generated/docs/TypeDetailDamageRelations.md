# TypeDetailDamageRelations
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NoDamageTo** | [**AbilityDetailPokemonInnerPokemon[]**](AbilityDetailPokemonInnerPokemon.md) |  | 
**HalfDamageTo** | [**AbilityDetailPokemonInnerPokemon[]**](AbilityDetailPokemonInnerPokemon.md) |  | 
**DoubleDamageTo** | [**AbilityDetailPokemonInnerPokemon[]**](AbilityDetailPokemonInnerPokemon.md) |  | 
**NoDamageFrom** | [**AbilityDetailPokemonInnerPokemon[]**](AbilityDetailPokemonInnerPokemon.md) |  | 
**HalfDamageFrom** | [**AbilityDetailPokemonInnerPokemon[]**](AbilityDetailPokemonInnerPokemon.md) |  | 
**DoubleDamageFrom** | [**AbilityDetailPokemonInnerPokemon[]**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Examples

- Prepare the resource
```powershell
$TypeDetailDamageRelations = Initialize-PSOpenAPIToolsTypeDetailDamageRelations  -NoDamageTo null `
 -HalfDamageTo null `
 -DoubleDamageTo null `
 -NoDamageFrom null `
 -HalfDamageFrom null `
 -DoubleDamageFrom null
```

- Convert the resource to JSON
```powershell
$TypeDetailDamageRelations | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

