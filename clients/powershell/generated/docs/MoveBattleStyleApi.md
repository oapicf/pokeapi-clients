# PSOpenAPITools.PSOpenAPITools/Api.MoveBattleStyleApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Move-BattleStyleList**](MoveBattleStyleApi.md#Move-BattleStyleList) | **GET** /api/v2/move-battle-style/ | 
[**Move-BattleStyleRead**](MoveBattleStyleApi.md#Move-BattleStyleRead) | **GET** /api/v2/move-battle-style/{id}/ | 


<a name="Move-BattleStyleList"></a>
# **Move-BattleStyleList**
> String Move-BattleStyleList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Offset] <System.Nullable[Int32]><br>



### Example
```powershell
$Limit = 56 # Int32 |  (optional)
$Offset = 56 # Int32 |  (optional)

try {
    $Result = Move-BattleStyleList -Limit $Limit -Offset $Offset
} catch {
    Write-Host ("Exception occurred when calling Move-BattleStyleList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Limit** | **Int32**|  | [optional] 
 **Offset** | **Int32**|  | [optional] 

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="Move-BattleStyleRead"></a>
# **Move-BattleStyleRead**
> String Move-BattleStyleRead<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <Int32><br>



### Example
```powershell
$Id = 56 # Int32 | 

try {
    $Result = Move-BattleStyleRead -Id $Id
} catch {
    Write-Host ("Exception occurred when calling Move-BattleStyleRead: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **Id** | **Int32**|  | 

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

