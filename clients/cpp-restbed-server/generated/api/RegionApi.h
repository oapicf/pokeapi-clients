/**
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 20220523
 * Contact: blah@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 6.2.1.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * RegionApi.h
 *
 * 
 */

#ifndef RegionApi_H_
#define RegionApi_H_


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
class  RegionApiException: public std::exception
{
public:
    RegionApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

namespace RegionApiResources {
/// <summary>
/// 
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  ApiV2RegionResource: public restbed::Resource
{
public:
    ApiV2RegionResource(const std::string& context = "");
    virtual ~ApiV2RegionResource() = default;

    ApiV2RegionResource(
        const ApiV2RegionResource& other) = default; // copy constructor
    ApiV2RegionResource(ApiV2RegionResource&& other) noexcept = default; // move constructor

    ApiV2RegionResource& operator=(const ApiV2RegionResource& other) = default; // copy assignment
    ApiV2RegionResource& operator=(ApiV2RegionResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, std::string>(
        int32_t & limit, int32_t & offset)> handler_GET_func =
            [](int32_t &, int32_t &) -> std::pair<int, std::string>
                { throw RegionApiException(501, "Not implemented"); };


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

    virtual std::pair<int, std::string> handleRegionApiException(const RegionApiException& e);
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
class  ApiV2RegionIdResource: public restbed::Resource
{
public:
    ApiV2RegionIdResource(const std::string& context = "");
    virtual ~ApiV2RegionIdResource() = default;

    ApiV2RegionIdResource(
        const ApiV2RegionIdResource& other) = default; // copy constructor
    ApiV2RegionIdResource(ApiV2RegionIdResource&& other) noexcept = default; // move constructor

    ApiV2RegionIdResource& operator=(const ApiV2RegionIdResource& other) = default; // copy assignment
    ApiV2RegionIdResource& operator=(ApiV2RegionIdResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, std::string>(
        int32_t & id)> handler_GET_func =
            [](int32_t &) -> std::pair<int, std::string>
                { throw RegionApiException(501, "Not implemented"); };


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

    virtual std::pair<int, std::string> handleRegionApiException(const RegionApiException& e);
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

} /* namespace RegionApiResources */

using RegionApiApiV2RegionResource [[deprecated]] = RegionApiResources::ApiV2RegionResource;
using RegionApiApiV2RegionIdResource [[deprecated]] = RegionApiResources::ApiV2RegionIdResource;

//
// The restbed service to actually implement the REST server
//
class  RegionApi
{
public:
    explicit RegionApi(std::shared_ptr<restbed::Service> const& restbedService);
	virtual ~RegionApi();

    std::shared_ptr<RegionApiResources::ApiV2RegionResource> getApiV2RegionResource();
    std::shared_ptr<RegionApiResources::ApiV2RegionIdResource> getApiV2RegionIdResource();

    void setResource(std::shared_ptr<RegionApiResources::ApiV2RegionResource> resource);
    void setResource(std::shared_ptr<RegionApiResources::ApiV2RegionIdResource> resource);
    [[deprecated("use setResource()")]]
    virtual void setRegionApiApiV2RegionResource(std::shared_ptr<RegionApiResources::ApiV2RegionResource> spRegionApiApiV2RegionResource);
    [[deprecated("use setResource()")]]
    virtual void setRegionApiApiV2RegionIdResource(std::shared_ptr<RegionApiResources::ApiV2RegionIdResource> spRegionApiApiV2RegionIdResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
	std::shared_ptr<RegionApiResources::ApiV2RegionResource> m_spApiV2RegionResource;
	std::shared_ptr<RegionApiResources::ApiV2RegionIdResource> m_spApiV2RegionIdResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* RegionApi_H_ */
