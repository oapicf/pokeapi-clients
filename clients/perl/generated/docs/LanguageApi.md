# WWW::OpenAPIClient::LanguageApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::LanguageApi;
```

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**language_list**](LanguageApi.md#language_list) | **GET** /api/v2/language/ | 
[**language_read**](LanguageApi.md#language_read) | **GET** /api/v2/language/{id}/ | 


# **language_list**
> string language_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LanguageApi;
my $api_instance = WWW::OpenAPIClient::LanguageApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->language_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LanguageApi->language_list: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**|  | [optional] 
 **offset** | **int**|  | [optional] 

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **language_read**
> string language_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::LanguageApi;
my $api_instance = WWW::OpenAPIClient::LanguageApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->language_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling LanguageApi->language_read: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  | 

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

