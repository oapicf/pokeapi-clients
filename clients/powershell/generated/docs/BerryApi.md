# PSOpenAPITools.PSOpenAPITools/Api.BerryApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Invoke-BerryList**](BerryApi.md#Invoke-BerryList) | **GET** /api/v2/berry/ | 
[**Invoke-BerryRead**](BerryApi.md#Invoke-BerryRead) | **GET** /api/v2/berry/{id}/ | 


<a name="Invoke-BerryList"></a>
# **Invoke-BerryList**
> String Invoke-BerryList<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Limit] <System.Nullable[Int32]><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Offset] <System.Nullable[Int32]><br>



### Example
```powershell
$Limit = 56 # Int32 |  (optional)
$Offset = 56 # Int32 |  (optional)

try {
    $Result = Invoke-BerryList -Limit $Limit -Offset $Offset
} catch {
    Write-Host ("Exception occurred when calling Invoke-BerryList: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
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

<a name="Invoke-BerryRead"></a>
# **Invoke-BerryRead**
> String Invoke-BerryRead<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Id] <Int32><br>



### Example
```powershell
$Id = 56 # Int32 | 

try {
    $Result = Invoke-BerryRead -Id $Id
} catch {
    Write-Host ("Exception occurred when calling Invoke-BerryRead: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
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

