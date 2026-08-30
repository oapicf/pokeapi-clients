

#include "EncounterMethodDetail.h"

using namespace Tiny;

EncounterMethodDetail::EncounterMethodDetail()
{
	id = int(0);
	name = std::string();
	order = int(0);
	names = std::list<EncounterMethodName>();
}

EncounterMethodDetail::EncounterMethodDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

EncounterMethodDetail::~EncounterMethodDetail()
{

}

void
EncounterMethodDetail::fromJson(std::string jsonObj)
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

    const char *orderKey = "order";

    if(object.has_key(orderKey))
    {
        bourne::json value = object[orderKey];



        jsonToValue(&order, value, "int");


    }

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<EncounterMethodName> names_list;
        EncounterMethodName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }


}

bourne::json
EncounterMethodDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();






    object["order"] = getOrder();





    std::list<EncounterMethodName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        EncounterMethodName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;




    return object;

}

int
EncounterMethodDetail::getId()
{
	return id;
}

void
EncounterMethodDetail::setId(int id)
{
	this->id = id;
}

std::string
EncounterMethodDetail::getName()
{
	return name;
}

void
EncounterMethodDetail::setName(std::string name)
{
	this->name = name;
}

int
EncounterMethodDetail::getOrder()
{
	return order;
}

void
EncounterMethodDetail::setOrder(int order)
{
	this->order = order;
}

std::list<EncounterMethodName>
EncounterMethodDetail::getNames()
{
	return names;
}

void
EncounterMethodDetail::setNames(std::list<EncounterMethodName> names)
{
	this->names = names;
}



