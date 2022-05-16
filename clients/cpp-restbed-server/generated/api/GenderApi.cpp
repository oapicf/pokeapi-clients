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

#include "GenderApi.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

GenderApiException::GenderApiException(int status_code, std::string what)
  : m_status(status_code),
    m_what(what)
{

}
int GenderApiException::getStatus() const
{
    return m_status;
}
const char* GenderApiException::what() const noexcept
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

GenderApiApiV2GenderResource::GenderApiApiV2GenderResource(const std::string& context /* = "/api/v2" */)
{
	this->set_path(context + "/api/v2/gender//");
	this->set_method_handler("GET",
		std::bind(&GenderApiApiV2GenderResource::handler_GET_internal, this,
			std::placeholders::_1));
}

GenderApiApiV2GenderResource::~GenderApiApiV2GenderResource()
{
}

std::pair<int, std::string> GenderApiApiV2GenderResource::handleGenderApiException(const GenderApiException& e)
{
    return std::make_pair<int, std::string>(e.getStatus(), e.what());
}

std::pair<int, std::string> GenderApiApiV2GenderResource::handleStdException(const std::exception& e)
{
    return std::make_pair<int, std::string>(500, e.what());
}

std::pair<int, std::string> GenderApiApiV2GenderResource::handleUnspecifiedException()
{
    return std::make_pair<int, std::string>(500, "Unknown exception occurred");
}

void GenderApiApiV2GenderResource::setResponseHeader(const std::shared_ptr<restbed::Session>& session, const std::string& header)
{
    session->set_header(header, "");
}

void GenderApiApiV2GenderResource::returnResponse(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result, const std::string& contentType)
{
    session->close(status, result, { {"Connection", "close"}, {"Content-Type", contentType} });
}

void GenderApiApiV2GenderResource::defaultSessionClose(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result)
{
    session->close(status, result, { {"Connection", "close"} });
}

void GenderApiApiV2GenderResource::handler_GET_internal(const std::shared_ptr<restbed::Session> session)
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
    catch(const GenderApiException& e) {
        std::tie(status_code, result) = handleGenderApiException(e);
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


std::pair<int, std::string> GenderApiApiV2GenderResource::handler_GET(
        int32_t const & limit, int32_t const & offset)
{
    throw GenderApiException(501, "Not implemented");
}


std::string GenderApiApiV2GenderResource::extractBodyContent(const std::shared_ptr<restbed::Session>& session) {
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
GenderApiApiV2GenderIdResource::GenderApiApiV2GenderIdResource(const std::string& context /* = "/api/v2" */)
{
	this->set_path(context + "/api/v2/gender/{id: .*}//");
	this->set_method_handler("GET",
		std::bind(&GenderApiApiV2GenderIdResource::handler_GET_internal, this,
			std::placeholders::_1));
}

GenderApiApiV2GenderIdResource::~GenderApiApiV2GenderIdResource()
{
}

std::pair<int, std::string> GenderApiApiV2GenderIdResource::handleGenderApiException(const GenderApiException& e)
{
    return std::make_pair<int, std::string>(e.getStatus(), e.what());
}

std::pair<int, std::string> GenderApiApiV2GenderIdResource::handleStdException(const std::exception& e)
{
    return std::make_pair<int, std::string>(500, e.what());
}

std::pair<int, std::string> GenderApiApiV2GenderIdResource::handleUnspecifiedException()
{
    return std::make_pair<int, std::string>(500, "Unknown exception occurred");
}

void GenderApiApiV2GenderIdResource::setResponseHeader(const std::shared_ptr<restbed::Session>& session, const std::string& header)
{
    session->set_header(header, "");
}

void GenderApiApiV2GenderIdResource::returnResponse(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result, const std::string& contentType)
{
    session->close(status, result, { {"Connection", "close"}, {"Content-Type", contentType} });
}

void GenderApiApiV2GenderIdResource::defaultSessionClose(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result)
{
    session->close(status, result, { {"Connection", "close"} });
}

void GenderApiApiV2GenderIdResource::handler_GET_internal(const std::shared_ptr<restbed::Session> session)
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
    catch(const GenderApiException& e) {
        std::tie(status_code, result) = handleGenderApiException(e);
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


std::pair<int, std::string> GenderApiApiV2GenderIdResource::handler_GET(
        int32_t const & id)
{
    throw GenderApiException(501, "Not implemented");
}


std::string GenderApiApiV2GenderIdResource::extractBodyContent(const std::shared_ptr<restbed::Session>& session) {
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

GenderApi::GenderApi(std::shared_ptr<restbed::Service> const& restbedService)
: m_service(restbedService)
{
}

GenderApi::~GenderApi() {}

void GenderApi::setGenderApiApiV2GenderResource(std::shared_ptr<GenderApiApiV2GenderResource> spGenderApiApiV2GenderResource) {
    m_spGenderApiApiV2GenderResource = spGenderApiApiV2GenderResource;
    m_service->publish(m_spGenderApiApiV2GenderResource);
}
void GenderApi::setGenderApiApiV2GenderIdResource(std::shared_ptr<GenderApiApiV2GenderIdResource> spGenderApiApiV2GenderIdResource) {
    m_spGenderApiApiV2GenderIdResource = spGenderApiApiV2GenderIdResource;
    m_service->publish(m_spGenderApiApiV2GenderIdResource);
}


void GenderApi::publishDefaultResources() {
    if (!m_spGenderApiApiV2GenderResource) {
        setGenderApiApiV2GenderResource(std::make_shared<GenderApiApiV2GenderResource>());
    }
    if (!m_spGenderApiApiV2GenderIdResource) {
        setGenderApiApiV2GenderIdResource(std::make_shared<GenderApiApiV2GenderIdResource>());
    }
}

std::shared_ptr<restbed::Service> GenderApi::service() {
    return m_service;
}


}
}
}
}

