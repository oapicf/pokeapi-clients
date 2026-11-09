# PokemonHeldItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon that holds this item. | 
**VersionDetails** | [**[]PokemonHeldItemVersion**](PokemonHeldItemVersion.md) | The details for the version that this item is held in by the Pokémon. | 

## Methods

### NewPokemonHeldItem

`func NewPokemonHeldItem(pokemon PokemonSummary, versionDetails []PokemonHeldItemVersion, ) *PokemonHeldItem`

NewPokemonHeldItem instantiates a new PokemonHeldItem object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonHeldItemWithDefaults

`func NewPokemonHeldItemWithDefaults() *PokemonHeldItem`

NewPokemonHeldItemWithDefaults instantiates a new PokemonHeldItem object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPokemon

`func (o *PokemonHeldItem) GetPokemon() PokemonSummary`

GetPokemon returns the Pokemon field if non-nil, zero value otherwise.

### GetPokemonOk

`func (o *PokemonHeldItem) GetPokemonOk() (*PokemonSummary, bool)`

GetPokemonOk returns a tuple with the Pokemon field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemon

`func (o *PokemonHeldItem) SetPokemon(v PokemonSummary)`

SetPokemon sets Pokemon field to given value.


### GetVersionDetails

`func (o *PokemonHeldItem) GetVersionDetails() []PokemonHeldItemVersion`

GetVersionDetails returns the VersionDetails field if non-nil, zero value otherwise.

### GetVersionDetailsOk

`func (o *PokemonHeldItem) GetVersionDetailsOk() (*[]PokemonHeldItemVersion, bool)`

GetVersionDetailsOk returns a tuple with the VersionDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionDetails

`func (o *PokemonHeldItem) SetVersionDetails(v []PokemonHeldItemVersion)`

SetVersionDetails sets VersionDetails field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


