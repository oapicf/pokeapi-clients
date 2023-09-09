# ItemPocketList200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Count** | Pointer to **int32** | The total number of item pockets. | [optional] 
**Next** | Pointer to **NullableString** | URL to retrieve the next page of item pockets. | [optional] 
**Previous** | Pointer to **NullableString** | URL to retrieve the previous page of item pockets. | [optional] 
**Results** | Pointer to [**[]ItemPocket**](ItemPocket.md) |  | [optional] 

## Methods

### NewItemPocketList200Response

`func NewItemPocketList200Response() *ItemPocketList200Response`

NewItemPocketList200Response instantiates a new ItemPocketList200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewItemPocketList200ResponseWithDefaults

`func NewItemPocketList200ResponseWithDefaults() *ItemPocketList200Response`

NewItemPocketList200ResponseWithDefaults instantiates a new ItemPocketList200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetCount

`func (o *ItemPocketList200Response) GetCount() int32`

GetCount returns the Count field if non-nil, zero value otherwise.

### GetCountOk

`func (o *ItemPocketList200Response) GetCountOk() (*int32, bool)`

GetCountOk returns a tuple with the Count field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCount

`func (o *ItemPocketList200Response) SetCount(v int32)`

SetCount sets Count field to given value.

### HasCount

`func (o *ItemPocketList200Response) HasCount() bool`

HasCount returns a boolean if a field has been set.

### GetNext

`func (o *ItemPocketList200Response) GetNext() string`

GetNext returns the Next field if non-nil, zero value otherwise.

### GetNextOk

`func (o *ItemPocketList200Response) GetNextOk() (*string, bool)`

GetNextOk returns a tuple with the Next field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNext

`func (o *ItemPocketList200Response) SetNext(v string)`

SetNext sets Next field to given value.

### HasNext

`func (o *ItemPocketList200Response) HasNext() bool`

HasNext returns a boolean if a field has been set.

### SetNextNil

`func (o *ItemPocketList200Response) SetNextNil(b bool)`

 SetNextNil sets the value for Next to be an explicit nil

### UnsetNext
`func (o *ItemPocketList200Response) UnsetNext()`

UnsetNext ensures that no value is present for Next, not even an explicit nil
### GetPrevious

`func (o *ItemPocketList200Response) GetPrevious() string`

GetPrevious returns the Previous field if non-nil, zero value otherwise.

### GetPreviousOk

`func (o *ItemPocketList200Response) GetPreviousOk() (*string, bool)`

GetPreviousOk returns a tuple with the Previous field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPrevious

`func (o *ItemPocketList200Response) SetPrevious(v string)`

SetPrevious sets Previous field to given value.

### HasPrevious

`func (o *ItemPocketList200Response) HasPrevious() bool`

HasPrevious returns a boolean if a field has been set.

### SetPreviousNil

`func (o *ItemPocketList200Response) SetPreviousNil(b bool)`

 SetPreviousNil sets the value for Previous to be an explicit nil

### UnsetPrevious
`func (o *ItemPocketList200Response) UnsetPrevious()`

UnsetPrevious ensures that no value is present for Previous, not even an explicit nil
### GetResults

`func (o *ItemPocketList200Response) GetResults() []ItemPocket`

GetResults returns the Results field if non-nil, zero value otherwise.

### GetResultsOk

`func (o *ItemPocketList200Response) GetResultsOk() (*[]ItemPocket, bool)`

GetResultsOk returns a tuple with the Results field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetResults

`func (o *ItemPocketList200Response) SetResults(v []ItemPocket)`

SetResults sets Results field to given value.

### HasResults

`func (o *ItemPocketList200Response) HasResults() bool`

HasResults returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


