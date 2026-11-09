# PaginatedItemFlingEffectSummaryList

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Count** | **int32** | The total number of resources available from this API. | 
**Next** | Pointer to **NullableString** | The URL for the next page in the list, or null if there is no next page. | [optional] 
**Previous** | Pointer to **NullableString** | The URL for the previous page in the list, or null if there is no previous page. | [optional] 
**Results** | [**[]ItemFlingEffectSummary**](ItemFlingEffectSummary.md) | A list of API resources on this page. | 

## Methods

### NewPaginatedItemFlingEffectSummaryList

`func NewPaginatedItemFlingEffectSummaryList(count int32, results []ItemFlingEffectSummary, ) *PaginatedItemFlingEffectSummaryList`

NewPaginatedItemFlingEffectSummaryList instantiates a new PaginatedItemFlingEffectSummaryList object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPaginatedItemFlingEffectSummaryListWithDefaults

`func NewPaginatedItemFlingEffectSummaryListWithDefaults() *PaginatedItemFlingEffectSummaryList`

NewPaginatedItemFlingEffectSummaryListWithDefaults instantiates a new PaginatedItemFlingEffectSummaryList object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCount

`func (o *PaginatedItemFlingEffectSummaryList) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *PaginatedItemFlingEffectSummaryList) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *PaginatedItemFlingEffectSummaryList) SetCount(v int32)`

SetCount sets Count field to given value.


### GetNext

`func (o *PaginatedItemFlingEffectSummaryList) GetNext() string`

GetNext returns the Next field if non-nil, zero value otherwise.

### GetNextOk

`func (o *PaginatedItemFlingEffectSummaryList) GetNextOk() (*string, bool)`

GetNextOk returns a tuple with the Next field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNext

`func (o *PaginatedItemFlingEffectSummaryList) SetNext(v string)`

SetNext sets Next field to given value.

### HasNext

`func (o *PaginatedItemFlingEffectSummaryList) HasNext() bool`

HasNext returns a boolean if a field has been set.

### SetNextNil

`func (o *PaginatedItemFlingEffectSummaryList) SetNextNil(b bool)`

 SetNextNil sets the value for Next to be an explicit nil

### UnsetNext
`func (o *PaginatedItemFlingEffectSummaryList) UnsetNext()`

UnsetNext ensures that no value is present for Next, not even an explicit nil
### GetPrevious

`func (o *PaginatedItemFlingEffectSummaryList) GetPrevious() string`

GetPrevious returns the Previous field if non-nil, zero value otherwise.

### GetPreviousOk

`func (o *PaginatedItemFlingEffectSummaryList) GetPreviousOk() (*string, bool)`

GetPreviousOk returns a tuple with the Previous field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrevious

`func (o *PaginatedItemFlingEffectSummaryList) SetPrevious(v string)`

SetPrevious sets Previous field to given value.

### HasPrevious

`func (o *PaginatedItemFlingEffectSummaryList) HasPrevious() bool`

HasPrevious returns a boolean if a field has been set.

### SetPreviousNil

`func (o *PaginatedItemFlingEffectSummaryList) SetPreviousNil(b bool)`

 SetPreviousNil sets the value for Previous to be an explicit nil

### UnsetPrevious
`func (o *PaginatedItemFlingEffectSummaryList) UnsetPrevious()`

UnsetPrevious ensures that no value is present for Previous, not even an explicit nil
### GetResults

`func (o *PaginatedItemFlingEffectSummaryList) GetResults() []ItemFlingEffectSummary`

GetResults returns the Results field if non-nil, zero value otherwise.

### GetResultsOk

`func (o *PaginatedItemFlingEffectSummaryList) GetResultsOk() (*[]ItemFlingEffectSummary, bool)`

GetResultsOk returns a tuple with the Results field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResults

`func (o *PaginatedItemFlingEffectSummaryList) SetResults(v []ItemFlingEffectSummary)`

SetResults sets Results field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


