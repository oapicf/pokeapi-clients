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


#include <corvusoft/restbed/byte.hpp>
#include <corvusoft/restbed/string.hpp>
#include <corvusoft/restbed/settings.hpp>
#include <corvusoft/restbed/request.hpp>
#include <corvusoft/restbed/uri.hpp>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>
#include <boost/lexical_cast.hpp>
#include <boost/algorithm/string.hpp>

#include "PokeathlonStatApi.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

namespace {
[[maybe_unused]]
std::string selectPreferredContentType(const std::vector<std::string>& contentTypes) {
    if (contentTypes.size() == 0) {
        return "application/json";
    }

    if (contentTypes.size() == 1) {
        return contentTypes.at(0);
    }

    static const std::array<std::string, 2> preferredTypes = {"json", "xml"};
    for (const auto& preferredType: preferredTypes) {
        const auto ret = std::find_if(contentTypes.cbegin(),
        contentTypes.cend(),
        [preferredType](const std::string& str) {
            return str.find(preferredType) != std::string::npos;});
        if (ret != contentTypes.cend()) {
            return *ret;
        }
    }

    return contentTypes.at(0);
}
}

PokeathlonStatApiException::PokeathlonStatApiException(int status_code, std::string what)
  : m_status(status_code),
    m_what(what)
{

}
int PokeathlonStatApiException::getStatus() const
{
    return m_status;
}
const char* PokeathlonStatApiException::what() const noexcept
{
    return m_what.c_str();
}


template<class MODEL_T>
MODEL_T extractJsonModelBodyParam(const std::string& bodyContent)
{
    std::stringstream sstream(bodyContent);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream, pt);

    auto model = MODEL_T(pt);
    return model;
}

template<class MODEL_T>
std::vector<MODEL_T> extractJsonArrayBodyParam(const std::string& bodyContent)
{
    std::stringstream sstream(bodyContent);
    boost::property_tree::ptree pt;
    boost::property_tree::json_parser::read_json(sstream, pt);

    auto arrayRet = std::vector<MODEL_T>();
    for (const auto& child: pt) {
        arrayRet.emplace_back(MODEL_T(child.second));
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

namespace PokeathlonStatApiResources {
ApiV2Pokeathlon_statResource::ApiV2Pokeathlon_statResource(const std::string& context /* = "" */)
{
	this->set_path(context + "/api/v2/pokeathlon-stat/");
	this->set_method_handler("GET",
		std::bind(&ApiV2Pokeathlon_statResource::handler_GET_internal, this,
			std::placeholders::_1));
}

std::pair<int, std::string> ApiV2Pokeathlon_statResource::handlePokeathlonStatApiException(const PokeathlonStatApiException& e)
{
    return std::make_pair<int, std::string>(e.getStatus(), e.what());
}

std::pair<int, std::string> ApiV2Pokeathlon_statResource::handleStdException(const std::exception& e)
{
    return std::make_pair<int, std::string>(500, e.what());
}

std::pair<int, std::string> ApiV2Pokeathlon_statResource::handleUnspecifiedException()
{
    return std::make_pair<int, std::string>(500, "Unknown exception occurred");
}

void ApiV2Pokeathlon_statResource::setResponseHeader(const std::shared_ptr<restbed::Session>& session, const std::string& header)
{
    session->set_header(header, "");
}

void ApiV2Pokeathlon_statResource::returnResponse(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result, std::multimap<std::string, std::string>& responseHeaders)
{
    responseHeaders.insert(std::make_pair("Connection", "close"));
    session->close(status, result, responseHeaders);
}

void ApiV2Pokeathlon_statResource::defaultSessionClose(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result)
{
    session->close(status, result, { {"Connection", "close"} });
}

void ApiV2Pokeathlon_statResource::handler_GET_internal(const std::shared_ptr<restbed::Session> session)
{
    const auto request = session->get_request();
    // Getting the query params
    int32_t limit = request->get_query_parameter("limit", 0);
    int32_t offset = request->get_query_parameter("offset", 0);
    
    int status_code = 500;
    std::string resultObject = "";
    std::string result = "";
    
    try {
        std::tie(status_code, resultObject) =
            handler_GET(limit, offset);
    }
    catch(const PokeathlonStatApiException& e) {
        std::tie(status_code, result) = handlePokeathlonStatApiException(e);
    }
    catch(const std::exception& e) {
        std::tie(status_code, result) = handleStdException(e);
    }
    catch(...) {
        std::tie(status_code, result) = handleUnspecifiedException();
    }
    
    std::multimap< std::string, std::string > responseHeaders {};
    static const std::vector<std::string> contentTypes{
        "text/plain",
    };
    static const std::string acceptTypes{
    };
    
    if (status_code == 0) {
        responseHeaders.insert(std::make_pair("Content-Type", "text/plain"));
        result = "Default response";
    
        result = resultObject;
        returnResponse(session, 0, result.empty() ? "{}" : result, responseHeaders);
        return;
    }
    defaultSessionClose(session, status_code, result);
}


std::pair<int, std::string> ApiV2Pokeathlon_statResource::handler_GET(
        int32_t & limit, int32_t & offset)
{
    return handler_GET_func(limit, offset);
}


std::string ApiV2Pokeathlon_statResource::extractBodyContent(const std::shared_ptr<restbed::Session>& session) {
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

std::string ApiV2Pokeathlon_statResource::extractFormParamsFromBody(const std::string& paramName, const std::string& body) {
    const auto uri = restbed::Uri("urlencoded?" + body, true);
    const auto params = uri.get_query_parameters();
    const auto result = params.find(paramName);
    if (result != params.cend()) {
        return result->second;
    }
    return "";
}
ApiV2Pokeathlon_statIdResource::ApiV2Pokeathlon_statIdResource(const std::string& context /* = "" */)
{
	this->set_path(context + "/api/v2/pokeathlon-stat/{id: .*}/");
	this->set_method_handler("GET",
		std::bind(&ApiV2Pokeathlon_statIdResource::handler_GET_internal, this,
			std::placeholders::_1));
}

std::pair<int, std::string> ApiV2Pokeathlon_statIdResource::handlePokeathlonStatApiException(const PokeathlonStatApiException& e)
{
    return std::make_pair<int, std::string>(e.getStatus(), e.what());
}

std::pair<int, std::string> ApiV2Pokeathlon_statIdResource::handleStdException(const std::exception& e)
{
    return std::make_pair<int, std::string>(500, e.what());
}

std::pair<int, std::string> ApiV2Pokeathlon_statIdResource::handleUnspecifiedException()
{
    return std::make_pair<int, std::string>(500, "Unknown exception occurred");
}

void ApiV2Pokeathlon_statIdResource::setResponseHeader(const std::shared_ptr<restbed::Session>& session, const std::string& header)
{
    session->set_header(header, "");
}

void ApiV2Pokeathlon_statIdResource::returnResponse(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result, std::multimap<std::string, std::string>& responseHeaders)
{
    responseHeaders.insert(std::make_pair("Connection", "close"));
    session->close(status, result, responseHeaders);
}

void ApiV2Pokeathlon_statIdResource::defaultSessionClose(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result)
{
    session->close(status, result, { {"Connection", "close"} });
}

void ApiV2Pokeathlon_statIdResource::handler_GET_internal(const std::shared_ptr<restbed::Session> session)
{
    const auto request = session->get_request();
    // Getting the path params
    int32_t id = request->get_path_parameter("id", 0);
    
    int status_code = 500;
    std::string resultObject = "";
    std::string result = "";
    
    try {
        std::tie(status_code, resultObject) =
            handler_GET(id);
    }
    catch(const PokeathlonStatApiException& e) {
        std::tie(status_code, result) = handlePokeathlonStatApiException(e);
    }
    catch(const std::exception& e) {
        std::tie(status_code, result) = handleStdException(e);
    }
    catch(...) {
        std::tie(status_code, result) = handleUnspecifiedException();
    }
    
    std::multimap< std::string, std::string > responseHeaders {};
    static const std::vector<std::string> contentTypes{
        "text/plain",
    };
    static const std::string acceptTypes{
    };
    
    if (status_code == 0) {
        responseHeaders.insert(std::make_pair("Content-Type", "text/plain"));
        result = "Default response";
    
        result = resultObject;
        returnResponse(session, 0, result.empty() ? "{}" : result, responseHeaders);
        return;
    }
    defaultSessionClose(session, status_code, result);
}


std::pair<int, std::string> ApiV2Pokeathlon_statIdResource::handler_GET(
        int32_t & id)
{
    return handler_GET_func(id);
}


std::string ApiV2Pokeathlon_statIdResource::extractBodyContent(const std::shared_ptr<restbed::Session>& session) {
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

std::string ApiV2Pokeathlon_statIdResource::extractFormParamsFromBody(const std::string& paramName, const std::string& body) {
    const auto uri = restbed::Uri("urlencoded?" + body, true);
    const auto params = uri.get_query_parameters();
    const auto result = params.find(paramName);
    if (result != params.cend()) {
        return result->second;
    }
    return "";
}

} /* namespace PokeathlonStatApiResources */

PokeathlonStatApi::PokeathlonStatApi(std::shared_ptr<restbed::Service> const& restbedService)
: m_service(restbedService)
{
}

PokeathlonStatApi::~PokeathlonStatApi() {}

std::shared_ptr<PokeathlonStatApiResources::ApiV2Pokeathlon_statResource> PokeathlonStatApi::getApiV2Pokeathlon_statResource() {
    if (!m_spApiV2Pokeathlon_statResource) {
        setResource(std::make_shared<PokeathlonStatApiResources::ApiV2Pokeathlon_statResource>());
    }
    return m_spApiV2Pokeathlon_statResource;
}
std::shared_ptr<PokeathlonStatApiResources::ApiV2Pokeathlon_statIdResource> PokeathlonStatApi::getApiV2Pokeathlon_statIdResource() {
    if (!m_spApiV2Pokeathlon_statIdResource) {
        setResource(std::make_shared<PokeathlonStatApiResources::ApiV2Pokeathlon_statIdResource>());
    }
    return m_spApiV2Pokeathlon_statIdResource;
}
void PokeathlonStatApi::setResource(std::shared_ptr<PokeathlonStatApiResources::ApiV2Pokeathlon_statResource> resource) {
    m_spApiV2Pokeathlon_statResource = resource;
    m_service->publish(m_spApiV2Pokeathlon_statResource);
}
void PokeathlonStatApi::setResource(std::shared_ptr<PokeathlonStatApiResources::ApiV2Pokeathlon_statIdResource> resource) {
    m_spApiV2Pokeathlon_statIdResource = resource;
    m_service->publish(m_spApiV2Pokeathlon_statIdResource);
}
void PokeathlonStatApi::setPokeathlonStatApiApiV2Pokeathlon_statResource(std::shared_ptr<PokeathlonStatApiResources::ApiV2Pokeathlon_statResource> spApiV2Pokeathlon_statResource) {
    m_spApiV2Pokeathlon_statResource = spApiV2Pokeathlon_statResource;
    m_service->publish(m_spApiV2Pokeathlon_statResource);
}
void PokeathlonStatApi::setPokeathlonStatApiApiV2Pokeathlon_statIdResource(std::shared_ptr<PokeathlonStatApiResources::ApiV2Pokeathlon_statIdResource> spApiV2Pokeathlon_statIdResource) {
    m_spApiV2Pokeathlon_statIdResource = spApiV2Pokeathlon_statIdResource;
    m_service->publish(m_spApiV2Pokeathlon_statIdResource);
}


void PokeathlonStatApi::publishDefaultResources() {
    if (!m_spApiV2Pokeathlon_statResource) {
        setResource(std::make_shared<PokeathlonStatApiResources::ApiV2Pokeathlon_statResource>());
    }
    if (!m_spApiV2Pokeathlon_statIdResource) {
        setResource(std::make_shared<PokeathlonStatApiResources::ApiV2Pokeathlon_statIdResource>());
    }
}

std::shared_ptr<restbed::Service> PokeathlonStatApi::service() {
    return m_service;
}


}
}
}
}

