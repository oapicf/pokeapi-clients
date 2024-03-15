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
 * PokeathlonStatApi.h
 *
 *
 */

#ifndef PokeathlonStatApi_H_
#define PokeathlonStatApi_H_


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
class  PokeathlonStatApiException: public std::exception
{
public:
    PokeathlonStatApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

namespace PokeathlonStatApiResources {
/// <summary>
///
/// </summary>
/// <remarks>
///
/// </remarks>
class  ApiV2Pokeathlon_statResource: public restbed::Resource
{
public:
    ApiV2Pokeathlon_statResource(const std::string& context = "");
    virtual ~ApiV2Pokeathlon_statResource() = default;

    ApiV2Pokeathlon_statResource(
        const ApiV2Pokeathlon_statResource& other) = default; // copy constructor
    ApiV2Pokeathlon_statResource(ApiV2Pokeathlon_statResource&& other) noexcept = default; // move constructor

    ApiV2Pokeathlon_statResource& operator=(const ApiV2Pokeathlon_statResource& other) = default; // copy assignment
    ApiV2Pokeathlon_statResource& operator=(ApiV2Pokeathlon_statResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, std::string>(
        int32_t & limit, int32_t & offset)> handler_GET_func =
            [](int32_t &, int32_t &) -> std::pair<int, std::string>
                { throw PokeathlonStatApiException(501, "Not implemented"); };


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

    virtual std::pair<int, std::string> handlePokeathlonStatApiException(const PokeathlonStatApiException& e);
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
class  ApiV2Pokeathlon_statIdResource: public restbed::Resource
{
public:
    ApiV2Pokeathlon_statIdResource(const std::string& context = "");
    virtual ~ApiV2Pokeathlon_statIdResource() = default;

    ApiV2Pokeathlon_statIdResource(
        const ApiV2Pokeathlon_statIdResource& other) = default; // copy constructor
    ApiV2Pokeathlon_statIdResource(ApiV2Pokeathlon_statIdResource&& other) noexcept = default; // move constructor

    ApiV2Pokeathlon_statIdResource& operator=(const ApiV2Pokeathlon_statIdResource& other) = default; // copy assignment
    ApiV2Pokeathlon_statIdResource& operator=(ApiV2Pokeathlon_statIdResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, std::string>(
        int32_t & id)> handler_GET_func =
            [](int32_t &) -> std::pair<int, std::string>
                { throw PokeathlonStatApiException(501, "Not implemented"); };


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

    virtual std::pair<int, std::string> handlePokeathlonStatApiException(const PokeathlonStatApiException& e);
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

} /* namespace PokeathlonStatApiResources */

using PokeathlonStatApiApiV2Pokeathlon_statResource [[deprecated]] = PokeathlonStatApiResources::ApiV2Pokeathlon_statResource;
using PokeathlonStatApiApiV2Pokeathlon_statIdResource [[deprecated]] = PokeathlonStatApiResources::ApiV2Pokeathlon_statIdResource;

//
// The restbed service to actually implement the REST server
//
class  PokeathlonStatApi
{
public:
    explicit PokeathlonStatApi(std::shared_ptr<restbed::Service> const& restbedService);
    virtual ~PokeathlonStatApi();

    std::shared_ptr<PokeathlonStatApiResources::ApiV2Pokeathlon_statResource> getApiV2Pokeathlon_statResource();
    std::shared_ptr<PokeathlonStatApiResources::ApiV2Pokeathlon_statIdResource> getApiV2Pokeathlon_statIdResource();

    void setResource(std::shared_ptr<PokeathlonStatApiResources::ApiV2Pokeathlon_statResource> resource);
    void setResource(std::shared_ptr<PokeathlonStatApiResources::ApiV2Pokeathlon_statIdResource> resource);
    [[deprecated("use setResource()")]]
    virtual void setPokeathlonStatApiApiV2Pokeathlon_statResource(std::shared_ptr<PokeathlonStatApiResources::ApiV2Pokeathlon_statResource> spPokeathlonStatApiApiV2Pokeathlon_statResource);
    [[deprecated("use setResource()")]]
    virtual void setPokeathlonStatApiApiV2Pokeathlon_statIdResource(std::shared_ptr<PokeathlonStatApiResources::ApiV2Pokeathlon_statIdResource> spPokeathlonStatApiApiV2Pokeathlon_statIdResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
    std::shared_ptr<PokeathlonStatApiResources::ApiV2Pokeathlon_statResource> m_spApiV2Pokeathlon_statResource;
    std::shared_ptr<PokeathlonStatApiResources::ApiV2Pokeathlon_statIdResource> m_spApiV2Pokeathlon_statIdResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* PokeathlonStatApi_H_ */

