

#include "ItemMachine.h"

using namespace Tiny;

ItemMachine::ItemMachine()
{
	machine = null;
	version_group = null;
}

ItemMachine::ItemMachine(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemMachine::~ItemMachine()
{

}

void
ItemMachine::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *machineKey = "machine";

    if(object.has_key(machineKey))
    {
        bourne::json value = object[machineKey];




        MachineSummary* obj = &machine;
		obj->fromJson(value.dump());

    }

    const char *version_groupKey = "version_group";

    if(object.has_key(version_groupKey))
    {
        bourne::json value = object[version_groupKey];




        VersionGroupSummary* obj = &version_group;
		obj->fromJson(value.dump());

    }


}

bourne::json
ItemMachine::toJson()
{
    bourne::json object = bourne::json::object();






	object["machine"] = getMachine().toJson();






	object["version_group"] = getVersionGroup().toJson();


    return object;

}

MachineSummary
ItemMachine::getMachine()
{
	return machine;
}

void
ItemMachine::setMachine(MachineSummary machine)
{
	this->machine = machine;
}

VersionGroupSummary
ItemMachine::getVersionGroup()
{
	return version_group;
}

void
ItemMachine::setVersionGroup(VersionGroupSummary version_group)
{
	this->version_group = version_group;
}



