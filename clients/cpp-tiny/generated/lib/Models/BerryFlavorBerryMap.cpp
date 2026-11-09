

#include "BerryFlavorBerryMap.h"

using namespace Tiny;

BerryFlavorBerryMap::BerryFlavorBerryMap()
{
	potency = int(0);
	berry = null;
}

BerryFlavorBerryMap::BerryFlavorBerryMap(std::string jsonString)
{
	this->fromJson(jsonString);
}

BerryFlavorBerryMap::~BerryFlavorBerryMap()
{

}

void
BerryFlavorBerryMap::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *potencyKey = "potency";

    if(object.has_key(potencyKey))
    {
        bourne::json value = object[potencyKey];



        jsonToValue(&potency, value, "int");


    }

    const char *berryKey = "berry";

    if(object.has_key(berryKey))
    {
        bourne::json value = object[berryKey];




        BerrySummary* obj = &berry;
		obj->fromJson(value.dump());

    }


}

bourne::json
BerryFlavorBerryMap::toJson()
{
    bourne::json object = bourne::json::object();





    object["potency"] = getPotency();







	object["berry"] = getBerry().toJson();


    return object;

}

int
BerryFlavorBerryMap::getPotency()
{
	return potency;
}

void
BerryFlavorBerryMap::setPotency(int potency)
{
	this->potency = potency;
}

BerrySummary
BerryFlavorBerryMap::getBerry()
{
	return berry;
}

void
BerryFlavorBerryMap::setBerry(BerrySummary berry)
{
	this->berry = berry;
}



