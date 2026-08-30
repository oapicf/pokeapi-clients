

#include "BerryDetail_flavors_inner.h"

using namespace Tiny;

BerryDetail_flavors_inner::BerryDetail_flavors_inner()
{
	potency = int(0);
	flavor = BerryDetail_flavors_inner_flavor();
}

BerryDetail_flavors_inner::BerryDetail_flavors_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

BerryDetail_flavors_inner::~BerryDetail_flavors_inner()
{

}

void
BerryDetail_flavors_inner::fromJson(std::string jsonObj)
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




        BerryDetail_flavors_inner_flavor* obj = &flavor;
		obj->fromJson(value.dump());

    }


}

bourne::json
BerryDetail_flavors_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["potency"] = getPotency();







	object["flavor"] = getFlavor().toJson();


    return object;

}

int
BerryDetail_flavors_inner::getPotency()
{
	return potency;
}

void
BerryDetail_flavors_inner::setPotency(int potency)
{
	this->potency = potency;
}

BerryDetail_flavors_inner_flavor
BerryDetail_flavors_inner::getFlavor()
{
	return flavor;
}

void
BerryDetail_flavors_inner::setFlavor(BerryDetail_flavors_inner_flavor flavor)
{
	this->flavor = flavor;
}



