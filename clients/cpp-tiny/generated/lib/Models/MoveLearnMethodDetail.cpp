

#include "MoveLearnMethodDetail.h"

using namespace Tiny;

MoveLearnMethodDetail::MoveLearnMethodDetail()
{
	id = int(0);
	name = std::string();
	names = std::list<MoveLearnMethodName>();
	descriptions = std::list<MoveLearnMethodDescription>();
	version_groups = std::list<AbilityDetail_pokemon_inner_pokemon>();
}

MoveLearnMethodDetail::MoveLearnMethodDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveLearnMethodDetail::~MoveLearnMethodDetail()
{

}

void
MoveLearnMethodDetail::fromJson(std::string jsonObj)
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


        std::list<MoveLearnMethodName> names_list;
        MoveLearnMethodName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }

    const char *descriptionsKey = "descriptions";

    if(object.has_key(descriptionsKey))
    {
        bourne::json value = object[descriptionsKey];


        std::list<MoveLearnMethodDescription> descriptions_list;
        MoveLearnMethodDescription element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            descriptions_list.push_back(element);
        }
        descriptions = descriptions_list;


    }

    const char *version_groupsKey = "version_groups";

    if(object.has_key(version_groupsKey))
    {
        bourne::json value = object[version_groupsKey];


        std::list<AbilityDetail_pokemon_inner_pokemon> version_groups_list;
        AbilityDetail_pokemon_inner_pokemon element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            version_groups_list.push_back(element);
        }
        version_groups = version_groups_list;


    }


}

bourne::json
MoveLearnMethodDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();





    std::list<MoveLearnMethodName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        MoveLearnMethodName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;






    std::list<MoveLearnMethodDescription> descriptions_list = getDescriptions();
    bourne::json descriptions_arr = bourne::json::array();

    for(auto& var : descriptions_list)
    {
        MoveLearnMethodDescription obj = var;
        descriptions_arr.append(obj.toJson());
    }
    object["descriptions"] = descriptions_arr;






    std::list<AbilityDetail_pokemon_inner_pokemon> version_groups_list = getVersionGroups();
    bourne::json version_groups_arr = bourne::json::array();

    for(auto& var : version_groups_list)
    {
        AbilityDetail_pokemon_inner_pokemon obj = var;
        version_groups_arr.append(obj.toJson());
    }
    object["version_groups"] = version_groups_arr;




    return object;

}

int
MoveLearnMethodDetail::getId()
{
	return id;
}

void
MoveLearnMethodDetail::setId(int  id)
{
	this->id = id;
}

std::string
MoveLearnMethodDetail::getName()
{
	return name;
}

void
MoveLearnMethodDetail::setName(std::string  name)
{
	this->name = name;
}

std::list<MoveLearnMethodName>
MoveLearnMethodDetail::getNames()
{
	return names;
}

void
MoveLearnMethodDetail::setNames(std::list <MoveLearnMethodName> names)
{
	this->names = names;
}

std::list<MoveLearnMethodDescription>
MoveLearnMethodDetail::getDescriptions()
{
	return descriptions;
}

void
MoveLearnMethodDetail::setDescriptions(std::list <MoveLearnMethodDescription> descriptions)
{
	this->descriptions = descriptions;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
MoveLearnMethodDetail::getVersionGroups()
{
	return version_groups;
}

void
MoveLearnMethodDetail::setVersionGroups(std::list <AbilityDetail_pokemon_inner_pokemon> version_groups)
{
	this->version_groups = version_groups;
}



