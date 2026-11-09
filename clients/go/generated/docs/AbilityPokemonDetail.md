# AbilityPokemonDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IsHidden** | Pointer to **bool** | Whether or not this a hidden ability for the referenced Pokémon. | [optional] 
**Slot** | **int32** | Pokémon have 3 ability &#39;slots&#39; which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon. | 
**Pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon this ability could belong to. | 

## Methods

### NewAbilityPokemonDetail

`func NewAbilityPokemonDetail(slot int32, pokemon PokemonSummary, ) *AbilityPokemonDetail`

NewAbilityPokemonDetail instantiates a new AbilityPokemonDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAbilityPokemonDetailWithDefaults

`func NewAbilityPokemonDetailWithDefaults() *AbilityPokemonDetail`

NewAbilityPokemonDetailWithDefaults instantiates a new AbilityPokemonDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIsHidden

`func (o *AbilityPokemonDetail) GetIsHidden() bool`

GetIsHidden returns the IsHidden field if non-nil, zero value otherwise.

### GetIsHiddenOk

`func (o *AbilityPokemonDetail) GetIsHiddenOk() (*bool, bool)`

GetIsHiddenOk returns a tuple with the IsHidden field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsHidden

`func (o *AbilityPokemonDetail) SetIsHidden(v bool)`

SetIsHidden sets IsHidden field to given value.

### HasIsHidden

`func (o *AbilityPokemonDetail) HasIsHidden() bool`

HasIsHidden returns a boolean if a field has been set.

### GetSlot

`func (o *AbilityPokemonDetail) GetSlot() int32`

GetSlot returns the Slot field if non-nil, zero value otherwise.

### GetSlotOk

`func (o *AbilityPokemonDetail) GetSlotOk() (*int32, bool)`

GetSlotOk returns a tuple with the Slot field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSlot

`func (o *AbilityPokemonDetail) SetSlot(v int32)`

SetSlot sets Slot field to given value.


### GetPokemon

`func (o *AbilityPokemonDetail) GetPokemon() PokemonSummary`

GetPokemon returns the Pokemon field if non-nil, zero value otherwise.

### GetPokemonOk

`func (o *AbilityPokemonDetail) GetPokemonOk() (*PokemonSummary, bool)`

GetPokemonOk returns a tuple with the Pokemon field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemon

`func (o *AbilityPokemonDetail) SetPokemon(v PokemonSummary)`

SetPokemon sets Pokemon field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


