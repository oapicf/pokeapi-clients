

#include "PokemonHeldItemVersion.h"

using namespace Tiny;

PokemonHeldItemVersion::PokemonHeldItemVersion()
{
	rarity = int(0);
	version = null;
}

PokemonHeldItemVersion::PokemonHeldItemVersion(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonHeldItemVersion::~PokemonHeldItemVersion()
{

}

void
PokemonHeldItemVersion::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *rarityKey = "rarity";

    if(object.has_key(rarityKey))
    {
        bourne::json value = object[rarityKey];



        jsonToValue(&rarity, value, "int");


    }

    const char *versionKey = "version";

    if(object.has_key(versionKey))
    {
        bourne::json value = object[versionKey];




        VersionSummary* obj = &version;
		obj->fromJson(value.dump());

    }


}

bourne::json
PokemonHeldItemVersion::toJson()
{
    bourne::json object = bourne::json::object();





    object["rarity"] = getRarity();







	object["version"] = getVersion().toJson();


    return object;

}

int
PokemonHeldItemVersion::getRarity()
{
	return rarity;
}

void
PokemonHeldItemVersion::setRarity(int rarity)
{
	this->rarity = rarity;
}

VersionSummary
PokemonHeldItemVersion::getVersion()
{
	return version;
}

void
PokemonHeldItemVersion::setVersion(VersionSummary version)
{
	this->version = version;
}



