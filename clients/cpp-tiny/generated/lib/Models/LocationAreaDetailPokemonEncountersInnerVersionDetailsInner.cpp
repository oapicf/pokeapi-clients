

#include "LocationAreaDetail_pokemon_encounters_inner_version_details_inner.h"

using namespace Tiny;

LocationAreaDetail_pokemon_encounters_inner_version_details_inner::LocationAreaDetail_pokemon_encounters_inner_version_details_inner()
{
	version = AbilityDetail_pokemon_inner_pokemon();
	max_chance = int(0);
	encounter_details = LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details();
}

LocationAreaDetail_pokemon_encounters_inner_version_details_inner::LocationAreaDetail_pokemon_encounters_inner_version_details_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

LocationAreaDetail_pokemon_encounters_inner_version_details_inner::~LocationAreaDetail_pokemon_encounters_inner_version_details_inner()
{

}

void
LocationAreaDetail_pokemon_encounters_inner_version_details_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *versionKey = "version";

    if(object.has_key(versionKey))
    {
        bourne::json value = object[versionKey];




        AbilityDetail_pokemon_inner_pokemon* obj = &version;
		obj->fromJson(value.dump());

    }

    const char *max_chanceKey = "max_chance";

    if(object.has_key(max_chanceKey))
    {
        bourne::json value = object[max_chanceKey];



        jsonToValue(&max_chance, value, "int");


    }

    const char *encounter_detailsKey = "encounter_details";

    if(object.has_key(encounter_detailsKey))
    {
        bourne::json value = object[encounter_detailsKey];




        LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details* obj = &encounter_details;
		obj->fromJson(value.dump());

    }


}

bourne::json
LocationAreaDetail_pokemon_encounters_inner_version_details_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["version"] = getVersion().toJson();





    object["max_chance"] = getMaxChance();







	object["encounter_details"] = getEncounterDetails().toJson();


    return object;

}

AbilityDetail_pokemon_inner_pokemon
LocationAreaDetail_pokemon_encounters_inner_version_details_inner::getVersion()
{
	return version;
}

void
LocationAreaDetail_pokemon_encounters_inner_version_details_inner::setVersion(AbilityDetail_pokemon_inner_pokemon  version)
{
	this->version = version;
}

int
LocationAreaDetail_pokemon_encounters_inner_version_details_inner::getMaxChance()
{
	return max_chance;
}

void
LocationAreaDetail_pokemon_encounters_inner_version_details_inner::setMaxChance(int  max_chance)
{
	this->max_chance = max_chance;
}

LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details
LocationAreaDetail_pokemon_encounters_inner_version_details_inner::getEncounterDetails()
{
	return encounter_details;
}

void
LocationAreaDetail_pokemon_encounters_inner_version_details_inner::setEncounterDetails(LocationAreaDetail_pokemon_encounters_inner_version_details_inner_encounter_details  encounter_details)
{
	this->encounter_details = encounter_details;
}



