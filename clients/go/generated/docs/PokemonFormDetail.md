# PokemonFormDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**Order** | Pointer to **NullableInt32** |  | [optional] 
**FormOrder** | Pointer to **NullableInt32** |  | [optional] 
**IsDefault** | Pointer to **bool** |  | [optional] 
**IsBattleOnly** | Pointer to **bool** |  | [optional] 
**IsMega** | Pointer to **bool** |  | [optional] 
**FormName** | **string** |  | 
**Pokemon** | [**PokemonSummary**](PokemonSummary.md) |  | 
**Sprites** | [**PokemonFormDetailSprites**](PokemonFormDetailSprites.md) |  | 
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) |  | 
**FormNames** | [**[]PokemonFormDetailFormNamesInner**](PokemonFormDetailFormNamesInner.md) |  | 
**Names** | [**[]PokemonFormDetailFormNamesInner**](PokemonFormDetailFormNamesInner.md) |  | 
**Types** | [**[]PokemonDetailTypesInner**](PokemonDetailTypesInner.md) |  | 

## Methods

### NewPokemonFormDetail

`func NewPokemonFormDetail(id int32, name string, formName string, pokemon PokemonSummary, sprites PokemonFormDetailSprites, versionGroup VersionGroupSummary, formNames []PokemonFormDetailFormNamesInner, names []PokemonFormDetailFormNamesInner, types []PokemonDetailTypesInner, ) *PokemonFormDetail`

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

`func (o *PokemonFormDetail) GetSprites() PokemonFormDetailSprites`

GetSprites returns the Sprites field if non-nil, zero value otherwise.

### GetSpritesOk

`func (o *PokemonFormDetail) GetSpritesOk() (*PokemonFormDetailSprites, bool)`

GetSpritesOk returns a tuple with the Sprites field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSprites

`func (o *PokemonFormDetail) SetSprites(v PokemonFormDetailSprites)`

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

`func (o *PokemonFormDetail) GetFormNames() []PokemonFormDetailFormNamesInner`

GetFormNames returns the FormNames field if non-nil, zero value otherwise.

### GetFormNamesOk

`func (o *PokemonFormDetail) GetFormNamesOk() (*[]PokemonFormDetailFormNamesInner, bool)`

GetFormNamesOk returns a tuple with the FormNames field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFormNames

`func (o *PokemonFormDetail) SetFormNames(v []PokemonFormDetailFormNamesInner)`

SetFormNames sets FormNames field to given value.


### GetNames

`func (o *PokemonFormDetail) GetNames() []PokemonFormDetailFormNamesInner`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *PokemonFormDetail) GetNamesOk() (*[]PokemonFormDetailFormNamesInner, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *PokemonFormDetail) SetNames(v []PokemonFormDetailFormNamesInner)`

SetNames sets Names field to given value.


### GetTypes

`func (o *PokemonFormDetail) GetTypes() []PokemonDetailTypesInner`

GetTypes returns the Types field if non-nil, zero value otherwise.

### GetTypesOk

`func (o *PokemonFormDetail) GetTypesOk() (*[]PokemonDetailTypesInner, bool)`

GetTypesOk returns a tuple with the Types field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTypes

`func (o *PokemonFormDetail) SetTypes(v []PokemonDetailTypesInner)`

SetTypes sets Types field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


