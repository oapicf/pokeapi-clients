

#include "ItemDetail_held_by_pokemon_inner_version_details_inner.h"

using namespace Tiny;

ItemDetail_held_by_pokemon_inner_version_details_inner::ItemDetail_held_by_pokemon_inner_version_details_inner()
{
	rarity = int(0);
	version = AbilityDetail_pokemon_inner_pokemon();
}

ItemDetail_held_by_pokemon_inner_version_details_inner::ItemDetail_held_by_pokemon_inner_version_details_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemDetail_held_by_pokemon_inner_version_details_inner::~ItemDetail_held_by_pokemon_inner_version_details_inner()
{

}

void
ItemDetail_held_by_pokemon_inner_version_details_inner::fromJson(std::string jsonObj)
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




        AbilityDetail_pokemon_inner_pokemon* obj = &version;
		obj->fromJson(value.dump());

    }


}

bourne::json
ItemDetail_held_by_pokemon_inner_version_details_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["rarity"] = getRarity();







	object["version"] = getVersion().toJson();


    return object;

}

int
ItemDetail_held_by_pokemon_inner_version_details_inner::getRarity()
{
	return rarity;
}

void
ItemDetail_held_by_pokemon_inner_version_details_inner::setRarity(int  rarity)
{
	this->rarity = rarity;
}

AbilityDetail_pokemon_inner_pokemon
ItemDetail_held_by_pokemon_inner_version_details_inner::getVersion()
{
	return version;
}

void
ItemDetail_held_by_pokemon_inner_version_details_inner::setVersion(AbilityDetail_pokemon_inner_pokemon  version)
{
	this->version = version;
}



