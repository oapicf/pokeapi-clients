# PokemonAbility

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IsHidden** | Pointer to **bool** |  | [optional] 
**Slot** | Pointer to **int32** |  | [optional] 
**Ability** | Pointer to [**Ability**](Ability.md) |  | [optional] 

## Methods

### NewPokemonAbility

`func NewPokemonAbility() *PokemonAbility`

NewPokemonAbility instantiates a new PokemonAbility object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonAbilityWithDefaults

`func NewPokemonAbilityWithDefaults() *PokemonAbility`

NewPokemonAbilityWithDefaults instantiates a new PokemonAbility object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetIsHidden

`func (o *PokemonAbility) GetIsHidden() bool`

GetIsHidden returns the IsHidden field if non-nil, zero value otherwise.

### GetIsHiddenOk

`func (o *PokemonAbility) GetIsHiddenOk() (*bool, bool)`

GetIsHiddenOk returns a tuple with the IsHidden field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsHidden

`func (o *PokemonAbility) SetIsHidden(v bool)`

SetIsHidden sets IsHidden field to given value.

### HasIsHidden

`func (o *PokemonAbility) HasIsHidden() bool`

HasIsHidden returns a boolean if a field has been set.

### GetSlot

`func (o *PokemonAbility) GetSlot() int32`

GetSlot returns the Slot field if non-nil, zero value otherwise.

### GetSlotOk

`func (o *PokemonAbility) GetSlotOk() (*int32, bool)`

GetSlotOk returns a tuple with the Slot field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSlot

`func (o *PokemonAbility) SetSlot(v int32)`

SetSlot sets Slot field to given value.

### HasSlot

`func (o *PokemonAbility) HasSlot() bool`

HasSlot returns a boolean if a field has been set.

### GetAbility

`func (o *PokemonAbility) GetAbility() Ability`

GetAbility returns the Ability field if non-nil, zero value otherwise.

### GetAbilityOk

`func (o *PokemonAbility) GetAbilityOk() (*Ability, bool)`

GetAbilityOk returns a tuple with the Ability field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAbility

`func (o *PokemonAbility) SetAbility(v Ability)`

SetAbility sets Ability field to given value.

### HasAbility

`func (o *PokemonAbility) HasAbility() bool`

HasAbility returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


