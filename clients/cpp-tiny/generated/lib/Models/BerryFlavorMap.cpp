

#include "BerryFlavorMap.h"

using namespace Tiny;

BerryFlavorMap::BerryFlavorMap()
{
	potency = int(0);
	flavor = null;
}

BerryFlavorMap::BerryFlavorMap(std::string jsonString)
{
	this->fromJson(jsonString);
}

BerryFlavorMap::~BerryFlavorMap()
{

}

void
BerryFlavorMap::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *potencyKey = "potency";

    if(object.has_key(potencyKey))
    {
        bourne::json value = object[potencyKey];



        jsonToValue(&potency, value, "int");


    }

    const char *flavorKey = "flavor";

    if(object.has_key(flavorKey))
    {
        bourne::json value = object[flavorKey];




        BerryFlavorSummary* obj = &flavor;
		obj->fromJson(value.dump());

    }


}

bourne::json
BerryFlavorMap::toJson()
{
    bourne::json object = bourne::json::object();





    object["potency"] = getPotency();







	object["flavor"] = getFlavor().toJson();


    return object;

}

int
BerryFlavorMap::getPotency()
{
	return potency;
}

void
BerryFlavorMap::setPotency(int potency)
{
	this->potency = potency;
}

BerryFlavorSummary
BerryFlavorMap::getFlavor()
{
	return flavor;
}

void
BerryFlavorMap::setFlavor(BerryFlavorSummary flavor)
{
	this->flavor = flavor;
}



