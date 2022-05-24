/**
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 20220523
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 5.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * GrowthRateApi.h
 *
 * 
 */

#ifndef GrowthRateApi_H_
#define GrowthRateApi_H_


#include <memory>
#include <utility>
#include <exception>

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
class  GrowthRateApiException: public std::exception
{
public:
    GrowthRateApiException(int status_code, std::string what);

    int getStatus() const;
    const char* what() const noexcept override;

private:
    int m_status;
    std::string m_what;
};

/// <summary>
/// 
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  GrowthRateApiApiV2Growth-rateResource: public restbed::Resource
{
public:
    GrowthRateApiApiV2Growth-rateResource(const std::string& context = "");
    virtual ~GrowthRateApiApiV2Growth-rateResource();

protected:
    //////////////////////////////////////////////////////////
    // Override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, std::string> handler_GET(
        int32_t const & limit, int32_t const & offset);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);

    virtual int32_t getQueryParam_limit(const std::shared_ptr<const restbed::Request>& request)
    {
        return request->get_query_parameter("limit", 0);
    }

    virtual int32_t getQueryParam_offset(const std::shared_ptr<const restbed::Request>& request)
    {
        return request->get_query_parameter("offset", 0);
    }



    virtual std::pair<int, std::string> handleGrowthRateApiException(const GrowthRateApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);


    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, const std::string& contentType);
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
class  GrowthRateApiApiV2Growth-rateIdResource: public restbed::Resource
{
public:
    GrowthRateApiApiV2Growth-rateIdResource(const std::string& context = "");
    virtual ~GrowthRateApiApiV2Growth-rateIdResource();

protected:
    //////////////////////////////////////////////////////////
    // Override these to implement the server functionality //
    //////////////////////////////////////////////////////////

    virtual std::pair<int, std::string> handler_GET(
        int32_t const & id);


protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string extractBodyContent(const std::shared_ptr<restbed::Session>& session);

    virtual int32_t getPathParam_id(const std::shared_ptr<const restbed::Request>& request)
    {
        return request->get_path_parameter("id", 0);
    }



    virtual std::pair<int, std::string> handleGrowthRateApiException(const GrowthRateApiException& e);
    virtual std::pair<int, std::string> handleStdException(const std::exception& e);
    virtual std::pair<int, std::string> handleUnspecifiedException();

    virtual void setResponseHeader(const std::shared_ptr<restbed::Session>& session,
        const std::string& header);


    virtual void returnResponse(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result, const std::string& contentType);
    virtual void defaultSessionClose(const std::shared_ptr<restbed::Session>& session,
        const int status, const std::string& result);

private:
    void handler_GET_internal(const std::shared_ptr<restbed::Session> session);
};



//
// The restbed service to actually implement the REST server
//
class  GrowthRateApi
{
public:
    explicit GrowthRateApi(std::shared_ptr<restbed::Service> const& restbedService);
	virtual ~GrowthRateApi();

    virtual void setGrowthRateApiApiV2Growth-rateResource(std::shared_ptr<GrowthRateApiApiV2Growth-rateResource> spGrowthRateApiApiV2Growth-rateResource);
    virtual void setGrowthRateApiApiV2Growth-rateIdResource(std::shared_ptr<GrowthRateApiApiV2Growth-rateIdResource> spGrowthRateApiApiV2Growth-rateIdResource);

    virtual void publishDefaultResources();

    virtual std::shared_ptr<restbed::Service> service();

protected:
	std::shared_ptr<GrowthRateApiApiV2Growth-rateResource> m_spGrowthRateApiApiV2Growth-rateResource;
	std::shared_ptr<GrowthRateApiApiV2Growth-rateIdResource> m_spGrowthRateApiApiV2Growth-rateIdResource;

private:
    std::shared_ptr<restbed::Service> m_service;
};


}
}
}
}

#endif /* GrowthRateApi_H_ */

