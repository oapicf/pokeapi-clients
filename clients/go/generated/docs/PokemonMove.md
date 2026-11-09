# PokemonMove

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Move** | [**MoveSummary**](MoveSummary.md) | The move the Pokémon can learn. | 
**VersionGroupDetails** | [**[]PokemonMoveVersionGroup**](PokemonMoveVersionGroup.md) | The details of the version in which the Pokémon can learn the move. | 

## Methods

### NewPokemonMove

`func NewPokemonMove(move MoveSummary, versionGroupDetails []PokemonMoveVersionGroup, ) *PokemonMove`

NewPokemonMove instantiates a new PokemonMove object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonMoveWithDefaults

`func NewPokemonMoveWithDefaults() *PokemonMove`

NewPokemonMoveWithDefaults instantiates a new PokemonMove object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMove

`func (o *PokemonMove) GetMove() MoveSummary`

GetMove returns the Move field if non-nil, zero value otherwise.

### GetMoveOk

`func (o *PokemonMove) GetMoveOk() (*MoveSummary, bool)`

GetMoveOk returns a tuple with the Move field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMove

`func (o *PokemonMove) SetMove(v MoveSummary)`

SetMove sets Move field to given value.


### GetVersionGroupDetails

`func (o *PokemonMove) GetVersionGroupDetails() []PokemonMoveVersionGroup`

GetVersionGroupDetails returns the VersionGroupDetails field if non-nil, zero value otherwise.

### GetVersionGroupDetailsOk

`func (o *PokemonMove) GetVersionGroupDetailsOk() (*[]PokemonMoveVersionGroup, bool)`

GetVersionGroupDetailsOk returns a tuple with the VersionGroupDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionGroupDetails

`func (o *PokemonMove) SetVersionGroupDetails(v []PokemonMoveVersionGroup)`

SetVersionGroupDetails sets VersionGroupDetails field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


