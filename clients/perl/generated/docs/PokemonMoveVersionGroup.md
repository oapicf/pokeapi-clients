# WWW::OpenAPIClient::Object::PokemonMoveVersionGroup

## Load the model package
```perl
use WWW::OpenAPIClient::Object::PokemonMoveVersionGroup;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**level_learned_at** | **int** | The minimum level to learn the move. | 
**move_learn_method** | [**MoveLearnMethodSummary**](MoveLearnMethodSummary.md) | The method by which the move is learned. | 
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which the move is learned. | 
**order** | **int** | Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


