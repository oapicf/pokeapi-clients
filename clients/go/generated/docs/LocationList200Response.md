# LocationList200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Count** | Pointer to **int32** | The total number of locations. | [optional] 
**Next** | Pointer to **NullableString** | URL to retrieve the next page of locations. | [optional] 
**Previous** | Pointer to **NullableString** | URL to retrieve the previous page of locations. | [optional] 
**Results** | Pointer to [**[]Location**](Location.md) |  | [optional] 

## Methods

### NewLocationList200Response

`func NewLocationList200Response() *LocationList200Response`

NewLocationList200Response instantiates a new LocationList200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewLocationList200ResponseWithDefaults

`func NewLocationList200ResponseWithDefaults() *LocationList200Response`

NewLocationList200ResponseWithDefaults instantiates a new LocationList200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCount

`func (o *LocationList200Response) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *LocationList200Response) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *LocationList200Response) SetCount(v int32)`

SetCount sets Count field to given value.

### HasCount

`func (o *LocationList200Response) HasCount() bool`

HasCount returns a boolean if a field has been set.

### GetNext

`func (o *LocationList200Response) GetNext() string`

GetNext returns the Next field if non-nil, zero value otherwise.

### GetNextOk

`func (o *LocationList200Response) GetNextOk() (*string, bool)`

GetNextOk returns a tuple with the Next field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNext

`func (o *LocationList200Response) SetNext(v string)`

SetNext sets Next field to given value.

### HasNext

`func (o *LocationList200Response) HasNext() bool`

HasNext returns a boolean if a field has been set.

### SetNextNil

`func (o *LocationList200Response) SetNextNil(b bool)`

 SetNextNil sets the value for Next to be an explicit nil

### UnsetNext
`func (o *LocationList200Response) UnsetNext()`

UnsetNext ensures that no value is present for Next, not even an explicit nil
### GetPrevious

`func (o *LocationList200Response) GetPrevious() string`

GetPrevious returns the Previous field if non-nil, zero value otherwise.

### GetPreviousOk

`func (o *LocationList200Response) GetPreviousOk() (*string, bool)`

GetPreviousOk returns a tuple with the Previous field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrevious

`func (o *LocationList200Response) SetPrevious(v string)`

SetPrevious sets Previous field to given value.

### HasPrevious

`func (o *LocationList200Response) HasPrevious() bool`

HasPrevious returns a boolean if a field has been set.

### SetPreviousNil

`func (o *LocationList200Response) SetPreviousNil(b bool)`

 SetPreviousNil sets the value for Previous to be an explicit nil

### UnsetPrevious
`func (o *LocationList200Response) UnsetPrevious()`

UnsetPrevious ensures that no value is present for Previous, not even an explicit nil
### GetResults

`func (o *LocationList200Response) GetResults() []Location`

GetResults returns the Results field if non-nil, zero value otherwise.

### GetResultsOk

`func (o *LocationList200Response) GetResultsOk() (*[]Location, bool)`

GetResultsOk returns a tuple with the Results field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResults

`func (o *LocationList200Response) SetResults(v []Location)`

SetResults sets Results field to given value.

### HasResults

`func (o *LocationList200Response) HasResults() bool`

HasResults returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


