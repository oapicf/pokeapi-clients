# ContestType

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int32** | The identifier for this contest type resource | 
**Name** | **string** | The name for this contest type resource | 
**BerryFlavor** | [**BerryFlavor**](BerryFlavor.md) |  | 
**Names** | [**[]ContestName**](ContestName.md) | The name of this contest type listed in different languages | 

## Methods

### NewContestType

`func NewContestType(id int32, name string, berryFlavor BerryFlavor, names []ContestName, ) *ContestType`

NewContestType instantiates a new ContestType object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewContestTypeWithDefaults

`func NewContestTypeWithDefaults() *ContestType`

NewContestTypeWithDefaults instantiates a new ContestType object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetId

`func (o *ContestType) GetId() int32`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *ContestType) GetIdOk() (*int32, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *ContestType) SetId(v int32)`

SetId sets Id field to given value.


### GetName

`func (o *ContestType) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ContestType) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ContestType) SetName(v string)`

SetName sets Name field to given value.


### GetBerryFlavor

`func (o *ContestType) GetBerryFlavor() BerryFlavor`

GetBerryFlavor returns the BerryFlavor field if non-nil, zero value otherwise.

### GetBerryFlavorOk

`func (o *ContestType) GetBerryFlavorOk() (*BerryFlavor, bool)`

GetBerryFlavorOk returns a tuple with the BerryFlavor field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBerryFlavor

`func (o *ContestType) SetBerryFlavor(v BerryFlavor)`

SetBerryFlavor sets BerryFlavor field to given value.


### GetNames

`func (o *ContestType) GetNames() []ContestName`

GetNames returns the Names field if non-nil, zero value otherwise.

### GetNamesOk

`func (o *ContestType) GetNamesOk() (*[]ContestName, bool)`

GetNamesOk returns a tuple with the Names field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNames

`func (o *ContestType) SetNames(v []ContestName)`

SetNames sets Names field to given value.



[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


