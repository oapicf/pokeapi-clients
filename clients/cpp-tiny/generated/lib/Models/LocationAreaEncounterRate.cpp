

#include "LocationAreaEncounterRate.h"

using namespace Tiny;

LocationAreaEncounterRate::LocationAreaEncounterRate()
{
	encounter_method = null;
	version_details = std::list<LocationAreaEncounterVersionDetail>();
}

LocationAreaEncounterRate::LocationAreaEncounterRate(std::string jsonString)
{
	this->fromJson(jsonString);
}

LocationAreaEncounterRate::~LocationAreaEncounterRate()
{

}

void
LocationAreaEncounterRate::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *encounter_methodKey = "encounter_method";

    if(object.has_key(encounter_methodKey))
    {
        bourne::json value = object[encounter_methodKey];




        EncounterMethodSummary* obj = &encounter_method;
		obj->fromJson(value.dump());

    }

    const char *version_detailsKey = "version_details";

    if(object.has_key(version_detailsKey))
    {
        bourne::json value = object[version_detailsKey];


        std::list<LocationAreaEncounterVersionDetail> version_details_list;
        LocationAreaEncounterVersionDetail element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            version_details_list.push_back(element);
        }
        version_details = version_details_list;


    }


}

bourne::json
LocationAreaEncounterRate::toJson()
{
    bourne::json object = bourne::json::object();






	object["encounter_method"] = getEncounterMethod().toJson();




    std::list<LocationAreaEncounterVersionDetail> version_details_list = getVersionDetails();
    bourne::json version_details_arr = bourne::json::array();

    for(auto& var : version_details_list)
    {
        LocationAreaEncounterVersionDetail obj = var;
        version_details_arr.append(obj.toJson());
    }
    object["version_details"] = version_details_arr;




    return object;

}

EncounterMethodSummary
LocationAreaEncounterRate::getEncounterMethod()
{
	return encounter_method;
}

void
LocationAreaEncounterRate::setEncounterMethod(EncounterMethodSummary encounter_method)
{
	this->encounter_method = encounter_method;
}

std::list<LocationAreaEncounterVersionDetail>
LocationAreaEncounterRate::getVersionDetails()
{
	return version_details;
}

void
LocationAreaEncounterRate::setVersionDetails(std::list<LocationAreaEncounterVersionDetail> version_details)
{
	this->version_details = version_details;
}



