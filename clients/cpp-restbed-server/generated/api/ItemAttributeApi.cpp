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


#include <corvusoft/restbed/byte.hpp>
#include <corvusoft/restbed/string.hpp>
#include <corvusoft/restbed/settings.hpp>
#include <corvusoft/restbed/request.hpp>
#include <corvusoft/restbed/uri.hpp>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>
#include <boost/lexical_cast.hpp>
#include <boost/algorithm/string.hpp>

#include "ItemAttributeApi.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

ItemAttributeApiException::ItemAttributeApiException(int status_code, std::string what)
  : m_status(status_code),
    m_what(what)
{

}
int ItemAttributeApiException::getStatus() const
{
    return m_status;
}
const char* ItemAttributeApiException::what() const noexcept
{
    return m_what.c_str();
}


template<class MODEL_T>
std::shared_ptr<MODEL_T> extractJsonModelBodyParam(const std::string& bodyContent)
{
    std::stringstream sstream(bodyContent);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream, pt);

    auto model = std::make_shared<MODEL_T>(pt);
    return model;
}

template<class MODEL_T>
std::vector<std::shared_ptr<MODEL_T>> extractJsonArrayBodyParam(const std::string& bodyContent)
{
    std::stringstream sstream(bodyContent);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream, pt);

    auto arrayRet = std::vector<std::shared_ptr<MODEL_T>>();
    for (const auto& child: pt) {
        arrayRet.emplace_back(std::make_shared<MODEL_T>(child.second));
    }
    return arrayRet;
}

template <class KEY_T, class VAL_T>
std::string convertMapResponse(const std::map<KEY_T, VAL_T>& map)
{
    boost::property_tree::ptree pt;
    for(const auto &kv: map) {
    pt.push_back(boost::property_tree::ptree::value_type(
        boost::lexical_cast<std::string>(kv.first),
        boost::property_tree::ptree(
        boost::lexical_cast<std::string>(kv.second))));
    }
    std::stringstream sstream;
    write_json(sstream, pt);
    std::string result = sstream.str();
    return result;
}

ItemAttributeApiApiV2Item-attributeResource::ItemAttributeApiApiV2Item-attributeResource(const std::string& context /* = "" */)
{
	this->set_path(context + "/api/v2/item-attribute//");
	this->set_method_handler("GET",
		std::bind(&ItemAttributeApiApiV2Item-attributeResource::handler_GET_internal, this,
			std::placeholders::_1));
}

ItemAttributeApiApiV2Item-attributeResource::~ItemAttributeApiApiV2Item-attributeResource()
{
}

std::pair<int, std::string> ItemAttributeApiApiV2Item-attributeResource::handleItemAttributeApiException(const ItemAttributeApiException& e)
{
    return std::make_pair<int, std::string>(e.getStatus(), e.what());
}

std::pair<int, std::string> ItemAttributeApiApiV2Item-attributeResource::handleStdException(const std::exception& e)
{
    return std::make_pair<int, std::string>(500, e.what());
}

std::pair<int, std::string> ItemAttributeApiApiV2Item-attributeResource::handleUnspecifiedException()
{
    return std::make_pair<int, std::string>(500, "Unknown exception occurred");
}

void ItemAttributeApiApiV2Item-attributeResource::setResponseHeader(const std::shared_ptr<restbed::Session>& session, const std::string& header)
{
    session->set_header(header, "");
}

void ItemAttributeApiApiV2Item-attributeResource::returnResponse(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result, const std::string& contentType)
{
    session->close(status, result, { {"Connection", "close"}, {"Content-Type", contentType} });
}

void ItemAttributeApiApiV2Item-attributeResource::defaultSessionClose(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result)
{
    session->close(status, result, { {"Connection", "close"} });
}

void ItemAttributeApiApiV2Item-attributeResource::handler_GET_internal(const std::shared_ptr<restbed::Session> session)
{
    const auto request = session->get_request();


    // Getting the query params
    const int32_t limit = getQueryParam_limit(request);
    const int32_t offset = getQueryParam_offset(request);


    int status_code = 500;
    std::string resultObject = "";
    std::string result = "";

    try {
        std::tie(status_code, resultObject) =
             handler_GET(limit, offset);
    }
    catch(const ItemAttributeApiException& e) {
        std::tie(status_code, result) = handleItemAttributeApiException(e);
    }
    catch(const std::exception& e) {
        std::tie(status_code, result) = handleStdException(e);
    }
    catch(...) {
        std::tie(status_code, result) = handleUnspecifiedException();
    }

    if (status_code == 0) {
        result = resultObject;

        const constexpr auto contentType = "application/json";
        returnResponse(session, 0, result.empty() ? "Default response" : result, contentType);
        return;
    }
    defaultSessionClose(session, status_code, result);
}


std::pair<int, std::string> ItemAttributeApiApiV2Item-attributeResource::handler_GET(
        int32_t const & limit, int32_t const & offset)
{
    throw ItemAttributeApiException(501, "Not implemented");
}


std::string ItemAttributeApiApiV2Item-attributeResource::extractBodyContent(const std::shared_ptr<restbed::Session>& session) {
  const auto request = session->get_request();
  int content_length = request->get_header("Content-Length", 0);
  std::string bodyContent;
  session->fetch(content_length,
                 [&bodyContent](const std::shared_ptr<restbed::Session> session,
                                const restbed::Bytes &body) {
                   bodyContent = restbed::String::format(
                       "%.*s\n", (int)body.size(), body.data());
                 });
  return bodyContent;
}
ItemAttributeApiApiV2Item-attributeIdResource::ItemAttributeApiApiV2Item-attributeIdResource(const std::string& context /* = "" */)
{
	this->set_path(context + "/api/v2/item-attribute/{id: .*}//");
	this->set_method_handler("GET",
		std::bind(&ItemAttributeApiApiV2Item-attributeIdResource::handler_GET_internal, this,
			std::placeholders::_1));
}

ItemAttributeApiApiV2Item-attributeIdResource::~ItemAttributeApiApiV2Item-attributeIdResource()
{
}

std::pair<int, std::string> ItemAttributeApiApiV2Item-attributeIdResource::handleItemAttributeApiException(const ItemAttributeApiException& e)
{
    return std::make_pair<int, std::string>(e.getStatus(), e.what());
}

std::pair<int, std::string> ItemAttributeApiApiV2Item-attributeIdResource::handleStdException(const std::exception& e)
{
    return std::make_pair<int, std::string>(500, e.what());
}

std::pair<int, std::string> ItemAttributeApiApiV2Item-attributeIdResource::handleUnspecifiedException()
{
    return std::make_pair<int, std::string>(500, "Unknown exception occurred");
}

void ItemAttributeApiApiV2Item-attributeIdResource::setResponseHeader(const std::shared_ptr<restbed::Session>& session, const std::string& header)
{
    session->set_header(header, "");
}

void ItemAttributeApiApiV2Item-attributeIdResource::returnResponse(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result, const std::string& contentType)
{
    session->close(status, result, { {"Connection", "close"}, {"Content-Type", contentType} });
}

void ItemAttributeApiApiV2Item-attributeIdResource::defaultSessionClose(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result)
{
    session->close(status, result, { {"Connection", "close"} });
}

void ItemAttributeApiApiV2Item-attributeIdResource::handler_GET_internal(const std::shared_ptr<restbed::Session> session)
{
    const auto request = session->get_request();

    // Getting the path params
    const int32_t id = getPathParam_id(request);



    int status_code = 500;
    std::string resultObject = "";
    std::string result = "";

    try {
        std::tie(status_code, resultObject) =
             handler_GET(id);
    }
    catch(const ItemAttributeApiException& e) {
        std::tie(status_code, result) = handleItemAttributeApiException(e);
    }
    catch(const std::exception& e) {
        std::tie(status_code, result) = handleStdException(e);
    }
    catch(...) {
        std::tie(status_code, result) = handleUnspecifiedException();
    }

    if (status_code == 0) {
        result = resultObject;

        const constexpr auto contentType = "application/json";
        returnResponse(session, 0, result.empty() ? "Default response" : result, contentType);
        return;
    }
    defaultSessionClose(session, status_code, result);
}


std::pair<int, std::string> ItemAttributeApiApiV2Item-attributeIdResource::handler_GET(
        int32_t const & id)
{
    throw ItemAttributeApiException(501, "Not implemented");
}


std::string ItemAttributeApiApiV2Item-attributeIdResource::extractBodyContent(const std::shared_ptr<restbed::Session>& session) {
  const auto request = session->get_request();
  int content_length = request->get_header("Content-Length", 0);
  std::string bodyContent;
  session->fetch(content_length,
                 [&bodyContent](const std::shared_ptr<restbed::Session> session,
                                const restbed::Bytes &body) {
                   bodyContent = restbed::String::format(
                       "%.*s\n", (int)body.size(), body.data());
                 });
  return bodyContent;
}

ItemAttributeApi::ItemAttributeApi(std::shared_ptr<restbed::Service> const& restbedService)
: m_service(restbedService)
{
}

ItemAttributeApi::~ItemAttributeApi() {}

void ItemAttributeApi::setItemAttributeApiApiV2Item-attributeResource(std::shared_ptr<ItemAttributeApiApiV2Item-attributeResource> spItemAttributeApiApiV2Item-attributeResource) {
    m_spItemAttributeApiApiV2Item-attributeResource = spItemAttributeApiApiV2Item-attributeResource;
    m_service->publish(m_spItemAttributeApiApiV2Item-attributeResource);
}
void ItemAttributeApi::setItemAttributeApiApiV2Item-attributeIdResource(std::shared_ptr<ItemAttributeApiApiV2Item-attributeIdResource> spItemAttributeApiApiV2Item-attributeIdResource) {
    m_spItemAttributeApiApiV2Item-attributeIdResource = spItemAttributeApiApiV2Item-attributeIdResource;
    m_service->publish(m_spItemAttributeApiApiV2Item-attributeIdResource);
}


void ItemAttributeApi::publishDefaultResources() {
    if (!m_spItemAttributeApiApiV2Item-attributeResource) {
        setItemAttributeApiApiV2Item-attributeResource(std::make_shared<ItemAttributeApiApiV2Item-attributeResource>());
    }
    if (!m_spItemAttributeApiApiV2Item-attributeIdResource) {
        setItemAttributeApiApiV2Item-attributeIdResource(std::make_shared<ItemAttributeApiApiV2Item-attributeIdResource>());
    }
}

std::shared_ptr<restbed::Service> ItemAttributeApi::service() {
    return m_service;
}


}
}
}
}

