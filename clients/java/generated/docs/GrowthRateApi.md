# GrowthRateApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**growthRateList**](GrowthRateApi.md#growthRateList) | **GET** /api/v2/growth-rate/ |  |
| [**growthRateRead**](GrowthRateApi.md#growthRateRead) | **GET** /api/v2/growth-rate/{id}/ |  |


<a id="growthRateList"></a>
# **growthRateList**
> String growthRateList(limit, offset)



### Example
```java
// Import classes:
import com.github.oapicf.pokeapiclient.ApiClient;
import com.github.oapicf.pokeapiclient.ApiException;
import com.github.oapicf.pokeapiclient.Configuration;
import com.github.oapicf.pokeapiclient.models.*;
import com.github.oapicf.pokeapiclient.api.GrowthRateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pokeapi.co");

    GrowthRateApi apiInstance = new GrowthRateApi(defaultClient);
    Integer limit = 56; // Integer | 
    Integer offset = 56; // Integer | 
    try {
      String result = apiInstance.growthRateList(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GrowthRateApi#growthRateList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**|  | [optional] |
| **offset** | **Integer**|  | [optional] |

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
| **0** | Default response |  -  |

<a id="growthRateRead"></a>
# **growthRateRead**
> String growthRateRead(id)



### Example
```java
// Import classes:
import com.github.oapicf.pokeapiclient.ApiClient;
import com.github.oapicf.pokeapiclient.ApiException;
import com.github.oapicf.pokeapiclient.Configuration;
import com.github.oapicf.pokeapiclient.models.*;
import com.github.oapicf.pokeapiclient.api.GrowthRateApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pokeapi.co");

    GrowthRateApi apiInstance = new GrowthRateApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      String result = apiInstance.growthRateRead(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GrowthRateApi#growthRateRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

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
| **0** | Default response |  -  |

