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


#include <corvusoft/restbed/byte.hpp>
#include <corvusoft/restbed/string.hpp>
#include <corvusoft/restbed/settings.hpp>
#include <corvusoft/restbed/request.hpp>
#include <corvusoft/restbed/uri.hpp>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>
#include <boost/lexical_cast.hpp>
#include <boost/algorithm/string.hpp>

#include "PokemonSpeciesApi.h"

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

PokemonSpeciesApiException::PokemonSpeciesApiException(int status_code, std::string what)
  : m_status(status_code),
    m_what(what)
{

}
int PokemonSpeciesApiException::getStatus() const
{
    return m_status;
}
const char* PokemonSpeciesApiException::what() const noexcept
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

namespace PokemonSpeciesApiResources {
ApiV2Pokemon_speciesResource::ApiV2Pokemon_speciesResource(const std::string& context /* = "" */)
{
	this->set_path(context + "/api/v2/pokemon-species/");
	this->set_method_handler("GET",
		std::bind(&ApiV2Pokemon_speciesResource::handler_GET_internal, this,
			std::placeholders::_1));
}

std::pair<int, std::string> ApiV2Pokemon_speciesResource::handlePokemonSpeciesApiException(const PokemonSpeciesApiException& e)
{
    return std::make_pair<int, std::string>(e.getStatus(), e.what());
}

std::pair<int, std::string> ApiV2Pokemon_speciesResource::handleStdException(const std::exception& e)
{
    return std::make_pair<int, std::string>(500, e.what());
}

std::pair<int, std::string> ApiV2Pokemon_speciesResource::handleUnspecifiedException()
{
    return std::make_pair<int, std::string>(500, "Unknown exception occurred");
}

void ApiV2Pokemon_speciesResource::setResponseHeader(const std::shared_ptr<restbed::Session>& session, const std::string& header)
{
    session->set_header(header, "");
}

void ApiV2Pokemon_speciesResource::returnResponse(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result, std::multimap<std::string, std::string>& responseHeaders)
{
    responseHeaders.insert(std::make_pair("Connection", "close"));
    session->close(status, result, responseHeaders);
}

void ApiV2Pokemon_speciesResource::defaultSessionClose(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result)
{
    session->close(status, result, { {"Connection", "close"} });
}

void ApiV2Pokemon_speciesResource::handler_GET_internal(const std::shared_ptr<restbed::Session> session)
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
    catch(const PokemonSpeciesApiException& e) {
        std::tie(status_code, result) = handlePokemonSpeciesApiException(e);
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


std::pair<int, std::string> ApiV2Pokemon_speciesResource::handler_GET(
        int32_t & limit, int32_t & offset)
{
    return handler_GET_func(limit, offset);
}


std::string ApiV2Pokemon_speciesResource::extractBodyContent(const std::shared_ptr<restbed::Session>& session) {
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

std::string ApiV2Pokemon_speciesResource::extractFormParamsFromBody(const std::string& paramName, const std::string& body) {
    const auto uri = restbed::Uri("urlencoded?" + body, true);
    const auto params = uri.get_query_parameters();
    const auto result = params.find(paramName);
    if (result != params.cend()) {
        return result->second;
    }
    return "";
}
ApiV2Pokemon_speciesIdResource::ApiV2Pokemon_speciesIdResource(const std::string& context /* = "" */)
{
	this->set_path(context + "/api/v2/pokemon-species/{id: .*}/");
	this->set_method_handler("GET",
		std::bind(&ApiV2Pokemon_speciesIdResource::handler_GET_internal, this,
			std::placeholders::_1));
}

std::pair<int, std::string> ApiV2Pokemon_speciesIdResource::handlePokemonSpeciesApiException(const PokemonSpeciesApiException& e)
{
    return std::make_pair<int, std::string>(e.getStatus(), e.what());
}

std::pair<int, std::string> ApiV2Pokemon_speciesIdResource::handleStdException(const std::exception& e)
{
    return std::make_pair<int, std::string>(500, e.what());
}

std::pair<int, std::string> ApiV2Pokemon_speciesIdResource::handleUnspecifiedException()
{
    return std::make_pair<int, std::string>(500, "Unknown exception occurred");
}

void ApiV2Pokemon_speciesIdResource::setResponseHeader(const std::shared_ptr<restbed::Session>& session, const std::string& header)
{
    session->set_header(header, "");
}

void ApiV2Pokemon_speciesIdResource::returnResponse(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result, std::multimap<std::string, std::string>& responseHeaders)
{
    responseHeaders.insert(std::make_pair("Connection", "close"));
    session->close(status, result, responseHeaders);
}

void ApiV2Pokemon_speciesIdResource::defaultSessionClose(const std::shared_ptr<restbed::Session>& session, const int status, const std::string& result)
{
    session->close(status, result, { {"Connection", "close"} });
}

void ApiV2Pokemon_speciesIdResource::handler_GET_internal(const std::shared_ptr<restbed::Session> session)
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
    catch(const PokemonSpeciesApiException& e) {
        std::tie(status_code, result) = handlePokemonSpeciesApiException(e);
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


std::pair<int, std::string> ApiV2Pokemon_speciesIdResource::handler_GET(
        int32_t & id)
{
    return handler_GET_func(id);
}


std::string ApiV2Pokemon_speciesIdResource::extractBodyContent(const std::shared_ptr<restbed::Session>& session) {
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

std::string ApiV2Pokemon_speciesIdResource::extractFormParamsFromBody(const std::string& paramName, const std::string& body) {
    const auto uri = restbed::Uri("urlencoded?" + body, true);
    const auto params = uri.get_query_parameters();
    const auto result = params.find(paramName);
    if (result != params.cend()) {
        return result->second;
    }
    return "";
}

} /* namespace PokemonSpeciesApiResources */

PokemonSpeciesApi::PokemonSpeciesApi(std::shared_ptr<restbed::Service> const& restbedService)
: m_service(restbedService)
{
}

PokemonSpeciesApi::~PokemonSpeciesApi() {}

std::shared_ptr<PokemonSpeciesApiResources::ApiV2Pokemon_speciesResource> PokemonSpeciesApi::getApiV2Pokemon_speciesResource() {
    if (!m_spApiV2Pokemon_speciesResource) {
        setResource(std::make_shared<PokemonSpeciesApiResources::ApiV2Pokemon_speciesResource>());
    }
    return m_spApiV2Pokemon_speciesResource;
}
std::shared_ptr<PokemonSpeciesApiResources::ApiV2Pokemon_speciesIdResource> PokemonSpeciesApi::getApiV2Pokemon_speciesIdResource() {
    if (!m_spApiV2Pokemon_speciesIdResource) {
        setResource(std::make_shared<PokemonSpeciesApiResources::ApiV2Pokemon_speciesIdResource>());
    }
    return m_spApiV2Pokemon_speciesIdResource;
}
void PokemonSpeciesApi::setResource(std::shared_ptr<PokemonSpeciesApiResources::ApiV2Pokemon_speciesResource> resource) {
    m_spApiV2Pokemon_speciesResource = resource;
    m_service->publish(m_spApiV2Pokemon_speciesResource);
}
void PokemonSpeciesApi::setResource(std::shared_ptr<PokemonSpeciesApiResources::ApiV2Pokemon_speciesIdResource> resource) {
    m_spApiV2Pokemon_speciesIdResource = resource;
    m_service->publish(m_spApiV2Pokemon_speciesIdResource);
}
void PokemonSpeciesApi::setPokemonSpeciesApiApiV2Pokemon_speciesResource(std::shared_ptr<PokemonSpeciesApiResources::ApiV2Pokemon_speciesResource> spApiV2Pokemon_speciesResource) {
    m_spApiV2Pokemon_speciesResource = spApiV2Pokemon_speciesResource;
    m_service->publish(m_spApiV2Pokemon_speciesResource);
}
void PokemonSpeciesApi::setPokemonSpeciesApiApiV2Pokemon_speciesIdResource(std::shared_ptr<PokemonSpeciesApiResources::ApiV2Pokemon_speciesIdResource> spApiV2Pokemon_speciesIdResource) {
    m_spApiV2Pokemon_speciesIdResource = spApiV2Pokemon_speciesIdResource;
    m_service->publish(m_spApiV2Pokemon_speciesIdResource);
}


void PokemonSpeciesApi::publishDefaultResources() {
    if (!m_spApiV2Pokemon_speciesResource) {
        setResource(std::make_shared<PokemonSpeciesApiResources::ApiV2Pokemon_speciesResource>());
    }
    if (!m_spApiV2Pokemon_speciesIdResource) {
        setResource(std::make_shared<PokemonSpeciesApiResources::ApiV2Pokemon_speciesIdResource>());
    }
}

std::shared_ptr<restbed::Service> PokemonSpeciesApi::service() {
    return m_service;
}


}
}
}
}

