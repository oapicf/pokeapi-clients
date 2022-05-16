/**
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0.0
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

#include "RegionApi.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

RegionApiException::RegionApiException(int status_code, std::string what)
  : m_status(status_code),
    m_what(what)
{

}
int RegionApiException::getStatus() const
{
    return m_status;
}
const char* RegionApiException::what() const noexcept
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

RegionApiApiV2RegionResource::RegionApiApiV2RegionResource(const std::string& context /* = "/api/v2" */)
{
	this->set_path(context + "/api/v2/region//");
	this->set_method_handler("GET",
		std::bind(&RegionApiApiV2RegionResource::handler_GET_internal, this,
			std::placeholders::_1));
}

RegionApiApiV2RegionResource::~RegionApiApiV2RegionResource()
{
}

std::pair<int, std::string> RegionApiApiV2RegionResource::handleRegionApiException(const RegionApiException& e)
{
    return std::make_pair<int, std::string>(e.getStatus(), e.what());
}

std::pair<int, std::string> RegionApiApiV2RegionResource::handleStdException(const std::exception& e)
{
    return std::make_pair<int, std::string>(500, e.what());
}

std::pair<int, std::string> RegionApiApiV2RegionResource::handleUnspecifiedException()
{
    return std::make_pair<int, std::string>(500, "Unknown exception occurred");
}

void RegionApiApiV2RegionResource::setResponseHeader(const std::shared_ptr<restbed::Session>& session, const std::string& header)
{
    session->set_header(header, "");
}

void RegionApiApiV2RegionResource::returnResponse(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result, const std::string& contentType)
{
    session->close(status, result, { {"Connection", "close"}, {"Content-Type", contentType} });
}

void RegionApiApiV2RegionResource::defaultSessionClose(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result)
{
    session->close(status, result, { {"Connection", "close"} });
}

void RegionApiApiV2RegionResource::handler_GET_internal(const std::shared_ptr<restbed::Session> session)
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
    catch(const RegionApiException& e) {
        std::tie(status_code, result) = handleRegionApiException(e);
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


std::pair<int, std::string> RegionApiApiV2RegionResource::handler_GET(
        int32_t const & limit, int32_t const & offset)
{
    throw RegionApiException(501, "Not implemented");
}


std::string RegionApiApiV2RegionResource::extractBodyContent(const std::shared_ptr<restbed::Session>& session) {
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
RegionApiApiV2RegionIdResource::RegionApiApiV2RegionIdResource(const std::string& context /* = "/api/v2" */)
{
	this->set_path(context + "/api/v2/region/{id: .*}//");
	this->set_method_handler("GET",
		std::bind(&RegionApiApiV2RegionIdResource::handler_GET_internal, this,
			std::placeholders::_1));
}

RegionApiApiV2RegionIdResource::~RegionApiApiV2RegionIdResource()
{
}

std::pair<int, std::string> RegionApiApiV2RegionIdResource::handleRegionApiException(const RegionApiException& e)
{
    return std::make_pair<int, std::string>(e.getStatus(), e.what());
}

std::pair<int, std::string> RegionApiApiV2RegionIdResource::handleStdException(const std::exception& e)
{
    return std::make_pair<int, std::string>(500, e.what());
}

std::pair<int, std::string> RegionApiApiV2RegionIdResource::handleUnspecifiedException()
{
    return std::make_pair<int, std::string>(500, "Unknown exception occurred");
}

void RegionApiApiV2RegionIdResource::setResponseHeader(const std::shared_ptr<restbed::Session>& session, const std::string& header)
{
    session->set_header(header, "");
}

void RegionApiApiV2RegionIdResource::returnResponse(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result, const std::string& contentType)
{
    session->close(status, result, { {"Connection", "close"}, {"Content-Type", contentType} });
}

void RegionApiApiV2RegionIdResource::defaultSessionClose(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result)
{
    session->close(status, result, { {"Connection", "close"} });
}

void RegionApiApiV2RegionIdResource::handler_GET_internal(const std::shared_ptr<restbed::Session> session)
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
    catch(const RegionApiException& e) {
        std::tie(status_code, result) = handleRegionApiException(e);
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


std::pair<int, std::string> RegionApiApiV2RegionIdResource::handler_GET(
        int32_t const & id)
{
    throw RegionApiException(501, "Not implemented");
}


std::string RegionApiApiV2RegionIdResource::extractBodyContent(const std::shared_ptr<restbed::Session>& session) {
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

RegionApi::RegionApi(std::shared_ptr<restbed::Service> const& restbedService)
: m_service(restbedService)
{
}

RegionApi::~RegionApi() {}

void RegionApi::setRegionApiApiV2RegionResource(std::shared_ptr<RegionApiApiV2RegionResource> spRegionApiApiV2RegionResource) {
    m_spRegionApiApiV2RegionResource = spRegionApiApiV2RegionResource;
    m_service->publish(m_spRegionApiApiV2RegionResource);
}
void RegionApi::setRegionApiApiV2RegionIdResource(std::shared_ptr<RegionApiApiV2RegionIdResource> spRegionApiApiV2RegionIdResource) {
    m_spRegionApiApiV2RegionIdResource = spRegionApiApiV2RegionIdResource;
    m_service->publish(m_spRegionApiApiV2RegionIdResource);
}


void RegionApi::publishDefaultResources() {
    if (!m_spRegionApiApiV2RegionResource) {
        setRegionApiApiV2RegionResource(std::make_shared<RegionApiApiV2RegionResource>());
    }
    if (!m_spRegionApiApiV2RegionIdResource) {
        setRegionApiApiV2RegionIdResource(std::make_shared<RegionApiApiV2RegionIdResource>());
    }
}

std::shared_ptr<restbed::Service> RegionApi::service() {
    return m_service;
}


}
}
}
}

