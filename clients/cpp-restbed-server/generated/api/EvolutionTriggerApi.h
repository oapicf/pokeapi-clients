/**
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 20220523
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.2.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * EvolutionTriggerApi.h
 *
 *
 */

#ifndef EvolutionTriggerApi_H_
#define EvolutionTriggerApi_H_


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
class  EvolutionTriggerApiException: public std::exception
{
public:
    EvolutionTriggerApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

namespace EvolutionTriggerApiResources {
/// <summary>
///
/// </summary>
/// <remarks>
///
/// </remarks>
class  ApiV2Evolution_triggerResource: public restbed::Resource
{
public:
    ApiV2Evolution_triggerResource(const std::string& context = "");
    virtual ~ApiV2Evolution_triggerResource() = default;

    ApiV2Evolution_triggerResource(
        const ApiV2Evolution_triggerResource& other) = default; // copy constructor
    ApiV2Evolution_triggerResource(ApiV2Evolution_triggerResource&& other) noexcept = default; // move constructor

    ApiV2Evolution_triggerResource& operator=(const ApiV2Evolution_triggerResource& other) = default; // copy assignment
    ApiV2Evolution_triggerResource& operator=(ApiV2Evolution_triggerResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, std::string>(
        int32_t & limit, int32_t & offset)> handler_GET_func =
            [](int32_t &, int32_t &) -> std::pair<int, std::string>
                { throw EvolutionTriggerApiException(501, "Not implemented"); };


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

    virtual std::pair<int, std::string> handleEvolutionTriggerApiException(const EvolutionTriggerApiException& e);
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
class  ApiV2Evolution_triggerIdResource: public restbed::Resource
{
public:
    ApiV2Evolution_triggerIdResource(const std::string& context = "");
    virtual ~ApiV2Evolution_triggerIdResource() = default;

    ApiV2Evolution_triggerIdResource(
        const ApiV2Evolution_triggerIdResource& other) = default; // copy constructor
    ApiV2Evolution_triggerIdResource(ApiV2Evolution_triggerIdResource&& other) noexcept = default; // move constructor

    ApiV2Evolution_triggerIdResource& operator=(const ApiV2Evolution_triggerIdResource& other) = default; // copy assignment
    ApiV2Evolution_triggerIdResource& operator=(ApiV2Evolution_triggerIdResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, std::string>(
        int32_t & id)> handler_GET_func =
            [](int32_t &) -> std::pair<int, std::string>
                { throw EvolutionTriggerApiException(501, "Not implemented"); };


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

    virtual std::pair<int, std::string> handleEvolutionTriggerApiException(const EvolutionTriggerApiException& e);
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

} /* namespace EvolutionTriggerApiResources */

using EvolutionTriggerApiApiV2Evolution_triggerResource [[deprecated]] = EvolutionTriggerApiResources::ApiV2Evolution_triggerResource;
using EvolutionTriggerApiApiV2Evolution_triggerIdResource [[deprecated]] = EvolutionTriggerApiResources::ApiV2Evolution_triggerIdResource;

//
// The restbed service to actually implement the REST server
//
class  EvolutionTriggerApi
{
public:
    explicit EvolutionTriggerApi(std::shared_ptr<restbed::Service> const& restbedService);
    virtual ~EvolutionTriggerApi();

    std::shared_ptr<EvolutionTriggerApiResources::ApiV2Evolution_triggerResource> getApiV2Evolution_triggerResource();
    std::shared_ptr<EvolutionTriggerApiResources::ApiV2Evolution_triggerIdResource> getApiV2Evolution_triggerIdResource();

    void setResource(std::shared_ptr<EvolutionTriggerApiResources::ApiV2Evolution_triggerResource> resource);
    void setResource(std::shared_ptr<EvolutionTriggerApiResources::ApiV2Evolution_triggerIdResource> resource);
    [[deprecated("use setResource()")]]
    virtual void setEvolutionTriggerApiApiV2Evolution_triggerResource(std::shared_ptr<EvolutionTriggerApiResources::ApiV2Evolution_triggerResource> spEvolutionTriggerApiApiV2Evolution_triggerResource);
    [[deprecated("use setResource()")]]
    virtual void setEvolutionTriggerApiApiV2Evolution_triggerIdResource(std::shared_ptr<EvolutionTriggerApiResources::ApiV2Evolution_triggerIdResource> spEvolutionTriggerApiApiV2Evolution_triggerIdResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
    std::shared_ptr<EvolutionTriggerApiResources::ApiV2Evolution_triggerResource> m_spApiV2Evolution_triggerResource;
    std::shared_ptr<EvolutionTriggerApiResources::ApiV2Evolution_triggerIdResource> m_spApiV2Evolution_triggerIdResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* EvolutionTriggerApi_H_ */

