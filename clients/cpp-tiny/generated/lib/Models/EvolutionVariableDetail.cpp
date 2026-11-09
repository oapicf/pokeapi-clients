

#include "EvolutionVariableDetail.h"

using namespace Tiny;

EvolutionVariableDetail::EvolutionVariableDetail()
{
	id = int(0);
	name = std::string();
	symbol = std::string();
	data_type = std::string();
	source = std::string();
	version_group = null;
	names = std::list<EvolutionVariableName>();
	descriptions = std::list<EvolutionVariableDescription>();
}

EvolutionVariableDetail::EvolutionVariableDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

EvolutionVariableDetail::~EvolutionVariableDetail()
{

}

void
EvolutionVariableDetail::fromJson(std::string jsonObj)
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

    const char *symbolKey = "symbol";

    if(object.has_key(symbolKey))
    {
        bourne::json value = object[symbolKey];



        jsonToValue(&symbol, value, "std::string");


    }

    const char *data_typeKey = "data_type";

    if(object.has_key(data_typeKey))
    {
        bourne::json value = object[data_typeKey];



        jsonToValue(&data_type, value, "std::string");


    }

    const char *sourceKey = "source";

    if(object.has_key(sourceKey))
    {
        bourne::json value = object[sourceKey];



        jsonToValue(&source, value, "std::string");


    }

    const char *version_groupKey = "version_group";

    if(object.has_key(version_groupKey))
    {
        bourne::json value = object[version_groupKey];




        VersionGroupSummary* obj = &version_group;
		obj->fromJson(value.dump());

    }

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<EvolutionVariableName> names_list;
        EvolutionVariableName element;
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


        std::list<EvolutionVariableDescription> descriptions_list;
        EvolutionVariableDescription element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            descriptions_list.push_back(element);
        }
        descriptions = descriptions_list;


    }


}

bourne::json
EvolutionVariableDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();






    object["symbol"] = getSymbol();






    object["data_type"] = getDataType();






    object["source"] = getSource();







	object["version_group"] = getVersionGroup().toJson();




    std::list<EvolutionVariableName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        EvolutionVariableName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;






    std::list<EvolutionVariableDescription> descriptions_list = getDescriptions();
    bourne::json descriptions_arr = bourne::json::array();

    for(auto& var : descriptions_list)
    {
        EvolutionVariableDescription obj = var;
        descriptions_arr.append(obj.toJson());
    }
    object["descriptions"] = descriptions_arr;




    return object;

}

int
EvolutionVariableDetail::getId()
{
	return id;
}

void
EvolutionVariableDetail::setId(int id)
{
	this->id = id;
}

std::string
EvolutionVariableDetail::getName()
{
	return name;
}

void
EvolutionVariableDetail::setName(std::string name)
{
	this->name = name;
}

std::string
EvolutionVariableDetail::getSymbol()
{
	return symbol;
}

void
EvolutionVariableDetail::setSymbol(std::string symbol)
{
	this->symbol = symbol;
}

std::string
EvolutionVariableDetail::getDataType()
{
	return data_type;
}

void
EvolutionVariableDetail::setDataType(std::string data_type)
{
	this->data_type = data_type;
}

std::string
EvolutionVariableDetail::getSource()
{
	return source;
}

void
EvolutionVariableDetail::setSource(std::string source)
{
	this->source = source;
}

VersionGroupSummary
EvolutionVariableDetail::getVersionGroup()
{
	return version_group;
}

void
EvolutionVariableDetail::setVersionGroup(VersionGroupSummary version_group)
{
	this->version_group = version_group;
}

std::list<EvolutionVariableName>
EvolutionVariableDetail::getNames()
{
	return names;
}

void
EvolutionVariableDetail::setNames(std::list<EvolutionVariableName> names)
{
	this->names = names;
}

std::list<EvolutionVariableDescription>
EvolutionVariableDetail::getDescriptions()
{
	return descriptions;
}

void
EvolutionVariableDetail::setDescriptions(std::list<EvolutionVariableDescription> descriptions)
{
	this->descriptions = descriptions;
}



