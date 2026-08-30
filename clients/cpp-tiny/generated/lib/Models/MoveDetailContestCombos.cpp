

#include "MoveDetail_contest_combos.h"

using namespace Tiny;

MoveDetail_contest_combos::MoveDetail_contest_combos()
{
	normal = MoveDetail_contest_combos_normal();
	super = MoveDetail_contest_combos_normal();
}

MoveDetail_contest_combos::MoveDetail_contest_combos(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveDetail_contest_combos::~MoveDetail_contest_combos()
{

}

void
MoveDetail_contest_combos::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *normalKey = "normal";

    if(object.has_key(normalKey))
    {
        bourne::json value = object[normalKey];




        MoveDetail_contest_combos_normal* obj = &normal;
		obj->fromJson(value.dump());

    }

    const char *superKey = "super";

    if(object.has_key(superKey))
    {
        bourne::json value = object[superKey];




        MoveDetail_contest_combos_normal* obj = &super;
		obj->fromJson(value.dump());

    }


}

bourne::json
MoveDetail_contest_combos::toJson()
{
    bourne::json object = bourne::json::object();






	object["normal"] = getNormal().toJson();






	object["super"] = getSuper().toJson();


    return object;

}

MoveDetail_contest_combos_normal
MoveDetail_contest_combos::getNormal()
{
	return normal;
}

void
MoveDetail_contest_combos::setNormal(MoveDetail_contest_combos_normal normal)
{
	this->normal = normal;
}

MoveDetail_contest_combos_normal
MoveDetail_contest_combos::getSuper()
{
	return super;
}

void
MoveDetail_contest_combos::setSuper(MoveDetail_contest_combos_normal super)
{
	this->super = super;
}



