

#include "CurrencyDetail.h"

using namespace Tiny;

CurrencyDetail::CurrencyDetail()
{
	id = int(0);
	name = std::string();
	names = std::list<CurrencyName>();
}

CurrencyDetail::CurrencyDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

CurrencyDetail::~CurrencyDetail()
{

}

void
CurrencyDetail::fromJson(std::string jsonObj)
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


        std::list<CurrencyName> names_list;
        CurrencyName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }


}

bourne::json
CurrencyDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();





    std::list<CurrencyName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        CurrencyName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;




    return object;

}

int
CurrencyDetail::getId()
{
	return id;
}

void
CurrencyDetail::setId(int id)
{
	this->id = id;
}

std::string
CurrencyDetail::getName()
{
	return name;
}

void
CurrencyDetail::setName(std::string name)
{
	this->name = name;
}

std::list<CurrencyName>
CurrencyDetail::getNames()
{
	return names;
}

void
CurrencyDetail::setNames(std::list<CurrencyName> names)
{
	this->names = names;
}



