# MoveMetaStatChange

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Change** | **int32** | The amount of change. | 
**Stat** | [**StatSummary**](StatSummary.md) | The stat being affected. | 

## Methods

### NewMoveMetaStatChange

`func NewMoveMetaStatChange(change int32, stat StatSummary, ) *MoveMetaStatChange`

NewMoveMetaStatChange instantiates a new MoveMetaStatChange object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMoveMetaStatChangeWithDefaults

`func NewMoveMetaStatChangeWithDefaults() *MoveMetaStatChange`

NewMoveMetaStatChangeWithDefaults instantiates a new MoveMetaStatChange object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChange

`func (o *MoveMetaStatChange) GetChange() int32`

GetChange returns the Change field if non-nil, zero value otherwise.

### GetChangeOk

`func (o *MoveMetaStatChange) GetChangeOk() (*int32, bool)`

GetChangeOk returns a tuple with the Change field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChange

`func (o *MoveMetaStatChange) SetChange(v int32)`

SetChange sets Change field to given value.


### GetStat

`func (o *MoveMetaStatChange) GetStat() StatSummary`

GetStat returns the Stat field if non-nil, zero value otherwise.

### GetStatOk

`func (o *MoveMetaStatChange) GetStatOk() (*StatSummary, bool)`

GetStatOk returns a tuple with the Stat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStat

`func (o *MoveMetaStatChange) SetStat(v StatSummary)`

SetStat sets Stat field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


