

#include "PokemonDetail_cries.h"

using namespace Tiny;

PokemonDetail_cries::PokemonDetail_cries()
{
	latest = std::string();
	legacy = std::string();
}

PokemonDetail_cries::PokemonDetail_cries(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonDetail_cries::~PokemonDetail_cries()
{

}

void
PokemonDetail_cries::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *latestKey = "latest";

    if(object.has_key(latestKey))
    {
        bourne::json value = object[latestKey];



        jsonToValue(&latest, value, "std::string");


    }

    const char *legacyKey = "legacy";

    if(object.has_key(legacyKey))
    {
        bourne::json value = object[legacyKey];



        jsonToValue(&legacy, value, "std::string");


    }


}

bourne::json
PokemonDetail_cries::toJson()
{
    bourne::json object = bourne::json::object();





    object["latest"] = getLatest();






    object["legacy"] = getLegacy();



    return object;

}

std::string
PokemonDetail_cries::getLatest()
{
	return latest;
}

void
PokemonDetail_cries::setLatest(std::string latest)
{
	this->latest = latest;
}

std::string
PokemonDetail_cries::getLegacy()
{
	return legacy;
}

void
PokemonDetail_cries::setLegacy(std::string legacy)
{
	this->legacy = legacy;
}



