# PokemonMove

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Move** | Pointer to [**NamedAPIResource**](NamedAPIResource.md) |  | [optional] 
**VersionGroupDetails** | Pointer to [**[]PokemonMoveVersionGroupDetailsInner**](PokemonMoveVersionGroupDetailsInner.md) | A list of details showing how the Pokémon can learn the move  | [optional] 

## Methods

### NewPokemonMove

`func NewPokemonMove() *PokemonMove`

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

`func (o *PokemonMove) GetMove() NamedAPIResource`

GetMove returns the Move field if non-nil, zero value otherwise.

### GetMoveOk

`func (o *PokemonMove) GetMoveOk() (*NamedAPIResource, bool)`

GetMoveOk returns a tuple with the Move field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMove

`func (o *PokemonMove) SetMove(v NamedAPIResource)`

SetMove sets Move field to given value.

### HasMove

`func (o *PokemonMove) HasMove() bool`

HasMove returns a boolean if a field has been set.

### GetVersionGroupDetails

`func (o *PokemonMove) GetVersionGroupDetails() []PokemonMoveVersionGroupDetailsInner`

GetVersionGroupDetails returns the VersionGroupDetails field if non-nil, zero value otherwise.

### GetVersionGroupDetailsOk

`func (o *PokemonMove) GetVersionGroupDetailsOk() (*[]PokemonMoveVersionGroupDetailsInner, bool)`

GetVersionGroupDetailsOk returns a tuple with the VersionGroupDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionGroupDetails

`func (o *PokemonMove) SetVersionGroupDetails(v []PokemonMoveVersionGroupDetailsInner)`

SetVersionGroupDetails sets VersionGroupDetails field to given value.

### HasVersionGroupDetails

`func (o *PokemonMove) HasVersionGroupDetails() bool`

HasVersionGroupDetails returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


