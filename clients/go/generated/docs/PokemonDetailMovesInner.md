# PokemonDetailMovesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Move** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**VersionGroupDetails** | [**[]PokemonDetailMovesInnerVersionGroupDetailsInner**](PokemonDetailMovesInnerVersionGroupDetailsInner.md) |  | 

## Methods

### NewPokemonDetailMovesInner

`func NewPokemonDetailMovesInner(move AbilityDetailPokemonInnerPokemon, versionGroupDetails []PokemonDetailMovesInnerVersionGroupDetailsInner, ) *PokemonDetailMovesInner`

NewPokemonDetailMovesInner instantiates a new PokemonDetailMovesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonDetailMovesInnerWithDefaults

`func NewPokemonDetailMovesInnerWithDefaults() *PokemonDetailMovesInner`

NewPokemonDetailMovesInnerWithDefaults instantiates a new PokemonDetailMovesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetMove

`func (o *PokemonDetailMovesInner) GetMove() AbilityDetailPokemonInnerPokemon`

GetMove returns the Move field if non-nil, zero value otherwise.

### GetMoveOk

`func (o *PokemonDetailMovesInner) GetMoveOk() (*AbilityDetailPokemonInnerPokemon, bool)`

GetMoveOk returns a tuple with the Move field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMove

`func (o *PokemonDetailMovesInner) SetMove(v AbilityDetailPokemonInnerPokemon)`

SetMove sets Move field to given value.


### GetVersionGroupDetails

`func (o *PokemonDetailMovesInner) GetVersionGroupDetails() []PokemonDetailMovesInnerVersionGroupDetailsInner`

GetVersionGroupDetails returns the VersionGroupDetails field if non-nil, zero value otherwise.

### GetVersionGroupDetailsOk

`func (o *PokemonDetailMovesInner) GetVersionGroupDetailsOk() (*[]PokemonDetailMovesInnerVersionGroupDetailsInner, bool)`

GetVersionGroupDetailsOk returns a tuple with the VersionGroupDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionGroupDetails

`func (o *PokemonDetailMovesInner) SetVersionGroupDetails(v []PokemonDetailMovesInnerVersionGroupDetailsInner)`

SetVersionGroupDetails sets VersionGroupDetails field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


