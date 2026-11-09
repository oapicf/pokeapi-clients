

#include "MoveCombos.h"

using namespace Tiny;

MoveCombos::MoveCombos()
{
	normal = null;
	super = null;
}

MoveCombos::MoveCombos(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveCombos::~MoveCombos()
{

}

void
MoveCombos::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *normalKey = "normal";

    if(object.has_key(normalKey))
    {
        bourne::json value = object[normalKey];




        MoveComboUsage* obj = &normal;
		obj->fromJson(value.dump());

    }

    const char *superKey = "super";

    if(object.has_key(superKey))
    {
        bourne::json value = object[superKey];




        MoveComboUsage* obj = &super;
		obj->fromJson(value.dump());

    }


}

bourne::json
MoveCombos::toJson()
{
    bourne::json object = bourne::json::object();






	object["normal"] = getNormal().toJson();






	object["super"] = getSuper().toJson();


    return object;

}

MoveComboUsage
MoveCombos::getNormal()
{
	return normal;
}

void
MoveCombos::setNormal(MoveComboUsage normal)
{
	this->normal = normal;
}

MoveComboUsage
MoveCombos::getSuper()
{
	return super;
}

void
MoveCombos::setSuper(MoveComboUsage super)
{
	this->super = super;
}



