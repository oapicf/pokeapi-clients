

#include "ItemDetail_machines_inner.h"

using namespace Tiny;

ItemDetail_machines_inner::ItemDetail_machines_inner()
{
	machine = std::string();
	version_group = AbilityDetail_pokemon_inner_pokemon();
}

ItemDetail_machines_inner::ItemDetail_machines_inner(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemDetail_machines_inner::~ItemDetail_machines_inner()
{

}

void
ItemDetail_machines_inner::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *machineKey = "machine";

    if(object.has_key(machineKey))
    {
        bourne::json value = object[machineKey];



        jsonToValue(&machine, value, "std::string");


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
ItemDetail_machines_inner::toJson()
{
    bourne::json object = bourne::json::object();





    object["machine"] = getMachine();







	object["version_group"] = getVersionGroup().toJson();


    return object;

}

std::string
ItemDetail_machines_inner::getMachine()
{
	return machine;
}

void
ItemDetail_machines_inner::setMachine(std::string machine)
{
	this->machine = machine;
}

AbilityDetail_pokemon_inner_pokemon
ItemDetail_machines_inner::getVersionGroup()
{
	return version_group;
}

void
ItemDetail_machines_inner::setVersionGroup(AbilityDetail_pokemon_inner_pokemon version_group)
{
	this->version_group = version_group;
}



