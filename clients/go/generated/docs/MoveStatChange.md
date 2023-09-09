# MoveStatChange

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Change** | **int32** | The amount of change to the referenced stat. | 
**Stat** | [**NamedAPIResource**](NamedAPIResource.md) |  | 

## Methods

### NewMoveStatChange

`func NewMoveStatChange(change int32, stat NamedAPIResource, ) *MoveStatChange`

NewMoveStatChange instantiates a new MoveStatChange object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMoveStatChangeWithDefaults

`func NewMoveStatChangeWithDefaults() *MoveStatChange`

NewMoveStatChangeWithDefaults instantiates a new MoveStatChange object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChange

`func (o *MoveStatChange) GetChange() int32`

GetChange returns the Change field if non-nil, zero value otherwise.

### GetChangeOk

`func (o *MoveStatChange) GetChangeOk() (*int32, bool)`

GetChangeOk returns a tuple with the Change field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChange

`func (o *MoveStatChange) SetChange(v int32)`

SetChange sets Change field to given value.


### GetStat

`func (o *MoveStatChange) GetStat() NamedAPIResource`

GetStat returns the Stat field if non-nil, zero value otherwise.

### GetStatOk

`func (o *MoveStatChange) GetStatOk() (*NamedAPIResource, bool)`

GetStatOk returns a tuple with the Stat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStat

`func (o *MoveStatChange) SetStat(v NamedAPIResource)`

SetStat sets Stat field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


