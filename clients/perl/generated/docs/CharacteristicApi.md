# WWW::OpenAPIClient::CharacteristicApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::CharacteristicApi;
```

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**characteristic_list**](CharacteristicApi.md#characteristic_list) | **GET** /api/v2/characteristic/ | 
[**characteristic_read**](CharacteristicApi.md#characteristic_read) | **GET** /api/v2/characteristic/{id}/ | 


# **characteristic_list**
> string characteristic_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CharacteristicApi;
my $api_instance = WWW::OpenAPIClient::CharacteristicApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->characteristic_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CharacteristicApi->characteristic_list: $@\n";
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

# **characteristic_read**
> string characteristic_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::CharacteristicApi;
my $api_instance = WWW::OpenAPIClient::CharacteristicApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->characteristic_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling CharacteristicApi->characteristic_read: $@\n";
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

