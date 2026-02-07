# AbilityChange

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) |  | 
**EffectEntries** | [**[]AbilityChangeEffectText**](AbilityChangeEffectText.md) |  | 

## Methods

### NewAbilityChange

`func NewAbilityChange(versionGroup VersionGroupSummary, effectEntries []AbilityChangeEffectText, ) *AbilityChange`

NewAbilityChange instantiates a new AbilityChange object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAbilityChangeWithDefaults

`func NewAbilityChangeWithDefaults() *AbilityChange`

NewAbilityChangeWithDefaults instantiates a new AbilityChange object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetVersionGroup

`func (o *AbilityChange) GetVersionGroup() VersionGroupSummary`

GetVersionGroup returns the VersionGroup field if non-nil, zero value otherwise.

### GetVersionGroupOk

`func (o *AbilityChange) GetVersionGroupOk() (*VersionGroupSummary, bool)`

GetVersionGroupOk returns a tuple with the VersionGroup field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersionGroup

`func (o *AbilityChange) SetVersionGroup(v VersionGroupSummary)`

SetVersionGroup sets VersionGroup field to given value.


### GetEffectEntries

`func (o *AbilityChange) GetEffectEntries() []AbilityChangeEffectText`

GetEffectEntries returns the EffectEntries field if non-nil, zero value otherwise.

### GetEffectEntriesOk

`func (o *AbilityChange) GetEffectEntriesOk() (*[]AbilityChangeEffectText, bool)`

GetEffectEntriesOk returns a tuple with the EffectEntries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEffectEntries

`func (o *AbilityChange) SetEffectEntries(v []AbilityChangeEffectText)`

SetEffectEntries sets EffectEntries field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


