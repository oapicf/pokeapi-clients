# MoveTarget

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** | The identifier for this move target resource | 
**Name** | **string** | The name for this move target resource | 
**Descriptions** | [**[]Description**](Description.md) | The description of this move target listed in different languages | 

## Methods

### NewMoveTarget

`func NewMoveTarget(id int32, name string, descriptions []Description, ) *MoveTarget`

NewMoveTarget instantiates a new MoveTarget object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMoveTargetWithDefaults

`func NewMoveTargetWithDefaults() *MoveTarget`

NewMoveTargetWithDefaults instantiates a new MoveTarget object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *MoveTarget) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *MoveTarget) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *MoveTarget) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *MoveTarget) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *MoveTarget) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *MoveTarget) SetName(v string)`

SetName sets Name field to given value.


### GetDescriptions

`func (o *MoveTarget) GetDescriptions() []Description`

GetDescriptions returns the Descriptions field if non-nil, zero value otherwise.

### GetDescriptionsOk

`func (o *MoveTarget) GetDescriptionsOk() (*[]Description, bool)`

GetDescriptionsOk returns a tuple with the Descriptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptions

`func (o *MoveTarget) SetDescriptions(v []Description)`

SetDescriptions sets Descriptions field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


