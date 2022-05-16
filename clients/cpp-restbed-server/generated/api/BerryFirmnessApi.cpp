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

#include "BerryFirmnessApi.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

BerryFirmnessApiException::BerryFirmnessApiException(int status_code, std::string what)
  : m_status(status_code),
    m_what(what)
{

}
int BerryFirmnessApiException::getStatus() const
{
    return m_status;
}
const char* BerryFirmnessApiException::what() const noexcept
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

BerryFirmnessApiApiV2Berry-firmnessResource::BerryFirmnessApiApiV2Berry-firmnessResource(const std::string& context /* = "/api/v2" */)
{
	this->set_path(context + "/api/v2/berry-firmness//");
	this->set_method_handler("GET",
		std::bind(&BerryFirmnessApiApiV2Berry-firmnessResource::handler_GET_internal, this,
			std::placeholders::_1));
}

BerryFirmnessApiApiV2Berry-firmnessResource::~BerryFirmnessApiApiV2Berry-firmnessResource()
{
}

std::pair<int, std::string> BerryFirmnessApiApiV2Berry-firmnessResource::handleBerryFirmnessApiException(const BerryFirmnessApiException& e)
{
    return std::make_pair<int, std::string>(e.getStatus(), e.what());
}

std::pair<int, std::string> BerryFirmnessApiApiV2Berry-firmnessResource::handleStdException(const std::exception& e)
{
    return std::make_pair<int, std::string>(500, e.what());
}

std::pair<int, std::string> BerryFirmnessApiApiV2Berry-firmnessResource::handleUnspecifiedException()
{
    return std::make_pair<int, std::string>(500, "Unknown exception occurred");
}

void BerryFirmnessApiApiV2Berry-firmnessResource::setResponseHeader(const std::shared_ptr<restbed::Session>& session, const std::string& header)
{
    session->set_header(header, "");
}

void BerryFirmnessApiApiV2Berry-firmnessResource::returnResponse(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result, const std::string& contentType)
{
    session->close(status, result, { {"Connection", "close"}, {"Content-Type", contentType} });
}

void BerryFirmnessApiApiV2Berry-firmnessResource::defaultSessionClose(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result)
{
    session->close(status, result, { {"Connection", "close"} });
}

void BerryFirmnessApiApiV2Berry-firmnessResource::handler_GET_internal(const std::shared_ptr<restbed::Session> session)
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
    catch(const BerryFirmnessApiException& e) {
        std::tie(status_code, result) = handleBerryFirmnessApiException(e);
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


std::pair<int, std::string> BerryFirmnessApiApiV2Berry-firmnessResource::handler_GET(
        int32_t const & limit, int32_t const & offset)
{
    throw BerryFirmnessApiException(501, "Not implemented");
}


std::string BerryFirmnessApiApiV2Berry-firmnessResource::extractBodyContent(const std::shared_ptr<restbed::Session>& session) {
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
BerryFirmnessApiApiV2Berry-firmnessIdResource::BerryFirmnessApiApiV2Berry-firmnessIdResource(const std::string& context /* = "/api/v2" */)
{
	this->set_path(context + "/api/v2/berry-firmness/{id: .*}//");
	this->set_method_handler("GET",
		std::bind(&BerryFirmnessApiApiV2Berry-firmnessIdResource::handler_GET_internal, this,
			std::placeholders::_1));
}

BerryFirmnessApiApiV2Berry-firmnessIdResource::~BerryFirmnessApiApiV2Berry-firmnessIdResource()
{
}

std::pair<int, std::string> BerryFirmnessApiApiV2Berry-firmnessIdResource::handleBerryFirmnessApiException(const BerryFirmnessApiException& e)
{
    return std::make_pair<int, std::string>(e.getStatus(), e.what());
}

std::pair<int, std::string> BerryFirmnessApiApiV2Berry-firmnessIdResource::handleStdException(const std::exception& e)
{
    return std::make_pair<int, std::string>(500, e.what());
}

std::pair<int, std::string> BerryFirmnessApiApiV2Berry-firmnessIdResource::handleUnspecifiedException()
{
    return std::make_pair<int, std::string>(500, "Unknown exception occurred");
}

void BerryFirmnessApiApiV2Berry-firmnessIdResource::setResponseHeader(const std::shared_ptr<restbed::Session>& session, const std::string& header)
{
    session->set_header(header, "");
}

void BerryFirmnessApiApiV2Berry-firmnessIdResource::returnResponse(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result, const std::string& contentType)
{
    session->close(status, result, { {"Connection", "close"}, {"Content-Type", contentType} });
}

void BerryFirmnessApiApiV2Berry-firmnessIdResource::defaultSessionClose(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result)
{
    session->close(status, result, { {"Connection", "close"} });
}

void BerryFirmnessApiApiV2Berry-firmnessIdResource::handler_GET_internal(const std::shared_ptr<restbed::Session> session)
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
    catch(const BerryFirmnessApiException& e) {
        std::tie(status_code, result) = handleBerryFirmnessApiException(e);
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


std::pair<int, std::string> BerryFirmnessApiApiV2Berry-firmnessIdResource::handler_GET(
        int32_t const & id)
{
    throw BerryFirmnessApiException(501, "Not implemented");
}


std::string BerryFirmnessApiApiV2Berry-firmnessIdResource::extractBodyContent(const std::shared_ptr<restbed::Session>& session) {
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

BerryFirmnessApi::BerryFirmnessApi(std::shared_ptr<restbed::Service> const& restbedService)
: m_service(restbedService)
{
}

BerryFirmnessApi::~BerryFirmnessApi() {}

void BerryFirmnessApi::setBerryFirmnessApiApiV2Berry-firmnessResource(std::shared_ptr<BerryFirmnessApiApiV2Berry-firmnessResource> spBerryFirmnessApiApiV2Berry-firmnessResource) {
    m_spBerryFirmnessApiApiV2Berry-firmnessResource = spBerryFirmnessApiApiV2Berry-firmnessResource;
    m_service->publish(m_spBerryFirmnessApiApiV2Berry-firmnessResource);
}
void BerryFirmnessApi::setBerryFirmnessApiApiV2Berry-firmnessIdResource(std::shared_ptr<BerryFirmnessApiApiV2Berry-firmnessIdResource> spBerryFirmnessApiApiV2Berry-firmnessIdResource) {
    m_spBerryFirmnessApiApiV2Berry-firmnessIdResource = spBerryFirmnessApiApiV2Berry-firmnessIdResource;
    m_service->publish(m_spBerryFirmnessApiApiV2Berry-firmnessIdResource);
}


void BerryFirmnessApi::publishDefaultResources() {
    if (!m_spBerryFirmnessApiApiV2Berry-firmnessResource) {
        setBerryFirmnessApiApiV2Berry-firmnessResource(std::make_shared<BerryFirmnessApiApiV2Berry-firmnessResource>());
    }
    if (!m_spBerryFirmnessApiApiV2Berry-firmnessIdResource) {
        setBerryFirmnessApiApiV2Berry-firmnessIdResource(std::make_shared<BerryFirmnessApiApiV2Berry-firmnessIdResource>());
    }
}

std::shared_ptr<restbed::Service> BerryFirmnessApi::service() {
    return m_service;
}


}
}
}
}

