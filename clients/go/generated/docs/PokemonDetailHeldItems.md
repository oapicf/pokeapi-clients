# PokemonDetailHeldItems

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Item** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**VersionDetails** | [**[]ItemDetailHeldByPokemonInnerVersionDetailsInner**](ItemDetailHeldByPokemonInnerVersionDetailsInner.md) |  | 

## Methods

### NewPokemonDetailHeldItems

`func NewPokemonDetailHeldItems(item AbilityDetailPokemonInnerPokemon, versionDetails []ItemDetailHeldByPokemonInnerVersionDetailsInner, ) *PokemonDetailHeldItems`

NewPokemonDetailHeldItems instantiates a new PokemonDetailHeldItems object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonDetailHeldItemsWithDefaults

`func NewPokemonDetailHeldItemsWithDefaults() *PokemonDetailHeldItems`

NewPokemonDetailHeldItemsWithDefaults instantiates a new PokemonDetailHeldItems object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetItem

`func (o *PokemonDetailHeldItems) GetItem() AbilityDetailPokemonInnerPokemon`

GetItem returns the Item field if non-nil, zero value otherwise.

### GetItemOk

`func (o *PokemonDetailHeldItems) GetItemOk() (*AbilityDetailPokemonInnerPokemon, bool)`

GetItemOk returns a tuple with the Item field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetItem

`func (o *PokemonDetailHeldItems) SetItem(v AbilityDetailPokemonInnerPokemon)`

SetItem sets Item field to given value.


### GetVersionDetails

`func (o *PokemonDetailHeldItems) GetVersionDetails() []ItemDetailHeldByPokemonInnerVersionDetailsInner`

GetVersionDetails returns the VersionDetails field if non-nil, zero value otherwise.

### GetVersionDetailsOk

`func (o *PokemonDetailHeldItems) GetVersionDetailsOk() (*[]ItemDetailHeldByPokemonInnerVersionDetailsInner, bool)`

GetVersionDetailsOk returns a tuple with the VersionDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionDetails

`func (o *PokemonDetailHeldItems) SetVersionDetails(v []ItemDetailHeldByPokemonInnerVersionDetailsInner)`

SetVersionDetails sets VersionDetails field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


