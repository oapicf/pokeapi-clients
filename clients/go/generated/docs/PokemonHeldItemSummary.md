# PokemonHeldItemSummary

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Item** | [**ItemSummary**](ItemSummary.md) | The item the referenced Pokémon holds. | 
**VersionDetails** | [**[]PokemonHeldItemVersion**](PokemonHeldItemVersion.md) | The details of the different versions in which the item is held. | 

## Methods

### NewPokemonHeldItemSummary

`func NewPokemonHeldItemSummary(item ItemSummary, versionDetails []PokemonHeldItemVersion, ) *PokemonHeldItemSummary`

NewPokemonHeldItemSummary instantiates a new PokemonHeldItemSummary object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonHeldItemSummaryWithDefaults

`func NewPokemonHeldItemSummaryWithDefaults() *PokemonHeldItemSummary`

NewPokemonHeldItemSummaryWithDefaults instantiates a new PokemonHeldItemSummary object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItem

`func (o *PokemonHeldItemSummary) GetItem() ItemSummary`

GetItem returns the Item field if non-nil, zero value otherwise.

### GetItemOk

`func (o *PokemonHeldItemSummary) GetItemOk() (*ItemSummary, bool)`

GetItemOk returns a tuple with the Item field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItem

`func (o *PokemonHeldItemSummary) SetItem(v ItemSummary)`

SetItem sets Item field to given value.


### GetVersionDetails

`func (o *PokemonHeldItemSummary) GetVersionDetails() []PokemonHeldItemVersion`

GetVersionDetails returns the VersionDetails field if non-nil, zero value otherwise.

### GetVersionDetailsOk

`func (o *PokemonHeldItemSummary) GetVersionDetailsOk() (*[]PokemonHeldItemVersion, bool)`

GetVersionDetailsOk returns a tuple with the VersionDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionDetails

`func (o *PokemonHeldItemSummary) SetVersionDetails(v []PokemonHeldItemVersion)`

SetVersionDetails sets VersionDetails field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


