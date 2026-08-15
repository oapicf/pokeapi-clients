

#include "PokeathlonStatDetail.h"

using namespace Tiny;

PokeathlonStatDetail::PokeathlonStatDetail()
{
	id = int(0);
	name = std::string();
	affecting_natures = PokeathlonStatDetail_affecting_natures();
	names = std::list<PokeathlonStatName>();
}

PokeathlonStatDetail::PokeathlonStatDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokeathlonStatDetail::~PokeathlonStatDetail()
{

}

void
PokeathlonStatDetail::fromJson(std::string jsonObj)
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

    const char *affecting_naturesKey = "affecting_natures";

    if(object.has_key(affecting_naturesKey))
    {
        bourne::json value = object[affecting_naturesKey];




        PokeathlonStatDetail_affecting_natures* obj = &affecting_natures;
		obj->fromJson(value.dump());

    }

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<PokeathlonStatName> names_list;
        PokeathlonStatName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }


}

bourne::json
PokeathlonStatDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();







	object["affecting_natures"] = getAffectingNatures().toJson();




    std::list<PokeathlonStatName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        PokeathlonStatName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;




    return object;

}

int
PokeathlonStatDetail::getId()
{
	return id;
}

void
PokeathlonStatDetail::setId(int  id)
{
	this->id = id;
}

std::string
PokeathlonStatDetail::getName()
{
	return name;
}

void
PokeathlonStatDetail::setName(std::string  name)
{
	this->name = name;
}

PokeathlonStatDetail_affecting_natures
PokeathlonStatDetail::getAffectingNatures()
{
	return affecting_natures;
}

void
PokeathlonStatDetail::setAffectingNatures(PokeathlonStatDetail_affecting_natures  affecting_natures)
{
	this->affecting_natures = affecting_natures;
}

std::list<PokeathlonStatName>
PokeathlonStatDetail::getNames()
{
	return names;
}

void
PokeathlonStatDetail::setNames(std::list <PokeathlonStatName> names)
{
	this->names = names;
}



