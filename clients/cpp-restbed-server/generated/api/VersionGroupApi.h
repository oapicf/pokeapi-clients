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
 * VersionGroupApi.h
 *
 *
 */

#ifndef VersionGroupApi_H_
#define VersionGroupApi_H_


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
class  VersionGroupApiException: public std::exception
{
public:
    VersionGroupApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

namespace VersionGroupApiResources {
/// <summary>
///
/// </summary>
/// <remarks>
///
/// </remarks>
class  ApiV2Version_groupResource: public restbed::Resource
{
public:
    ApiV2Version_groupResource(const std::string& context = "");
    virtual ~ApiV2Version_groupResource() = default;

    ApiV2Version_groupResource(
        const ApiV2Version_groupResource& other) = default; // copy constructor
    ApiV2Version_groupResource(ApiV2Version_groupResource&& other) noexcept = default; // move constructor

    ApiV2Version_groupResource& operator=(const ApiV2Version_groupResource& other) = default; // copy assignment
    ApiV2Version_groupResource& operator=(ApiV2Version_groupResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, std::string>(
        int32_t & limit, int32_t & offset)> handler_GET_func =
            [](int32_t &, int32_t &) -> std::pair<int, std::string>
                { throw VersionGroupApiException(501, "Not implemented"); };


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

    virtual std::pair<int, std::string> handleVersionGroupApiException(const VersionGroupApiException& e);
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
class  ApiV2Version_groupIdResource: public restbed::Resource
{
public:
    ApiV2Version_groupIdResource(const std::string& context = "");
    virtual ~ApiV2Version_groupIdResource() = default;

    ApiV2Version_groupIdResource(
        const ApiV2Version_groupIdResource& other) = default; // copy constructor
    ApiV2Version_groupIdResource(ApiV2Version_groupIdResource&& other) noexcept = default; // move constructor

    ApiV2Version_groupIdResource& operator=(const ApiV2Version_groupIdResource& other) = default; // copy assignment
    ApiV2Version_groupIdResource& operator=(ApiV2Version_groupIdResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, std::string>(
        int32_t & id)> handler_GET_func =
            [](int32_t &) -> std::pair<int, std::string>
                { throw VersionGroupApiException(501, "Not implemented"); };


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

    virtual std::pair<int, std::string> handleVersionGroupApiException(const VersionGroupApiException& e);
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

} /* namespace VersionGroupApiResources */

using VersionGroupApiApiV2Version_groupResource [[deprecated]] = VersionGroupApiResources::ApiV2Version_groupResource;
using VersionGroupApiApiV2Version_groupIdResource [[deprecated]] = VersionGroupApiResources::ApiV2Version_groupIdResource;

//
// The restbed service to actually implement the REST server
//
class  VersionGroupApi
{
public:
    explicit VersionGroupApi(std::shared_ptr<restbed::Service> const& restbedService);
    virtual ~VersionGroupApi();

    std::shared_ptr<VersionGroupApiResources::ApiV2Version_groupResource> getApiV2Version_groupResource();
    std::shared_ptr<VersionGroupApiResources::ApiV2Version_groupIdResource> getApiV2Version_groupIdResource();

    void setResource(std::shared_ptr<VersionGroupApiResources::ApiV2Version_groupResource> resource);
    void setResource(std::shared_ptr<VersionGroupApiResources::ApiV2Version_groupIdResource> resource);
    [[deprecated("use setResource()")]]
    virtual void setVersionGroupApiApiV2Version_groupResource(std::shared_ptr<VersionGroupApiResources::ApiV2Version_groupResource> spVersionGroupApiApiV2Version_groupResource);
    [[deprecated("use setResource()")]]
    virtual void setVersionGroupApiApiV2Version_groupIdResource(std::shared_ptr<VersionGroupApiResources::ApiV2Version_groupIdResource> spVersionGroupApiApiV2Version_groupIdResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
    std::shared_ptr<VersionGroupApiResources::ApiV2Version_groupResource> m_spApiV2Version_groupResource;
    std::shared_ptr<VersionGroupApiResources::ApiV2Version_groupIdResource> m_spApiV2Version_groupIdResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* VersionGroupApi_H_ */

