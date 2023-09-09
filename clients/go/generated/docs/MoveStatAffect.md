# MoveStatAffect

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Change** | **int32** | The amount of change to the referenced stat. | 
**Move** | [**NamedAPIResource**](NamedAPIResource.md) |  | 

## Methods

### NewMoveStatAffect

`func NewMoveStatAffect(change int32, move NamedAPIResource, ) *MoveStatAffect`

NewMoveStatAffect instantiates a new MoveStatAffect object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMoveStatAffectWithDefaults

`func NewMoveStatAffectWithDefaults() *MoveStatAffect`

NewMoveStatAffectWithDefaults instantiates a new MoveStatAffect object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetChange

`func (o *MoveStatAffect) GetChange() int32`

GetChange returns the Change field if non-nil, zero value otherwise.

### GetChangeOk

`func (o *MoveStatAffect) GetChangeOk() (*int32, bool)`

GetChangeOk returns a tuple with the Change field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetChange

`func (o *MoveStatAffect) SetChange(v int32)`

SetChange sets Change field to given value.


### GetMove

`func (o *MoveStatAffect) GetMove() NamedAPIResource`

GetMove returns the Move field if non-nil, zero value otherwise.

### GetMoveOk

`func (o *MoveStatAffect) GetMoveOk() (*NamedAPIResource, bool)`

GetMoveOk returns a tuple with the Move field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMove

`func (o *MoveStatAffect) SetMove(v NamedAPIResource)`

SetMove sets Move field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


