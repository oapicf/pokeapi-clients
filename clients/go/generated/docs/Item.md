# Item

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | Pointer to **int32** |  | [optional] 
**Name** | Pointer to **string** |  | [optional] 
**Cost** | Pointer to **int32** |  | [optional] 
**FlingPower** | Pointer to **int32** |  | [optional] 
**EffectEntries** | Pointer to [**[]VerboseEffect**](VerboseEffect.md) |  | [optional] 
**FlavorTextEntries** | Pointer to [**[]FlavorText**](FlavorText.md) |  | [optional] 
**Attributes** | Pointer to [**[]ItemAttribute**](ItemAttribute.md) |  | [optional] 
**Category** | Pointer to [**ItemCategory**](ItemCategory.md) |  | [optional] 
**FlingEffect** | Pointer to [**ItemFlingEffect**](ItemFlingEffect.md) |  | [optional] 

## Methods

### NewItem

`func NewItem() *Item`

NewItem instantiates a new Item object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewItemWithDefaults

`func NewItemWithDefaults() *Item`

NewItemWithDefaults instantiates a new Item object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *Item) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *Item) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *Item) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *Item) HasId() bool`

HasId returns a boolean if a field has been set.

### GetName

`func (o *Item) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *Item) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *Item) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *Item) HasName() bool`

HasName returns a boolean if a field has been set.

### GetCost

`func (o *Item) GetCost() int32`

GetCost returns the Cost field if non-nil, zero value otherwise.

### GetCostOk

`func (o *Item) GetCostOk() (*int32, bool)`

GetCostOk returns a tuple with the Cost field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCost

`func (o *Item) SetCost(v int32)`

SetCost sets Cost field to given value.

### HasCost

`func (o *Item) HasCost() bool`

HasCost returns a boolean if a field has been set.

### GetFlingPower

`func (o *Item) GetFlingPower() int32`

GetFlingPower returns the FlingPower field if non-nil, zero value otherwise.

### GetFlingPowerOk

`func (o *Item) GetFlingPowerOk() (*int32, bool)`

GetFlingPowerOk returns a tuple with the FlingPower field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlingPower

`func (o *Item) SetFlingPower(v int32)`

SetFlingPower sets FlingPower field to given value.

### HasFlingPower

`func (o *Item) HasFlingPower() bool`

HasFlingPower returns a boolean if a field has been set.

### GetEffectEntries

`func (o *Item) GetEffectEntries() []VerboseEffect`

GetEffectEntries returns the EffectEntries field if non-nil, zero value otherwise.

### GetEffectEntriesOk

`func (o *Item) GetEffectEntriesOk() (*[]VerboseEffect, bool)`

GetEffectEntriesOk returns a tuple with the EffectEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEffectEntries

`func (o *Item) SetEffectEntries(v []VerboseEffect)`

SetEffectEntries sets EffectEntries field to given value.

### HasEffectEntries

`func (o *Item) HasEffectEntries() bool`

HasEffectEntries returns a boolean if a field has been set.

### GetFlavorTextEntries

`func (o *Item) GetFlavorTextEntries() []FlavorText`

GetFlavorTextEntries returns the FlavorTextEntries field if non-nil, zero value otherwise.

### GetFlavorTextEntriesOk

`func (o *Item) GetFlavorTextEntriesOk() (*[]FlavorText, bool)`

GetFlavorTextEntriesOk returns a tuple with the FlavorTextEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlavorTextEntries

`func (o *Item) SetFlavorTextEntries(v []FlavorText)`

SetFlavorTextEntries sets FlavorTextEntries field to given value.

### HasFlavorTextEntries

`func (o *Item) HasFlavorTextEntries() bool`

HasFlavorTextEntries returns a boolean if a field has been set.

### GetAttributes

`func (o *Item) GetAttributes() []ItemAttribute`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *Item) GetAttributesOk() (*[]ItemAttribute, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *Item) SetAttributes(v []ItemAttribute)`

SetAttributes sets Attributes field to given value.

### HasAttributes

`func (o *Item) HasAttributes() bool`

HasAttributes returns a boolean if a field has been set.

### GetCategory

`func (o *Item) GetCategory() ItemCategory`

GetCategory returns the Category field if non-nil, zero value otherwise.

### GetCategoryOk

`func (o *Item) GetCategoryOk() (*ItemCategory, bool)`

GetCategoryOk returns a tuple with the Category field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategory

`func (o *Item) SetCategory(v ItemCategory)`

SetCategory sets Category field to given value.

### HasCategory

`func (o *Item) HasCategory() bool`

HasCategory returns a boolean if a field has been set.

### GetFlingEffect

`func (o *Item) GetFlingEffect() ItemFlingEffect`

GetFlingEffect returns the FlingEffect field if non-nil, zero value otherwise.

### GetFlingEffectOk

`func (o *Item) GetFlingEffectOk() (*ItemFlingEffect, bool)`

GetFlingEffectOk returns a tuple with the FlingEffect field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlingEffect

`func (o *Item) SetFlingEffect(v ItemFlingEffect)`

SetFlingEffect sets FlingEffect field to given value.

### HasFlingEffect

`func (o *Item) HasFlingEffect() bool`

HasFlingEffect returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


