# OAIEncounterConditionValueApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**encounterConditionValueList**](OAIEncounterConditionValueApi.md#encounterconditionvaluelist) | **GET** /api/v2/encounter-condition-value/ | 
[**encounterConditionValueRead**](OAIEncounterConditionValueApi.md#encounterconditionvalueread) | **GET** /api/v2/encounter-condition-value/{id}/ | 


# **encounterConditionValueList**
```objc
-(NSURLSessionTask*) encounterConditionValueListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```



### Example
```objc

NSNumber* limit = @56; //  (optional)
NSNumber* offset = @56; //  (optional)

OAIEncounterConditionValueApi*apiInstance = [[OAIEncounterConditionValueApi alloc] init];

[apiInstance encounterConditionValueListWithLimit:limit
              offset:offset
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIEncounterConditionValueApi->encounterConditionValueList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **NSNumber***|  | [optional] 
 **offset** | **NSNumber***|  | [optional] 

### Return type

**NSString***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **encounterConditionValueRead**
```objc
-(NSURLSessionTask*) encounterConditionValueReadWithId: (NSNumber*) _id
        completionHandler: (void (^)(NSString* output, NSError* error)) handler;
```



### Example
```objc

NSNumber* _id = @56; // 

OAIEncounterConditionValueApi*apiInstance = [[OAIEncounterConditionValueApi alloc] init];

[apiInstance encounterConditionValueReadWithId:_id
          completionHandler: ^(NSString* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIEncounterConditionValueApi->encounterConditionValueRead: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***|  | 

### Return type

**NSString***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

