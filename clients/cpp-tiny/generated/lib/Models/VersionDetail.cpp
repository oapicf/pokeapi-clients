

#include "VersionDetail.h"

using namespace Tiny;

VersionDetail::VersionDetail()
{
	id = int(0);
	name = std::string();
	names = std::list<VersionName>();
	version_group = VersionGroupSummary();
}

VersionDetail::VersionDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

VersionDetail::~VersionDetail()
{

}

void
VersionDetail::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "int");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<VersionName> names_list;
        VersionName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


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
VersionDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();





    std::list<VersionName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        VersionName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;








	object["version_group"] = getVersionGroup().toJson();


    return object;

}

int
VersionDetail::getId()
{
	return id;
}

void
VersionDetail::setId(int id)
{
	this->id = id;
}

std::string
VersionDetail::getName()
{
	return name;
}

void
VersionDetail::setName(std::string name)
{
	this->name = name;
}

std::list<VersionName>
VersionDetail::getNames()
{
	return names;
}

void
VersionDetail::setNames(std::list<VersionName> names)
{
	this->names = names;
}

VersionGroupSummary
VersionDetail::getVersionGroup()
{
	return version_group;
}

void
VersionDetail::setVersionGroup(VersionGroupSummary version_group)
{
	this->version_group = version_group;
}



