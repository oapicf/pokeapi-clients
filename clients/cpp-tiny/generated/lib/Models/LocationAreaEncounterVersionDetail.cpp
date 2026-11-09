

#include "LocationAreaEncounterVersionDetail.h"

using namespace Tiny;

LocationAreaEncounterVersionDetail::LocationAreaEncounterVersionDetail()
{
	rate = int(0);
	version = null;
}

LocationAreaEncounterVersionDetail::LocationAreaEncounterVersionDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

LocationAreaEncounterVersionDetail::~LocationAreaEncounterVersionDetail()
{

}

void
LocationAreaEncounterVersionDetail::fromJson(std::string jsonObj)
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




        VersionSummary* obj = &version;
		obj->fromJson(value.dump());

    }


}

bourne::json
LocationAreaEncounterVersionDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["rate"] = getRate();







	object["version"] = getVersion().toJson();


    return object;

}

int
LocationAreaEncounterVersionDetail::getRate()
{
	return rate;
}

void
LocationAreaEncounterVersionDetail::setRate(int rate)
{
	this->rate = rate;
}

VersionSummary
LocationAreaEncounterVersionDetail::getVersion()
{
	return version;
}

void
LocationAreaEncounterVersionDetail::setVersion(VersionSummary version)
{
	this->version = version;
}



