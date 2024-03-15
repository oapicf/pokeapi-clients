/**
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 20220523
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "OpenAPIBaseModel.h"
#include "OpenAPIEncounterConditionValueApi.h"


namespace OpenAPI
{

/*

*/
class OPENAPI_API OpenAPIEncounterConditionValueApi::EncounterConditionValueListRequest : public Request
{
public:
    virtual ~EncounterConditionValueListRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	TOptional<int32> Limit;
	TOptional<int32> Offset;
};

class OPENAPI_API OpenAPIEncounterConditionValueApi::EncounterConditionValueListResponse : public Response
{
public:
    virtual ~EncounterConditionValueListResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    FString Content;
};

/*

*/
class OPENAPI_API OpenAPIEncounterConditionValueApi::EncounterConditionValueReadRequest : public Request
{
public:
    virtual ~EncounterConditionValueReadRequest() {}
	void SetupHttpRequest(const FHttpRequestRef& HttpRequest) const final;
	FString ComputePath() const final;

	int32 Id = 0;
};

class OPENAPI_API OpenAPIEncounterConditionValueApi::EncounterConditionValueReadResponse : public Response
{
public:
    virtual ~EncounterConditionValueReadResponse() {}
	void SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode) final;
	bool FromJson(const TSharedPtr<FJsonValue>& JsonValue) final;

    FString Content;
};

}
