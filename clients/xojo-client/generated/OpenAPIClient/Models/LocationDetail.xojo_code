#tag Class
Protected Class LocationDetail

	#tag Property, Flags = &h0
		#tag Note
			The identifier for this resource.
		#tag EndNote
		id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name for this resource.
		#tag EndNote
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The region this location can be found in.
		#tag EndNote
		region As OpenAPIClient.Models.RegionSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name of this resource listed in different languages.
		#tag EndNote
		names() As OpenAPIClient.Models.LocationName
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of game indices relevent to this location by generation.
		#tag EndNote
		game_indices() As OpenAPIClient.Models.LocationGameIndex
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Areas that can be found within this location.
		#tag EndNote
		areas() As OpenAPIClient.Models.LocationAreaSummary
	#tag EndProperty





	#tag ViewBehavior
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
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="region"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RegionSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="names"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="LocationName"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="game_indices"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="LocationGameIndex"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="areas"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="LocationAreaSummary"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


