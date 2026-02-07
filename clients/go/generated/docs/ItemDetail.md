# ItemDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**Cost** | Pointer to **NullableInt32** |  | [optional] 
**FlingPower** | Pointer to **NullableInt32** |  | [optional] 
**FlingEffect** | [**ItemFlingEffectSummary**](ItemFlingEffectSummary.md) |  | 
**Attributes** | [**[]AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**Category** | [**ItemCategorySummary**](ItemCategorySummary.md) |  | 
**EffectEntries** | [**[]ItemEffectText**](ItemEffectText.md) |  | 
**FlavorTextEntries** | [**[]ItemFlavorText**](ItemFlavorText.md) |  | 
**GameIndices** | [**[]ItemGameIndex**](ItemGameIndex.md) |  | 
**Names** | [**[]ItemName**](ItemName.md) |  | 
**HeldByPokemon** | [**[]ItemDetailHeldByPokemonInner**](ItemDetailHeldByPokemonInner.md) |  | 
**Sprites** | [**ItemDetailSprites**](ItemDetailSprites.md) |  | 
**BabyTriggerFor** | [**ItemDetailBabyTriggerFor**](ItemDetailBabyTriggerFor.md) |  | 
**Machines** | [**[]ItemDetailMachinesInner**](ItemDetailMachinesInner.md) |  | 

## Methods

### NewItemDetail

`func NewItemDetail(id int32, name string, flingEffect ItemFlingEffectSummary, attributes []AbilityDetailPokemonInnerPokemon, category ItemCategorySummary, effectEntries []ItemEffectText, flavorTextEntries []ItemFlavorText, gameIndices []ItemGameIndex, names []ItemName, heldByPokemon []ItemDetailHeldByPokemonInner, sprites ItemDetailSprites, babyTriggerFor ItemDetailBabyTriggerFor, machines []ItemDetailMachinesInner, ) *ItemDetail`

NewItemDetail instantiates a new ItemDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewItemDetailWithDefaults

`func NewItemDetailWithDefaults() *ItemDetail`

NewItemDetailWithDefaults instantiates a new ItemDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ItemDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ItemDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ItemDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *ItemDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ItemDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ItemDetail) SetName(v string)`

SetName sets Name field to given value.


### GetCost

`func (o *ItemDetail) GetCost() int32`

GetCost returns the Cost field if non-nil, zero value otherwise.

### GetCostOk

`func (o *ItemDetail) GetCostOk() (*int32, bool)`

GetCostOk returns a tuple with the Cost field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCost

`func (o *ItemDetail) SetCost(v int32)`

SetCost sets Cost field to given value.

### HasCost

`func (o *ItemDetail) HasCost() bool`

HasCost returns a boolean if a field has been set.

### SetCostNil

`func (o *ItemDetail) SetCostNil(b bool)`

 SetCostNil sets the value for Cost to be an explicit nil

### UnsetCost
`func (o *ItemDetail) UnsetCost()`

UnsetCost ensures that no value is present for Cost, not even an explicit nil
### GetFlingPower

`func (o *ItemDetail) GetFlingPower() int32`

GetFlingPower returns the FlingPower field if non-nil, zero value otherwise.

### GetFlingPowerOk

`func (o *ItemDetail) GetFlingPowerOk() (*int32, bool)`

GetFlingPowerOk returns a tuple with the FlingPower field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlingPower

`func (o *ItemDetail) SetFlingPower(v int32)`

SetFlingPower sets FlingPower field to given value.

### HasFlingPower

`func (o *ItemDetail) HasFlingPower() bool`

HasFlingPower returns a boolean if a field has been set.

### SetFlingPowerNil

`func (o *ItemDetail) SetFlingPowerNil(b bool)`

 SetFlingPowerNil sets the value for FlingPower to be an explicit nil

### UnsetFlingPower
`func (o *ItemDetail) UnsetFlingPower()`

UnsetFlingPower ensures that no value is present for FlingPower, not even an explicit nil
### GetFlingEffect

`func (o *ItemDetail) GetFlingEffect() ItemFlingEffectSummary`

GetFlingEffect returns the FlingEffect field if non-nil, zero value otherwise.

### GetFlingEffectOk

`func (o *ItemDetail) GetFlingEffectOk() (*ItemFlingEffectSummary, bool)`

GetFlingEffectOk returns a tuple with the FlingEffect field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlingEffect

`func (o *ItemDetail) SetFlingEffect(v ItemFlingEffectSummary)`

SetFlingEffect sets FlingEffect field to given value.


### GetAttributes

`func (o *ItemDetail) GetAttributes() []AbilityDetailPokemonInnerPokemon`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *ItemDetail) GetAttributesOk() (*[]AbilityDetailPokemonInnerPokemon, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *ItemDetail) SetAttributes(v []AbilityDetailPokemonInnerPokemon)`

SetAttributes sets Attributes field to given value.


### GetCategory

`func (o *ItemDetail) GetCategory() ItemCategorySummary`

GetCategory returns the Category field if non-nil, zero value otherwise.

### GetCategoryOk

`func (o *ItemDetail) GetCategoryOk() (*ItemCategorySummary, bool)`

GetCategoryOk returns a tuple with the Category field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCategory

`func (o *ItemDetail) SetCategory(v ItemCategorySummary)`

SetCategory sets Category field to given value.


### GetEffectEntries

`func (o *ItemDetail) GetEffectEntries() []ItemEffectText`

GetEffectEntries returns the EffectEntries field if non-nil, zero value otherwise.

### GetEffectEntriesOk

`func (o *ItemDetail) GetEffectEntriesOk() (*[]ItemEffectText, bool)`

GetEffectEntriesOk returns a tuple with the EffectEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEffectEntries

`func (o *ItemDetail) SetEffectEntries(v []ItemEffectText)`

SetEffectEntries sets EffectEntries field to given value.


### GetFlavorTextEntries

`func (o *ItemDetail) GetFlavorTextEntries() []ItemFlavorText`

GetFlavorTextEntries returns the FlavorTextEntries field if non-nil, zero value otherwise.

### GetFlavorTextEntriesOk

`func (o *ItemDetail) GetFlavorTextEntriesOk() (*[]ItemFlavorText, bool)`

GetFlavorTextEntriesOk returns a tuple with the FlavorTextEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlavorTextEntries

`func (o *ItemDetail) SetFlavorTextEntries(v []ItemFlavorText)`

SetFlavorTextEntries sets FlavorTextEntries field to given value.


### GetGameIndices

`func (o *ItemDetail) GetGameIndices() []ItemGameIndex`

GetGameIndices returns the GameIndices field if non-nil, zero value otherwise.

### GetGameIndicesOk

`func (o *ItemDetail) GetGameIndicesOk() (*[]ItemGameIndex, bool)`

GetGameIndicesOk returns a tuple with the GameIndices field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGameIndices

`func (o *ItemDetail) SetGameIndices(v []ItemGameIndex)`

SetGameIndices sets GameIndices field to given value.


### GetNames

`func (o *ItemDetail) GetNames() []ItemName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *ItemDetail) GetNamesOk() (*[]ItemName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *ItemDetail) SetNames(v []ItemName)`

SetNames sets Names field to given value.


### GetHeldByPokemon

`func (o *ItemDetail) GetHeldByPokemon() []ItemDetailHeldByPokemonInner`

GetHeldByPokemon returns the HeldByPokemon field if non-nil, zero value otherwise.

### GetHeldByPokemonOk

`func (o *ItemDetail) GetHeldByPokemonOk() (*[]ItemDetailHeldByPokemonInner, bool)`

GetHeldByPokemonOk returns a tuple with the HeldByPokemon field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeldByPokemon

`func (o *ItemDetail) SetHeldByPokemon(v []ItemDetailHeldByPokemonInner)`

SetHeldByPokemon sets HeldByPokemon field to given value.


### GetSprites

`func (o *ItemDetail) GetSprites() ItemDetailSprites`

GetSprites returns the Sprites field if non-nil, zero value otherwise.

### GetSpritesOk

`func (o *ItemDetail) GetSpritesOk() (*ItemDetailSprites, bool)`

GetSpritesOk returns a tuple with the Sprites field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSprites

`func (o *ItemDetail) SetSprites(v ItemDetailSprites)`

SetSprites sets Sprites field to given value.


### GetBabyTriggerFor

`func (o *ItemDetail) GetBabyTriggerFor() ItemDetailBabyTriggerFor`

GetBabyTriggerFor returns the BabyTriggerFor field if non-nil, zero value otherwise.

### GetBabyTriggerForOk

`func (o *ItemDetail) GetBabyTriggerForOk() (*ItemDetailBabyTriggerFor, bool)`

GetBabyTriggerForOk returns a tuple with the BabyTriggerFor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBabyTriggerFor

`func (o *ItemDetail) SetBabyTriggerFor(v ItemDetailBabyTriggerFor)`

SetBabyTriggerFor sets BabyTriggerFor field to given value.


### GetMachines

`func (o *ItemDetail) GetMachines() []ItemDetailMachinesInner`

GetMachines returns the Machines field if non-nil, zero value otherwise.

### GetMachinesOk

`func (o *ItemDetail) GetMachinesOk() (*[]ItemDetailMachinesInner, bool)`

GetMachinesOk returns a tuple with the Machines field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMachines

`func (o *ItemDetail) SetMachines(v []ItemDetailMachinesInner)`

SetMachines sets Machines field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


