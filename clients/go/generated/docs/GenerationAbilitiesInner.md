# GenerationAbilitiesInner

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | The name of this ability | [optional] 
**IsHidden** | Pointer to **bool** | Whether or not this ability is a hidden one | [optional] 
**Slot** | Pointer to **int32** | The slot this ability occupies in this Pokémon species | [optional] 

## Methods

### NewGenerationAbilitiesInner

`func NewGenerationAbilitiesInner() *GenerationAbilitiesInner`

NewGenerationAbilitiesInner instantiates a new GenerationAbilitiesInner object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGenerationAbilitiesInnerWithDefaults

`func NewGenerationAbilitiesInnerWithDefaults() *GenerationAbilitiesInner`

NewGenerationAbilitiesInnerWithDefaults instantiates a new GenerationAbilitiesInner object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *GenerationAbilitiesInner) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *GenerationAbilitiesInner) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *GenerationAbilitiesInner) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *GenerationAbilitiesInner) HasName() bool`

HasName returns a boolean if a field has been set.

### GetIsHidden

`func (o *GenerationAbilitiesInner) GetIsHidden() bool`

GetIsHidden returns the IsHidden field if non-nil, zero value otherwise.

### GetIsHiddenOk

`func (o *GenerationAbilitiesInner) GetIsHiddenOk() (*bool, bool)`

GetIsHiddenOk returns a tuple with the IsHidden field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsHidden

`func (o *GenerationAbilitiesInner) SetIsHidden(v bool)`

SetIsHidden sets IsHidden field to given value.

### HasIsHidden

`func (o *GenerationAbilitiesInner) HasIsHidden() bool`

HasIsHidden returns a boolean if a field has been set.

### GetSlot

`func (o *GenerationAbilitiesInner) GetSlot() int32`

GetSlot returns the Slot field if non-nil, zero value otherwise.

### GetSlotOk

`func (o *GenerationAbilitiesInner) GetSlotOk() (*int32, bool)`

GetSlotOk returns a tuple with the Slot field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSlot

`func (o *GenerationAbilitiesInner) SetSlot(v int32)`

SetSlot sets Slot field to given value.

### HasSlot

`func (o *GenerationAbilitiesInner) HasSlot() bool`

HasSlot returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


