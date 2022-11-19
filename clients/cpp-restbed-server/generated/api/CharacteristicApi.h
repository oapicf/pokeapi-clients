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
 * CharacteristicApi.h
 *
 * 
 */

#ifndef CharacteristicApi_H_
#define CharacteristicApi_H_


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
class  CharacteristicApiException: public std::exception
{
public:
    CharacteristicApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

namespace CharacteristicApiResources {
/// <summary>
/// 
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  ApiV2CharacteristicResource: public restbed::Resource
{
public:
    ApiV2CharacteristicResource(const std::string& context = "");
    virtual ~ApiV2CharacteristicResource() = default;

    ApiV2CharacteristicResource(
        const ApiV2CharacteristicResource& other) = default; // copy constructor
    ApiV2CharacteristicResource(ApiV2CharacteristicResource&& other) noexcept = default; // move constructor

    ApiV2CharacteristicResource& operator=(const ApiV2CharacteristicResource& other) = default; // copy assignment
    ApiV2CharacteristicResource& operator=(ApiV2CharacteristicResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, std::string>(
        int32_t & limit, int32_t & offset)> handler_GET_func =
            [](int32_t &, int32_t &) -> std::pair<int, std::string>
                { throw CharacteristicApiException(501, "Not implemented"); };


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

    virtual std::pair<int, std::string> handleCharacteristicApiException(const CharacteristicApiException& e);
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
class  ApiV2CharacteristicIdResource: public restbed::Resource
{
public:
    ApiV2CharacteristicIdResource(const std::string& context = "");
    virtual ~ApiV2CharacteristicIdResource() = default;

    ApiV2CharacteristicIdResource(
        const ApiV2CharacteristicIdResource& other) = default; // copy constructor
    ApiV2CharacteristicIdResource(ApiV2CharacteristicIdResource&& other) noexcept = default; // move constructor

    ApiV2CharacteristicIdResource& operator=(const ApiV2CharacteristicIdResource& other) = default; // copy assignment
    ApiV2CharacteristicIdResource& operator=(ApiV2CharacteristicIdResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, std::string>(
        int32_t & id)> handler_GET_func =
            [](int32_t &) -> std::pair<int, std::string>
                { throw CharacteristicApiException(501, "Not implemented"); };


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

    virtual std::pair<int, std::string> handleCharacteristicApiException(const CharacteristicApiException& e);
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

} /* namespace CharacteristicApiResources */

using CharacteristicApiApiV2CharacteristicResource [[deprecated]] = CharacteristicApiResources::ApiV2CharacteristicResource;
using CharacteristicApiApiV2CharacteristicIdResource [[deprecated]] = CharacteristicApiResources::ApiV2CharacteristicIdResource;

//
// The restbed service to actually implement the REST server
//
class  CharacteristicApi
{
public:
    explicit CharacteristicApi(std::shared_ptr<restbed::Service> const& restbedService);
	virtual ~CharacteristicApi();

    std::shared_ptr<CharacteristicApiResources::ApiV2CharacteristicResource> getApiV2CharacteristicResource();
    std::shared_ptr<CharacteristicApiResources::ApiV2CharacteristicIdResource> getApiV2CharacteristicIdResource();

    void setResource(std::shared_ptr<CharacteristicApiResources::ApiV2CharacteristicResource> resource);
    void setResource(std::shared_ptr<CharacteristicApiResources::ApiV2CharacteristicIdResource> resource);
    [[deprecated("use setResource()")]]
    virtual void setCharacteristicApiApiV2CharacteristicResource(std::shared_ptr<CharacteristicApiResources::ApiV2CharacteristicResource> spCharacteristicApiApiV2CharacteristicResource);
    [[deprecated("use setResource()")]]
    virtual void setCharacteristicApiApiV2CharacteristicIdResource(std::shared_ptr<CharacteristicApiResources::ApiV2CharacteristicIdResource> spCharacteristicApiApiV2CharacteristicIdResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
	std::shared_ptr<CharacteristicApiResources::ApiV2CharacteristicResource> m_spApiV2CharacteristicResource;
	std::shared_ptr<CharacteristicApiResources::ApiV2CharacteristicIdResource> m_spApiV2CharacteristicIdResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* CharacteristicApi_H_ */

