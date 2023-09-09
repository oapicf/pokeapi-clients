# AbilityList200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Count** | Pointer to **int32** | The total number of abilities available | [optional] 
**Next** | Pointer to **string** | The URL for the next page of abilities (null if none) | [optional] 
**Previous** | Pointer to **string** | The URL for the previous page of abilities (null if none) | [optional] 
**Results** | Pointer to [**[]Ability**](Ability.md) |  | [optional] 

## Methods

### NewAbilityList200Response

`func NewAbilityList200Response() *AbilityList200Response`

NewAbilityList200Response instantiates a new AbilityList200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAbilityList200ResponseWithDefaults

`func NewAbilityList200ResponseWithDefaults() *AbilityList200Response`

NewAbilityList200ResponseWithDefaults instantiates a new AbilityList200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCount

`func (o *AbilityList200Response) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *AbilityList200Response) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *AbilityList200Response) SetCount(v int32)`

SetCount sets Count field to given value.

### HasCount

`func (o *AbilityList200Response) HasCount() bool`

HasCount returns a boolean if a field has been set.

### GetNext

`func (o *AbilityList200Response) GetNext() string`

GetNext returns the Next field if non-nil, zero value otherwise.

### GetNextOk

`func (o *AbilityList200Response) GetNextOk() (*string, bool)`

GetNextOk returns a tuple with the Next field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNext

`func (o *AbilityList200Response) SetNext(v string)`

SetNext sets Next field to given value.

### HasNext

`func (o *AbilityList200Response) HasNext() bool`

HasNext returns a boolean if a field has been set.

### GetPrevious

`func (o *AbilityList200Response) GetPrevious() string`

GetPrevious returns the Previous field if non-nil, zero value otherwise.

### GetPreviousOk

`func (o *AbilityList200Response) GetPreviousOk() (*string, bool)`

GetPreviousOk returns a tuple with the Previous field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrevious

`func (o *AbilityList200Response) SetPrevious(v string)`

SetPrevious sets Previous field to given value.

### HasPrevious

`func (o *AbilityList200Response) HasPrevious() bool`

HasPrevious returns a boolean if a field has been set.

### GetResults

`func (o *AbilityList200Response) GetResults() []Ability`

GetResults returns the Results field if non-nil, zero value otherwise.

### GetResultsOk

`func (o *AbilityList200Response) GetResultsOk() (*[]Ability, bool)`

GetResultsOk returns a tuple with the Results field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResults

`func (o *AbilityList200Response) SetResults(v []Ability)`

SetResults sets Results field to given value.

### HasResults

`func (o *AbilityList200Response) HasResults() bool`

HasResults returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


