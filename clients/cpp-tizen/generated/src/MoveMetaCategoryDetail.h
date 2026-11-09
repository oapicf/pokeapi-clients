/*
 * MoveMetaCategoryDetail.h
 *
 * 
 */

#ifndef _MoveMetaCategoryDetail_H_
#define _MoveMetaCategoryDetail_H_


#include <string>
#include "MoveMetaCategoryDescription.h"
#include "MoveSummary.h"
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

class MoveMetaCategoryDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	MoveMetaCategoryDetail();
	MoveMetaCategoryDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MoveMetaCategoryDetail();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The identifier for this resource.
	 */
	int getId();

	/*! \brief Set The identifier for this resource.
	 */
	void setId(int  id);
	/*! \brief Get The name for this resource.
	 */
	std::string getName();

	/*! \brief Set The name for this resource.
	 */
	void setName(std::string  name);
	/*! \brief Get The description of this resource listed in different languages.
	 */
	std::list<MoveMetaCategoryDescription> getDescriptions();

	/*! \brief Set The description of this resource listed in different languages.
	 */
	void setDescriptions(std::list <MoveMetaCategoryDescription> descriptions);
	/*! \brief Get A list of moves that fall into this category.
	 */
	std::list<MoveSummary> getMoves();

	/*! \brief Set A list of moves that fall into this category.
	 */
	void setMoves(std::list <MoveSummary> moves);

private:
	int id;
	std::string name;
	std::list <MoveMetaCategoryDescription>descriptions;
	std::list <MoveSummary>moves;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MoveMetaCategoryDetail_H_ */
