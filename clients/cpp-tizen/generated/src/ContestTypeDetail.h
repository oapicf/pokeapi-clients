/*
 * ContestTypeDetail.h
 *
 * 
 */

#ifndef _ContestTypeDetail_H_
#define _ContestTypeDetail_H_


#include <string>
#include "BerryFlavorSummary.h"
#include "ContestTypeName.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ContestTypeDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	ContestTypeDetail();
	ContestTypeDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ContestTypeDetail();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int  id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	BerryFlavorSummary getBerryFlavor();

	/*! \brief Set 
	 */
	void setBerryFlavor(BerryFlavorSummary  berry_flavor);
	/*! \brief Get 
	 */
	std::list<ContestTypeName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <ContestTypeName> names);

private:
	int id;
	std::string name;
	BerryFlavorSummary berry_flavor;
	std::list <ContestTypeName>names;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ContestTypeDetail_H_ */
