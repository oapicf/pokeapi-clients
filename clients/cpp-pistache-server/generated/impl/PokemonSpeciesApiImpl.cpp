/**
* 
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* The version of the OpenAPI document: 20220523
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/

#include "PokemonSpeciesApiImpl.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {



PokemonSpeciesApiImpl::PokemonSpeciesApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr)
    : PokemonSpeciesApi(rtr)
{
}

void PokemonSpeciesApiImpl::pokemon_species_list(const std::optional<int32_t> &limit, const std::optional<int32_t> &offset, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}
void PokemonSpeciesApiImpl::pokemon_species_read(const int32_t &id, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}

}
}
}
}

