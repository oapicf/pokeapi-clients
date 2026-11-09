# WWW::OpenAPIClient::Object::EvolutionChainDetail

## Load the model package
```perl
use WWW::OpenAPIClient::Object::EvolutionChainDetail;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**baby_trigger_item** | [**ItemSummary**](ItemSummary.md) | The item that a Pokémon would be holding when mating that would trigger the egg hatching a baby Pokémon rather than a basic Pokémon. | 
**chain** | [**EvolutionChainLink**](EvolutionChainLink.md) | The base chain link object. Each link contains evolution details for a Pokémon in the chain. Each link references the next Pokémon in the natural evolution order. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


