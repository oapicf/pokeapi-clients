# PaginatedPokemonFormSummaryList

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Count** | Pointer to **int32** |  | [optional] 
**Next** | Pointer to **string** |  | [optional] 
**Previous** | Pointer to **string** |  | [optional] 
**Results** | Pointer to [**[]PokemonFormSummary**](PokemonFormSummary.md) |  | [optional] 

## Methods

### NewPaginatedPokemonFormSummaryList

`func NewPaginatedPokemonFormSummaryList() *PaginatedPokemonFormSummaryList`

NewPaginatedPokemonFormSummaryList instantiates a new PaginatedPokemonFormSummaryList object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewPaginatedPokemonFormSummaryListWithDefaults

`func NewPaginatedPokemonFormSummaryListWithDefaults() *PaginatedPokemonFormSummaryList`

NewPaginatedPokemonFormSummaryListWithDefaults instantiates a new PaginatedPokemonFormSummaryList object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCount

`func (o *PaginatedPokemonFormSummaryList) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *PaginatedPokemonFormSummaryList) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *PaginatedPokemonFormSummaryList) SetCount(v int32)`

SetCount sets Count field to given value.

### HasCount

`func (o *PaginatedPokemonFormSummaryList) HasCount() bool`

HasCount returns a boolean if a field has been set.

### GetNext

`func (o *PaginatedPokemonFormSummaryList) GetNext() string`

GetNext returns the Next field if non-nil, zero value otherwise.

### GetNextOk

`func (o *PaginatedPokemonFormSummaryList) GetNextOk() (*string, bool)`

GetNextOk returns a tuple with the Next field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNext

`func (o *PaginatedPokemonFormSummaryList) SetNext(v string)`

SetNext sets Next field to given value.

### HasNext

`func (o *PaginatedPokemonFormSummaryList) HasNext() bool`

HasNext returns a boolean if a field has been set.

### GetPrevious

`func (o *PaginatedPokemonFormSummaryList) GetPrevious() string`

GetPrevious returns the Previous field if non-nil, zero value otherwise.

### GetPreviousOk

`func (o *PaginatedPokemonFormSummaryList) GetPreviousOk() (*string, bool)`

GetPreviousOk returns a tuple with the Previous field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrevious

`func (o *PaginatedPokemonFormSummaryList) SetPrevious(v string)`

SetPrevious sets Previous field to given value.

### HasPrevious

`func (o *PaginatedPokemonFormSummaryList) HasPrevious() bool`

HasPrevious returns a boolean if a field has been set.

### GetResults

`func (o *PaginatedPokemonFormSummaryList) GetResults() []PokemonFormSummary`

GetResults returns the Results field if non-nil, zero value otherwise.

### GetResultsOk

`func (o *PaginatedPokemonFormSummaryList) GetResultsOk() (*[]PokemonFormSummary, bool)`

GetResultsOk returns a tuple with the Results field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResults

`func (o *PaginatedPokemonFormSummaryList) SetResults(v []PokemonFormSummary)`

SetResults sets Results field to given value.

### HasResults

`func (o *PaginatedPokemonFormSummaryList) HasResults() bool`

HasResults returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


