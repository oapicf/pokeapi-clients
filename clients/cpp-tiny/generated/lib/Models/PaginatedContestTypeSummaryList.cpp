

#include "PaginatedContestTypeSummaryList.h"

using namespace Tiny;

PaginatedContestTypeSummaryList::PaginatedContestTypeSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<ContestTypeSummary>();
}

PaginatedContestTypeSummaryList::PaginatedContestTypeSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedContestTypeSummaryList::~PaginatedContestTypeSummaryList()
{

}

void
PaginatedContestTypeSummaryList::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *countKey = "count";

    if(object.has_key(countKey))
    {
        bourne::json value = object[countKey];



        jsonToValue(&count, value, "int");


    }

    const char *nextKey = "next";

    if(object.has_key(nextKey))
    {
        bourne::json value = object[nextKey];



        jsonToValue(&next, value, "std::string");


    }

    const char *previousKey = "previous";

    if(object.has_key(previousKey))
    {
        bourne::json value = object[previousKey];



        jsonToValue(&previous, value, "std::string");


    }

    const char *resultsKey = "results";

    if(object.has_key(resultsKey))
    {
        bourne::json value = object[resultsKey];


        std::list<ContestTypeSummary> results_list;
        ContestTypeSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedContestTypeSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<ContestTypeSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        ContestTypeSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedContestTypeSummaryList::getCount()
{
	return count;
}

void
PaginatedContestTypeSummaryList::setCount(int count)
{
	this->count = count;
}

std::string
PaginatedContestTypeSummaryList::getNext()
{
	return next;
}

void
PaginatedContestTypeSummaryList::setNext(std::string next)
{
	this->next = next;
}

std::string
PaginatedContestTypeSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedContestTypeSummaryList::setPrevious(std::string previous)
{
	this->previous = previous;
}

std::list<ContestTypeSummary>
PaginatedContestTypeSummaryList::getResults()
{
	return results;
}

void
PaginatedContestTypeSummaryList::setResults(std::list<ContestTypeSummary> results)
{
	this->results = results;
}



