

#include "EncounterConditionDetail.h"

using namespace Tiny;

EncounterConditionDetail::EncounterConditionDetail()
{
	id = int(0);
	name = std::string();
	values = std::list<EncounterConditionValueSummary>();
	names = std::list<EncounterConditionName>();
}

EncounterConditionDetail::EncounterConditionDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

EncounterConditionDetail::~EncounterConditionDetail()
{

}

void
EncounterConditionDetail::fromJson(std::string jsonObj)
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

    const char *valuesKey = "values";

    if(object.has_key(valuesKey))
    {
        bourne::json value = object[valuesKey];


        std::list<EncounterConditionValueSummary> values_list;
        EncounterConditionValueSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            values_list.push_back(element);
        }
        values = values_list;


    }

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<EncounterConditionName> names_list;
        EncounterConditionName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }


}

bourne::json
EncounterConditionDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();





    std::list<EncounterConditionValueSummary> values_list = getValues();
    bourne::json values_arr = bourne::json::array();

    for(auto& var : values_list)
    {
        EncounterConditionValueSummary obj = var;
        values_arr.append(obj.toJson());
    }
    object["values"] = values_arr;






    std::list<EncounterConditionName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        EncounterConditionName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;




    return object;

}

int
EncounterConditionDetail::getId()
{
	return id;
}

void
EncounterConditionDetail::setId(int  id)
{
	this->id = id;
}

std::string
EncounterConditionDetail::getName()
{
	return name;
}

void
EncounterConditionDetail::setName(std::string  name)
{
	this->name = name;
}

std::list<EncounterConditionValueSummary>
EncounterConditionDetail::getValues()
{
	return values;
}

void
EncounterConditionDetail::setValues(std::list <EncounterConditionValueSummary> values)
{
	this->values = values;
}

std::list<EncounterConditionName>
EncounterConditionDetail::getNames()
{
	return names;
}

void
EncounterConditionDetail::setNames(std::list <EncounterConditionName> names)
{
	this->names = names;
}



