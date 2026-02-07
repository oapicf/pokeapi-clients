#tag Class
Protected Class PokemonApi
	#tag Method, Flags = &h0
		Sub AbilityList(, Optional limit As Xoson.O.OptionalInteger, Optional offset As Xoson.O.OptionalInteger, Optional q As Xoson.O.OptionalString)
		  // Operation ability_list
		  // - 
		  // - parameter limit: (query) Number of results to return per page. (optional, default to 0)
		  // - parameter offset: (query) The initial index from which to return the results. (optional, default to 0)
		  // - parameter q: (query) &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional, default to Sample)
		  //
		  // Invokes PokemonApiCallbackHandler.AbilityListCallback(PaginatedAbilitySummaryList) on completion. 
		  //
		  // - GET /api/v2/ability/
		  // - Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
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
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.AbilityList()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/ability/"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AbilityList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AbilityList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AbilityListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PaginatedAbilitySummaryList) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PaginatedAbilitySummaryList
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
		Private Sub AbilityList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PaginatedAbilitySummaryList
		  CallbackHandler.AbilityListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AbilityList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PaginatedAbilitySummaryList
		  Call AbilityListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AbilityListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub AbilityRetrieve(, id As String)
		  // Operation ability_retrieve
		  // - 
		  // - parameter id: (path) This parameter can be a string or an integer. 
		  //
		  // Invokes PokemonApiCallbackHandler.AbilityRetrieveCallback(AbilityDetail) on completion. 
		  //
		  // - GET /api/v2/ability/{id}/
		  // - Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.
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
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.AbilityRetrieve()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/ability/{id}/"
		  
		  Dim localVarPathStringid As String = id
		  
		  localVarPath = localVarPath.ReplaceAllB("{id}", localVarPathStringid)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.AbilityRetrieve_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.AbilityRetrieve_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function AbilityRetrievePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.AbilityDetail) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.AbilityDetail
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
		Private Sub AbilityRetrieve_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.AbilityDetail
		  CallbackHandler.AbilityRetrieveCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub AbilityRetrieve_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.AbilityDetail
		  Call AbilityRetrievePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.AbilityRetrieveCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub CharacteristicList(, Optional limit As Xoson.O.OptionalInteger, Optional offset As Xoson.O.OptionalInteger, Optional q As Xoson.O.OptionalString)
		  // Operation characteristic_list
		  // List charecterictics
		  // - 
		  // - parameter limit: (query) Number of results to return per page. (optional, default to 0)
		  // - parameter offset: (query) The initial index from which to return the results. (optional, default to 0)
		  // - parameter q: (query) &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional, default to Sample)
		  //
		  // Invokes PokemonApiCallbackHandler.CharacteristicListCallback(PaginatedCharacteristicSummaryList) on completion. 
		  //
		  // - GET /api/v2/characteristic/
		  // - Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
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
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.CharacteristicList()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/characteristic/"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.CharacteristicList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.CharacteristicList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function CharacteristicListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PaginatedCharacteristicSummaryList) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PaginatedCharacteristicSummaryList
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
		Private Sub CharacteristicList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PaginatedCharacteristicSummaryList
		  CallbackHandler.CharacteristicListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub CharacteristicList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PaginatedCharacteristicSummaryList
		  Call CharacteristicListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.CharacteristicListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub CharacteristicRetrieve(, id As String)
		  // Operation characteristic_retrieve
		  // Get characteristic
		  // - 
		  // - parameter id: (path) This parameter can be a string or an integer. 
		  //
		  // Invokes PokemonApiCallbackHandler.CharacteristicRetrieveCallback(CharacteristicDetail) on completion. 
		  //
		  // - GET /api/v2/characteristic/{id}/
		  // - Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.
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
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.CharacteristicRetrieve()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/characteristic/{id}/"
		  
		  Dim localVarPathStringid As String = id
		  
		  localVarPath = localVarPath.ReplaceAllB("{id}", localVarPathStringid)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.CharacteristicRetrieve_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.CharacteristicRetrieve_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function CharacteristicRetrievePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.CharacteristicDetail) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.CharacteristicDetail
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
		Private Sub CharacteristicRetrieve_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.CharacteristicDetail
		  CallbackHandler.CharacteristicRetrieveCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub CharacteristicRetrieve_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.CharacteristicDetail
		  Call CharacteristicRetrievePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.CharacteristicRetrieveCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub EggGroupList(, Optional limit As Xoson.O.OptionalInteger, Optional offset As Xoson.O.OptionalInteger, Optional q As Xoson.O.OptionalString)
		  // Operation egg_group_list
		  // List egg groups
		  // - 
		  // - parameter limit: (query) Number of results to return per page. (optional, default to 0)
		  // - parameter offset: (query) The initial index from which to return the results. (optional, default to 0)
		  // - parameter q: (query) &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional, default to Sample)
		  //
		  // Invokes PokemonApiCallbackHandler.EggGroupListCallback(PaginatedEggGroupSummaryList) on completion. 
		  //
		  // - GET /api/v2/egg-group/
		  // - Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
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
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.EggGroupList()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/egg-group/"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.EggGroupList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.EggGroupList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function EggGroupListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PaginatedEggGroupSummaryList) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PaginatedEggGroupSummaryList
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
		Private Sub EggGroupList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PaginatedEggGroupSummaryList
		  CallbackHandler.EggGroupListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub EggGroupList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PaginatedEggGroupSummaryList
		  Call EggGroupListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.EggGroupListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub EggGroupRetrieve(, id As String)
		  // Operation egg_group_retrieve
		  // Get egg group
		  // - 
		  // - parameter id: (path) This parameter can be a string or an integer. 
		  //
		  // Invokes PokemonApiCallbackHandler.EggGroupRetrieveCallback(EggGroupDetail) on completion. 
		  //
		  // - GET /api/v2/egg-group/{id}/
		  // - Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.
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
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.EggGroupRetrieve()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/egg-group/{id}/"
		  
		  Dim localVarPathStringid As String = id
		  
		  localVarPath = localVarPath.ReplaceAllB("{id}", localVarPathStringid)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.EggGroupRetrieve_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.EggGroupRetrieve_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function EggGroupRetrievePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.EggGroupDetail) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.EggGroupDetail
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
		Private Sub EggGroupRetrieve_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.EggGroupDetail
		  CallbackHandler.EggGroupRetrieveCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub EggGroupRetrieve_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.EggGroupDetail
		  Call EggGroupRetrievePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.EggGroupRetrieveCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub GenderList(, Optional limit As Xoson.O.OptionalInteger, Optional offset As Xoson.O.OptionalInteger, Optional q As Xoson.O.OptionalString)
		  // Operation gender_list
		  // List genders
		  // - 
		  // - parameter limit: (query) Number of results to return per page. (optional, default to 0)
		  // - parameter offset: (query) The initial index from which to return the results. (optional, default to 0)
		  // - parameter q: (query) &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional, default to Sample)
		  //
		  // Invokes PokemonApiCallbackHandler.GenderListCallback(PaginatedGenderSummaryList) on completion. 
		  //
		  // - GET /api/v2/gender/
		  // - Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
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
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.GenderList()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/gender/"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.GenderList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.GenderList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function GenderListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PaginatedGenderSummaryList) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PaginatedGenderSummaryList
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
		Private Sub GenderList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PaginatedGenderSummaryList
		  CallbackHandler.GenderListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GenderList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PaginatedGenderSummaryList
		  Call GenderListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.GenderListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub GenderRetrieve(, id As String)
		  // Operation gender_retrieve
		  // Get gender
		  // - 
		  // - parameter id: (path) This parameter can be a string or an integer. 
		  //
		  // Invokes PokemonApiCallbackHandler.GenderRetrieveCallback(GenderDetail) on completion. 
		  //
		  // - GET /api/v2/gender/{id}/
		  // - Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.
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
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.GenderRetrieve()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/gender/{id}/"
		  
		  Dim localVarPathStringid As String = id
		  
		  localVarPath = localVarPath.ReplaceAllB("{id}", localVarPathStringid)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.GenderRetrieve_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.GenderRetrieve_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function GenderRetrievePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.GenderDetail) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.GenderDetail
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
		Private Sub GenderRetrieve_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.GenderDetail
		  CallbackHandler.GenderRetrieveCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GenderRetrieve_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.GenderDetail
		  Call GenderRetrievePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.GenderRetrieveCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub GrowthRateList(, Optional limit As Xoson.O.OptionalInteger, Optional offset As Xoson.O.OptionalInteger, Optional q As Xoson.O.OptionalString)
		  // Operation growth_rate_list
		  // List growth rates
		  // - 
		  // - parameter limit: (query) Number of results to return per page. (optional, default to 0)
		  // - parameter offset: (query) The initial index from which to return the results. (optional, default to 0)
		  // - parameter q: (query) &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional, default to Sample)
		  //
		  // Invokes PokemonApiCallbackHandler.GrowthRateListCallback(PaginatedGrowthRateSummaryList) on completion. 
		  //
		  // - GET /api/v2/growth-rate/
		  // - Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
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
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.GrowthRateList()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/growth-rate/"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.GrowthRateList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.GrowthRateList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function GrowthRateListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PaginatedGrowthRateSummaryList) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PaginatedGrowthRateSummaryList
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
		Private Sub GrowthRateList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PaginatedGrowthRateSummaryList
		  CallbackHandler.GrowthRateListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GrowthRateList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PaginatedGrowthRateSummaryList
		  Call GrowthRateListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.GrowthRateListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub GrowthRateRetrieve(, id As String)
		  // Operation growth_rate_retrieve
		  // Get growth rate
		  // - 
		  // - parameter id: (path) This parameter can be a string or an integer. 
		  //
		  // Invokes PokemonApiCallbackHandler.GrowthRateRetrieveCallback(GrowthRateDetail) on completion. 
		  //
		  // - GET /api/v2/growth-rate/{id}/
		  // - Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.
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
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.GrowthRateRetrieve()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/growth-rate/{id}/"
		  
		  Dim localVarPathStringid As String = id
		  
		  localVarPath = localVarPath.ReplaceAllB("{id}", localVarPathStringid)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.GrowthRateRetrieve_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.GrowthRateRetrieve_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function GrowthRateRetrievePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.GrowthRateDetail) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.GrowthRateDetail
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
		Private Sub GrowthRateRetrieve_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.GrowthRateDetail
		  CallbackHandler.GrowthRateRetrieveCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub GrowthRateRetrieve_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.GrowthRateDetail
		  Call GrowthRateRetrievePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.GrowthRateRetrieveCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub MoveDamageClassList(, Optional limit As Xoson.O.OptionalInteger, Optional offset As Xoson.O.OptionalInteger, Optional q As Xoson.O.OptionalString)
		  // Operation move_damage_class_list
		  // List move damage classes
		  // - 
		  // - parameter limit: (query) Number of results to return per page. (optional, default to 0)
		  // - parameter offset: (query) The initial index from which to return the results. (optional, default to 0)
		  // - parameter q: (query) &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional, default to Sample)
		  //
		  // Invokes PokemonApiCallbackHandler.MoveDamageClassListCallback(PaginatedMoveDamageClassSummaryList) on completion. 
		  //
		  // - GET /api/v2/move-damage-class/
		  // - Damage classes moves can have, e.g. physical, special, or non-damaging.
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
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.MoveDamageClassList()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/move-damage-class/"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.MoveDamageClassList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.MoveDamageClassList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function MoveDamageClassListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PaginatedMoveDamageClassSummaryList) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PaginatedMoveDamageClassSummaryList
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
		Private Sub MoveDamageClassList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PaginatedMoveDamageClassSummaryList
		  CallbackHandler.MoveDamageClassListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub MoveDamageClassList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PaginatedMoveDamageClassSummaryList
		  Call MoveDamageClassListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.MoveDamageClassListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub MoveDamageClassRetrieve(, id As String)
		  // Operation move_damage_class_retrieve
		  // Get move damage class
		  // - 
		  // - parameter id: (path) This parameter can be a string or an integer. 
		  //
		  // Invokes PokemonApiCallbackHandler.MoveDamageClassRetrieveCallback(MoveDamageClassDetail) on completion. 
		  //
		  // - GET /api/v2/move-damage-class/{id}/
		  // - Damage classes moves can have, e.g. physical, special, or non-damaging.
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
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.MoveDamageClassRetrieve()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/move-damage-class/{id}/"
		  
		  Dim localVarPathStringid As String = id
		  
		  localVarPath = localVarPath.ReplaceAllB("{id}", localVarPathStringid)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.MoveDamageClassRetrieve_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.MoveDamageClassRetrieve_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function MoveDamageClassRetrievePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.MoveDamageClassDetail) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.MoveDamageClassDetail
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
		Private Sub MoveDamageClassRetrieve_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.MoveDamageClassDetail
		  CallbackHandler.MoveDamageClassRetrieveCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub MoveDamageClassRetrieve_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.MoveDamageClassDetail
		  Call MoveDamageClassRetrievePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.MoveDamageClassRetrieveCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub NatureList(, Optional limit As Xoson.O.OptionalInteger, Optional offset As Xoson.O.OptionalInteger, Optional q As Xoson.O.OptionalString)
		  // Operation nature_list
		  // List natures
		  // - 
		  // - parameter limit: (query) Number of results to return per page. (optional, default to 0)
		  // - parameter offset: (query) The initial index from which to return the results. (optional, default to 0)
		  // - parameter q: (query) &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional, default to Sample)
		  //
		  // Invokes PokemonApiCallbackHandler.NatureListCallback(PaginatedNatureSummaryList) on completion. 
		  //
		  // - GET /api/v2/nature/
		  // - Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
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
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.NatureList()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/nature/"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.NatureList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.NatureList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function NatureListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PaginatedNatureSummaryList) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PaginatedNatureSummaryList
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
		Private Sub NatureList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PaginatedNatureSummaryList
		  CallbackHandler.NatureListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub NatureList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PaginatedNatureSummaryList
		  Call NatureListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.NatureListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub NatureRetrieve(, id As String)
		  // Operation nature_retrieve
		  // Get nature
		  // - 
		  // - parameter id: (path) This parameter can be a string or an integer. 
		  //
		  // Invokes PokemonApiCallbackHandler.NatureRetrieveCallback(NatureDetail) on completion. 
		  //
		  // - GET /api/v2/nature/{id}/
		  // - Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.
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
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.NatureRetrieve()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/nature/{id}/"
		  
		  Dim localVarPathStringid As String = id
		  
		  localVarPath = localVarPath.ReplaceAllB("{id}", localVarPathStringid)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.NatureRetrieve_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.NatureRetrieve_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function NatureRetrievePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.NatureDetail) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.NatureDetail
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
		Private Sub NatureRetrieve_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.NatureDetail
		  CallbackHandler.NatureRetrieveCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub NatureRetrieve_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.NatureDetail
		  Call NatureRetrievePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.NatureRetrieveCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PokeathlonStatList(, Optional limit As Xoson.O.OptionalInteger, Optional offset As Xoson.O.OptionalInteger, Optional q As Xoson.O.OptionalString)
		  // Operation pokeathlon_stat_list
		  // List pokeathlon stats
		  // - 
		  // - parameter limit: (query) Number of results to return per page. (optional, default to 0)
		  // - parameter offset: (query) The initial index from which to return the results. (optional, default to 0)
		  // - parameter q: (query) &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional, default to Sample)
		  //
		  // Invokes PokemonApiCallbackHandler.PokeathlonStatListCallback(PaginatedPokeathlonStatSummaryList) on completion. 
		  //
		  // - GET /api/v2/pokeathlon-stat/
		  // - Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
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
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.PokeathlonStatList()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/pokeathlon-stat/"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.PokeathlonStatList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PokeathlonStatList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function PokeathlonStatListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PaginatedPokeathlonStatSummaryList) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PaginatedPokeathlonStatSummaryList
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
		Private Sub PokeathlonStatList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PaginatedPokeathlonStatSummaryList
		  CallbackHandler.PokeathlonStatListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PokeathlonStatList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PaginatedPokeathlonStatSummaryList
		  Call PokeathlonStatListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.PokeathlonStatListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PokeathlonStatRetrieve(, id As String)
		  // Operation pokeathlon_stat_retrieve
		  // Get pokeathlon stat
		  // - 
		  // - parameter id: (path) This parameter can be a string or an integer. 
		  //
		  // Invokes PokemonApiCallbackHandler.PokeathlonStatRetrieveCallback(PokeathlonStatDetail) on completion. 
		  //
		  // - GET /api/v2/pokeathlon-stat/{id}/
		  // - Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.
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
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.PokeathlonStatRetrieve()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/pokeathlon-stat/{id}/"
		  
		  Dim localVarPathStringid As String = id
		  
		  localVarPath = localVarPath.ReplaceAllB("{id}", localVarPathStringid)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.PokeathlonStatRetrieve_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PokeathlonStatRetrieve_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function PokeathlonStatRetrievePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PokeathlonStatDetail) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PokeathlonStatDetail
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
		Private Sub PokeathlonStatRetrieve_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PokeathlonStatDetail
		  CallbackHandler.PokeathlonStatRetrieveCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PokeathlonStatRetrieve_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PokeathlonStatDetail
		  Call PokeathlonStatRetrievePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.PokeathlonStatRetrieveCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PokemonColorList(, Optional limit As Xoson.O.OptionalInteger, Optional offset As Xoson.O.OptionalInteger, Optional q As Xoson.O.OptionalString)
		  // Operation pokemon_color_list
		  // List pokemon colors
		  // - 
		  // - parameter limit: (query) Number of results to return per page. (optional, default to 0)
		  // - parameter offset: (query) The initial index from which to return the results. (optional, default to 0)
		  // - parameter q: (query) &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional, default to Sample)
		  //
		  // Invokes PokemonApiCallbackHandler.PokemonColorListCallback(PaginatedPokemonColorSummaryList) on completion. 
		  //
		  // - GET /api/v2/pokemon-color/
		  // - Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
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
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.PokemonColorList()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/pokemon-color/"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.PokemonColorList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PokemonColorList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function PokemonColorListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PaginatedPokemonColorSummaryList) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PaginatedPokemonColorSummaryList
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
		Private Sub PokemonColorList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PaginatedPokemonColorSummaryList
		  CallbackHandler.PokemonColorListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PokemonColorList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PaginatedPokemonColorSummaryList
		  Call PokemonColorListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.PokemonColorListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PokemonColorRetrieve(, id As String)
		  // Operation pokemon_color_retrieve
		  // Get pokemon color
		  // - 
		  // - parameter id: (path) This parameter can be a string or an integer. 
		  //
		  // Invokes PokemonApiCallbackHandler.PokemonColorRetrieveCallback(PokemonColorDetail) on completion. 
		  //
		  // - GET /api/v2/pokemon-color/{id}/
		  // - Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.
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
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.PokemonColorRetrieve()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/pokemon-color/{id}/"
		  
		  Dim localVarPathStringid As String = id
		  
		  localVarPath = localVarPath.ReplaceAllB("{id}", localVarPathStringid)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.PokemonColorRetrieve_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PokemonColorRetrieve_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function PokemonColorRetrievePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PokemonColorDetail) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PokemonColorDetail
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
		Private Sub PokemonColorRetrieve_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PokemonColorDetail
		  CallbackHandler.PokemonColorRetrieveCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PokemonColorRetrieve_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PokemonColorDetail
		  Call PokemonColorRetrievePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.PokemonColorRetrieveCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PokemonFormList(, Optional limit As Xoson.O.OptionalInteger, Optional offset As Xoson.O.OptionalInteger, Optional q As Xoson.O.OptionalString)
		  // Operation pokemon_form_list
		  // List pokemon forms
		  // - 
		  // - parameter limit: (query) Number of results to return per page. (optional, default to 0)
		  // - parameter offset: (query) The initial index from which to return the results. (optional, default to 0)
		  // - parameter q: (query) &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional, default to Sample)
		  //
		  // Invokes PokemonApiCallbackHandler.PokemonFormListCallback(PaginatedPokemonFormSummaryList) on completion. 
		  //
		  // - GET /api/v2/pokemon-form/
		  // - Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.
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
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.PokemonFormList()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/pokemon-form/"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.PokemonFormList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PokemonFormList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function PokemonFormListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PaginatedPokemonFormSummaryList) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PaginatedPokemonFormSummaryList
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
		Private Sub PokemonFormList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PaginatedPokemonFormSummaryList
		  CallbackHandler.PokemonFormListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PokemonFormList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PaginatedPokemonFormSummaryList
		  Call PokemonFormListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.PokemonFormListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PokemonFormRetrieve(, id As String)
		  // Operation pokemon_form_retrieve
		  // Get pokemon form
		  // - 
		  // - parameter id: (path) This parameter can be a string or an integer. 
		  //
		  // Invokes PokemonApiCallbackHandler.PokemonFormRetrieveCallback(PokemonFormDetail) on completion. 
		  //
		  // - GET /api/v2/pokemon-form/{id}/
		  // - Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.
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
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.PokemonFormRetrieve()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/pokemon-form/{id}/"
		  
		  Dim localVarPathStringid As String = id
		  
		  localVarPath = localVarPath.ReplaceAllB("{id}", localVarPathStringid)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.PokemonFormRetrieve_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PokemonFormRetrieve_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function PokemonFormRetrievePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PokemonFormDetail) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PokemonFormDetail
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
		Private Sub PokemonFormRetrieve_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PokemonFormDetail
		  CallbackHandler.PokemonFormRetrieveCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PokemonFormRetrieve_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PokemonFormDetail
		  Call PokemonFormRetrievePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.PokemonFormRetrieveCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PokemonHabitatList(, Optional limit As Xoson.O.OptionalInteger, Optional offset As Xoson.O.OptionalInteger, Optional q As Xoson.O.OptionalString)
		  // Operation pokemon_habitat_list
		  // List pokemom habitas
		  // - 
		  // - parameter limit: (query) Number of results to return per page. (optional, default to 0)
		  // - parameter offset: (query) The initial index from which to return the results. (optional, default to 0)
		  // - parameter q: (query) &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional, default to Sample)
		  //
		  // Invokes PokemonApiCallbackHandler.PokemonHabitatListCallback(PaginatedPokemonHabitatSummaryList) on completion. 
		  //
		  // - GET /api/v2/pokemon-habitat/
		  // - Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
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
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.PokemonHabitatList()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/pokemon-habitat/"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.PokemonHabitatList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PokemonHabitatList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function PokemonHabitatListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PaginatedPokemonHabitatSummaryList) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PaginatedPokemonHabitatSummaryList
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
		Private Sub PokemonHabitatList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PaginatedPokemonHabitatSummaryList
		  CallbackHandler.PokemonHabitatListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PokemonHabitatList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PaginatedPokemonHabitatSummaryList
		  Call PokemonHabitatListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.PokemonHabitatListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PokemonHabitatRetrieve(, id As String)
		  // Operation pokemon_habitat_retrieve
		  // Get pokemom habita
		  // - 
		  // - parameter id: (path) This parameter can be a string or an integer. 
		  //
		  // Invokes PokemonApiCallbackHandler.PokemonHabitatRetrieveCallback(PokemonHabitatDetail) on completion. 
		  //
		  // - GET /api/v2/pokemon-habitat/{id}/
		  // - Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.
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
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.PokemonHabitatRetrieve()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/pokemon-habitat/{id}/"
		  
		  Dim localVarPathStringid As String = id
		  
		  localVarPath = localVarPath.ReplaceAllB("{id}", localVarPathStringid)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.PokemonHabitatRetrieve_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PokemonHabitatRetrieve_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function PokemonHabitatRetrievePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PokemonHabitatDetail) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PokemonHabitatDetail
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
		Private Sub PokemonHabitatRetrieve_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PokemonHabitatDetail
		  CallbackHandler.PokemonHabitatRetrieveCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PokemonHabitatRetrieve_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PokemonHabitatDetail
		  Call PokemonHabitatRetrievePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.PokemonHabitatRetrieveCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PokemonList(, Optional limit As Xoson.O.OptionalInteger, Optional offset As Xoson.O.OptionalInteger, Optional q As Xoson.O.OptionalString)
		  // Operation pokemon_list
		  // List pokemon
		  // - 
		  // - parameter limit: (query) Number of results to return per page. (optional, default to 0)
		  // - parameter offset: (query) The initial index from which to return the results. (optional, default to 0)
		  // - parameter q: (query) &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional, default to Sample)
		  //
		  // Invokes PokemonApiCallbackHandler.PokemonListCallback(PaginatedPokemonSummaryList) on completion. 
		  //
		  // - GET /api/v2/pokemon/
		  // - Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
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
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.PokemonList()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/pokemon/"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.PokemonList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PokemonList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function PokemonListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PaginatedPokemonSummaryList) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PaginatedPokemonSummaryList
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
		Private Sub PokemonList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PaginatedPokemonSummaryList
		  CallbackHandler.PokemonListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PokemonList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PaginatedPokemonSummaryList
		  Call PokemonListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.PokemonListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PokemonRetrieve(, id As String)
		  // Operation pokemon_retrieve
		  // Get pokemon
		  // - 
		  // - parameter id: (path) This parameter can be a string or an integer. 
		  //
		  // Invokes PokemonApiCallbackHandler.PokemonRetrieveCallback(PokemonDetail) on completion. 
		  //
		  // - GET /api/v2/pokemon/{id}/
		  // - Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.
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
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.PokemonRetrieve()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/pokemon/{id}/"
		  
		  Dim localVarPathStringid As String = id
		  
		  localVarPath = localVarPath.ReplaceAllB("{id}", localVarPathStringid)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.PokemonRetrieve_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PokemonRetrieve_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function PokemonRetrievePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PokemonDetail) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PokemonDetail
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
		Private Sub PokemonRetrieve_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PokemonDetail
		  CallbackHandler.PokemonRetrieveCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PokemonRetrieve_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PokemonDetail
		  Call PokemonRetrievePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.PokemonRetrieveCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PokemonShapeList(, Optional limit As Xoson.O.OptionalInteger, Optional offset As Xoson.O.OptionalInteger, Optional q As Xoson.O.OptionalString)
		  // Operation pokemon_shape_list
		  // List pokemon shapes
		  // - 
		  // - parameter limit: (query) Number of results to return per page. (optional, default to 0)
		  // - parameter offset: (query) The initial index from which to return the results. (optional, default to 0)
		  // - parameter q: (query) &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional, default to Sample)
		  //
		  // Invokes PokemonApiCallbackHandler.PokemonShapeListCallback(PaginatedPokemonShapeSummaryList) on completion. 
		  //
		  // - GET /api/v2/pokemon-shape/
		  // - Shapes used for sorting Pokémon in a Pokédex.
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
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.PokemonShapeList()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/pokemon-shape/"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.PokemonShapeList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PokemonShapeList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function PokemonShapeListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PaginatedPokemonShapeSummaryList) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PaginatedPokemonShapeSummaryList
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
		Private Sub PokemonShapeList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PaginatedPokemonShapeSummaryList
		  CallbackHandler.PokemonShapeListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PokemonShapeList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PaginatedPokemonShapeSummaryList
		  Call PokemonShapeListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.PokemonShapeListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PokemonShapeRetrieve(, id As String)
		  // Operation pokemon_shape_retrieve
		  // Get pokemon shape
		  // - 
		  // - parameter id: (path) This parameter can be a string or an integer. 
		  //
		  // Invokes PokemonApiCallbackHandler.PokemonShapeRetrieveCallback(PokemonShapeDetail) on completion. 
		  //
		  // - GET /api/v2/pokemon-shape/{id}/
		  // - Shapes used for sorting Pokémon in a Pokédex.
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
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.PokemonShapeRetrieve()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/pokemon-shape/{id}/"
		  
		  Dim localVarPathStringid As String = id
		  
		  localVarPath = localVarPath.ReplaceAllB("{id}", localVarPathStringid)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.PokemonShapeRetrieve_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PokemonShapeRetrieve_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function PokemonShapeRetrievePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PokemonShapeDetail) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PokemonShapeDetail
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
		Private Sub PokemonShapeRetrieve_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PokemonShapeDetail
		  CallbackHandler.PokemonShapeRetrieveCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PokemonShapeRetrieve_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PokemonShapeDetail
		  Call PokemonShapeRetrievePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.PokemonShapeRetrieveCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PokemonSpeciesList(, Optional limit As Xoson.O.OptionalInteger, Optional offset As Xoson.O.OptionalInteger, Optional q As Xoson.O.OptionalString)
		  // Operation pokemon_species_list
		  // List pokemon species
		  // - 
		  // - parameter limit: (query) Number of results to return per page. (optional, default to 0)
		  // - parameter offset: (query) The initial index from which to return the results. (optional, default to 0)
		  // - parameter q: (query) &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional, default to Sample)
		  //
		  // Invokes PokemonApiCallbackHandler.PokemonSpeciesListCallback(PaginatedPokemonSpeciesSummaryList) on completion. 
		  //
		  // - GET /api/v2/pokemon-species/
		  // - A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
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
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.PokemonSpeciesList()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/pokemon-species/"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.PokemonSpeciesList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PokemonSpeciesList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function PokemonSpeciesListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PaginatedPokemonSpeciesSummaryList) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PaginatedPokemonSpeciesSummaryList
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
		Private Sub PokemonSpeciesList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PaginatedPokemonSpeciesSummaryList
		  CallbackHandler.PokemonSpeciesListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PokemonSpeciesList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PaginatedPokemonSpeciesSummaryList
		  Call PokemonSpeciesListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.PokemonSpeciesListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub PokemonSpeciesRetrieve(, id As String)
		  // Operation pokemon_species_retrieve
		  // Get pokemon species
		  // - 
		  // - parameter id: (path) This parameter can be a string or an integer. 
		  //
		  // Invokes PokemonApiCallbackHandler.PokemonSpeciesRetrieveCallback(PokemonSpeciesDetail) on completion. 
		  //
		  // - GET /api/v2/pokemon-species/{id}/
		  // - A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.
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
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.PokemonSpeciesRetrieve()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/pokemon-species/{id}/"
		  
		  Dim localVarPathStringid As String = id
		  
		  localVarPath = localVarPath.ReplaceAllB("{id}", localVarPathStringid)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.PokemonSpeciesRetrieve_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.PokemonSpeciesRetrieve_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function PokemonSpeciesRetrievePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PokemonSpeciesDetail) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PokemonSpeciesDetail
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
		Private Sub PokemonSpeciesRetrieve_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PokemonSpeciesDetail
		  CallbackHandler.PokemonSpeciesRetrieveCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub PokemonSpeciesRetrieve_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PokemonSpeciesDetail
		  Call PokemonSpeciesRetrievePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.PokemonSpeciesRetrieveCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub StatList(, Optional limit As Xoson.O.OptionalInteger, Optional offset As Xoson.O.OptionalInteger, Optional q As Xoson.O.OptionalString)
		  // Operation stat_list
		  // List stats
		  // - 
		  // - parameter limit: (query) Number of results to return per page. (optional, default to 0)
		  // - parameter offset: (query) The initial index from which to return the results. (optional, default to 0)
		  // - parameter q: (query) &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional, default to Sample)
		  //
		  // Invokes PokemonApiCallbackHandler.StatListCallback(PaginatedStatSummaryList) on completion. 
		  //
		  // - GET /api/v2/stat/
		  // - Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
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
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.StatList()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/stat/"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.StatList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.StatList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function StatListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PaginatedStatSummaryList) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PaginatedStatSummaryList
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
		Private Sub StatList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PaginatedStatSummaryList
		  CallbackHandler.StatListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub StatList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PaginatedStatSummaryList
		  Call StatListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.StatListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub StatRetrieve(, id As String)
		  // Operation stat_retrieve
		  // Get stat
		  // - 
		  // - parameter id: (path) This parameter can be a string or an integer. 
		  //
		  // Invokes PokemonApiCallbackHandler.StatRetrieveCallback(StatDetail) on completion. 
		  //
		  // - GET /api/v2/stat/{id}/
		  // - Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.
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
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.StatRetrieve()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/stat/{id}/"
		  
		  Dim localVarPathStringid As String = id
		  
		  localVarPath = localVarPath.ReplaceAllB("{id}", localVarPathStringid)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.StatRetrieve_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.StatRetrieve_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function StatRetrievePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.StatDetail) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.StatDetail
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
		Private Sub StatRetrieve_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.StatDetail
		  CallbackHandler.StatRetrieveCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub StatRetrieve_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.StatDetail
		  Call StatRetrievePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.StatRetrieveCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub TypeList(, Optional limit As Xoson.O.OptionalInteger, Optional offset As Xoson.O.OptionalInteger, Optional q As Xoson.O.OptionalString)
		  // Operation type_list
		  // List types
		  // - 
		  // - parameter limit: (query) Number of results to return per page. (optional, default to 0)
		  // - parameter offset: (query) The initial index from which to return the results. (optional, default to 0)
		  // - parameter q: (query) &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  (optional, default to Sample)
		  //
		  // Invokes PokemonApiCallbackHandler.TypeListCallback(PaginatedTypeSummaryList) on completion. 
		  //
		  // - GET /api/v2/type/
		  // - Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
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
		  

		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.TypeList()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/type/"
		  
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.TypeList_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.TypeList_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath + localVarQueryParams)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function TypeListPrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.PaginatedTypeSummaryList) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.PaginatedTypeSummaryList
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
		Private Sub TypeList_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.PaginatedTypeSummaryList
		  CallbackHandler.TypeListCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub TypeList_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.PaginatedTypeSummaryList
		  Call TypeListPrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.TypeListCallback(error, data)
		End Sub
	#tag EndMethod




	#tag Method, Flags = &h0
		Sub TypeRetrieve(, id As String)
		  // Operation type_retrieve
		  // Get types
		  // - 
		  // - parameter id: (path) This parameter can be a string or an integer. 
		  //
		  // Invokes PokemonApiCallbackHandler.TypeRetrieveCallback(TypeDetail) on completion. 
		  //
		  // - GET /api/v2/type/{id}/
		  // - Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.
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
		  
		  
		  
		  AddHandler localVarHTTPSocket.AuthenticationRequired, addressof Me.AuthenticationRequiredIf me.ApiKeycookieAuth = "" Then Raise New OpenAPIClient.OpenAPIClientException(kErrorCannotAuthenticate, "API key is unset. Please assign a value to `PokemonApi.ApiKeycookieAuth` before invoking `PokemonApi.TypeRetrieve()`.")
		  
		  
		  


		  Dim localVarPath As String = "/api/v2/type/{id}/"
		  
		  Dim localVarPathStringid As String = id
		  
		  localVarPath = localVarPath.ReplaceAllB("{id}", localVarPathStringid)
		  
		  
		  AddHandler localVarHTTPSocket.PageReceived, addressof me.TypeRetrieve_handler
		  AddHandler localVarHTTPSocket.Error, addressof Me.TypeRetrieve_error
		  
		  
		  localVarHTTPSocket.SendRequest("GET", Me.BasePath + localVarPath)
		  if localVarHTTPSocket.LastErrorCode <> 0 then
		    Dim localVarException As New OpenAPIClient.OpenAPIClientException(localVarHTTPSocket.LastErrorCode)
			Raise localVarException
		  end if
		  
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Function TypeRetrievePrivateFuncDeserializeResponse(HTTPStatus As Integer, Headers As InternetHeaders, error As OpenAPIClient.OpenAPIClientException, Content As String, ByRef outData As OpenAPIClient.Models.TypeDetail) As Boolean
		  Dim contentType As String = Headers.Value("Content-Type")
		  Dim contentEncoding As TextEncoding = OpenAPIClient.EncodingFromContentType(contentType)
		  Content = DefineEncoding(Content, contentEncoding)
		  
		  If HTTPStatus > 199 and HTTPStatus < 300 then
		    If contentType.LeftB(16) = "application/json" then
		      
			  outData = New OpenAPIClient.Models.TypeDetail
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
		Private Sub TypeRetrieve_error(sender As HTTPSecureSocket, Code As Integer)
		  If sender <> nil Then sender.Close()

		  Dim error As New OpenAPIClient.OpenAPIClientException(Code)
		  Dim data As OpenAPIClient.Models.TypeDetail
		  CallbackHandler.TypeRetrieveCallback(error, data)
		End Sub
	#tag EndMethod

	#tag Method, Flags = &h21
		Private Sub TypeRetrieve_handler(sender As HTTPSecureSocket, URL As String, HTTPStatus As Integer, Headers As InternetHeaders, Content As String)
		  #Pragma Unused URL
		  

		  If sender <> nil Then sender.Close()
		  
		  Dim error As New OpenAPIClient.OpenAPIClientException(HTTPStatus, "", Content)
		  
		  Dim data As OpenAPIClient.Models.TypeDetail
		  Call TypeRetrievePrivateFuncDeserializeResponse(HTTPStatus, Headers, error, Content, data)
		  
		  CallbackHandler.TypeRetrieveCallback(error, data)
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
		CallbackHandler As OpenAPIClient.APIs.PokemonApiCallbackHandler
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
