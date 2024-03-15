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
 * ContestEffectApi.h
 *
 *
 */

#ifndef ContestEffectApi_H_
#define ContestEffectApi_H_


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
class  ContestEffectApiException: public std::exception
{
public:
    ContestEffectApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

namespace ContestEffectApiResources {
/// <summary>
///
/// </summary>
/// <remarks>
///
/// </remarks>
class  ApiV2Contest_effectResource: public restbed::Resource
{
public:
    ApiV2Contest_effectResource(const std::string& context = "");
    virtual ~ApiV2Contest_effectResource() = default;

    ApiV2Contest_effectResource(
        const ApiV2Contest_effectResource& other) = default; // copy constructor
    ApiV2Contest_effectResource(ApiV2Contest_effectResource&& other) noexcept = default; // move constructor

    ApiV2Contest_effectResource& operator=(const ApiV2Contest_effectResource& other) = default; // copy assignment
    ApiV2Contest_effectResource& operator=(ApiV2Contest_effectResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, std::string>(
        int32_t & limit, int32_t & offset)> handler_GET_func =
            [](int32_t &, int32_t &) -> std::pair<int, std::string>
                { throw ContestEffectApiException(501, "Not implemented"); };


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

    virtual std::pair<int, std::string> handleContestEffectApiException(const ContestEffectApiException& e);
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
class  ApiV2Contest_effectIdResource: public restbed::Resource
{
public:
    ApiV2Contest_effectIdResource(const std::string& context = "");
    virtual ~ApiV2Contest_effectIdResource() = default;

    ApiV2Contest_effectIdResource(
        const ApiV2Contest_effectIdResource& other) = default; // copy constructor
    ApiV2Contest_effectIdResource(ApiV2Contest_effectIdResource&& other) noexcept = default; // move constructor

    ApiV2Contest_effectIdResource& operator=(const ApiV2Contest_effectIdResource& other) = default; // copy assignment
    ApiV2Contest_effectIdResource& operator=(ApiV2Contest_effectIdResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, std::string>(
        int32_t & id)> handler_GET_func =
            [](int32_t &) -> std::pair<int, std::string>
                { throw ContestEffectApiException(501, "Not implemented"); };


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

    virtual std::pair<int, std::string> handleContestEffectApiException(const ContestEffectApiException& e);
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

} /* namespace ContestEffectApiResources */

using ContestEffectApiApiV2Contest_effectResource [[deprecated]] = ContestEffectApiResources::ApiV2Contest_effectResource;
using ContestEffectApiApiV2Contest_effectIdResource [[deprecated]] = ContestEffectApiResources::ApiV2Contest_effectIdResource;

//
// The restbed service to actually implement the REST server
//
class  ContestEffectApi
{
public:
    explicit ContestEffectApi(std::shared_ptr<restbed::Service> const& restbedService);
    virtual ~ContestEffectApi();

    std::shared_ptr<ContestEffectApiResources::ApiV2Contest_effectResource> getApiV2Contest_effectResource();
    std::shared_ptr<ContestEffectApiResources::ApiV2Contest_effectIdResource> getApiV2Contest_effectIdResource();

    void setResource(std::shared_ptr<ContestEffectApiResources::ApiV2Contest_effectResource> resource);
    void setResource(std::shared_ptr<ContestEffectApiResources::ApiV2Contest_effectIdResource> resource);
    [[deprecated("use setResource()")]]
    virtual void setContestEffectApiApiV2Contest_effectResource(std::shared_ptr<ContestEffectApiResources::ApiV2Contest_effectResource> spContestEffectApiApiV2Contest_effectResource);
    [[deprecated("use setResource()")]]
    virtual void setContestEffectApiApiV2Contest_effectIdResource(std::shared_ptr<ContestEffectApiResources::ApiV2Contest_effectIdResource> spContestEffectApiApiV2Contest_effectIdResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
    std::shared_ptr<ContestEffectApiResources::ApiV2Contest_effectResource> m_spApiV2Contest_effectResource;
    std::shared_ptr<ContestEffectApiResources::ApiV2Contest_effectIdResource> m_spApiV2Contest_effectIdResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* ContestEffectApi_H_ */

