#tag Class
Protected Class RegionDetail

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
			A list of locations that can be found in this region.
		#tag EndNote
		locations() As OpenAPIClient.Models.LocationSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The generation this region was introduced in.
		#tag EndNote
		main_generation As OpenAPIClient.Models.GenerationSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name of this resource listed in different languages.
		#tag EndNote
		names() As OpenAPIClient.Models.RegionName
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of pokédexes that catalogue Pokémon in this region.
		#tag EndNote
		pokedexes() As OpenAPIClient.Models.PokedexSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of version groups where this region can be visited.
		#tag EndNote
		version_groups() As OpenAPIClient.Models.VersionGroupSummary
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
			Name="locations"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="LocationSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="main_generation"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="GenerationSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="names"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RegionName"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pokedexes"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokedexSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="version_groups"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="VersionGroupSummary"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


