# ItemDetailHeldByPokemonInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Pokemon** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**VersionDetails** | [**[]ItemDetailHeldByPokemonInnerVersionDetailsInner**](ItemDetailHeldByPokemonInnerVersionDetailsInner.md) |  | 

## Methods

### NewItemDetailHeldByPokemonInner

`func NewItemDetailHeldByPokemonInner(pokemon AbilityDetailPokemonInnerPokemon, versionDetails []ItemDetailHeldByPokemonInnerVersionDetailsInner, ) *ItemDetailHeldByPokemonInner`

NewItemDetailHeldByPokemonInner instantiates a new ItemDetailHeldByPokemonInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewItemDetailHeldByPokemonInnerWithDefaults

`func NewItemDetailHeldByPokemonInnerWithDefaults() *ItemDetailHeldByPokemonInner`

NewItemDetailHeldByPokemonInnerWithDefaults instantiates a new ItemDetailHeldByPokemonInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPokemon

`func (o *ItemDetailHeldByPokemonInner) GetPokemon() AbilityDetailPokemonInnerPokemon`

GetPokemon returns the Pokemon field if non-nil, zero value otherwise.

### GetPokemonOk

`func (o *ItemDetailHeldByPokemonInner) GetPokemonOk() (*AbilityDetailPokemonInnerPokemon, bool)`

GetPokemonOk returns a tuple with the Pokemon field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemon

`func (o *ItemDetailHeldByPokemonInner) SetPokemon(v AbilityDetailPokemonInnerPokemon)`

SetPokemon sets Pokemon field to given value.


### GetVersionDetails

`func (o *ItemDetailHeldByPokemonInner) GetVersionDetails() []ItemDetailHeldByPokemonInnerVersionDetailsInner`

GetVersionDetails returns the VersionDetails field if non-nil, zero value otherwise.

### GetVersionDetailsOk

`func (o *ItemDetailHeldByPokemonInner) GetVersionDetailsOk() (*[]ItemDetailHeldByPokemonInnerVersionDetailsInner, bool)`

GetVersionDetailsOk returns a tuple with the VersionDetails field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionDetails

`func (o *ItemDetailHeldByPokemonInner) SetVersionDetails(v []ItemDetailHeldByPokemonInnerVersionDetailsInner)`

SetVersionDetails sets VersionDetails field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


