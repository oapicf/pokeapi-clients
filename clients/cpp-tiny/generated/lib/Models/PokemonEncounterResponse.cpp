

#include "PokemonEncounterResponse.h"

using namespace Tiny;

PokemonEncounterResponse::PokemonEncounterResponse()
{
	location_area = null;
	version_details = std::list<PokemonEncounterVersionDetailResponse>();
}

PokemonEncounterResponse::PokemonEncounterResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonEncounterResponse::~PokemonEncounterResponse()
{

}

void
PokemonEncounterResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *location_areaKey = "location_area";

    if(object.has_key(location_areaKey))
    {
        bourne::json value = object[location_areaKey];




        LocationAreaSummary* obj = &location_area;
		obj->fromJson(value.dump());

    }

    const char *version_detailsKey = "version_details";

    if(object.has_key(version_detailsKey))
    {
        bourne::json value = object[version_detailsKey];


        std::list<PokemonEncounterVersionDetailResponse> version_details_list;
        PokemonEncounterVersionDetailResponse element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            version_details_list.push_back(element);
        }
        version_details = version_details_list;


    }


}

bourne::json
PokemonEncounterResponse::toJson()
{
    bourne::json object = bourne::json::object();






	object["location_area"] = getLocationArea().toJson();




    std::list<PokemonEncounterVersionDetailResponse> version_details_list = getVersionDetails();
    bourne::json version_details_arr = bourne::json::array();

    for(auto& var : version_details_list)
    {
        PokemonEncounterVersionDetailResponse obj = var;
        version_details_arr.append(obj.toJson());
    }
    object["version_details"] = version_details_arr;




    return object;

}

LocationAreaSummary
PokemonEncounterResponse::getLocationArea()
{
	return location_area;
}

void
PokemonEncounterResponse::setLocationArea(LocationAreaSummary location_area)
{
	this->location_area = location_area;
}

std::list<PokemonEncounterVersionDetailResponse>
PokemonEncounterResponse::getVersionDetails()
{
	return version_details;
}

void
PokemonEncounterResponse::setVersionDetails(std::list<PokemonEncounterVersionDetailResponse> version_details)
{
	this->version_details = version_details;
}



