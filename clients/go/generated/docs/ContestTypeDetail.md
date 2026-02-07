# ContestTypeDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** |  | [readonly] 
**Name** | **string** |  | 
**BerryFlavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) |  | [readonly] 
**Names** | [**[]ContestTypeName**](ContestTypeName.md) |  | 

## Methods

### NewContestTypeDetail

`func NewContestTypeDetail(id int32, name string, berryFlavor BerryFlavorSummary, names []ContestTypeName, ) *ContestTypeDetail`

NewContestTypeDetail instantiates a new ContestTypeDetail object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewContestTypeDetailWithDefaults

`func NewContestTypeDetailWithDefaults() *ContestTypeDetail`

NewContestTypeDetailWithDefaults instantiates a new ContestTypeDetail object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ContestTypeDetail) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ContestTypeDetail) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ContestTypeDetail) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *ContestTypeDetail) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ContestTypeDetail) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ContestTypeDetail) SetName(v string)`

SetName sets Name field to given value.


### GetBerryFlavor

`func (o *ContestTypeDetail) GetBerryFlavor() BerryFlavorSummary`

GetBerryFlavor returns the BerryFlavor field if non-nil, zero value otherwise.

### GetBerryFlavorOk

`func (o *ContestTypeDetail) GetBerryFlavorOk() (*BerryFlavorSummary, bool)`

GetBerryFlavorOk returns a tuple with the BerryFlavor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBerryFlavor

`func (o *ContestTypeDetail) SetBerryFlavor(v BerryFlavorSummary)`

SetBerryFlavor sets BerryFlavor field to given value.


### GetNames

`func (o *ContestTypeDetail) GetNames() []ContestTypeName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *ContestTypeDetail) GetNamesOk() (*[]ContestTypeName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *ContestTypeDetail) SetNames(v []ContestTypeName)`

SetNames sets Names field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


