# TypeRelationships
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NoDamageTo** | [**TypeSummary[]**](TypeSummary.md) | A list of types this type has no effect on. | 
**HalfDamageTo** | [**TypeSummary[]**](TypeSummary.md) | A list of types this type is not very effect against. | 
**DoubleDamageTo** | [**TypeSummary[]**](TypeSummary.md) | A list of types this type is very effect against. | 
**NoDamageFrom** | [**TypeSummary[]**](TypeSummary.md) | A list of types that have no effect on this type. | 
**HalfDamageFrom** | [**TypeSummary[]**](TypeSummary.md) | A list of types that are not very effective against this type. | 
**DoubleDamageFrom** | [**TypeSummary[]**](TypeSummary.md) | A list of types that are very effective against this type. | 

## Examples

- Prepare the resource
```powershell
$TypeRelationships = Initialize-PSOpenAPIToolsTypeRelationships  -NoDamageTo null `
 -HalfDamageTo null `
 -DoubleDamageTo null `
 -NoDamageFrom null `
 -HalfDamageFrom null `
 -DoubleDamageFrom null
```

- Convert the resource to JSON
```powershell
$TypeRelationships | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

