

#include "PokemonEncounterVersionDetailResponse.h"

using namespace Tiny;

PokemonEncounterVersionDetailResponse::PokemonEncounterVersionDetailResponse()
{
	version = null;
	max_chance = int(0);
	encounter_details = std::list<PokemonEncounterDetailResponse>();
}

PokemonEncounterVersionDetailResponse::PokemonEncounterVersionDetailResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonEncounterVersionDetailResponse::~PokemonEncounterVersionDetailResponse()
{

}

void
PokemonEncounterVersionDetailResponse::fromJson(std::string jsonObj)
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


        std::list<PokemonEncounterDetailResponse> encounter_details_list;
        PokemonEncounterDetailResponse element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            encounter_details_list.push_back(element);
        }
        encounter_details = encounter_details_list;


    }


}

bourne::json
PokemonEncounterVersionDetailResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["version"] = getVersion().toJson();





    object["max_chance"] = getMaxChance();





    std::list<PokemonEncounterDetailResponse> encounter_details_list = getEncounterDetails();
    bourne::json encounter_details_arr = bourne::json::array();

    for(auto& var : encounter_details_list)
    {
        PokemonEncounterDetailResponse obj = var;
        encounter_details_arr.append(obj.toJson());
    }
    object["encounter_details"] = encounter_details_arr;




    return object;

}

VersionSummary
PokemonEncounterVersionDetailResponse::getVersion()
{
	return version;
}

void
PokemonEncounterVersionDetailResponse::setVersion(VersionSummary version)
{
	this->version = version;
}

int
PokemonEncounterVersionDetailResponse::getMaxChance()
{
	return max_chance;
}

void
PokemonEncounterVersionDetailResponse::setMaxChance(int max_chance)
{
	this->max_chance = max_chance;
}

std::list<PokemonEncounterDetailResponse>
PokemonEncounterVersionDetailResponse::getEncounterDetails()
{
	return encounter_details;
}

void
PokemonEncounterVersionDetailResponse::setEncounterDetails(std::list<PokemonEncounterDetailResponse> encounter_details)
{
	this->encounter_details = encounter_details;
}



