# PaginatedItemCategorySummaryList

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Count** | Pointer to **int32** |  | [optional] 
**Next** | Pointer to **string** |  | [optional] 
**Previous** | Pointer to **string** |  | [optional] 
**Results** | Pointer to [**[]ItemCategorySummary**](ItemCategorySummary.md) |  | [optional] 

## Methods

### NewPaginatedItemCategorySummaryList

`func NewPaginatedItemCategorySummaryList() *PaginatedItemCategorySummaryList`

NewPaginatedItemCategorySummaryList instantiates a new PaginatedItemCategorySummaryList object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPaginatedItemCategorySummaryListWithDefaults

`func NewPaginatedItemCategorySummaryListWithDefaults() *PaginatedItemCategorySummaryList`

NewPaginatedItemCategorySummaryListWithDefaults instantiates a new PaginatedItemCategorySummaryList object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCount

`func (o *PaginatedItemCategorySummaryList) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *PaginatedItemCategorySummaryList) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *PaginatedItemCategorySummaryList) SetCount(v int32)`

SetCount sets Count field to given value.

### HasCount

`func (o *PaginatedItemCategorySummaryList) HasCount() bool`

HasCount returns a boolean if a field has been set.

### GetNext

`func (o *PaginatedItemCategorySummaryList) GetNext() string`

GetNext returns the Next field if non-nil, zero value otherwise.

### GetNextOk

`func (o *PaginatedItemCategorySummaryList) GetNextOk() (*string, bool)`

GetNextOk returns a tuple with the Next field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNext

`func (o *PaginatedItemCategorySummaryList) SetNext(v string)`

SetNext sets Next field to given value.

### HasNext

`func (o *PaginatedItemCategorySummaryList) HasNext() bool`

HasNext returns a boolean if a field has been set.

### GetPrevious

`func (o *PaginatedItemCategorySummaryList) GetPrevious() string`

GetPrevious returns the Previous field if non-nil, zero value otherwise.

### GetPreviousOk

`func (o *PaginatedItemCategorySummaryList) GetPreviousOk() (*string, bool)`

GetPreviousOk returns a tuple with the Previous field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrevious

`func (o *PaginatedItemCategorySummaryList) SetPrevious(v string)`

SetPrevious sets Previous field to given value.

### HasPrevious

`func (o *PaginatedItemCategorySummaryList) HasPrevious() bool`

HasPrevious returns a boolean if a field has been set.

### GetResults

`func (o *PaginatedItemCategorySummaryList) GetResults() []ItemCategorySummary`

GetResults returns the Results field if non-nil, zero value otherwise.

### GetResultsOk

`func (o *PaginatedItemCategorySummaryList) GetResultsOk() (*[]ItemCategorySummary, bool)`

GetResultsOk returns a tuple with the Results field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResults

`func (o *PaginatedItemCategorySummaryList) SetResults(v []ItemCategorySummary)`

SetResults sets Results field to given value.

### HasResults

`func (o *PaginatedItemCategorySummaryList) HasResults() bool`

HasResults returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


