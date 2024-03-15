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
 * LocationApi.h
 *
 *
 */

#ifndef LocationApi_H_
#define LocationApi_H_


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
class  LocationApiException: public std::exception
{
public:
    LocationApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

namespace LocationApiResources {
/// <summary>
///
/// </summary>
/// <remarks>
///
/// </remarks>
class  ApiV2LocationResource: public restbed::Resource
{
public:
    ApiV2LocationResource(const std::string& context = "");
    virtual ~ApiV2LocationResource() = default;

    ApiV2LocationResource(
        const ApiV2LocationResource& other) = default; // copy constructor
    ApiV2LocationResource(ApiV2LocationResource&& other) noexcept = default; // move constructor

    ApiV2LocationResource& operator=(const ApiV2LocationResource& other) = default; // copy assignment
    ApiV2LocationResource& operator=(ApiV2LocationResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, std::string>(
        int32_t & limit, int32_t & offset)> handler_GET_func =
            [](int32_t &, int32_t &) -> std::pair<int, std::string>
                { throw LocationApiException(501, "Not implemented"); };


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

    virtual std::pair<int, std::string> handleLocationApiException(const LocationApiException& e);
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
class  ApiV2LocationIdResource: public restbed::Resource
{
public:
    ApiV2LocationIdResource(const std::string& context = "");
    virtual ~ApiV2LocationIdResource() = default;

    ApiV2LocationIdResource(
        const ApiV2LocationIdResource& other) = default; // copy constructor
    ApiV2LocationIdResource(ApiV2LocationIdResource&& other) noexcept = default; // move constructor

    ApiV2LocationIdResource& operator=(const ApiV2LocationIdResource& other) = default; // copy assignment
    ApiV2LocationIdResource& operator=(ApiV2LocationIdResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, std::string>(
        int32_t & id)> handler_GET_func =
            [](int32_t &) -> std::pair<int, std::string>
                { throw LocationApiException(501, "Not implemented"); };


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

    virtual std::pair<int, std::string> handleLocationApiException(const LocationApiException& e);
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

} /* namespace LocationApiResources */

using LocationApiApiV2LocationResource [[deprecated]] = LocationApiResources::ApiV2LocationResource;
using LocationApiApiV2LocationIdResource [[deprecated]] = LocationApiResources::ApiV2LocationIdResource;

//
// The restbed service to actually implement the REST server
//
class  LocationApi
{
public:
    explicit LocationApi(std::shared_ptr<restbed::Service> const& restbedService);
    virtual ~LocationApi();

    std::shared_ptr<LocationApiResources::ApiV2LocationResource> getApiV2LocationResource();
    std::shared_ptr<LocationApiResources::ApiV2LocationIdResource> getApiV2LocationIdResource();

    void setResource(std::shared_ptr<LocationApiResources::ApiV2LocationResource> resource);
    void setResource(std::shared_ptr<LocationApiResources::ApiV2LocationIdResource> resource);
    [[deprecated("use setResource()")]]
    virtual void setLocationApiApiV2LocationResource(std::shared_ptr<LocationApiResources::ApiV2LocationResource> spLocationApiApiV2LocationResource);
    [[deprecated("use setResource()")]]
    virtual void setLocationApiApiV2LocationIdResource(std::shared_ptr<LocationApiResources::ApiV2LocationIdResource> spLocationApiApiV2LocationIdResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
    std::shared_ptr<LocationApiResources::ApiV2LocationResource> m_spApiV2LocationResource;
    std::shared_ptr<LocationApiResources::ApiV2LocationIdResource> m_spApiV2LocationIdResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* LocationApi_H_ */

