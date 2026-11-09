# PokemonFormDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** | The identifier for this resource. | [readonly] 
**Name** | **string** | The name for this resource. | 
**Order** | Pointer to **NullableInt32** | The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name. | [optional] 
**FormOrder** | Pointer to **NullableInt32** | The order in which forms should be sorted within a species&#39; forms. | [optional] 
**IsDefault** | Pointer to **bool** | True for exactly one form used as the default for each Pokémon. | [optional] 
**IsBattleOnly** | Pointer to **bool** | Whether or not this form can only happen during battle. | [optional] 
**IsMega** | Pointer to **bool** | Whether or not this form requires mega evolution. | [optional] 
**FormName** | **string** | The name of this form. | 
**Pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon that can take on this form. | 
**Sprites** | [**PokemonFormSprites**](PokemonFormSprites.md) | A set of sprites used to depict this Pokémon form in the game. | [readonly] 
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group this Pokémon form was introduced in. | 
**FormNames** | [**[]PokemonFormName**](PokemonFormName.md) | The form specific form name of this Pokémon form, or empty if the form does not have a specific name. | [readonly] 
**Names** | [**[]PokemonFormName**](PokemonFormName.md) | The form specific full name of this Pokémon form, or empty if the form does not have a specific name. | [readonly] 
**Types** | [**[]PokemonFormType**](PokemonFormType.md) | A list of details showing types this Pokémon form has. | [readonly] 
**TriggerConditions** | [**[]PokemonFormTriggerCondition**](PokemonFormTriggerCondition.md) | The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource. | [readonly] 
**FlavorTextEntries** | [**[]PokemonFormFlavorText**](PokemonFormFlavorText.md) | The flavor text of this form listed in different languages and versions. | [readonly] 

## Methods

### NewPokemonFormDetail

`func NewPokemonFormDetail(id int32, name string, formName string, pokemon PokemonSummary, sprites PokemonFormSprites, versionGroup VersionGroupSummary, formNames []PokemonFormName, names []PokemonFormName, types []PokemonFormType, triggerConditions []PokemonFormTriggerCondition, flavorTextEntries []PokemonFormFlavorText, ) *PokemonFormDetail`

NewPokemonFormDetail instantiates a new PokemonFormDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPokemonFormDetailWithDefaults

`func NewPokemonFormDetailWithDefaults() *PokemonFormDetail`

NewPokemonFormDetailWithDefaults instantiates a new PokemonFormDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *PokemonFormDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *PokemonFormDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *PokemonFormDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *PokemonFormDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *PokemonFormDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *PokemonFormDetail) SetName(v string)`

SetName sets Name field to given value.


### GetOrder

`func (o *PokemonFormDetail) GetOrder() int32`

GetOrder returns the Order field if non-nil, zero value otherwise.

### GetOrderOk

`func (o *PokemonFormDetail) GetOrderOk() (*int32, bool)`

GetOrderOk returns a tuple with the Order field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrder

`func (o *PokemonFormDetail) SetOrder(v int32)`

SetOrder sets Order field to given value.

### HasOrder

`func (o *PokemonFormDetail) HasOrder() bool`

HasOrder returns a boolean if a field has been set.

### SetOrderNil

`func (o *PokemonFormDetail) SetOrderNil(b bool)`

 SetOrderNil sets the value for Order to be an explicit nil

### UnsetOrder
`func (o *PokemonFormDetail) UnsetOrder()`

UnsetOrder ensures that no value is present for Order, not even an explicit nil
### GetFormOrder

`func (o *PokemonFormDetail) GetFormOrder() int32`

GetFormOrder returns the FormOrder field if non-nil, zero value otherwise.

### GetFormOrderOk

`func (o *PokemonFormDetail) GetFormOrderOk() (*int32, bool)`

GetFormOrderOk returns a tuple with the FormOrder field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormOrder

`func (o *PokemonFormDetail) SetFormOrder(v int32)`

SetFormOrder sets FormOrder field to given value.

### HasFormOrder

`func (o *PokemonFormDetail) HasFormOrder() bool`

HasFormOrder returns a boolean if a field has been set.

### SetFormOrderNil

`func (o *PokemonFormDetail) SetFormOrderNil(b bool)`

 SetFormOrderNil sets the value for FormOrder to be an explicit nil

### UnsetFormOrder
`func (o *PokemonFormDetail) UnsetFormOrder()`

UnsetFormOrder ensures that no value is present for FormOrder, not even an explicit nil
### GetIsDefault

`func (o *PokemonFormDetail) GetIsDefault() bool`

GetIsDefault returns the IsDefault field if non-nil, zero value otherwise.

### GetIsDefaultOk

`func (o *PokemonFormDetail) GetIsDefaultOk() (*bool, bool)`

GetIsDefaultOk returns a tuple with the IsDefault field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsDefault

`func (o *PokemonFormDetail) SetIsDefault(v bool)`

SetIsDefault sets IsDefault field to given value.

### HasIsDefault

`func (o *PokemonFormDetail) HasIsDefault() bool`

HasIsDefault returns a boolean if a field has been set.

### GetIsBattleOnly

`func (o *PokemonFormDetail) GetIsBattleOnly() bool`

GetIsBattleOnly returns the IsBattleOnly field if non-nil, zero value otherwise.

### GetIsBattleOnlyOk

`func (o *PokemonFormDetail) GetIsBattleOnlyOk() (*bool, bool)`

GetIsBattleOnlyOk returns a tuple with the IsBattleOnly field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsBattleOnly

`func (o *PokemonFormDetail) SetIsBattleOnly(v bool)`

SetIsBattleOnly sets IsBattleOnly field to given value.

### HasIsBattleOnly

`func (o *PokemonFormDetail) HasIsBattleOnly() bool`

HasIsBattleOnly returns a boolean if a field has been set.

### GetIsMega

`func (o *PokemonFormDetail) GetIsMega() bool`

GetIsMega returns the IsMega field if non-nil, zero value otherwise.

### GetIsMegaOk

`func (o *PokemonFormDetail) GetIsMegaOk() (*bool, bool)`

GetIsMegaOk returns a tuple with the IsMega field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsMega

`func (o *PokemonFormDetail) SetIsMega(v bool)`

SetIsMega sets IsMega field to given value.

### HasIsMega

`func (o *PokemonFormDetail) HasIsMega() bool`

HasIsMega returns a boolean if a field has been set.

### GetFormName

`func (o *PokemonFormDetail) GetFormName() string`

GetFormName returns the FormName field if non-nil, zero value otherwise.

### GetFormNameOk

`func (o *PokemonFormDetail) GetFormNameOk() (*string, bool)`

GetFormNameOk returns a tuple with the FormName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormName

`func (o *PokemonFormDetail) SetFormName(v string)`

SetFormName sets FormName field to given value.


### GetPokemon

`func (o *PokemonFormDetail) GetPokemon() PokemonSummary`

GetPokemon returns the Pokemon field if non-nil, zero value otherwise.

### GetPokemonOk

`func (o *PokemonFormDetail) GetPokemonOk() (*PokemonSummary, bool)`

GetPokemonOk returns a tuple with the Pokemon field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPokemon

`func (o *PokemonFormDetail) SetPokemon(v PokemonSummary)`

SetPokemon sets Pokemon field to given value.


### GetSprites

`func (o *PokemonFormDetail) GetSprites() PokemonFormSprites`

GetSprites returns the Sprites field if non-nil, zero value otherwise.

### GetSpritesOk

`func (o *PokemonFormDetail) GetSpritesOk() (*PokemonFormSprites, bool)`

GetSpritesOk returns a tuple with the Sprites field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSprites

`func (o *PokemonFormDetail) SetSprites(v PokemonFormSprites)`

SetSprites sets Sprites field to given value.


### GetVersionGroup

`func (o *PokemonFormDetail) GetVersionGroup() VersionGroupSummary`

GetVersionGroup returns the VersionGroup field if non-nil, zero value otherwise.

### GetVersionGroupOk

`func (o *PokemonFormDetail) GetVersionGroupOk() (*VersionGroupSummary, bool)`

GetVersionGroupOk returns a tuple with the VersionGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionGroup

`func (o *PokemonFormDetail) SetVersionGroup(v VersionGroupSummary)`

SetVersionGroup sets VersionGroup field to given value.


### GetFormNames

`func (o *PokemonFormDetail) GetFormNames() []PokemonFormName`

GetFormNames returns the FormNames field if non-nil, zero value otherwise.

### GetFormNamesOk

`func (o *PokemonFormDetail) GetFormNamesOk() (*[]PokemonFormName, bool)`

GetFormNamesOk returns a tuple with the FormNames field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormNames

`func (o *PokemonFormDetail) SetFormNames(v []PokemonFormName)`

SetFormNames sets FormNames field to given value.


### GetNames

`func (o *PokemonFormDetail) GetNames() []PokemonFormName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *PokemonFormDetail) GetNamesOk() (*[]PokemonFormName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *PokemonFormDetail) SetNames(v []PokemonFormName)`

SetNames sets Names field to given value.


### GetTypes

`func (o *PokemonFormDetail) GetTypes() []PokemonFormType`

GetTypes returns the Types field if non-nil, zero value otherwise.

### GetTypesOk

`func (o *PokemonFormDetail) GetTypesOk() (*[]PokemonFormType, bool)`

GetTypesOk returns a tuple with the Types field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTypes

`func (o *PokemonFormDetail) SetTypes(v []PokemonFormType)`

SetTypes sets Types field to given value.


### GetTriggerConditions

`func (o *PokemonFormDetail) GetTriggerConditions() []PokemonFormTriggerCondition`

GetTriggerConditions returns the TriggerConditions field if non-nil, zero value otherwise.

### GetTriggerConditionsOk

`func (o *PokemonFormDetail) GetTriggerConditionsOk() (*[]PokemonFormTriggerCondition, bool)`

GetTriggerConditionsOk returns a tuple with the TriggerConditions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTriggerConditions

`func (o *PokemonFormDetail) SetTriggerConditions(v []PokemonFormTriggerCondition)`

SetTriggerConditions sets TriggerConditions field to given value.


### GetFlavorTextEntries

`func (o *PokemonFormDetail) GetFlavorTextEntries() []PokemonFormFlavorText`

GetFlavorTextEntries returns the FlavorTextEntries field if non-nil, zero value otherwise.

### GetFlavorTextEntriesOk

`func (o *PokemonFormDetail) GetFlavorTextEntriesOk() (*[]PokemonFormFlavorText, bool)`

GetFlavorTextEntriesOk returns a tuple with the FlavorTextEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFlavorTextEntries

`func (o *PokemonFormDetail) SetFlavorTextEntries(v []PokemonFormFlavorText)`

SetFlavorTextEntries sets FlavorTextEntries field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


