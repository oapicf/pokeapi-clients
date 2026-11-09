

#include "PokemonCries.h"

using namespace Tiny;

PokemonCries::PokemonCries()
{
	latest = std::string();
	legacy = std::string();
}

PokemonCries::PokemonCries(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonCries::~PokemonCries()
{

}

void
PokemonCries::fromJson(std::string jsonObj)
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
PokemonCries::toJson()
{
    bourne::json object = bourne::json::object();





    object["latest"] = getLatest();






    object["legacy"] = getLegacy();



    return object;

}

std::string
PokemonCries::getLatest()
{
	return latest;
}

void
PokemonCries::setLatest(std::string latest)
{
	this->latest = latest;
}

std::string
PokemonCries::getLegacy()
{
	return legacy;
}

void
PokemonCries::setLegacy(std::string legacy)
{
	this->legacy = legacy;
}



