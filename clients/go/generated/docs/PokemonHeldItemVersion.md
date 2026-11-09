# PokemonHeldItemVersion

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Rarity** | **int32** | How often the item is held. | 
**Version** | [**VersionSummary**](VersionSummary.md) | The version in which the item is held. | 

## Methods

### NewPokemonHeldItemVersion

`func NewPokemonHeldItemVersion(rarity int32, version VersionSummary, ) *PokemonHeldItemVersion`

NewPokemonHeldItemVersion instantiates a new PokemonHeldItemVersion object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonHeldItemVersionWithDefaults

`func NewPokemonHeldItemVersionWithDefaults() *PokemonHeldItemVersion`

NewPokemonHeldItemVersionWithDefaults instantiates a new PokemonHeldItemVersion object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetRarity

`func (o *PokemonHeldItemVersion) GetRarity() int32`

GetRarity returns the Rarity field if non-nil, zero value otherwise.

### GetRarityOk

`func (o *PokemonHeldItemVersion) GetRarityOk() (*int32, bool)`

GetRarityOk returns a tuple with the Rarity field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRarity

`func (o *PokemonHeldItemVersion) SetRarity(v int32)`

SetRarity sets Rarity field to given value.


### GetVersion

`func (o *PokemonHeldItemVersion) GetVersion() VersionSummary`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *PokemonHeldItemVersion) GetVersionOk() (*VersionSummary, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *PokemonHeldItemVersion) SetVersion(v VersionSummary)`

SetVersion sets Version field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


