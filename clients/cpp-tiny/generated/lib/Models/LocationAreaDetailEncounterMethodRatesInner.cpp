

#include "LocationAreaDetail_encounter_method_rates_inner.h"

using namespace Tiny;

LocationAreaDetail_encounter_method_rates_inner::LocationAreaDetail_encounter_method_rates_inner()
{
	encounter_method = AbilityDetail_pokemon_inner_pokemon();
	version_details = std::list<LocationAreaDetail_encounter_method_rates_inner_version_details_inner>();
}

LocationAreaDetail_encounter_method_rates_inner::LocationAreaDetail_encounter_method_rates_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

LocationAreaDetail_encounter_method_rates_inner::~LocationAreaDetail_encounter_method_rates_inner()
{

}

void
LocationAreaDetail_encounter_method_rates_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *encounter_methodKey = "encounter_method";

    if(object.has_key(encounter_methodKey))
    {
        bourne::json value = object[encounter_methodKey];




        AbilityDetail_pokemon_inner_pokemon* obj = &encounter_method;
		obj->fromJson(value.dump());

    }

    const char *version_detailsKey = "version_details";

    if(object.has_key(version_detailsKey))
    {
        bourne::json value = object[version_detailsKey];


        std::list<LocationAreaDetail_encounter_method_rates_inner_version_details_inner> version_details_list;
        LocationAreaDetail_encounter_method_rates_inner_version_details_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            version_details_list.push_back(element);
        }
        version_details = version_details_list;


    }


}

bourne::json
LocationAreaDetail_encounter_method_rates_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["encounter_method"] = getEncounterMethod().toJson();




    std::list<LocationAreaDetail_encounter_method_rates_inner_version_details_inner> version_details_list = getVersionDetails();
    bourne::json version_details_arr = bourne::json::array();

    for(auto& var : version_details_list)
    {
        LocationAreaDetail_encounter_method_rates_inner_version_details_inner obj = var;
        version_details_arr.append(obj.toJson());
    }
    object["version_details"] = version_details_arr;




    return object;

}

AbilityDetail_pokemon_inner_pokemon
LocationAreaDetail_encounter_method_rates_inner::getEncounterMethod()
{
	return encounter_method;
}

void
LocationAreaDetail_encounter_method_rates_inner::setEncounterMethod(AbilityDetail_pokemon_inner_pokemon encounter_method)
{
	this->encounter_method = encounter_method;
}

std::list<LocationAreaDetail_encounter_method_rates_inner_version_details_inner>
LocationAreaDetail_encounter_method_rates_inner::getVersionDetails()
{
	return version_details;
}

void
LocationAreaDetail_encounter_method_rates_inner::setVersionDetails(std::list<LocationAreaDetail_encounter_method_rates_inner_version_details_inner> version_details)
{
	this->version_details = version_details;
}



