#tag Class
Protected Class MovesApi
	#tag Method, Flags = &h0
		Sub MoveAilmentList(, Optional limit As Xoson.O.OptionalInteger, Optional offset As Xoson.O.OptionalInteger, Optional q As Xoson.O.OptionalString)
		  // Operation move_ailment_list
		  // List move meta ailments
		  // - 
		  // - parameter limit: (query) Number of results to return per page. (optional, default to 0)
		  // - parameter offset: (query) The initial index from which to return the results. (optional, default to 0)
		  // - parameter q: (query) &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional, default to Sample)
		  //
		  // Invokes MovesApiCallbackHandler.MoveAilmentListCallback(PaginatedMoveMetaAilmentSummaryList) on completion. 
		  //
		  // - GET /api/v2/move-ailment/
		  // - Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
		  // - defaultResponse: Nil
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: basicAuth
		  // - API Key:
		  //   - type: apiKey sessionid 
		  //   - name: cookieAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If limit <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("limit") + "=" + EncodeURLComponent(limit.ToString)
		  
		  If offset <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("offset") + "=" + EncodeURLComponent(offset.ToString)
		  
		  If q <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("q") + "=" + EncodeURLComponent(q)
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `MovesApi.ApiKeycookieAuth` before invoking `MovesApi.MoveAilmentList()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/move-ailment/"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.MoveAilmentList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.MoveAilmentList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function MoveAilmentListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PaginatedMoveMetaAilmentSummaryList) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PaginatedMoveMetaAilmentSummaryList
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub MoveAilmentList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PaginatedMoveMetaAilmentSummaryList
		  CallbackHandler.MoveAilmentListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub MoveAilmentList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PaginatedMoveMetaAilmentSummaryList
		  Call MoveAilmentListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.MoveAilmentListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub MoveAilmentRetrieve(, id As String)
		  // Operation move_ailment_retrieve
		  // Get move meta ailment
		  // - 
		  // - parameter id: (path) This parameter can be a string or an integer. 
		  //
		  // Invokes MovesApiCallbackHandler.MoveAilmentRetrieveCallback(MoveMetaAilmentDetail) on completion. 
		  //
		  // - GET /api/v2/move-ailment/{id}/
		  // - Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
		  // - defaultResponse: Nil
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: basicAuth
		  // - API Key:
		  //   - type: apiKey sessionid 
		  //   - name: cookieAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `MovesApi.ApiKeycookieAuth` before invoking `MovesApi.MoveAilmentRetrieve()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/move-ailment/{id}/"
		  
		  Dim localVarPathStringid As String = id
		  
		  localVarPath = localVarPath.ReplaceAllB("{id}", localVarPathStringid)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.MoveAilmentRetrieve_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.MoveAilmentRetrieve_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function MoveAilmentRetrievePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.MoveMetaAilmentDetail) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.MoveMetaAilmentDetail
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub MoveAilmentRetrieve_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.MoveMetaAilmentDetail
		  CallbackHandler.MoveAilmentRetrieveCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub MoveAilmentRetrieve_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.MoveMetaAilmentDetail
		  Call MoveAilmentRetrievePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.MoveAilmentRetrieveCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub MoveBattleStyleList(, Optional limit As Xoson.O.OptionalInteger, Optional offset As Xoson.O.OptionalInteger, Optional q As Xoson.O.OptionalString)
		  // Operation move_battle_style_list
		  // List move battle styles
		  // - 
		  // - parameter limit: (query) Number of results to return per page. (optional, default to 0)
		  // - parameter offset: (query) The initial index from which to return the results. (optional, default to 0)
		  // - parameter q: (query) &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional, default to Sample)
		  //
		  // Invokes MovesApiCallbackHandler.MoveBattleStyleListCallback(PaginatedMoveBattleStyleSummaryList) on completion. 
		  //
		  // - GET /api/v2/move-battle-style/
		  // - Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
		  // - defaultResponse: Nil
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: basicAuth
		  // - API Key:
		  //   - type: apiKey sessionid 
		  //   - name: cookieAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If limit <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("limit") + "=" + EncodeURLComponent(limit.ToString)
		  
		  If offset <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("offset") + "=" + EncodeURLComponent(offset.ToString)
		  
		  If q <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("q") + "=" + EncodeURLComponent(q)
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `MovesApi.ApiKeycookieAuth` before invoking `MovesApi.MoveBattleStyleList()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/move-battle-style/"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.MoveBattleStyleList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.MoveBattleStyleList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function MoveBattleStyleListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PaginatedMoveBattleStyleSummaryList) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PaginatedMoveBattleStyleSummaryList
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub MoveBattleStyleList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PaginatedMoveBattleStyleSummaryList
		  CallbackHandler.MoveBattleStyleListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub MoveBattleStyleList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PaginatedMoveBattleStyleSummaryList
		  Call MoveBattleStyleListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.MoveBattleStyleListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub MoveBattleStyleRetrieve(, id As String)
		  // Operation move_battle_style_retrieve
		  // Get move battle style
		  // - 
		  // - parameter id: (path) This parameter can be a string or an integer. 
		  //
		  // Invokes MovesApiCallbackHandler.MoveBattleStyleRetrieveCallback(MoveBattleStyleDetail) on completion. 
		  //
		  // - GET /api/v2/move-battle-style/{id}/
		  // - Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
		  // - defaultResponse: Nil
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: basicAuth
		  // - API Key:
		  //   - type: apiKey sessionid 
		  //   - name: cookieAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `MovesApi.ApiKeycookieAuth` before invoking `MovesApi.MoveBattleStyleRetrieve()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/move-battle-style/{id}/"
		  
		  Dim localVarPathStringid As String = id
		  
		  localVarPath = localVarPath.ReplaceAllB("{id}", localVarPathStringid)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.MoveBattleStyleRetrieve_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.MoveBattleStyleRetrieve_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function MoveBattleStyleRetrievePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.MoveBattleStyleDetail) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.MoveBattleStyleDetail
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub MoveBattleStyleRetrieve_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.MoveBattleStyleDetail
		  CallbackHandler.MoveBattleStyleRetrieveCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub MoveBattleStyleRetrieve_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.MoveBattleStyleDetail
		  Call MoveBattleStyleRetrievePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.MoveBattleStyleRetrieveCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub MoveCategoryList(, Optional limit As Xoson.O.OptionalInteger, Optional offset As Xoson.O.OptionalInteger, Optional q As Xoson.O.OptionalString)
		  // Operation move_category_list
		  // List move meta categories
		  // - 
		  // - parameter limit: (query) Number of results to return per page. (optional, default to 0)
		  // - parameter offset: (query) The initial index from which to return the results. (optional, default to 0)
		  // - parameter q: (query) &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional, default to Sample)
		  //
		  // Invokes MovesApiCallbackHandler.MoveCategoryListCallback(PaginatedMoveMetaCategorySummaryList) on completion. 
		  //
		  // - GET /api/v2/move-category/
		  // - Very general categories that loosely group move effects.
		  // - defaultResponse: Nil
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: basicAuth
		  // - API Key:
		  //   - type: apiKey sessionid 
		  //   - name: cookieAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If limit <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("limit") + "=" + EncodeURLComponent(limit.ToString)
		  
		  If offset <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("offset") + "=" + EncodeURLComponent(offset.ToString)
		  
		  If q <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("q") + "=" + EncodeURLComponent(q)
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `MovesApi.ApiKeycookieAuth` before invoking `MovesApi.MoveCategoryList()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/move-category/"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.MoveCategoryList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.MoveCategoryList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function MoveCategoryListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PaginatedMoveMetaCategorySummaryList) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PaginatedMoveMetaCategorySummaryList
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub MoveCategoryList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PaginatedMoveMetaCategorySummaryList
		  CallbackHandler.MoveCategoryListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub MoveCategoryList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PaginatedMoveMetaCategorySummaryList
		  Call MoveCategoryListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.MoveCategoryListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub MoveCategoryRetrieve(, id As String)
		  // Operation move_category_retrieve
		  // Get move meta category
		  // - 
		  // - parameter id: (path) This parameter can be a string or an integer. 
		  //
		  // Invokes MovesApiCallbackHandler.MoveCategoryRetrieveCallback(MoveMetaCategoryDetail) on completion. 
		  //
		  // - GET /api/v2/move-category/{id}/
		  // - Very general categories that loosely group move effects.
		  // - defaultResponse: Nil
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: basicAuth
		  // - API Key:
		  //   - type: apiKey sessionid 
		  //   - name: cookieAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `MovesApi.ApiKeycookieAuth` before invoking `MovesApi.MoveCategoryRetrieve()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/move-category/{id}/"
		  
		  Dim localVarPathStringid As String = id
		  
		  localVarPath = localVarPath.ReplaceAllB("{id}", localVarPathStringid)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.MoveCategoryRetrieve_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.MoveCategoryRetrieve_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function MoveCategoryRetrievePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.MoveMetaCategoryDetail) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.MoveMetaCategoryDetail
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub MoveCategoryRetrieve_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.MoveMetaCategoryDetail
		  CallbackHandler.MoveCategoryRetrieveCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub MoveCategoryRetrieve_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.MoveMetaCategoryDetail
		  Call MoveCategoryRetrievePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.MoveCategoryRetrieveCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub MoveLearnMethodList(, Optional limit As Xoson.O.OptionalInteger, Optional offset As Xoson.O.OptionalInteger, Optional q As Xoson.O.OptionalString)
		  // Operation move_learn_method_list
		  // List move learn methods
		  // - 
		  // - parameter limit: (query) Number of results to return per page. (optional, default to 0)
		  // - parameter offset: (query) The initial index from which to return the results. (optional, default to 0)
		  // - parameter q: (query) &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional, default to Sample)
		  //
		  // Invokes MovesApiCallbackHandler.MoveLearnMethodListCallback(PaginatedMoveLearnMethodSummaryList) on completion. 
		  //
		  // - GET /api/v2/move-learn-method/
		  // - Methods by which Pokémon can learn moves.
		  // - defaultResponse: Nil
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: basicAuth
		  // - API Key:
		  //   - type: apiKey sessionid 
		  //   - name: cookieAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If limit <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("limit") + "=" + EncodeURLComponent(limit.ToString)
		  
		  If offset <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("offset") + "=" + EncodeURLComponent(offset.ToString)
		  
		  If q <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("q") + "=" + EncodeURLComponent(q)
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `MovesApi.ApiKeycookieAuth` before invoking `MovesApi.MoveLearnMethodList()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/move-learn-method/"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.MoveLearnMethodList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.MoveLearnMethodList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function MoveLearnMethodListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PaginatedMoveLearnMethodSummaryList) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PaginatedMoveLearnMethodSummaryList
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub MoveLearnMethodList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PaginatedMoveLearnMethodSummaryList
		  CallbackHandler.MoveLearnMethodListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub MoveLearnMethodList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PaginatedMoveLearnMethodSummaryList
		  Call MoveLearnMethodListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.MoveLearnMethodListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub MoveLearnMethodRetrieve(, id As String)
		  // Operation move_learn_method_retrieve
		  // Get move learn method
		  // - 
		  // - parameter id: (path) This parameter can be a string or an integer. 
		  //
		  // Invokes MovesApiCallbackHandler.MoveLearnMethodRetrieveCallback(MoveLearnMethodDetail) on completion. 
		  //
		  // - GET /api/v2/move-learn-method/{id}/
		  // - Methods by which Pokémon can learn moves.
		  // - defaultResponse: Nil
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: basicAuth
		  // - API Key:
		  //   - type: apiKey sessionid 
		  //   - name: cookieAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `MovesApi.ApiKeycookieAuth` before invoking `MovesApi.MoveLearnMethodRetrieve()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/move-learn-method/{id}/"
		  
		  Dim localVarPathStringid As String = id
		  
		  localVarPath = localVarPath.ReplaceAllB("{id}", localVarPathStringid)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.MoveLearnMethodRetrieve_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.MoveLearnMethodRetrieve_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function MoveLearnMethodRetrievePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.MoveLearnMethodDetail) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.MoveLearnMethodDetail
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub MoveLearnMethodRetrieve_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.MoveLearnMethodDetail
		  CallbackHandler.MoveLearnMethodRetrieveCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub MoveLearnMethodRetrieve_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.MoveLearnMethodDetail
		  Call MoveLearnMethodRetrievePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.MoveLearnMethodRetrieveCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub MoveList(, Optional limit As Xoson.O.OptionalInteger, Optional offset As Xoson.O.OptionalInteger, Optional q As Xoson.O.OptionalString)
		  // Operation move_list
		  // List moves
		  // - 
		  // - parameter limit: (query) Number of results to return per page. (optional, default to 0)
		  // - parameter offset: (query) The initial index from which to return the results. (optional, default to 0)
		  // - parameter q: (query) &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional, default to Sample)
		  //
		  // Invokes MovesApiCallbackHandler.MoveListCallback(PaginatedMoveSummaryList) on completion. 
		  //
		  // - GET /api/v2/move/
		  // - Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
		  // - defaultResponse: Nil
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: basicAuth
		  // - API Key:
		  //   - type: apiKey sessionid 
		  //   - name: cookieAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If limit <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("limit") + "=" + EncodeURLComponent(limit.ToString)
		  
		  If offset <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("offset") + "=" + EncodeURLComponent(offset.ToString)
		  
		  If q <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("q") + "=" + EncodeURLComponent(q)
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `MovesApi.ApiKeycookieAuth` before invoking `MovesApi.MoveList()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/move/"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.MoveList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.MoveList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function MoveListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PaginatedMoveSummaryList) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PaginatedMoveSummaryList
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub MoveList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PaginatedMoveSummaryList
		  CallbackHandler.MoveListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub MoveList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PaginatedMoveSummaryList
		  Call MoveListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.MoveListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub MoveRetrieve(, id As String)
		  // Operation move_retrieve
		  // Get move
		  // - 
		  // - parameter id: (path) This parameter can be a string or an integer. 
		  //
		  // Invokes MovesApiCallbackHandler.MoveRetrieveCallback(MoveDetail) on completion. 
		  //
		  // - GET /api/v2/move/{id}/
		  // - Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
		  // - defaultResponse: Nil
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: basicAuth
		  // - API Key:
		  //   - type: apiKey sessionid 
		  //   - name: cookieAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `MovesApi.ApiKeycookieAuth` before invoking `MovesApi.MoveRetrieve()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/move/{id}/"
		  
		  Dim localVarPathStringid As String = id
		  
		  localVarPath = localVarPath.ReplaceAllB("{id}", localVarPathStringid)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.MoveRetrieve_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.MoveRetrieve_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function MoveRetrievePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.MoveDetail) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.MoveDetail
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub MoveRetrieve_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.MoveDetail
		  CallbackHandler.MoveRetrieveCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub MoveRetrieve_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.MoveDetail
		  Call MoveRetrievePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.MoveRetrieveCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub MoveTargetList(, Optional limit As Xoson.O.OptionalInteger, Optional offset As Xoson.O.OptionalInteger, Optional q As Xoson.O.OptionalString)
		  // Operation move_target_list
		  // List move targets
		  // - 
		  // - parameter limit: (query) Number of results to return per page. (optional, default to 0)
		  // - parameter offset: (query) The initial index from which to return the results. (optional, default to 0)
		  // - parameter q: (query) &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional, default to Sample)
		  //
		  // Invokes MovesApiCallbackHandler.MoveTargetListCallback(PaginatedMoveTargetSummaryList) on completion. 
		  //
		  // - GET /api/v2/move-target/
		  // - Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
		  // - defaultResponse: Nil
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: basicAuth
		  // - API Key:
		  //   - type: apiKey sessionid 
		  //   - name: cookieAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  Dim localVarQueryParams As String = "?"
		  If limit <> nil Then localVarQueryParams = localVarQueryParams + EncodeURLComponent("limit") + "=" + EncodeURLComponent(limit.ToString)
		  
		  If offset <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("offset") + "=" + EncodeURLComponent(offset.ToString)
		  
		  If q <> nil Then localVarQueryParams = localVarQueryParams + "&" + EncodeURLComponent("q") + "=" + EncodeURLComponent(q)
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `MovesApi.ApiKeycookieAuth` before invoking `MovesApi.MoveTargetList()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/move-target/"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.MoveTargetList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.MoveTargetList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function MoveTargetListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PaginatedMoveTargetSummaryList) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PaginatedMoveTargetSummaryList
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub MoveTargetList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PaginatedMoveTargetSummaryList
		  CallbackHandler.MoveTargetListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub MoveTargetList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PaginatedMoveTargetSummaryList
		  Call MoveTargetListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.MoveTargetListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub MoveTargetRetrieve(, id As String)
		  // Operation move_target_retrieve
		  // Get move target
		  // - 
		  // - parameter id: (path) This parameter can be a string or an integer. 
		  //
		  // Invokes MovesApiCallbackHandler.MoveTargetRetrieveCallback(MoveTargetDetail) on completion. 
		  //
		  // - GET /api/v2/move-target/{id}/
		  // - Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
		  // - defaultResponse: Nil
		  //
		  // - BASIC:
		  //   - type: http
		  //   - name: basicAuth
		  // - API Key:
		  //   - type: apiKey sessionid 
		  //   - name: cookieAuth
		  //
		  
		  Dim localVarHTTPSocket As New HTTPSecureSocket
		  Me.PrivateFuncPrepareSocket(localVarHTTPSocket)
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `MovesApi.ApiKeycookieAuth` before invoking `MovesApi.MoveTargetRetrieve()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/move-target/{id}/"
		  
		  Dim localVarPathStringid As String = id
		  
		  localVarPath = localVarPath.ReplaceAllB("{id}", localVarPathStringid)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.MoveTargetRetrieve_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.MoveTargetRetrieve_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function MoveTargetRetrievePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.MoveTargetDetail) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.MoveTargetDetail
			  Try
		        Xoson.fromJSON(outData, Content.toText())

		      Catch e As JSONException
		        error.Message = error.Message + " with JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xojo.Data.InvalidJSONException
		        error.Message = error.Message + " with Xojo.Data.JSON parse exception: " + e.Message
		        error.ErrorNumber = kErrorInvalidJSON
		        Return False
		        
		      Catch e As Xoson.XosonException
		        error.Message = error.Message + " with Xoson parse exception: " + e.Message
		        error.ErrorNumber = kErrorXosonProblem
		        Return False

		      End Try
		      
		      
		    ElseIf contentType.LeftB(19) = "multipart/form-data" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    ElseIf contentType.LeftB(33) = "application/x-www-form-urlencoded" then
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    Else
		      error.Message = "Unsupported media type: " + contentType
		      error.ErrorNumber = kErrorUnsupportedMediaType
		      Return False

		    End If
		  Else
		    error.Message = error.Message + ". " + Content
			error.ErrorNumber = kErrorHTTPFail
		    Return False
		  End If
		  
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub MoveTargetRetrieve_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.MoveTargetDetail
		  CallbackHandler.MoveTargetRetrieveCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub MoveTargetRetrieve_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.MoveTargetDetail
		  Call MoveTargetRetrievePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.MoveTargetRetrieveCallback(error, data)
		End Sub
	#tag EndMethod






	#tag Method, Flags = &h21
		Private Function AuthenticationRequired(Realm As String, Headers As InternetHeaders, ByRef Name As String, ByRef Password As String) As Boolean
		  #Pragma Unused Realm
		  #Pragma Unused Headers
		  Name = Me.BasicAuthUser
		  Password = Me.BasicAuthPassword
		  Return True
		End Function
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PrivateFuncPrepareSocket(socket As HTTPSecureSocket)
		  socket.Secure = Me.useHTTPS
		  socket.ConnectionType = SSLSocket.TLSv12
		  socket.Port = Me.Port
		  socket.RequestHeaders.Delete("Accept")
		  socket.RequestHeaders.AppendHeader("Accept", "text/plain")
		  socket.RequestHeaders.AppendHeader("Accept", "application/json")
		  socket.RequestHeaders.AppendHeader("Content-Type", "application/json")

		  If Me.AdditionalHeaders <> Nil Then
		    For Each HeaderName As Variant In Me.AdditionalHeaders.Keys
		      Dim headerValueS As Variant = additionalHeaders.Value(HeaderName)
		      If headerValueS.IsArray Then
		        If headerValueS.ArrayElementType = Variant.TypeString Then
		          Dim values() As String = headerValueS
		          For Each value As String In values
		            socket.RequestHeaders.AppendHeader(HeaderName, value)
		          Next
		        Else
		          Raise New OpenAPIClient.OpenAPIClientException(kErrorInternal, "AdditionalHeaders only support Strings and String arrays as values.")
		        End If
		      Else
		        socket.RequestHeaders.AppendHeader(HeaderName, headerValueS.StringValue)
		      End If
		    Next
		  End If
		End Sub
	#tag EndMethod



	#tag Property, Flags = &h0
		AdditionalHeaders As Dictionary
	#tag EndProperty

	#tag Property, Flags = &h0
		ApiKeycookieAuth As String
	#tag EndProperty

	#tag Property, Flags = &h0
		BasePath As String = "https://pokeapi.co"
	#tag EndProperty

	#tag Property, Flags = &h0
		BasicAuthPassword As String
	#tag EndProperty

	#tag Property, Flags = &h0
		BasicAuthUser As String
	#tag EndProperty

	#tag Property, Flags = &h0
		CallbackHandler As OpenAPIClient.APIs.MovesApiCallbackHandler
	#tag EndProperty

	#tag Property, Flags = &h0
		Host As String = ""
	#tag EndProperty

	#tag Property, Flags = &h0
		Port As Integer
	#tag EndProperty

	#tag Property, Flags = &h0
		UseHTTPS As Boolean = true
	#tag EndProperty


	#tag ViewBehavior
		#tag ViewProperty
			Name="Name"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="BasePath"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType="MultiLineEditor"
		#tag EndViewProperty
		#tag ViewProperty
			Name="BasicAuthUser"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType="MultiLineEditor"
		#tag EndViewProperty
		#tag ViewProperty
			Name="BasicAuthPassword"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType="MultiLineEditor"
		#tag EndViewProperty
		#tag ViewProperty
			Name="UseHTTPS"
			Visible=false
			Group="Behavior"
			InitialValue="true"
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Port"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Host"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType="MultiLineEditor"
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass
