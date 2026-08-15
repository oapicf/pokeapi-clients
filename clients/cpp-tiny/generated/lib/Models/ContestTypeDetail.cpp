

#include "ContestTypeDetail.h"

using namespace Tiny;

ContestTypeDetail::ContestTypeDetail()
{
	id = int(0);
	name = std::string();
	berry_flavor = null;
	names = std::list<ContestTypeName>();
}

ContestTypeDetail::ContestTypeDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

ContestTypeDetail::~ContestTypeDetail()
{

}

void
ContestTypeDetail::fromJson(std::string jsonObj)
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

    const char *berry_flavorKey = "berry_flavor";

    if(object.has_key(berry_flavorKey))
    {
        bourne::json value = object[berry_flavorKey];




        BerryFlavorSummary* obj = &berry_flavor;
		obj->fromJson(value.dump());

    }

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<ContestTypeName> names_list;
        ContestTypeName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }


}

bourne::json
ContestTypeDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();







	object["berry_flavor"] = getBerryFlavor().toJson();




    std::list<ContestTypeName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        ContestTypeName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;




    return object;

}

int
ContestTypeDetail::getId()
{
	return id;
}

void
ContestTypeDetail::setId(int  id)
{
	this->id = id;
}

std::string
ContestTypeDetail::getName()
{
	return name;
}

void
ContestTypeDetail::setName(std::string  name)
{
	this->name = name;
}

BerryFlavorSummary
ContestTypeDetail::getBerryFlavor()
{
	return berry_flavor;
}

void
ContestTypeDetail::setBerryFlavor(BerryFlavorSummary  berry_flavor)
{
	this->berry_flavor = berry_flavor;
}

std::list<ContestTypeName>
ContestTypeDetail::getNames()
{
	return names;
}

void
ContestTypeDetail::setNames(std::list <ContestTypeName> names)
{
	this->names = names;
}



