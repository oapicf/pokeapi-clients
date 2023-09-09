# MoveDamageClass

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | 
**Name** | **string** |  | 
**Descriptions** | [**[]Description**](Description.md) |  | 

## Methods

### NewMoveDamageClass

`func NewMoveDamageClass(id int32, name string, descriptions []Description, ) *MoveDamageClass`

NewMoveDamageClass instantiates a new MoveDamageClass object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMoveDamageClassWithDefaults

`func NewMoveDamageClassWithDefaults() *MoveDamageClass`

NewMoveDamageClassWithDefaults instantiates a new MoveDamageClass object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *MoveDamageClass) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *MoveDamageClass) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *MoveDamageClass) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *MoveDamageClass) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *MoveDamageClass) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *MoveDamageClass) SetName(v string)`

SetName sets Name field to given value.


### GetDescriptions

`func (o *MoveDamageClass) GetDescriptions() []Description`

GetDescriptions returns the Descriptions field if non-nil, zero value otherwise.

### GetDescriptionsOk

`func (o *MoveDamageClass) GetDescriptionsOk() (*[]Description, bool)`

GetDescriptionsOk returns a tuple with the Descriptions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescriptions

`func (o *MoveDamageClass) SetDescriptions(v []Description)`

SetDescriptions sets Descriptions field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


