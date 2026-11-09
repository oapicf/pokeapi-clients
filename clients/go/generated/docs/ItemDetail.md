# ItemDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** | The identifier for this resource. | [readonly] 
**Name** | **string** | The name for this resource. | 
**FlingPower** | Pointer to **NullableInt32** | The power of the move Fling when used with this item. | [optional] 
**FlingEffect** | [**NullableItemFlingEffectSummary**](ItemFlingEffectSummary.md) | The effect of the move Fling when used with this item. | 
**Attributes** | [**[]ItemAttributeSummary**](ItemAttributeSummary.md) | A list of attributes this item has. | [readonly] 
**Category** | [**ItemCategorySummary**](ItemCategorySummary.md) | The category of items this item falls into. | 
**EffectEntries** | [**[]ItemEffectText**](ItemEffectText.md) | The effect of this ability listed in different languages. | [readonly] 
**FlavorTextEntries** | [**[]ItemFlavorText**](ItemFlavorText.md) | The flavor text of this ability listed in different languages. | [readonly] 
**GameIndices** | [**[]ItemGameIndex**](ItemGameIndex.md) | A list of game indices relevent to this item by generation. | [readonly] 
**Prices** | [**[]ItemPrice**](ItemPrice.md) | Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold. | [readonly] 
**Names** | [**[]ItemName**](ItemName.md) | The name of this item listed in different languages. | [readonly] 
**HeldByPokemon** | [**[]PokemonHeldItem**](PokemonHeldItem.md) | A list of Pokémon that might be found in the wild holding this item. | [readonly] 
**Sprites** | [**ItemSprites**](ItemSprites.md) | A set of sprites used to depict this item in the game. | [readonly] 
**BabyTriggerFor** | [**NullableEvolutionChainSummary**](EvolutionChainSummary.md) | An evolution chain this item requires to produce a bay during mating. | [readonly] 
**Machines** | [**[]ItemMachine**](ItemMachine.md) | A list of the machines related to this item. | [readonly] 

## Methods

### NewItemDetail

`func NewItemDetail(id int32, name string, flingEffect NullableItemFlingEffectSummary, attributes []ItemAttributeSummary, category ItemCategorySummary, effectEntries []ItemEffectText, flavorTextEntries []ItemFlavorText, gameIndices []ItemGameIndex, prices []ItemPrice, names []ItemName, heldByPokemon []PokemonHeldItem, sprites ItemSprites, babyTriggerFor NullableEvolutionChainSummary, machines []ItemMachine, ) *ItemDetail`

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


### SetFlingEffectNil

`func (o *ItemDetail) SetFlingEffectNil(b bool)`

 SetFlingEffectNil sets the value for FlingEffect to be an explicit nil

### UnsetFlingEffect
`func (o *ItemDetail) UnsetFlingEffect()`

UnsetFlingEffect ensures that no value is present for FlingEffect, not even an explicit nil
### GetAttributes

`func (o *ItemDetail) GetAttributes() []ItemAttributeSummary`

GetAttributes returns the Attributes field if non-nil, zero value otherwise.

### GetAttributesOk

`func (o *ItemDetail) GetAttributesOk() (*[]ItemAttributeSummary, bool)`

GetAttributesOk returns a tuple with the Attributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAttributes

`func (o *ItemDetail) SetAttributes(v []ItemAttributeSummary)`

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


### GetPrices

`func (o *ItemDetail) GetPrices() []ItemPrice`

GetPrices returns the Prices field if non-nil, zero value otherwise.

### GetPricesOk

`func (o *ItemDetail) GetPricesOk() (*[]ItemPrice, bool)`

GetPricesOk returns a tuple with the Prices field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrices

`func (o *ItemDetail) SetPrices(v []ItemPrice)`

SetPrices sets Prices field to given value.


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

`func (o *ItemDetail) GetHeldByPokemon() []PokemonHeldItem`

GetHeldByPokemon returns the HeldByPokemon field if non-nil, zero value otherwise.

### GetHeldByPokemonOk

`func (o *ItemDetail) GetHeldByPokemonOk() (*[]PokemonHeldItem, bool)`

GetHeldByPokemonOk returns a tuple with the HeldByPokemon field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHeldByPokemon

`func (o *ItemDetail) SetHeldByPokemon(v []PokemonHeldItem)`

SetHeldByPokemon sets HeldByPokemon field to given value.


### GetSprites

`func (o *ItemDetail) GetSprites() ItemSprites`

GetSprites returns the Sprites field if non-nil, zero value otherwise.

### GetSpritesOk

`func (o *ItemDetail) GetSpritesOk() (*ItemSprites, bool)`

GetSpritesOk returns a tuple with the Sprites field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSprites

`func (o *ItemDetail) SetSprites(v ItemSprites)`

SetSprites sets Sprites field to given value.


### GetBabyTriggerFor

`func (o *ItemDetail) GetBabyTriggerFor() EvolutionChainSummary`

GetBabyTriggerFor returns the BabyTriggerFor field if non-nil, zero value otherwise.

### GetBabyTriggerForOk

`func (o *ItemDetail) GetBabyTriggerForOk() (*EvolutionChainSummary, bool)`

GetBabyTriggerForOk returns a tuple with the BabyTriggerFor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBabyTriggerFor

`func (o *ItemDetail) SetBabyTriggerFor(v EvolutionChainSummary)`

SetBabyTriggerFor sets BabyTriggerFor field to given value.


### SetBabyTriggerForNil

`func (o *ItemDetail) SetBabyTriggerForNil(b bool)`

 SetBabyTriggerForNil sets the value for BabyTriggerFor to be an explicit nil

### UnsetBabyTriggerFor
`func (o *ItemDetail) UnsetBabyTriggerFor()`

UnsetBabyTriggerFor ensures that no value is present for BabyTriggerFor, not even an explicit nil
### GetMachines

`func (o *ItemDetail) GetMachines() []ItemMachine`

GetMachines returns the Machines field if non-nil, zero value otherwise.

### GetMachinesOk

`func (o *ItemDetail) GetMachinesOk() (*[]ItemMachine, bool)`

GetMachinesOk returns a tuple with the Machines field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMachines

`func (o *ItemDetail) SetMachines(v []ItemMachine)`

SetMachines sets Machines field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


