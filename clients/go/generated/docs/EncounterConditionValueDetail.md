# EncounterConditionValueDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**Condition** | [**EncounterConditionSummary**](EncounterConditionSummary.md) |  | 
**Names** | [**[]EncounterConditionValueName**](EncounterConditionValueName.md) |  | 

## Methods

### NewEncounterConditionValueDetail

`func NewEncounterConditionValueDetail(id int32, name string, condition EncounterConditionSummary, names []EncounterConditionValueName, ) *EncounterConditionValueDetail`

NewEncounterConditionValueDetail instantiates a new EncounterConditionValueDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEncounterConditionValueDetailWithDefaults

`func NewEncounterConditionValueDetailWithDefaults() *EncounterConditionValueDetail`

NewEncounterConditionValueDetailWithDefaults instantiates a new EncounterConditionValueDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *EncounterConditionValueDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *EncounterConditionValueDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *EncounterConditionValueDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *EncounterConditionValueDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *EncounterConditionValueDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *EncounterConditionValueDetail) SetName(v string)`

SetName sets Name field to given value.


### GetCondition

`func (o *EncounterConditionValueDetail) GetCondition() EncounterConditionSummary`

GetCondition returns the Condition field if non-nil, zero value otherwise.

### GetConditionOk

`func (o *EncounterConditionValueDetail) GetConditionOk() (*EncounterConditionSummary, bool)`

GetConditionOk returns a tuple with the Condition field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCondition

`func (o *EncounterConditionValueDetail) SetCondition(v EncounterConditionSummary)`

SetCondition sets Condition field to given value.


### GetNames

`func (o *EncounterConditionValueDetail) GetNames() []EncounterConditionValueName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *EncounterConditionValueDetail) GetNamesOk() (*[]EncounterConditionValueName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *EncounterConditionValueDetail) SetNames(v []EncounterConditionValueName)`

SetNames sets Names field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


