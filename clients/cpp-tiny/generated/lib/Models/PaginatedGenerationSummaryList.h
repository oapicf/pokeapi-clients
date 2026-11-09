
/*
 * PaginatedGenerationSummaryList.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_PaginatedGenerationSummaryList_H_
#define TINY_CPP_CLIENT_PaginatedGenerationSummaryList_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "GenerationSummary.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class PaginatedGenerationSummaryList{
public:

    /*! \brief Constructor.
	 */
    PaginatedGenerationSummaryList();
    PaginatedGenerationSummaryList(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~PaginatedGenerationSummaryList();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The total number of resources available from this API.
	 */
	int getCount();

	/*! \brief Set The total number of resources available from this API.
	 */
	void setCount(int count);
	/*! \brief Get The URL for the next page in the list, or null if there is no next page.
	 */
	std::string getNext();

	/*! \brief Set The URL for the next page in the list, or null if there is no next page.
	 */
	void setNext(std::string next);
	/*! \brief Get The URL for the previous page in the list, or null if there is no previous page.
	 */
	std::string getPrevious();

	/*! \brief Set The URL for the previous page in the list, or null if there is no previous page.
	 */
	void setPrevious(std::string previous);
	/*! \brief Get A list of API resources on this page.
	 */
	std::list<GenerationSummary> getResults();

	/*! \brief Set A list of API resources on this page.
	 */
	void setResults(std::list<GenerationSummary> results);


    private:
    int count{};
    std::string next{};
    std::string previous{};
    std::list<GenerationSummary> results;
};
}

#endif /* TINY_CPP_CLIENT_PaginatedGenerationSummaryList_H_ */
