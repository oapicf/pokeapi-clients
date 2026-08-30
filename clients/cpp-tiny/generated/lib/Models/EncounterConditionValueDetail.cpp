

#include "EncounterConditionValueDetail.h"

using namespace Tiny;

EncounterConditionValueDetail::EncounterConditionValueDetail()
{
	id = int(0);
	name = std::string();
	condition = EncounterConditionSummary();
	names = std::list<EncounterConditionValueName>();
}

EncounterConditionValueDetail::EncounterConditionValueDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

EncounterConditionValueDetail::~EncounterConditionValueDetail()
{

}

void
EncounterConditionValueDetail::fromJson(std::string jsonObj)
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

    const char *conditionKey = "condition";

    if(object.has_key(conditionKey))
    {
        bourne::json value = object[conditionKey];




        EncounterConditionSummary* obj = &condition;
		obj->fromJson(value.dump());

    }

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<EncounterConditionValueName> names_list;
        EncounterConditionValueName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }


}

bourne::json
EncounterConditionValueDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();







	object["condition"] = getCondition().toJson();




    std::list<EncounterConditionValueName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        EncounterConditionValueName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;




    return object;

}

int
EncounterConditionValueDetail::getId()
{
	return id;
}

void
EncounterConditionValueDetail::setId(int id)
{
	this->id = id;
}

std::string
EncounterConditionValueDetail::getName()
{
	return name;
}

void
EncounterConditionValueDetail::setName(std::string name)
{
	this->name = name;
}

EncounterConditionSummary
EncounterConditionValueDetail::getCondition()
{
	return condition;
}

void
EncounterConditionValueDetail::setCondition(EncounterConditionSummary condition)
{
	this->condition = condition;
}

std::list<EncounterConditionValueName>
EncounterConditionValueDetail::getNames()
{
	return names;
}

void
EncounterConditionValueDetail::setNames(std::list<EncounterConditionValueName> names)
{
	this->names = names;
}



