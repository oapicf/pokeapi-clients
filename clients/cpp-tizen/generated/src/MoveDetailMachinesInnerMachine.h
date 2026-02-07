/*
 * MoveDetail_machines_inner_machine.h
 *
 * 
 */

#ifndef _MoveDetail_machines_inner_machine_H_
#define _MoveDetail_machines_inner_machine_H_


#include <string>
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

class MoveDetail_machines_inner_machine : public Object {
public:
	/*! \brief Constructor.
	 */
	MoveDetail_machines_inner_machine();
	MoveDetail_machines_inner_machine(char* str);

	/*! \brief Destructor.
	 */
	virtual ~MoveDetail_machines_inner_machine();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getUrl();

	/*! \brief Set 
	 */
	void setUrl(std::string  url);

private:
	std::string url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _MoveDetail_machines_inner_machine_H_ */
