

#include "MoveComboUsage.h"

using namespace Tiny;

MoveComboUsage::MoveComboUsage()
{
	use_before = std::list<MoveSummary>();
	use_after = std::list<MoveSummary>();
}

MoveComboUsage::MoveComboUsage(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveComboUsage::~MoveComboUsage()
{

}

void
MoveComboUsage::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *use_beforeKey = "use_before";

    if(object.has_key(use_beforeKey))
    {
        bourne::json value = object[use_beforeKey];


        std::list<MoveSummary> use_before_list;
        MoveSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            use_before_list.push_back(element);
        }
        use_before = use_before_list;


    }

    const char *use_afterKey = "use_after";

    if(object.has_key(use_afterKey))
    {
        bourne::json value = object[use_afterKey];


        std::list<MoveSummary> use_after_list;
        MoveSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            use_after_list.push_back(element);
        }
        use_after = use_after_list;


    }


}

bourne::json
MoveComboUsage::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<MoveSummary> use_before_list = getUseBefore();
    bourne::json use_before_arr = bourne::json::array();

    for(auto& var : use_before_list)
    {
        MoveSummary obj = var;
        use_before_arr.append(obj.toJson());
    }
    object["use_before"] = use_before_arr;






    std::list<MoveSummary> use_after_list = getUseAfter();
    bourne::json use_after_arr = bourne::json::array();

    for(auto& var : use_after_list)
    {
        MoveSummary obj = var;
        use_after_arr.append(obj.toJson());
    }
    object["use_after"] = use_after_arr;




    return object;

}

std::list<MoveSummary>
MoveComboUsage::getUseBefore()
{
	return use_before;
}

void
MoveComboUsage::setUseBefore(std::list<MoveSummary> use_before)
{
	this->use_before = use_before;
}

std::list<MoveSummary>
MoveComboUsage::getUseAfter()
{
	return use_after;
}

void
MoveComboUsage::setUseAfter(std::list<MoveSummary> use_after)
{
	this->use_after = use_after;
}



