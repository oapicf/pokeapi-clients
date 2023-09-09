# MoveLearnMethod

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** | The identifier for this move learn method resource. | 
**Name** | **string** | The name for this move learn method resource. | 
**Descriptions** | Pointer to [**[]Description**](Description.md) | The description of this move learn method listed in different languages. | [optional] 
**Names** | Pointer to [**[]Name**](Name.md) | The name of this move learn method listed in different languages. | [optional] 

## Methods

### NewMoveLearnMethod

`func NewMoveLearnMethod(id int32, name string, ) *MoveLearnMethod`

NewMoveLearnMethod instantiates a new MoveLearnMethod object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMoveLearnMethodWithDefaults

`func NewMoveLearnMethodWithDefaults() *MoveLearnMethod`

NewMoveLearnMethodWithDefaults instantiates a new MoveLearnMethod object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *MoveLearnMethod) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *MoveLearnMethod) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *MoveLearnMethod) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *MoveLearnMethod) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *MoveLearnMethod) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *MoveLearnMethod) SetName(v string)`

SetName sets Name field to given value.


### GetDescriptions

`func (o *MoveLearnMethod) GetDescriptions() []Description`

GetDescriptions returns the Descriptions field if non-nil, zero value otherwise.

### GetDescriptionsOk

`func (o *MoveLearnMethod) GetDescriptionsOk() (*[]Description, bool)`

GetDescriptionsOk returns a tuple with the Descriptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptions

`func (o *MoveLearnMethod) SetDescriptions(v []Description)`

SetDescriptions sets Descriptions field to given value.

### HasDescriptions

`func (o *MoveLearnMethod) HasDescriptions() bool`

HasDescriptions returns a boolean if a field has been set.

### GetNames

`func (o *MoveLearnMethod) GetNames() []Name`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *MoveLearnMethod) GetNamesOk() (*[]Name, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *MoveLearnMethod) SetNames(v []Name)`

SetNames sets Names field to given value.

### HasNames

`func (o *MoveLearnMethod) HasNames() bool`

HasNames returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


