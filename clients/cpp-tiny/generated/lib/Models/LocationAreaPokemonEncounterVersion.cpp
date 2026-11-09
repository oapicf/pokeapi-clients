

#include "LocationAreaPokemonEncounterVersion.h"

using namespace Tiny;

LocationAreaPokemonEncounterVersion::LocationAreaPokemonEncounterVersion()
{
	version = null;
	max_chance = int(0);
	encounter_details = std::list<LocationAreaEncounterDetail>();
}

LocationAreaPokemonEncounterVersion::LocationAreaPokemonEncounterVersion(std::string jsonString)
{
	this->fromJson(jsonString);
}

LocationAreaPokemonEncounterVersion::~LocationAreaPokemonEncounterVersion()
{

}

void
LocationAreaPokemonEncounterVersion::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *versionKey = "version";

    if(object.has_key(versionKey))
    {
        bourne::json value = object[versionKey];




        VersionSummary* obj = &version;
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


        std::list<LocationAreaEncounterDetail> encounter_details_list;
        LocationAreaEncounterDetail element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            encounter_details_list.push_back(element);
        }
        encounter_details = encounter_details_list;


    }


}

bourne::json
LocationAreaPokemonEncounterVersion::toJson()
{
    bourne::json object = bourne::json::object();






	object["version"] = getVersion().toJson();





    object["max_chance"] = getMaxChance();





    std::list<LocationAreaEncounterDetail> encounter_details_list = getEncounterDetails();
    bourne::json encounter_details_arr = bourne::json::array();

    for(auto& var : encounter_details_list)
    {
        LocationAreaEncounterDetail obj = var;
        encounter_details_arr.append(obj.toJson());
    }
    object["encounter_details"] = encounter_details_arr;




    return object;

}

VersionSummary
LocationAreaPokemonEncounterVersion::getVersion()
{
	return version;
}

void
LocationAreaPokemonEncounterVersion::setVersion(VersionSummary version)
{
	this->version = version;
}

int
LocationAreaPokemonEncounterVersion::getMaxChance()
{
	return max_chance;
}

void
LocationAreaPokemonEncounterVersion::setMaxChance(int max_chance)
{
	this->max_chance = max_chance;
}

std::list<LocationAreaEncounterDetail>
LocationAreaPokemonEncounterVersion::getEncounterDetails()
{
	return encounter_details;
}

void
LocationAreaPokemonEncounterVersion::setEncounterDetails(std::list<LocationAreaEncounterDetail> encounter_details)
{
	this->encounter_details = encounter_details;
}



