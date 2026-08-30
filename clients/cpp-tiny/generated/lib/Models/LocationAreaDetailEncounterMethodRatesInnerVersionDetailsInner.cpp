

#include "LocationAreaDetail_encounter_method_rates_inner_version_details_inner.h"

using namespace Tiny;

LocationAreaDetail_encounter_method_rates_inner_version_details_inner::LocationAreaDetail_encounter_method_rates_inner_version_details_inner()
{
	rate = int(0);
	version = AbilityDetail_pokemon_inner_pokemon();
}

LocationAreaDetail_encounter_method_rates_inner_version_details_inner::LocationAreaDetail_encounter_method_rates_inner_version_details_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

LocationAreaDetail_encounter_method_rates_inner_version_details_inner::~LocationAreaDetail_encounter_method_rates_inner_version_details_inner()
{

}

void
LocationAreaDetail_encounter_method_rates_inner_version_details_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *rateKey = "rate";

    if(object.has_key(rateKey))
    {
        bourne::json value = object[rateKey];



        jsonToValue(&rate, value, "int");


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
LocationAreaDetail_encounter_method_rates_inner_version_details_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["rate"] = getRate();







	object["version"] = getVersion().toJson();


    return object;

}

int
LocationAreaDetail_encounter_method_rates_inner_version_details_inner::getRate()
{
	return rate;
}

void
LocationAreaDetail_encounter_method_rates_inner_version_details_inner::setRate(int rate)
{
	this->rate = rate;
}

AbilityDetail_pokemon_inner_pokemon
LocationAreaDetail_encounter_method_rates_inner_version_details_inner::getVersion()
{
	return version;
}

void
LocationAreaDetail_encounter_method_rates_inner_version_details_inner::setVersion(AbilityDetail_pokemon_inner_pokemon version)
{
	this->version = version;
}



