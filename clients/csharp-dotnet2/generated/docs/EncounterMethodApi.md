# Org.OpenAPITools.Api.EncounterMethodApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EncounterMethodList**](EncounterMethodApi.md#encountermethodlist) | **GET** /api/v2/encounter-method/ | 
[**EncounterMethodRead**](EncounterMethodApi.md#encountermethodread) | **GET** /api/v2/encounter-method/{id}/ | 


<a name="encountermethodlist"></a>
# **EncounterMethodList**
> string EncounterMethodList (int? limit, int? offset)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class EncounterMethodListExample
    {
        public void main()
        {
            var apiInstance = new EncounterMethodApi();
            var limit = 56;  // int? |  (optional) 
            var offset = 56;  // int? |  (optional) 

            try
            {
                string result = apiInstance.EncounterMethodList(limit, offset);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EncounterMethodApi.EncounterMethodList: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int?**|  | [optional] 
 **offset** | **int?**|  | [optional] 

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="encountermethodread"></a>
# **EncounterMethodRead**
> string EncounterMethodRead (int? id)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class EncounterMethodReadExample
    {
        public void main()
        {
            var apiInstance = new EncounterMethodApi();
            var id = 56;  // int? | 

            try
            {
                string result = apiInstance.EncounterMethodRead(id);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EncounterMethodApi.EncounterMethodRead: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int?**|  | 

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

