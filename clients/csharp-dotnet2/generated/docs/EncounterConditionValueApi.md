# Org.OpenAPITools.Api.EncounterConditionValueApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EncounterConditionValueList**](EncounterConditionValueApi.md#encounterconditionvaluelist) | **GET** /api/v2/encounter-condition-value/ | 
[**EncounterConditionValueRead**](EncounterConditionValueApi.md#encounterconditionvalueread) | **GET** /api/v2/encounter-condition-value/{id}/ | 


<a name="encounterconditionvaluelist"></a>
# **EncounterConditionValueList**
> string EncounterConditionValueList (int? limit, int? offset)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class EncounterConditionValueListExample
    {
        public void main()
        {
            var apiInstance = new EncounterConditionValueApi();
            var limit = 56;  // int? |  (optional) 
            var offset = 56;  // int? |  (optional) 

            try
            {
                string result = apiInstance.EncounterConditionValueList(limit, offset);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EncounterConditionValueApi.EncounterConditionValueList: " + e.Message );
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

<a name="encounterconditionvalueread"></a>
# **EncounterConditionValueRead**
> string EncounterConditionValueRead (int? id)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class EncounterConditionValueReadExample
    {
        public void main()
        {
            var apiInstance = new EncounterConditionValueApi();
            var id = 56;  // int? | 

            try
            {
                string result = apiInstance.EncounterConditionValueRead(id);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EncounterConditionValueApi.EncounterConditionValueRead: " + e.Message );
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

