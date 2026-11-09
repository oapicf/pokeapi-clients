/*
 * MoveMetaAilmentDetail.h
 *
 * 
 */

#ifndef _MoveMetaAilmentDetail_H_
#define _MoveMetaAilmentDetail_H_


#include <string>
#include "MoveMetaAilmentName.h"
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

class MoveMetaAilmentDetail : public Object {
public:
	/*! \brief Constructor.
	 */
	MoveMetaAilmentDetail();
	MoveMetaAilmentDetail(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MoveMetaAilmentDetail();

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
	/*! \brief Get A list of moves that cause this ailment.
	 */
	std::list<MoveSummary> getMoves();

	/*! \brief Set A list of moves that cause this ailment.
	 */
	void setMoves(std::list <MoveSummary> moves);
	/*! \brief Get The name of this resource listed in different languages.
	 */
	std::list<MoveMetaAilmentName> getNames();

	/*! \brief Set The name of this resource listed in different languages.
	 */
	void setNames(std::list <MoveMetaAilmentName> names);

private:
	int id;
	std::string name;
	std::list <MoveSummary>moves;
	std::list <MoveMetaAilmentName>names;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MoveMetaAilmentDetail_H_ */
