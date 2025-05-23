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
 * EncounterConditionValueApi.h
 *
 * 
 */

#ifndef EncounterConditionValueApi_H_
#define EncounterConditionValueApi_H_


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
class  EncounterConditionValueApiException: public std::exception
{
public:
    EncounterConditionValueApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

namespace EncounterConditionValueApiResources {
/// <summary>
/// 
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  ApiV2Encounter_condition_valueResource: public restbed::Resource
{
public:
    ApiV2Encounter_condition_valueResource(const std::string& context = "");
    virtual ~ApiV2Encounter_condition_valueResource() = default;

    ApiV2Encounter_condition_valueResource(
        const ApiV2Encounter_condition_valueResource& other) = default; // copy constructor
    ApiV2Encounter_condition_valueResource(ApiV2Encounter_condition_valueResource&& other) noexcept = default; // move constructor

    ApiV2Encounter_condition_valueResource& operator=(const ApiV2Encounter_condition_valueResource& other) = default; // copy assignment
    ApiV2Encounter_condition_valueResource& operator=(ApiV2Encounter_condition_valueResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, std::string>(
        int32_t & limit, int32_t & offset)> handler_GET_func =
            [](int32_t &, int32_t &) -> std::pair<int, std::string>
                { throw EncounterConditionValueApiException(501, "Not implemented"); };


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

    virtual std::pair<int, std::string> handleEncounterConditionValueApiException(const EncounterConditionValueApiException& e);
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
class  ApiV2Encounter_condition_valueIdResource: public restbed::Resource
{
public:
    ApiV2Encounter_condition_valueIdResource(const std::string& context = "");
    virtual ~ApiV2Encounter_condition_valueIdResource() = default;

    ApiV2Encounter_condition_valueIdResource(
        const ApiV2Encounter_condition_valueIdResource& other) = default; // copy constructor
    ApiV2Encounter_condition_valueIdResource(ApiV2Encounter_condition_valueIdResource&& other) noexcept = default; // move constructor

    ApiV2Encounter_condition_valueIdResource& operator=(const ApiV2Encounter_condition_valueIdResource& other) = default; // copy assignment
    ApiV2Encounter_condition_valueIdResource& operator=(ApiV2Encounter_condition_valueIdResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, std::string>(
        int32_t & id)> handler_GET_func =
            [](int32_t &) -> std::pair<int, std::string>
                { throw EncounterConditionValueApiException(501, "Not implemented"); };


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

    virtual std::pair<int, std::string> handleEncounterConditionValueApiException(const EncounterConditionValueApiException& e);
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

} /* namespace EncounterConditionValueApiResources */

using EncounterConditionValueApiApiV2Encounter_condition_valueResource [[deprecated]] = EncounterConditionValueApiResources::ApiV2Encounter_condition_valueResource;
using EncounterConditionValueApiApiV2Encounter_condition_valueIdResource [[deprecated]] = EncounterConditionValueApiResources::ApiV2Encounter_condition_valueIdResource;

//
// The restbed service to actually implement the REST server
//
class  EncounterConditionValueApi
{
public:
    explicit EncounterConditionValueApi(std::shared_ptr<restbed::Service> const& restbedService);
    virtual ~EncounterConditionValueApi();

    std::shared_ptr<EncounterConditionValueApiResources::ApiV2Encounter_condition_valueResource> getApiV2Encounter_condition_valueResource();
    std::shared_ptr<EncounterConditionValueApiResources::ApiV2Encounter_condition_valueIdResource> getApiV2Encounter_condition_valueIdResource();

    void setResource(std::shared_ptr<EncounterConditionValueApiResources::ApiV2Encounter_condition_valueResource> resource);
    void setResource(std::shared_ptr<EncounterConditionValueApiResources::ApiV2Encounter_condition_valueIdResource> resource);
    [[deprecated("use setResource()")]]
    virtual void setEncounterConditionValueApiApiV2Encounter_condition_valueResource(std::shared_ptr<EncounterConditionValueApiResources::ApiV2Encounter_condition_valueResource> spEncounterConditionValueApiApiV2Encounter_condition_valueResource);
    [[deprecated("use setResource()")]]
    virtual void setEncounterConditionValueApiApiV2Encounter_condition_valueIdResource(std::shared_ptr<EncounterConditionValueApiResources::ApiV2Encounter_condition_valueIdResource> spEncounterConditionValueApiApiV2Encounter_condition_valueIdResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
    std::shared_ptr<EncounterConditionValueApiResources::ApiV2Encounter_condition_valueResource> m_spApiV2Encounter_condition_valueResource;
    std::shared_ptr<EncounterConditionValueApiResources::ApiV2Encounter_condition_valueIdResource> m_spApiV2Encounter_condition_valueIdResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* EncounterConditionValueApi_H_ */

