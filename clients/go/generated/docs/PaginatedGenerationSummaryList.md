# PaginatedGenerationSummaryList

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Count** | Pointer to **int32** |  | [optional] 
**Next** | Pointer to **string** |  | [optional] 
**Previous** | Pointer to **string** |  | [optional] 
**Results** | Pointer to [**[]GenerationSummary**](GenerationSummary.md) |  | [optional] 

## Methods

### NewPaginatedGenerationSummaryList

`func NewPaginatedGenerationSummaryList() *PaginatedGenerationSummaryList`

NewPaginatedGenerationSummaryList instantiates a new PaginatedGenerationSummaryList object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPaginatedGenerationSummaryListWithDefaults

`func NewPaginatedGenerationSummaryListWithDefaults() *PaginatedGenerationSummaryList`

NewPaginatedGenerationSummaryListWithDefaults instantiates a new PaginatedGenerationSummaryList object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCount

`func (o *PaginatedGenerationSummaryList) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *PaginatedGenerationSummaryList) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *PaginatedGenerationSummaryList) SetCount(v int32)`

SetCount sets Count field to given value.

### HasCount

`func (o *PaginatedGenerationSummaryList) HasCount() bool`

HasCount returns a boolean if a field has been set.

### GetNext

`func (o *PaginatedGenerationSummaryList) GetNext() string`

GetNext returns the Next field if non-nil, zero value otherwise.

### GetNextOk

`func (o *PaginatedGenerationSummaryList) GetNextOk() (*string, bool)`

GetNextOk returns a tuple with the Next field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNext

`func (o *PaginatedGenerationSummaryList) SetNext(v string)`

SetNext sets Next field to given value.

### HasNext

`func (o *PaginatedGenerationSummaryList) HasNext() bool`

HasNext returns a boolean if a field has been set.

### GetPrevious

`func (o *PaginatedGenerationSummaryList) GetPrevious() string`

GetPrevious returns the Previous field if non-nil, zero value otherwise.

### GetPreviousOk

`func (o *PaginatedGenerationSummaryList) GetPreviousOk() (*string, bool)`

GetPreviousOk returns a tuple with the Previous field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrevious

`func (o *PaginatedGenerationSummaryList) SetPrevious(v string)`

SetPrevious sets Previous field to given value.

### HasPrevious

`func (o *PaginatedGenerationSummaryList) HasPrevious() bool`

HasPrevious returns a boolean if a field has been set.

### GetResults

`func (o *PaginatedGenerationSummaryList) GetResults() []GenerationSummary`

GetResults returns the Results field if non-nil, zero value otherwise.

### GetResultsOk

`func (o *PaginatedGenerationSummaryList) GetResultsOk() (*[]GenerationSummary, bool)`

GetResultsOk returns a tuple with the Results field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResults

`func (o *PaginatedGenerationSummaryList) SetResults(v []GenerationSummary)`

SetResults sets Results field to given value.

### HasResults

`func (o *PaginatedGenerationSummaryList) HasResults() bool`

HasResults returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


