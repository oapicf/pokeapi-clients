# WWW::OpenAPIClient::ItemApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::ItemApi;
```

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**item_list**](ItemApi.md#item_list) | **GET** /api/v2/item/ | 
[**item_read**](ItemApi.md#item_read) | **GET** /api/v2/item/{id}/ | 


# **item_list**
> string item_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ItemApi;
my $api_instance = WWW::OpenAPIClient::ItemApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->item_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ItemApi->item_list: $@\n";
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

# **item_read**
> string item_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ItemApi;
my $api_instance = WWW::OpenAPIClient::ItemApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->item_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ItemApi->item_read: $@\n";
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

