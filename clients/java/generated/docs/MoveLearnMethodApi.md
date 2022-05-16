# MoveLearnMethodApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveLearnMethodList**](MoveLearnMethodApi.md#moveLearnMethodList) | **GET** /api/v2/move-learn-method/ | 
[**moveLearnMethodRead**](MoveLearnMethodApi.md#moveLearnMethodRead) | **GET** /api/v2/move-learn-method/{id}/ | 


<a name="moveLearnMethodList"></a>
# **moveLearnMethodList**
> String moveLearnMethodList(limit, offset)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MoveLearnMethodApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pokeapi.co/api/v2");

    MoveLearnMethodApi apiInstance = new MoveLearnMethodApi(defaultClient);
    Integer limit = 56; // Integer | 
    Integer offset = 56; // Integer | 
    try {
      String result = apiInstance.moveLearnMethodList(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MoveLearnMethodApi#moveLearnMethodList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**|  | [optional]
 **offset** | **Integer**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

<a name="moveLearnMethodRead"></a>
# **moveLearnMethodRead**
> String moveLearnMethodRead(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MoveLearnMethodApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pokeapi.co/api/v2");

    MoveLearnMethodApi apiInstance = new MoveLearnMethodApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      String result = apiInstance.moveLearnMethodRead(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MoveLearnMethodApi#moveLearnMethodRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

