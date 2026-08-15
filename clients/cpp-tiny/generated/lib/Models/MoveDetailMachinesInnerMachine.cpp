

#include "MoveDetail_machines_inner_machine.h"

using namespace Tiny;

MoveDetail_machines_inner_machine::MoveDetail_machines_inner_machine()
{
	url = std::string();
}

MoveDetail_machines_inner_machine::MoveDetail_machines_inner_machine(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveDetail_machines_inner_machine::~MoveDetail_machines_inner_machine()
{

}

void
MoveDetail_machines_inner_machine::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *urlKey = "url";

    if(object.has_key(urlKey))
    {
        bourne::json value = object[urlKey];



        jsonToValue(&url, value, "std::string");


    }


}

bourne::json
MoveDetail_machines_inner_machine::toJson()
{
    bourne::json object = bourne::json::object();





    object["url"] = getUrl();



    return object;

}

std::string
MoveDetail_machines_inner_machine::getUrl()
{
	return url;
}

void
MoveDetail_machines_inner_machine::setUrl(std::string  url)
{
	this->url = url;
}



