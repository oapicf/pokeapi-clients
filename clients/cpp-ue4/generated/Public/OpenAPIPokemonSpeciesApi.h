/**
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 20220523
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "CoreMinimal.h"
#include "OpenAPIBaseModel.h"

namespace OpenAPI
{

class OPENAPI_API OpenAPIPokemonSpeciesApi
{
public:
	OpenAPIPokemonSpeciesApi();
	~OpenAPIPokemonSpeciesApi();

	/* Sets the URL Endpoint.
	* Note: several fallback endpoints can be configured in request retry policies, see Request::SetShouldRetry */
	void SetURL(const FString& Url);

	/* Adds global header params to all requests */
	void AddHeaderParam(const FString& Key, const FString& Value);
	void ClearHeaderParams();

	/* Sets the retry manager to the user-defined retry manager. User must manage the lifetime of the retry manager.
	* If no retry manager is specified and a request needs retries, a default retry manager will be used.
	* See also: Request::SetShouldRetry */
	void SetHttpRetryManager(FHttpRetrySystem::FManager& RetryManager);
	FHttpRetrySystem::FManager& GetHttpRetryManager();

	class PokemonSpeciesListRequest;
	class PokemonSpeciesListResponse;
	class PokemonSpeciesReadRequest;
	class PokemonSpeciesReadResponse;
	
    DECLARE_DELEGATE_OneParam(FPokemonSpeciesListDelegate, const PokemonSpeciesListResponse&);
    DECLARE_DELEGATE_OneParam(FPokemonSpeciesReadDelegate, const PokemonSpeciesReadResponse&);
    
    FHttpRequestPtr PokemonSpeciesList(const PokemonSpeciesListRequest& Request, const FPokemonSpeciesListDelegate& Delegate = FPokemonSpeciesListDelegate()) const;
    FHttpRequestPtr PokemonSpeciesRead(const PokemonSpeciesReadRequest& Request, const FPokemonSpeciesReadDelegate& Delegate = FPokemonSpeciesReadDelegate()) const;
    
private:
    void OnPokemonSpeciesListResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FPokemonSpeciesListDelegate Delegate) const;
    void OnPokemonSpeciesReadResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FPokemonSpeciesReadDelegate Delegate) const;
    
	FHttpRequestRef CreateHttpRequest(const Request& Request) const;
	bool IsValid() const;
	void HandleResponse(FHttpResponsePtr HttpResponse, bool bSucceeded, Response& InOutResponse) const;

	FString Url;
	TMap<FString,FString> AdditionalHeaderParams;
	mutable FHttpRetrySystem::FManager* RetryManager = nullptr;
	mutable TUniquePtr<HttpRetryManager> DefaultRetryManager;
};

}