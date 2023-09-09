# EncounterConditionValue

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** | The identifier for this encounter condition value resource | 
**Name** | **string** | The name for this encounter condition value resource | 
**Condition** | [**NamedAPIResource**](NamedAPIResource.md) |  | 
**Names** | [**[]Name**](Name.md) | The name of this encounter condition value listed in different languages | 

## Methods

### NewEncounterConditionValue

`func NewEncounterConditionValue(id int32, name string, condition NamedAPIResource, names []Name, ) *EncounterConditionValue`

NewEncounterConditionValue instantiates a new EncounterConditionValue object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEncounterConditionValueWithDefaults

`func NewEncounterConditionValueWithDefaults() *EncounterConditionValue`

NewEncounterConditionValueWithDefaults instantiates a new EncounterConditionValue object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *EncounterConditionValue) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *EncounterConditionValue) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *EncounterConditionValue) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *EncounterConditionValue) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *EncounterConditionValue) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *EncounterConditionValue) SetName(v string)`

SetName sets Name field to given value.


### GetCondition

`func (o *EncounterConditionValue) GetCondition() NamedAPIResource`

GetCondition returns the Condition field if non-nil, zero value otherwise.

### GetConditionOk

`func (o *EncounterConditionValue) GetConditionOk() (*NamedAPIResource, bool)`

GetConditionOk returns a tuple with the Condition field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCondition

`func (o *EncounterConditionValue) SetCondition(v NamedAPIResource)`

SetCondition sets Condition field to given value.


### GetNames

`func (o *EncounterConditionValue) GetNames() []Name`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *EncounterConditionValue) GetNamesOk() (*[]Name, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *EncounterConditionValue) SetNames(v []Name)`

SetNames sets Names field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


