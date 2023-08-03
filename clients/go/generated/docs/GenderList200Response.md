# GenderList200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Count** | Pointer to **int32** | The total number of genders. | [optional] 
**Next** | Pointer to **NullableString** | URL to retrieve the next page of genders. | [optional] 
**Previous** | Pointer to **NullableString** | URL to retrieve the previous page of genders. | [optional] 
**Results** | Pointer to [**[]Gender**](Gender.md) |  | [optional] 

## Methods

### NewGenderList200Response

`func NewGenderList200Response() *GenderList200Response`

NewGenderList200Response instantiates a new GenderList200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewGenderList200ResponseWithDefaults

`func NewGenderList200ResponseWithDefaults() *GenderList200Response`

NewGenderList200ResponseWithDefaults instantiates a new GenderList200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCount

`func (o *GenderList200Response) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *GenderList200Response) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *GenderList200Response) SetCount(v int32)`

SetCount sets Count field to given value.

### HasCount

`func (o *GenderList200Response) HasCount() bool`

HasCount returns a boolean if a field has been set.

### GetNext

`func (o *GenderList200Response) GetNext() string`

GetNext returns the Next field if non-nil, zero value otherwise.

### GetNextOk

`func (o *GenderList200Response) GetNextOk() (*string, bool)`

GetNextOk returns a tuple with the Next field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNext

`func (o *GenderList200Response) SetNext(v string)`

SetNext sets Next field to given value.

### HasNext

`func (o *GenderList200Response) HasNext() bool`

HasNext returns a boolean if a field has been set.

### SetNextNil

`func (o *GenderList200Response) SetNextNil(b bool)`

 SetNextNil sets the value for Next to be an explicit nil

### UnsetNext
`func (o *GenderList200Response) UnsetNext()`

UnsetNext ensures that no value is present for Next, not even an explicit nil
### GetPrevious

`func (o *GenderList200Response) GetPrevious() string`

GetPrevious returns the Previous field if non-nil, zero value otherwise.

### GetPreviousOk

`func (o *GenderList200Response) GetPreviousOk() (*string, bool)`

GetPreviousOk returns a tuple with the Previous field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrevious

`func (o *GenderList200Response) SetPrevious(v string)`

SetPrevious sets Previous field to given value.

### HasPrevious

`func (o *GenderList200Response) HasPrevious() bool`

HasPrevious returns a boolean if a field has been set.

### SetPreviousNil

`func (o *GenderList200Response) SetPreviousNil(b bool)`

 SetPreviousNil sets the value for Previous to be an explicit nil

### UnsetPrevious
`func (o *GenderList200Response) UnsetPrevious()`

UnsetPrevious ensures that no value is present for Previous, not even an explicit nil
### GetResults

`func (o *GenderList200Response) GetResults() []Gender`

GetResults returns the Results field if non-nil, zero value otherwise.

### GetResultsOk

`func (o *GenderList200Response) GetResultsOk() (*[]Gender, bool)`

GetResultsOk returns a tuple with the Results field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResults

`func (o *GenderList200Response) SetResults(v []Gender)`

SetResults sets Results field to given value.

### HasResults

`func (o *GenderList200Response) HasResults() bool`

HasResults returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


