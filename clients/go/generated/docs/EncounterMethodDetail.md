# EncounterMethodDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**Order** | Pointer to **NullableInt32** |  | [optional] 
**Names** | [**[]EncounterMethodName**](EncounterMethodName.md) |  | 

## Methods

### NewEncounterMethodDetail

`func NewEncounterMethodDetail(id int32, name string, names []EncounterMethodName, ) *EncounterMethodDetail`

NewEncounterMethodDetail instantiates a new EncounterMethodDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEncounterMethodDetailWithDefaults

`func NewEncounterMethodDetailWithDefaults() *EncounterMethodDetail`

NewEncounterMethodDetailWithDefaults instantiates a new EncounterMethodDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *EncounterMethodDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *EncounterMethodDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *EncounterMethodDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *EncounterMethodDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *EncounterMethodDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *EncounterMethodDetail) SetName(v string)`

SetName sets Name field to given value.


### GetOrder

`func (o *EncounterMethodDetail) GetOrder() int32`

GetOrder returns the Order field if non-nil, zero value otherwise.

### GetOrderOk

`func (o *EncounterMethodDetail) GetOrderOk() (*int32, bool)`

GetOrderOk returns a tuple with the Order field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOrder

`func (o *EncounterMethodDetail) SetOrder(v int32)`

SetOrder sets Order field to given value.

### HasOrder

`func (o *EncounterMethodDetail) HasOrder() bool`

HasOrder returns a boolean if a field has been set.

### SetOrderNil

`func (o *EncounterMethodDetail) SetOrderNil(b bool)`

 SetOrderNil sets the value for Order to be an explicit nil

### UnsetOrder
`func (o *EncounterMethodDetail) UnsetOrder()`

UnsetOrder ensures that no value is present for Order, not even an explicit nil
### GetNames

`func (o *EncounterMethodDetail) GetNames() []EncounterMethodName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *EncounterMethodDetail) GetNamesOk() (*[]EncounterMethodName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *EncounterMethodDetail) SetNames(v []EncounterMethodName)`

SetNames sets Names field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


