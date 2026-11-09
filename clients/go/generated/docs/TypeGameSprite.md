# TypeGameSprite

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NameIcon** | Pointer to **NullableString** | The URL of the icon displaying the type name in this game, or null if unavailable. | [optional] 
**SymbolIcon** | Pointer to **NullableString** | The URL of the type symbol icon in this game, or null if unavailable. | [optional] 

## Methods

### NewTypeGameSprite

`func NewTypeGameSprite() *TypeGameSprite`

NewTypeGameSprite instantiates a new TypeGameSprite object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewTypeGameSpriteWithDefaults

`func NewTypeGameSpriteWithDefaults() *TypeGameSprite`

NewTypeGameSpriteWithDefaults instantiates a new TypeGameSprite object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetNameIcon

`func (o *TypeGameSprite) GetNameIcon() string`

GetNameIcon returns the NameIcon field if non-nil, zero value otherwise.

### GetNameIconOk

`func (o *TypeGameSprite) GetNameIconOk() (*string, bool)`

GetNameIconOk returns a tuple with the NameIcon field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNameIcon

`func (o *TypeGameSprite) SetNameIcon(v string)`

SetNameIcon sets NameIcon field to given value.

### HasNameIcon

`func (o *TypeGameSprite) HasNameIcon() bool`

HasNameIcon returns a boolean if a field has been set.

### SetNameIconNil

`func (o *TypeGameSprite) SetNameIconNil(b bool)`

 SetNameIconNil sets the value for NameIcon to be an explicit nil

### UnsetNameIcon
`func (o *TypeGameSprite) UnsetNameIcon()`

UnsetNameIcon ensures that no value is present for NameIcon, not even an explicit nil
### GetSymbolIcon

`func (o *TypeGameSprite) GetSymbolIcon() string`

GetSymbolIcon returns the SymbolIcon field if non-nil, zero value otherwise.

### GetSymbolIconOk

`func (o *TypeGameSprite) GetSymbolIconOk() (*string, bool)`

GetSymbolIconOk returns a tuple with the SymbolIcon field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSymbolIcon

`func (o *TypeGameSprite) SetSymbolIcon(v string)`

SetSymbolIcon sets SymbolIcon field to given value.

### HasSymbolIcon

`func (o *TypeGameSprite) HasSymbolIcon() bool`

HasSymbolIcon returns a boolean if a field has been set.

### SetSymbolIconNil

`func (o *TypeGameSprite) SetSymbolIconNil(b bool)`

 SetSymbolIconNil sets the value for SymbolIcon to be an explicit nil

### UnsetSymbolIcon
`func (o *TypeGameSprite) UnsetSymbolIcon()`

UnsetSymbolIcon ensures that no value is present for SymbolIcon, not even an explicit nil

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


