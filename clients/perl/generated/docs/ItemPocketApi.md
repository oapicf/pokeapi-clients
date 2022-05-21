# WWW::OpenAPIClient::ItemPocketApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::ItemPocketApi;
```

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**item_pocket_list**](ItemPocketApi.md#item_pocket_list) | **GET** /api/v2/item-pocket/ | 
[**item_pocket_read**](ItemPocketApi.md#item_pocket_read) | **GET** /api/v2/item-pocket/{id}/ | 


# **item_pocket_list**
> string item_pocket_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ItemPocketApi;
my $api_instance = WWW::OpenAPIClient::ItemPocketApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->item_pocket_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ItemPocketApi->item_pocket_list: $@\n";
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

# **item_pocket_read**
> string item_pocket_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ItemPocketApi;
my $api_instance = WWW::OpenAPIClient::ItemPocketApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->item_pocket_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ItemPocketApi->item_pocket_read: $@\n";
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

