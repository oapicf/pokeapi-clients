

#include "Experience.h"

using namespace Tiny;

Experience::Experience()
{
	level = int(0);
	experience = int(0);
}

Experience::Experience(std::string jsonString)
{
	this->fromJson(jsonString);
}

Experience::~Experience()
{

}

void
Experience::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *levelKey = "level";

    if(object.has_key(levelKey))
    {
        bourne::json value = object[levelKey];



        jsonToValue(&level, value, "int");


    }

    const char *experienceKey = "experience";

    if(object.has_key(experienceKey))
    {
        bourne::json value = object[experienceKey];



        jsonToValue(&experience, value, "int");


    }


}

bourne::json
Experience::toJson()
{
    bourne::json object = bourne::json::object();





    object["level"] = getLevel();






    object["experience"] = getExperience();



    return object;

}

int
Experience::getLevel()
{
	return level;
}

void
Experience::setLevel(int level)
{
	this->level = level;
}

int
Experience::getExperience()
{
	return experience;
}

void
Experience::setExperience(int experience)
{
	this->experience = experience;
}



