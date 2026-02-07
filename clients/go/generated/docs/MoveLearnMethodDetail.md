# MoveLearnMethodDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**Names** | [**[]MoveLearnMethodName**](MoveLearnMethodName.md) |  | 
**Descriptions** | [**[]MoveLearnMethodDescription**](MoveLearnMethodDescription.md) |  | 
**VersionGroups** | [**[]AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Methods

### NewMoveLearnMethodDetail

`func NewMoveLearnMethodDetail(id int32, name string, names []MoveLearnMethodName, descriptions []MoveLearnMethodDescription, versionGroups []AbilityDetailPokemonInnerPokemon, ) *MoveLearnMethodDetail`

NewMoveLearnMethodDetail instantiates a new MoveLearnMethodDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMoveLearnMethodDetailWithDefaults

`func NewMoveLearnMethodDetailWithDefaults() *MoveLearnMethodDetail`

NewMoveLearnMethodDetailWithDefaults instantiates a new MoveLearnMethodDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *MoveLearnMethodDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *MoveLearnMethodDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *MoveLearnMethodDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *MoveLearnMethodDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *MoveLearnMethodDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *MoveLearnMethodDetail) SetName(v string)`

SetName sets Name field to given value.


### GetNames

`func (o *MoveLearnMethodDetail) GetNames() []MoveLearnMethodName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *MoveLearnMethodDetail) GetNamesOk() (*[]MoveLearnMethodName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *MoveLearnMethodDetail) SetNames(v []MoveLearnMethodName)`

SetNames sets Names field to given value.


### GetDescriptions

`func (o *MoveLearnMethodDetail) GetDescriptions() []MoveLearnMethodDescription`

GetDescriptions returns the Descriptions field if non-nil, zero value otherwise.

### GetDescriptionsOk

`func (o *MoveLearnMethodDetail) GetDescriptionsOk() (*[]MoveLearnMethodDescription, bool)`

GetDescriptionsOk returns a tuple with the Descriptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptions

`func (o *MoveLearnMethodDetail) SetDescriptions(v []MoveLearnMethodDescription)`

SetDescriptions sets Descriptions field to given value.


### GetVersionGroups

`func (o *MoveLearnMethodDetail) GetVersionGroups() []AbilityDetailPokemonInnerPokemon`

GetVersionGroups returns the VersionGroups field if non-nil, zero value otherwise.

### GetVersionGroupsOk

`func (o *MoveLearnMethodDetail) GetVersionGroupsOk() (*[]AbilityDetailPokemonInnerPokemon, bool)`

GetVersionGroupsOk returns a tuple with the VersionGroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionGroups

`func (o *MoveLearnMethodDetail) SetVersionGroups(v []AbilityDetailPokemonInnerPokemon)`

SetVersionGroups sets VersionGroups field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


