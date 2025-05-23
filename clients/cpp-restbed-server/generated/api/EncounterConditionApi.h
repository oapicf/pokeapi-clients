/**
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 20220523
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.12.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * EncounterConditionApi.h
 *
 * 
 */

#ifndef EncounterConditionApi_H_
#define EncounterConditionApi_H_


#include <memory>
#include <utility>
#include <exception>
#include <functional>

#include <corvusoft/restbed/session.hpp>
#include <corvusoft/restbed/resource.hpp>
#include <corvusoft/restbed/request.hpp>
#include <corvusoft/restbed/service.hpp>
#include <corvusoft/restbed/settings.hpp>

#include <string>

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

///
/// Exception to flag problems in the handlers
///
class  EncounterConditionApiException: public std::exception
{
public:
    EncounterConditionApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

namespace EncounterConditionApiResources {
/// <summary>
/// 
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  ApiV2Encounter_conditionResource: public restbed::Resource
{
public:
    ApiV2Encounter_conditionResource(const std::string& context = "");
    virtual ~ApiV2Encounter_conditionResource() = default;

    ApiV2Encounter_conditionResource(
        const ApiV2Encounter_conditionResource& other) = default; // copy constructor
    ApiV2Encounter_conditionResource(ApiV2Encounter_conditionResource&& other) noexcept = default; // move constructor

    ApiV2Encounter_conditionResource& operator=(const ApiV2Encounter_conditionResource& other) = default; // copy assignment
    ApiV2Encounter_conditionResource& operator=(ApiV2Encounter_conditionResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, std::string>(
        int32_t & limit, int32_t & offset)> handler_GET_func =
            [](int32_t &, int32_t &) -> std::pair<int, std::string>
                { throw EncounterConditionApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, std::string> handler_GET(
        int32_t & limit, int32_t & offset);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleEncounterConditionApiException(const EncounterConditionApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);

    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, std::multimap<std::string, std::string>& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_GET_internal(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// 
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  ApiV2Encounter_conditionIdResource: public restbed::Resource
{
public:
    ApiV2Encounter_conditionIdResource(const std::string& context = "");
    virtual ~ApiV2Encounter_conditionIdResource() = default;

    ApiV2Encounter_conditionIdResource(
        const ApiV2Encounter_conditionIdResource& other) = default; // copy constructor
    ApiV2Encounter_conditionIdResource(ApiV2Encounter_conditionIdResource&& other) noexcept = default; // move constructor

    ApiV2Encounter_conditionIdResource& operator=(const ApiV2Encounter_conditionIdResource& other) = default; // copy assignment
    ApiV2Encounter_conditionIdResource& operator=(ApiV2Encounter_conditionIdResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, std::string>(
        int32_t & id)> handler_GET_func =
            [](int32_t &) -> std::pair<int, std::string>
                { throw EncounterConditionApiException(501, "Not implemented"); };


protected:
    //////////////////////////////////////////////////////////
    // As an alternative to setting the `std::function`s    //
    // override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, std::string> handler_GET(
        int32_t & id);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);
    virtual std::string extractFormParamsFromBody(const std::string& paramName, const std::string& body);

    virtual std::pair<int, std::string> handleEncounterConditionApiException(const EncounterConditionApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);

    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, std::multimap<std::string, std::string>& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_GET_internal(const std::shared_ptr<restbed::Session> session);
};

} /* namespace EncounterConditionApiResources */

using EncounterConditionApiApiV2Encounter_conditionResource [[deprecated]] = EncounterConditionApiResources::ApiV2Encounter_conditionResource;
using EncounterConditionApiApiV2Encounter_conditionIdResource [[deprecated]] = EncounterConditionApiResources::ApiV2Encounter_conditionIdResource;

//
// The restbed service to actually implement the REST server
//
class  EncounterConditionApi
{
public:
    explicit EncounterConditionApi(std::shared_ptr<restbed::Service> const& restbedService);
    virtual ~EncounterConditionApi();

    std::shared_ptr<EncounterConditionApiResources::ApiV2Encounter_conditionResource> getApiV2Encounter_conditionResource();
    std::shared_ptr<EncounterConditionApiResources::ApiV2Encounter_conditionIdResource> getApiV2Encounter_conditionIdResource();

    void setResource(std::shared_ptr<EncounterConditionApiResources::ApiV2Encounter_conditionResource> resource);
    void setResource(std::shared_ptr<EncounterConditionApiResources::ApiV2Encounter_conditionIdResource> resource);
    [[deprecated("use setResource()")]]
    virtual void setEncounterConditionApiApiV2Encounter_conditionResource(std::shared_ptr<EncounterConditionApiResources::ApiV2Encounter_conditionResource> spEncounterConditionApiApiV2Encounter_conditionResource);
    [[deprecated("use setResource()")]]
    virtual void setEncounterConditionApiApiV2Encounter_conditionIdResource(std::shared_ptr<EncounterConditionApiResources::ApiV2Encounter_conditionIdResource> spEncounterConditionApiApiV2Encounter_conditionIdResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
    std::shared_ptr<EncounterConditionApiResources::ApiV2Encounter_conditionResource> m_spApiV2Encounter_conditionResource;
    std::shared_ptr<EncounterConditionApiResources::ApiV2Encounter_conditionIdResource> m_spApiV2Encounter_conditionIdResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* EncounterConditionApi_H_ */

