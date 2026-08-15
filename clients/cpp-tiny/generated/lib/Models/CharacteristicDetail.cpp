

#include "CharacteristicDetail.h"

using namespace Tiny;

CharacteristicDetail::CharacteristicDetail()
{
	id = int(0);
	gene_modulo = int(0);
	possible_values = std::list<int>();
	highest_stat = StatSummary();
	descriptions = std::list<CharacteristicDescription>();
}

CharacteristicDetail::CharacteristicDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

CharacteristicDetail::~CharacteristicDetail()
{

}

void
CharacteristicDetail::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "int");


    }

    const char *gene_moduloKey = "gene_modulo";

    if(object.has_key(gene_moduloKey))
    {
        bourne::json value = object[gene_moduloKey];



        jsonToValue(&gene_modulo, value, "int");


    }

    const char *possible_valuesKey = "possible_values";

    if(object.has_key(possible_valuesKey))
    {
        bourne::json value = object[possible_valuesKey];


        std::list<int> possible_values_list;
        int element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "int");


            possible_values_list.push_back(element);
        }
        possible_values = possible_values_list;


    }

    const char *highest_statKey = "highest_stat";

    if(object.has_key(highest_statKey))
    {
        bourne::json value = object[highest_statKey];




        StatSummary* obj = &highest_stat;
		obj->fromJson(value.dump());

    }

    const char *descriptionsKey = "descriptions";

    if(object.has_key(descriptionsKey))
    {
        bourne::json value = object[descriptionsKey];


        std::list<CharacteristicDescription> descriptions_list;
        CharacteristicDescription element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            descriptions_list.push_back(element);
        }
        descriptions = descriptions_list;


    }


}

bourne::json
CharacteristicDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["gene_modulo"] = getGeneModulo();





    std::list<int> possible_values_list = getPossibleValues();
    bourne::json possible_values_arr = bourne::json::array();

    for(auto& var : possible_values_list)
    {
        possible_values_arr.append(var);
    }
    object["possible_values"] = possible_values_arr;










	object["highest_stat"] = getHighestStat().toJson();




    std::list<CharacteristicDescription> descriptions_list = getDescriptions();
    bourne::json descriptions_arr = bourne::json::array();

    for(auto& var : descriptions_list)
    {
        CharacteristicDescription obj = var;
        descriptions_arr.append(obj.toJson());
    }
    object["descriptions"] = descriptions_arr;




    return object;

}

int
CharacteristicDetail::getId()
{
	return id;
}

void
CharacteristicDetail::setId(int  id)
{
	this->id = id;
}

int
CharacteristicDetail::getGeneModulo()
{
	return gene_modulo;
}

void
CharacteristicDetail::setGeneModulo(int  gene_modulo)
{
	this->gene_modulo = gene_modulo;
}

std::list<int>
CharacteristicDetail::getPossibleValues()
{
	return possible_values;
}

void
CharacteristicDetail::setPossibleValues(std::list <int> possible_values)
{
	this->possible_values = possible_values;
}

StatSummary
CharacteristicDetail::getHighestStat()
{
	return highest_stat;
}

void
CharacteristicDetail::setHighestStat(StatSummary  highest_stat)
{
	this->highest_stat = highest_stat;
}

std::list<CharacteristicDescription>
CharacteristicDetail::getDescriptions()
{
	return descriptions;
}

void
CharacteristicDetail::setDescriptions(std::list <CharacteristicDescription> descriptions)
{
	this->descriptions = descriptions;
}



