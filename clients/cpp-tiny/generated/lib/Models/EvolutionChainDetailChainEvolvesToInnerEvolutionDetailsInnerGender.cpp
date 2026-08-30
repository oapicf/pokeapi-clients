

#include "EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender.h"

using namespace Tiny;

EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender::EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender()
{
	name = std::string();
	url = std::string();
}

EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender::EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender(std::string jsonString)
{
	this->fromJson(jsonString);
}

EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender::~EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender()
{

}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *urlKey = "url";

    if(object.has_key(urlKey))
    {
        bourne::json value = object[urlKey];



        jsonToValue(&url, value, "std::string");


    }


}

bourne::json
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender::toJson()
{
    bourne::json object = bourne::json::object();





    object["name"] = getName();






    object["url"] = getUrl();



    return object;

}

std::string
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender::getName()
{
	return name;
}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender::setName(std::string name)
{
	this->name = name;
}

std::string
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender::getUrl()
{
	return url;
}

void
EvolutionChainDetail_chain_evolves_to_inner_evolution_details_inner_gender::setUrl(std::string url)
{
	this->url = url;
}



