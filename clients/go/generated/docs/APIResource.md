# APIResource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Url** | Pointer to **string** | The URL of the referenced resource. | [optional] 
**Name** | Pointer to **string** | The name of the referenced resource. | [optional] 
**Id** | Pointer to **int32** | The ID of the referenced resource. | [optional] 

## Methods

### NewAPIResource

`func NewAPIResource() *APIResource`

NewAPIResource instantiates a new APIResource object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewAPIResourceWithDefaults

`func NewAPIResourceWithDefaults() *APIResource`

NewAPIResourceWithDefaults instantiates a new APIResource object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetUrl

`func (o *APIResource) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *APIResource) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *APIResource) SetUrl(v string)`

SetUrl sets Url field to given value.

### HasUrl

`func (o *APIResource) HasUrl() bool`

HasUrl returns a boolean if a field has been set.

### GetName

`func (o *APIResource) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *APIResource) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *APIResource) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *APIResource) HasName() bool`

HasName returns a boolean if a field has been set.

### GetId

`func (o *APIResource) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *APIResource) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *APIResource) SetId(v int32)`

SetId sets Id field to given value.

### HasId

`func (o *APIResource) HasId() bool`

HasId returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


