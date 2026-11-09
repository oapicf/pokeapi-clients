# PokemonFormType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Slot** | **int32** | The order the Pokémon&#39;s types are listed in. | 
**Type** | [**TypeSummary**](TypeSummary.md) | The type the referenced Form has. | 

## Methods

### NewPokemonFormType

`func NewPokemonFormType(slot int32, type_ TypeSummary, ) *PokemonFormType`

NewPokemonFormType instantiates a new PokemonFormType object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonFormTypeWithDefaults

`func NewPokemonFormTypeWithDefaults() *PokemonFormType`

NewPokemonFormTypeWithDefaults instantiates a new PokemonFormType object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSlot

`func (o *PokemonFormType) GetSlot() int32`

GetSlot returns the Slot field if non-nil, zero value otherwise.

### GetSlotOk

`func (o *PokemonFormType) GetSlotOk() (*int32, bool)`

GetSlotOk returns a tuple with the Slot field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSlot

`func (o *PokemonFormType) SetSlot(v int32)`

SetSlot sets Slot field to given value.


### GetType

`func (o *PokemonFormType) GetType() TypeSummary`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *PokemonFormType) GetTypeOk() (*TypeSummary, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *PokemonFormType) SetType(v TypeSummary)`

SetType sets Type field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


