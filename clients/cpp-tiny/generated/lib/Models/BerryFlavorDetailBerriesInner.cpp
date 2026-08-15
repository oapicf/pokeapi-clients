

#include "BerryFlavorDetail_berries_inner.h"

using namespace Tiny;

BerryFlavorDetail_berries_inner::BerryFlavorDetail_berries_inner()
{
	potency = int(0);
	berry = BerryFlavorDetail_berries_inner_berry();
}

BerryFlavorDetail_berries_inner::BerryFlavorDetail_berries_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

BerryFlavorDetail_berries_inner::~BerryFlavorDetail_berries_inner()
{

}

void
BerryFlavorDetail_berries_inner::fromJson(std::string jsonObj)
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




        BerryFlavorDetail_berries_inner_berry* obj = &berry;
		obj->fromJson(value.dump());

    }


}

bourne::json
BerryFlavorDetail_berries_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["potency"] = getPotency();







	object["berry"] = getBerry().toJson();


    return object;

}

int
BerryFlavorDetail_berries_inner::getPotency()
{
	return potency;
}

void
BerryFlavorDetail_berries_inner::setPotency(int  potency)
{
	this->potency = potency;
}

BerryFlavorDetail_berries_inner_berry
BerryFlavorDetail_berries_inner::getBerry()
{
	return berry;
}

void
BerryFlavorDetail_berries_inner::setBerry(BerryFlavorDetail_berries_inner_berry  berry)
{
	this->berry = berry;
}



