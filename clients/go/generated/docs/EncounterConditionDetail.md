# EncounterConditionDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**Values** | [**[]EncounterConditionValueSummary**](EncounterConditionValueSummary.md) |  | 
**Names** | [**[]EncounterConditionName**](EncounterConditionName.md) |  | 

## Methods

### NewEncounterConditionDetail

`func NewEncounterConditionDetail(id int32, name string, values []EncounterConditionValueSummary, names []EncounterConditionName, ) *EncounterConditionDetail`

NewEncounterConditionDetail instantiates a new EncounterConditionDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEncounterConditionDetailWithDefaults

`func NewEncounterConditionDetailWithDefaults() *EncounterConditionDetail`

NewEncounterConditionDetailWithDefaults instantiates a new EncounterConditionDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *EncounterConditionDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *EncounterConditionDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *EncounterConditionDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *EncounterConditionDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *EncounterConditionDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *EncounterConditionDetail) SetName(v string)`

SetName sets Name field to given value.


### GetValues

`func (o *EncounterConditionDetail) GetValues() []EncounterConditionValueSummary`

GetValues returns the Values field if non-nil, zero value otherwise.

### GetValuesOk

`func (o *EncounterConditionDetail) GetValuesOk() (*[]EncounterConditionValueSummary, bool)`

GetValuesOk returns a tuple with the Values field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValues

`func (o *EncounterConditionDetail) SetValues(v []EncounterConditionValueSummary)`

SetValues sets Values field to given value.


### GetNames

`func (o *EncounterConditionDetail) GetNames() []EncounterConditionName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *EncounterConditionDetail) GetNamesOk() (*[]EncounterConditionName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *EncounterConditionDetail) SetNames(v []EncounterConditionName)`

SetNames sets Names field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


