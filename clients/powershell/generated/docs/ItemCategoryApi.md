# PSOpenAPITools.PSOpenAPITools/Api.ItemCategoryApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-ItemCategoryList**](ItemCategoryApi.md#Invoke-ItemCategoryList) | **GET** /api/v2/item-category/ | 
[**Invoke-ItemCategoryRead**](ItemCategoryApi.md#Invoke-ItemCategoryRead) | **GET** /api/v2/item-category/{id}/ | 


<a name="Invoke-ItemCategoryList"></a>
# **Invoke-ItemCategoryList**
> String Invoke-ItemCategoryList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Offset] <System.Nullable[Int32]><br>



### Example
```powershell
$Limit = 56 # Int32 |  (optional)
$Offset = 56 # Int32 |  (optional)

try {
    $Result = Invoke-ItemCategoryList -Limit $Limit -Offset $Offset
} catch {
    Write-Host ("Exception occurred when calling Invoke-ItemCategoryList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
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

<a name="Invoke-ItemCategoryRead"></a>
# **Invoke-ItemCategoryRead**
> String Invoke-ItemCategoryRead<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <Int32><br>



### Example
```powershell
$Id = 56 # Int32 | 

try {
    $Result = Invoke-ItemCategoryRead -Id $Id
} catch {
    Write-Host ("Exception occurred when calling Invoke-ItemCategoryRead: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
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

