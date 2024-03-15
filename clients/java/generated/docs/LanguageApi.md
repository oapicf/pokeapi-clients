# LanguageApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**languageList**](LanguageApi.md#languageList) | **GET** /api/v2/language/ |  |
| [**languageRead**](LanguageApi.md#languageRead) | **GET** /api/v2/language/{id}/ |  |


<a id="languageList"></a>
# **languageList**
> String languageList(limit, offset)



### Example
```java
// Import classes:
import com.github.oapicf.pokeapiclient.ApiClient;
import com.github.oapicf.pokeapiclient.ApiException;
import com.github.oapicf.pokeapiclient.Configuration;
import com.github.oapicf.pokeapiclient.models.*;
import com.github.oapicf.pokeapiclient.api.LanguageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pokeapi.co");

    LanguageApi apiInstance = new LanguageApi(defaultClient);
    Integer limit = 56; // Integer | 
    Integer offset = 56; // Integer | 
    try {
      String result = apiInstance.languageList(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LanguageApi#languageList");
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

<a id="languageRead"></a>
# **languageRead**
> String languageRead(id)



### Example
```java
// Import classes:
import com.github.oapicf.pokeapiclient.ApiClient;
import com.github.oapicf.pokeapiclient.ApiException;
import com.github.oapicf.pokeapiclient.Configuration;
import com.github.oapicf.pokeapiclient.models.*;
import com.github.oapicf.pokeapiclient.api.LanguageApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pokeapi.co");

    LanguageApi apiInstance = new LanguageApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      String result = apiInstance.languageRead(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LanguageApi#languageRead");
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

