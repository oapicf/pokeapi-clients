

#include "MoveDetail_machines_inner.h"

using namespace Tiny;

MoveDetail_machines_inner::MoveDetail_machines_inner()
{
	machine = MoveDetail_machines_inner_machine();
	version_group = AbilityDetail_pokemon_inner_pokemon();
}

MoveDetail_machines_inner::MoveDetail_machines_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveDetail_machines_inner::~MoveDetail_machines_inner()
{

}

void
MoveDetail_machines_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *machineKey = "machine";

    if(object.has_key(machineKey))
    {
        bourne::json value = object[machineKey];




        MoveDetail_machines_inner_machine* obj = &machine;
		obj->fromJson(value.dump());

    }

    const char *version_groupKey = "version_group";

    if(object.has_key(version_groupKey))
    {
        bourne::json value = object[version_groupKey];




        AbilityDetail_pokemon_inner_pokemon* obj = &version_group;
		obj->fromJson(value.dump());

    }


}

bourne::json
MoveDetail_machines_inner::toJson()
{
    bourne::json object = bourne::json::object();






	object["machine"] = getMachine().toJson();






	object["version_group"] = getVersionGroup().toJson();


    return object;

}

MoveDetail_machines_inner_machine
MoveDetail_machines_inner::getMachine()
{
	return machine;
}

void
MoveDetail_machines_inner::setMachine(MoveDetail_machines_inner_machine  machine)
{
	this->machine = machine;
}

AbilityDetail_pokemon_inner_pokemon
MoveDetail_machines_inner::getVersionGroup()
{
	return version_group;
}

void
MoveDetail_machines_inner::setVersionGroup(AbilityDetail_pokemon_inner_pokemon  version_group)
{
	this->version_group = version_group;
}



