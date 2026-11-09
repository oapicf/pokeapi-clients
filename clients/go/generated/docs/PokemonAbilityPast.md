# PokemonAbilityPast

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IsHidden** | Pointer to **bool** | Whether or not this is a hidden ability. | [optional] 
**Slot** | **int32** | The slot this ability occupies in this Pokémon species. | 
**Ability** | [**NullableAbilitySummary**](AbilitySummary.md) | The ability the Pokémon may have. | 

## Methods

### NewPokemonAbilityPast

`func NewPokemonAbilityPast(slot int32, ability NullableAbilitySummary, ) *PokemonAbilityPast`

NewPokemonAbilityPast instantiates a new PokemonAbilityPast object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonAbilityPastWithDefaults

`func NewPokemonAbilityPastWithDefaults() *PokemonAbilityPast`

NewPokemonAbilityPastWithDefaults instantiates a new PokemonAbilityPast object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIsHidden

`func (o *PokemonAbilityPast) GetIsHidden() bool`

GetIsHidden returns the IsHidden field if non-nil, zero value otherwise.

### GetIsHiddenOk

`func (o *PokemonAbilityPast) GetIsHiddenOk() (*bool, bool)`

GetIsHiddenOk returns a tuple with the IsHidden field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsHidden

`func (o *PokemonAbilityPast) SetIsHidden(v bool)`

SetIsHidden sets IsHidden field to given value.

### HasIsHidden

`func (o *PokemonAbilityPast) HasIsHidden() bool`

HasIsHidden returns a boolean if a field has been set.

### GetSlot

`func (o *PokemonAbilityPast) GetSlot() int32`

GetSlot returns the Slot field if non-nil, zero value otherwise.

### GetSlotOk

`func (o *PokemonAbilityPast) GetSlotOk() (*int32, bool)`

GetSlotOk returns a tuple with the Slot field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSlot

`func (o *PokemonAbilityPast) SetSlot(v int32)`

SetSlot sets Slot field to given value.


### GetAbility

`func (o *PokemonAbilityPast) GetAbility() AbilitySummary`

GetAbility returns the Ability field if non-nil, zero value otherwise.

### GetAbilityOk

`func (o *PokemonAbilityPast) GetAbilityOk() (*AbilitySummary, bool)`

GetAbilityOk returns a tuple with the Ability field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAbility

`func (o *PokemonAbilityPast) SetAbility(v AbilitySummary)`

SetAbility sets Ability field to given value.


### SetAbilityNil

`func (o *PokemonAbilityPast) SetAbilityNil(b bool)`

 SetAbilityNil sets the value for Ability to be an explicit nil

### UnsetAbility
`func (o *PokemonAbilityPast) UnsetAbility()`

UnsetAbility ensures that no value is present for Ability, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


