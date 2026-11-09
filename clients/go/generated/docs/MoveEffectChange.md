# MoveEffectChange

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which the previous effect of this ability originated. | 
**EffectEntries** | [**[]MoveEffectChangeEffectText**](MoveEffectChangeEffectText.md) | The previous effect of this ability listed in different languages. | [readonly] 

## Methods

### NewMoveEffectChange

`func NewMoveEffectChange(versionGroup VersionGroupSummary, effectEntries []MoveEffectChangeEffectText, ) *MoveEffectChange`

NewMoveEffectChange instantiates a new MoveEffectChange object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMoveEffectChangeWithDefaults

`func NewMoveEffectChangeWithDefaults() *MoveEffectChange`

NewMoveEffectChangeWithDefaults instantiates a new MoveEffectChange object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetVersionGroup

`func (o *MoveEffectChange) GetVersionGroup() VersionGroupSummary`

GetVersionGroup returns the VersionGroup field if non-nil, zero value otherwise.

### GetVersionGroupOk

`func (o *MoveEffectChange) GetVersionGroupOk() (*VersionGroupSummary, bool)`

GetVersionGroupOk returns a tuple with the VersionGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionGroup

`func (o *MoveEffectChange) SetVersionGroup(v VersionGroupSummary)`

SetVersionGroup sets VersionGroup field to given value.


### GetEffectEntries

`func (o *MoveEffectChange) GetEffectEntries() []MoveEffectChangeEffectText`

GetEffectEntries returns the EffectEntries field if non-nil, zero value otherwise.

### GetEffectEntriesOk

`func (o *MoveEffectChange) GetEffectEntriesOk() (*[]MoveEffectChangeEffectText, bool)`

GetEffectEntriesOk returns a tuple with the EffectEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEffectEntries

`func (o *MoveEffectChange) SetEffectEntries(v []MoveEffectChangeEffectText)`

SetEffectEntries sets EffectEntries field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


