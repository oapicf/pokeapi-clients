# TypeGameSprite
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**NameIcon** | **String** | The URL of the icon displaying the type name in this game, or null if unavailable. | [optional] 
**SymbolIcon** | **String** | The URL of the type symbol icon in this game, or null if unavailable. | [optional] 

## Examples

- Prepare the resource
```powershell
$TypeGameSprite = Initialize-PSOpenAPIToolsTypeGameSprite  -NameIcon null `
 -SymbolIcon null
```

- Convert the resource to JSON
```powershell
$TypeGameSprite | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

