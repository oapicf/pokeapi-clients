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
 * ItemPocketApi.h
 *
 *
 */

#ifndef ItemPocketApi_H_
#define ItemPocketApi_H_


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
class  ItemPocketApiException: public std::exception
{
public:
    ItemPocketApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

namespace ItemPocketApiResources {
/// <summary>
///
/// </summary>
/// <remarks>
///
/// </remarks>
class  ApiV2Item_pocketResource: public restbed::Resource
{
public:
    ApiV2Item_pocketResource(const std::string& context = "");
    virtual ~ApiV2Item_pocketResource() = default;

    ApiV2Item_pocketResource(
        const ApiV2Item_pocketResource& other) = default; // copy constructor
    ApiV2Item_pocketResource(ApiV2Item_pocketResource&& other) noexcept = default; // move constructor

    ApiV2Item_pocketResource& operator=(const ApiV2Item_pocketResource& other) = default; // copy assignment
    ApiV2Item_pocketResource& operator=(ApiV2Item_pocketResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, std::string>(
        int32_t & limit, int32_t & offset)> handler_GET_func =
            [](int32_t &, int32_t &) -> std::pair<int, std::string>
                { throw ItemPocketApiException(501, "Not implemented"); };


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

    virtual std::pair<int, std::string> handleItemPocketApiException(const ItemPocketApiException& e);
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
class  ApiV2Item_pocketIdResource: public restbed::Resource
{
public:
    ApiV2Item_pocketIdResource(const std::string& context = "");
    virtual ~ApiV2Item_pocketIdResource() = default;

    ApiV2Item_pocketIdResource(
        const ApiV2Item_pocketIdResource& other) = default; // copy constructor
    ApiV2Item_pocketIdResource(ApiV2Item_pocketIdResource&& other) noexcept = default; // move constructor

    ApiV2Item_pocketIdResource& operator=(const ApiV2Item_pocketIdResource& other) = default; // copy assignment
    ApiV2Item_pocketIdResource& operator=(ApiV2Item_pocketIdResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, std::string>(
        int32_t & id)> handler_GET_func =
            [](int32_t &) -> std::pair<int, std::string>
                { throw ItemPocketApiException(501, "Not implemented"); };


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

    virtual std::pair<int, std::string> handleItemPocketApiException(const ItemPocketApiException& e);
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

} /* namespace ItemPocketApiResources */

using ItemPocketApiApiV2Item_pocketResource [[deprecated]] = ItemPocketApiResources::ApiV2Item_pocketResource;
using ItemPocketApiApiV2Item_pocketIdResource [[deprecated]] = ItemPocketApiResources::ApiV2Item_pocketIdResource;

//
// The restbed service to actually implement the REST server
//
class  ItemPocketApi
{
public:
    explicit ItemPocketApi(std::shared_ptr<restbed::Service> const& restbedService);
    virtual ~ItemPocketApi();

    std::shared_ptr<ItemPocketApiResources::ApiV2Item_pocketResource> getApiV2Item_pocketResource();
    std::shared_ptr<ItemPocketApiResources::ApiV2Item_pocketIdResource> getApiV2Item_pocketIdResource();

    void setResource(std::shared_ptr<ItemPocketApiResources::ApiV2Item_pocketResource> resource);
    void setResource(std::shared_ptr<ItemPocketApiResources::ApiV2Item_pocketIdResource> resource);
    [[deprecated("use setResource()")]]
    virtual void setItemPocketApiApiV2Item_pocketResource(std::shared_ptr<ItemPocketApiResources::ApiV2Item_pocketResource> spItemPocketApiApiV2Item_pocketResource);
    [[deprecated("use setResource()")]]
    virtual void setItemPocketApiApiV2Item_pocketIdResource(std::shared_ptr<ItemPocketApiResources::ApiV2Item_pocketIdResource> spItemPocketApiApiV2Item_pocketIdResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
    std::shared_ptr<ItemPocketApiResources::ApiV2Item_pocketResource> m_spApiV2Item_pocketResource;
    std::shared_ptr<ItemPocketApiResources::ApiV2Item_pocketIdResource> m_spApiV2Item_pocketIdResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* ItemPocketApi_H_ */

