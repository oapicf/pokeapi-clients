# PaginatedEncounterConditionSummaryList

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Count** | Pointer to **int32** |  | [optional] 
**Next** | Pointer to **string** |  | [optional] 
**Previous** | Pointer to **string** |  | [optional] 
**Results** | Pointer to [**[]EncounterConditionSummary**](EncounterConditionSummary.md) |  | [optional] 

## Methods

### NewPaginatedEncounterConditionSummaryList

`func NewPaginatedEncounterConditionSummaryList() *PaginatedEncounterConditionSummaryList`

NewPaginatedEncounterConditionSummaryList instantiates a new PaginatedEncounterConditionSummaryList object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPaginatedEncounterConditionSummaryListWithDefaults

`func NewPaginatedEncounterConditionSummaryListWithDefaults() *PaginatedEncounterConditionSummaryList`

NewPaginatedEncounterConditionSummaryListWithDefaults instantiates a new PaginatedEncounterConditionSummaryList object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCount

`func (o *PaginatedEncounterConditionSummaryList) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *PaginatedEncounterConditionSummaryList) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *PaginatedEncounterConditionSummaryList) SetCount(v int32)`

SetCount sets Count field to given value.

### HasCount

`func (o *PaginatedEncounterConditionSummaryList) HasCount() bool`

HasCount returns a boolean if a field has been set.

### GetNext

`func (o *PaginatedEncounterConditionSummaryList) GetNext() string`

GetNext returns the Next field if non-nil, zero value otherwise.

### GetNextOk

`func (o *PaginatedEncounterConditionSummaryList) GetNextOk() (*string, bool)`

GetNextOk returns a tuple with the Next field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNext

`func (o *PaginatedEncounterConditionSummaryList) SetNext(v string)`

SetNext sets Next field to given value.

### HasNext

`func (o *PaginatedEncounterConditionSummaryList) HasNext() bool`

HasNext returns a boolean if a field has been set.

### GetPrevious

`func (o *PaginatedEncounterConditionSummaryList) GetPrevious() string`

GetPrevious returns the Previous field if non-nil, zero value otherwise.

### GetPreviousOk

`func (o *PaginatedEncounterConditionSummaryList) GetPreviousOk() (*string, bool)`

GetPreviousOk returns a tuple with the Previous field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrevious

`func (o *PaginatedEncounterConditionSummaryList) SetPrevious(v string)`

SetPrevious sets Previous field to given value.

### HasPrevious

`func (o *PaginatedEncounterConditionSummaryList) HasPrevious() bool`

HasPrevious returns a boolean if a field has been set.

### GetResults

`func (o *PaginatedEncounterConditionSummaryList) GetResults() []EncounterConditionSummary`

GetResults returns the Results field if non-nil, zero value otherwise.

### GetResultsOk

`func (o *PaginatedEncounterConditionSummaryList) GetResultsOk() (*[]EncounterConditionSummary, bool)`

GetResultsOk returns a tuple with the Results field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResults

`func (o *PaginatedEncounterConditionSummaryList) SetResults(v []EncounterConditionSummary)`

SetResults sets Results field to given value.

### HasResults

`func (o *PaginatedEncounterConditionSummaryList) HasResults() bool`

HasResults returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


