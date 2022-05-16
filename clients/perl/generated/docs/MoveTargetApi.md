# WWW::OpenAPIClient::MoveTargetApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::MoveTargetApi;
```

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**move_target_list**](MoveTargetApi.md#move_target_list) | **GET** /api/v2/move-target/ | 
[**move_target_read**](MoveTargetApi.md#move_target_read) | **GET** /api/v2/move-target/{id}/ | 


# **move_target_list**
> string move_target_list(limit => $limit, offset => $offset)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MoveTargetApi;
my $api_instance = WWW::OpenAPIClient::MoveTargetApi->new(
);

my $limit = 56; # int | 
my $offset = 56; # int | 

eval {
    my $result = $api_instance->move_target_list(limit => $limit, offset => $offset);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling MoveTargetApi->move_target_list: $@\n";
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

# **move_target_read**
> string move_target_read(id => $id)



### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::MoveTargetApi;
my $api_instance = WWW::OpenAPIClient::MoveTargetApi->new(
);

my $id = 56; # int | 

eval {
    my $result = $api_instance->move_target_read(id => $id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling MoveTargetApi->move_target_read: $@\n";
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

