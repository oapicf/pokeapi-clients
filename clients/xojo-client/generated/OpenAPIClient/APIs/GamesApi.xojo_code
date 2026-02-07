#tag Class
Protected Class GamesApi
	#tag Method, Flags = &h0
		Sub GenerationList(, Optional limit As Xoson.O.OptionalInteger, Optional offset As Xoson.O.OptionalInteger, Optional q As Xoson.O.OptionalString)
		  // Operation generation_list
		  // List genrations
		  // - 
		  // - parameter limit: (query) Number of results to return per page. (optional, default to 0)
		  // - parameter offset: (query) The initial index from which to return the results. (optional, default to 0)
		  // - parameter q: (query) &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional, default to Sample)
		  //
		  // Invokes GamesApiCallbackHandler.GenerationListCallback(PaginatedGenerationSummaryList) on completion. 
		  //
		  // - GET /api/v2/generation/
		  // - A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
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
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `GamesApi.ApiKeycookieAuth` before invoking `GamesApi.GenerationList()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/generation/"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.GenerationList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.GenerationList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function GenerationListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PaginatedGenerationSummaryList) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PaginatedGenerationSummaryList
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
		Private Sub GenerationList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PaginatedGenerationSummaryList
		  CallbackHandler.GenerationListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GenerationList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PaginatedGenerationSummaryList
		  Call GenerationListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.GenerationListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub GenerationRetrieve(, id As String)
		  // Operation generation_retrieve
		  // Get genration
		  // - 
		  // - parameter id: (path) This parameter can be a string or an integer. 
		  //
		  // Invokes GamesApiCallbackHandler.GenerationRetrieveCallback(GenerationDetail) on completion. 
		  //
		  // - GET /api/v2/generation/{id}/
		  // - A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.
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
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `GamesApi.ApiKeycookieAuth` before invoking `GamesApi.GenerationRetrieve()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/generation/{id}/"
		  
		  Dim localVarPathStringid As String = id
		  
		  localVarPath = localVarPath.ReplaceAllB("{id}", localVarPathStringid)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.GenerationRetrieve_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.GenerationRetrieve_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function GenerationRetrievePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.GenerationDetail) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.GenerationDetail
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
		Private Sub GenerationRetrieve_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.GenerationDetail
		  CallbackHandler.GenerationRetrieveCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GenerationRetrieve_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.GenerationDetail
		  Call GenerationRetrievePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.GenerationRetrieveCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PokedexList(, Optional limit As Xoson.O.OptionalInteger, Optional offset As Xoson.O.OptionalInteger, Optional q As Xoson.O.OptionalString)
		  // Operation pokedex_list
		  // List pokedex
		  // - 
		  // - parameter limit: (query) Number of results to return per page. (optional, default to 0)
		  // - parameter offset: (query) The initial index from which to return the results. (optional, default to 0)
		  // - parameter q: (query) &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional, default to Sample)
		  //
		  // Invokes GamesApiCallbackHandler.PokedexListCallback(PaginatedPokedexSummaryList) on completion. 
		  //
		  // - GET /api/v2/pokedex/
		  // - A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
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
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `GamesApi.ApiKeycookieAuth` before invoking `GamesApi.PokedexList()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/pokedex/"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.PokedexList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PokedexList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function PokedexListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PaginatedPokedexSummaryList) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PaginatedPokedexSummaryList
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
		Private Sub PokedexList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PaginatedPokedexSummaryList
		  CallbackHandler.PokedexListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PokedexList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PaginatedPokedexSummaryList
		  Call PokedexListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.PokedexListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PokedexRetrieve(, id As String)
		  // Operation pokedex_retrieve
		  // Get pokedex
		  // - 
		  // - parameter id: (path) This parameter can be a string or an integer. 
		  //
		  // Invokes GamesApiCallbackHandler.PokedexRetrieveCallback(PokedexDetail) on completion. 
		  //
		  // - GET /api/v2/pokedex/{id}/
		  // - A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.
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
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `GamesApi.ApiKeycookieAuth` before invoking `GamesApi.PokedexRetrieve()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/pokedex/{id}/"
		  
		  Dim localVarPathStringid As String = id
		  
		  localVarPath = localVarPath.ReplaceAllB("{id}", localVarPathStringid)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.PokedexRetrieve_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PokedexRetrieve_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function PokedexRetrievePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PokedexDetail) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PokedexDetail
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
		Private Sub PokedexRetrieve_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PokedexDetail
		  CallbackHandler.PokedexRetrieveCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PokedexRetrieve_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PokedexDetail
		  Call PokedexRetrievePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.PokedexRetrieveCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub VersionGroupList(, Optional limit As Xoson.O.OptionalInteger, Optional offset As Xoson.O.OptionalInteger, Optional q As Xoson.O.OptionalString)
		  // Operation version_group_list
		  // List version groups
		  // - 
		  // - parameter limit: (query) Number of results to return per page. (optional, default to 0)
		  // - parameter offset: (query) The initial index from which to return the results. (optional, default to 0)
		  // - parameter q: (query) &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional, default to Sample)
		  //
		  // Invokes GamesApiCallbackHandler.VersionGroupListCallback(PaginatedVersionGroupSummaryList) on completion. 
		  //
		  // - GET /api/v2/version-group/
		  // - Version groups categorize highly similar versions of the games.
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
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `GamesApi.ApiKeycookieAuth` before invoking `GamesApi.VersionGroupList()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/version-group/"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.VersionGroupList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.VersionGroupList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function VersionGroupListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PaginatedVersionGroupSummaryList) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PaginatedVersionGroupSummaryList
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
		Private Sub VersionGroupList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PaginatedVersionGroupSummaryList
		  CallbackHandler.VersionGroupListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub VersionGroupList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PaginatedVersionGroupSummaryList
		  Call VersionGroupListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.VersionGroupListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub VersionGroupRetrieve(, id As String)
		  // Operation version_group_retrieve
		  // Get version group
		  // - 
		  // - parameter id: (path) This parameter can be a string or an integer. 
		  //
		  // Invokes GamesApiCallbackHandler.VersionGroupRetrieveCallback(VersionGroupDetail) on completion. 
		  //
		  // - GET /api/v2/version-group/{id}/
		  // - Version groups categorize highly similar versions of the games.
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
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `GamesApi.ApiKeycookieAuth` before invoking `GamesApi.VersionGroupRetrieve()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/version-group/{id}/"
		  
		  Dim localVarPathStringid As String = id
		  
		  localVarPath = localVarPath.ReplaceAllB("{id}", localVarPathStringid)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.VersionGroupRetrieve_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.VersionGroupRetrieve_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function VersionGroupRetrievePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.VersionGroupDetail) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.VersionGroupDetail
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
		Private Sub VersionGroupRetrieve_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.VersionGroupDetail
		  CallbackHandler.VersionGroupRetrieveCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub VersionGroupRetrieve_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.VersionGroupDetail
		  Call VersionGroupRetrievePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.VersionGroupRetrieveCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub VersionList(, Optional limit As Xoson.O.OptionalInteger, Optional offset As Xoson.O.OptionalInteger, Optional q As Xoson.O.OptionalString)
		  // Operation version_list
		  // List versions
		  // - 
		  // - parameter limit: (query) Number of results to return per page. (optional, default to 0)
		  // - parameter offset: (query) The initial index from which to return the results. (optional, default to 0)
		  // - parameter q: (query) &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional, default to Sample)
		  //
		  // Invokes GamesApiCallbackHandler.VersionListCallback(PaginatedVersionSummaryList) on completion. 
		  //
		  // - GET /api/v2/version/
		  // - Versions of the games, e.g., Red, Blue or Yellow.
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
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `GamesApi.ApiKeycookieAuth` before invoking `GamesApi.VersionList()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/version/"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.VersionList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.VersionList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function VersionListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PaginatedVersionSummaryList) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PaginatedVersionSummaryList
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
		Private Sub VersionList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PaginatedVersionSummaryList
		  CallbackHandler.VersionListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub VersionList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PaginatedVersionSummaryList
		  Call VersionListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.VersionListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub VersionRetrieve(, id As String)
		  // Operation version_retrieve
		  // Get version
		  // - 
		  // - parameter id: (path) This parameter can be a string or an integer. 
		  //
		  // Invokes GamesApiCallbackHandler.VersionRetrieveCallback(VersionDetail) on completion. 
		  //
		  // - GET /api/v2/version/{id}/
		  // - Versions of the games, e.g., Red, Blue or Yellow.
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
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `GamesApi.ApiKeycookieAuth` before invoking `GamesApi.VersionRetrieve()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/version/{id}/"
		  
		  Dim localVarPathStringid As String = id
		  
		  localVarPath = localVarPath.ReplaceAllB("{id}", localVarPathStringid)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.VersionRetrieve_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.VersionRetrieve_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function VersionRetrievePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.VersionDetail) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.VersionDetail
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
		Private Sub VersionRetrieve_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.VersionDetail
		  CallbackHandler.VersionRetrieveCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub VersionRetrieve_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.VersionDetail
		  Call VersionRetrievePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.VersionRetrieveCallback(error, data)
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
		CallbackHandler As OpenAPIClient.APIs.GamesApiCallbackHandler
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
