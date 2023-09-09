# BerryFirmnessList200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Count** | Pointer to **int32** | The total number of berry firmnesses available from this API. | [optional] 
**Next** | Pointer to **NullableString** | The URL for the next page of results, or null if there are no more results. | [optional] 
**Previous** | Pointer to **NullableString** | The URL for the previous page of results, or null if this is the first page. | [optional] 
**Results** | Pointer to [**[]BerryFirmness**](BerryFirmness.md) |  | [optional] 

## Methods

### NewBerryFirmnessList200Response

`func NewBerryFirmnessList200Response() *BerryFirmnessList200Response`

NewBerryFirmnessList200Response instantiates a new BerryFirmnessList200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewBerryFirmnessList200ResponseWithDefaults

`func NewBerryFirmnessList200ResponseWithDefaults() *BerryFirmnessList200Response`

NewBerryFirmnessList200ResponseWithDefaults instantiates a new BerryFirmnessList200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCount

`func (o *BerryFirmnessList200Response) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *BerryFirmnessList200Response) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *BerryFirmnessList200Response) SetCount(v int32)`

SetCount sets Count field to given value.

### HasCount

`func (o *BerryFirmnessList200Response) HasCount() bool`

HasCount returns a boolean if a field has been set.

### GetNext

`func (o *BerryFirmnessList200Response) GetNext() string`

GetNext returns the Next field if non-nil, zero value otherwise.

### GetNextOk

`func (o *BerryFirmnessList200Response) GetNextOk() (*string, bool)`

GetNextOk returns a tuple with the Next field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNext

`func (o *BerryFirmnessList200Response) SetNext(v string)`

SetNext sets Next field to given value.

### HasNext

`func (o *BerryFirmnessList200Response) HasNext() bool`

HasNext returns a boolean if a field has been set.

### SetNextNil

`func (o *BerryFirmnessList200Response) SetNextNil(b bool)`

 SetNextNil sets the value for Next to be an explicit nil

### UnsetNext
`func (o *BerryFirmnessList200Response) UnsetNext()`

UnsetNext ensures that no value is present for Next, not even an explicit nil
### GetPrevious

`func (o *BerryFirmnessList200Response) GetPrevious() string`

GetPrevious returns the Previous field if non-nil, zero value otherwise.

### GetPreviousOk

`func (o *BerryFirmnessList200Response) GetPreviousOk() (*string, bool)`

GetPreviousOk returns a tuple with the Previous field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrevious

`func (o *BerryFirmnessList200Response) SetPrevious(v string)`

SetPrevious sets Previous field to given value.

### HasPrevious

`func (o *BerryFirmnessList200Response) HasPrevious() bool`

HasPrevious returns a boolean if a field has been set.

### SetPreviousNil

`func (o *BerryFirmnessList200Response) SetPreviousNil(b bool)`

 SetPreviousNil sets the value for Previous to be an explicit nil

### UnsetPrevious
`func (o *BerryFirmnessList200Response) UnsetPrevious()`

UnsetPrevious ensures that no value is present for Previous, not even an explicit nil
### GetResults

`func (o *BerryFirmnessList200Response) GetResults() []BerryFirmness`

GetResults returns the Results field if non-nil, zero value otherwise.

### GetResultsOk

`func (o *BerryFirmnessList200Response) GetResultsOk() (*[]BerryFirmness, bool)`

GetResultsOk returns a tuple with the Results field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResults

`func (o *BerryFirmnessList200Response) SetResults(v []BerryFirmness)`

SetResults sets Results field to given value.

### HasResults

`func (o *BerryFirmnessList200Response) HasResults() bool`

HasResults returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


