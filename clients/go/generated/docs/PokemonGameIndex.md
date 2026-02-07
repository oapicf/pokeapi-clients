# PokemonGameIndex

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**GameIndex** | **int32** |  | 
**Version** | [**VersionSummary**](VersionSummary.md) |  | 

## Methods

### NewPokemonGameIndex

`func NewPokemonGameIndex(gameIndex int32, version VersionSummary, ) *PokemonGameIndex`

NewPokemonGameIndex instantiates a new PokemonGameIndex object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonGameIndexWithDefaults

`func NewPokemonGameIndexWithDefaults() *PokemonGameIndex`

NewPokemonGameIndexWithDefaults instantiates a new PokemonGameIndex object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetGameIndex

`func (o *PokemonGameIndex) GetGameIndex() int32`

GetGameIndex returns the GameIndex field if non-nil, zero value otherwise.

### GetGameIndexOk

`func (o *PokemonGameIndex) GetGameIndexOk() (*int32, bool)`

GetGameIndexOk returns a tuple with the GameIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGameIndex

`func (o *PokemonGameIndex) SetGameIndex(v int32)`

SetGameIndex sets GameIndex field to given value.


### GetVersion

`func (o *PokemonGameIndex) GetVersion() VersionSummary`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *PokemonGameIndex) GetVersionOk() (*VersionSummary, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *PokemonGameIndex) SetVersion(v VersionSummary)`

SetVersion sets Version field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


