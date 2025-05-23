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
 * GenderApi.h
 *
 * 
 */

#ifndef GenderApi_H_
#define GenderApi_H_


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
class  GenderApiException: public std::exception
{
public:
    GenderApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

namespace GenderApiResources {
/// <summary>
/// 
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  ApiV2GenderResource: public restbed::Resource
{
public:
    ApiV2GenderResource(const std::string& context = "");
    virtual ~ApiV2GenderResource() = default;

    ApiV2GenderResource(
        const ApiV2GenderResource& other) = default; // copy constructor
    ApiV2GenderResource(ApiV2GenderResource&& other) noexcept = default; // move constructor

    ApiV2GenderResource& operator=(const ApiV2GenderResource& other) = default; // copy assignment
    ApiV2GenderResource& operator=(ApiV2GenderResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, std::string>(
        int32_t & limit, int32_t & offset)> handler_GET_func =
            [](int32_t &, int32_t &) -> std::pair<int, std::string>
                { throw GenderApiException(501, "Not implemented"); };


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

    virtual std::pair<int, std::string> handleGenderApiException(const GenderApiException& e);
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
class  ApiV2GenderIdResource: public restbed::Resource
{
public:
    ApiV2GenderIdResource(const std::string& context = "");
    virtual ~ApiV2GenderIdResource() = default;

    ApiV2GenderIdResource(
        const ApiV2GenderIdResource& other) = default; // copy constructor
    ApiV2GenderIdResource(ApiV2GenderIdResource&& other) noexcept = default; // move constructor

    ApiV2GenderIdResource& operator=(const ApiV2GenderIdResource& other) = default; // copy assignment
    ApiV2GenderIdResource& operator=(ApiV2GenderIdResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, std::string>(
        int32_t & id)> handler_GET_func =
            [](int32_t &) -> std::pair<int, std::string>
                { throw GenderApiException(501, "Not implemented"); };


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

    virtual std::pair<int, std::string> handleGenderApiException(const GenderApiException& e);
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

} /* namespace GenderApiResources */

using GenderApiApiV2GenderResource [[deprecated]] = GenderApiResources::ApiV2GenderResource;
using GenderApiApiV2GenderIdResource [[deprecated]] = GenderApiResources::ApiV2GenderIdResource;

//
// The restbed service to actually implement the REST server
//
class  GenderApi
{
public:
    explicit GenderApi(std::shared_ptr<restbed::Service> const& restbedService);
    virtual ~GenderApi();

    std::shared_ptr<GenderApiResources::ApiV2GenderResource> getApiV2GenderResource();
    std::shared_ptr<GenderApiResources::ApiV2GenderIdResource> getApiV2GenderIdResource();

    void setResource(std::shared_ptr<GenderApiResources::ApiV2GenderResource> resource);
    void setResource(std::shared_ptr<GenderApiResources::ApiV2GenderIdResource> resource);
    [[deprecated("use setResource()")]]
    virtual void setGenderApiApiV2GenderResource(std::shared_ptr<GenderApiResources::ApiV2GenderResource> spGenderApiApiV2GenderResource);
    [[deprecated("use setResource()")]]
    virtual void setGenderApiApiV2GenderIdResource(std::shared_ptr<GenderApiResources::ApiV2GenderIdResource> spGenderApiApiV2GenderIdResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
    std::shared_ptr<GenderApiResources::ApiV2GenderResource> m_spApiV2GenderResource;
    std::shared_ptr<GenderApiResources::ApiV2GenderIdResource> m_spApiV2GenderIdResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* GenderApi_H_ */

