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
 * ItemAttributeApi.h
 *
 * 
 */

#ifndef ItemAttributeApi_H_
#define ItemAttributeApi_H_


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
class  ItemAttributeApiException: public std::exception
{
public:
    ItemAttributeApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

namespace ItemAttributeApiResources {
/// <summary>
/// 
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  ApiV2Item_attributeResource: public restbed::Resource
{
public:
    ApiV2Item_attributeResource(const std::string& context = "");
    virtual ~ApiV2Item_attributeResource() = default;

    ApiV2Item_attributeResource(
        const ApiV2Item_attributeResource& other) = default; // copy constructor
    ApiV2Item_attributeResource(ApiV2Item_attributeResource&& other) noexcept = default; // move constructor

    ApiV2Item_attributeResource& operator=(const ApiV2Item_attributeResource& other) = default; // copy assignment
    ApiV2Item_attributeResource& operator=(ApiV2Item_attributeResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, std::string>(
        int32_t & limit, int32_t & offset)> handler_GET_func =
            [](int32_t &, int32_t &) -> std::pair<int, std::string>
                { throw ItemAttributeApiException(501, "Not implemented"); };


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

    virtual std::pair<int, std::string> handleItemAttributeApiException(const ItemAttributeApiException& e);
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
class  ApiV2Item_attributeIdResource: public restbed::Resource
{
public:
    ApiV2Item_attributeIdResource(const std::string& context = "");
    virtual ~ApiV2Item_attributeIdResource() = default;

    ApiV2Item_attributeIdResource(
        const ApiV2Item_attributeIdResource& other) = default; // copy constructor
    ApiV2Item_attributeIdResource(ApiV2Item_attributeIdResource&& other) noexcept = default; // move constructor

    ApiV2Item_attributeIdResource& operator=(const ApiV2Item_attributeIdResource& other) = default; // copy assignment
    ApiV2Item_attributeIdResource& operator=(ApiV2Item_attributeIdResource&& other) noexcept = default; // move assignment

    /////////////////////////////////////////////////////
    // Set these to implement the server functionality //
    /////////////////////////////////////////////////////
    std::function<std::pair<int, std::string>(
        int32_t & id)> handler_GET_func =
            [](int32_t &) -> std::pair<int, std::string>
                { throw ItemAttributeApiException(501, "Not implemented"); };


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

    virtual std::pair<int, std::string> handleItemAttributeApiException(const ItemAttributeApiException& e);
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

} /* namespace ItemAttributeApiResources */

using ItemAttributeApiApiV2Item_attributeResource [[deprecated]] = ItemAttributeApiResources::ApiV2Item_attributeResource;
using ItemAttributeApiApiV2Item_attributeIdResource [[deprecated]] = ItemAttributeApiResources::ApiV2Item_attributeIdResource;

//
// The restbed service to actually implement the REST server
//
class  ItemAttributeApi
{
public:
    explicit ItemAttributeApi(std::shared_ptr<restbed::Service> const& restbedService);
	virtual ~ItemAttributeApi();

    std::shared_ptr<ItemAttributeApiResources::ApiV2Item_attributeResource> getApiV2Item_attributeResource();
    std::shared_ptr<ItemAttributeApiResources::ApiV2Item_attributeIdResource> getApiV2Item_attributeIdResource();

    void setResource(std::shared_ptr<ItemAttributeApiResources::ApiV2Item_attributeResource> resource);
    void setResource(std::shared_ptr<ItemAttributeApiResources::ApiV2Item_attributeIdResource> resource);
    [[deprecated("use setResource()")]]
    virtual void setItemAttributeApiApiV2Item_attributeResource(std::shared_ptr<ItemAttributeApiResources::ApiV2Item_attributeResource> spItemAttributeApiApiV2Item_attributeResource);
    [[deprecated("use setResource()")]]
    virtual void setItemAttributeApiApiV2Item_attributeIdResource(std::shared_ptr<ItemAttributeApiResources::ApiV2Item_attributeIdResource> spItemAttributeApiApiV2Item_attributeIdResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
	std::shared_ptr<ItemAttributeApiResources::ApiV2Item_attributeResource> m_spApiV2Item_attributeResource;
	std::shared_ptr<ItemAttributeApiResources::ApiV2Item_attributeIdResource> m_spApiV2Item_attributeIdResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* ItemAttributeApi_H_ */

