

#include "MoveBattleStyleDetail.h"

using namespace Tiny;

MoveBattleStyleDetail::MoveBattleStyleDetail()
{
	id = int(0);
	name = std::string();
	names = std::list<MoveBattleStyleName>();
}

MoveBattleStyleDetail::MoveBattleStyleDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveBattleStyleDetail::~MoveBattleStyleDetail()
{

}

void
MoveBattleStyleDetail::fromJson(std::string jsonObj)
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


        std::list<MoveBattleStyleName> names_list;
        MoveBattleStyleName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }


}

bourne::json
MoveBattleStyleDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();





    std::list<MoveBattleStyleName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        MoveBattleStyleName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;




    return object;

}

int
MoveBattleStyleDetail::getId()
{
	return id;
}

void
MoveBattleStyleDetail::setId(int  id)
{
	this->id = id;
}

std::string
MoveBattleStyleDetail::getName()
{
	return name;
}

void
MoveBattleStyleDetail::setName(std::string  name)
{
	this->name = name;
}

std::list<MoveBattleStyleName>
MoveBattleStyleDetail::getNames()
{
	return names;
}

void
MoveBattleStyleDetail::setNames(std::list <MoveBattleStyleName> names)
{
	this->names = names;
}



