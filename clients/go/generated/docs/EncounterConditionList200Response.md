# EncounterConditionList200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Count** | Pointer to **int32** | The total number of encounter conditions. | [optional] 
**Next** | Pointer to **NullableString** | URL to retrieve the next page of encounter conditions. | [optional] 
**Previous** | Pointer to **NullableString** | URL to retrieve the previous page of encounter conditions. | [optional] 
**Results** | Pointer to [**[]EncounterCondition**](EncounterCondition.md) |  | [optional] 

## Methods

### NewEncounterConditionList200Response

`func NewEncounterConditionList200Response() *EncounterConditionList200Response`

NewEncounterConditionList200Response instantiates a new EncounterConditionList200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewEncounterConditionList200ResponseWithDefaults

`func NewEncounterConditionList200ResponseWithDefaults() *EncounterConditionList200Response`

NewEncounterConditionList200ResponseWithDefaults instantiates a new EncounterConditionList200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCount

`func (o *EncounterConditionList200Response) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *EncounterConditionList200Response) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *EncounterConditionList200Response) SetCount(v int32)`

SetCount sets Count field to given value.

### HasCount

`func (o *EncounterConditionList200Response) HasCount() bool`

HasCount returns a boolean if a field has been set.

### GetNext

`func (o *EncounterConditionList200Response) GetNext() string`

GetNext returns the Next field if non-nil, zero value otherwise.

### GetNextOk

`func (o *EncounterConditionList200Response) GetNextOk() (*string, bool)`

GetNextOk returns a tuple with the Next field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNext

`func (o *EncounterConditionList200Response) SetNext(v string)`

SetNext sets Next field to given value.

### HasNext

`func (o *EncounterConditionList200Response) HasNext() bool`

HasNext returns a boolean if a field has been set.

### SetNextNil

`func (o *EncounterConditionList200Response) SetNextNil(b bool)`

 SetNextNil sets the value for Next to be an explicit nil

### UnsetNext
`func (o *EncounterConditionList200Response) UnsetNext()`

UnsetNext ensures that no value is present for Next, not even an explicit nil
### GetPrevious

`func (o *EncounterConditionList200Response) GetPrevious() string`

GetPrevious returns the Previous field if non-nil, zero value otherwise.

### GetPreviousOk

`func (o *EncounterConditionList200Response) GetPreviousOk() (*string, bool)`

GetPreviousOk returns a tuple with the Previous field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrevious

`func (o *EncounterConditionList200Response) SetPrevious(v string)`

SetPrevious sets Previous field to given value.

### HasPrevious

`func (o *EncounterConditionList200Response) HasPrevious() bool`

HasPrevious returns a boolean if a field has been set.

### SetPreviousNil

`func (o *EncounterConditionList200Response) SetPreviousNil(b bool)`

 SetPreviousNil sets the value for Previous to be an explicit nil

### UnsetPrevious
`func (o *EncounterConditionList200Response) UnsetPrevious()`

UnsetPrevious ensures that no value is present for Previous, not even an explicit nil
### GetResults

`func (o *EncounterConditionList200Response) GetResults() []EncounterCondition`

GetResults returns the Results field if non-nil, zero value otherwise.

### GetResultsOk

`func (o *EncounterConditionList200Response) GetResultsOk() (*[]EncounterCondition, bool)`

GetResultsOk returns a tuple with the Results field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResults

`func (o *EncounterConditionList200Response) SetResults(v []EncounterCondition)`

SetResults sets Results field to given value.

### HasResults

`func (o *EncounterConditionList200Response) HasResults() bool`

HasResults returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


